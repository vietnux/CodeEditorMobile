package e.b.b.a.c.e;

import android.os.RemoteException;
import android.text.TextUtils;

/* access modifiers changed from: package-private */
public final class j4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f7352b = true;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f7353c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ w f7354d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ s f7355e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ w f7356f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ a4 f7357g;

    j4(a4 a4Var, boolean z, boolean z2, w wVar, s sVar, w wVar2) {
        this.f7357g = a4Var;
        this.f7353c = z2;
        this.f7354d = wVar;
        this.f7355e = sVar;
        this.f7356f = wVar2;
    }

    public final void run() {
        r0 d2 = a4.d(this.f7357g);
        if (d2 == null) {
            this.f7357g.a().y().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f7352b) {
            this.f7357g.a(d2, this.f7353c ? null : this.f7354d, this.f7355e);
        } else {
            try {
                if (TextUtils.isEmpty(this.f7356f.f7635b)) {
                    d2.a(this.f7354d, this.f7355e);
                } else {
                    d2.a(this.f7354d);
                }
            } catch (RemoteException e2) {
                this.f7357g.a().y().a("Failed to send conditional user property to the service", e2);
            }
        }
        a4.e(this.f7357g);
    }
}
