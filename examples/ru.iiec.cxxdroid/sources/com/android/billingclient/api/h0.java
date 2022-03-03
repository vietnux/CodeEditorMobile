package com.android.billingclient.api;

import java.util.concurrent.Callable;

public final /* synthetic */ class h0 implements Callable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f2743b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f2744c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f2745d;

    public /* synthetic */ h0(d dVar, k kVar, String str) {
        this.f2743b = dVar;
        this.f2744c = kVar;
        this.f2745d = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f2743b.a(this.f2744c, this.f2745d);
    }
}
