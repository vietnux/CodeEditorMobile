package e.b.b.a.c.b;

import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class k0 {
    final int a;

    /* renamed from: b  reason: collision with root package name */
    final byte[] f7052b;

    k0(int i2, byte[] bArr) {
        this.a = i2;
        this.f7052b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.a == k0Var.a && Arrays.equals(this.f7052b, k0Var.f7052b);
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.f7052b);
    }
}
