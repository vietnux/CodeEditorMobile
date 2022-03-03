package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.n;

public final class i {
    private static Boolean a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f3721b;

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f3722c;

    public static boolean a() {
        return n.sIsTestMode ? n.sTestIsUserBuild : "user".equals(Build.TYPE);
    }

    public static boolean a(Context context) {
        if (f3722c == null) {
            f3722c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f3722c.booleanValue();
    }

    @TargetApi(21)
    public static boolean b(Context context) {
        if (f3721b == null) {
            f3721b = Boolean.valueOf(n.i() && context.getPackageManager().hasSystemFeature(n.FEATURE_SIDEWINDER));
        }
        return f3721b.booleanValue();
    }

    @TargetApi(20)
    public static boolean c(Context context) {
        if (a == null) {
            a = Boolean.valueOf(n.h() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return a.booleanValue();
    }

    @TargetApi(24)
    public static boolean d(Context context) {
        return (!n.k() || b(context)) && c(context);
    }
}
