package ir.kit.phonebook.utils

import android.content.Context
import androidx.room.Room
import com.sematec.basic.room.AppDatabase

object DatabaseProvider {

    @Volatile
    private var instance: AppDatabase? = null

    fun getInstance(context: Context): AppDatabase = instance ?: synchronized(this) {
        instance ?: buildDatabase(context).also { instance = it }
    }

    private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context,
            AppDatabase::class.java, "kit_account_room.sqlite"
    ).fallbackToDestructiveMigration().build()
}