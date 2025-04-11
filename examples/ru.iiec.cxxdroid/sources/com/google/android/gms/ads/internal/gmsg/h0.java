package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.qc;
import java.util.Map;

@k2
public final class h0 implements e0<Object> {
    private final i0 a;

    public h0(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final void zza(Object obj, Map<String, String> map) {
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f2 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f2 = Float.parseFloat(map.get("blurRadius"));
            }
        } catch (NumberFormatException e2) {
            qc.b("Fail to parse float", e2);
        }
        this.a.m(equals);
        this.a.a(equals2, f2);
    }
}
