package com.google.firebase.iid;

import android.util.Pair;
import e.b.b.a.e.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements m {
    private final j a;

    /* renamed from: b  reason: collision with root package name */
    private final m f6625b;

    /* renamed from: c  reason: collision with root package name */
    private final h f6626c;

    /* renamed from: d  reason: collision with root package name */
    private final Pair f6627d;

    l(j jVar, m mVar, h hVar, Pair pair) {
        this.a = jVar;
        this.f6625b = mVar;
        this.f6626c = hVar;
        this.f6627d = pair;
    }

    @Override // com.google.firebase.iid.m
    public final String a() {
        return this.a.a(this.f6625b, this.f6626c, this.f6627d);
    }
}
