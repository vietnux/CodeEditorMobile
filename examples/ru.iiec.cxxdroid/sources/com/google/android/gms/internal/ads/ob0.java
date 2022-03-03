package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.k;
import com.google.android.gms.ads.n.c;
import com.google.android.gms.ads.n.g;
import e.b.b.a.b.a;
import java.util.ArrayList;
import java.util.List;

@k2
public final class ob0 extends g {
    private final lb0 a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c.b> f5149b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final bb0 f5150c;

    /* renamed from: d  reason: collision with root package name */
    private final k f5151d = new k();

    public ob0(lb0 lb0) {
        ya0 ya0;
        IBinder iBinder;
        this.a = lb0;
        bb0 bb0 = null;
        try {
            List b2 = this.a.b();
            if (b2 != null) {
                for (Object obj : b2) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        ya0 = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        ya0 = queryLocalInterface instanceof ya0 ? (ya0) queryLocalInterface : new ab0(iBinder);
                    }
                    if (ya0 != null) {
                        this.f5149b.add(new bb0(ya0));
                    }
                }
            }
        } catch (RemoteException e2) {
            qc.b("", e2);
        }
        try {
            ya0 B = this.a.B();
            if (B != null) {
                bb0 = new bb0(B);
            }
        } catch (RemoteException e3) {
            qc.b("", e3);
        }
        this.f5150c = bb0;
        try {
            if (this.a.l() != null) {
                new xa0(this.a.l());
            }
        } catch (RemoteException e4) {
            qc.b("", e4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final a a() {
        try {
            return this.a.w();
        } catch (RemoteException e2) {
            qc.b("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.n.g
    public final CharSequence b() {
        try {
            return this.a.h();
        } catch (RemoteException e2) {
            qc.b("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.n.g
    public final CharSequence c() {
        try {
            return this.a.j();
        } catch (RemoteException e2) {
            qc.b("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.n.g
    public final CharSequence d() {
        try {
            return this.a.g();
        } catch (RemoteException e2) {
            qc.b("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.n.g
    public final c.b e() {
        return this.f5150c;
    }

    @Override // com.google.android.gms.ads.n.g
    public final List<c.b> f() {
        return this.f5149b;
    }

    @Override // com.google.android.gms.ads.n.g
    public final CharSequence g() {
        try {
            return this.a.x();
        } catch (RemoteException e2) {
            qc.b("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.n.g
    public final Double h() {
        try {
            double t = this.a.t();
            if (t == -1.0d) {
                return null;
            }
            return Double.valueOf(t);
        } catch (RemoteException e2) {
            qc.b("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.n.g
    public final CharSequence i() {
        try {
            return this.a.A();
        } catch (RemoteException e2) {
            qc.b("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.n.g
    public final k j() {
        try {
            if (this.a.getVideoController() != null) {
                this.f5151d.a(this.a.getVideoController());
            }
        } catch (RemoteException e2) {
            qc.b("Exception occurred while getting video controller", e2);
        }
        return this.f5151d;
    }
}
