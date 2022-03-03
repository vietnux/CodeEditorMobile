package com.google.android.gms.internal.ads;

import android.view.View;

final class qg implements View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b8 f5339b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ mg f5340c;

    qg(mg mgVar, b8 b8Var) {
        this.f5340c = mgVar;
        this.f5339b = b8Var;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f5340c.a((mg) view, (View) this.f5339b, (b8) 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
