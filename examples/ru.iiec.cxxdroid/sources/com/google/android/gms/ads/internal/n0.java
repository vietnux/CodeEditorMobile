package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.ads.j40;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.u9;
import java.lang.ref.WeakReference;

@k2
public final class n0 {
    private final p0 a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f3247b;

    /* renamed from: c  reason: collision with root package name */
    private j40 f3248c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3249d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3250e;

    /* renamed from: f  reason: collision with root package name */
    private long f3251f;

    public n0(a aVar) {
        this(aVar, new p0(u9.f5718h));
    }

    private n0(a aVar, p0 p0Var) {
        this.f3249d = false;
        this.f3250e = false;
        this.f3251f = 0;
        this.a = p0Var;
        this.f3247b = new o0(this, new WeakReference(aVar));
    }

    public final void a() {
        this.f3249d = false;
        this.a.a(this.f3247b);
    }

    public final void a(j40 j40) {
        this.f3248c = j40;
    }

    public final void a(j40 j40, long j2) {
        if (this.f3249d) {
            qc.d("An ad refresh is already scheduled.");
            return;
        }
        this.f3248c = j40;
        this.f3249d = true;
        this.f3251f = j2;
        if (!this.f3250e) {
            StringBuilder sb = new StringBuilder(65);
            sb.append("Scheduling ad refresh ");
            sb.append(j2);
            sb.append(" milliseconds from now.");
            qc.c(sb.toString());
            this.a.a(this.f3247b, j2);
        }
    }

    public final void b() {
        this.f3250e = true;
        if (this.f3249d) {
            this.a.a(this.f3247b);
        }
    }

    public final void b(j40 j40) {
        a(j40, 60000);
    }

    public final void c() {
        this.f3250e = false;
        if (this.f3249d) {
            this.f3249d = false;
            a(this.f3248c, this.f3251f);
        }
    }

    public final void d() {
        Bundle bundle;
        this.f3250e = false;
        this.f3249d = false;
        j40 j40 = this.f3248c;
        if (!(j40 == null || (bundle = j40.f4676d) == null)) {
            bundle.remove("_ad");
        }
        a(this.f3248c, 0);
    }

    public final boolean e() {
        return this.f3249d;
    }
}
