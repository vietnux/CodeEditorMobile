package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.qc;
import java.util.Map;

final class y implements e0<Object> {
    y() {
    }

    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final void zza(Object obj, Map<String, String> map) {
        String valueOf = String.valueOf(map.get("string"));
        qc.c(valueOf.length() != 0 ? "Received log message: ".concat(valueOf) : new String("Received log message: "));
    }
}
