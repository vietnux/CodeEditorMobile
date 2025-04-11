package com.android.billingclient.api;

import android.os.Bundle;
import java.util.concurrent.Callable;

public final /* synthetic */ class n0 implements Callable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f2759b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2760c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f2761d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f2762e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f f2763f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Bundle f2764g;

    public /* synthetic */ n0(d dVar, int i2, k kVar, String str, f fVar, Bundle bundle) {
        this.f2759b = dVar;
        this.f2760c = i2;
        this.f2761d = kVar;
        this.f2762e = str;
        this.f2763f = fVar;
        this.f2764g = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f2759b.a(this.f2760c, this.f2761d, this.f2762e, this.f2763f, this.f2764g);
    }
}
