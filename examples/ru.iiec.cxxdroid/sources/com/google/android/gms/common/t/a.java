package com.google.android.gms.common.t;

import android.content.Context;
import com.google.android.gms.common.util.n;

public class a {
    private static Context a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f3711b;

    public static synchronized boolean a(Context context) {
        boolean z;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            if (a == null || f3711b == null || a != applicationContext) {
                f3711b = null;
                if (n.l()) {
                    z = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f3711b = true;
                    } catch (ClassNotFoundException unused) {
                        z = false;
                    }
                    a = applicationContext;
                    return f3711b.booleanValue();
                }
                f3711b = z;
                a = applicationContext;
                return f3711b.booleanValue();
            }
            return f3711b.booleanValue();
        }
    }
}
