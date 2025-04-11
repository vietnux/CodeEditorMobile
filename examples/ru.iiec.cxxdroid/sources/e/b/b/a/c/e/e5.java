package e.b.b.a.c.e;

import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.e;

/* access modifiers changed from: package-private */
public final class e5 {
    private final e a;

    /* renamed from: b  reason: collision with root package name */
    private long f7234b;

    public e5(e eVar) {
        y.a(eVar);
        this.a = eVar;
    }

    public final void a() {
        this.f7234b = 0;
    }

    public final boolean a(long j2) {
        return this.f7234b == 0 || this.a.b() - this.f7234b >= 3600000;
    }

    public final void b() {
        this.f7234b = this.a.b();
    }
}
