package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Arrays;
import java.util.List;

public final class b {
    private static final List<String> a = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", "app_open");

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f6569b = Arrays.asList("auto", "app", "am");

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f6570c = Arrays.asList("_r", "_dbg");

    /* renamed from: d  reason: collision with root package name */
    private static final List<String> f6571d = Arrays.asList((String[]) com.google.android.gms.common.util.b.a(AppMeasurement.e.a, AppMeasurement.e.f6243b));

    /* renamed from: e  reason: collision with root package name */
    private static final List<String> f6572e = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static boolean a(String str) {
        return !f6569b.contains(str);
    }

    public static boolean a(String str, Bundle bundle) {
        if (a.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        for (String str2 : f6570c) {
            if (bundle.containsKey(str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(String str, String str2, Bundle bundle) {
        String str3;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        for (String str4 : f6570c) {
            if (bundle.containsKey(str4)) {
                return false;
            }
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode == 101230 && str.equals("fdl")) {
                c2 = 1;
            }
        } else if (str.equals(AppMeasurement.FCM_ORIGIN)) {
            c2 = 0;
        }
        if (c2 == 0) {
            str3 = "fcm_integration";
        } else if (c2 != 1) {
            return false;
        } else {
            str3 = "fdl_integration";
        }
        bundle.putString("_cis", str3);
        return true;
    }

    public static boolean b(String str) {
        if (f6571d.contains(str)) {
            return false;
        }
        for (String str2 : f6572e) {
            if (str.matches(str2)) {
                return false;
            }
        }
        return true;
    }
}
