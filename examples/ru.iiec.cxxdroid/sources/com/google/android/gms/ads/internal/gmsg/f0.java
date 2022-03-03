package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.ff0;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.u9;
import java.util.Map;
import org.json.JSONObject;

final class f0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Map f3168b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ff0 f3169c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ HttpClient f3170d;

    f0(HttpClient httpClient, Map map, ff0 ff0) {
        this.f3170d = httpClient;
        this.f3168b = map;
        this.f3169c = ff0;
    }

    public final void run() {
        qc.b("Received Http request.");
        try {
            JSONObject send = this.f3170d.send(new JSONObject((String) this.f3168b.get("http_request")));
            if (send == null) {
                qc.a("Response should not be null.");
            } else {
                u9.f5718h.post(new g0(this, send));
            }
        } catch (Exception e2) {
            qc.b("Error converting request to json.", e2);
        }
    }
}
