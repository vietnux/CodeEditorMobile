package e.b.b.a.c.e;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class d4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7215b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ s f7216c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ a4 f7217d;

    d4(a4 a4Var, AtomicReference atomicReference, s sVar) {
        this.f7217d = a4Var;
        this.f7215b = atomicReference;
        this.f7216c = sVar;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f7215b) {
            try {
                r0 d2 = a4.d(this.f7217d);
                if (d2 == null) {
                    this.f7217d.a().y().a("Failed to get app instance id");
                    this.f7215b.notify();
                    return;
                }
                this.f7215b.set(d2.b(this.f7216c));
                String str = (String) this.f7215b.get();
                if (str != null) {
                    this.f7217d.h().a(str);
                    this.f7217d.q().f7382l.a(str);
                }
                a4.e(this.f7217d);
                atomicReference = this.f7215b;
                atomicReference.notify();
            } catch (RemoteException e2) {
                this.f7217d.a().y().a("Failed to get app instance id", e2);
                atomicReference = this.f7215b;
            } catch (Throwable th) {
                this.f7215b.notify();
                throw th;
            }
        }
    }
}
