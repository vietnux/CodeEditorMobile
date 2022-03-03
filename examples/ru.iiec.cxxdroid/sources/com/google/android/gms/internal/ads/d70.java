package com.google.android.gms.internal.ads;

import android.content.Context;

/* access modifiers changed from: package-private */
public final class d70 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f4085b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ c70 f4086c;

    d70(c70 c70, Context context) {
        this.f4086c = c70;
        this.f4085b = context;
    }

    public final void run() {
        this.f4086c.a(this.f4085b);
    }
}
