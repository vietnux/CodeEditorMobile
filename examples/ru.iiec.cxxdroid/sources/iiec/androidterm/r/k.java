package iiec.androidterm.r;

/* access modifiers changed from: package-private */
public final class k {
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private int f9388b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f9389c;

    k(int i2, int i3) {
        this.a = i2;
        this.f9388b = i3;
    }

    private int b(int i2) {
        int i3 = i2 * 3;
        byte[] bArr = this.f9389c;
        return ((bArr[i3 + 2] & 255) << 16) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8);
    }

    private void b() {
        this.f9389c = new byte[(this.f9388b * 3)];
        for (int i2 = 0; i2 < this.f9388b; i2++) {
            b(i2, this.a);
        }
    }

    private void b(int i2, int i3) {
        int i4 = i2 * 3;
        byte[] bArr = this.f9389c;
        bArr[i4] = (byte) (i3 & 255);
        bArr[i4 + 1] = (byte) ((i3 >> 8) & 255);
        bArr[i4 + 2] = (byte) ((i3 >> 16) & 255);
    }

    /* access modifiers changed from: package-private */
    public int a(int i2) {
        return this.f9389c == null ? this.a : b(i2);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.f9389c == null) {
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3) {
        if (i3 != this.a || this.f9389c != null) {
            a();
            b(i2, i3);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, k kVar, int i3, int i4) {
        if (this.f9389c == null && kVar.f9389c == null && i2 == 0 && i3 == 0 && i4 == this.f9388b) {
            kVar.a = this.a;
            return;
        }
        a();
        kVar.a();
        System.arraycopy(this.f9389c, i2 * 3, kVar.f9389c, i3 * 3, i4 * 3);
    }
}
