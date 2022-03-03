package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

@k2
public final class i5 {
    private WeakHashMap<Context, k5> a = new WeakHashMap<>();

    public final Future<g5> a(Context context) {
        return s9.a(new j5(this, context));
    }
}
