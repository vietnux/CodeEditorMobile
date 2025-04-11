package e.b.b.a.c.e;

import android.os.RemoteException;

final class c4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ s f7201b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ a4 f7202c;

    c4(a4 a4Var, s sVar) {
        this.f7202c = a4Var;
        this.f7201b = sVar;
    }

    public final void run() {
        r0 d2 = a4.d(this.f7202c);
        if (d2 == null) {
            this.f7202c.a().y().a("Failed to reset data on the service; null service");
            return;
        }
        try {
            d2.a(this.f7201b);
        } catch (RemoteException e2) {
            this.f7202c.a().y().a("Failed to reset data on the service", e2);
        }
        a4.e(this.f7202c);
    }
}
