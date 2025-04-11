package e.b.b.a.c.e;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.t.c;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicReference;

public class d2 extends j5 implements a3 {
    private static volatile d2 U;
    private final z4 A;
    private final AppMeasurement B;
    private final FirebaseAnalytics C;
    private final s5 D;
    private final x0 E;
    private final e F;
    private final x3 G;
    private final c3 H;
    private final n I;
    private v0 J;
    private a4 K;
    private h0 L;
    private u0 M;
    private q1 N;
    private boolean O = false;
    private Boolean P;
    private long Q;
    private int R;
    private int S;
    private final long T;
    private final Context v;
    private final y w;
    private final k1 x;
    private final z0 y;
    private final z1 z;

    private d2(b3 b3Var) {
        String str;
        b1 b1Var;
        y.a(b3Var);
        a(this);
        this.v = b3Var.a;
        w6.a(this.v);
        this.u = -1;
        this.F = h.d();
        this.T = this.F.a();
        this.w = new y(this);
        k1 k1Var = new k1(this);
        k1Var.x();
        this.x = k1Var;
        z0 z0Var = new z0(this);
        z0Var.x();
        this.y = z0Var;
        s5 s5Var = new s5(this);
        s5Var.x();
        this.D = s5Var;
        x0 x0Var = new x0(this);
        x0Var.x();
        this.E = x0Var;
        this.I = new n(this);
        x3 x3Var = new x3(this);
        x3Var.x();
        this.G = x3Var;
        c3 c3Var = new c3(this);
        c3Var.x();
        this.H = c3Var;
        this.B = new AppMeasurement(this);
        this.C = new FirebaseAnalytics(this);
        z4 z4Var = new z4(this);
        z4Var.x();
        this.A = z4Var;
        z1 z1Var = new z1(this);
        z1Var.x();
        this.z = z1Var;
        if (this.v.getApplicationContext() instanceof Application) {
            c3 u = u();
            if (u.getContext().getApplicationContext() instanceof Application) {
                Application application = (Application) u.getContext().getApplicationContext();
                if (u.f7195c == null) {
                    u.f7195c = new v3(u, null);
                }
                application.unregisterActivityLifecycleCallbacks(u.f7195c);
                application.registerActivityLifecycleCallbacks(u.f7195c);
                b1Var = u.a().F();
                str = "Registered activity lifecycle callback";
            }
            d1 d1Var = new d1(this);
            d1Var.x();
            this.f7358b = d1Var;
            y1 y1Var = new y1(this);
            y1Var.x();
            this.a = y1Var;
            this.z.a(new e2(this, b3Var));
        }
        b1Var = a().B();
        str = "Application context is not an Application";
        b1Var.a(str);
        d1 d1Var2 = new d1(this);
        d1Var2.x();
        this.f7358b = d1Var2;
        y1 y1Var2 = new y1(this);
        y1Var2.x();
        this.a = y1Var2;
        this.z.a(new e2(this, b3Var));
    }

    private final void I() {
        if (!this.O) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    static void J() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public static d2 a(Context context) {
        y.a(context);
        y.a(context.getApplicationContext());
        if (U == null) {
            synchronized (d2.class) {
                if (U == null) {
                    U = new d2(new b3(context));
                }
            }
        }
        return U;
    }

    private static void a(y2 y2Var) {
        if (y2Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void b(z2 z2Var) {
        if (z2Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!z2Var.s()) {
            String valueOf = String.valueOf(z2Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final z0 A() {
        z0 z0Var = this.y;
        if (z0Var == null || !z0Var.s()) {
            return null;
        }
        return this.y;
    }

    public final q1 B() {
        return this.N;
    }

    /* access modifiers changed from: package-private */
    public final z1 C() {
        return this.z;
    }

    public final AppMeasurement D() {
        return this.B;
    }

    public final FirebaseAnalytics E() {
        return this.C;
    }

    /* access modifiers changed from: package-private */
    public final long F() {
        Long valueOf = Long.valueOf(i().f7380j.a());
        return valueOf.longValue() == 0 ? this.T : Math.min(this.T, valueOf.longValue());
    }

    /* access modifiers changed from: package-private */
    public final void G() {
        this.S++;
    }

    /* access modifiers changed from: protected */
    public final boolean H() {
        I();
        e();
        Boolean bool = this.P;
        if (bool == null || this.Q == 0 || (bool != null && !bool.booleanValue() && Math.abs(b().b() - this.Q) > 1000)) {
            this.Q = b().b();
            boolean z2 = false;
            if (h().f("android.permission.INTERNET") && h().f("android.permission.ACCESS_NETWORK_STATE") && (c.b(getContext()).a() || (u1.a(getContext()) && u4.a(getContext(), false)))) {
                z2 = true;
            }
            this.P = Boolean.valueOf(z2);
            if (this.P.booleanValue()) {
                this.P = Boolean.valueOf(h().d(v().y()));
            }
        }
        return this.P.booleanValue();
    }

    @Override // e.b.b.a.c.e.j5, e.b.b.a.c.e.v
    public final z0 a() {
        b(this.y);
        return this.y;
    }

    /* access modifiers changed from: package-private */
    public final void a(b3 b3Var) {
        b1 b1Var;
        String str;
        e();
        h0 h0Var = new h0(this);
        h0Var.x();
        this.L = h0Var;
        u0 u0Var = new u0(this);
        u0Var.x();
        this.M = u0Var;
        v0 v0Var = new v0(this);
        v0Var.x();
        this.J = v0Var;
        a4 a4Var = new a4(this);
        a4Var.x();
        this.K = a4Var;
        this.D.w();
        this.x.w();
        this.N = new q1(this);
        this.M.w();
        a().D().a("App measurement is starting up, version", 12451L);
        a().D().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String z2 = u0Var.z();
        if (h().e(z2)) {
            b1Var = a().D();
            str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
        } else {
            b1Var = a().D();
            String valueOf = String.valueOf(z2);
            str = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
        }
        b1Var.a(str);
        a().E().a("Debug-level message logging enabled");
        if (this.R != this.S) {
            a().y().a("Not all components initialized", Integer.valueOf(this.R), Integer.valueOf(this.S));
        }
        super.a((o5) b3Var);
        this.O = true;
    }

    /* access modifiers changed from: package-private */
    public final void a(z2 z2Var) {
        this.R++;
    }

    @Override // e.b.b.a.c.e.j5, e.b.b.a.c.e.v
    public final e b() {
        return this.F;
    }

    @Override // e.b.b.a.c.e.j5, e.b.b.a.c.e.v
    public final z1 c() {
        b(this.z);
        return this.z;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.j5
    public final void d() {
        e();
        if (i().f7375e.a() == 0) {
            i().f7375e.a(b().a());
        }
        if (Long.valueOf(i().f7380j.a()).longValue() == 0) {
            a().F().a("Persisting first open", Long.valueOf(this.T));
            i().f7380j.a(this.T);
        }
        if (H()) {
            if (!TextUtils.isEmpty(v().y())) {
                String y2 = i().y();
                if (y2 == null) {
                    i().c(v().y());
                } else if (!y2.equals(v().y())) {
                    a().D().a("Rechecking which service to use due to a GMP App Id change");
                    i().B();
                    this.K.y();
                    this.K.B();
                    i().c(v().y());
                    i().f7380j.a(this.T);
                    i().f7382l.a(null);
                }
            }
            u().a(i().f7382l.a());
            if (!TextUtils.isEmpty(v().y())) {
                boolean s = s();
                if (!i().E() && !j().t()) {
                    i().d(!s);
                }
                if (!j().i(v().z()) || s) {
                    u().G();
                }
                w().a(new AtomicReference<>());
            }
        } else if (s()) {
            if (!h().f("android.permission.INTERNET")) {
                a().y().a("App is missing INTERNET permission");
            }
            if (!h().f("android.permission.ACCESS_NETWORK_STATE")) {
                a().y().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!c.b(getContext()).a()) {
                if (!u1.a(getContext())) {
                    a().y().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!u4.a(getContext(), false)) {
                    a().y().a("AppMeasurementService not registered/enabled");
                }
            }
            a().y().a("Uploading is not possible. App measurement disabled");
        }
        super.d();
    }

    @Override // e.b.b.a.c.e.j5
    public final void e() {
        c().d();
    }

    @Override // e.b.b.a.c.e.j5
    public final h0 f() {
        b(this.L);
        return this.L;
    }

    @Override // e.b.b.a.c.e.j5
    public final x0 g() {
        a((y2) this.E);
        return this.E;
    }

    @Override // e.b.b.a.c.e.j5, e.b.b.a.c.e.v
    public final Context getContext() {
        return this.v;
    }

    @Override // e.b.b.a.c.e.j5
    public final s5 h() {
        a((y2) this.D);
        return this.D;
    }

    @Override // e.b.b.a.c.e.j5
    public final k1 i() {
        a((y2) this.x);
        return this.x;
    }

    @Override // e.b.b.a.c.e.j5
    public final y j() {
        return this.w;
    }

    public final boolean s() {
        e();
        I();
        boolean z2 = false;
        if (j().t()) {
            return false;
        }
        Boolean b2 = j().b("firebase_analytics_collection_enabled");
        if (b2 != null) {
            z2 = b2.booleanValue();
        } else if (!f.b()) {
            z2 = true;
        }
        return i().c(z2);
    }

    public final n t() {
        a(this.I);
        return this.I;
    }

    public final c3 u() {
        b(this.H);
        return this.H;
    }

    public final u0 v() {
        b(this.M);
        return this.M;
    }

    public final a4 w() {
        b(this.K);
        return this.K;
    }

    public final x3 x() {
        b(this.G);
        return this.G;
    }

    public final v0 y() {
        b(this.J);
        return this.J;
    }

    public final z4 z() {
        b(this.A);
        return this.A;
    }
}
