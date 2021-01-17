package ir.kit.phonebook

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout
import ir.kit.phonebook.http.dto.KitGithubAccountDTO
import ir.kit.phonebook.repository.KitAccountRepository
import ir.kit.phonebook.room.KitGithubAccount
import kotlinx.android.synthetic.main.activity_add_item.*
import kotlinx.android.synthetic.main.activity_add_item.email
import kotlinx.android.synthetic.main.activity_add_item.github
import kotlinx.android.synthetic.main.activity_add_item.name
import kotlinx.android.synthetic.main.activity_add_item.organization
import kotlinx.android.synthetic.main.activity_add_item.phoneNumber
import kotlinx.android.synthetic.main.activity_login.progressBar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_update_item.*

class UpdateAccountActivity : AppCompatActivity() {

    private val repository by lazy { KitAccountRepository(applicationContext) }
    companion object{
        lateinit var account_id :String;
        private const val ACCOUNT_ID = "ACCOUNT_ID"
        fun start(activity: Activity, accountId : String){
            val intent = Intent(activity,UpdateAccountActivity::class.java)
            intent.putExtra(ACCOUNT_ID,accountId)
            activity.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        account_id = intent.extras?.getString(ACCOUNT_ID)!!
        loadData(account_id)

        setContentView(R.layout.activity_update_item)

        update_button.setOnClickListener { onUpdateClicked() }


        name.editText?.addTextChangedListener(createTextWatcher(name))
        phoneNumber.editText?.addTextChangedListener(createTextWatcher(phoneNumber))
        email.editText?.addTextChangedListener(createTextWatcher(email))
        organization.editText?.addTextChangedListener(createTextWatcher(organization))
        github.editText?.addTextChangedListener(createTextWatcher(github))

    }
    
    private fun loadData(id : String){
        repository.loadDataByNetwork({ kitAccounts: KitGithubAccount ->
            runOnUiThread {
                name.editText?.setText(kitAccounts.name)
                phoneNumber.editText?.setText(kitAccounts.phoneNumber)
                email.editText?.setText(kitAccounts.email)
                organization.editText?.setText(kitAccounts.organization)
                github.editText?.setText(kitAccounts.github)

            }
        },
                onError = {
                    runOnUiThread {
                        showErrorSnackbar()
                    }
                }, kitGithubAccount = KitAccountDetailsActivity.extra_account)
    }

    private fun onUpdateClicked() {
        val nameValue: String = name.editText?.text.toString()
        val phoneNumberValue: String = phoneNumber.editText?.text.toString()
        val emailValue: String = email.editText?.text.toString()
        val organizationValue: String = organization.editText?.text.toString()
        val githubValue: String = github.editText?.text.toString()
        var errorCounter = 0 ;
        if (nameValue.isEmpty()) {
            name.error = "name must not be empty"
            errorCounter++
        }
        if (phoneNumberValue.isEmpty()) {
            phoneNumber.error = "phoneNumber must not be empty"
            errorCounter++
        }
        if (emailValue.isEmpty()) {
            email.error = "email must not be empty"
            errorCounter++
        }
        if (organizationValue.isEmpty()) {
            organization.error = "organization must not be empty"
            errorCounter++
        }
        if (githubValue.isEmpty()) {
            github.error = "github must not be empty"
            errorCounter++
        }
        val phonePattern = "^(\\+98|0)+9\\d{9}$".toRegex()
        val emailPattern = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])".toRegex()

        if(!phonePattern.matches(phoneNumberValue)){
            phoneNumber.error = phoneNumber.error?.toString() ?:"".plus("\nThe value of PhoneNumber is Incorrect")
            errorCounter++
        }
        if(!emailPattern.matches(emailValue)){
            email.error = email.error?.toString() ?:"".plus("\nThe value of PhoneNumber is Incorrect")
            errorCounter++
        }

        if(errorCounter==0){
            performUpdate()
        }else{
            showErrorDialog(errorCounter)
        }

//        val username: String = textUsernameLayout.editText?.text.toString()
//        val password: String = textPasswordInput.editText?.text.toString()
//        if (username.isEmpty()) {
//            textUsernameLayout.error = "Username must not be empty"
//        } else if (password.isEmpty()) {
//            textPasswordInput.error = "Password must not be empty"
//        } else if (username != "admin" && password != "admin") {
//            showErrorDialog()
//        } else {
//            performCreate()
//        }
    }

    private fun performUpdate() {
        name.isEnabled = false
        phoneNumber.isEnabled = false
        email.isEnabled = false
        organization.isEnabled = false
        github.isEnabled = false
        update_button.visibility = View.INVISIBLE
        progressBar.visibility = View.VISIBLE

        val kitGithubAccount = KitGithubAccountDTO(id = account_id,name = name.editText?.text.toString(),
               phoneNumber =  phoneNumber.editText?.text.toString(),
        email = email.editText?.text.toString(),
        organization = organization.editText?.text.toString() ,github = github.editText?.text.toString())

        repository.updateDataByNetwork(
                onSuccess = { kitAccount: KitGithubAccount ->
                    runOnUiThread {
                        finish()
                    }
                },
                onError = {
                    runOnUiThread {
                        showErrorSnackbar()
                    }
                }
        ,kitGithubAccount = kitGithubAccount
        )
    }


    private fun showErrorDialog(errorCounter :Int) {
        AlertDialog.Builder(this)
                .setTitle("Update Failed")
                .setMessage("Inputs are incorrect.There are $errorCounter errors. Please try again.")
                .setPositiveButton("OK") { dialog, which -> dialog.dismiss() }
                .show()
    }

    private fun createTextWatcher(textInput: TextInputLayout): TextWatcher? {
        return object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence,
                                           start: Int, count: Int, after: Int) {
                // not needed
            }

            override fun onTextChanged(s: CharSequence,
                                       start: Int, before: Int, count: Int) {
                textInput.error = null
            }

            override fun afterTextChanged(s: Editable) {
                // not needed
            }
        }
    }

    private fun showErrorSnackbar() {
        Snackbar.make(rootView,
                "Error during creating kit accounts", Snackbar.LENGTH_INDEFINITE).run {
            setActionTextColor(resources.getColor(R.color.orange500))
            setAction("Ok!") {
                dismiss()
            }
        }.show()
    }
}