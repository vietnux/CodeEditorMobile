package com.google.android.gms.ads.internal;

import android.view.View;
import com.google.android.gms.internal.ads.b8;

final class m1 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ v1 f3244b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j1 f3245c;

    m1(j1 j1Var, v1 v1Var) {
        this.f3245c = j1Var;
        this.f3244b = v1Var;
    }

    public final void onClick(View view) {
        this.f3244b.a();
        b8 b8Var = this.f3245c.f3216c;
        if (b8Var != null) {
            b8Var.d();
        }
    }
}
