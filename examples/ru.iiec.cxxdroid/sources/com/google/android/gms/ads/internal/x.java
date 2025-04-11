package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.gmsg.e0;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.qc;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* access modifiers changed from: package-private */
public final class x implements e0<lg> {
    private final /* synthetic */ CountDownLatch a;

    x(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final /* synthetic */ void zza(lg lgVar, Map map) {
        qc.d("Adapter returned an ad, but assets substitution failed");
        this.a.countDown();
        lgVar.destroy();
    }
}
