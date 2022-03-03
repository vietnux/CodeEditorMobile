package c.a.o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.p;
import c.a.o.b;
import c.e.g;
import java.util.ArrayList;

public class f extends ActionMode {
    final Context a;

    /* renamed from: b  reason: collision with root package name */
    final b f1838b;

    public static class a implements b.a {
        final ActionMode.Callback a;

        /* renamed from: b  reason: collision with root package name */
        final Context f1839b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<f> f1840c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        final g<Menu, Menu> f1841d = new g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f1839b = context;
            this.a = callback;
        }

        private Menu a(Menu menu) {
            Menu menu2 = this.f1841d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            p pVar = new p(this.f1839b, (c.h.f.a.a) menu);
            this.f1841d.put(menu, pVar);
            return pVar;
        }

        @Override // c.a.o.b.a
        public void a(b bVar) {
            this.a.onDestroyActionMode(b(bVar));
        }

        @Override // c.a.o.b.a
        public boolean a(b bVar, Menu menu) {
            return this.a.onPrepareActionMode(b(bVar), a(menu));
        }

        @Override // c.a.o.b.a
        public boolean a(b bVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(b(bVar), new k(this.f1839b, (c.h.f.a.b) menuItem));
        }

        public ActionMode b(b bVar) {
            int size = this.f1840c.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = this.f1840c.get(i2);
                if (fVar != null && fVar.f1838b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f1839b, bVar);
            this.f1840c.add(fVar2);
            return fVar2;
        }

        @Override // c.a.o.b.a
        public boolean b(b bVar, Menu menu) {
            return this.a.onCreateActionMode(b(bVar), a(menu));
        }
    }

    public f(Context context, b bVar) {
        this.a = context;
        this.f1838b = bVar;
    }

    public void finish() {
        this.f1838b.a();
    }

    public View getCustomView() {
        return this.f1838b.b();
    }

    public Menu getMenu() {
        return new p(this.a, (c.h.f.a.a) this.f1838b.c());
    }

    public MenuInflater getMenuInflater() {
        return this.f1838b.d();
    }

    public CharSequence getSubtitle() {
        return this.f1838b.e();
    }

    public Object getTag() {
        return this.f1838b.f();
    }

    public CharSequence getTitle() {
        return this.f1838b.g();
    }

    public boolean getTitleOptionalHint() {
        return this.f1838b.h();
    }

    public void invalidate() {
        this.f1838b.i();
    }

    public boolean isTitleOptional() {
        return this.f1838b.j();
    }

    public void setCustomView(View view) {
        this.f1838b.a(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i2) {
        this.f1838b.a(i2);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f1838b.a(charSequence);
    }

    public void setTag(Object obj) {
        this.f1838b.a(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i2) {
        this.f1838b.b(i2);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f1838b.b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f1838b.a(z);
    }
}
