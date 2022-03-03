package e.b.b.a.c.e;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

final class n4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7462b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ s f7463c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f7464d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ a4 f7465e;

    n4(a4 a4Var, AtomicReference atomicReference, s sVar, boolean z) {
        this.f7465e = a4Var;
        this.f7462b = atomicReference;
        this.f7463c = sVar;
        this.f7464d = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f7462b) {
            try {
                r0 d2 = a4.d(this.f7465e);
                if (d2 == null) {
                    this.f7465e.a().y().a("Failed to get user properties");
                    this.f7462b.notify();
                    return;
                }
                this.f7462b.set(d2.a(this.f7463c, this.f7464d));
                a4.e(this.f7465e);
                atomicReference = this.f7462b;
                atomicReference.notify();
            } catch (RemoteException e2) {
                this.f7465e.a().y().a("Failed to get user properties", e2);
                atomicReference = this.f7462b;
            } catch (Throwable th) {
                this.f7462b.notify();
                throw th;
            }
        }
    }
}
