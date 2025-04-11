package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.k;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.c;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.ads.n.i;
import com.google.android.gms.common.internal.y;

@k2
public final class qj0 implements c, d, e {
    private final xi0 a;

    /* renamed from: b  reason: collision with root package name */
    private f f5346b;

    /* renamed from: c  reason: collision with root package name */
    private m f5347c;

    /* renamed from: d  reason: collision with root package name */
    private i f5348d;

    public qj0(xi0 xi0) {
        this.a = xi0;
    }

    private static void a(MediationNativeAdapter mediationNativeAdapter, m mVar, f fVar) {
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            k kVar = new k();
            kVar.a(new nj0());
            if (mVar != null && mVar.o()) {
                mVar.a(kVar);
            }
            if (fVar != null && fVar.f()) {
                fVar.a(kVar);
            }
        }
    }

    public final f a() {
        return this.f5346b;
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void a(MediationBannerAdapter mediationBannerAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAdClosed.");
        try {
            this.a.X();
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void a(MediationBannerAdapter mediationBannerAdapter, int i2) {
        y.a("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i2);
        qc.b(sb.toString());
        try {
            this.a.c(i2);
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void a(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAppEvent.");
        try {
            this.a.a(str, str2);
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void a(MediationInterstitialAdapter mediationInterstitialAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAdLeftApplication.");
        try {
            this.a.j0();
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void a(MediationInterstitialAdapter mediationInterstitialAdapter, int i2) {
        y.a("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i2);
        sb.append(".");
        qc.b(sb.toString());
        try {
            this.a.c(i2);
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void a(MediationNativeAdapter mediationNativeAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAdOpened.");
        try {
            this.a.f0();
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void a(MediationNativeAdapter mediationNativeAdapter, int i2) {
        y.a("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i2);
        sb.append(".");
        qc.b(sb.toString());
        try {
            this.a.c(i2);
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void a(MediationNativeAdapter mediationNativeAdapter, f fVar) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAdLoaded.");
        this.f5346b = fVar;
        this.f5347c = null;
        a(mediationNativeAdapter, this.f5347c, this.f5346b);
        try {
            this.a.n0();
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void a(MediationNativeAdapter mediationNativeAdapter, m mVar) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAdLoaded.");
        this.f5347c = mVar;
        this.f5346b = null;
        a(mediationNativeAdapter, this.f5347c, this.f5346b);
        try {
            this.a.n0();
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void a(MediationNativeAdapter mediationNativeAdapter, i iVar) {
        y.a("#008 Must be called on the main UI thread.");
        String valueOf = String.valueOf(iVar.n());
        qc.b(valueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(valueOf) : new String("Adapter called onAdLoaded with template id "));
        this.f5348d = iVar;
        try {
            this.a.n0();
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void a(MediationNativeAdapter mediationNativeAdapter, i iVar, String str) {
        if (iVar instanceof wb0) {
            try {
                this.a.a(((wb0) iVar).a(), str);
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        } else {
            qc.d("Unexpected native custom template ad type.");
        }
    }

    public final m b() {
        return this.f5347c;
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void b(MediationBannerAdapter mediationBannerAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAdClicked.");
        try {
            this.a.d();
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void b(MediationInterstitialAdapter mediationInterstitialAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAdLoaded.");
        try {
            this.a.n0();
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void b(MediationNativeAdapter mediationNativeAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAdLeftApplication.");
        try {
            this.a.j0();
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    public final i c() {
        return this.f5348d;
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void c(MediationBannerAdapter mediationBannerAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAdLoaded.");
        try {
            this.a.n0();
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void c(MediationInterstitialAdapter mediationInterstitialAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAdClosed.");
        try {
            this.a.X();
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void c(MediationNativeAdapter mediationNativeAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAdClosed.");
        try {
            this.a.X();
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void d(MediationBannerAdapter mediationBannerAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAdLeftApplication.");
        try {
            this.a.j0();
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void d(MediationInterstitialAdapter mediationInterstitialAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAdClicked.");
        try {
            this.a.d();
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void d(MediationNativeAdapter mediationNativeAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        f fVar = this.f5346b;
        m mVar = this.f5347c;
        if (this.f5348d == null) {
            if (fVar == null && mVar == null) {
                qc.d("#007 Could not call remote method.", null);
                return;
            } else if (mVar != null && !mVar.i()) {
                qc.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            } else if (fVar != null && !fVar.c()) {
                qc.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        qc.b("Adapter called onAdClicked.");
        try {
            this.a.d();
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void e(MediationBannerAdapter mediationBannerAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAdOpened.");
        try {
            this.a.f0();
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void e(MediationInterstitialAdapter mediationInterstitialAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        qc.b("Adapter called onAdOpened.");
        try {
            this.a.f0();
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void e(MediationNativeAdapter mediationNativeAdapter) {
        y.a("#008 Must be called on the main UI thread.");
        f fVar = this.f5346b;
        m mVar = this.f5347c;
        if (this.f5348d == null) {
            if (fVar == null && mVar == null) {
                qc.d("#007 Could not call remote method.", null);
                return;
            } else if (mVar != null && !mVar.j()) {
                qc.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            } else if (fVar != null && !fVar.d()) {
                qc.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        qc.b("Adapter called onAdImpression.");
        try {
            this.a.A0();
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }
}
