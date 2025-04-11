package com.google.firebase.analytics.a;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.concurrent.ConcurrentHashMap;

public class b implements a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f6568b;
    private final AppMeasurement a;

    private b(AppMeasurement appMeasurement) {
        y.a(appMeasurement);
        this.a = appMeasurement;
        new ConcurrentHashMap();
    }

    public static a a(Context context) {
        y.a(context);
        y.a(context.getApplicationContext());
        if (f6568b == null) {
            synchronized (a.class) {
                if (f6568b == null) {
                    f6568b = new b(AppMeasurement.getInstance(context));
                }
            }
        }
        return f6568b;
    }

    @Override // com.google.firebase.analytics.a.a
    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!com.google.firebase.analytics.connector.internal.b.a(str)) {
            String valueOf = String.valueOf(str);
            Log.d("FA-C", valueOf.length() != 0 ? "Origin not allowed : ".concat(valueOf) : new String("Origin not allowed : "));
        } else if (!com.google.firebase.analytics.connector.internal.b.a(str2, bundle)) {
            Log.d("FA-C", "Event or Params not allowed");
        } else if (!com.google.firebase.analytics.connector.internal.b.a(str, str2, bundle)) {
            Log.d("FA-C", "Campaign events not allowed");
        } else {
            this.a.logEventInternal(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.a.a
    public void a(String str, String str2, Object obj) {
        if (!com.google.firebase.analytics.connector.internal.b.a(str)) {
            String valueOf = String.valueOf(str);
            Log.d("FA-C", valueOf.length() != 0 ? "Origin not allowed : ".concat(valueOf) : new String("Origin not allowed : "));
        } else if (!com.google.firebase.analytics.connector.internal.b.b(str2)) {
            String valueOf2 = String.valueOf(str2);
            Log.d("FA-C", valueOf2.length() != 0 ? "User Property not allowed : ".concat(valueOf2) : new String("User Property not allowed : "));
        } else if ((str2.equals("_ce1") || str2.equals("_ce2")) && !str.equals(AppMeasurement.FCM_ORIGIN) && !str.equals("frc")) {
            String valueOf3 = String.valueOf(str2);
            Log.d("FA-C", valueOf3.length() != 0 ? "User Property not allowed for this origin: ".concat(valueOf3) : new String("User Property not allowed for this origin: "));
        } else {
            this.a.setUserPropertyInternal(str, str2, obj);
        }
    }
}
