package e.b.b.a.c.e;

import android.os.RemoteException;

/* access modifiers changed from: package-private */
public final class h4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ s f7304b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ a4 f7305c;

    h4(a4 a4Var, s sVar) {
        this.f7305c = a4Var;
        this.f7304b = sVar;
    }

    public final void run() {
        r0 d2 = a4.d(this.f7305c);
        if (d2 == null) {
            this.f7305c.a().y().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            d2.c(this.f7304b);
            a4.e(this.f7305c);
        } catch (RemoteException e2) {
            this.f7305c.a().y().a("Failed to send measurementEnabled to the service", e2);
        }
    }
}
