package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.x0;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class va {
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private String f5832b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f5833c = "";

    /* renamed from: d  reason: collision with root package name */
    private boolean f5834d = false;

    /* renamed from: e  reason: collision with root package name */
    private String f5835e = "";

    private final String a(Context context) {
        String str;
        synchronized (this.a) {
            if (TextUtils.isEmpty(this.f5832b)) {
                x0.f();
                this.f5832b = u9.c(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.f5832b)) {
                    x0.f();
                    this.f5832b = u9.b();
                    x0.f();
                    u9.b(context, "debug_signals_id.txt", this.f5832b);
                }
            }
            str = this.f5832b;
        }
        return str;
    }

    private final void a(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            qc.c("Can not create dialog without Activity Context");
        } else {
            u9.f5718h.post(new wa(this, context, str, z, z2));
        }
    }

    private final boolean b(Context context, String str, String str2) {
        String d2 = d(context, c(context, (String) a50.g().a(k80.S2), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d2)) {
            qc.b("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(d2.trim());
            String optString = jSONObject.optString("gct");
            this.f5835e = jSONObject.optString("status");
            synchronized (this.a) {
                this.f5833c = optString;
            }
            return true;
        } catch (JSONException e2) {
            qc.c("Fail to get in app preview response json.", e2);
            return false;
        }
    }

    private final Uri c(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", a(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    private final boolean c(Context context, String str, String str2) {
        String d2 = d(context, c(context, (String) a50.g().a(k80.T2), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d2)) {
            qc.b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(d2.trim()).optString("debug_mode"));
            synchronized (this.a) {
                this.f5834d = equals;
            }
            return equals;
        } catch (JSONException e2) {
            qc.c("Fail to get debug mode response json.", e2);
            return false;
        }
    }

    private static String d(Context context, String str, String str2) {
        String str3;
        Throwable e2;
        String str4;
        String str5;
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", x0.f().a(context, str2));
        ld<String> a2 = new eb(context).a(str, hashMap);
        try {
            return (String) a2.get((long) ((Integer) a50.g().a(k80.V2)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e3) {
            e2 = e3;
            str5 = "Timeout while retriving a response from: ";
            str4 = String.valueOf(str);
            if (str4.length() == 0) {
                str3 = new String(str5);
                qc.b(str3, e2);
                a2.cancel(true);
                return null;
            }
            str3 = str5.concat(str4);
            qc.b(str3, e2);
            a2.cancel(true);
            return null;
        } catch (InterruptedException e4) {
            e2 = e4;
            str5 = "Interrupted while retriving a response from: ";
            str4 = String.valueOf(str);
            if (str4.length() == 0) {
                str3 = new String(str5);
                qc.b(str3, e2);
                a2.cancel(true);
                return null;
            }
            str3 = str5.concat(str4);
            qc.b(str3, e2);
            a2.cancel(true);
            return null;
        } catch (Exception e5) {
            String valueOf = String.valueOf(str);
            qc.b(valueOf.length() != 0 ? "Error retriving a response from: ".concat(valueOf) : new String("Error retriving a response from: "), e5);
            return null;
        }
    }

    private final void e(Context context, String str, String str2) {
        x0.f();
        u9.a(context, c(context, (String) a50.g().a(k80.R2), str, str2));
    }

    public final String a() {
        String str;
        synchronized (this.a) {
            str = this.f5833c;
        }
        return str;
    }

    public final void a(Context context, String str, String str2) {
        if (!b(context, str, str2)) {
            a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(this.f5835e)) {
            qc.b("Creative is not pushed for this device.");
            a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.f5835e)) {
            qc.b("The app is not linked for creative preview.");
            e(context, str, str2);
        } else if ("0".equals(this.f5835e)) {
            qc.b("Device is linked for in app preview.");
            a(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void a(Context context, String str, String str2, String str3) {
        boolean b2 = b();
        if (c(context, str, str2)) {
            if (!b2 && !TextUtils.isEmpty(str3)) {
                b(context, str2, str3, str);
            }
            qc.b("Device is linked for debug signals.");
            a(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        e(context, str, str2);
    }

    public final void b(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = c(context, (String) a50.g().a(k80.U2), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        x0.f();
        u9.a(context, str, buildUpon.build().toString());
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.f5834d;
        }
        return z;
    }
}
