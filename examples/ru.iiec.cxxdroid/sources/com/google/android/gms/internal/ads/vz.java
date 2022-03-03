package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

public final class vz implements b10 {
    private final WeakReference<View> a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<q8> f5854b;

    public vz(View view, q8 q8Var) {
        this.a = new WeakReference<>(view);
        this.f5854b = new WeakReference<>(q8Var);
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final boolean a() {
        return this.a.get() == null || this.f5854b.get() == null;
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final b10 b() {
        return new uz(this.a.get(), this.f5854b.get());
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final View c() {
        return this.a.get();
    }
}
