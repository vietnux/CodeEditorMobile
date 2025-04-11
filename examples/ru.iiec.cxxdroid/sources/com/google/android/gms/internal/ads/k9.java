package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.l;
import com.google.android.gms.common.m;
import java.io.IOException;

/* access modifiers changed from: package-private */
public final class k9 extends g9 {

    /* renamed from: d  reason: collision with root package name */
    private Context f4800d;

    k9(Context context) {
        this.f4800d = context;
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void d() {
        boolean z;
        try {
            z = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.f4800d);
        } catch (l | m | IOException | IllegalStateException e2) {
            qc.b("Fail to get isAdIdFakeForDebugLogging", e2);
            z = false;
        }
        jc.a(z);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        qc.d(sb.toString());
    }
}
