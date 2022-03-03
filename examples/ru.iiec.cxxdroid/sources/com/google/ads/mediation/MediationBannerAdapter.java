package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import e.b.a.c;

@Deprecated
public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends f, SERVER_PARAMETERS extends e> extends b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    View getBannerView();

    void requestBannerAd(c cVar, Activity activity, SERVER_PARAMETERS server_parameters, c cVar2, a aVar, ADDITIONAL_PARAMETERS additional_parameters);
}
