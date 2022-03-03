package e.b.b.a.c.e;

import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class p3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7504b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ c3 f7505c;

    p3(c3 c3Var, AtomicReference atomicReference) {
        this.f7505c = c3Var;
        this.f7504b = atomicReference;
    }

    public final void run() {
        synchronized (this.f7504b) {
            try {
                AtomicReference atomicReference = this.f7504b;
                y r = this.f7505c.r();
                atomicReference.set(Integer.valueOf(r.b(r.i().z(), p0.M)));
                this.f7504b.notify();
            } catch (Throwable th) {
                this.f7504b.notify();
                throw th;
            }
        }
    }
}
