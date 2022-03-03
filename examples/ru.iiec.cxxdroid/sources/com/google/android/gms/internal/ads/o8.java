package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.l;
import com.google.android.gms.common.m;
import java.io.IOException;

final class o8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f5129b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ wd f5130c;

    o8(n8 n8Var, Context context, wd wdVar) {
        this.f5129b = context;
        this.f5130c = wdVar;
    }

    public final void run() {
        try {
            this.f5130c.b(AdvertisingIdClient.getAdvertisingIdInfo(this.f5129b));
        } catch (l | m | IOException | IllegalStateException e2) {
            this.f5130c.a(e2);
            qc.b("Exception while getting advertising Id info", e2);
        }
    }
}
