package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

public class b implements DrawerLayout.e {
    private final AbstractC0007b a;

    /* renamed from: b  reason: collision with root package name */
    private final DrawerLayout f161b;

    /* renamed from: c  reason: collision with root package name */
    private c.a.l.a.d f162c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f163d;

    /* renamed from: e  reason: collision with root package name */
    boolean f164e;

    /* renamed from: f  reason: collision with root package name */
    private final int f165f;

    /* renamed from: g  reason: collision with root package name */
    private final int f166g;

    /* renamed from: h  reason: collision with root package name */
    View.OnClickListener f167h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f168i;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            b bVar = b.this;
            if (bVar.f164e) {
                bVar.c();
                return;
            }
            View.OnClickListener onClickListener = bVar.f167h;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.b$b  reason: collision with other inner class name */
    public interface AbstractC0007b {
        void a(int i2);

        void a(Drawable drawable, int i2);

        boolean a();

        Drawable b();

        Context c();
    }

    public interface c {
        AbstractC0007b g();
    }

    private static class d implements AbstractC0007b {
        private final Activity a;

        /* renamed from: b  reason: collision with root package name */
        private c.a f170b;

        d(Activity activity) {
            this.a = activity;
        }

        @Override // androidx.appcompat.app.b.AbstractC0007b
        public void a(int i2) {
            if (Build.VERSION.SDK_INT >= 18) {
                ActionBar actionBar = this.a.getActionBar();
                if (actionBar != null) {
                    actionBar.setHomeActionContentDescription(i2);
                    return;
                }
                return;
            }
            this.f170b = c.a(this.f170b, this.a, i2);
        }

        @Override // androidx.appcompat.app.b.AbstractC0007b
        public void a(Drawable drawable, int i2) {
            ActionBar actionBar = this.a.getActionBar();
            if (actionBar == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 18) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i2);
                return;
            }
            actionBar.setDisplayShowHomeEnabled(true);
            this.f170b = c.a(this.a, drawable, i2);
            actionBar.setDisplayShowHomeEnabled(false);
        }

        @Override // androidx.appcompat.app.b.AbstractC0007b
        public boolean a() {
            ActionBar actionBar = this.a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.b.AbstractC0007b
        public Drawable b() {
            if (Build.VERSION.SDK_INT < 18) {
                return c.a(this.a);
            }
            TypedArray obtainStyledAttributes = c().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.b.AbstractC0007b
        public Context c() {
            ActionBar actionBar = this.a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.a;
        }
    }

    static class e implements AbstractC0007b {
        final Toolbar a;

        /* renamed from: b  reason: collision with root package name */
        final Drawable f171b;

        /* renamed from: c  reason: collision with root package name */
        final CharSequence f172c;

        e(Toolbar toolbar) {
            this.a = toolbar;
            this.f171b = toolbar.getNavigationIcon();
            this.f172c = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.b.AbstractC0007b
        public void a(int i2) {
            if (i2 == 0) {
                this.a.setNavigationContentDescription(this.f172c);
            } else {
                this.a.setNavigationContentDescription(i2);
            }
        }

        @Override // androidx.appcompat.app.b.AbstractC0007b
        public void a(Drawable drawable, int i2) {
            this.a.setNavigationIcon(drawable);
            a(i2);
        }

        @Override // androidx.appcompat.app.b.AbstractC0007b
        public boolean a() {
            return true;
        }

        @Override // androidx.appcompat.app.b.AbstractC0007b
        public Drawable b() {
            return this.f171b;
        }

        @Override // androidx.appcompat.app.b.AbstractC0007b
        public Context c() {
            return this.a.getContext();
        }
    }

    b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, c.a.l.a.d dVar, int i2, int i3) {
        this.f163d = true;
        this.f164e = true;
        this.f168i = false;
        if (toolbar != null) {
            this.a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.a = ((c) activity).g();
        } else {
            this.a = new d(activity);
        }
        this.f161b = drawerLayout;
        this.f165f = i2;
        this.f166g = i3;
        if (dVar == null) {
            this.f162c = new c.a.l.a.d(this.a.c());
        } else {
            this.f162c = dVar;
        }
        a();
    }

    public b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i2, int i3) {
        this(activity, toolbar, drawerLayout, null, i2, i3);
    }

    private void a(float f2) {
        c.a.l.a.d dVar;
        boolean z;
        if (f2 == 1.0f) {
            dVar = this.f162c;
            z = true;
        } else {
            if (f2 == 0.0f) {
                dVar = this.f162c;
                z = false;
            }
            this.f162c.c(f2);
        }
        dVar.b(z);
        this.f162c.c(f2);
    }

    /* access modifiers changed from: package-private */
    public Drawable a() {
        return this.a.b();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void a(int i2) {
    }

    /* access modifiers changed from: package-private */
    public void a(Drawable drawable, int i2) {
        if (!this.f168i && !this.a.a()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f168i = true;
        }
        this.a.a(drawable, i2);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void a(View view) {
        a(1.0f);
        if (this.f164e) {
            b(this.f166g);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void a(View view, float f2) {
        if (this.f163d) {
            a(Math.min(1.0f, Math.max(0.0f, f2)));
        } else {
            a(0.0f);
        }
    }

    public void b() {
        a(this.f161b.e(8388611) ? 1.0f : 0.0f);
        if (this.f164e) {
            a(this.f162c, this.f161b.e(8388611) ? this.f166g : this.f165f);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        this.a.a(i2);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void b(View view) {
        a(0.0f);
        if (this.f164e) {
            b(this.f165f);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        int c2 = this.f161b.c(8388611);
        if (this.f161b.f(8388611) && c2 != 2) {
            this.f161b.a(8388611);
        } else if (c2 != 1) {
            this.f161b.g(8388611);
        }
    }
}
