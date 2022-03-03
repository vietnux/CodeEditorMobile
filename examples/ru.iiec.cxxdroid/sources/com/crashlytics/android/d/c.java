package com.crashlytics.android.d;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import f.a.a.a.i;
import f.a.a.a.l;
import f.a.a.a.n.a.b;
import f.a.a.a.n.b.m;
import f.a.a.a.n.b.p;
import f.a.a.a.n.b.t;
import f.a.a.a.n.f.d;
import f.a.a.a.n.g.g;
import f.a.a.a.n.g.r;
import f.a.a.a.n.g.u;
import java.util.HashMap;
import java.util.Map;

public class c extends i<Boolean> implements m {

    /* renamed from: h  reason: collision with root package name */
    private final b<String> f2890h = new b<>();

    /* renamed from: i  reason: collision with root package name */
    private final h f2891i = new h();

    /* renamed from: j  reason: collision with root package name */
    private j f2892j;

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081 A[SYNTHETIC, Splitter:B:27:0x0081] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.crashlytics.android.d.d a(android.content.Context r8) {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.d.c.a(android.content.Context):com.crashlytics.android.d.d");
    }

    private String a(Context context, String str) {
        String str2 = null;
        try {
            String a = this.f2890h.a(context, this.f2891i);
            if (!"".equals(a)) {
                str2 = a;
            }
        } catch (Exception e2) {
            f.a.a.a.c.g().c("Beta", "Failed to load the Beta device token", e2);
        }
        l g2 = f.a.a.a.c.g();
        StringBuilder sb = new StringBuilder();
        sb.append("Beta device token present: ");
        sb.append(!TextUtils.isEmpty(str2));
        g2.e("Beta", sb.toString());
        return str2;
    }

    private g u() {
        u a = r.d().a();
        if (a != null) {
            return a.f8589f;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(14)
    public j a(int i2, Application application) {
        return i2 >= 14 ? new b(l().a(), l().c()) : new i();
    }

    /* access modifiers changed from: package-private */
    public boolean a(g gVar, d dVar) {
        return (gVar == null || TextUtils.isEmpty(gVar.a) || dVar == null) ? false : true;
    }

    @Override // f.a.a.a.n.b.m
    public Map<p.a, String> h() {
        String a = a(j(), m().h());
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(a)) {
            hashMap.put(p.a.FONT_TOKEN, a);
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    @Override // f.a.a.a.i
    public Boolean i() {
        boolean z;
        f.a.a.a.c.g().e("Beta", "Beta kit initializing...");
        Context j2 = j();
        p m2 = m();
        if (TextUtils.isEmpty(a(j2, m2.h()))) {
            f.a.a.a.c.g().e("Beta", "A Beta device token was not found for this app");
            z = false;
        } else {
            f.a.a.a.c.g().e("Beta", "Beta device token is present, checking for app updates.");
            g u = u();
            d a = a(j2);
            if (a(u, a)) {
                this.f2892j.a(j2, this, m2, u, a, new d(this), new t(), new f.a.a.a.n.e.b(f.a.a.a.c.g()));
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // f.a.a.a.i
    public String n() {
        return "com.crashlytics.sdk.android:beta";
    }

    @Override // f.a.a.a.i
    public String p() {
        return "1.2.7.19";
    }

    /* access modifiers changed from: protected */
    @Override // f.a.a.a.i
    @TargetApi(14)
    public boolean s() {
        this.f2892j = a(Build.VERSION.SDK_INT, (Application) j().getApplicationContext());
        return true;
    }

    /* access modifiers changed from: package-private */
    public String t() {
        return f.a.a.a.n.b.i.b(j(), "com.crashlytics.ApiEndpoint");
    }
}
