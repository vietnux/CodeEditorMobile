package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.e0;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class ga0 implements e0<Object> {
    private final WeakReference<ca0> a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4413b;

    public ga0(ca0 ca0, String str) {
        this.a = new WeakReference<>(ca0);
        this.f4413b = str;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final void zza(Object obj, Map<String, String> map) {
        ca0 ca0;
        String str = map.get("ads_id");
        String str2 = map.get("eventName");
        if (!TextUtils.isEmpty(str) && this.f4413b.equals(str)) {
            try {
                Integer.parseInt(map.get("eventType"));
            } catch (Exception e2) {
                qc.b("Parse Scion log event type error", e2);
            }
            if ("_ai".equals(str2)) {
                ca0 ca02 = this.a.get();
                if (ca02 != null) {
                    ca02.Z1();
                }
            } else if ("_ac".equals(str2) && (ca0 = this.a.get()) != null) {
                ca0.L1();
            }
        }
    }
}
