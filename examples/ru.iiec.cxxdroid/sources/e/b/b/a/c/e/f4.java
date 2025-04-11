package e.b.b.a.c.e;

import android.os.RemoteException;

final class f4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ w3 f7253b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ a4 f7254c;

    f4(a4 a4Var, w3 w3Var) {
        this.f7254c = a4Var;
        this.f7253b = w3Var;
    }

    public final void run() {
        long j2;
        String str;
        String str2;
        String packageName;
        r0 d2 = a4.d(this.f7254c);
        if (d2 == null) {
            this.f7254c.a().y().a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f7253b == null) {
                j2 = 0;
                str = null;
                str2 = null;
                packageName = this.f7254c.getContext().getPackageName();
            } else {
                j2 = this.f7253b.f7656c;
                str = this.f7253b.a;
                str2 = this.f7253b.f7655b;
                packageName = this.f7254c.getContext().getPackageName();
            }
            d2.a(j2, str, str2, packageName);
            a4.e(this.f7254c);
        } catch (RemoteException e2) {
            this.f7254c.a().y().a("Failed to send current screen to the service", e2);
        }
    }
}
