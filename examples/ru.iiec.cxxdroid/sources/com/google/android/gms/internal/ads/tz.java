package com.google.android.gms.internal.ads;

import android.view.View;

public final class tz implements b10 {
    private aa0 a;

    public tz(aa0 aa0) {
        this.a = aa0;
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final boolean a() {
        return this.a == null;
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final b10 b() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final View c() {
        aa0 aa0 = this.a;
        if (aa0 != null) {
            return aa0.I1();
        }
        return null;
    }
}
