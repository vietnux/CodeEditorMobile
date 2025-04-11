package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.ad;
import com.google.android.gms.internal.ads.ih0;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.k80;
import com.google.android.gms.internal.ads.ld;
import com.google.android.gms.internal.ads.mh0;
import com.google.android.gms.internal.ads.nh0;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.qh0;
import com.google.android.gms.internal.ads.rd;
import com.google.android.gms.internal.ads.sc;
import com.google.android.gms.internal.ads.u8;
import com.google.android.gms.internal.ads.yc;
import org.json.JSONObject;

@k2
public final class e {
    private Context a;

    /* renamed from: b  reason: collision with root package name */
    private long f3143b = 0;

    public final void a(Context context, sc scVar, String str, Runnable runnable) {
        a(context, scVar, true, null, str, null, runnable);
    }

    /* access modifiers changed from: package-private */
    public final void a(Context context, sc scVar, boolean z, u8 u8Var, String str, String str2, Runnable runnable) {
        if (x0.m().b() - this.f3143b < 5000) {
            qc.d("Not retrying to fetch app settings");
            return;
        }
        this.f3143b = x0.m().b();
        boolean z2 = true;
        if (u8Var != null) {
            if (!(x0.m().a() - u8Var.a() > ((Long) a50.g().a(k80.s2)).longValue()) && u8Var.b()) {
                z2 = false;
            }
        }
        if (z2) {
            if (context == null) {
                qc.d("Context not provided to fetch application settings");
            } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                this.a = applicationContext;
                qh0 a2 = x0.t().a(this.a, scVar);
                mh0<JSONObject> mh0 = nh0.f5099b;
                ih0 a3 = a2.a("google.afma.config.fetchAppSettings", mh0, mh0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("app_id", str);
                    } else if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("ad_unit_id", str2);
                    }
                    jSONObject.put("is_init", z);
                    jSONObject.put("pn", context.getPackageName());
                    ld a4 = a3.a(jSONObject);
                    ld a5 = ad.a(a4, f.a, rd.f5433b);
                    if (runnable != null) {
                        a4.a(runnable, rd.f5433b);
                    }
                    yc.a(a5, "ConfigLoader.maybeFetchNewAppSettings");
                } catch (Exception e2) {
                    qc.b("Error requesting application settings", e2);
                }
            } else {
                qc.d("App settings could not be fetched. Required parameters missing");
            }
        }
    }
}
