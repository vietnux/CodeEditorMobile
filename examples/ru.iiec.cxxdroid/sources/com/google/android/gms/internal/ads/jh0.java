package com.google.android.gms.internal.ads;

import android.content.Context;

@k2
public final class jh0 {
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private qh0 f4713b;

    public final qh0 a(Context context, sc scVar) {
        qh0 qh0;
        synchronized (this.a) {
            if (this.f4713b == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.f4713b = new qh0(context, scVar, (String) a50.g().a(k80.a));
            }
            qh0 = this.f4713b;
        }
        return qh0;
    }
}
