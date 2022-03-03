package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class ek<P> {
    private final P a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f4223b;

    public ek(P p, byte[] bArr, fn fnVar, yn ynVar) {
        this.a = p;
        this.f4223b = Arrays.copyOf(bArr, bArr.length);
    }

    public final P a() {
        return this.a;
    }

    public final byte[] b() {
        byte[] bArr = this.f4223b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
