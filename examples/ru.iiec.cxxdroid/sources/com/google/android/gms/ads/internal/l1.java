package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.b8;

final class l1 implements View.OnTouchListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ v1 f3240b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j1 f3241c;

    l1(j1 j1Var, v1 v1Var) {
        this.f3241c = j1Var;
        this.f3240b = v1Var;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f3240b.a();
        b8 b8Var = this.f3241c.f3216c;
        if (b8Var == null) {
            return false;
        }
        b8Var.d();
        return false;
    }
}
