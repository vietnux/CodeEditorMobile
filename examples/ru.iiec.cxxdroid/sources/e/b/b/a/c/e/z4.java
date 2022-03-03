package e.b.b.a.c.e;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public final class z4 extends z2 {

    /* renamed from: c  reason: collision with root package name */
    private Handler f7739c;

    /* renamed from: d  reason: collision with root package name */
    private long f7740d = b().b();

    /* renamed from: e  reason: collision with root package name */
    private final f0 f7741e = new a5(this, this.a);

    /* renamed from: f  reason: collision with root package name */
    private final f0 f7742f = new b5(this, this.a);

    z4(d2 d2Var) {
        super(d2Var);
    }

    /* access modifiers changed from: private */
    public final void A() {
        d();
        a(false);
        g().a(b().b());
    }

    /* access modifiers changed from: private */
    public final void a(long j2) {
        f0 f0Var;
        long j3;
        d();
        z();
        this.f7741e.a();
        this.f7742f.a();
        a().F().a("Activity resumed, time", Long.valueOf(j2));
        this.f7740d = j2;
        if (b().a() - q().t.a() > q().v.a()) {
            q().u.a(true);
            q().w.a(0);
        }
        if (q().u.a()) {
            f0Var = this.f7741e;
            j3 = q().s.a();
        } else {
            f0Var = this.f7742f;
            j3 = 3600000;
        }
        f0Var.a(Math.max(0L, j3 - q().w.a()));
    }

    /* access modifiers changed from: private */
    public final void b(long j2) {
        d();
        z();
        this.f7741e.a();
        this.f7742f.a();
        a().F().a("Activity paused, time", Long.valueOf(j2));
        if (this.f7740d != 0) {
            q().w.a(q().w.a() + (j2 - this.f7740d));
        }
    }

    private final void z() {
        synchronized (this) {
            if (this.f7739c == null) {
                this.f7739c = new Handler(Looper.getMainLooper());
            }
        }
    }

    public final boolean a(boolean z) {
        d();
        t();
        long b2 = b().b();
        q().v.a(b().a());
        long j2 = b2 - this.f7740d;
        if (z || j2 >= 1000) {
            q().w.a(j2);
            a().F().a("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            x3.a(l().y(), bundle, true);
            h().b("auto", "_e", bundle);
            this.f7740d = b2;
            this.f7742f.a();
            this.f7742f.a(Math.max(0L, 3600000 - q().w.a()));
            return true;
        }
        a().F().a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.z2
    public final boolean u() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void y() {
        this.f7741e.a();
        this.f7742f.a();
        this.f7740d = 0;
    }
}
