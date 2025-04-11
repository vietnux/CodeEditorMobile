package c.a.o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import c.a.o.b;
import java.lang.ref.WeakReference;

public class e extends b implements g.a {

    /* renamed from: d  reason: collision with root package name */
    private Context f1832d;

    /* renamed from: e  reason: collision with root package name */
    private ActionBarContextView f1833e;

    /* renamed from: f  reason: collision with root package name */
    private b.a f1834f;

    /* renamed from: g  reason: collision with root package name */
    private WeakReference<View> f1835g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1836h;

    /* renamed from: i  reason: collision with root package name */
    private g f1837i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.f1832d = context;
        this.f1833e = actionBarContextView;
        this.f1834f = aVar;
        g gVar = new g(actionBarContextView.getContext());
        gVar.c(1);
        this.f1837i = gVar;
        this.f1837i.a(this);
    }

    @Override // c.a.o.b
    public void a() {
        if (!this.f1836h) {
            this.f1836h = true;
            this.f1833e.sendAccessibilityEvent(32);
            this.f1834f.a(this);
        }
    }

    @Override // c.a.o.b
    public void a(int i2) {
        a((CharSequence) this.f1832d.getString(i2));
    }

    @Override // c.a.o.b
    public void a(View view) {
        this.f1833e.setCustomView(view);
        this.f1835g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void a(g gVar) {
        i();
        this.f1833e.d();
    }

    @Override // c.a.o.b
    public void a(CharSequence charSequence) {
        this.f1833e.setSubtitle(charSequence);
    }

    @Override // c.a.o.b
    public void a(boolean z) {
        super.a(z);
        this.f1833e.setTitleOptional(z);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(g gVar, MenuItem menuItem) {
        return this.f1834f.a(this, menuItem);
    }

    @Override // c.a.o.b
    public View b() {
        WeakReference<View> weakReference = this.f1835g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // c.a.o.b
    public void b(int i2) {
        b(this.f1832d.getString(i2));
    }

    @Override // c.a.o.b
    public void b(CharSequence charSequence) {
        this.f1833e.setTitle(charSequence);
    }

    @Override // c.a.o.b
    public Menu c() {
        return this.f1837i;
    }

    @Override // c.a.o.b
    public MenuInflater d() {
        return new g(this.f1833e.getContext());
    }

    @Override // c.a.o.b
    public CharSequence e() {
        return this.f1833e.getSubtitle();
    }

    @Override // c.a.o.b
    public CharSequence g() {
        return this.f1833e.getTitle();
    }

    @Override // c.a.o.b
    public void i() {
        this.f1834f.a(this, this.f1837i);
    }

    @Override // c.a.o.b
    public boolean j() {
        return this.f1833e.b();
    }
}
