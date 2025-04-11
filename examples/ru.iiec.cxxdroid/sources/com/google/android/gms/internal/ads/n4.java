package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.e0;
import java.util.Map;

public final class n4 implements e0<Object> {
    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("request_id");
        String valueOf = String.valueOf(map.get("errors"));
        qc.d(valueOf.length() != 0 ? "Invalid request: ".concat(valueOf) : new String("Invalid request: "));
        f4.o.b(str);
    }
}
