package com.crashlytics.android.e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class c {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final a f2906b;

    /* access modifiers changed from: package-private */
    public interface a {
        String a(File file);
    }

    c(Context context, a aVar) {
        this.a = context;
        this.f2906b = aVar;
    }

    private File a(File file) {
        if (Build.VERSION.SDK_INT < 9 || !file.getAbsolutePath().startsWith("/data")) {
            return file;
        }
        try {
            return new File(this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 0).nativeLibraryDir, file.getName());
        } catch (PackageManager.NameNotFoundException e2) {
            f.a.a.a.c.g().c("CrashlyticsCore", "Error getting ApplicationInfo", e2);
            return file;
        }
    }

    private static JSONObject a(String str, k0 k0Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("base_address", k0Var.a);
        jSONObject.put("size", k0Var.f2995b);
        jSONObject.put("name", k0Var.f2997d);
        jSONObject.put("uuid", str);
        return jSONObject;
    }

    private static boolean a(k0 k0Var) {
        return (k0Var.f2996c.indexOf(120) == -1 || k0Var.f2997d.indexOf(47) == -1) ? false : true;
    }

    private static byte[] a(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("binary_images", jSONArray);
            return jSONObject.toString().getBytes();
        } catch (JSONException e2) {
            f.a.a.a.c.g().b("CrashlyticsCore", "Binary images string is null", e2);
            return new byte[0];
        }
    }

    private File b(String str) {
        File file = new File(str);
        return !file.exists() ? a(file) : file;
    }

    private static String b(JSONArray jSONArray) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            sb.append(jSONArray.getString(i2));
        }
        return sb.toString();
    }

    private JSONArray c(String str) {
        String[] split;
        JSONArray jSONArray = new JSONArray();
        try {
            for (String str2 : b(new JSONObject(str).getJSONArray("maps")).split("\\|")) {
                k0 a2 = l0.a(str2);
                if (a2 != null && a(a2)) {
                    try {
                        try {
                            jSONArray.put(a(this.f2906b.a(b(a2.f2997d)), a2));
                        } catch (JSONException e2) {
                            f.a.a.a.c.g().a("CrashlyticsCore", "Could not create a binary image json string", e2);
                        }
                    } catch (IOException e3) {
                        f.a.a.a.c.g().a("CrashlyticsCore", "Could not generate ID for file " + a2.f2997d, e3);
                    }
                }
            }
            return jSONArray;
        } catch (JSONException e4) {
            f.a.a.a.c.g().b("CrashlyticsCore", "Unable to parse proc maps string", e4);
            return jSONArray;
        }
    }

    /* access modifiers changed from: package-private */
    public byte[] a(String str) {
        return a(c(str));
    }
}
