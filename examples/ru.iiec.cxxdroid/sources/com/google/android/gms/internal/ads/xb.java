package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;

@k2
public final class xb {
    public static boolean a(j40 j40) {
        Bundle bundle = j40.n;
        if (bundle == null) {
            bundle = new Bundle();
        }
        return (bundle.getBundle(AdMobAdapter.class.getName()) != null ? bundle.getBundle(AdMobAdapter.class.getName()) : new Bundle()).getBoolean("render_test_label", false);
    }
}
