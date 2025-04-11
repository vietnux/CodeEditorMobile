package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class nh {
    private static final Pattern a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f5098b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a() {
        String str = (String) a50.g().a(k80.L);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            return "<script>" + "Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});" + "</script>";
        } catch (JSONException e2) {
            qc.c("Unable to build MRAID_ENV", e2);
            return null;
        }
    }

    public static String a(String str, String... strArr) {
        if (strArr.length == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        Matcher matcher = a.matcher(str);
        int i2 = 0;
        if (matcher.find()) {
            int end = matcher.end();
            sb.append(str.substring(0, end));
            int length = strArr.length;
            while (i2 < length) {
                String str2 = strArr[i2];
                if (str2 != null) {
                    sb.append(str2);
                }
                i2++;
            }
            str = str.substring(end);
        } else if (!f5098b.matcher(str).find()) {
            int length2 = strArr.length;
            while (i2 < length2) {
                String str3 = strArr[i2];
                if (str3 != null) {
                    sb.append(str3);
                }
                i2++;
            }
        }
        sb.append(str);
        return sb.toString();
    }
}
