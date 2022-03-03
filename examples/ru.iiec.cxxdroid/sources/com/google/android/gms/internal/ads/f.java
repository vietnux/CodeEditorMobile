package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.x0;
import java.util.Map;

@k2
public final class f {
    private final lg a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4248b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4249c;

    public f(lg lgVar, Map<String, String> map) {
        this.a = lgVar;
        this.f4249c = map.get("forceOrientation");
        this.f4248b = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean(map.get("allowOrientationChange")) : true;
    }

    public final void a() {
        if (this.a == null) {
            qc.d("AdWebView is null");
        } else {
            this.a.setRequestedOrientation("portrait".equalsIgnoreCase(this.f4249c) ? x0.h().b() : "landscape".equalsIgnoreCase(this.f4249c) ? x0.h().a() : this.f4248b ? -1 : x0.h().c());
        }
    }
}
