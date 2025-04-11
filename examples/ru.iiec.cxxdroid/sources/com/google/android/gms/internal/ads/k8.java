package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.x0;

@k2
public final class k8 {
    public static Uri a(Uri uri, Context context) {
        if (!x0.C().i(context) || !TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return uri;
        }
        String b2 = x0.C().b(context);
        Uri a = a(uri.toString(), "fbs_aeid", b2);
        x0.C().d(context, b2);
        return a;
    }

    private static Uri a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i2 = indexOf + 1;
        return Uri.parse(str.substring(0, i2) + str2 + "=" + str3 + "&" + str.substring(i2));
    }

    public static String a(String str, Context context) {
        String b2;
        if (!x0.C().d(context) || TextUtils.isEmpty(str) || (b2 = x0.C().b(context)) == null) {
            return str;
        }
        if (((Boolean) a50.g().a(k80.r0)).booleanValue()) {
            CharSequence charSequence = (String) a50.g().a(k80.s0);
            if (!str.contains(charSequence)) {
                return str;
            }
            if (x0.f().a(str)) {
                x0.C().d(context, b2);
                return str.replace(charSequence, b2);
            } else if (!x0.f().b(str)) {
                return str;
            } else {
                x0.C().e(context, b2);
                return str.replace(charSequence, b2);
            }
        } else if (str.contains("fbs_aeid")) {
            return str;
        } else {
            if (x0.f().a(str)) {
                x0.C().d(context, b2);
                return a(str, "fbs_aeid", b2).toString();
            } else if (!x0.f().b(str)) {
                return str;
            } else {
                x0.C().e(context, b2);
                return a(str, "fbs_aeid", b2).toString();
            }
        }
    }

    public static String b(String str, Context context) {
        String b2;
        if (!x0.C().d(context) || TextUtils.isEmpty(str) || (b2 = x0.C().b(context)) == null || !x0.f().b(str)) {
            return str;
        }
        if (!((Boolean) a50.g().a(k80.r0)).booleanValue()) {
            return !str.contains("fbs_aeid") ? a(str, "fbs_aeid", b2).toString() : str;
        }
        CharSequence charSequence = (String) a50.g().a(k80.s0);
        return str.contains(charSequence) ? str.replace(charSequence, b2) : str;
    }
}
