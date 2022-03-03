package com.google.firebase.iid;

import android.os.Bundle;
import e.b.b.a.e.h;

final /* synthetic */ class f0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final e0 f6617b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f6618c;

    /* renamed from: d  reason: collision with root package name */
    private final h f6619d;

    f0(e0 e0Var, Bundle bundle, h hVar) {
        this.f6617b = e0Var;
        this.f6618c = bundle;
        this.f6619d = hVar;
    }

    public final void run() {
        this.f6617b.a(this.f6618c, this.f6619d);
    }
}
