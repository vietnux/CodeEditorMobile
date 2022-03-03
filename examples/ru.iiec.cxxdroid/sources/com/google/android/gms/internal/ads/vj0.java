package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.c;
import com.google.ads.mediation.d;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import e.b.a.a;

@k2
public final class vj0<NETWORK_EXTRAS extends f, SERVER_PARAMETERS extends e> implements c, d {
    private final xi0 a;

    public vj0(xi0 xi0) {
        this.a = xi0;
    }

    @Override // com.google.ads.mediation.c
    public final void a(MediationBannerAdapter<?, ?> mediationBannerAdapter, a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(valueOf);
        qc.b(sb.toString());
        a50.b();
        if (!fc.b()) {
            qc.d("#008 Must be called on the main UI thread.", null);
            fc.a.post(new wj0(this, aVar));
            return;
        }
        try {
            this.a.c(zj0.a(aVar));
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.ads.mediation.d
    public final void a(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        qc.b(sb.toString());
        a50.b();
        if (!fc.b()) {
            qc.d("#008 Must be called on the main UI thread.", null);
            fc.a.post(new yj0(this, aVar));
            return;
        }
        try {
            this.a.c(zj0.a(aVar));
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }
}
