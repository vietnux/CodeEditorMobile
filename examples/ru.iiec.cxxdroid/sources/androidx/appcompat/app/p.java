package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.p0;
import c.a.f;
import c.a.j;
import c.a.o.b;
import c.a.o.h;
import c.h.l.b0;
import c.h.l.g0;
import c.h.l.h0;
import c.h.l.i0;
import c.h.l.j0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class p extends a implements ActionBarOverlayLayout.d {
    private static final Interpolator B = new AccelerateInterpolator();
    private static final Interpolator C = new DecelerateInterpolator();
    final j0 A = new c();
    Context a;

    /* renamed from: b  reason: collision with root package name */
    private Context f250b;

    /* renamed from: c  reason: collision with root package name */
    ActionBarOverlayLayout f251c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarContainer f252d;

    /* renamed from: e  reason: collision with root package name */
    c0 f253e;

    /* renamed from: f  reason: collision with root package name */
    ActionBarContextView f254f;

    /* renamed from: g  reason: collision with root package name */
    View f255g;

    /* renamed from: h  reason: collision with root package name */
    p0 f256h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f257i;

    /* renamed from: j  reason: collision with root package name */
    d f258j;

    /* renamed from: k  reason: collision with root package name */
    c.a.o.b f259k;

    /* renamed from: l  reason: collision with root package name */
    b.a f260l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f261m;
    private ArrayList<a.b> n = new ArrayList<>();
    private boolean o;
    private int p = 0;
    boolean q = true;
    boolean r;
    boolean s;
    private boolean t;
    private boolean u = true;
    h v;
    private boolean w;
    boolean x;
    final h0 y = new a();
    final h0 z = new b();

    class a extends i0 {
        a() {
        }

        @Override // c.h.l.h0
        public void b(View view) {
            View view2;
            p pVar = p.this;
            if (pVar.q && (view2 = pVar.f255g) != null) {
                view2.setTranslationY(0.0f);
                p.this.f252d.setTranslationY(0.0f);
            }
            p.this.f252d.setVisibility(8);
            p.this.f252d.setTransitioning(false);
            p pVar2 = p.this;
            pVar2.v = null;
            pVar2.o();
            ActionBarOverlayLayout actionBarOverlayLayout = p.this.f251c;
            if (actionBarOverlayLayout != null) {
                b0.N(actionBarOverlayLayout);
            }
        }
    }

    class b extends i0 {
        b() {
        }

        @Override // c.h.l.h0
        public void b(View view) {
            p pVar = p.this;
            pVar.v = null;
            pVar.f252d.requestLayout();
        }
    }

    class c implements j0 {
        c() {
        }

        @Override // c.h.l.j0
        public void a(View view) {
            ((View) p.this.f252d.getParent()).invalidate();
        }
    }

    public class d extends c.a.o.b implements g.a {

        /* renamed from: d  reason: collision with root package name */
        private final Context f262d;

        /* renamed from: e  reason: collision with root package name */
        private final g f263e;

        /* renamed from: f  reason: collision with root package name */
        private b.a f264f;

        /* renamed from: g  reason: collision with root package name */
        private WeakReference<View> f265g;

        public d(Context context, b.a aVar) {
            this.f262d = context;
            this.f264f = aVar;
            g gVar = new g(context);
            gVar.c(1);
            this.f263e = gVar;
            this.f263e.a(this);
        }

        @Override // c.a.o.b
        public void a() {
            p pVar = p.this;
            if (pVar.f258j == this) {
                if (!p.a(pVar.r, pVar.s, false)) {
                    p pVar2 = p.this;
                    pVar2.f259k = this;
                    pVar2.f260l = this.f264f;
                } else {
                    this.f264f.a(this);
                }
                this.f264f = null;
                p.this.g(false);
                p.this.f254f.a();
                p.this.f253e.h().sendAccessibilityEvent(32);
                p pVar3 = p.this;
                pVar3.f251c.setHideOnContentScrollEnabled(pVar3.x);
                p.this.f258j = null;
            }
        }

        @Override // c.a.o.b
        public void a(int i2) {
            a((CharSequence) p.this.a.getResources().getString(i2));
        }

        @Override // c.a.o.b
        public void a(View view) {
            p.this.f254f.setCustomView(view);
            this.f265g = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void a(g gVar) {
            if (this.f264f != null) {
                i();
                p.this.f254f.d();
            }
        }

        @Override // c.a.o.b
        public void a(CharSequence charSequence) {
            p.this.f254f.setSubtitle(charSequence);
        }

        @Override // c.a.o.b
        public void a(boolean z) {
            super.a(z);
            p.this.f254f.setTitleOptional(z);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            b.a aVar = this.f264f;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        @Override // c.a.o.b
        public View b() {
            WeakReference<View> weakReference = this.f265g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // c.a.o.b
        public void b(int i2) {
            b(p.this.a.getResources().getString(i2));
        }

        @Override // c.a.o.b
        public void b(CharSequence charSequence) {
            p.this.f254f.setTitle(charSequence);
        }

        @Override // c.a.o.b
        public Menu c() {
            return this.f263e;
        }

        @Override // c.a.o.b
        public MenuInflater d() {
            return new c.a.o.g(this.f262d);
        }

        @Override // c.a.o.b
        public CharSequence e() {
            return p.this.f254f.getSubtitle();
        }

        @Override // c.a.o.b
        public CharSequence g() {
            return p.this.f254f.getTitle();
        }

        @Override // c.a.o.b
        public void i() {
            if (p.this.f258j == this) {
                this.f263e.s();
                try {
                    this.f264f.a(this, this.f263e);
                } finally {
                    this.f263e.r();
                }
            }
        }

        @Override // c.a.o.b
        public boolean j() {
            return p.this.f254f.b();
        }

        public boolean k() {
            this.f263e.s();
            try {
                return this.f264f.b(this, this.f263e);
            } finally {
                this.f263e.r();
            }
        }
    }

    public p(Activity activity, boolean z2) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (!z2) {
            this.f255g = decorView.findViewById(16908290);
        }
    }

    public p(Dialog dialog) {
        new ArrayList();
        b(dialog.getWindow().getDecorView());
    }

    private c0 a(View view) {
        if (view instanceof c0) {
            return (c0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    static boolean a(boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return true;
        }
        return !z2 && !z3;
    }

    private void b(View view) {
        this.f251c = (ActionBarOverlayLayout) view.findViewById(f.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f251c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f253e = a(view.findViewById(f.action_bar));
        this.f254f = (ActionBarContextView) view.findViewById(f.action_context_bar);
        this.f252d = (ActionBarContainer) view.findViewById(f.action_bar_container);
        c0 c0Var = this.f253e;
        if (c0Var == null || this.f254f == null || this.f252d == null) {
            throw new IllegalStateException(p.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = c0Var.getContext();
        boolean z2 = (this.f253e.k() & 4) != 0;
        if (z2) {
            this.f257i = true;
        }
        c.a.o.a a2 = c.a.o.a.a(this.a);
        k(a2.a() || z2);
        l(a2.f());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, j.ActionBar, c.a.a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(j.ActionBar_hideOnContentScroll, false)) {
            j(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void l(boolean z2) {
        this.o = z2;
        if (!this.o) {
            this.f253e.a((p0) null);
            this.f252d.setTabContainer(this.f256h);
        } else {
            this.f252d.setTabContainer(null);
            this.f253e.a(this.f256h);
        }
        boolean z3 = true;
        boolean z4 = r() == 2;
        p0 p0Var = this.f256h;
        if (p0Var != null) {
            if (z4) {
                p0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f251c;
                if (actionBarOverlayLayout != null) {
                    b0.N(actionBarOverlayLayout);
                }
            } else {
                p0Var.setVisibility(8);
            }
        }
        this.f253e.b(!this.o && z4);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f251c;
        if (this.o || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z3);
    }

    private void m(boolean z2) {
        if (a(this.r, this.s, this.t)) {
            if (!this.u) {
                this.u = true;
                i(z2);
            }
        } else if (this.u) {
            this.u = false;
            h(z2);
        }
    }

    private void s() {
        if (this.t) {
            this.t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f251c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m(false);
        }
    }

    private boolean t() {
        return b0.I(this.f252d);
    }

    private void u() {
        if (!this.t) {
            this.t = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f251c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m(false);
        }
    }

    @Override // androidx.appcompat.app.a
    public c.a.o.b a(b.a aVar) {
        d dVar = this.f258j;
        if (dVar != null) {
            dVar.a();
        }
        this.f251c.setHideOnContentScrollEnabled(false);
        this.f254f.c();
        d dVar2 = new d(this.f254f.getContext(), aVar);
        if (!dVar2.k()) {
            return null;
        }
        this.f258j = dVar2;
        dVar2.i();
        this.f254f.a(dVar2);
        g(true);
        this.f254f.sendAccessibilityEvent(32);
        return dVar2;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.s) {
            this.s = false;
            m(true);
        }
    }

    public void a(float f2) {
        b0.a(this.f252d, f2);
    }

    @Override // androidx.appcompat.app.a
    public void a(int i2) {
        this.f253e.d(i2);
    }

    @Override // androidx.appcompat.app.a
    public void a(int i2, int i3) {
        int k2 = this.f253e.k();
        if ((i3 & 4) != 0) {
            this.f257i = true;
        }
        this.f253e.b((i2 & i3) | ((~i3) & k2));
    }

    @Override // androidx.appcompat.app.a
    public void a(Configuration configuration) {
        l(c.a.o.a.a(this.a).f());
    }

    @Override // androidx.appcompat.app.a
    public void a(Drawable drawable) {
        this.f252d.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void a(CharSequence charSequence) {
        this.f253e.a(charSequence);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a(boolean z2) {
        this.q = z2;
    }

    @Override // androidx.appcompat.app.a
    public boolean a(int i2, KeyEvent keyEvent) {
        Menu c2;
        d dVar = this.f258j;
        if (dVar == null || (c2 = dVar.c()) == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        c2.setQwertyMode(z2);
        return c2.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        h hVar = this.v;
        if (hVar != null) {
            hVar.a();
            this.v = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public void b(Drawable drawable) {
        this.f253e.b(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void b(CharSequence charSequence) {
        this.f253e.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void b(boolean z2) {
        if (z2 != this.f261m) {
            this.f261m = z2;
            int size = this.n.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.n.get(i2).a(z2);
            }
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
    }

    @Override // androidx.appcompat.app.a
    public void c(CharSequence charSequence) {
        this.f253e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void c(boolean z2) {
        if (!this.f257i) {
            d(z2);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (!this.s) {
            this.s = true;
            m(true);
        }
    }

    @Override // androidx.appcompat.app.a
    public void d(boolean z2) {
        a(z2 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void e(boolean z2) {
        a(z2 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void f(boolean z2) {
        h hVar;
        this.w = z2;
        if (!z2 && (hVar = this.v) != null) {
            hVar.a();
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean f() {
        c0 c0Var = this.f253e;
        if (c0Var == null || !c0Var.j()) {
            return false;
        }
        this.f253e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public int g() {
        return this.f253e.k();
    }

    public void g(boolean z2) {
        g0 g0Var;
        g0 g0Var2;
        if (z2) {
            u();
        } else {
            s();
        }
        if (t()) {
            if (z2) {
                g0Var = this.f253e.a(4, 100);
                g0Var2 = this.f254f.a(0, 200);
            } else {
                g0Var2 = this.f253e.a(0, 200);
                g0Var = this.f254f.a(8, 100);
            }
            h hVar = new h();
            hVar.a(g0Var, g0Var2);
            hVar.c();
        } else if (z2) {
            this.f253e.a(4);
            this.f254f.setVisibility(0);
        } else {
            this.f253e.a(0);
            this.f254f.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.app.a
    public Context h() {
        if (this.f250b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(c.a.a.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f250b = new ContextThemeWrapper(this.a, i2);
            } else {
                this.f250b = this.a;
            }
        }
        return this.f250b;
    }

    public void h(boolean z2) {
        View view;
        h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        if (this.p != 0 || (!this.w && !z2)) {
            this.y.b(null);
            return;
        }
        this.f252d.setAlpha(1.0f);
        this.f252d.setTransitioning(true);
        h hVar2 = new h();
        float f2 = (float) (-this.f252d.getHeight());
        if (z2) {
            int[] iArr = {0, 0};
            this.f252d.getLocationInWindow(iArr);
            f2 -= (float) iArr[1];
        }
        g0 a2 = b0.a(this.f252d);
        a2.b(f2);
        a2.a(this.A);
        hVar2.a(a2);
        if (this.q && (view = this.f255g) != null) {
            g0 a3 = b0.a(view);
            a3.b(f2);
            hVar2.a(a3);
        }
        hVar2.a(B);
        hVar2.a(250);
        hVar2.a(this.y);
        this.v = hVar2;
        hVar2.c();
    }

    @Override // androidx.appcompat.app.a
    public void i() {
        if (!this.r) {
            this.r = true;
            m(false);
        }
    }

    public void i(boolean z2) {
        View view;
        View view2;
        h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        this.f252d.setVisibility(0);
        if (this.p != 0 || (!this.w && !z2)) {
            this.f252d.setAlpha(1.0f);
            this.f252d.setTranslationY(0.0f);
            if (this.q && (view = this.f255g) != null) {
                view.setTranslationY(0.0f);
            }
            this.z.b(null);
        } else {
            this.f252d.setTranslationY(0.0f);
            float f2 = (float) (-this.f252d.getHeight());
            if (z2) {
                int[] iArr = {0, 0};
                this.f252d.getLocationInWindow(iArr);
                f2 -= (float) iArr[1];
            }
            this.f252d.setTranslationY(f2);
            h hVar2 = new h();
            g0 a2 = b0.a(this.f252d);
            a2.b(0.0f);
            a2.a(this.A);
            hVar2.a(a2);
            if (this.q && (view2 = this.f255g) != null) {
                view2.setTranslationY(f2);
                g0 a3 = b0.a(this.f255g);
                a3.b(0.0f);
                hVar2.a(a3);
            }
            hVar2.a(C);
            hVar2.a(250);
            hVar2.a(this.z);
            this.v = hVar2;
            hVar2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f251c;
        if (actionBarOverlayLayout != null) {
            b0.N(actionBarOverlayLayout);
        }
    }

    public void j(boolean z2) {
        if (!z2 || this.f251c.i()) {
            this.x = z2;
            this.f251c.setHideOnContentScrollEnabled(z2);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void k(boolean z2) {
        this.f253e.a(z2);
    }

    @Override // androidx.appcompat.app.a
    public boolean k() {
        int p2 = p();
        return this.u && (p2 == 0 || q() < p2);
    }

    @Override // androidx.appcompat.app.a
    public void n() {
        if (this.r) {
            this.r = false;
            m(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void o() {
        b.a aVar = this.f260l;
        if (aVar != null) {
            aVar.a(this.f259k);
            this.f259k = null;
            this.f260l = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i2) {
        this.p = i2;
    }

    public int p() {
        return this.f252d.getHeight();
    }

    public int q() {
        return this.f251c.getActionBarHideOffset();
    }

    public int r() {
        return this.f253e.m();
    }
}
