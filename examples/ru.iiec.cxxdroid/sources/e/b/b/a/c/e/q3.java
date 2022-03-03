package e.b.b.a.c.e;

import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class q3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7523b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ c3 f7524c;

    q3(c3 c3Var, AtomicReference atomicReference) {
        this.f7524c = c3Var;
        this.f7523b = atomicReference;
    }

    public final void run() {
        synchronized (this.f7523b) {
            try {
                AtomicReference atomicReference = this.f7523b;
                y r = this.f7524c.r();
                atomicReference.set(Double.valueOf(r.c(r.i().z(), p0.N)));
                this.f7523b.notify();
            } catch (Throwable th) {
                this.f7523b.notify();
                throw th;
            }
        }
    }
}
