package ir.kit.phonebook

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.google.android.material.snackbar.Snackbar
import ir.kit.phonebook.repository.KitAccountRepository
import ir.kit.phonebook.room.KitGithubAccount
import kotlinx.android.synthetic.main.activity_account_details.*

class KitAccountDetailsActivity : AppCompatActivity() {
    private lateinit var arrayAdapter:ArrayAdapter<String>



    private val repository by lazy {
        KitAccountRepository(applicationContext)
    }

    companion object {

        private const val EXTRAS_ACCOUNTS = "EXTRAS_ACCOUNTS"
        lateinit var extra_account: KitGithubAccount;
        val listView : MutableList<String> = ArrayList()
        fun start(activity: Activity, account: KitGithubAccount) {
            val intent = Intent(activity, KitAccountDetailsActivity::class.java)
            intent.putExtra(EXTRAS_ACCOUNTS, account)
            activity.startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        githubrepos.invalidateViews()
        extra_account?.let { account ->
            showData(account)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_details)




        extra_account = intent.extras?.getParcelable<KitGithubAccount>(EXTRAS_ACCOUNTS)!!

        fab_update.setOnClickListener {
            UpdateAccountActivity.start(activity = this, accountId = extra_account?.id ?: "")
        }
        fab_delete.setOnClickListener {
            deletData(extra_account)
        }
        arrayAdapter = ArrayAdapter(this,
                R.layout.text_center_listview,R.id.textItem,
                listView
        )

        githubrepos.adapter = arrayAdapter

    }

    private fun showData(kitGithubAccount: KitGithubAccount) {
        progressBar.visibility = View.GONE

        repository.loadDataByNetwork({ kitAccounts: KitGithubAccount ->
            runOnUiThread {
                name.text = kitAccounts.name;
                phoneNumber.text = kitAccounts.phoneNumber;
                email.text = kitAccounts.email;
                organization.text = kitAccounts.organization;
                github.text = kitAccounts.github;

//                if (kitGithubAccount.githubRepoNames == null) ArrayList() else kitGithubAccount.githubRepoNames)
                listView.clear()
                listView.addAll(if (kitAccounts.githubRepoNames == null) ArrayList() else kitAccounts.githubRepoNames)



                arrayAdapter.notifyDataSetChanged()

                Glide.with(this)
                        .load("https://github.com/".plus(kitGithubAccount.github).plus(".png?size=100"))
                        .transition(DrawableTransitionOptions.withCrossFade())
                        .into(imageAvatar)

            }
        },
                onError = {
                    runOnUiThread {
                        showErrorSnackbar()
                    }
                }, kitGithubAccount = extra_account)


    }


    private fun deletData(kitGithubAccount: KitGithubAccount) {
        progressBar.visibility = View.GONE

        repository.deleteDataByNetwork({ kitAccounts: KitGithubAccount ->
            runOnUiThread {
                finish()

            }
        },
                onError = {
                    runOnUiThread {
                        showErrorSnackbar()
                    }
                }, kitGithubAccount = extra_account)


    }

    private fun showErrorSnackbar() {
        Snackbar.make(detailView,
                "Error during loading kit account", Snackbar.LENGTH_INDEFINITE).run {
            setActionTextColor(resources.getColor(R.color.orange500))
            setAction("Retry") {
                dismiss()
            }
        }.show()
    }

}