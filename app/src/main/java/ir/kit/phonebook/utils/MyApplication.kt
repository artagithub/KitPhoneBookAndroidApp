package ir.kit.phonebook.utils

import android.app.Application
import android.content.Context
import com.sematec.basic.room.AppDatabase

class MyApplication : Application() {
    companion object {
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = this
    }
}