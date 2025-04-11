package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.k0;
import c.a.d;
import c.a.g;
import c.h.l.b0;

final class r extends l implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, n, View.OnKeyListener {
    private static final int w = g.abc_popup_menu_item_layout;

    /* renamed from: c  reason: collision with root package name */
    private final Context f401c;

    /* renamed from: d  reason: collision with root package name */
    private final g f402d;

    /* renamed from: e  reason: collision with root package name */
    private final f f403e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f404f;

    /* renamed from: g  reason: collision with root package name */
    private final int f405g;

    /* renamed from: h  reason: collision with root package name */
    private final int f406h;

    /* renamed from: i  reason: collision with root package name */
    private final int f407i;

    /* renamed from: j  reason: collision with root package name */
    final k0 f408j;

    /* renamed from: k  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f409k = new a();

    /* renamed from: l  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f410l = new b();

    /* renamed from: m  reason: collision with root package name */
    private PopupWindow.OnDismissListener f411m;
    private View n;
    View o;
    private n.a p;
    ViewTreeObserver q;
    private boolean r;
    private boolean s;
    private int t;
    private int u = 0;
    private boolean v;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (r.this.f() && !r.this.f408j.l()) {
                View view = r.this.o;
                if (view == null || !view.isShown()) {
                    r.this.dismiss();
                } else {
                    r.this.f408j.e();
                }
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = r.this.q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    r.this.q = view.getViewTreeObserver();
                }
                r rVar = r.this;
                rVar.q.removeGlobalOnLayoutListener(rVar.f409k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public r(Context context, g gVar, View view, int i2, int i3, boolean z) {
        this.f401c = context;
        this.f402d = gVar;
        this.f404f = z;
        this.f403e = new f(gVar, LayoutInflater.from(context), this.f404f, w);
        this.f406h = i2;
        this.f407i = i3;
        Resources resources = context.getResources();
        this.f405g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.abc_config_prefDialogWidth));
        this.n = view;
        this.f408j = new k0(this.f401c, null, this.f406h, this.f407i);
        gVar.a(this, context);
    }

    private boolean h() {
        View view;
        if (f()) {
            return true;
        }
        if (this.r || (view = this.n) == null) {
            return false;
        }
        this.o = view;
        this.f408j.a((PopupWindow.OnDismissListener) this);
        this.f408j.a((AdapterView.OnItemClickListener) this);
        this.f408j.a(true);
        View view2 = this.o;
        boolean z = this.q == null;
        this.q = view2.getViewTreeObserver();
        if (z) {
            this.q.addOnGlobalLayoutListener(this.f409k);
        }
        view2.addOnAttachStateChangeListener(this.f410l);
        this.f408j.a(view2);
        this.f408j.f(this.u);
        if (!this.s) {
            this.t = l.a(this.f403e, null, this.f401c, this.f405g);
            this.s = true;
        }
        this.f408j.e(this.t);
        this.f408j.g(2);
        this.f408j.a(d());
        this.f408j.e();
        ListView g2 = this.f408j.g();
        g2.setOnKeyListener(this);
        if (this.v && this.f402d.h() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f401c).inflate(g.abc_popup_menu_header_item_layout, (ViewGroup) g2, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f402d.h());
            }
            frameLayout.setEnabled(false);
            g2.addHeaderView(frameLayout, null, false);
        }
        this.f408j.a((ListAdapter) this.f403e);
        this.f408j.e();
        return true;
    }

    @Override // androidx.appcompat.view.menu.l
    public void a(int i2) {
        this.u = i2;
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.l
    public void a(View view) {
        this.n = view;
    }

    @Override // androidx.appcompat.view.menu.l
    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.f411m = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.l
    public void a(g gVar) {
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(g gVar, boolean z) {
        if (gVar == this.f402d) {
            dismiss();
            n.a aVar = this.p;
            if (aVar != null) {
                aVar.a(gVar, z);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(n.a aVar) {
        this.p = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(boolean z) {
        this.s = false;
        f fVar = this.f403e;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean a(s sVar) {
        if (sVar.hasVisibleItems()) {
            m mVar = new m(this.f401c, sVar, this.o, this.f404f, this.f406h, this.f407i);
            mVar.a(this.p);
            mVar.a(l.b(sVar));
            mVar.a(this.f411m);
            this.f411m = null;
            this.f402d.a(false);
            int a2 = this.f408j.a();
            int c2 = this.f408j.c();
            if ((Gravity.getAbsoluteGravity(this.u, b0.r(this.n)) & 7) == 5) {
                a2 += this.n.getWidth();
            }
            if (mVar.a(a2, c2)) {
                n.a aVar = this.p;
                if (aVar == null) {
                    return true;
                }
                aVar.a(sVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable b() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.l
    public void b(int i2) {
        this.f408j.c(i2);
    }

    @Override // androidx.appcompat.view.menu.l
    public void b(boolean z) {
        this.f403e.a(z);
    }

    @Override // androidx.appcompat.view.menu.l
    public void c(int i2) {
        this.f408j.a(i2);
    }

    @Override // androidx.appcompat.view.menu.l
    public void c(boolean z) {
        this.v = z;
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        if (f()) {
            this.f408j.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public void e() {
        if (!h()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean f() {
        return !this.r && this.f408j.f();
    }

    @Override // androidx.appcompat.view.menu.q
    public ListView g() {
        return this.f408j.g();
    }

    public void onDismiss() {
        this.r = true;
        this.f402d.close();
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.q = this.o.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.f409k);
            this.q = null;
        }
        this.o.removeOnAttachStateChangeListener(this.f410l);
        PopupWindow.OnDismissListener onDismissListener = this.f411m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
