package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.s;
import androidx.recyclerview.widget.RecyclerView;
import c.h.l.b0;
import c.h.l.k0;
import java.util.ArrayList;

public class g implements n {

    /* renamed from: b  reason: collision with root package name */
    private NavigationMenuView f6431b;

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f6432c;

    /* renamed from: d  reason: collision with root package name */
    private n.a f6433d;

    /* renamed from: e  reason: collision with root package name */
    androidx.appcompat.view.menu.g f6434e;

    /* renamed from: f  reason: collision with root package name */
    private int f6435f;

    /* renamed from: g  reason: collision with root package name */
    c f6436g;

    /* renamed from: h  reason: collision with root package name */
    LayoutInflater f6437h;

    /* renamed from: i  reason: collision with root package name */
    int f6438i;

    /* renamed from: j  reason: collision with root package name */
    boolean f6439j;

    /* renamed from: k  reason: collision with root package name */
    ColorStateList f6440k;

    /* renamed from: l  reason: collision with root package name */
    ColorStateList f6441l;

    /* renamed from: m  reason: collision with root package name */
    Drawable f6442m;
    int n;
    int o;
    private int p;
    int q;
    final View.OnClickListener r = new a();

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            g.this.b(true);
            androidx.appcompat.view.menu.j itemData = ((NavigationMenuItemView) view).getItemData();
            g gVar = g.this;
            boolean a = gVar.f6434e.a(itemData, gVar, 0);
            if (itemData != null && itemData.isCheckable() && a) {
                g.this.f6436g.a(itemData);
            }
            g.this.b(false);
            g.this.a(false);
        }
    }

    /* access modifiers changed from: private */
    public static class b extends k {
        public b(View view) {
            super(view);
        }
    }

    /* access modifiers changed from: private */
    public class c extends RecyclerView.h<k> {

        /* renamed from: d  reason: collision with root package name */
        private final ArrayList<e> f6444d = new ArrayList<>();

        /* renamed from: e  reason: collision with root package name */
        private androidx.appcompat.view.menu.j f6445e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f6446f;

        c() {
            i();
        }

        private void d(int i2, int i3) {
            while (i2 < i3) {
                ((C0090g) this.f6444d.get(i2)).f6449b = true;
                i2++;
            }
        }

        private void i() {
            if (!this.f6446f) {
                this.f6446f = true;
                this.f6444d.clear();
                this.f6444d.add(new d());
                int size = g.this.f6434e.n().size();
                int i2 = -1;
                boolean z = false;
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    androidx.appcompat.view.menu.j jVar = g.this.f6434e.n().get(i4);
                    if (jVar.isChecked()) {
                        a(jVar);
                    }
                    if (jVar.isCheckable()) {
                        jVar.c(false);
                    }
                    if (jVar.hasSubMenu()) {
                        SubMenu subMenu = jVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i4 != 0) {
                                this.f6444d.add(new f(g.this.q, 0));
                            }
                            this.f6444d.add(new C0090g(jVar));
                            int size2 = this.f6444d.size();
                            int size3 = subMenu.size();
                            boolean z2 = false;
                            for (int i5 = 0; i5 < size3; i5++) {
                                androidx.appcompat.view.menu.j jVar2 = (androidx.appcompat.view.menu.j) subMenu.getItem(i5);
                                if (jVar2.isVisible()) {
                                    if (!z2 && jVar2.getIcon() != null) {
                                        z2 = true;
                                    }
                                    if (jVar2.isCheckable()) {
                                        jVar2.c(false);
                                    }
                                    if (jVar.isChecked()) {
                                        a(jVar);
                                    }
                                    this.f6444d.add(new C0090g(jVar2));
                                }
                            }
                            if (z2) {
                                d(size2, this.f6444d.size());
                            }
                        }
                    } else {
                        int groupId = jVar.getGroupId();
                        if (groupId != i2) {
                            i3 = this.f6444d.size();
                            boolean z3 = jVar.getIcon() != null;
                            if (i4 != 0) {
                                i3++;
                                ArrayList<e> arrayList = this.f6444d;
                                int i6 = g.this.q;
                                arrayList.add(new f(i6, i6));
                            }
                            z = z3;
                        } else if (!z && jVar.getIcon() != null) {
                            d(i3, this.f6444d.size());
                            z = true;
                        }
                        C0090g gVar = new C0090g(jVar);
                        gVar.f6449b = z;
                        this.f6444d.add(gVar);
                        i2 = groupId;
                    }
                }
                this.f6446f = false;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long a(int i2) {
            return (long) i2;
        }

        public void a(Bundle bundle) {
            androidx.appcompat.view.menu.j a;
            View actionView;
            i iVar;
            androidx.appcompat.view.menu.j a2;
            int i2 = bundle.getInt("android:menu:checked", 0);
            if (i2 != 0) {
                this.f6446f = true;
                int size = this.f6444d.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    e eVar = this.f6444d.get(i3);
                    if ((eVar instanceof C0090g) && (a2 = ((C0090g) eVar).a()) != null && a2.getItemId() == i2) {
                        a(a2);
                        break;
                    }
                    i3++;
                }
                this.f6446f = false;
                i();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f6444d.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    e eVar2 = this.f6444d.get(i4);
                    if (!(!(eVar2 instanceof C0090g) || (a = ((C0090g) eVar2).a()) == null || (actionView = a.getActionView()) == null || (iVar = (i) sparseParcelableArray.get(a.getItemId())) == null)) {
                        actionView.restoreHierarchyState(iVar);
                    }
                }
            }
        }

        public void a(androidx.appcompat.view.menu.j jVar) {
            if (this.f6445e != jVar && jVar.isCheckable()) {
                androidx.appcompat.view.menu.j jVar2 = this.f6445e;
                if (jVar2 != null) {
                    jVar2.setChecked(false);
                }
                this.f6445e = jVar;
                jVar.setChecked(true);
            }
        }

        /* renamed from: a */
        public void d(k kVar) {
            if (kVar instanceof h) {
                ((NavigationMenuItemView) kVar.a).d();
            }
        }

        /* renamed from: a */
        public void b(k kVar, int i2) {
            int b2 = b(i2);
            if (b2 == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) kVar.a;
                navigationMenuItemView.setIconTintList(g.this.f6441l);
                g gVar = g.this;
                if (gVar.f6439j) {
                    navigationMenuItemView.setTextAppearance(gVar.f6438i);
                }
                ColorStateList colorStateList = g.this.f6440k;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = g.this.f6442m;
                b0.a(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
                C0090g gVar2 = (C0090g) this.f6444d.get(i2);
                navigationMenuItemView.setNeedsEmptyIcon(gVar2.f6449b);
                navigationMenuItemView.setHorizontalPadding(g.this.n);
                navigationMenuItemView.setIconPadding(g.this.o);
                navigationMenuItemView.a(gVar2.a(), 0);
            } else if (b2 == 1) {
                ((TextView) kVar.a).setText(((C0090g) this.f6444d.get(i2)).a().getTitle());
            } else if (b2 == 2) {
                f fVar = (f) this.f6444d.get(i2);
                kVar.a.setPadding(0, fVar.b(), 0, fVar.a());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int b() {
            return this.f6444d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int b(int i2) {
            e eVar = this.f6444d.get(i2);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof C0090g) {
                return ((C0090g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public k b(ViewGroup viewGroup, int i2) {
            if (i2 == 0) {
                g gVar = g.this;
                return new h(gVar.f6437h, viewGroup, gVar.r);
            } else if (i2 == 1) {
                return new j(g.this.f6437h, viewGroup);
            } else {
                if (i2 == 2) {
                    return new i(g.this.f6437h, viewGroup);
                }
                if (i2 != 3) {
                    return null;
                }
                return new b(g.this.f6432c);
            }
        }

        public void b(boolean z) {
            this.f6446f = z;
        }

        public Bundle f() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.j jVar = this.f6445e;
            if (jVar != null) {
                bundle.putInt("android:menu:checked", jVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f6444d.size();
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = this.f6444d.get(i2);
                if (eVar instanceof C0090g) {
                    androidx.appcompat.view.menu.j a = ((C0090g) eVar).a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        i iVar = new i();
                        actionView.saveHierarchyState(iVar);
                        sparseArray.put(a.getItemId(), iVar);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.j g() {
            return this.f6445e;
        }

        public void h() {
            i();
            e();
        }
    }

    /* access modifiers changed from: private */
    public static class d implements e {
        d() {
        }
    }

    /* access modifiers changed from: private */
    public interface e {
    }

    /* access modifiers changed from: private */
    public static class f implements e {
        private final int a;

        /* renamed from: b  reason: collision with root package name */
        private final int f6448b;

        public f(int i2, int i3) {
            this.a = i2;
            this.f6448b = i3;
        }

        public int a() {
            return this.f6448b;
        }

        public int b() {
            return this.a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.internal.g$g  reason: collision with other inner class name */
    public static class C0090g implements e {
        private final androidx.appcompat.view.menu.j a;

        /* renamed from: b  reason: collision with root package name */
        boolean f6449b;

        C0090g(androidx.appcompat.view.menu.j jVar) {
            this.a = jVar;
        }

        public androidx.appcompat.view.menu.j a() {
            return this.a;
        }
    }

    /* access modifiers changed from: private */
    public static class h extends k {
        public h(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(e.b.b.b.h.design_navigation_item, viewGroup, false));
            this.a.setOnClickListener(onClickListener);
        }
    }

    /* access modifiers changed from: private */
    public static class i extends k {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(e.b.b.b.h.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* access modifiers changed from: private */
    public static class j extends k {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(e.b.b.b.h.design_navigation_item_subheader, viewGroup, false));
        }
    }

    private static abstract class k extends RecyclerView.e0 {
        public k(View view) {
            super(view);
        }
    }

    public View a(int i2) {
        View inflate = this.f6437h.inflate(i2, (ViewGroup) this.f6432c, false);
        a(inflate);
        return inflate;
    }

    public o a(ViewGroup viewGroup) {
        if (this.f6431b == null) {
            this.f6431b = (NavigationMenuView) this.f6437h.inflate(e.b.b.b.h.design_navigation_menu, viewGroup, false);
            if (this.f6436g == null) {
                this.f6436g = new c();
            }
            this.f6432c = (LinearLayout) this.f6437h.inflate(e.b.b.b.h.design_navigation_item_header, (ViewGroup) this.f6431b, false);
            this.f6431b.setAdapter(this.f6436g);
        }
        return this.f6431b;
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(Context context, androidx.appcompat.view.menu.g gVar) {
        this.f6437h = LayoutInflater.from(context);
        this.f6434e = gVar;
        this.q = context.getResources().getDimensionPixelOffset(e.b.b.b.d.design_navigation_separator_vertical_padding);
    }

    public void a(ColorStateList colorStateList) {
        this.f6441l = colorStateList;
        a(false);
    }

    public void a(Drawable drawable) {
        this.f6442m = drawable;
        a(false);
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f6431b.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f6436g.a(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f6432c.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    public void a(View view) {
        this.f6432c.addView(view);
        NavigationMenuView navigationMenuView = this.f6431b;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
        n.a aVar = this.f6433d;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    public void a(androidx.appcompat.view.menu.j jVar) {
        this.f6436g.a(jVar);
    }

    public void a(k0 k0Var) {
        int j2 = k0Var.j();
        if (this.p != j2) {
            this.p = j2;
            if (this.f6432c.getChildCount() == 0) {
                NavigationMenuView navigationMenuView = this.f6431b;
                navigationMenuView.setPadding(0, this.p, 0, navigationMenuView.getPaddingBottom());
            }
        }
        b0.a(this.f6432c, k0Var);
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(boolean z) {
        c cVar = this.f6436g;
        if (cVar != null) {
            cVar.h();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean a(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean a(s sVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable b() {
        Bundle bundle = new Bundle();
        if (this.f6431b != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f6431b.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f6436g;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.f());
        }
        if (this.f6432c != null) {
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            this.f6432c.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    public void b(int i2) {
        this.f6435f = i2;
    }

    public void b(ColorStateList colorStateList) {
        this.f6440k = colorStateList;
        a(false);
    }

    public void b(boolean z) {
        c cVar = this.f6436g;
        if (cVar != null) {
            cVar.b(z);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean b(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    public androidx.appcompat.view.menu.j c() {
        return this.f6436g.g();
    }

    public void c(int i2) {
        this.n = i2;
        a(false);
    }

    public int d() {
        return this.f6432c.getChildCount();
    }

    public void d(int i2) {
        this.o = i2;
        a(false);
    }

    public Drawable e() {
        return this.f6442m;
    }

    public void e(int i2) {
        this.f6438i = i2;
        this.f6439j = true;
        a(false);
    }

    public int f() {
        return this.n;
    }

    public int g() {
        return this.o;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.f6435f;
    }

    public ColorStateList h() {
        return this.f6440k;
    }

    public ColorStateList i() {
        return this.f6441l;
    }
}
