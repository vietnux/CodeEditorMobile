package iiec.androidterm.r;

/* access modifiers changed from: package-private */
public class g {
    int[] a;

    /* renamed from: b  reason: collision with root package name */
    int f9387b = 0;

    g(int i2) {
        this.a = new int[i2];
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        int i3 = this.f9387b + 1;
        int[] iArr = this.a;
        if (i3 > iArr.length) {
            int[] iArr2 = new int[Math.max((iArr.length * 3) >> 1, 16)];
            System.arraycopy(this.a, 0, iArr2, 0, this.f9387b);
            this.a = iArr2;
        }
        int[] iArr3 = this.a;
        int i4 = this.f9387b;
        this.f9387b = i4 + 1;
        iArr3[i4] = i2;
    }

    /* access modifiers changed from: package-private */
    public int b(int i2) {
        return this.a[i2];
    }
}
