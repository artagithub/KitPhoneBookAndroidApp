package ir.kit.phonebook.room

import androidx.room.*


@Dao
interface KitGithubAccountDAO {

    @Query("SELECT * FROM KitGithubAccount")
    fun getAll(): List<KitGithubAccount>

    @Query("SELECT * FROM kitgithubaccount WHERE id IN (:kitAccountID)")
    fun loadAllByIds(kitAccountID: IntArray): List<KitGithubAccount>

    @Query("SELECT * FROM KitGithubAccount WHERE name LIKE :name LIMIT 1")
    fun findByName(name: String): KitGithubAccount

    @Query("DELETE FROM KitGithubAccount")
    fun deleteAll()

    @Insert
    fun insertAll( kitAccounts: List<KitGithubAccount>)
    
    @Insert
    fun insert(kitAccount: KitGithubAccount)

    @Delete
    fun delete(kitAccount: KitGithubAccount)

    @Update
    fun update(kitAccount: KitGithubAccount)
}