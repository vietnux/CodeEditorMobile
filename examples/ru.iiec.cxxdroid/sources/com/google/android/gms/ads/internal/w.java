package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.gmsg.e0;
import com.google.android.gms.internal.ads.lg;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* access modifiers changed from: package-private */
public final class w implements e0<lg> {
    private final /* synthetic */ CountDownLatch a;

    w(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final /* synthetic */ void zza(lg lgVar, Map map) {
        this.a.countDown();
        lgVar.getView().setVisibility(0);
    }
}
