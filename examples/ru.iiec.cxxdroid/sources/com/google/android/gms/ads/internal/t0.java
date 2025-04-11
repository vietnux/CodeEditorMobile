package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

/* access modifiers changed from: package-private */
public final class t0 implements View.OnTouchListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r0 f3334b;

    t0(r0 r0Var) {
        this.f3334b = r0Var;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f3334b.f3328i == null) {
            return false;
        }
        this.f3334b.f3328i.a(motionEvent);
        return false;
    }
}
