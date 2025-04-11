package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.n;
import com.google.android.gms.common.t.c;

public class w {
    private static Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f3698b;

    /* renamed from: c  reason: collision with root package name */
    private static String f3699c;

    /* renamed from: d  reason: collision with root package name */
    private static int f3700d;

    public static String a(Context context) {
        c(context);
        return f3699c;
    }

    public static int b(Context context) {
        c(context);
        return f3700d;
    }

    private static void c(Context context) {
        synchronized (a) {
            if (!f3698b) {
                f3698b = true;
                try {
                    Bundle bundle = c.b(context).a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f3699c = bundle.getString("com.google.app.id");
                        f3700d = bundle.getInt(n.KEY_METADATA_GOOGLE_PLAY_SERVICES_VERSION);
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e2);
                }
            }
        }
    }
}
