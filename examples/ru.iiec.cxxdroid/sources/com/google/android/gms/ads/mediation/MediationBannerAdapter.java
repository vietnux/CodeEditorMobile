package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.d;

public interface MediationBannerAdapter extends b {
    View getBannerView();

    void requestBannerAd(Context context, c cVar, Bundle bundle, d dVar, a aVar, Bundle bundle2);
}
