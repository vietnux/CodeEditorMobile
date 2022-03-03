package e.b.b.a.c.e;

import com.google.android.gms.common.internal.y;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class n5 implements d0 {
    i6 a;

    /* renamed from: b  reason: collision with root package name */
    List<Long> f7466b;

    /* renamed from: c  reason: collision with root package name */
    List<f6> f7467c;

    /* renamed from: d  reason: collision with root package name */
    private long f7468d;

    private n5(j5 j5Var) {
    }

    /* synthetic */ n5(j5 j5Var, k5 k5Var) {
        this(j5Var);
    }

    private static long a(f6 f6Var) {
        return ((f6Var.f7261e.longValue() / 1000) / 60) / 60;
    }

    @Override // e.b.b.a.c.e.d0
    public final void a(i6 i6Var) {
        y.a(i6Var);
        this.a = i6Var;
    }

    @Override // e.b.b.a.c.e.d0
    public final boolean a(long j2, f6 f6Var) {
        y.a(f6Var);
        if (this.f7467c == null) {
            this.f7467c = new ArrayList();
        }
        if (this.f7466b == null) {
            this.f7466b = new ArrayList();
        }
        if (this.f7467c.size() > 0 && a(this.f7467c.get(0)) != a(f6Var)) {
            return false;
        }
        long d2 = this.f7468d + ((long) f6Var.d());
        if (d2 >= ((long) Math.max(0, p0.f7496k.a().intValue()))) {
            return false;
        }
        this.f7468d = d2;
        this.f7467c.add(f6Var);
        this.f7466b.add(Long.valueOf(j2));
        return this.f7467c.size() < Math.max(1, p0.f7497l.a().intValue());
    }
}
