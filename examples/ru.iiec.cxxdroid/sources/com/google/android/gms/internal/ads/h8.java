package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h8 implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final g8 f4501b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f4502c;

    h8(g8 g8Var, Context context) {
        this.f4501b = g8Var;
        this.f4502c = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f4501b.c(this.f4502c);
    }
}
