package e.b.b.a.c.e;

import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class o3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7480b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ c3 f7481c;

    o3(c3 c3Var, AtomicReference atomicReference) {
        this.f7481c = c3Var;
        this.f7480b = atomicReference;
    }

    public final void run() {
        synchronized (this.f7480b) {
            try {
                AtomicReference atomicReference = this.f7480b;
                y r = this.f7481c.r();
                atomicReference.set(Long.valueOf(r.a(r.i().z(), p0.L)));
                this.f7480b.notify();
            } catch (Throwable th) {
                this.f7480b.notify();
                throw th;
            }
        }
    }
}
