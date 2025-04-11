package e.b.b.a.c.c;

import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class l {
    final int a;

    /* renamed from: b  reason: collision with root package name */
    final byte[] f7126b;

    l(int i2, byte[] bArr) {
        this.a = i2;
        this.f7126b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a == lVar.a && Arrays.equals(this.f7126b, lVar.f7126b);
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.f7126b);
    }
}
