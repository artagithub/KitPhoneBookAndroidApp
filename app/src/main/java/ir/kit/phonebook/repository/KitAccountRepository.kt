package ir.kit.phonebook.repository


import android.content.Context
import com.sematec.basic.api.WebService
import ir.kit.phonebook.http.dto.KitGithubAccountDTO
import ir.kit.phonebook.room.KitGithubAccount
import ir.kit.phonebook.utils.DatabaseProvider
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.concurrent.Executors


class KitAccountRepository(context: Context) {

    private val httpClient = WebService.api
    private val database = DatabaseProvider.getInstance(context.applicationContext)
    private val executor = Executors.newSingleThreadExecutor()

    fun loadDataFromDatabase(callback: (List<KitGithubAccount>) -> Unit) {
        executor.execute {
            callback(database.kitGithubAccountDAO().getAll())
        }
    }

    fun loadDataFromNetwork(onSuccess: (List<KitGithubAccount>) -> Unit, onError: () -> Unit) {
        httpClient.getKitAccounts().enqueue(object : Callback<List<KitGithubAccount>> {
            override fun onFailure(call: Call<List<KitGithubAccount>>, t: Throwable) {
                onError()
            }

            override fun onResponse(call: Call<List<KitGithubAccount>>, response: Response<List<KitGithubAccount>>) {
                if (response.isSuccessful) {
                    response.body()?.let {
                        val kitGithubAccountDAO = database.kitGithubAccountDAO()

                        it?.let {
                            executor.execute {
                                kitGithubAccountDAO.deleteAll()
                                kitGithubAccountDAO.insertAll(it)
                                onSuccess(it)
                            }

                        }

                    }
                }

            }
        })
    }

    fun createDataByNetwork(onSuccess: (KitGithubAccount) -> Unit, onError: () -> Unit, kitGithubAccount: KitGithubAccountDTO) {
        httpClient.create(kitGithubAccount).enqueue(object : Callback<KitGithubAccount> {
            override fun onFailure(call: Call<KitGithubAccount>, t: Throwable) {
                onError()
            }

            override fun onResponse(call: Call<KitGithubAccount>, response: Response<KitGithubAccount>) {
                if (response.isSuccessful) {
                    response.body()?.let {
                        val kitGithubAccountDAO = database.kitGithubAccountDAO()

                        it?.let {
                            executor.execute {
                                kitGithubAccountDAO.insert(it)
                                onSuccess(it)
                            }

                        }

                    }
                }

            }
        })
    }

    fun loadDataByNetwork(onSuccess: (KitGithubAccount) -> Unit, onError: () -> Unit, kitGithubAccount: KitGithubAccount){
        executor.execute{
            httpClient.find(kitGithubAccount.id!!).execute().body()?.let {
                onSuccess(it)
            }
        }

//        httpClient.find(kitGithubAccount.id!!).enqueue(object : Callback<KitGithubAccount> {
//            override fun onFailure(call: Call<KitGithubAccount>, t: Throwable) {
//                onError()
//            }
//
//            override fun onResponse(call: Call<KitGithubAccount>, response: Response<KitGithubAccount>) {
//                if (response.isSuccessful) {
//                    response.body()?.let {
//                        it?.let {
//                            executor.execute {
//                                onSuccess(it)
//                            }
//
//                        }
//
//                    }
//                }
//
//            }
//        })

    }


    fun deleteDataByNetwork(onSuccess: (KitGithubAccount) -> Unit, onError: () -> Unit, kitGithubAccount: KitGithubAccount){
        httpClient.delete(kitGithubAccount.id!!).enqueue(object : Callback<KitGithubAccount> {
            override fun onFailure(call: Call<KitGithubAccount>, t: Throwable) {
                onError()
            }

            override fun onResponse(call: Call<KitGithubAccount>, response: Response<KitGithubAccount>) {
                if (response.isSuccessful) {

                    response.body()?.let {
                        val kitGithubAccountDAO = database.kitGithubAccountDAO()
                        it?.let {
                            executor.execute {
                                kitGithubAccountDAO.delete(it)
                                onSuccess(it)
                            }

                        }

                    }
                }

            }
        })

    }


    fun updateDataByNetwork(onSuccess: (KitGithubAccount) -> Unit, onError: () -> Unit, kitGithubAccount: KitGithubAccountDTO) {
        httpClient.update(kitGithubAccount).enqueue(object : Callback<KitGithubAccount> {
            override fun onFailure(call: Call<KitGithubAccount>, t: Throwable) {
                onError()
            }

            override fun onResponse(call: Call<KitGithubAccount>, response: Response<KitGithubAccount>) {
                if (response.isSuccessful) {
                    response.body()?.let {
                        val kitGithubAccountDAO = database.kitGithubAccountDAO()

                        it?.let {
                            executor.execute {
                                kitGithubAccountDAO.update(it)
                                onSuccess(it)
                            }

                        }

                    }
                }

            }
        })
    }


}