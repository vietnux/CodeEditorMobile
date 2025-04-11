package e.b.b.a.c.e;

import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.n;
import com.google.android.gms.common.o;
import com.google.android.gms.common.util.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class f2 extends s0 {

    /* renamed from: b  reason: collision with root package name */
    private final j5 f7247b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f7248c;

    /* renamed from: d  reason: collision with root package name */
    private String f7249d;

    public f2(j5 j5Var) {
        this(j5Var, null);
    }

    private f2(j5 j5Var, String str) {
        y.a(j5Var);
        this.f7247b = j5Var;
        this.f7249d = null;
    }

    private final void a(Runnable runnable) {
        y.a(runnable);
        if (!p0.U.a().booleanValue() || !this.f7247b.c().y()) {
            this.f7247b.c().a(runnable);
        } else {
            runnable.run();
        }
    }

    private final void a(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f7248c == null) {
                        if (!"com.google.android.gms".equals(this.f7249d) && !t.a(this.f7247b.getContext(), Binder.getCallingUid())) {
                            if (!o.a(this.f7247b.getContext()).a(Binder.getCallingUid())) {
                                z2 = false;
                                this.f7248c = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f7248c = Boolean.valueOf(z2);
                    }
                    if (this.f7248c.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e2) {
                    this.f7247b.a().y().a("Measurement Service called with invalid calling package. appId", z0.a(str));
                    throw e2;
                }
            }
            if (this.f7249d == null && n.uidHasPackageName(this.f7247b.getContext(), Binder.getCallingUid(), str)) {
                this.f7249d = str;
            }
            if (!str.equals(this.f7249d)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
            }
            return;
        }
        this.f7247b.a().y().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    private final void b(s sVar, boolean z) {
        y.a(sVar);
        a(sVar.f7562b, false);
        this.f7247b.h().d(sVar.f7563c);
    }

    @Override // e.b.b.a.c.e.r0
    public final List<p5> a(s sVar, boolean z) {
        b(sVar, false);
        try {
            List<r5> list = (List) this.f7247b.c().a(new v2(this, sVar)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (r5 r5Var : list) {
                if (z || !s5.j(r5Var.f7547c)) {
                    arrayList.add(new p5(r5Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f7247b.a().y().a("Failed to get user attributes. appId", z0.a(sVar.f7562b), e2);
            return null;
        }
    }

    @Override // e.b.b.a.c.e.r0
    public final List<w> a(String str, String str2, s sVar) {
        b(sVar, false);
        try {
            return (List) this.f7247b.c().a(new n2(this, sVar, str, str2)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.f7247b.a().y().a("Failed to get conditional user properties", e2);
            return Collections.emptyList();
        }
    }

    @Override // e.b.b.a.c.e.r0
    public final List<p5> a(String str, String str2, String str3, boolean z) {
        a(str, true);
        try {
            List<r5> list = (List) this.f7247b.c().a(new m2(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (r5 r5Var : list) {
                if (z || !s5.j(r5Var.f7547c)) {
                    arrayList.add(new p5(r5Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f7247b.a().y().a("Failed to get user attributes. appId", z0.a(str), e2);
            return Collections.emptyList();
        }
    }

    @Override // e.b.b.a.c.e.r0
    public final List<p5> a(String str, String str2, boolean z, s sVar) {
        b(sVar, false);
        try {
            List<r5> list = (List) this.f7247b.c().a(new l2(this, sVar, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (r5 r5Var : list) {
                if (z || !s5.j(r5Var.f7547c)) {
                    arrayList.add(new p5(r5Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f7247b.a().y().a("Failed to get user attributes. appId", z0.a(sVar.f7562b), e2);
            return Collections.emptyList();
        }
    }

    @Override // e.b.b.a.c.e.r0
    public final void a(long j2, String str, String str2, String str3) {
        a(new x2(this, str2, str3, str, j2));
    }

    @Override // e.b.b.a.c.e.r0
    public final void a(n0 n0Var, s sVar) {
        y.a(n0Var);
        b(sVar, false);
        a(new q2(this, n0Var, sVar));
    }

    @Override // e.b.b.a.c.e.r0
    public final void a(n0 n0Var, String str, String str2) {
        y.a(n0Var);
        y.b(str);
        a(str, true);
        a(new r2(this, n0Var, str));
    }

    @Override // e.b.b.a.c.e.r0
    public final void a(p5 p5Var, s sVar) {
        y.a(p5Var);
        b(sVar, false);
        a(p5Var.t() == null ? new t2(this, p5Var, sVar) : new u2(this, p5Var, sVar));
    }

    @Override // e.b.b.a.c.e.r0
    public final void a(s sVar) {
        a(sVar.f7562b, false);
        a(new p2(this, sVar));
    }

    @Override // e.b.b.a.c.e.r0
    public final void a(w wVar) {
        y.a(wVar);
        y.a(wVar.f7637d);
        a(wVar.f7635b, true);
        w wVar2 = new w(wVar);
        a(wVar.f7637d.t() == null ? new j2(this, wVar2) : new k2(this, wVar2));
    }

    @Override // e.b.b.a.c.e.r0
    public final void a(w wVar, s sVar) {
        y.a(wVar);
        y.a(wVar.f7637d);
        b(sVar, false);
        w wVar2 = new w(wVar);
        wVar2.f7635b = sVar.f7562b;
        a(wVar.f7637d.t() == null ? new h2(this, wVar2, sVar) : new i2(this, wVar2, sVar));
    }

    @Override // e.b.b.a.c.e.r0
    public final byte[] a(n0 n0Var, String str) {
        y.b(str);
        y.a(n0Var);
        a(str, true);
        this.f7247b.a().E().a("Log and bundle. event", this.f7247b.g().a(n0Var.f7448b));
        long c2 = this.f7247b.b().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f7247b.c().b(new s2(this, n0Var, str)).get();
            if (bArr == null) {
                this.f7247b.a().y().a("Log and bundle returned null. appId", z0.a(str));
                bArr = new byte[0];
            }
            this.f7247b.a().E().a("Log and bundle processed. event, size, time_ms", this.f7247b.g().a(n0Var.f7448b), Integer.valueOf(bArr.length), Long.valueOf((this.f7247b.b().c() / 1000000) - c2));
            return bArr;
        } catch (InterruptedException | ExecutionException e2) {
            this.f7247b.a().y().a("Failed to log and bundle. appId, event, error", z0.a(str), this.f7247b.g().a(n0Var.f7448b), e2);
            return null;
        }
    }

    @Override // e.b.b.a.c.e.r0
    public final String b(s sVar) {
        b(sVar, false);
        return this.f7247b.d(sVar);
    }

    @Override // e.b.b.a.c.e.r0
    public final List<w> b(String str, String str2, String str3) {
        a(str, true);
        try {
            return (List) this.f7247b.c().a(new o2(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.f7247b.a().y().a("Failed to get conditional user properties", e2);
            return Collections.emptyList();
        }
    }

    @Override // e.b.b.a.c.e.r0
    public final void c(s sVar) {
        b(sVar, false);
        a(new g2(this, sVar));
    }

    @Override // e.b.b.a.c.e.r0
    public final void d(s sVar) {
        b(sVar, false);
        a(new w2(this, sVar));
    }
}
