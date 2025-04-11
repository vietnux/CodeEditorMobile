package com.google.android.gms.internal.ads;

import android.view.View;

/* access modifiers changed from: package-private */
public final class og implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ View f5162b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ b8 f5163c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f5164d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ mg f5165e;

    og(mg mgVar, View view, b8 b8Var, int i2) {
        this.f5165e = mgVar;
        this.f5162b = view;
        this.f5163c = b8Var;
        this.f5164d = i2;
    }

    public final void run() {
        this.f5165e.a((mg) this.f5162b, (View) this.f5163c, (b8) (this.f5164d - 1));
    }
}
