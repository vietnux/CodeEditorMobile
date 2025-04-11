package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.j40;
import com.google.android.gms.internal.ads.k80;
import com.google.android.gms.internal.ads.sc;
import java.util.Map;
import java.util.TreeMap;

/* access modifiers changed from: package-private */
public final class w0 {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f3348b = new TreeMap();

    /* renamed from: c  reason: collision with root package name */
    private String f3349c;

    /* renamed from: d  reason: collision with root package name */
    private String f3350d;

    public w0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.f3349c;
    }

    public final void a(j40 j40, sc scVar) {
        this.f3349c = j40.f4683k.f5215b;
        Bundle bundle = j40.n;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) a50.g().a(k80.x2);
            for (String str2 : bundle2.keySet()) {
                if (str.equals(str2)) {
                    this.f3350d = bundle2.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    this.f3348b.put(str2.substring(4), bundle2.getString(str2));
                }
            }
            this.f3348b.put("SDKVersion", scVar.f5529b);
        }
    }

    public final String b() {
        return this.f3350d;
    }

    public final String c() {
        return this.a;
    }

    public final Map<String, String> d() {
        return this.f3348b;
    }
}
