package com.android.billingclient.api;

import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class i0 implements Callable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f2746b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f2747c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ List f2748d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ m f2749e;

    public /* synthetic */ i0(d dVar, String str, List list, String str2, m mVar) {
        this.f2746b = dVar;
        this.f2747c = str;
        this.f2748d = list;
        this.f2749e = mVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f2746b.a(this.f2747c, this.f2748d, (String) null, this.f2749e);
        return null;
    }
}
