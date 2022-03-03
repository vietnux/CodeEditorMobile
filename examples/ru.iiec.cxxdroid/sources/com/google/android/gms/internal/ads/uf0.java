package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.e0;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class uf0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final tf0 f5732b;

    /* renamed from: c  reason: collision with root package name */
    private final e0 f5733c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f5734d;

    uf0(tf0 tf0, e0 e0Var, Map map) {
        this.f5732b = tf0;
        this.f5733c = e0Var;
        this.f5734d = map;
    }

    public final void run() {
        tf0 tf0 = this.f5732b;
        this.f5733c.zza(tf0.k(), this.f5734d);
    }
}
