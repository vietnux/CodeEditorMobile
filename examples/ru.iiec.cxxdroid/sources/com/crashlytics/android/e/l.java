package com.crashlytics.android.e;

import android.content.Context;
import android.util.Log;
import f.a.a.a.i;
import f.a.a.a.n.b.g;
import f.a.a.a.n.b.n;
import f.a.a.a.n.b.o;
import f.a.a.a.n.b.p;
import f.a.a.a.n.c.f;
import f.a.a.a.n.c.h;
import f.a.a.a.n.c.m;
import f.a.a.a.n.g.r;
import f.a.a.a.n.g.u;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@f.a.a.a.n.c.e({p.class})
public class l extends i<Void> {

    /* renamed from: h  reason: collision with root package name */
    private final long f2998h;

    /* renamed from: i  reason: collision with root package name */
    private final ConcurrentHashMap<String, String> f2999i;

    /* renamed from: j  reason: collision with root package name */
    private m f3000j;

    /* renamed from: k  reason: collision with root package name */
    private m f3001k;

    /* renamed from: l  reason: collision with root package name */
    private n f3002l;

    /* renamed from: m  reason: collision with root package name */
    private k f3003m;
    private String n;
    private String o;
    private String p;
    private float q;
    private boolean r;
    private final i0 s;
    private f.a.a.a.n.e.e t;
    private j u;
    private p v;

    /* access modifiers changed from: package-private */
    public class a extends h<Void> {
        a() {
        }

        @Override // f.a.a.a.n.c.j, f.a.a.a.n.c.k
        public f c() {
            return f.IMMEDIATE;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            return l.this.i();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Callable<Void> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            l.this.f3000j.a();
            f.a.a.a.c.g().e("CrashlyticsCore", "Initialization marker file created.");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Callable<Boolean> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        public Boolean call() {
            try {
                boolean c2 = l.this.f3000j.c();
                f.a.a.a.l g2 = f.a.a.a.c.g();
                g2.e("CrashlyticsCore", "Initialization marker file removed: " + c2);
                return Boolean.valueOf(c2);
            } catch (Exception e2) {
                f.a.a.a.c.g().c("CrashlyticsCore", "Problem encountered deleting Crashlytics initialization marker.", e2);
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final class d implements Callable<Boolean> {

        /* renamed from: b  reason: collision with root package name */
        private final m f3007b;

        public d(m mVar) {
            this.f3007b = mVar;
        }

        @Override // java.util.concurrent.Callable
        public Boolean call() {
            if (!this.f3007b.b()) {
                return Boolean.FALSE;
            }
            f.a.a.a.c.g().e("CrashlyticsCore", "Found previous crash marker.");
            this.f3007b.c();
            return Boolean.TRUE;
        }
    }

    private static final class e implements n {
        private e() {
        }

        /* synthetic */ e(a aVar) {
            this();
        }

        @Override // com.crashlytics.android.e.n
        public void a() {
        }
    }

    public l() {
        this(1.0f, null, null, false);
    }

    l(float f2, n nVar, i0 i0Var, boolean z) {
        this(f2, nVar, i0Var, z, n.a("Crashlytics Exception Handler"));
    }

    l(float f2, n nVar, i0 i0Var, boolean z, ExecutorService executorService) {
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = f2;
        this.f3002l = nVar == null ? new e(null) : nVar;
        this.s = i0Var;
        this.r = z;
        this.u = new j(executorService);
        this.f2999i = new ConcurrentHashMap<>();
        this.f2998h = System.currentTimeMillis();
    }

    private void C() {
        if (Boolean.TRUE.equals((Boolean) this.u.b(new d(this.f3001k)))) {
            try {
                this.f3002l.a();
            } catch (Exception e2) {
                f.a.a.a.c.g().c("CrashlyticsCore", "Exception thrown by CrashlyticsListener while notifying of previous crash.", e2);
            }
        }
    }

    private void D() {
        String str;
        f.a.a.a.l lVar;
        Throwable e2;
        a aVar = new a();
        for (m mVar : k()) {
            aVar.a(mVar);
        }
        Future submit = l().c().submit(aVar);
        f.a.a.a.c.g().e("CrashlyticsCore", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
            return;
        } catch (InterruptedException e3) {
            e2 = e3;
            lVar = f.a.a.a.c.g();
            str = "Crashlytics was interrupted during initialization.";
        } catch (ExecutionException e4) {
            e2 = e4;
            lVar = f.a.a.a.c.g();
            str = "Problem encountered during Crashlytics initialization.";
        } catch (TimeoutException e5) {
            e2 = e5;
            lVar = f.a.a.a.c.g();
            str = "Crashlytics timed out during initialization.";
        }
        lVar.c("CrashlyticsCore", str, e2);
    }

    public static l E() {
        return (l) f.a.a.a.c.a(l.class);
    }

    private void a(int i2, String str, String str2) {
        if (!this.r && b("prior to logging messages.")) {
            this.f3003m.a(System.currentTimeMillis() - this.f2998h, b(i2, str, str2));
        }
    }

    static boolean a(String str, boolean z) {
        if (!z) {
            f.a.a.a.c.g().e("CrashlyticsCore", "Configured not to require a build ID.");
            return true;
        } else if (!f.a.a.a.n.b.i.b(str)) {
            return true;
        } else {
            Log.e("CrashlyticsCore", ".");
            Log.e("CrashlyticsCore", ".     |  | ");
            Log.e("CrashlyticsCore", ".     |  |");
            Log.e("CrashlyticsCore", ".     |  |");
            Log.e("CrashlyticsCore", ".   \\ |  | /");
            Log.e("CrashlyticsCore", ".    \\    /");
            Log.e("CrashlyticsCore", ".     \\  /");
            Log.e("CrashlyticsCore", ".      \\/");
            Log.e("CrashlyticsCore", ".");
            Log.e("CrashlyticsCore", "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.");
            Log.e("CrashlyticsCore", ".");
            Log.e("CrashlyticsCore", ".      /\\");
            Log.e("CrashlyticsCore", ".     /  \\");
            Log.e("CrashlyticsCore", ".    /    \\");
            Log.e("CrashlyticsCore", ".   / |  | \\");
            Log.e("CrashlyticsCore", ".     |  |");
            Log.e("CrashlyticsCore", ".     |  |");
            Log.e("CrashlyticsCore", ".     |  |");
            Log.e("CrashlyticsCore", ".");
            return false;
        }
    }

    private static String b(int i2, String str, String str2) {
        return f.a.a.a.n.b.i.a(i2) + "/" + str + " " + str2;
    }

    private static boolean b(String str) {
        l E = E();
        if (E != null && E.f3003m != null) {
            return true;
        }
        f.a.a.a.l g2 = f.a.a.a.c.g();
        g2.c("CrashlyticsCore", "Crashlytics must be initialized by calling Fabric.with(Context) " + str, null);
        return false;
    }

    /* access modifiers changed from: package-private */
    public void A() {
        this.u.a(new c());
    }

    /* access modifiers changed from: package-private */
    public void B() {
        this.u.b(new b());
    }

    public void a(String str) {
        a(3, "CrashlyticsCore", str);
    }

    /* access modifiers changed from: package-private */
    public boolean a(Context context) {
        String d2;
        if (this.r || (d2 = new g().d(context)) == null) {
            return false;
        }
        String n2 = f.a.a.a.n.b.i.n(context);
        if (a(n2, f.a.a.a.n.b.i.a(context, "com.crashlytics.RequireBuildId", true))) {
            try {
                f.a.a.a.l g2 = f.a.a.a.c.g();
                g2.b("CrashlyticsCore", "Initializing Crashlytics " + p());
                f.a.a.a.n.f.b bVar = new f.a.a.a.n.f.b(this);
                this.f3001k = new m("crash_marker", bVar);
                this.f3000j = new m("initialization_marker", bVar);
                j0 a2 = j0.a(new f.a.a.a.n.f.d(j(), "com.crashlytics.android.core.CrashlyticsCore"), this);
                q qVar = this.s != null ? new q(this.s) : null;
                this.t = new f.a.a.a.n.e.b(f.a.a.a.c.g());
                this.t.a(qVar);
                p m2 = m();
                a a3 = a.a(context, m2, d2, n2);
                b0 b0Var = new b0(context, a3.f2899d);
                b a4 = u.a(this);
                com.crashlytics.android.c.n b2 = com.crashlytics.android.c.i.b(context);
                f.a.a.a.l g3 = f.a.a.a.c.g();
                g3.e("CrashlyticsCore", "Installer package name is: " + a3.f2898c);
                this.f3003m = new k(this, this.u, this.t, m2, a2, bVar, a3, b0Var, a4, b2);
                boolean u2 = u();
                C();
                this.f3003m.a(Thread.getDefaultUncaughtExceptionHandler(), new o().b(context));
                if (!u2 || !f.a.a.a.n.b.i.b(context)) {
                    f.a.a.a.c.g().e("CrashlyticsCore", "Exception handling initialization successful");
                    return true;
                }
                f.a.a.a.c.g().e("CrashlyticsCore", "Crashlytics did not finish previous background initialization. Initializing synchronously.");
                D();
                return false;
            } catch (Exception e2) {
                f.a.a.a.c.g().c("CrashlyticsCore", "Crashlytics was not started due to an exception during initialization", e2);
                this.f3003m = null;
                return false;
            }
        } else {
            throw new f.a.a.a.n.c.n("This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.");
        }
    }

    /* access modifiers changed from: protected */
    @Override // f.a.a.a.i
    public Void i() {
        B();
        this.f3003m.a();
        try {
            this.f3003m.k();
            u a2 = r.d().a();
            if (a2 == null) {
                f.a.a.a.c.g().a("CrashlyticsCore", "Received null settings, skipping report submission!");
                A();
                return null;
            }
            this.f3003m.a(a2);
            if (!a2.f8587d.f8565b) {
                f.a.a.a.c.g().e("CrashlyticsCore", "Collection of crash reports disabled in Crashlytics settings.");
                A();
                return null;
            }
            o w = w();
            if (w != null && !this.f3003m.a(w)) {
                f.a.a.a.c.g().e("CrashlyticsCore", "Could not finalize previous NDK sessions.");
            }
            if (!this.f3003m.b(a2.f8585b)) {
                f.a.a.a.c.g().e("CrashlyticsCore", "Could not finalize previous sessions.");
            }
            this.f3003m.a(this.q, a2);
            A();
            return null;
        } catch (Exception e2) {
            f.a.a.a.c.g().c("CrashlyticsCore", "Crashlytics encountered a problem during asynchronous initialization.", e2);
        } catch (Throwable th) {
            A();
            throw th;
        }
    }

    @Override // f.a.a.a.i
    public String n() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    @Override // f.a.a.a.i
    public String p() {
        return "2.6.1.23";
    }

    /* access modifiers changed from: protected */
    @Override // f.a.a.a.i
    public boolean s() {
        return a(super.j());
    }

    /* access modifiers changed from: package-private */
    public void t() {
        this.f3001k.a();
    }

    /* access modifiers changed from: package-private */
    public boolean u() {
        return this.f3000j.b();
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> v() {
        return Collections.unmodifiableMap(this.f2999i);
    }

    /* access modifiers changed from: package-private */
    public o w() {
        p pVar = this.v;
        if (pVar != null) {
            return pVar.a();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public String x() {
        if (m().a()) {
            return this.o;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public String y() {
        if (m().a()) {
            return this.n;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public String z() {
        if (m().a()) {
            return this.p;
        }
        return null;
    }
}
