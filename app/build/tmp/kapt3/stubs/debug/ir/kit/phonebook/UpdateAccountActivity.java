package ir.kit.phonebook;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001b"}, d2 = {"Lir/kit/phonebook/UpdateAccountActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "repository", "Lir/kit/phonebook/repository/KitAccountRepository;", "getRepository", "()Lir/kit/phonebook/repository/KitAccountRepository;", "repository$delegate", "Lkotlin/Lazy;", "createTextWatcher", "Landroid/text/TextWatcher;", "textInput", "Lcom/google/android/material/textfield/TextInputLayout;", "loadData", "", "id", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onUpdateClicked", "performUpdate", "showErrorDialog", "errorCounter", "", "showErrorSnackbar", "Companion", "app_debug"})
public final class UpdateAccountActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy repository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static java.lang.String account_id;
    private static final java.lang.String ACCOUNT_ID = "ACCOUNT_ID";
    public static final ir.kit.phonebook.UpdateAccountActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final ir.kit.phonebook.repository.KitAccountRepository getRepository() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadData(java.lang.String id) {
    }
    
    private final void onUpdateClicked() {
    }
    
    private final void performUpdate() {
    }
    
    private final void showErrorDialog(int errorCounter) {
    }
    
    private final android.text.TextWatcher createTextWatcher(com.google.android.material.textfield.TextInputLayout textInput) {
        return null;
    }
    
    private final void showErrorSnackbar() {
    }
    
    public UpdateAccountActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lir/kit/phonebook/UpdateAccountActivity$Companion;", "", "()V", "ACCOUNT_ID", "", "account_id", "getAccount_id", "()Ljava/lang/String;", "setAccount_id", "(Ljava/lang/String;)V", "start", "", "activity", "Landroid/app/Activity;", "accountId", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAccount_id() {
            return null;
        }
        
        public final void setAccount_id(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, @org.jetbrains.annotations.NotNull()
        java.lang.String accountId) {
        }
        
        private Companion() {
            super();
        }
    }
}