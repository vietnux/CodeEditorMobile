package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.x0;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class s4 extends s3 {

    /* renamed from: e  reason: collision with root package name */
    private static final Object f5498e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private static s4 f5499f;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5500b;

    /* renamed from: c  reason: collision with root package name */
    private final r4 f5501c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f5502d = Executors.newSingleThreadScheduledExecutor();

    private s4(Context context, r4 r4Var) {
        this.f5500b = context;
        this.f5501c = r4Var;
    }

    private static n3 a(Context context, r4 r4Var, j3 j3Var, ScheduledExecutorService scheduledExecutorService) {
        x80 x80;
        Bundle bundle;
        String string;
        qc.b("Starting ad request from service using: google.afma.request.getAdDictionary");
        x80 x802 = new x80(((Boolean) a50.g().a(k80.N)).booleanValue(), "load_ad", j3Var.f4663e.f5046b);
        if (j3Var.f4660b > 10) {
            long j2 = j3Var.B;
            if (j2 != -1) {
                x802.a(x802.a(j2), "cts");
            }
        }
        v80 a = x802.a();
        ld a2 = ad.a(r4Var.f5382h.a(context), ((Long) a50.g().a(k80.z2)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService);
        ld a3 = ad.a(r4Var.f5381g.a(context), ((Long) a50.g().a(k80.u1)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService);
        ld<String> a4 = r4Var.f5376b.a(j3Var.f4666h.packageName);
        ld<String> b2 = r4Var.f5376b.b(j3Var.f4666h.packageName);
        ld<String> a5 = r4Var.f5383i.a(j3Var.f4667i, j3Var.f4666h);
        Future<g5> a6 = x0.q().a(context);
        ld<Location> a7 = ad.a((Object) null);
        Bundle bundle2 = j3Var.f4662d.f4676d;
        boolean z = (bundle2 == null || bundle2.getString("_ad") == null) ? false : true;
        if (j3Var.H && !z) {
            a7 = r4Var.f5379e.a(j3Var.f4665g);
        }
        ld a8 = ad.a(a7, ((Long) a50.g().a(k80.q2)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService);
        Future a9 = ad.a((Object) null);
        if (((Boolean) a50.g().a(k80.H0)).booleanValue()) {
            x80 = x802;
            a9 = ad.a(r4Var.f5383i.a(context), ((Long) a50.g().a(k80.I0)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService);
        } else {
            x80 = x802;
        }
        if (j3Var.f4660b < 4 || (bundle = j3Var.p) == null) {
            bundle = null;
        }
        ((Boolean) a50.g().a(k80.d0)).booleanValue();
        x0.f();
        if (u9.b(context, "android.permission.ACCESS_NETWORK_STATE") && ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() == null) {
            qc.b("Device is offline.");
        }
        String uuid = j3Var.f4660b >= 7 ? j3Var.w : UUID.randomUUID().toString();
        new y4(context, uuid, j3Var.f4665g.packageName);
        Bundle bundle3 = j3Var.f4662d.f4676d;
        if (bundle3 != null && (string = bundle3.getString("_ad")) != null) {
            return x4.a(context, j3Var, string);
        }
        List<String> a10 = r4Var.f5377c.a(j3Var.x);
        Bundle bundle4 = (Bundle) ad.a(a2, (Object) null, ((Long) a50.g().a(k80.z2)).longValue(), TimeUnit.MILLISECONDS);
        q5 q5Var = (q5) ad.a(a3, (Object) null);
        Location location = (Location) ad.a(a8, (Object) null);
        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) ad.a(a9, (Object) null);
        String str = (String) ad.a(a5, (Object) null);
        String str2 = (String) ad.a(a4, (Object) null);
        String str3 = (String) ad.a(b2, (Object) null);
        g5 g5Var = (g5) ad.a(a6, (Object) null);
        if (g5Var == null) {
            qc.d("Error fetching device info. This is not recoverable.");
            return new n3(0);
        }
        q4 q4Var = new q4();
        q4Var.f5299j = j3Var;
        q4Var.f5300k = g5Var;
        q4Var.f5294e = q5Var;
        q4Var.f5293d = location;
        q4Var.f5291b = bundle4;
        q4Var.f5297h = str;
        q4Var.f5298i = info;
        if (a10 == null) {
            q4Var.f5292c.clear();
        }
        q4Var.f5292c = a10;
        q4Var.a = bundle;
        q4Var.f5295f = str2;
        q4Var.f5296g = str3;
        q4Var.f5301l = r4Var.a.a(context);
        q4Var.f5302m = r4Var.f5384j;
        JSONObject a11 = x4.a(context, q4Var);
        if (a11 == null) {
            return new n3(0);
        }
        if (j3Var.f4660b < 7) {
            try {
                a11.put("request_id", uuid);
            } catch (JSONException unused) {
            }
        }
        x80.a(a, "arc");
        x80.a();
        ld a12 = ad.a(ad.a(r4Var.f5385k.b().a(a11), t4.a, scheduledExecutorService), 10, TimeUnit.SECONDS, scheduledExecutorService);
        ld<Void> a13 = r4Var.f5378d.a();
        if (a13 != null) {
            yc.a(a13, "AdRequestServiceImpl.loadAd.flags");
        }
        e5 e5Var = (e5) ad.a(a12, (Object) null);
        if (e5Var == null) {
            return new n3(0);
        }
        if (e5Var.a() != -2) {
            return new n3(e5Var.a());
        }
        x80.d();
        n3 a14 = !TextUtils.isEmpty(e5Var.i()) ? x4.a(context, j3Var, e5Var.i()) : null;
        if (a14 == null && !TextUtils.isEmpty(e5Var.c())) {
            a14 = a(j3Var, context, j3Var.f4670l.f5529b, e5Var.c(), str2, str3, e5Var, x80, r4Var);
        }
        if (a14 == null) {
            a14 = new n3(0);
        }
        x80.a(a, "tts");
        a14.A = x80.b();
        return a14;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a A[Catch:{ all -> 0x01ca }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.n3 a(com.google.android.gms.internal.ads.j3 r17, android.content.Context r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, com.google.android.gms.internal.ads.e5 r23, com.google.android.gms.internal.ads.x80 r24, com.google.android.gms.internal.ads.r4 r25) {
        /*
        // Method dump skipped, instructions count: 507
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s4.a(com.google.android.gms.internal.ads.j3, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.e5, com.google.android.gms.internal.ads.x80, com.google.android.gms.internal.ads.r4):com.google.android.gms.internal.ads.n3");
    }

    public static s4 a(Context context, r4 r4Var) {
        s4 s4Var;
        synchronized (f5498e) {
            if (f5499f == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                k80.a(context);
                f5499f = new s4(context, r4Var);
                if (context.getApplicationContext() != null) {
                    x0.f().b(context);
                }
                i9.a(context);
            }
            s4Var = f5499f;
        }
        return s4Var;
    }

    private static void a(String str, Map<String, List<String>> map, String str2, int i2) {
        if (qc.a(2)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
            sb.append("Http Response: {\n  URL:\n    ");
            sb.append(str);
            sb.append("\n  Headers:");
            l9.e(sb.toString());
            if (map != null) {
                for (String str3 : map.keySet()) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 5);
                    sb2.append("    ");
                    sb2.append(str3);
                    sb2.append(":");
                    l9.e(sb2.toString());
                    for (String str4 : map.get(str3)) {
                        String valueOf = String.valueOf(str4);
                        l9.e(valueOf.length() != 0 ? "      ".concat(valueOf) : new String("      "));
                    }
                }
            }
            l9.e("  Body:");
            if (str2 != null) {
                int i3 = 0;
                while (i3 < Math.min(str2.length(), 100000)) {
                    int i4 = i3 + 1000;
                    l9.e(str2.substring(i3, Math.min(str2.length(), i4)));
                    i3 = i4;
                }
            } else {
                l9.e("    null");
            }
            StringBuilder sb3 = new StringBuilder(34);
            sb3.append("  Response Code:\n    ");
            sb3.append(i2);
            sb3.append("\n}");
            l9.e(sb3.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.r3
    public final n3 a(j3 j3Var) {
        return a(this.f5500b, this.f5501c, j3Var, this.f5502d);
    }

    @Override // com.google.android.gms.internal.ads.r3
    public final void a(c4 c4Var, x3 x3Var) {
        l9.e("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.r3
    public final void a(j3 j3Var, u3 u3Var) {
        x0.j().a(this.f5500b, j3Var.f4670l);
        ld<?> a = s9.a(new u4(this, j3Var, u3Var));
        x0.u().b();
        x0.u().a().postDelayed(new v4(this, a), 60000);
    }

    @Override // com.google.android.gms.internal.ads.r3
    public final void b(c4 c4Var, x3 x3Var) {
        l9.e("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }
}
