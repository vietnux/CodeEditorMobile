package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import c.e.g;
import c.h.f.a.b;

/* access modifiers changed from: package-private */
public abstract class c {
    final Context a;

    /* renamed from: b  reason: collision with root package name */
    private g<b, MenuItem> f311b;

    /* renamed from: c  reason: collision with root package name */
    private g<c.h.f.a.c, SubMenu> f312c;

    c(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: package-private */
    public final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b bVar = (b) menuItem;
        if (this.f311b == null) {
            this.f311b = new g<>();
        }
        MenuItem menuItem2 = this.f311b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        k kVar = new k(this.a, bVar);
        this.f311b.put(bVar, kVar);
        return kVar;
    }

    /* access modifiers changed from: package-private */
    public final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof c.h.f.a.c)) {
            return subMenu;
        }
        c.h.f.a.c cVar = (c.h.f.a.c) subMenu;
        if (this.f312c == null) {
            this.f312c = new g<>();
        }
        SubMenu subMenu2 = this.f312c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        t tVar = new t(this.a, cVar);
        this.f312c.put(cVar, tVar);
        return tVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (this.f311b != null) {
            int i3 = 0;
            while (i3 < this.f311b.size()) {
                if (this.f311b.b(i3).getGroupId() == i2) {
                    this.f311b.c(i3);
                    i3--;
                }
                i3++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        g<b, MenuItem> gVar = this.f311b;
        if (gVar != null) {
            gVar.clear();
        }
        g<c.h.f.a.c, SubMenu> gVar2 = this.f312c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        if (this.f311b != null) {
            for (int i3 = 0; i3 < this.f311b.size(); i3++) {
                if (this.f311b.b(i3).getItemId() == i2) {
                    this.f311b.c(i3);
                    return;
                }
            }
        }
    }
}
