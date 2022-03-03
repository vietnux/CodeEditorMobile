package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.b;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import com.google.android.gms.ads.s;
import e.b.a.c;
import e.b.b.a.b.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@k2
public final class uj0<NETWORK_EXTRAS extends f, SERVER_PARAMETERS extends e> extends vi0 {

    /* renamed from: b  reason: collision with root package name */
    private final b<NETWORK_EXTRAS, SERVER_PARAMETERS> f5753b;

    /* renamed from: c  reason: collision with root package name */
    private final NETWORK_EXTRAS f5754c;

    public uj0(b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar, NETWORK_EXTRAS network_extras) {
        this.f5753b = bVar;
        this.f5754c = network_extras;
    }

    private final SERVER_PARAMETERS a(String str, int i2, String str2) {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (Throwable th) {
                qc.b("", th);
                throw new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class<SERVER_PARAMETERS> serverParametersType = this.f5753b.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS newInstance = serverParametersType.newInstance();
        newInstance.a(hashMap);
        return newInstance;
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
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final dj0 H0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final boolean J0() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final hj0 Z0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(j40 j40, String str) {
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(j40 j40, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(a aVar, j40 j40, String str, k7 k7Var, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(a aVar, j40 j40, String str, xi0 xi0) {
        a(aVar, j40, str, (String) null, xi0);
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(a aVar, j40 j40, String str, String str2, xi0 xi0) {
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f5753b;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            qc.d(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        qc.b("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f5753b).requestInterstitialAd(new vj0(xi0), (Activity) e.b.b.a.b.b.y(aVar), a(str, j40.f4680h, str2), zj0.a(j40, c(j40)), this.f5754c);
        } catch (Throwable th) {
            qc.b("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(a aVar, j40 j40, String str, String str2, xi0 xi0, na0 na0, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(a aVar, k7 k7Var, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(a aVar, n40 n40, j40 j40, String str, xi0 xi0) {
        a(aVar, n40, j40, str, null, xi0);
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(a aVar, n40 n40, j40 j40, String str, String str2, xi0 xi0) {
        c cVar;
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f5753b;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            qc.d(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        qc.b("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f5753b;
            vj0 vj0 = new vj0(xi0);
            Activity activity = (Activity) e.b.b.a.b.b.y(aVar);
            SERVER_PARAMETERS a = a(str, j40.f4680h, str2);
            int i2 = 0;
            c[] cVarArr = {c.f7007b, c.f7008c, c.f7009d, c.f7010e, c.f7011f, c.f7012g};
            while (true) {
                if (i2 < 6) {
                    if (cVarArr[i2].b() == n40.f5050f && cVarArr[i2].a() == n40.f5047c) {
                        cVar = cVarArr[i2];
                        break;
                    }
                    i2++;
                } else {
                    cVar = new c(s.a(n40.f5050f, n40.f5047c, n40.f5046b));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(vj0, activity, a, cVar, zj0.a(j40, c(j40)), this.f5754c);
        } catch (Throwable th) {
            qc.b("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void a(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final tb0 a1() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void destroy() {
        try {
            this.f5753b.destroy();
        } catch (Throwable th) {
            qc.b("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final o60 getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final a getView() {
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f5753b;
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
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void l(a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final kj0 q1() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void showInterstitial() {
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f5753b;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            qc.d(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        qc.b("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f5753b).showInterstitial();
        } catch (Throwable th) {
            qc.b("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void showVideo() {
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final Bundle u1() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final void y() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.ui0
    public final Bundle zzmq() {
        return new Bundle();
    }
}
