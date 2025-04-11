package com.android.billingclient.api;

import com.android.billingclient.api.h;
import e.b.b.a.c.f.p;
import java.util.concurrent.Callable;

final class o implements Callable<Void> {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f2765b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ i f2766c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ d f2767d;

    o(d dVar, String str, i iVar) {
        this.f2767d = dVar;
        this.f2765b = str;
        this.f2766c = iVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Void call() {
        h.a a = d.a(this.f2767d, this.f2765b);
        if (a.b() != null) {
            this.f2766c.a(a.a(), a.b());
            return null;
        }
        this.f2766c.a(a.a(), p.e());
        return null;
    }
}
