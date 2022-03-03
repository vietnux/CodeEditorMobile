package com.google.android.gms.internal.ads;

import android.view.View;

final class ci implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ View f4026b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ b8 f4027c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f4028d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ ai f4029e;

    ci(ai aiVar, View view, b8 b8Var, int i2) {
        this.f4029e = aiVar;
        this.f4026b = view;
        this.f4027c = b8Var;
        this.f4028d = i2;
    }

    public final void run() {
        ai.a(this.f4029e, this.f4026b, this.f4027c, this.f4028d - 1);
    }
}
