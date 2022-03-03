package e.b.b.a.c.e;

import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class n3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7460b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ c3 f7461c;

    n3(c3 c3Var, AtomicReference atomicReference) {
        this.f7461c = c3Var;
        this.f7460b = atomicReference;
    }

    public final void run() {
        synchronized (this.f7460b) {
            try {
                this.f7460b.set(this.f7461c.r().w());
                this.f7460b.notify();
            } catch (Throwable th) {
                this.f7460b.notify();
                throw th;
            }
        }
    }
}
