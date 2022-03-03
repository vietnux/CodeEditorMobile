package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.q;
import com.google.android.gms.ads.internal.overlay.s;
import com.google.android.gms.ads.internal.overlay.x;
import com.google.android.gms.ads.internal.overlay.y;
import com.google.android.gms.common.n;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.ads.b0;
import com.google.android.gms.internal.ads.db0;
import com.google.android.gms.internal.ads.e60;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.hb0;
import com.google.android.gms.internal.ads.j60;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.m50;
import com.google.android.gms.internal.ads.n40;
import com.google.android.gms.internal.ads.pa0;
import com.google.android.gms.internal.ads.r;
import com.google.android.gms.internal.ads.r50;
import com.google.android.gms.internal.ads.ra0;
import com.google.android.gms.internal.ads.ri0;
import com.google.android.gms.internal.ads.sc;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.ads.w5;
import e.b.b.a.b.a;
import e.b.b.a.b.b;
import java.util.HashMap;

@Keep
@DynamiteApi
@k2
public class ClientApi extends e60 {
    @Override // com.google.android.gms.internal.ads.d60
    public m50 createAdLoaderBuilder(a aVar, String str, ri0 ri0, int i2) {
        Context context = (Context) b.y(aVar);
        x0.f();
        return new l(context, str, ri0, new sc(n.GOOGLE_PLAY_SERVICES_VERSION_CODE, i2, true, u9.m(context)), u1.a(context));
    }

    @Override // com.google.android.gms.internal.ads.d60
    public r createAdOverlay(a aVar) {
        Activity activity = (Activity) b.y(aVar);
        AdOverlayInfoParcel a = AdOverlayInfoParcel.a(activity.getIntent());
        if (a == null) {
            return new com.google.android.gms.ads.internal.overlay.r(activity);
        }
        int i2 = a.f3265l;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? new com.google.android.gms.ads.internal.overlay.r(activity) : new s(activity, a) : new y(activity) : new x(activity) : new q(activity);
    }

    @Override // com.google.android.gms.internal.ads.d60
    public r50 createBannerAdManager(a aVar, n40 n40, String str, ri0 ri0, int i2) {
        Context context = (Context) b.y(aVar);
        x0.f();
        return new w1(context, n40, str, ri0, new sc(n.GOOGLE_PLAY_SERVICES_VERSION_CODE, i2, true, u9.m(context)), u1.a(context));
    }

    @Override // com.google.android.gms.internal.ads.d60
    public b0 createInAppPurchaseManager(a aVar) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.a50.g().a(com.google.android.gms.internal.ads.k80.R0)).booleanValue() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0048, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.a50.g().a(com.google.android.gms.internal.ads.k80.S0)).booleanValue() != false) goto L_0x004c;
     */
    @Override // com.google.android.gms.internal.ads.d60
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.r50 createInterstitialAdManager(e.b.b.a.b.a r8, com.google.android.gms.internal.ads.n40 r9, java.lang.String r10, com.google.android.gms.internal.ads.ri0 r11, int r12) {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.ClientApi.createInterstitialAdManager(e.b.b.a.b.a, com.google.android.gms.internal.ads.n40, java.lang.String, com.google.android.gms.internal.ads.ri0, int):com.google.android.gms.internal.ads.r50");
    }

    @Override // com.google.android.gms.internal.ads.d60
    public db0 createNativeAdViewDelegate(a aVar, a aVar2) {
        return new pa0((FrameLayout) b.y(aVar), (FrameLayout) b.y(aVar2));
    }

    @Override // com.google.android.gms.internal.ads.d60
    public hb0 createNativeAdViewHolderDelegate(a aVar, a aVar2, a aVar3) {
        return new ra0((View) b.y(aVar), (HashMap) b.y(aVar2), (HashMap) b.y(aVar3));
    }

    @Override // com.google.android.gms.internal.ads.d60
    public f6 createRewardedVideoAd(a aVar, ri0 ri0, int i2) {
        Context context = (Context) b.y(aVar);
        x0.f();
        return new w5(context, u1.a(context), ri0, new sc(n.GOOGLE_PLAY_SERVICES_VERSION_CODE, i2, true, u9.m(context)));
    }

    @Override // com.google.android.gms.internal.ads.d60
    public r50 createSearchAdManager(a aVar, n40 n40, String str, int i2) {
        Context context = (Context) b.y(aVar);
        x0.f();
        return new r0(context, n40, str, new sc(n.GOOGLE_PLAY_SERVICES_VERSION_CODE, i2, true, u9.m(context)));
    }

    @Override // com.google.android.gms.internal.ads.d60
    public j60 getMobileAdsSettingsManager(a aVar) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.d60
    public j60 getMobileAdsSettingsManagerWithClientJarVersion(a aVar, int i2) {
        Context context = (Context) b.y(aVar);
        x0.f();
        return z.a(context, new sc(n.GOOGLE_PLAY_SERVICES_VERSION_CODE, i2, true, u9.m(context)));
    }
}
