package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.x;

@k2
public final class v5 extends b6 {

    /* renamed from: b  reason: collision with root package name */
    private final String f5810b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5811c;

    public v5(String str, int i2) {
        this.f5810b = str;
        this.f5811c = i2;
    }

    @Override // com.google.android.gms.internal.ads.a6
    public final int J() {
        return this.f5811c;
    }

    @Override // com.google.android.gms.internal.ads.a6
    public final String a() {
        return this.f5810b;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof v5)) {
            v5 v5Var = (v5) obj;
            return x.a(this.f5810b, v5Var.f5810b) && x.a(Integer.valueOf(this.f5811c), Integer.valueOf(v5Var.f5811c));
        }
    }
}
