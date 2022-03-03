package e.b.b.a.c.e;

import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class h3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7302b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ c3 f7303c;

    h3(c3 c3Var, AtomicReference atomicReference) {
        this.f7303c = c3Var;
        this.f7302b = atomicReference;
    }

    public final void run() {
        this.f7303c.k().a(this.f7302b);
    }
}
