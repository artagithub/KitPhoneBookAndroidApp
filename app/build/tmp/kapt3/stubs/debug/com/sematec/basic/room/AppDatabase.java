package com.sematec.basic.room;

import java.lang.System;

@androidx.room.TypeConverters(value = {ir.kit.phonebook.room.Converters.class})
@androidx.room.Database(entities = {ir.kit.phonebook.room.KitGithubAccount.class}, version = 3)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/sematec/basic/room/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "kitGithubAccountDAO", "Lir/kit/phonebook/room/KitGithubAccountDAO;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract ir.kit.phonebook.room.KitGithubAccountDAO kitGithubAccountDAO();
    
    public AppDatabase() {
        super();
    }
}