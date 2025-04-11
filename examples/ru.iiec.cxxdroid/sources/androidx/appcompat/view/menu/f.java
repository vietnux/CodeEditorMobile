package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;

public class f extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    g f345b;

    /* renamed from: c  reason: collision with root package name */
    private int f346c = -1;

    /* renamed from: d  reason: collision with root package name */
    private boolean f347d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f348e;

    /* renamed from: f  reason: collision with root package name */
    private final LayoutInflater f349f;

    /* renamed from: g  reason: collision with root package name */
    private final int f350g;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i2) {
        this.f348e = z;
        this.f349f = layoutInflater;
        this.f345b = gVar;
        this.f350g = i2;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        j f2 = this.f345b.f();
        if (f2 != null) {
            ArrayList<j> j2 = this.f345b.j();
            int size = j2.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (j2.get(i2) == f2) {
                    this.f346c = i2;
                    return;
                }
            }
        }
        this.f346c = -1;
    }

    public void a(boolean z) {
        this.f347d = z;
    }

    public g b() {
        return this.f345b;
    }

    public int getCount() {
        ArrayList<j> j2 = this.f348e ? this.f345b.j() : this.f345b.n();
        int i2 = this.f346c;
        int size = j2.size();
        return i2 < 0 ? size : size - 1;
    }

    public j getItem(int i2) {
        ArrayList<j> j2 = this.f348e ? this.f345b.j() : this.f345b.n();
        int i3 = this.f346c;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return j2.get(i2);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f349f.inflate(this.f350g, viewGroup, false);
        }
        int groupId = getItem(i2).getGroupId();
        int i3 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f345b.o() && groupId != (i3 >= 0 ? getItem(i3).getGroupId() : groupId));
        o.a aVar = (o.a) view;
        if (this.f347d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.a(getItem(i2), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
