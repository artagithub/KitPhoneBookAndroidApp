package ir.kit.phonebook.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0014\u0010\u0015\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lir/kit/phonebook/adapter/MainAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lir/kit/phonebook/room/KitGithubAccount;", "Lir/kit/phonebook/adapter/MainViewHolder;", "onItemClickListener", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "originalList", "", "filter", "query", "", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "", "sortByTitle", "app_debug"})
public final class MainAdapter extends androidx.recyclerview.widget.ListAdapter<ir.kit.phonebook.room.KitGithubAccount, ir.kit.phonebook.adapter.MainViewHolder> {
    private java.util.List<ir.kit.phonebook.room.KitGithubAccount> originalList;
    private final kotlin.jvm.functions.Function1<ir.kit.phonebook.room.KitGithubAccount, kotlin.Unit> onItemClickListener = null;
    
    public final void sortByTitle() {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<ir.kit.phonebook.room.KitGithubAccount> list) {
    }
    
    public final void filter(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ir.kit.phonebook.adapter.MainViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ir.kit.phonebook.adapter.MainViewHolder holder, int position) {
    }
    
    public MainAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ir.kit.phonebook.room.KitGithubAccount, kotlin.Unit> onItemClickListener) {
        super(null);
    }
}