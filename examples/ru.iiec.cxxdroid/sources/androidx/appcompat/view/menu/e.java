package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import c.a.g;
import java.util.ArrayList;

public class e implements n, AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    Context f333b;

    /* renamed from: c  reason: collision with root package name */
    LayoutInflater f334c;

    /* renamed from: d  reason: collision with root package name */
    g f335d;

    /* renamed from: e  reason: collision with root package name */
    ExpandedMenuView f336e;

    /* renamed from: f  reason: collision with root package name */
    int f337f;

    /* renamed from: g  reason: collision with root package name */
    int f338g;

    /* renamed from: h  reason: collision with root package name */
    int f339h;

    /* renamed from: i  reason: collision with root package name */
    private n.a f340i;

    /* renamed from: j  reason: collision with root package name */
    a f341j;

    /* renamed from: k  reason: collision with root package name */
    private int f342k;

    /* access modifiers changed from: private */
    public class a extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        private int f343b = -1;

        public a() {
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            j f2 = e.this.f335d.f();
            if (f2 != null) {
                ArrayList<j> j2 = e.this.f335d.j();
                int size = j2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (j2.get(i2) == f2) {
                        this.f343b = i2;
                        return;
                    }
                }
            }
            this.f343b = -1;
        }

        public int getCount() {
            int size = e.this.f335d.j().size() - e.this.f337f;
            return this.f343b < 0 ? size : size - 1;
        }

        public j getItem(int i2) {
            ArrayList<j> j2 = e.this.f335d.j();
            int i3 = i2 + e.this.f337f;
            int i4 = this.f343b;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return j2.get(i3);
        }

        public long getItemId(int i2) {
            return (long) i2;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f334c.inflate(eVar.f339h, viewGroup, false);
            }
            ((o.a) view).a(getItem(i2), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(int i2, int i3) {
        this.f339h = i2;
        this.f338g = i3;
    }

    public e(Context context, int i2) {
        this(i2, 0);
        this.f333b = context;
        this.f334c = LayoutInflater.from(this.f333b);
    }

    public o a(ViewGroup viewGroup) {
        if (this.f336e == null) {
            this.f336e = (ExpandedMenuView) this.f334c.inflate(g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f341j == null) {
                this.f341j = new a();
            }
            this.f336e.setAdapter((ListAdapter) this.f341j);
            this.f336e.setOnItemClickListener(this);
        }
        return this.f336e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r2.f334c == null) goto L_0x000b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.n
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r3, androidx.appcompat.view.menu.g r4) {
        /*
            r2 = this;
            int r0 = r2.f338g
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r3, r0)
            r2.f333b = r1
        L_0x000b:
            android.content.Context r3 = r2.f333b
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r2.f334c = r3
            goto L_0x001f
        L_0x0014:
            android.content.Context r0 = r2.f333b
            if (r0 == 0) goto L_0x001f
            r2.f333b = r3
            android.view.LayoutInflater r3 = r2.f334c
            if (r3 != 0) goto L_0x001f
            goto L_0x000b
        L_0x001f:
            r2.f335d = r4
            androidx.appcompat.view.menu.e$a r3 = r2.f341j
            if (r3 == 0) goto L_0x0028
            r3.notifyDataSetChanged()
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.a(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    public void a(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f336e.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(Parcelable parcelable) {
        a((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(g gVar, boolean z) {
        n.a aVar = this.f340i;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(n.a aVar) {
        this.f340i = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(boolean z) {
        a aVar = this.f341j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean a(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean a(s sVar) {
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        new h(sVar).a((IBinder) null);
        n.a aVar = this.f340i;
        if (aVar == null) {
            return true;
        }
        aVar.a(sVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable b() {
        if (this.f336e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        b(bundle);
        return bundle;
    }

    public void b(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f336e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean b(g gVar, j jVar) {
        return false;
    }

    public ListAdapter c() {
        if (this.f341j == null) {
            this.f341j = new a();
        }
        return this.f341j;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.f342k;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f335d.a(this.f341j.getItem(i2), this, 0);
    }
}
