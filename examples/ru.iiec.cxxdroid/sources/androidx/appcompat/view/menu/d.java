package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.k0;
import c.a.g;
import c.h.l.b0;
import java.util.ArrayList;
import java.util.List;

final class d extends l implements n, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int C = g.abc_cascading_menu_item_layout;
    private PopupWindow.OnDismissListener A;
    boolean B;

    /* renamed from: c  reason: collision with root package name */
    private final Context f313c;

    /* renamed from: d  reason: collision with root package name */
    private final int f314d;

    /* renamed from: e  reason: collision with root package name */
    private final int f315e;

    /* renamed from: f  reason: collision with root package name */
    private final int f316f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f317g;

    /* renamed from: h  reason: collision with root package name */
    final Handler f318h;

    /* renamed from: i  reason: collision with root package name */
    private final List<g> f319i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    final List<C0009d> f320j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f321k = new a();

    /* renamed from: l  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f322l = new b();

    /* renamed from: m  reason: collision with root package name */
    private final j0 f323m = new c();
    private int n = 0;
    private int o = 0;
    private View p;
    View q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private n.a y;
    ViewTreeObserver z;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (d.this.f() && d.this.f320j.size() > 0 && !d.this.f320j.get(0).a.l()) {
                View view = d.this.q;
                if (view == null || !view.isShown()) {
                    d.this.dismiss();
                    return;
                }
                for (C0009d dVar : d.this.f320j) {
                    dVar.a.e();
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
            ViewTreeObserver viewTreeObserver = d.this.z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.z = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.z.removeGlobalOnLayoutListener(dVar.f321k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements j0 {

        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C0009d f327b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ MenuItem f328c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ g f329d;

            a(C0009d dVar, MenuItem menuItem, g gVar) {
                this.f327b = dVar;
                this.f328c = menuItem;
                this.f329d = gVar;
            }

            public void run() {
                C0009d dVar = this.f327b;
                if (dVar != null) {
                    d.this.B = true;
                    dVar.f331b.a(false);
                    d.this.B = false;
                }
                if (this.f328c.isEnabled() && this.f328c.hasSubMenu()) {
                    this.f329d.a(this.f328c, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.j0
        public void a(g gVar, MenuItem menuItem) {
            C0009d dVar = null;
            d.this.f318h.removeCallbacksAndMessages(null);
            int size = d.this.f320j.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (gVar == d.this.f320j.get(i2).f331b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                int i3 = i2 + 1;
                if (i3 < d.this.f320j.size()) {
                    dVar = d.this.f320j.get(i3);
                }
                d.this.f318h.postAtTime(new a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        @Override // androidx.appcompat.widget.j0
        public void b(g gVar, MenuItem menuItem) {
            d.this.f318h.removeCallbacksAndMessages(gVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.d$d  reason: collision with other inner class name */
    public static class C0009d {
        public final k0 a;

        /* renamed from: b  reason: collision with root package name */
        public final g f331b;

        /* renamed from: c  reason: collision with root package name */
        public final int f332c;

        public C0009d(k0 k0Var, g gVar, int i2) {
            this.a = k0Var;
            this.f331b = gVar;
            this.f332c = i2;
        }

        public ListView a() {
            return this.a.g();
        }
    }

    public d(Context context, View view, int i2, int i3, boolean z2) {
        this.f313c = context;
        this.p = view;
        this.f315e = i2;
        this.f316f = i3;
        this.f317g = z2;
        this.w = false;
        this.r = i();
        Resources resources = context.getResources();
        this.f314d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(c.a.d.abc_config_prefDialogWidth));
        this.f318h = new Handler();
    }

    private MenuItem a(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = gVar.getItem(i2);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View a(C0009d dVar, g gVar) {
        int i2;
        f fVar;
        int firstVisiblePosition;
        MenuItem a2 = a(dVar.f331b, gVar);
        if (a2 == null) {
            return null;
        }
        ListView a3 = dVar.a();
        ListAdapter adapter = a3.getAdapter();
        int i3 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i2 = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i2 = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i3 >= count) {
                i3 = -1;
                break;
            } else if (a2 == fVar.getItem(i3)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 != -1 && (firstVisiblePosition = (i3 + i2) - a3.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a3.getChildCount()) {
            return a3.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int c(g gVar) {
        int size = this.f320j.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (gVar == this.f320j.get(i2).f331b) {
                return i2;
            }
        }
        return -1;
    }

    private int d(int i2) {
        List<C0009d> list = this.f320j;
        ListView a2 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.q.getWindowVisibleDisplayFrame(rect);
        return this.r == 1 ? (iArr[0] + a2.getWidth()) + i2 > rect.right ? 0 : 1 : iArr[0] - i2 < 0 ? 1 : 0;
    }

    private void d(g gVar) {
        View view;
        C0009d dVar;
        int i2;
        int i3;
        int i4;
        LayoutInflater from = LayoutInflater.from(this.f313c);
        f fVar = new f(gVar, from, this.f317g, C);
        if (!f() && this.w) {
            fVar.a(true);
        } else if (f()) {
            fVar.a(l.b(gVar));
        }
        int a2 = l.a(fVar, null, this.f313c, this.f314d);
        k0 h2 = h();
        h2.a((ListAdapter) fVar);
        h2.e(a2);
        h2.f(this.o);
        if (this.f320j.size() > 0) {
            List<C0009d> list = this.f320j;
            dVar = list.get(list.size() - 1);
            view = a(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            h2.c(false);
            h2.a((Object) null);
            int d2 = d(a2);
            boolean z2 = d2 == 1;
            this.r = d2;
            if (Build.VERSION.SDK_INT >= 26) {
                h2.a(view);
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                this.p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.o & 7) == 5) {
                    iArr[0] = iArr[0] + this.p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.o & 5) != 5) {
                if (z2) {
                    a2 = view.getWidth();
                }
                i4 = i2 - a2;
                h2.c(i4);
                h2.b(true);
                h2.a(i3);
            } else if (!z2) {
                a2 = view.getWidth();
                i4 = i2 - a2;
                h2.c(i4);
                h2.b(true);
                h2.a(i3);
            }
            i4 = i2 + a2;
            h2.c(i4);
            h2.b(true);
            h2.a(i3);
        } else {
            if (this.s) {
                h2.c(this.u);
            }
            if (this.t) {
                h2.a(this.v);
            }
            h2.a(d());
        }
        this.f320j.add(new C0009d(h2, gVar, this.r));
        h2.e();
        ListView g2 = h2.g();
        g2.setOnKeyListener(this);
        if (dVar == null && this.x && gVar.h() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(g.abc_popup_menu_header_item_layout, (ViewGroup) g2, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.h());
            g2.addHeaderView(frameLayout, null, false);
            h2.e();
        }
    }

    private k0 h() {
        k0 k0Var = new k0(this.f313c, null, this.f315e, this.f316f);
        k0Var.a(this.f323m);
        k0Var.a((AdapterView.OnItemClickListener) this);
        k0Var.a((PopupWindow.OnDismissListener) this);
        k0Var.a(this.p);
        k0Var.f(this.o);
        k0Var.a(true);
        k0Var.g(2);
        return k0Var;
    }

    private int i() {
        return b0.r(this.p) == 1 ? 0 : 1;
    }

    @Override // androidx.appcompat.view.menu.l
    public void a(int i2) {
        if (this.n != i2) {
            this.n = i2;
            this.o = c.h.l.g.a(i2, b0.r(this.p));
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.l
    public void a(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = c.h.l.g.a(this.n, b0.r(this.p));
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.l
    public void a(g gVar) {
        gVar.a(this, this.f313c);
        if (f()) {
            d(gVar);
        } else {
            this.f319i.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(g gVar, boolean z2) {
        int c2 = c(gVar);
        if (c2 >= 0) {
            int i2 = c2 + 1;
            if (i2 < this.f320j.size()) {
                this.f320j.get(i2).f331b.a(false);
            }
            C0009d remove = this.f320j.remove(c2);
            remove.f331b.b(this);
            if (this.B) {
                remove.a.b((Object) null);
                remove.a.d(0);
            }
            remove.a.dismiss();
            int size = this.f320j.size();
            this.r = size > 0 ? this.f320j.get(size - 1).f332c : i();
            if (size == 0) {
                dismiss();
                n.a aVar = this.y;
                if (aVar != null) {
                    aVar.a(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.z;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.z.removeGlobalOnLayoutListener(this.f321k);
                    }
                    this.z = null;
                }
                this.q.removeOnAttachStateChangeListener(this.f322l);
                this.A.onDismiss();
            } else if (z2) {
                this.f320j.get(0).f331b.a(false);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(n.a aVar) {
        this.y = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(boolean z2) {
        for (C0009d dVar : this.f320j) {
            l.a(dVar.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean a(s sVar) {
        for (C0009d dVar : this.f320j) {
            if (sVar == dVar.f331b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        a((g) sVar);
        n.a aVar = this.y;
        if (aVar != null) {
            aVar.a(sVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable b() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.l
    public void b(int i2) {
        this.s = true;
        this.u = i2;
    }

    @Override // androidx.appcompat.view.menu.l
    public void b(boolean z2) {
        this.w = z2;
    }

    @Override // androidx.appcompat.view.menu.l
    public void c(int i2) {
        this.t = true;
        this.v = i2;
    }

    @Override // androidx.appcompat.view.menu.l
    public void c(boolean z2) {
        this.x = z2;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.view.menu.l
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        int size = this.f320j.size();
        if (size > 0) {
            C0009d[] dVarArr = (C0009d[]) this.f320j.toArray(new C0009d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0009d dVar = dVarArr[i2];
                if (dVar.a.f()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public void e() {
        if (!f()) {
            for (g gVar : this.f319i) {
                d(gVar);
            }
            this.f319i.clear();
            this.q = this.p;
            if (this.q != null) {
                boolean z2 = this.z == null;
                this.z = this.q.getViewTreeObserver();
                if (z2) {
                    this.z.addOnGlobalLayoutListener(this.f321k);
                }
                this.q.addOnAttachStateChangeListener(this.f322l);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean f() {
        return this.f320j.size() > 0 && this.f320j.get(0).a.f();
    }

    @Override // androidx.appcompat.view.menu.q
    public ListView g() {
        if (this.f320j.isEmpty()) {
            return null;
        }
        List<C0009d> list = this.f320j;
        return list.get(list.size() - 1).a();
    }

    public void onDismiss() {
        C0009d dVar;
        int size = this.f320j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f320j.get(i2);
            if (!dVar.a.f()) {
                break;
            }
            i2++;
        }
        if (dVar != null) {
            dVar.f331b.a(false);
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
