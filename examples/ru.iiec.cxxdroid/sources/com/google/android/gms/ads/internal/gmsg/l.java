package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.qc;
import java.util.Map;

@k2
public final class l implements e0<Object> {
    private final m a;

    public l(m mVar) {
        this.a = mVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("name");
        if (str == null) {
            qc.d("App event with no name parameter.");
        } else {
            this.a.a(str, map.get("info"));
        }
    }
}
