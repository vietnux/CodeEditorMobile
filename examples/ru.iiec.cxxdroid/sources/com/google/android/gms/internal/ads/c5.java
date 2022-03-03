package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.x0;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class c5 {
    private p3 A;
    private boolean B = false;
    private String C;
    private List<String> D;
    private boolean E;
    private String F;
    private y7 G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private String L;
    private final j3 M;
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private String f3981b;

    /* renamed from: c  reason: collision with root package name */
    private String f3982c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f3983d;

    /* renamed from: e  reason: collision with root package name */
    private String f3984e;

    /* renamed from: f  reason: collision with root package name */
    private String f3985f;

    /* renamed from: g  reason: collision with root package name */
    private String f3986g;

    /* renamed from: h  reason: collision with root package name */
    private List<String> f3987h;

    /* renamed from: i  reason: collision with root package name */
    private List<String> f3988i;

    /* renamed from: j  reason: collision with root package name */
    private long f3989j = -1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3990k = false;

    /* renamed from: l  reason: collision with root package name */
    private List<String> f3991l;

    /* renamed from: m  reason: collision with root package name */
    private long f3992m = -1;
    private int n = -1;
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private boolean r = true;
    private boolean s = true;
    private String t = "";
    private boolean u = false;
    private boolean v = false;
    private o7 w;
    private List<String> x;
    private List<String> y;
    private boolean z = false;

    public c5(j3 j3Var, String str) {
        this.f3981b = str;
        this.M = j3Var;
    }

    private static String a(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private static long b(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return -1;
        }
        String str2 = list.get(0);
        try {
            return (long) (Float.parseFloat(str2) * 1000.0f);
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length());
            sb.append("Could not parse float from ");
            sb.append(str);
            sb.append(" header: ");
            sb.append(str2);
            qc.d(sb.toString());
            return -1;
        }
    }

    private static List<String> c(Map<String, List<String>> map, String str) {
        String str2;
        List<String> list = map.get(str);
        if (list == null || list.isEmpty() || (str2 = list.get(0)) == null) {
            return null;
        }
        return Arrays.asList(str2.trim().split("\\s+"));
    }

    private static boolean d(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return false;
        }
        return Boolean.valueOf(list.get(0)).booleanValue();
    }

    public final n3 a(long j2, boolean z2) {
        int i2;
        String str;
        j3 j3Var = this.M;
        String str2 = this.f3981b;
        String str3 = this.f3982c;
        List<String> list = this.f3983d;
        List<String> list2 = this.f3987h;
        long j3 = this.f3989j;
        boolean z3 = this.f3990k;
        List<String> list3 = this.f3991l;
        long j4 = this.f3992m;
        int i3 = this.n;
        String str4 = this.a;
        String str5 = this.f3985f;
        String str6 = this.f3986g;
        boolean z4 = this.o;
        boolean z5 = this.p;
        boolean z6 = this.q;
        boolean z7 = this.r;
        String str7 = this.t;
        boolean z8 = this.u;
        boolean z9 = this.v;
        o7 o7Var = this.w;
        List<String> list4 = this.x;
        List<String> list5 = this.y;
        boolean z10 = this.z;
        p3 p3Var = this.A;
        boolean z11 = this.B;
        String str8 = this.C;
        List<String> list6 = this.D;
        boolean z12 = this.E;
        String str9 = this.F;
        y7 y7Var = this.G;
        String str10 = this.f3984e;
        boolean z13 = this.s;
        boolean z14 = this.H;
        boolean z15 = this.I;
        if (z2) {
            str = str4;
            i2 = 2;
        } else {
            str = str4;
            i2 = 1;
        }
        return new n3(j3Var, str2, str3, list, list2, j3, z3, -1, list3, j4, i3, str, j2, str5, str6, z4, z5, z6, z7, false, str7, z8, z9, o7Var, list4, list5, z10, p3Var, z11, str8, list6, z12, str9, y7Var, str10, z13, z14, z15, i2, this.J, this.f3988i, this.K, this.L);
    }

    public final void a(String str, Map<String, List<String>> map, String str2) {
        this.f3982c = str2;
        a(map);
    }

    public final void a(Map<String, List<String>> map) {
        int a2;
        this.a = a(map, "X-Afma-Ad-Size");
        this.F = a(map, "X-Afma-Ad-Slot-Size");
        List<String> c2 = c(map, "X-Afma-Click-Tracking-Urls");
        if (c2 != null) {
            this.f3983d = c2;
        }
        this.f3984e = a(map, "X-Afma-Debug-Signals");
        List<String> list = map.get("X-Afma-Debug-Dialog");
        if (list != null && !list.isEmpty()) {
            this.f3985f = list.get(0);
        }
        List<String> c3 = c(map, "X-Afma-Tracking-Urls");
        if (c3 != null) {
            this.f3987h = c3;
        }
        List<String> c4 = c(map, "X-Afma-Downloaded-Impression-Urls");
        if (c4 != null) {
            this.f3988i = c4;
        }
        long b2 = b(map, "X-Afma-Interstitial-Timeout");
        if (b2 != -1) {
            this.f3989j = b2;
        }
        this.f3990k |= d(map, "X-Afma-Mediation");
        List<String> c5 = c(map, "X-Afma-Manual-Tracking-Urls");
        if (c5 != null) {
            this.f3991l = c5;
        }
        long b3 = b(map, "X-Afma-Refresh-Rate");
        if (b3 != -1) {
            this.f3992m = b3;
        }
        List<String> list2 = map.get("X-Afma-Orientation");
        if (list2 != null && !list2.isEmpty()) {
            String str = list2.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                a2 = x0.h().b();
            } else if ("landscape".equalsIgnoreCase(str)) {
                a2 = x0.h().a();
            }
            this.n = a2;
        }
        this.f3986g = a(map, "X-Afma-ActiveView");
        List<String> list3 = map.get("X-Afma-Use-HTTPS");
        if (list3 != null && !list3.isEmpty()) {
            this.q = Boolean.valueOf(list3.get(0)).booleanValue();
        }
        this.o |= d(map, "X-Afma-Custom-Rendering-Allowed");
        this.p = "native".equals(a(map, "X-Afma-Ad-Format"));
        List<String> list4 = map.get("X-Afma-Content-Url-Opted-Out");
        if (list4 != null && !list4.isEmpty()) {
            this.r = Boolean.valueOf(list4.get(0)).booleanValue();
        }
        List<String> list5 = map.get("X-Afma-Content-Vertical-Opted-Out");
        if (list5 != null && !list5.isEmpty()) {
            this.s = Boolean.valueOf(list5.get(0)).booleanValue();
        }
        List<String> list6 = map.get("X-Afma-Gws-Query-Id");
        if (list6 != null && !list6.isEmpty()) {
            this.t = list6.get(0);
        }
        String a3 = a(map, "X-Afma-Fluid");
        if (a3 != null && a3.equals("height")) {
            this.u = true;
        }
        this.v = "native_express".equals(a(map, "X-Afma-Ad-Format"));
        this.w = o7.b(a(map, "X-Afma-Rewards"));
        if (this.x == null) {
            this.x = c(map, "X-Afma-Reward-Video-Start-Urls");
        }
        if (this.y == null) {
            this.y = c(map, "X-Afma-Reward-Video-Complete-Urls");
        }
        this.z |= d(map, "X-Afma-Use-Displayed-Impression");
        this.B |= d(map, "X-Afma-Auto-Collect-Location");
        this.C = a(map, "Set-Cookie");
        String a4 = a(map, "X-Afma-Auto-Protection-Configuration");
        if (a4 == null || TextUtils.isEmpty(a4)) {
            Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
            buildUpon.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(this.f3985f)) {
                buildUpon.appendQueryParameter("debugDialog", this.f3985f);
            }
            boolean booleanValue = ((Boolean) a50.g().a(k80.f4793g)).booleanValue();
            String builder = buildUpon.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(builder).length() + 31);
            sb.append(builder);
            sb.append("&navigationURL={NAVIGATION_URL}");
            this.A = new p3(booleanValue, Arrays.asList(sb.toString()));
        } else {
            try {
                this.A = p3.a(new JSONObject(a4));
            } catch (JSONException e2) {
                qc.c("Error parsing configuration JSON", e2);
                this.A = new p3();
            }
        }
        List<String> c6 = c(map, "X-Afma-Remote-Ping-Urls");
        if (c6 != null) {
            this.D = c6;
        }
        String a5 = a(map, "X-Afma-Safe-Browsing");
        if (!TextUtils.isEmpty(a5)) {
            try {
                this.G = y7.a(new JSONObject(a5));
            } catch (JSONException e3) {
                qc.c("Error parsing safe browsing header", e3);
            }
        }
        this.E |= d(map, "X-Afma-Render-In-Browser");
        String a6 = a(map, "X-Afma-Pool");
        if (!TextUtils.isEmpty(a6)) {
            try {
                this.H = new JSONObject(a6).getBoolean("never_pool");
            } catch (JSONException e4) {
                qc.c("Error parsing interstitial pool header", e4);
            }
        }
        this.I = d(map, "X-Afma-Custom-Close-Blocked");
        this.J = d(map, "X-Afma-Enable-Omid");
        this.K = d(map, "X-Afma-Disable-Closable-Area");
        this.L = a(map, "X-Afma-Omid-Settings");
    }
}
