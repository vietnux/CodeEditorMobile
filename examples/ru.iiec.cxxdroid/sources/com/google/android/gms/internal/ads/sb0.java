package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.k;
import com.google.android.gms.ads.n.c;
import com.google.android.gms.ads.n.h;
import e.b.b.a.b.a;
import java.util.ArrayList;
import java.util.List;

@k2
public final class sb0 extends h {
    private final pb0 a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c.b> f5526b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final bb0 f5527c;

    /* renamed from: d  reason: collision with root package name */
    private final k f5528d = new k();

    public sb0(pb0 pb0) {
        ya0 ya0;
        IBinder iBinder;
        this.a = pb0;
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
                        this.f5526b.add(new bb0(ya0));
                    }
                }
            }
        } catch (RemoteException e2) {
            qc.b("", e2);
        }
        try {
            ya0 z0 = this.a.z0();
            if (z0 != null) {
                bb0 = new bb0(z0);
            }
        } catch (RemoteException e3) {
            qc.b("", e3);
        }
        this.f5527c = bb0;
        try {
            if (this.a.l() != null) {
                new xa0(this.a.l());
            }
        } catch (RemoteException e4) {
            qc.b("", e4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final a a() {
        try {
            return this.a.w();
        } catch (RemoteException e2) {
            qc.b("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.n.h
    public final CharSequence b() {
        try {
            return this.a.z();
        } catch (RemoteException e2) {
            qc.b("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.n.h
    public final CharSequence c() {
        try {
            return this.a.h();
        } catch (RemoteException e2) {
            qc.b("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.n.h
    public final CharSequence d() {
        try {
            return this.a.j();
        } catch (RemoteException e2) {
            qc.b("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.n.h
    public final CharSequence e() {
        try {
            return this.a.g();
        } catch (RemoteException e2) {
            qc.b("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.n.h
    public final List<c.b> f() {
        return this.f5526b;
    }

    @Override // com.google.android.gms.ads.n.h
    public final c.b g() {
        return this.f5527c;
    }

    @Override // com.google.android.gms.ads.n.h
    public final k h() {
        try {
            if (this.a.getVideoController() != null) {
                this.f5528d.a(this.a.getVideoController());
            }
        } catch (RemoteException e2) {
            qc.b("Exception occurred while getting video controller", e2);
        }
        return this.f5528d;
    }
}
