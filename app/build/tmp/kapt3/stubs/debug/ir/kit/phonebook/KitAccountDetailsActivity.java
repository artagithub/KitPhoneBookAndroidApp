package ir.kit.phonebook;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\rH\u0014J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0015\u001a\u00020\rH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lir/kit/phonebook/KitAccountDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "arrayAdapter", "Landroid/widget/ArrayAdapter;", "", "repository", "Lir/kit/phonebook/repository/KitAccountRepository;", "getRepository", "()Lir/kit/phonebook/repository/KitAccountRepository;", "repository$delegate", "Lkotlin/Lazy;", "deletData", "", "kitGithubAccount", "Lir/kit/phonebook/room/KitGithubAccount;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "showData", "showErrorSnackbar", "Companion", "app_debug"})
public final class KitAccountDetailsActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.ArrayAdapter<java.lang.String> arrayAdapter;
    private final kotlin.Lazy repository$delegate = null;
    private static final java.lang.String EXTRAS_ACCOUNTS = "EXTRAS_ACCOUNTS";
    @org.jetbrains.annotations.NotNull()
    public static ir.kit.phonebook.room.KitGithubAccount extra_account;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> listView = null;
    public static final ir.kit.phonebook.KitAccountDetailsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final ir.kit.phonebook.repository.KitAccountRepository getRepository() {
        return null;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showData(ir.kit.phonebook.room.KitGithubAccount kitGithubAccount) {
    }
    
    private final void deletData(ir.kit.phonebook.room.KitGithubAccount kitGithubAccount) {
    }
    
    private final void showErrorSnackbar() {
    }
    
    public KitAccountDetailsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lir/kit/phonebook/KitAccountDetailsActivity$Companion;", "", "()V", "EXTRAS_ACCOUNTS", "", "extra_account", "Lir/kit/phonebook/room/KitGithubAccount;", "getExtra_account", "()Lir/kit/phonebook/room/KitGithubAccount;", "setExtra_account", "(Lir/kit/phonebook/room/KitGithubAccount;)V", "listView", "", "getListView", "()Ljava/util/List;", "start", "", "activity", "Landroid/app/Activity;", "account", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ir.kit.phonebook.room.KitGithubAccount getExtra_account() {
            return null;
        }
        
        public final void setExtra_account(@org.jetbrains.annotations.NotNull()
        ir.kit.phonebook.room.KitGithubAccount p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getListView() {
            return null;
        }
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, @org.jetbrains.annotations.NotNull()
        ir.kit.phonebook.room.KitGithubAccount account) {
        }
        
        private Companion() {
            super();
        }
    }
}