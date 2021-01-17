package ir.kit.phonebook.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ir.kit.phonebook.R
import ir.kit.phonebook.room.KitGithubAccount
import kotlinx.android.synthetic.main.activity_account_details.view.*
import kotlinx.android.synthetic.main.item_main.view.*
import kotlinx.android.synthetic.main.item_main.view.email
import kotlinx.android.synthetic.main.item_main.view.github
import kotlinx.android.synthetic.main.item_main.view.name
import kotlinx.android.synthetic.main.item_main.view.organization
import kotlinx.android.synthetic.main.item_main.view.phoneNumber


class MainAdapter(private val onItemClickListener: (KitGithubAccount) -> Unit)
    : ListAdapter<KitGithubAccount, MainViewHolder>(DIFF_CALLBACK) {

    private var originalList: MutableList<KitGithubAccount> = ArrayList()

    fun sortByTitle() {
        submitList(originalList.sortedBy { kitaccount -> kitaccount.name })
    }


    fun setData(list: List<KitGithubAccount>) {
        originalList.clear()
        originalList.addAll(list)
        submitList(originalList)
    }

    fun filter(query: String) {
        submitList(originalList
                .filter { kitaccount -> kitaccount.name?.contains(query, ignoreCase = true) ?:true })
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.item_main, parent, false)
        return MainViewHolder(view, onItemClickListener)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bindTo(getItem(position))
    }
}

class MainViewHolder(itemView: View, private val onItemClickListener: (KitGithubAccount) -> Unit)
    : RecyclerView.ViewHolder(itemView) {

    fun bindTo(kitGithubAccount: KitGithubAccount) {
        itemView.card_view.setOnClickListener { onItemClickListener(kitGithubAccount) }
        itemView.name.text = kitGithubAccount.name;
        itemView.phoneNumber.text = kitGithubAccount.phoneNumber;
        itemView.email.text = kitGithubAccount.email;
        itemView.organization.text = kitGithubAccount.organization;
        itemView.github.text = kitGithubAccount.github;


    }
}

private val DIFF_CALLBACK: DiffUtil.ItemCallback<KitGithubAccount> = object : DiffUtil.ItemCallback<KitGithubAccount>() {
    override fun areItemsTheSame(oldData: KitGithubAccount,
                                 newData: KitGithubAccount): Boolean {
        return oldData.id == newData.id
    }

    override fun areContentsTheSame(oldData: KitGithubAccount,
                                    newData: KitGithubAccount): Boolean {
        return false
    }
}