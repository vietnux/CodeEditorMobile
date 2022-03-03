package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

public final class rz implements b10 {
    private WeakReference<aa0> a;

    public rz(aa0 aa0) {
        this.a = new WeakReference<>(aa0);
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final boolean a() {
        return this.a.get() == null;
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final b10 b() {
        return new tz(this.a.get());
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final View c() {
        aa0 aa0 = this.a.get();
        if (aa0 != null) {
            return aa0.I1();
        }
        return null;
    }
}
