package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.t.c;
import com.google.android.gms.common.util.i;

public class h {
    public static final int a = n.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    /* renamed from: b  reason: collision with root package name */
    private static final h f3612b = new h();

    h() {
    }

    public static h a() {
        return f3612b;
    }

    private static String a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(c.b(context).b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    public int a(Context context) {
        return n.getApkVersion(context);
    }

    public int a(Context context, int i2) {
        int isGooglePlayServicesAvailable = n.isGooglePlayServicesAvailable(context, i2);
        if (n.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }

    public PendingIntent a(Context context, int i2, int i3) {
        return a(context, i2, i3, null);
    }

    public PendingIntent a(Context context, int i2, int i3, String str) {
        Intent a2 = a(context, i2, str);
        if (a2 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i3, a2, 134217728);
    }

    public Intent a(Context context, int i2, String str) {
        if (i2 == 1 || i2 == 2) {
            return (context == null || !i.d(context)) ? o.a("com.google.android.gms", a(context, str)) : o.a();
        }
        if (i2 != 3) {
            return null;
        }
        return o.a("com.google.android.gms");
    }

    public String a(int i2) {
        return n.getErrorString(i2);
    }

    public int b(Context context) {
        return a(context, a);
    }

    public boolean b(int i2) {
        return n.isUserRecoverableError(i2);
    }
}
