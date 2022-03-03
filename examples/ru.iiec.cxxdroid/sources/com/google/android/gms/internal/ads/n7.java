package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.a;
import com.google.android.gms.common.internal.y;
import e.b.b.a.b.b;

@k2
public final class n7 implements a {
    private final k7 a;

    public n7(k7 k7Var) {
        this.a = k7Var;
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void a(Bundle bundle) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAdMetadataChanged.");
        try {
            this.a.a(bundle);
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onVideoCompleted.");
        try {
            this.a.v(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i2) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAdFailedToLoad.");
        try {
            this.a.b(b.a(mediationRewardedVideoAdAdapter), i2);
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, com.google.android.gms.ads.p.a aVar) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onRewarded.");
        if (aVar != null) {
            try {
                this.a.a(b.a(mediationRewardedVideoAdAdapter), new o7(aVar));
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        } else {
            this.a.a(b.a(mediationRewardedVideoAdAdapter), new o7("", 1));
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void b(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAdLeftApplication.");
        try {
            this.a.h(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void c(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onInitializationSucceeded.");
        try {
            this.a.t(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void d(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAdOpened.");
        try {
            this.a.f(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void e(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onVideoStarted.");
        try {
            this.a.u(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void f(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAdLoaded.");
        try {
            this.a.k(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void g(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAdClosed.");
        try {
            this.a.p(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }
}
