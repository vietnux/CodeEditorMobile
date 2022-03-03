package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.x80;
import java.util.Map;

@k2
public final class n implements e0<lg> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final /* synthetic */ void zza(lg lgVar, Map map) {
        lg lgVar2 = lgVar;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                qc.d("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                qc.d("No timestamp given for CSI tick.");
            } else {
                try {
                    long b2 = x0.m().b() + (Long.parseLong(str4) - x0.m().a());
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    lgVar2.Q().a(str2, str3, b2);
                } catch (NumberFormatException e2) {
                    qc.c("Malformed timestamp for CSI tick.", e2);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                qc.d("No value given for CSI experiment.");
                return;
            }
            x80 a = lgVar2.Q().a();
            if (a == null) {
                qc.d("No ticker for WebView, dropping experiment ID.");
            } else {
                a.a("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                qc.d("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                qc.d("No name given for CSI extra.");
            } else {
                x80 a2 = lgVar2.Q().a();
                if (a2 == null) {
                    qc.d("No ticker for WebView, dropping extra parameter.");
                } else {
                    a2.a(str6, str7);
                }
            }
        }
    }
}
