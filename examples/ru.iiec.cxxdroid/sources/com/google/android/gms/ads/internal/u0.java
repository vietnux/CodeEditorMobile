package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.bx;
import com.google.android.gms.internal.ads.cx;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class u0 implements Callable<cx> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r0 f3339b;

    u0(r0 r0Var) {
        this.f3339b = r0Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ cx call() {
        return new cx(bx.a(this.f3339b.f3321b.f5529b, this.f3339b.f3324e, false));
    }
}
