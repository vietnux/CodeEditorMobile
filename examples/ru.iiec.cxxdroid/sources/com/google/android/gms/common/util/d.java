package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.n;
import com.google.android.gms.common.t.c;

public class d {
    public static int a(Context context, String str) {
        return a(b(context, str));
    }

    public static int a(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt(n.KEY_METADATA_GOOGLE_PLAY_SERVICES_VERSION, -1);
    }

    public static boolean a() {
        return false;
    }

    public static PackageInfo b(Context context, String str) {
        try {
            return c.b(context).b(str, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean c(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            return (c.b(context).a(str, 0).flags & 2097152) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
