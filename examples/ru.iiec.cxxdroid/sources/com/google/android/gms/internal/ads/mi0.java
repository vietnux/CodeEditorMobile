package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final class mi0 implements Callable<ii0> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ fi0 f4971b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ li0 f4972c;

    mi0(li0 li0, fi0 fi0) {
        this.f4972c = li0;
        this.f4971b = fi0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final ii0 call() {
        synchronized (li0.a(this.f4972c)) {
            if (li0.b(this.f4972c)) {
                return null;
            }
            return this.f4971b.a(li0.c(this.f4972c), li0.d(this.f4972c));
        }
    }
}
