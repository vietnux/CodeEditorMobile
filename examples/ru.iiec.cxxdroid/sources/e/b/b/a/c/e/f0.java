package e.b.b.a.c.e;

import android.os.Handler;
import com.google.android.gms.common.internal.y;

/* access modifiers changed from: package-private */
public abstract class f0 {

    /* renamed from: d  reason: collision with root package name */
    private static volatile Handler f7244d;
    private final a3 a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f7245b;

    /* renamed from: c  reason: collision with root package name */
    private volatile long f7246c;

    f0(a3 a3Var) {
        y.a(a3Var);
        this.a = a3Var;
        this.f7245b = new g0(this, a3Var);
    }

    private final Handler d() {
        Handler handler;
        if (f7244d != null) {
            return f7244d;
        }
        synchronized (f0.class) {
            if (f7244d == null) {
                f7244d = new Handler(this.a.getContext().getMainLooper());
            }
            handler = f7244d;
        }
        return handler;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f7246c = 0;
        d().removeCallbacks(this.f7245b);
    }

    public final void a(long j2) {
        a();
        if (j2 >= 0) {
            this.f7246c = this.a.b().a();
            if (!d().postDelayed(this.f7245b, j2)) {
                this.a.a().y().a("Failed to schedule delayed post. time", Long.valueOf(j2));
            }
        }
    }

    public abstract void b();

    public final boolean c() {
        return this.f7246c != 0;
    }
}
