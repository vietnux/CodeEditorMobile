package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.gmsg.e0;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class m90 implements e0<Object> {
    private final /* synthetic */ l90 a;

    m90(l90 l90) {
        this.a = l90;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final void zza(Object obj, Map<String, String> map) {
        try {
            this.a.f4855f = Long.valueOf(Long.parseLong(map.get("timestamp")));
        } catch (NumberFormatException unused) {
            qc.a("Failed to call parse unconfirmedClickTimestamp.");
        }
        this.a.f4854e = map.get("id");
        String str = map.get("asset_id");
        if (this.a.f4852c == null) {
            qc.b("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            this.a.f4852c.f(str);
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }
}
