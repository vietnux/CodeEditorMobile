package e.b.b.a.c.e;

import com.google.android.gms.common.internal.y;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* access modifiers changed from: package-private */
public final class b2<V> extends FutureTask<V> implements Comparable<b2> {

    /* renamed from: b  reason: collision with root package name */
    private final long f7177b = z1.f7725m.getAndIncrement();

    /* renamed from: c  reason: collision with root package name */
    final boolean f7178c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7179d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ z1 f7180e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    b2(z1 z1Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.f7180e = z1Var;
        y.a((Object) str);
        this.f7179d = str;
        this.f7178c = false;
        if (this.f7177b == Long.MAX_VALUE) {
            z1Var.a().y().a("Tasks index overflow");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    b2(z1 z1Var, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.f7180e = z1Var;
        y.a((Object) str);
        this.f7179d = str;
        this.f7178c = z;
        if (this.f7177b == Long.MAX_VALUE) {
            z1Var.a().y().a("Tasks index overflow");
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(b2 b2Var) {
        b2 b2Var2 = b2Var;
        boolean z = this.f7178c;
        if (z != b2Var2.f7178c) {
            return z ? -1 : 1;
        }
        long j2 = this.f7177b;
        long j3 = b2Var2.f7177b;
        if (j2 < j3) {
            return -1;
        }
        if (j2 > j3) {
            return 1;
        }
        this.f7180e.a().z().a("Two tasks share the same index. index", Long.valueOf(this.f7177b));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f7180e.a().y().a(this.f7179d, th);
        super.setException(th);
    }
}
