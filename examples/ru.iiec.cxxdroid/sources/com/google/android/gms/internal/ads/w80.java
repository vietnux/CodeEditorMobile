package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

@k2
public final class w80 {
    private final Map<String, v80> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final x80 f5897b;

    public w80(x80 x80) {
        this.f5897b = x80;
    }

    public final x80 a() {
        return this.f5897b;
    }

    public final void a(String str, v80 v80) {
        this.a.put(str, v80);
    }

    public final void a(String str, String str2, long j2) {
        x80 x80 = this.f5897b;
        v80 v80 = this.a.get(str2);
        String[] strArr = {str};
        if (!(x80 == null || v80 == null)) {
            x80.a(v80, j2, strArr);
        }
        Map<String, v80> map = this.a;
        x80 x802 = this.f5897b;
        map.put(str, x802 == null ? null : x802.a(j2));
    }
}
