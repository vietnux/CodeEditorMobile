package com.google.android.gms.internal.ads;

import android.view.View;

final class di implements View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b8 f4114b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ ai f4115c;

    di(ai aiVar, b8 b8Var) {
        this.f4115c = aiVar;
        this.f4114b = b8Var;
    }

    public final void onViewAttachedToWindow(View view) {
        ai.a(this.f4115c, view, this.f4114b, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
