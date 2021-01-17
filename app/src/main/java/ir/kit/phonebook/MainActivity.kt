package ir.kit.phonebook

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import ir.kit.phonebook.R
import ir.kit.phonebook.adapter.MainAdapter
import ir.kit.phonebook.repository.KitAccountRepository
import ir.kit.phonebook.room.KitGithubAccount
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    companion object {
        private const val SORT_TITLE = 0
    }

    private var currentSort = SORT_TITLE
    private val repository by lazy { KitAccountRepository(applicationContext) }

    private val adapter = MainAdapter { kitAccount ->
        KitAccountDetailsActivity.start(this, kitAccount)
    }

    override fun onResume() {
        super.onResume()
        loadDataFromDatabase()
        loadDataFromNetwork()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        materialToolbar.setOnMenuItemClickListener { item ->
            if (item.itemId == R.id.sort) {
                onSortClicked()
            }
            false
        }

        fab_create.setOnClickListener {
            val intent = Intent(this, AddAccountActivity::class.java)
            startActivity(intent)
        }
        val searchItem = materialToolbar.menu.findItem(R.id.search)
        val searchView = searchItem.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean = false

            override fun onQueryTextChange(newText: String): Boolean {
                adapter.filter(newText)
                return true
            }
        })

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        refreshLayout.setOnRefreshListener {
            loadDataFromNetwork()
        }

        loadDataFromDatabase()
        loadDataFromNetwork()
    }

    private fun loadDataFromDatabase() {
        repository.loadDataFromDatabase { kitAccounts: List<KitGithubAccount> ->
            runOnUiThread {
                adapter.setData(kitAccounts)
                sortData()
            }
        }
    }

    private fun loadDataFromNetwork() {
        refreshLayout.isRefreshing = true
        repository.loadDataFromNetwork(
                onSuccess = { kitAccounts: List<KitGithubAccount> ->
                    runOnUiThread {
                        refreshLayout.isRefreshing = false
                        adapter.setData(kitAccounts)
                        adapter.notifyDataSetChanged()
                        sortData()
                    }
                },
                onError = {
                    runOnUiThread {
                        refreshLayout.isRefreshing = false
                        showErrorSnackbar()
                    }
                }
        )

    }


    private fun onSortClicked() {
        val items = arrayOf("Title")
        MaterialAlertDialogBuilder(this)
                .setTitle("Sort order")
                .setSingleChoiceItems(items, currentSort) { dialog: DialogInterface, which: Int ->
                    dialog.dismiss()
                    currentSort = which
                    sortData()
                }.show()
    }

    private fun sortData() {
        if (currentSort == SORT_TITLE) {
            adapter.sortByTitle()
        }
    }

    private fun showErrorSnackbar() {
        Snackbar.make(rootView,
                "Error during loading kit accounts", Snackbar.LENGTH_INDEFINITE).run {
            setActionTextColor(resources.getColor(R.color.orange500))
            setAction("Retry") {
                loadDataFromNetwork()
                dismiss()
            }
        }.show()
    }
    
    
}