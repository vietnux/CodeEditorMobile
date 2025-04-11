package e.b.b.a.c.e;

import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class f3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7250b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f7251c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ c3 f7252d;

    f3(c3 c3Var, AtomicReference atomicReference, boolean z) {
        this.f7252d = c3Var;
        this.f7250b = atomicReference;
        this.f7251c = z;
    }

    public final void run() {
        this.f7252d.k().a(this.f7250b, this.f7251c);
    }
}
