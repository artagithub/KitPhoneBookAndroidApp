package ir.kit.phonebook;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u000eH\u0014J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lir/kit/phonebook/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lir/kit/phonebook/adapter/MainAdapter;", "currentSort", "", "repository", "Lir/kit/phonebook/repository/KitAccountRepository;", "getRepository", "()Lir/kit/phonebook/repository/KitAccountRepository;", "repository$delegate", "Lkotlin/Lazy;", "loadDataFromDatabase", "", "loadDataFromNetwork", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onSortClicked", "showErrorSnackbar", "sortData", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private int currentSort = 0;
    private final kotlin.Lazy repository$delegate = null;
    private final ir.kit.phonebook.adapter.MainAdapter adapter = null;
    private static final int SORT_TITLE = 0;
    public static final ir.kit.phonebook.MainActivity.Companion Companion = null;
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
    
    private final void loadDataFromDatabase() {
    }
    
    private final void loadDataFromNetwork() {
    }
    
    private final void onSortClicked() {
    }
    
    private final void sortData() {
    }
    
    private final void showErrorSnackbar() {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lir/kit/phonebook/MainActivity$Companion;", "", "()V", "SORT_TITLE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}