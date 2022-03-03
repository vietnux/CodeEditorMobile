package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.d;
import com.google.android.gms.ads.mediation.customevent.c;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.qc;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter<c, e>, MediationInterstitialAdapter<c, e> {
    private View a;

    /* renamed from: b  reason: collision with root package name */
    private CustomEventBanner f3096b;

    /* renamed from: c  reason: collision with root package name */
    private CustomEventInterstitial f3097c;

    /* access modifiers changed from: package-private */
    public static final class a implements b {
        public a(CustomEventAdapter customEventAdapter, com.google.ads.mediation.c cVar) {
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements c {
        public b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, d dVar) {
        }
    }

    private static <T> T a(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            qc.d(sb.toString());
            return null;
        }
    }

    @Override // com.google.ads.mediation.b
    public final void destroy() {
        CustomEventBanner customEventBanner = this.f3096b;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f3097c;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    @Override // com.google.ads.mediation.b
    public final Class<c> getAdditionalParametersType() {
        return c.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public final View getBannerView() {
        return this.a;
    }

    @Override // com.google.ads.mediation.b
    public final Class<e> getServerParametersType() {
        return e.class;
    }

    public final void requestBannerAd(com.google.ads.mediation.c cVar, Activity activity, e eVar, e.b.a.c cVar2, com.google.ads.mediation.a aVar, c cVar3) {
        this.f3096b = (CustomEventBanner) a(eVar.f3098b);
        if (this.f3096b == null) {
            cVar.a(this, e.b.a.a.INTERNAL_ERROR);
        } else {
            this.f3096b.requestBannerAd(new a(this, cVar), activity, eVar.a, eVar.f3099c, cVar2, aVar, cVar3 == null ? null : cVar3.a(eVar.a));
        }
    }

    public final void requestInterstitialAd(d dVar, Activity activity, e eVar, com.google.ads.mediation.a aVar, c cVar) {
        this.f3097c = (CustomEventInterstitial) a(eVar.f3098b);
        if (this.f3097c == null) {
            dVar.a(this, e.b.a.a.INTERNAL_ERROR);
        } else {
            this.f3097c.requestInterstitialAd(new b(this, this, dVar), activity, eVar.a, eVar.f3099c, aVar, cVar == null ? null : cVar.a(eVar.a));
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        this.f3097c.showInterstitial();
    }
}
