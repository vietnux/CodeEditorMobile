package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.wd;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class b implements e0<Object> {
    private final HashMap<String, wd<JSONObject>> a = new HashMap<>();

    public final Future<JSONObject> a(String str) {
        wd<JSONObject> wdVar = new wd<>();
        this.a.put(str, wdVar);
        return wdVar;
    }

    public final void b(String str) {
        wd<JSONObject> wdVar = this.a.get(str);
        if (wdVar == null) {
            qc.a("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!wdVar.isDone()) {
            wdVar.cancel(true);
        }
        this.a.remove(str);
    }

    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("request_id");
        String str2 = map.get("fetched_ad");
        qc.b("Received ad from the cache.");
        wd<JSONObject> wdVar = this.a.get(str);
        if (wdVar == null) {
            qc.a("Could not find the ad request for the corresponding ad response.");
            return;
        }
        try {
            wdVar.b(new JSONObject(str2));
        } catch (JSONException e2) {
            qc.b("Failed constructing JSON object from value passed from javascript", e2);
            wdVar.b(null);
        } finally {
            this.a.remove(str);
        }
    }
}
