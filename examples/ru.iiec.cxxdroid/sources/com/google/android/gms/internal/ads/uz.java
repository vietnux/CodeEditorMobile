package com.google.android.gms.internal.ads;

import android.view.View;

public final class uz implements b10 {
    private final View a;

    /* renamed from: b  reason: collision with root package name */
    private final q8 f5798b;

    public uz(View view, q8 q8Var) {
        this.a = view;
        this.f5798b = q8Var;
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final boolean a() {
        return this.f5798b == null || this.a == null;
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final b10 b() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final View c() {
        return this.a;
    }
}
