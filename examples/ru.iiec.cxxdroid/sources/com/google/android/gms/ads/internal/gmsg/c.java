package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.internal.ads.k2;
import java.util.Map;

@k2
public final class c implements e0<Object> {
    private final Context a;

    public c(Context context) {
        this.a = context;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final void zza(Object obj, Map<String, String> map) {
        if (x0.C().d(this.a)) {
            x0.C().a(this.a, map.get("eventName"), map.get("eventId"));
        }
    }
}
