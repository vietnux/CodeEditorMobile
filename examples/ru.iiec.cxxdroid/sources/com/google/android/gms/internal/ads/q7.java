package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.t.c;
import com.google.android.gms.common.util.n;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class q7 implements b8 {
    private static List<Future<Void>> n = Collections.synchronizedList(new ArrayList());
    private static ScheduledExecutorService o = Executors.newSingleThreadScheduledExecutor();
    private final mv a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashMap<String, uv> f5307b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f5308c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f5309d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final Context f5310e;

    /* renamed from: f  reason: collision with root package name */
    private final d8 f5311f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5312g;

    /* renamed from: h  reason: collision with root package name */
    private final y7 f5313h;

    /* renamed from: i  reason: collision with root package name */
    private final e8 f5314i;

    /* renamed from: j  reason: collision with root package name */
    private final Object f5315j = new Object();

    /* renamed from: k  reason: collision with root package name */
    private HashSet<String> f5316k = new HashSet<>();

    /* renamed from: l  reason: collision with root package name */
    private boolean f5317l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f5318m = false;

    public q7(Context context, sc scVar, y7 y7Var, String str, d8 d8Var) {
        y.a(y7Var, "SafeBrowsing config is not present.");
        this.f5310e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f5307b = new LinkedHashMap<>();
        this.f5311f = d8Var;
        this.f5313h = y7Var;
        for (String str2 : this.f5313h.f6092f) {
            this.f5316k.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.f5316k.remove("cookie".toLowerCase(Locale.ENGLISH));
        mv mvVar = new mv();
        mvVar.f4993c = 8;
        mvVar.f4995e = str;
        mvVar.f4996f = str;
        mvVar.f4998h = new nv();
        mvVar.f4998h.f5115c = this.f5313h.f6088b;
        vv vvVar = new vv();
        vvVar.f5849c = scVar.f5529b;
        vvVar.f5851e = Boolean.valueOf(c.b(this.f5310e).a());
        long a2 = (long) h.a().a(this.f5310e);
        if (a2 > 0) {
            vvVar.f5850d = Long.valueOf(a2);
        }
        mvVar.r = vvVar;
        this.a = mvVar;
        this.f5314i = new e8(this.f5310e, this.f5313h.f6095i, this);
    }

    private final uv d(String str) {
        uv uvVar;
        synchronized (this.f5315j) {
            uvVar = this.f5307b.get(str);
        }
        return uvVar;
    }

    private final ld<Void> e() {
        ld<Void> a2;
        if (!((this.f5312g && this.f5313h.f6094h) || (this.f5318m && this.f5313h.f6093g) || (!this.f5312g && this.f5313h.f6091e))) {
            return ad.a((Object) null);
        }
        synchronized (this.f5315j) {
            this.a.f4999i = new uv[this.f5307b.size()];
            this.f5307b.values().toArray(this.a.f4999i);
            this.a.s = (String[]) this.f5308c.toArray(new String[0]);
            this.a.t = (String[]) this.f5309d.toArray(new String[0]);
            if (a8.a()) {
                String str = this.a.f4995e;
                String str2 = this.a.f5000j;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(str2).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(str);
                sb.append("\n  clickUrl: ");
                sb.append(str2);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                uv[] uvVarArr = this.a.f4999i;
                for (uv uvVar : uvVarArr) {
                    sb2.append("    [");
                    sb2.append(uvVar.f5789k.length);
                    sb2.append("] ");
                    sb2.append(uvVar.f5782d);
                }
                a8.a(sb2.toString());
            }
            ld<String> a3 = new eb(this.f5310e).a(1, this.f5313h.f6089c, null, iv.a(this.a));
            if (a8.a()) {
                a3.a(new v7(this), s9.a);
            }
            a2 = ad.a(a3, s7.a, rd.f5433b);
        }
        return a2;
    }

    static final /* synthetic */ Void e(String str) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ld a(Map map) {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.f5315j) {
                            int length = optJSONArray.length();
                            uv d2 = d(str);
                            if (d2 == null) {
                                String valueOf = String.valueOf(str);
                                a8.a(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                d2.f5789k = new String[length];
                                boolean z = false;
                                for (int i2 = 0; i2 < length; i2++) {
                                    d2.f5789k[i2] = optJSONArray.getJSONObject(i2).getString("threat_type");
                                }
                                boolean z2 = this.f5312g;
                                if (length > 0) {
                                    z = true;
                                }
                                this.f5312g = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e2) {
                if (((Boolean) a50.g().a(k80.A2)).booleanValue()) {
                    qc.a("Failed to get SafeBrowsing metadata", e2);
                }
                return ad.a((Throwable) new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f5312g) {
            synchronized (this.f5315j) {
                this.a.f4993c = 9;
            }
        }
        return e();
    }

    @Override // com.google.android.gms.internal.ads.b8
    public final void a(View view) {
        if (this.f5313h.f6090d && !this.f5317l) {
            x0.f();
            Bitmap b2 = u9.b(view);
            if (b2 == null) {
                a8.a("Failed to capture the webview bitmap.");
                return;
            }
            this.f5317l = true;
            u9.a(new t7(this, b2));
        }
    }

    @Override // com.google.android.gms.internal.ads.b8
    public final void a(String str) {
        synchronized (this.f5315j) {
            this.a.f5000j = str;
        }
    }

    @Override // com.google.android.gms.internal.ads.b8
    public final void a(String str, Map<String, String> map, int i2) {
        synchronized (this.f5315j) {
            if (i2 == 3) {
                this.f5318m = true;
            }
            if (this.f5307b.containsKey(str)) {
                if (i2 == 3) {
                    this.f5307b.get(str).f5788j = Integer.valueOf(i2);
                }
                return;
            }
            uv uvVar = new uv();
            uvVar.f5788j = Integer.valueOf(i2);
            uvVar.f5781c = Integer.valueOf(this.f5307b.size());
            uvVar.f5782d = str;
            uvVar.f5783e = new pv();
            if (this.f5316k.size() > 0 && map != null) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    try {
                        String key = entry.getKey() != null ? entry.getKey() : "";
                        String value = entry.getValue() != null ? entry.getValue() : "";
                        if (this.f5316k.contains(key.toLowerCase(Locale.ENGLISH))) {
                            ov ovVar = new ov();
                            ovVar.f5191c = key.getBytes("UTF-8");
                            ovVar.f5192d = value.getBytes("UTF-8");
                            arrayList.add(ovVar);
                        }
                    } catch (UnsupportedEncodingException unused) {
                        a8.a("Cannot convert string to bytes, skip header.");
                    }
                }
                ov[] ovVarArr = new ov[arrayList.size()];
                arrayList.toArray(ovVarArr);
                uvVar.f5783e.f5265d = ovVarArr;
            }
            this.f5307b.put(str, uvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.b8
    public final boolean a() {
        return n.g() && this.f5313h.f6090d && !this.f5317l;
    }

    @Override // com.google.android.gms.internal.ads.b8
    public final String[] a(String[] strArr) {
        return (String[]) this.f5314i.a(strArr).toArray(new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.b8
    public final y7 b() {
        return this.f5313h;
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        synchronized (this.f5315j) {
            this.f5308c.add(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.b8
    public final void c() {
        synchronized (this.f5315j) {
            ld a2 = ad.a(this.f5311f.a(this.f5310e, this.f5307b.keySet()), new r7(this), rd.f5433b);
            ld a3 = ad.a(a2, 10, TimeUnit.SECONDS, o);
            ad.a(a2, new u7(this, a3), rd.f5433b);
            n.add(a3);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(String str) {
        synchronized (this.f5315j) {
            this.f5309d.add(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.b8
    public final void d() {
    }
}
