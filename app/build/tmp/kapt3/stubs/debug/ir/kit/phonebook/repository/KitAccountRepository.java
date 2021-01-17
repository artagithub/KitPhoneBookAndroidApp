package ir.kit.phonebook.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J0\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0013\u001a\u00020\u0014J0\u0010\u0015\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0013\u001a\u00020\u0010J0\u0010\u0016\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0013\u001a\u00020\u0010J \u0010\u0017\u001a\u00020\r2\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0019\u0012\u0004\u0012\u00020\r0\u000fJ.\u0010\u001a\u001a\u00020\r2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0019\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012J0\u0010\u001b\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lir/kit/phonebook/repository/KitAccountRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "database", "Lcom/sematec/basic/room/AppDatabase;", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "httpClient", "Lcom/sematec/basic/api/Api;", "createDataByNetwork", "", "onSuccess", "Lkotlin/Function1;", "Lir/kit/phonebook/room/KitGithubAccount;", "onError", "Lkotlin/Function0;", "kitGithubAccount", "Lir/kit/phonebook/http/dto/KitGithubAccountDTO;", "deleteDataByNetwork", "loadDataByNetwork", "loadDataFromDatabase", "callback", "", "loadDataFromNetwork", "updateDataByNetwork", "app_debug"})
public final class KitAccountRepository {
    private final com.sematec.basic.api.Api httpClient = null;
    private final com.sematec.basic.room.AppDatabase database = null;
    private final java.util.concurrent.ExecutorService executor = null;
    
    public final void loadDataFromDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<ir.kit.phonebook.room.KitGithubAccount>, kotlin.Unit> callback) {
    }
    
    public final void loadDataFromNetwork(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<ir.kit.phonebook.room.KitGithubAccount>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onError) {
    }
    
    public final void createDataByNetwork(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ir.kit.phonebook.room.KitGithubAccount, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onError, @org.jetbrains.annotations.NotNull()
    ir.kit.phonebook.http.dto.KitGithubAccountDTO kitGithubAccount) {
    }
    
    public final void loadDataByNetwork(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ir.kit.phonebook.room.KitGithubAccount, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onError, @org.jetbrains.annotations.NotNull()
    ir.kit.phonebook.room.KitGithubAccount kitGithubAccount) {
    }
    
    public final void deleteDataByNetwork(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ir.kit.phonebook.room.KitGithubAccount, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onError, @org.jetbrains.annotations.NotNull()
    ir.kit.phonebook.room.KitGithubAccount kitGithubAccount) {
    }
    
    public final void updateDataByNetwork(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ir.kit.phonebook.room.KitGithubAccount, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onError, @org.jetbrains.annotations.NotNull()
    ir.kit.phonebook.http.dto.KitGithubAccountDTO kitGithubAccount) {
    }
    
    public KitAccountRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}