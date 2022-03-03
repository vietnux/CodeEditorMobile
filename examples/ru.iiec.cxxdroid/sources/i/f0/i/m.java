package i.f0.i;

import java.util.Arrays;

public final class m {
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f9085b = new int[10];

    /* access modifiers changed from: package-private */
    public int a(int i2) {
        return this.f9085b[i2];
    }

    /* access modifiers changed from: package-private */
    public m a(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.f9085b;
            if (i2 < iArr.length) {
                this.a = (1 << i2) | this.a;
                iArr[i2] = i3;
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.a = 0;
        Arrays.fill(this.f9085b, 0);
    }

    /* access modifiers changed from: package-private */
    public void a(m mVar) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (mVar.d(i2)) {
                a(i2, mVar.a(i2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        if ((this.a & 2) != 0) {
            return this.f9085b[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int b(int i2) {
        return (this.a & 16) != 0 ? this.f9085b[4] : i2;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        if ((this.a & 128) != 0) {
            return this.f9085b[7];
        }
        return 65535;
    }

    /* access modifiers changed from: package-private */
    public int c(int i2) {
        return (this.a & 32) != 0 ? this.f9085b[5] : i2;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return Integer.bitCount(this.a);
    }

    /* access modifiers changed from: package-private */
    public boolean d(int i2) {
        return ((1 << i2) & this.a) != 0;
    }
}
