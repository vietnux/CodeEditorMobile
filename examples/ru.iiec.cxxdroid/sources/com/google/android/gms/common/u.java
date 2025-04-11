package com.google.android.gms.common;

import com.google.android.gms.common.i;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class u extends i.a {

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f3713c;

    u(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f3713c = bArr;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.i.a
    public final byte[] M() {
        return this.f3713c;
    }
}
