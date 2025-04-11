package com.google.android.gms.internal.ads;

import android.os.IInterface;
import e.b.b.a.b.a;

public interface d60 extends IInterface {
    m50 createAdLoaderBuilder(a aVar, String str, ri0 ri0, int i2);

    r createAdOverlay(a aVar);

    r50 createBannerAdManager(a aVar, n40 n40, String str, ri0 ri0, int i2);

    b0 createInAppPurchaseManager(a aVar);

    r50 createInterstitialAdManager(a aVar, n40 n40, String str, ri0 ri0, int i2);

    db0 createNativeAdViewDelegate(a aVar, a aVar2);

    hb0 createNativeAdViewHolderDelegate(a aVar, a aVar2, a aVar3);

    f6 createRewardedVideoAd(a aVar, ri0 ri0, int i2);

    r50 createSearchAdManager(a aVar, n40 n40, String str, int i2);

    j60 getMobileAdsSettingsManager(a aVar);

    j60 getMobileAdsSettingsManagerWithClientJarVersion(a aVar, int i2);
}
