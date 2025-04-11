package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.e0;
import com.google.android.gms.ads.internal.x0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class w0 implements Callable<q8> {
    private static long p = 10;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5855b;

    /* renamed from: c  reason: collision with root package name */
    private final eb f5856c;

    /* renamed from: d  reason: collision with root package name */
    private final e0 f5857d;

    /* renamed from: e  reason: collision with root package name */
    private final cx f5858e;

    /* renamed from: f  reason: collision with root package name */
    private final o1 f5859f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f5860g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private final r8 f5861h;

    /* renamed from: i  reason: collision with root package name */
    private final x80 f5862i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5863j;

    /* renamed from: k  reason: collision with root package name */
    private int f5864k;

    /* renamed from: l  reason: collision with root package name */
    private List<String> f5865l;

    /* renamed from: m  reason: collision with root package name */
    private JSONObject f5866m;
    private String n;
    private String o;

    public w0(Context context, e0 e0Var, eb ebVar, cx cxVar, r8 r8Var, x80 x80) {
        this.f5855b = context;
        this.f5857d = e0Var;
        this.f5856c = ebVar;
        this.f5861h = r8Var;
        this.f5858e = cxVar;
        this.f5862i = x80;
        this.f5859f = e0Var.q2();
        this.f5863j = false;
        this.f5864k = -2;
        this.f5865l = null;
        this.n = null;
        this.o = null;
    }

    private final ld<o90> a(JSONObject jSONObject, boolean z, boolean z2) {
        String string = z ? jSONObject.getString("url") : jSONObject.optString("url");
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (!TextUtils.isEmpty(string)) {
            return z2 ? ad.a(new o90(null, Uri.parse(string), optDouble)) : this.f5856c.a(string, new d1(this, z, optDouble, optBoolean, string));
        }
        a(0, z);
        return ad.a((Object) null);
    }

    private static lg a(ld<lg> ldVar) {
        try {
            return (lg) ldVar.get((long) ((Integer) a50.g().a(k80.c2)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            qc.c("", e2);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException | ExecutionException | TimeoutException e3) {
            qc.c("", e3);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r4.length() != 0) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x014e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01f0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.q8 call() {
        /*
        // Method dump skipped, instructions count: 504
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w0.call():com.google.android.gms.internal.ads.q8");
    }

    private final q8 a(da0 da0, boolean z) {
        int i2;
        synchronized (this.f5860g) {
            i2 = (da0 == null && this.f5864k == -2) ? 0 : this.f5864k;
        }
        da0 da02 = i2 != -2 ? null : da0;
        r8 r8Var = this.f5861h;
        j3 j3Var = r8Var.a;
        j40 j40 = j3Var.f4662d;
        n3 n3Var = r8Var.f5394b;
        return new q8(j40, null, n3Var.f5027f, i2, n3Var.f5029h, this.f5865l, n3Var.n, n3Var.f5034m, j3Var.f4668j, false, null, null, null, null, null, 0, r8Var.f5396d, n3Var.f5030i, r8Var.f5398f, r8Var.f5399g, n3Var.q, this.f5866m, da02, null, null, null, n3Var.H, n3Var.I, null, n3Var.L, this.n, r8Var.f5401i, n3Var.T, r8Var.f5402j, z, n3Var.W, n3Var.X, this.o);
    }

    /* access modifiers changed from: private */
    public static <V> List<V> a(List<ld<V>> list) {
        ArrayList arrayList = new ArrayList();
        for (ld<V> ldVar : list) {
            Object obj = ldVar.get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void a(int i2) {
        synchronized (this.f5860g) {
            this.f5863j = true;
            this.f5864k = i2;
        }
    }

    /* access modifiers changed from: private */
    public final void a(tb0 tb0, String str) {
        try {
            ec0 n2 = this.f5857d.n(tb0.n());
            if (n2 != null) {
                n2.a(tb0, str);
            }
        } catch (RemoteException e2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            qc.c(sb.toString(), e2);
        }
    }

    static lg b(ld<lg> ldVar) {
        try {
            return (lg) ldVar.get((long) ((Integer) a50.g().a(k80.b2)).intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            qc.c("InterruptedException occurred while waiting for video to load", e2);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException | ExecutionException | TimeoutException e3) {
            qc.c("Exception occurred while waiting for video to load", e3);
            return null;
        }
    }

    private static Integer b(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final boolean b() {
        boolean z;
        synchronized (this.f5860g) {
            z = this.f5863j;
        }
        return z;
    }

    public final ld<k90> a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return ad.a((Object) null);
        }
        String optString = optJSONObject.optString("text");
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer b2 = b(optJSONObject, "text_color");
        Integer b3 = b(optJSONObject, "bg_color");
        int optInt2 = optJSONObject.optInt("animation_ms", 1000);
        int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        na0 na0 = this.f5861h.a.z;
        int i2 = (na0 == null || na0.f5079b < 2) ? 1 : na0.f5083f;
        boolean optBoolean = optJSONObject.optBoolean("allow_pub_rendering");
        List<ld<o90>> arrayList = new ArrayList<>();
        if (optJSONObject.optJSONArray("images") != null) {
            arrayList = a(optJSONObject, "images", false, false, true);
        } else {
            arrayList.add(a(optJSONObject, "image", false, false));
        }
        wd wdVar = new wd();
        int size = arrayList.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (ld<o90> ldVar : arrayList) {
            ldVar.a(new e1(atomicInteger, size, wdVar, arrayList), s9.a);
            arrayList = arrayList;
        }
        return ad.a(wdVar, new c1(this, optString, b3, b2, optInt, optInt3, optInt2, i2, optBoolean), s9.a);
    }

    public final ld<lg> a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return ad.a((Object) null);
        }
        if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
            qc.d("Required field 'vast_xml' is missing");
            return ad.a((Object) null);
        }
        g1 g1Var = new g1(this.f5855b, this.f5858e, this.f5861h, this.f5862i, this.f5857d);
        wd wdVar = new wd();
        rd.a.execute(new h1(g1Var, optJSONObject, wdVar));
        return wdVar;
    }

    public final ld<o90> a(JSONObject jSONObject, String str, boolean z, boolean z2) {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return a(jSONObject2, z, z2);
    }

    public final List<ld<o90>> a(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        ArrayList arrayList = new ArrayList();
        if (optJSONArray == null || optJSONArray.length() == 0) {
            a(0, false);
            return arrayList;
        }
        int length = z3 ? optJSONArray.length() : 1;
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(a(jSONObject2, false, z2));
        }
        return arrayList;
    }

    public final Future<o90> a(JSONObject jSONObject, String str, boolean z) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        boolean optBoolean = jSONObject2.optBoolean("require", true);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return a(jSONObject2, optBoolean, z);
    }

    public final void a(int i2, boolean z) {
        if (z) {
            a(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(wd wdVar, String str) {
        try {
            x0.g();
            lg a = sg.a(this.f5855b, zh.e(), "native-omid", false, false, this.f5858e, this.f5861h.a.f4670l, this.f5862i, null, this.f5857d.x0(), this.f5861h.f5401i);
            a.M().a(new y0(wdVar, a));
            a.loadData(str, "text/html", "UTF-8");
        } catch (Exception e2) {
            wdVar.b(null);
            qc.c("", e2);
        }
    }
}
