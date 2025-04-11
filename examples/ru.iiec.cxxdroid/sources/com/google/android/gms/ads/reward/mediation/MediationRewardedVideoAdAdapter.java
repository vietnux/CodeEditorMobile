package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.a;
import com.google.android.gms.ads.mediation.b;

public interface MediationRewardedVideoAdAdapter extends b {
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";

    void initialize(Context context, a aVar, String str, a aVar2, Bundle bundle, Bundle bundle2);

    boolean isInitialized();

    void loadAd(a aVar, Bundle bundle, Bundle bundle2);

    void showVideo();
}
