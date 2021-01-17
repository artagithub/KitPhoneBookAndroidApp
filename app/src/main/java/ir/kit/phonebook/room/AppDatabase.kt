package com.sematec.basic.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import ir.kit.phonebook.room.Converters
import ir.kit.phonebook.room.KitGithubAccount
import ir.kit.phonebook.room.KitGithubAccountDAO

@Database(entities = arrayOf(KitGithubAccount::class), version = 3)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun kitGithubAccountDAO(): KitGithubAccountDAO
}
