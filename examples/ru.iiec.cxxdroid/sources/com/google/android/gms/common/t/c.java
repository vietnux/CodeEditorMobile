package com.google.android.gms.common.t;

import android.content.Context;

public class c {

    /* renamed from: b  reason: collision with root package name */
    private static c f3712b = new c();
    private b a = null;

    public static b b(Context context) {
        return f3712b.a(context);
    }

    public synchronized b a(Context context) {
        if (this.a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.a = new b(context);
        }
        return this.a;
    }
}
