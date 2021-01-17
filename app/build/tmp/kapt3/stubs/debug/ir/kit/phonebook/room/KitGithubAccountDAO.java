package ir.kit.phonebook.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\'J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\'J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0013"}, d2 = {"Lir/kit/phonebook/room/KitGithubAccountDAO;", "", "delete", "", "kitAccount", "Lir/kit/phonebook/room/KitGithubAccount;", "deleteAll", "findByName", "name", "", "getAll", "", "insert", "insertAll", "kitAccounts", "loadAllByIds", "kitAccountID", "", "update", "app_debug"})
public abstract interface KitGithubAccountDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM KitGithubAccount")
    public abstract java.util.List<ir.kit.phonebook.room.KitGithubAccount> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM kitgithubaccount WHERE id IN (:kitAccountID)")
    public abstract java.util.List<ir.kit.phonebook.room.KitGithubAccount> loadAllByIds(@org.jetbrains.annotations.NotNull()
    int[] kitAccountID);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM KitGithubAccount WHERE name LIKE :name LIMIT 1")
    public abstract ir.kit.phonebook.room.KitGithubAccount findByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @androidx.room.Query(value = "DELETE FROM KitGithubAccount")
    public abstract void deleteAll();
    
    @androidx.room.Insert()
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<ir.kit.phonebook.room.KitGithubAccount> kitAccounts);
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    ir.kit.phonebook.room.KitGithubAccount kitAccount);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    ir.kit.phonebook.room.KitGithubAccount kitAccount);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    ir.kit.phonebook.room.KitGithubAccount kitAccount);
}