package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.da0;
import com.google.android.gms.internal.ads.p90;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.r90;
import com.google.android.gms.internal.ads.w90;
import java.util.List;

final class h0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ da0 f3191b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f3192c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ List f3193d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ e0 f3194e;

    h0(e0 e0Var, da0 da0, int i2, List list) {
        this.f3194e = e0Var;
        this.f3191b = da0;
        this.f3192c = i2;
        this.f3193d = list;
    }

    public final void run() {
        try {
            boolean z = false;
            if ((this.f3191b instanceof r90) && this.f3194e.f3125g.u != null) {
                e0 e0Var = this.f3194e;
                if (this.f3192c != this.f3193d.size() - 1) {
                    z = true;
                }
                e0Var.f3123e = z;
                w90 b2 = e0.b(this.f3191b);
                this.f3194e.f3125g.u.a(b2);
                this.f3194e.y(b2.w());
            } else if ((this.f3191b instanceof r90) && this.f3194e.f3125g.t != null) {
                e0 e0Var2 = this.f3194e;
                if (this.f3192c != this.f3193d.size() - 1) {
                    z = true;
                }
                e0Var2.f3123e = z;
                r90 r90 = (r90) this.f3191b;
                this.f3194e.f3125g.t.a(r90);
                this.f3194e.y(r90.w());
            } else if ((this.f3191b instanceof p90) && this.f3194e.f3125g.u != null) {
                e0 e0Var3 = this.f3194e;
                if (this.f3192c != this.f3193d.size() - 1) {
                    z = true;
                }
                e0Var3.f3123e = z;
                w90 b3 = e0.b(this.f3191b);
                this.f3194e.f3125g.u.a(b3);
                this.f3194e.y(b3.w());
            } else if (!(this.f3191b instanceof p90) || this.f3194e.f3125g.s == null) {
                e0 e0Var4 = this.f3194e;
                if (this.f3192c != this.f3193d.size() - 1) {
                    z = true;
                }
                e0Var4.a(3, z);
            } else {
                e0 e0Var5 = this.f3194e;
                if (this.f3192c != this.f3193d.size() - 1) {
                    z = true;
                }
                e0Var5.f3123e = z;
                p90 p90 = (p90) this.f3191b;
                this.f3194e.f3125g.s.a(p90);
                this.f3194e.y(p90.w());
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }
}
