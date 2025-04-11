package e.b.b.a.c.e;

import android.os.RemoteException;

/* access modifiers changed from: package-private */
public final class e4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ s f7232b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ a4 f7233c;

    e4(a4 a4Var, s sVar) {
        this.f7233c = a4Var;
        this.f7232b = sVar;
    }

    public final void run() {
        r0 d2 = a4.d(this.f7233c);
        if (d2 == null) {
            this.f7233c.a().y().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            d2.d(this.f7232b);
            this.f7233c.a(d2, null, this.f7232b);
            a4.e(this.f7233c);
        } catch (RemoteException e2) {
            this.f7233c.a().y().a("Failed to send app launch to the service", e2);
        }
    }
}
