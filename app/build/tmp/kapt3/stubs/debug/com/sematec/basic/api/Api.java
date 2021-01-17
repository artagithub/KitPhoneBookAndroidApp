package com.sematec.basic.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f0\u0003H\'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\'J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/sematec/basic/api/Api;", "", "create", "Lretrofit2/Call;", "Lir/kit/phonebook/room/KitGithubAccount;", "request", "Lir/kit/phonebook/http/dto/KitGithubAccountDTO;", "delete", "id", "", "find", "getKitAccounts", "", "search", "update", "app_debug"})
public abstract interface Api {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "http://192.168.1.103:8080/api/account/create")
    public abstract retrofit2.Call<ir.kit.phonebook.room.KitGithubAccount> create(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ir.kit.phonebook.http.dto.KitGithubAccountDTO request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "http://192.168.1.103:8080/api/account/update")
    public abstract retrofit2.Call<ir.kit.phonebook.room.KitGithubAccount> update(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ir.kit.phonebook.http.dto.KitGithubAccountDTO request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "http://192.168.1.103:8080/api/account/search")
    public abstract retrofit2.Call<ir.kit.phonebook.room.KitGithubAccount> search(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    ir.kit.phonebook.room.KitGithubAccount request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "http://192.168.1.103:8080/api/account/find")
    public abstract retrofit2.Call<ir.kit.phonebook.room.KitGithubAccount> find(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "http://192.168.1.103:8080/api/account/delete")
    public abstract retrofit2.Call<ir.kit.phonebook.room.KitGithubAccount> delete(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "http://192.168.1.103:8080/api/account/list")
    public abstract retrofit2.Call<java.util.List<ir.kit.phonebook.room.KitGithubAccount>> getKitAccounts();
}