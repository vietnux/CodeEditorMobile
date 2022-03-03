package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class kv {
    final int a;

    /* renamed from: b  reason: collision with root package name */
    final byte[] f4838b;

    kv(int i2, byte[] bArr) {
        this.a = i2;
        this.f4838b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kv)) {
            return false;
        }
        kv kvVar = (kv) obj;
        return this.a == kvVar.a && Arrays.equals(this.f4838b, kvVar.f4838b);
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.f4838b);
    }
}
