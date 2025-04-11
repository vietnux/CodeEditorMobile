package com.google.android.gms.internal.ads;

import android.util.Log;

@k2
public final class l9 extends qc {
    public static boolean a() {
        if (!qc.a(2)) {
            return false;
        }
        return ((Boolean) a50.g().a(k80.k1)).booleanValue();
    }

    public static void e(String str) {
        if (a()) {
            Log.v("Ads", str);
        }
    }
}
