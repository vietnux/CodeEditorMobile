package androidx.appcompat.widget;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;

public class l0 {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final g f645b;

    /* renamed from: c  reason: collision with root package name */
    final m f646c;

    /* renamed from: d  reason: collision with root package name */
    d f647d;

    /* renamed from: e  reason: collision with root package name */
    c f648e;

    class a implements g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void a(g gVar) {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            d dVar = l0.this.f647d;
            if (dVar != null) {
                return dVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements PopupWindow.OnDismissListener {
        b() {
        }

        public void onDismiss() {
            l0 l0Var = l0.this;
            c cVar = l0Var.f648e;
            if (cVar != null) {
                cVar.a(l0Var);
            }
        }
    }

    public interface c {
        void a(l0 l0Var);
    }

    public interface d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public l0(Context context, View view, int i2) {
        this(context, view, i2, c.a.a.popupMenuStyle, 0);
    }

    public l0(Context context, View view, int i2, int i3, int i4) {
        this.a = context;
        this.f645b = new g(context);
        this.f645b.a(new a());
        this.f646c = new m(context, this.f645b, view, false, i3, i4);
        this.f646c.a(i2);
        this.f646c.a(new b());
    }

    public MenuInflater a() {
        return new c.a.o.g(this.a);
    }

    public void a(int i2) {
        a().inflate(i2, this.f645b);
    }

    public void a(d dVar) {
        this.f647d = dVar;
    }

    public void b() {
        this.f646c.e();
    }
}
