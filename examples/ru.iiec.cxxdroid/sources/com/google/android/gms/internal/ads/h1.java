package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final g1 f4464b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f4465c;

    /* renamed from: d  reason: collision with root package name */
    private final wd f4466d;

    h1(g1 g1Var, JSONObject jSONObject, wd wdVar) {
        this.f4464b = g1Var;
        this.f4465c = jSONObject;
        this.f4466d = wdVar;
    }

    public final void run() {
        this.f4464b.a(this.f4465c, this.f4466d);
    }
}
