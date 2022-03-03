package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class r {

    /* renamed from: d  reason: collision with root package name */
    private static final long f6653d = TimeUnit.DAYS.toMillis(7);
    final String a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6654b;

    /* renamed from: c  reason: collision with root package name */
    private final long f6655c;

    private r(String str, String str2, long j2) {
        this.a = str;
        this.f6654b = str2;
        this.f6655c = j2;
    }

    static String a(String str, String str2, long j2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j2);
            return jSONObject.toString();
        } catch (JSONException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    static r b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new r(str, null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new r(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str) {
        return System.currentTimeMillis() > this.f6655c + f6653d || !str.equals(this.f6654b);
    }
}
