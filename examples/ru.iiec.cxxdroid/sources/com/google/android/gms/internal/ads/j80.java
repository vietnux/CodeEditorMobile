package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class j80 implements Callable<T> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ a80 f4690b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ i80 f4691c;

    j80(i80 i80, a80 a80) {
        this.f4691c = i80;
        this.f4690b = a80;
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return (T) this.f4690b.a(this.f4691c.f4598d);
    }
}
