package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.x0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@k2
public final class m80 {
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f4939b;

    /* renamed from: c  reason: collision with root package name */
    private Context f4940c = null;

    /* renamed from: d  reason: collision with root package name */
    private String f4941d = null;

    public m80(Context context, String str) {
        this.f4940c = context;
        this.f4941d = str;
        this.a = (String) a50.g().a(k80.O);
        this.f4939b = new LinkedHashMap();
        this.f4939b.put("s", "gmob_sdk");
        this.f4939b.put("v", "3");
        this.f4939b.put("os", Build.VERSION.RELEASE);
        this.f4939b.put("sdk", Build.VERSION.SDK);
        Map<String, String> map = this.f4939b;
        x0.f();
        map.put("device", u9.c());
        this.f4939b.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        Map<String, String> map2 = this.f4939b;
        x0.f();
        map2.put("is_lite_sdk", u9.m(context) ? "1" : "0");
        Future<g5> a2 = x0.q().a(this.f4940c);
        try {
            a2.get();
            this.f4939b.put("network_coarse", Integer.toString(a2.get().n));
            this.f4939b.put("network_fine", Integer.toString(a2.get().o));
        } catch (Exception e2) {
            x0.j().a(e2, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* access modifiers changed from: package-private */
    public final Context a() {
        return this.f4940c;
    }

    /* access modifiers changed from: package-private */
    public final String b() {
        return this.f4941d;
    }

    /* access modifiers changed from: package-private */
    public final String c() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> d() {
        return this.f4939b;
    }
}
