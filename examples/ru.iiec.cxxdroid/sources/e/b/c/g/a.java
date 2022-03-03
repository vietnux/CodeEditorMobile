package e.b.c.g;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.t.c;
import e.b.b.a.c.b.e1;
import e.b.b.a.c.b.m;
import e.b.b.a.c.b.n;
import e.b.b.a.c.b.n0;
import e.b.b.a.c.b.o;
import e.b.b.a.c.b.p;
import e.b.b.a.c.b.q;
import e.b.b.a.c.b.r;
import e.b.b.a.c.b.s;
import e.b.b.a.c.b.s0;
import e.b.b.a.c.b.t;
import e.b.b.a.c.b.t0;
import e.b.b.a.c.b.u;
import e.b.b.a.c.b.v;
import e.b.b.a.c.b.w;
import e.b.b.a.c.b.x;
import e.b.b.a.e.g;
import e.b.b.a.e.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class a {

    /* renamed from: i  reason: collision with root package name */
    private static a f7883i;
    private p a;

    /* renamed from: b  reason: collision with root package name */
    private p f7884b;

    /* renamed from: c  reason: collision with root package name */
    private p f7885c;

    /* renamed from: d  reason: collision with root package name */
    private r f7886d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f7887e;

    /* renamed from: f  reason: collision with root package name */
    private final e.b.c.a f7888f;

    /* renamed from: g  reason: collision with root package name */
    private final ReadWriteLock f7889g = new ReentrantReadWriteLock(true);

    /* renamed from: h  reason: collision with root package name */
    private final e.b.c.d.a f7890h;

    private a(Context context, p pVar, p pVar2, p pVar3, r rVar) {
        this.f7887e = context;
        this.f7886d = rVar == null ? new r() : rVar;
        this.f7886d.a(b(this.f7887e));
        this.a = pVar;
        this.f7884b = pVar2;
        this.f7885c = pVar3;
        this.f7888f = e.b.c.a.a(this.f7887e);
        this.f7890h = d(this.f7887e);
    }

    private static p a(s sVar) {
        if (sVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        v[] vVarArr = sVar.f7074c;
        for (v vVar : vVarArr) {
            String str = vVar.f7091c;
            HashMap hashMap2 = new HashMap();
            t[] tVarArr = vVar.f7092d;
            for (t tVar : tVarArr) {
                hashMap2.put(tVar.f7083c, tVar.f7084d);
            }
            hashMap.put(str, hashMap2);
        }
        byte[][] bArr = sVar.f7076e;
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr2 : bArr) {
            arrayList.add(bArr2);
        }
        return new p(hashMap, sVar.f7075d, arrayList);
    }

    /* JADX INFO: finally extract failed */
    private final g<Void> a(long j2, e1 e1Var) {
        h hVar = new h();
        this.f7889g.readLock().lock();
        try {
            s0 s0Var = new s0();
            s0Var.a(j2);
            if (this.f7888f != null) {
                s0Var.a(this.f7888f.c().a());
            }
            if (this.f7886d.b()) {
                s0Var.a("_rcn_developer", "true");
            }
            s0Var.a(10300);
            int i2 = Integer.MAX_VALUE;
            if (!(this.f7884b == null || this.f7884b.a() == -1)) {
                long convert = TimeUnit.SECONDS.convert(System.currentTimeMillis() - this.f7884b.a(), TimeUnit.MILLISECONDS);
                s0Var.c(convert < 2147483647L ? (int) convert : Integer.MAX_VALUE);
            }
            if (!(this.a == null || this.a.a() == -1)) {
                long convert2 = TimeUnit.SECONDS.convert(System.currentTimeMillis() - this.a.a(), TimeUnit.MILLISECONDS);
                if (convert2 < 2147483647L) {
                    i2 = (int) convert2;
                }
                s0Var.b(i2);
            }
            n0.f7059d.a(e1Var.a(), s0Var.a()).a(new f(this, hVar));
            this.f7889g.readLock().unlock();
            return hVar.a();
        } catch (Throwable th) {
            this.f7889g.readLock().unlock();
            throw th;
        }
    }

    private static a a(Context context) {
        a aVar;
        r rVar;
        p pVar;
        p pVar2;
        synchronized (a.class) {
            if (f7883i == null) {
                w c2 = c(context);
                r rVar2 = null;
                p pVar3 = null;
                if (c2 == null) {
                    if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                        Log.d("FirebaseRemoteConfig", "No persisted config was found. Initializing from scratch.");
                    }
                    pVar2 = null;
                    pVar = null;
                    rVar = null;
                } else {
                    if (Log.isLoggable("FirebaseRemoteConfig", 3)) {
                        Log.d("FirebaseRemoteConfig", "Initializing from persisted config.");
                    }
                    p a2 = a(c2.f7093c);
                    pVar2 = a(c2.f7094d);
                    pVar = a(c2.f7095e);
                    u uVar = c2.f7096f;
                    if (uVar != null) {
                        rVar2 = new r();
                        rVar2.a(uVar.f7085c);
                        rVar2.a(uVar.f7086d);
                    }
                    if (rVar2 != null) {
                        x[] xVarArr = c2.f7097g;
                        HashMap hashMap = new HashMap();
                        if (xVarArr != null) {
                            for (x xVar : xVarArr) {
                                hashMap.put(xVar.f7101e, new m(xVar.f7099c, xVar.f7100d));
                            }
                        }
                        rVar2.a(hashMap);
                    }
                    rVar = rVar2;
                    pVar3 = a2;
                }
                f7883i = new a(context, pVar3, pVar2, pVar, rVar);
            }
            aVar = f7883i;
        }
        return aVar;
    }

    private final void a(h<Void> hVar, Status status) {
        String str;
        if (status == null) {
            str = "Received null IPC status for failure.";
        } else {
            int t = status.t();
            String u = status.u();
            StringBuilder sb = new StringBuilder(String.valueOf(u).length() + 25);
            sb.append("IPC failure: ");
            sb.append(t);
            sb.append(":");
            sb.append(u);
            str = sb.toString();
        }
        Log.w("FirebaseRemoteConfig", str);
        this.f7889g.writeLock().lock();
        try {
            this.f7886d.a(1);
            hVar.a(new c());
            c();
        } finally {
            this.f7889g.writeLock().unlock();
        }
    }

    private static void a(Runnable runnable) {
        AsyncTask.SERIAL_EXECUTOR.execute(runnable);
    }

    private final long b(Context context) {
        try {
            return c.b(this.f7887e).b(context.getPackageName(), 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException unused) {
            String packageName = context.getPackageName();
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 25);
            sb.append("Package [");
            sb.append(packageName);
            sb.append("] was not found!");
            Log.e("FirebaseRemoteConfig", sb.toString());
            return 0;
        }
    }

    public static a b() {
        return a(e.b.c.a.e().a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053 A[SYNTHETIC, Splitter:B:29:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006c A[SYNTHETIC, Splitter:B:40:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0077 A[SYNTHETIC, Splitter:B:46:0x0077] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static e.b.b.a.c.b.w c(android.content.Context r9) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.c.g.a.c(android.content.Context):e.b.b.a.c.b.w");
    }

    private final void c() {
        this.f7889g.readLock().lock();
        try {
            a(new o(this.f7887e, this.a, this.f7884b, this.f7885c, this.f7886d));
        } finally {
            this.f7889g.readLock().unlock();
        }
    }

    private static e.b.c.d.a d(Context context) {
        try {
            return new e.b.c.d.a(context, "frc", 1);
        } catch (NoClassDefFoundError unused) {
            Log.w("FirebaseRemoteConfig", "Unable to use ABT: Analytics library is missing.");
            return null;
        }
    }

    public g<Void> a(long j2) {
        return a(j2, new e1(this.f7887e));
    }

    public String a(String str) {
        return a(str, "configns:firebase");
    }

    public String a(String str, String str2) {
        String str3 = "";
        if (str2 == null) {
            return str3;
        }
        this.f7889g.readLock().lock();
        try {
            if (this.f7884b != null && this.f7884b.a(str, str2)) {
                str3 = new String(this.f7884b.b(str, str2), q.a);
            } else if (this.f7885c != null && this.f7885c.a(str, str2)) {
                str3 = new String(this.f7885c.b(str, str2), q.a);
            }
            return str3;
        } finally {
            this.f7889g.readLock().unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(h<Void> hVar, t0 t0Var) {
        Status m2;
        if (t0Var == null || t0Var.m() == null) {
            a(hVar, (Status) null);
            return;
        }
        int t = t0Var.m().t();
        this.f7889g.writeLock().lock();
        if (t != -6508) {
            if (t != 6507) {
                if (t != -6506) {
                    if (t != -6505) {
                        switch (t) {
                            case 6500:
                            case 6501:
                            case 6503:
                            case 6504:
                                m2 = t0Var.m();
                                a(hVar, m2);
                                break;
                            case 6502:
                                break;
                            default:
                                try {
                                    if (t0Var.m().w()) {
                                        StringBuilder sb = new StringBuilder(45);
                                        sb.append("Unknown (successful) status code: ");
                                        sb.append(t);
                                        Log.w("FirebaseRemoteConfig", sb.toString());
                                    }
                                    m2 = t0Var.m();
                                    a(hVar, m2);
                                    break;
                                } catch (Throwable th) {
                                    this.f7889g.writeLock().unlock();
                                    throw th;
                                }
                        }
                        this.f7889g.writeLock().unlock();
                    }
                    Map<String, Set<String>> l2 = t0Var.l();
                    HashMap hashMap = new HashMap();
                    for (String str : l2.keySet()) {
                        HashMap hashMap2 = new HashMap();
                        for (String str2 : l2.get(str)) {
                            hashMap2.put(str2, t0Var.a(str2, null, str));
                        }
                        hashMap.put(str, hashMap2);
                    }
                    this.a = new p(hashMap, System.currentTimeMillis(), t0Var.o());
                    this.f7886d.a(-1);
                    hVar.a((Void) null);
                    c();
                    this.f7889g.writeLock().unlock();
                }
            }
            this.f7886d.a(2);
            hVar.a(new d(t0Var.n()));
            c();
            this.f7889g.writeLock().unlock();
        }
        this.f7886d.a(-1);
        if (this.a != null && !this.a.d()) {
            Map<String, Set<String>> l3 = t0Var.l();
            HashMap hashMap3 = new HashMap();
            for (String str3 : l3.keySet()) {
                HashMap hashMap4 = new HashMap();
                for (String str4 : l3.get(str3)) {
                    hashMap4.put(str4, t0Var.a(str4, null, str3));
                }
                hashMap3.put(str3, hashMap4);
            }
            this.a = new p(hashMap3, this.a.a(), t0Var.o());
        }
        hVar.a((Void) null);
        c();
        this.f7889g.writeLock().unlock();
    }

    public boolean a() {
        this.f7889g.writeLock().lock();
        try {
            if (this.a == null || (this.f7884b != null && this.f7884b.a() >= this.a.a())) {
                return false;
            }
            long a2 = this.a.a();
            this.f7884b = this.a;
            this.f7884b.a(System.currentTimeMillis());
            this.a = new p(null, a2, null);
            a(new n(this.f7890h, this.f7884b.b()));
            c();
            this.f7889g.writeLock().unlock();
            return true;
        } finally {
            this.f7889g.writeLock().unlock();
        }
    }
}
