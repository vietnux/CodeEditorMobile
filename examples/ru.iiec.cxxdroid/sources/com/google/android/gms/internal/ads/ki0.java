package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@k2
public final class ki0 {
    private static String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public static List<String> a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            arrayList.add(optJSONArray.getString(i2));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void a(Context context, String str, q8 q8Var, String str2, boolean z, List<String> list) {
        if (!(list == null || list.isEmpty())) {
            String str3 = z ? "1" : "0";
            for (String str4 : list) {
                String a = a(a(a(a(a(a(a(str4, "@gw_adlocid@", str2), "@gw_adnetrefresh@", str3), "@gw_qdata@", q8Var.r.f3920i), "@gw_sdkver@", str), "@gw_sessid@", a50.d()), "@gw_seqnum@", q8Var.f5327j), "@gw_adnetstatus@", q8Var.t);
                ai0 ai0 = q8Var.o;
                if (ai0 != null) {
                    a = a(a(a, "@gw_adnetid@", ai0.f3807b), "@gw_allocid@", q8Var.o.f3809d);
                }
                String a2 = k8.a(a, context);
                x0.f();
                u9.a(context, str, a2);
            }
        }
    }

    public static void a(Context context, String str, List<String> list, String str2, o7 o7Var) {
        if (!(list == null || list.isEmpty())) {
            if (!TextUtils.isEmpty(str2) && jc.a()) {
                str2 = "fakeUserForAdDebugLog";
            }
            long a = x0.m().a();
            for (String str3 : list) {
                String a2 = a(a(str3, "@gw_rwd_userid@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(a));
                if (o7Var != null) {
                    a2 = a(a(a2, "@gw_rwd_itm@", Uri.encode(o7Var.f5126b)), "@gw_rwd_amt@", Integer.toString(o7Var.f5127c));
                }
                x0.f();
                u9.a(context, str, a2);
            }
        }
    }

    public static boolean a(String str, int[] iArr) {
        if (TextUtils.isEmpty(str) || iArr.length != 2) {
            return false;
        }
        String[] split = str.split("x");
        if (split.length != 2) {
            return false;
        }
        try {
            iArr[0] = Integer.parseInt(split[0]);
            iArr[1] = Integer.parseInt(split[1]);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
