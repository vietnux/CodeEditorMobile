package e.b.b.a.c.e;

import android.os.RemoteException;
import android.text.TextUtils;

/* access modifiers changed from: package-private */
public final class i4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f7320b = true;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f7321c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ n0 f7322d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ s f7323e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f7324f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ a4 f7325g;

    i4(a4 a4Var, boolean z, boolean z2, n0 n0Var, s sVar, String str) {
        this.f7325g = a4Var;
        this.f7321c = z2;
        this.f7322d = n0Var;
        this.f7323e = sVar;
        this.f7324f = str;
    }

    public final void run() {
        r0 d2 = a4.d(this.f7325g);
        if (d2 == null) {
            this.f7325g.a().y().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f7320b) {
            this.f7325g.a(d2, this.f7321c ? null : this.f7322d, this.f7323e);
        } else {
            try {
                if (TextUtils.isEmpty(this.f7324f)) {
                    d2.a(this.f7322d, this.f7323e);
                } else {
                    d2.a(this.f7322d, this.f7324f, this.f7325g.a().G());
                }
            } catch (RemoteException e2) {
                this.f7325g.a().y().a("Failed to send event to the service", e2);
            }
        }
        a4.e(this.f7325g);
    }
}
