package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.k;
import com.google.android.gms.ads.mediation.l;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.ads.mediation.n;
import com.google.android.gms.ads.n.i;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.s;
import e.b.b.a.b.a;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@k2
public final class pj0 extends vi0 {

    /* renamed from: b  reason: collision with root package name */
    private final b f5251b;

    /* renamed from: c  reason: collision with root package name */
    private qj0 f5252c;

    public pj0(b bVar) {
        this.f5251b = bVar;
    }

    private final Bundle a(String str, j40 j40, String str2) {
        Bundle bundle;
        String valueOf = String.valueOf(str);
        qc.d(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle2 = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                bundle = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            } else {
                bundle = bundle2;
            }
            if (this.f5251b instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (j40 != null) {
                    bundle.putInt("tagForChildDirectedTreatment", j40.f4680h);
                }
            }
            return bundle;
        } catch (Throwable th) {
            qc.b("", th);
            throw new RemoteException();
        }
    }

    private static boolean c(j40 j40) {
        if (j40.f4679g) {
            return true;
        }
        a50.b();
        return fc.a();
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void E() {
        try {
            this.f5251b.onResume();
        } catch (Throwable th) {
            qc.b("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final dj0 H0() {
        f a = this.f5252c.a();
        if (a instanceof g) {
            return new rj0((g) a);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final boolean J0() {
        return this.f5251b instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final hj0 Z0() {
        f a = this.f5252c.a();
        if (a instanceof h) {
            return new sj0((h) a);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(j40 j40, String str) {
        a(j40, str, (String) null);
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(j40 j40, String str, String str2) {
        b bVar = this.f5251b;
        if (!(bVar instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            qc.d(valueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        qc.b("Requesting rewarded video ad from adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f5251b;
            Bundle bundle = null;
            oj0 oj0 = new oj0(j40.f4675c == -1 ? null : new Date(j40.f4675c), j40.f4677e, j40.f4678f != null ? new HashSet(j40.f4678f) : null, j40.f4684l, c(j40), j40.f4680h, j40.s);
            if (j40.n != null) {
                bundle = j40.n.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
            }
            mediationRewardedVideoAdAdapter.loadAd(oj0, a(str, j40, str2), bundle);
        } catch (Throwable th) {
            qc.b("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(a aVar, j40 j40, String str, k7 k7Var, String str2) {
        Bundle bundle;
        oj0 oj0;
        b bVar = this.f5251b;
        if (!(bVar instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            qc.d(valueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        qc.b("Initialize rewarded video adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f5251b;
            Bundle a = a(str2, j40, (String) null);
            if (j40 != null) {
                oj0 oj02 = new oj0(j40.f4675c == -1 ? null : new Date(j40.f4675c), j40.f4677e, j40.f4678f != null ? new HashSet(j40.f4678f) : null, j40.f4684l, c(j40), j40.f4680h, j40.s);
                bundle = j40.n != null ? j40.n.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                oj0 = oj02;
            } else {
                oj0 = null;
                bundle = null;
            }
            mediationRewardedVideoAdAdapter.initialize((Context) e.b.b.a.b.b.y(aVar), oj0, str, new n7(k7Var), a, bundle);
        } catch (Throwable th) {
            qc.b("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(a aVar, j40 j40, String str, xi0 xi0) {
        a(aVar, j40, str, (String) null, xi0);
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(a aVar, j40 j40, String str, String str2, xi0 xi0) {
        b bVar = this.f5251b;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            qc.d(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        qc.b("Requesting interstitial ad from adapter.");
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f5251b;
            Bundle bundle = null;
            oj0 oj0 = new oj0(j40.f4675c == -1 ? null : new Date(j40.f4675c), j40.f4677e, j40.f4678f != null ? new HashSet(j40.f4678f) : null, j40.f4684l, c(j40), j40.f4680h, j40.s);
            if (j40.n != null) {
                bundle = j40.n.getBundle(mediationInterstitialAdapter.getClass().getName());
            }
            mediationInterstitialAdapter.requestInterstitialAd((Context) e.b.b.a.b.b.y(aVar), new qj0(xi0), a(str, j40, str2), oj0, bundle);
        } catch (Throwable th) {
            qc.b("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(a aVar, j40 j40, String str, String str2, xi0 xi0, na0 na0, List<String> list) {
        b bVar = this.f5251b;
        if (!(bVar instanceof MediationNativeAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            qc.d(valueOf.length() != 0 ? "Not a MediationNativeAdapter: ".concat(valueOf) : new String("Not a MediationNativeAdapter: "));
            throw new RemoteException();
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) bVar;
            Bundle bundle = null;
            tj0 tj0 = new tj0(j40.f4675c == -1 ? null : new Date(j40.f4675c), j40.f4677e, j40.f4678f != null ? new HashSet(j40.f4678f) : null, j40.f4684l, c(j40), j40.f4680h, na0, list, j40.s);
            if (j40.n != null) {
                bundle = j40.n.getBundle(mediationNativeAdapter.getClass().getName());
            }
            this.f5252c = new qj0(xi0);
            mediationNativeAdapter.requestNativeAd((Context) e.b.b.a.b.b.y(aVar), this.f5252c, a(str, j40, str2), tj0, bundle);
        } catch (Throwable th) {
            qc.b("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(a aVar, k7 k7Var, List<String> list) {
        b bVar = this.f5251b;
        if (!(bVar instanceof InitializableMediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            qc.d(valueOf.length() != 0 ? "Not an InitializableMediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not an InitializableMediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        qc.b("Initialize rewarded video adapter.");
        try {
            InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.f5251b;
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                arrayList.add(a(str, (j40) null, (String) null));
            }
            initializableMediationRewardedVideoAdAdapter.initialize((Context) e.b.b.a.b.b.y(aVar), new n7(k7Var), arrayList);
        } catch (Throwable th) {
            qc.c("Could not initialize rewarded video adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(a aVar, n40 n40, j40 j40, String str, xi0 xi0) {
        a(aVar, n40, j40, str, null, xi0);
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(a aVar, n40 n40, j40 j40, String str, String str2, xi0 xi0) {
        b bVar = this.f5251b;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            qc.d(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        qc.b("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f5251b;
            Bundle bundle = null;
            oj0 oj0 = new oj0(j40.f4675c == -1 ? null : new Date(j40.f4675c), j40.f4677e, j40.f4678f != null ? new HashSet(j40.f4678f) : null, j40.f4684l, c(j40), j40.f4680h, j40.s);
            if (j40.n != null) {
                bundle = j40.n.getBundle(mediationBannerAdapter.getClass().getName());
            }
            mediationBannerAdapter.requestBannerAd((Context) e.b.b.a.b.b.y(aVar), new qj0(xi0), a(str, j40, str2), s.a(n40.f5050f, n40.f5047c, n40.f5046b), oj0, bundle);
        } catch (Throwable th) {
            qc.b("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(boolean z) {
        b bVar = this.f5251b;
        if (!(bVar instanceof l)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            qc.c(valueOf.length() != 0 ? "Not an OnImmersiveModeUpdatedListener: ".concat(valueOf) : new String("Not an OnImmersiveModeUpdatedListener: "));
            return;
        }
        try {
            ((l) bVar).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            qc.b("", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final tb0 a1() {
        i c2 = this.f5252c.c();
        if (c2 instanceof wb0) {
            return ((wb0) c2).a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void destroy() {
        try {
            this.f5251b.onDestroy();
        } catch (Throwable th) {
            qc.b("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final Bundle getInterstitialAdapterInfo() {
        b bVar = this.f5251b;
        if (bVar instanceof zzatm) {
            return ((zzatm) bVar).getInterstitialAdapterInfo();
        }
        String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
        qc.d(valueOf.length() != 0 ? "Not a v2 MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a v2 MediationInterstitialAdapter: "));
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final o60 getVideoController() {
        b bVar = this.f5251b;
        if (!(bVar instanceof n)) {
            return null;
        }
        try {
            return ((n) bVar).getVideoController();
        } catch (Throwable th) {
            qc.b("", th);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final a getView() {
        b bVar = this.f5251b;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            qc.d(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return e.b.b.a.b.b.a(((MediationBannerAdapter) bVar).getBannerView());
        } catch (Throwable th) {
            qc.b("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final boolean isInitialized() {
        b bVar = this.f5251b;
        if (!(bVar instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            qc.d(valueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        qc.b("Check if adapter is initialized.");
        try {
            return ((MediationRewardedVideoAdAdapter) this.f5251b).isInitialized();
        } catch (Throwable th) {
            qc.b("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void l(a aVar) {
        try {
            ((k) this.f5251b).a((Context) e.b.b.a.b.b.y(aVar));
        } catch (Throwable th) {
            qc.c("Failed", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final kj0 q1() {
        m b2 = this.f5252c.b();
        if (b2 != null) {
            return new bk0(b2);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void showInterstitial() {
        b bVar = this.f5251b;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            qc.d(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        qc.b("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f5251b).showInterstitial();
        } catch (Throwable th) {
            qc.b("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void showVideo() {
        b bVar = this.f5251b;
        if (!(bVar instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            qc.d(valueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        qc.b("Show rewarded video ad from adapter.");
        try {
            ((MediationRewardedVideoAdAdapter) this.f5251b).showVideo();
        } catch (Throwable th) {
            qc.b("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final Bundle u1() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void y() {
        try {
            this.f5251b.onPause();
        } catch (Throwable th) {
            qc.b("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final Bundle zzmq() {
        b bVar = this.f5251b;
        if (bVar instanceof zzatl) {
            return ((zzatl) bVar).zzmq();
        }
        String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
        qc.d(valueOf.length() != 0 ? "Not a v2 MediationBannerAdapter: ".concat(valueOf) : new String("Not a v2 MediationBannerAdapter: "));
        return new Bundle();
    }
}
