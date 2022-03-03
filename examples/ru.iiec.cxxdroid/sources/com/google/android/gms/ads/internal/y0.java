package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver;
import c.e.g;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.a60;
import com.google.android.gms.internal.ads.ac0;
import com.google.android.gms.internal.ads.cx;
import com.google.android.gms.internal.ads.d50;
import com.google.android.gms.internal.ads.d6;
import com.google.android.gms.internal.ads.d9;
import com.google.android.gms.internal.ads.e90;
import com.google.android.gms.internal.ads.ec0;
import com.google.android.gms.internal.ads.fc;
import com.google.android.gms.internal.ads.g50;
import com.google.android.gms.internal.ads.g60;
import com.google.android.gms.internal.ads.g9;
import com.google.android.gms.internal.ads.hc0;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.k80;
import com.google.android.gms.internal.ads.kc0;
import com.google.android.gms.internal.ads.l6;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.n40;
import com.google.android.gms.internal.ads.na;
import com.google.android.gms.internal.ads.na0;
import com.google.android.gms.internal.ads.nc0;
import com.google.android.gms.internal.ads.q8;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.r8;
import com.google.android.gms.internal.ads.s8;
import com.google.android.gms.internal.ads.sc;
import com.google.android.gms.internal.ads.t70;
import com.google.android.gms.internal.ads.u60;
import com.google.android.gms.internal.ads.ub;
import com.google.android.gms.internal.ads.ui0;
import com.google.android.gms.internal.ads.w50;
import com.google.android.gms.internal.ads.xb0;
import com.google.android.gms.internal.ads.yw;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@k2
public final class y0 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    kc0 A;
    List<Integer> B;
    e90 C;
    l6 D;
    d6 E;
    public String F;
    List<String> G;
    public d9 H;
    View I;
    public int J;
    boolean K;
    private HashSet<s8> L;
    private int M;
    private int N;
    private ub O;
    private boolean P;
    private boolean Q;
    private boolean R;

    /* renamed from: b  reason: collision with root package name */
    final String f3366b;

    /* renamed from: c  reason: collision with root package name */
    public String f3367c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f3368d;

    /* renamed from: e  reason: collision with root package name */
    final cx f3369e;

    /* renamed from: f  reason: collision with root package name */
    public final sc f3370f;

    /* renamed from: g  reason: collision with root package name */
    z0 f3371g;

    /* renamed from: h  reason: collision with root package name */
    public g9 f3372h;

    /* renamed from: i  reason: collision with root package name */
    public na f3373i;

    /* renamed from: j  reason: collision with root package name */
    public n40 f3374j;

    /* renamed from: k  reason: collision with root package name */
    public q8 f3375k;

    /* renamed from: l  reason: collision with root package name */
    public r8 f3376l;

    /* renamed from: m  reason: collision with root package name */
    public s8 f3377m;
    d50 n;
    g50 o;
    a60 p;
    w50 q;
    g60 r;
    xb0 s;
    ac0 t;
    nc0 u;
    g<String, ec0> v;
    g<String, hc0> w;
    na0 x;
    t70 y;
    u60 z;

    public y0(Context context, n40 n40, String str, sc scVar) {
        this(context, n40, str, scVar, null);
    }

    private y0(Context context, n40 n40, String str, sc scVar, cx cxVar) {
        this.H = null;
        this.I = null;
        this.J = 0;
        this.K = false;
        this.L = null;
        this.M = -1;
        this.N = -1;
        this.P = true;
        this.Q = true;
        this.R = false;
        k80.a(context);
        if (x0.j().d() != null) {
            List<String> b2 = k80.b();
            int i2 = scVar.f5530c;
            if (i2 != 0) {
                b2.add(Integer.toString(i2));
            }
            x0.j().d().a(b2);
        }
        this.f3366b = UUID.randomUUID().toString();
        if (n40.f5049e || n40.f5053i) {
            this.f3371g = null;
        } else {
            this.f3371g = new z0(context, str, scVar.f5529b, this, this);
            this.f3371g.setMinimumWidth(n40.f5051g);
            this.f3371g.setMinimumHeight(n40.f5048d);
            this.f3371g.setVisibility(4);
        }
        this.f3374j = n40;
        this.f3367c = str;
        this.f3368d = context;
        this.f3370f = scVar;
        this.f3369e = new cx(new h(this));
        this.O = new ub(200);
        this.w = new g<>();
    }

    private final void b(boolean z2) {
        q8 q8Var;
        lg lgVar;
        View findViewById;
        if (this.f3371g != null && (q8Var = this.f3375k) != null && (lgVar = q8Var.f5319b) != null && lgVar.M() != null) {
            if (!z2 || this.O.a()) {
                if (this.f3375k.f5319b.M().j()) {
                    int[] iArr = new int[2];
                    this.f3371g.getLocationOnScreen(iArr);
                    a50.b();
                    int b2 = fc.b(this.f3368d, iArr[0]);
                    a50.b();
                    int b3 = fc.b(this.f3368d, iArr[1]);
                    if (!(b2 == this.M && b3 == this.N)) {
                        this.M = b2;
                        this.N = b3;
                        this.f3375k.f5319b.M().a(this.M, this.N, !z2);
                    }
                }
                z0 z0Var = this.f3371g;
                if (z0Var != null && (findViewById = z0Var.getRootView().findViewById(16908290)) != null) {
                    Rect rect = new Rect();
                    Rect rect2 = new Rect();
                    this.f3371g.getGlobalVisibleRect(rect);
                    findViewById.getGlobalVisibleRect(rect2);
                    if (rect.top != rect2.top) {
                        this.P = false;
                    }
                    if (rect.bottom != rect2.bottom) {
                        this.Q = false;
                    }
                }
            }
        }
    }

    public final HashSet<s8> a() {
        return this.L;
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        yw a;
        if (((Boolean) a50.g().a(k80.F1)).booleanValue() && (a = this.f3369e.a()) != null) {
            a.a(view);
        }
    }

    public final void a(HashSet<s8> hashSet) {
        this.L = hashSet;
    }

    public final void a(boolean z2) {
        q8 q8Var;
        lg lgVar;
        if (!(this.J != 0 || (q8Var = this.f3375k) == null || (lgVar = q8Var.f5319b) == null)) {
            lgVar.stopLoading();
        }
        g9 g9Var = this.f3372h;
        if (g9Var != null) {
            g9Var.cancel();
        }
        na naVar = this.f3373i;
        if (naVar != null) {
            naVar.cancel();
        }
        if (z2) {
            this.f3375k = null;
        }
    }

    public final void b() {
        lg lgVar;
        q8 q8Var = this.f3375k;
        if (q8Var != null && (lgVar = q8Var.f5319b) != null) {
            lgVar.destroy();
        }
    }

    public final void c() {
        ui0 ui0;
        q8 q8Var = this.f3375k;
        if (q8Var != null && (ui0 = q8Var.p) != null) {
            try {
                ui0.destroy();
            } catch (RemoteException unused) {
                qc.d("Could not destroy mediation adapter.");
            }
        }
    }

    public final boolean d() {
        return this.J == 0;
    }

    public final boolean e() {
        return this.J == 1;
    }

    public final String f() {
        return (!this.P || !this.Q) ? this.P ? this.R ? "top-scrollable" : "top-locked" : this.Q ? this.R ? "bottom-scrollable" : "bottom-locked" : "" : "";
    }

    public final void onGlobalLayout() {
        b(false);
    }

    public final void onScrollChanged() {
        b(true);
        this.R = true;
    }
}
