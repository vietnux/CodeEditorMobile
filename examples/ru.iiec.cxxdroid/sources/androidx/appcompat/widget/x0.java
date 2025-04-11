package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.Toolbar;
import c.a.e;
import c.a.f;
import c.a.h;
import c.a.j;
import c.h.l.b0;
import c.h.l.g0;
import c.h.l.i0;

public class x0 implements c0 {
    Toolbar a;

    /* renamed from: b  reason: collision with root package name */
    private int f767b;

    /* renamed from: c  reason: collision with root package name */
    private View f768c;

    /* renamed from: d  reason: collision with root package name */
    private View f769d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f770e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f771f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f772g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f773h;

    /* renamed from: i  reason: collision with root package name */
    CharSequence f774i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f775j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f776k;

    /* renamed from: l  reason: collision with root package name */
    Window.Callback f777l;

    /* renamed from: m  reason: collision with root package name */
    boolean f778m;
    private c n;
    private int o;
    private int p;
    private Drawable q;

    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final androidx.appcompat.view.menu.a f779b = new androidx.appcompat.view.menu.a(x0.this.a.getContext(), 0, 16908332, 0, 0, x0.this.f774i);

        a() {
        }

        public void onClick(View view) {
            x0 x0Var = x0.this;
            Window.Callback callback = x0Var.f777l;
            if (callback != null && x0Var.f778m) {
                callback.onMenuItemSelected(0, this.f779b);
            }
        }
    }

    class b extends i0 {
        private boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f781b;

        b(int i2) {
            this.f781b = i2;
        }

        @Override // c.h.l.h0, c.h.l.i0
        public void a(View view) {
            this.a = true;
        }

        @Override // c.h.l.h0
        public void b(View view) {
            if (!this.a) {
                x0.this.a.setVisibility(this.f781b);
            }
        }

        @Override // c.h.l.h0, c.h.l.i0
        public void c(View view) {
            x0.this.a.setVisibility(0);
        }
    }

    public x0(Toolbar toolbar, boolean z) {
        this(toolbar, z, h.abc_action_bar_up_description, e.abc_ic_ab_back_material);
    }

    public x0(Toolbar toolbar, boolean z, int i2, int i3) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.f774i = toolbar.getTitle();
        this.f775j = toolbar.getSubtitle();
        this.f773h = this.f774i != null;
        this.f772g = toolbar.getNavigationIcon();
        w0 a2 = w0.a(toolbar.getContext(), null, j.ActionBar, c.a.a.actionBarStyle, 0);
        this.q = a2.b(j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence e2 = a2.e(j.ActionBar_title);
            if (!TextUtils.isEmpty(e2)) {
                setTitle(e2);
            }
            CharSequence e3 = a2.e(j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(e3)) {
                a(e3);
            }
            Drawable b2 = a2.b(j.ActionBar_logo);
            if (b2 != null) {
                c(b2);
            }
            Drawable b3 = a2.b(j.ActionBar_icon);
            if (b3 != null) {
                setIcon(b3);
            }
            if (this.f772g == null && (drawable = this.q) != null) {
                b(drawable);
            }
            b(a2.d(j.ActionBar_displayOptions, 0));
            int g2 = a2.g(j.ActionBar_customNavigationLayout, 0);
            if (g2 != 0) {
                a(LayoutInflater.from(this.a.getContext()).inflate(g2, (ViewGroup) this.a, false));
                b(this.f767b | 16);
            }
            int f2 = a2.f(j.ActionBar_height, 0);
            if (f2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = f2;
                this.a.setLayoutParams(layoutParams);
            }
            int b4 = a2.b(j.ActionBar_contentInsetStart, -1);
            int b5 = a2.b(j.ActionBar_contentInsetEnd, -1);
            if (b4 >= 0 || b5 >= 0) {
                this.a.a(Math.max(b4, 0), Math.max(b5, 0));
            }
            int g3 = a2.g(j.ActionBar_titleTextStyle, 0);
            if (g3 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.b(toolbar2.getContext(), g3);
            }
            int g4 = a2.g(j.ActionBar_subtitleTextStyle, 0);
            if (g4 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.a(toolbar3.getContext(), g4);
            }
            int g5 = a2.g(j.ActionBar_popupTheme, 0);
            if (g5 != 0) {
                this.a.setPopupTheme(g5);
            }
        } else {
            this.f767b = p();
        }
        a2.b();
        e(i2);
        this.f776k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a());
    }

    private void c(CharSequence charSequence) {
        this.f774i = charSequence;
        if ((this.f767b & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    private int p() {
        if (this.a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.a.getNavigationIcon();
        return 15;
    }

    private void q() {
        if ((this.f767b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f776k)) {
            this.a.setNavigationContentDescription(this.p);
        } else {
            this.a.setNavigationContentDescription(this.f776k);
        }
    }

    private void r() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f767b & 4) != 0) {
            toolbar = this.a;
            drawable = this.f772g;
            if (drawable == null) {
                drawable = this.q;
            }
        } else {
            toolbar = this.a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void s() {
        Drawable drawable;
        int i2 = this.f767b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f771f) == null) {
            drawable = this.f770e;
        }
        this.a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.c0
    public g0 a(int i2, long j2) {
        g0 a2 = b0.a(this.a);
        a2.a(i2 == 0 ? 1.0f : 0.0f);
        a2.a(j2);
        a2.a(new b(i2));
        return a2;
    }

    @Override // androidx.appcompat.widget.c0
    public void a(int i2) {
        this.a.setVisibility(i2);
    }

    @Override // androidx.appcompat.widget.c0
    public void a(Drawable drawable) {
        b0.a(this.a, drawable);
    }

    @Override // androidx.appcompat.widget.c0
    public void a(Menu menu, n.a aVar) {
        if (this.n == null) {
            this.n = new c(this.a.getContext());
            this.n.a(f.action_menu_presenter);
        }
        this.n.a(aVar);
        this.a.a((g) menu, this.n);
    }

    public void a(View view) {
        View view2 = this.f769d;
        if (!(view2 == null || (this.f767b & 16) == 0)) {
            this.a.removeView(view2);
        }
        this.f769d = view;
        if (view != null && (this.f767b & 16) != 0) {
            this.a.addView(this.f769d);
        }
    }

    @Override // androidx.appcompat.widget.c0
    public void a(n.a aVar, g.a aVar2) {
        this.a.a(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.c0
    public void a(p0 p0Var) {
        Toolbar toolbar;
        View view = this.f768c;
        if (view != null && view.getParent() == (toolbar = this.a)) {
            toolbar.removeView(this.f768c);
        }
        this.f768c = p0Var;
        if (p0Var != null && this.o == 2) {
            this.a.addView(this.f768c, 0);
            Toolbar.e eVar = (Toolbar.e) this.f768c.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) eVar).width = -2;
            ((ViewGroup.MarginLayoutParams) eVar).height = -2;
            eVar.a = 8388691;
            p0Var.setAllowCollapse(true);
        }
    }

    @Override // androidx.appcompat.widget.c0
    public void a(CharSequence charSequence) {
        this.f775j = charSequence;
        if ((this.f767b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.c0
    public void a(boolean z) {
    }

    @Override // androidx.appcompat.widget.c0
    public boolean a() {
        return this.a.i();
    }

    @Override // androidx.appcompat.widget.c0
    public void b() {
        this.f778m = true;
    }

    @Override // androidx.appcompat.widget.c0
    public void b(int i2) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i3 = this.f767b ^ i2;
        this.f767b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    q();
                }
                r();
            }
            if ((i3 & 3) != 0) {
                s();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.setTitle(this.f774i);
                    toolbar = this.a;
                    charSequence = this.f775j;
                } else {
                    charSequence = null;
                    this.a.setTitle((CharSequence) null);
                    toolbar = this.a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i3 & 16) != 0 && (view = this.f769d) != null) {
                if ((i2 & 16) != 0) {
                    this.a.addView(view);
                } else {
                    this.a.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.c0
    public void b(Drawable drawable) {
        this.f772g = drawable;
        r();
    }

    public void b(CharSequence charSequence) {
        this.f776k = charSequence;
        q();
    }

    @Override // androidx.appcompat.widget.c0
    public void b(boolean z) {
        this.a.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.c0
    public void c(int i2) {
        c(i2 != 0 ? c.a.k.a.a.c(getContext(), i2) : null);
    }

    public void c(Drawable drawable) {
        this.f771f = drawable;
        s();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean c() {
        return this.a.h();
    }

    @Override // androidx.appcompat.widget.c0
    public void collapseActionView() {
        this.a.c();
    }

    @Override // androidx.appcompat.widget.c0
    public void d(int i2) {
        b(i2 == 0 ? null : getContext().getString(i2));
    }

    @Override // androidx.appcompat.widget.c0
    public boolean d() {
        return this.a.g();
    }

    public void e(int i2) {
        if (i2 != this.p) {
            this.p = i2;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                d(this.p);
            }
        }
    }

    @Override // androidx.appcompat.widget.c0
    public boolean e() {
        return this.a.k();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean f() {
        return this.a.b();
    }

    @Override // androidx.appcompat.widget.c0
    public void g() {
        this.a.d();
    }

    @Override // androidx.appcompat.widget.c0
    public Context getContext() {
        return this.a.getContext();
    }

    @Override // androidx.appcompat.widget.c0
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // androidx.appcompat.widget.c0
    public ViewGroup h() {
        return this.a;
    }

    @Override // androidx.appcompat.widget.c0
    public int i() {
        return this.a.getVisibility();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean j() {
        return this.a.f();
    }

    @Override // androidx.appcompat.widget.c0
    public int k() {
        return this.f767b;
    }

    @Override // androidx.appcompat.widget.c0
    public Menu l() {
        return this.a.getMenu();
    }

    @Override // androidx.appcompat.widget.c0
    public int m() {
        return this.o;
    }

    @Override // androidx.appcompat.widget.c0
    public void n() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.c0
    public void o() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.c0
    public void setIcon(int i2) {
        setIcon(i2 != 0 ? c.a.k.a.a.c(getContext(), i2) : null);
    }

    @Override // androidx.appcompat.widget.c0
    public void setIcon(Drawable drawable) {
        this.f770e = drawable;
        s();
    }

    @Override // androidx.appcompat.widget.c0
    public void setTitle(CharSequence charSequence) {
        this.f773h = true;
        c(charSequence);
    }

    @Override // androidx.appcompat.widget.c0
    public void setWindowCallback(Window.Callback callback) {
        this.f777l = callback;
    }

    @Override // androidx.appcompat.widget.c0
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f773h) {
            c(charSequence);
        }
    }
}
