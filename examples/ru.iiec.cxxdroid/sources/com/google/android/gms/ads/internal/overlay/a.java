package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.k80;
import com.google.android.gms.internal.ads.l9;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.u9;

@k2
public final class a {
    private static boolean a(Context context, Intent intent, t tVar) {
        try {
            String valueOf = String.valueOf(intent.toURI());
            l9.e(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            x0.f();
            u9.a(context, intent);
            if (tVar == null) {
                return true;
            }
            tVar.R1();
            return true;
        } catch (ActivityNotFoundException e2) {
            qc.d(e2.getMessage());
            return false;
        }
    }

    public static boolean a(Context context, c cVar, t tVar) {
        String str;
        int i2 = 0;
        if (cVar == null) {
            str = "No intent data for launcher overlay.";
        } else {
            k80.a(context);
            Intent intent = cVar.f3274i;
            if (intent != null) {
                return a(context, intent, tVar);
            }
            Intent intent2 = new Intent();
            if (TextUtils.isEmpty(cVar.f3268c)) {
                str = "Open GMSG did not contain a URL.";
            } else {
                if (!TextUtils.isEmpty(cVar.f3269d)) {
                    intent2.setDataAndType(Uri.parse(cVar.f3268c), cVar.f3269d);
                } else {
                    intent2.setData(Uri.parse(cVar.f3268c));
                }
                intent2.setAction("android.intent.action.VIEW");
                if (!TextUtils.isEmpty(cVar.f3270e)) {
                    intent2.setPackage(cVar.f3270e);
                }
                if (!TextUtils.isEmpty(cVar.f3271f)) {
                    String[] split = cVar.f3271f.split("/", 2);
                    if (split.length < 2) {
                        String valueOf = String.valueOf(cVar.f3271f);
                        qc.d(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                        return false;
                    }
                    intent2.setClassName(split[0], split[1]);
                }
                String str2 = cVar.f3272g;
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        i2 = Integer.parseInt(str2);
                    } catch (NumberFormatException unused) {
                        qc.d("Could not parse intent flags.");
                    }
                    intent2.addFlags(i2);
                }
                if (((Boolean) a50.g().a(k80.M2)).booleanValue()) {
                    intent2.addFlags(268435456);
                    intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
                } else {
                    if (((Boolean) a50.g().a(k80.L2)).booleanValue()) {
                        x0.f();
                        u9.b(context, intent2);
                    }
                }
                return a(context, intent2, tVar);
            }
        }
        qc.d(str);
        return false;
    }
}
