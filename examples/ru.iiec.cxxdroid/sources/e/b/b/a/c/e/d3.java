package e.b.b.a.c.e;

import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class d3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7213b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ c3 f7214c;

    d3(c3 c3Var, AtomicReference atomicReference) {
        this.f7214c = c3Var;
        this.f7213b = atomicReference;
    }

    public final void run() {
        synchronized (this.f7213b) {
            try {
                this.f7213b.set(Boolean.valueOf(this.f7214c.r().v()));
                this.f7213b.notify();
            } catch (Throwable th) {
                this.f7213b.notify();
                throw th;
            }
        }
    }
}
