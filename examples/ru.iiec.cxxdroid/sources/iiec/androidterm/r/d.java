package iiec.androidterm.r;

public class d {
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private int f9358b;

    /* renamed from: c  reason: collision with root package name */
    private int f9359c;

    /* renamed from: d  reason: collision with root package name */
    private int f9360d;

    public d(int i2, int i3) {
        this.a = i2;
        this.f9358b = i3;
        e();
    }

    public d(int[] iArr) {
        int length = iArr.length;
        if (length == 2 || length == 4) {
            this.a = iArr[0];
            this.f9358b = iArr[1];
            if (length == 2) {
                e();
                return;
            }
            this.f9359c = iArr[2];
            this.f9360d = iArr[3];
            return;
        }
        throw new IllegalArgumentException();
    }

    private static int a(int i2, int i3) {
        return (a(i2, i3, 0) * 3) + (a(i2, i3, 1) * 5) + a(i2, i3, 2);
    }

    private static int a(int i2, int i3, int i4) {
        return Math.abs(b(i2, i4) - b(i3, i4));
    }

    private static int b(int i2, int i3) {
        return (i2 >> ((2 - i3) * 8)) & 255;
    }

    private void e() {
        this.f9360d = -8355712;
        this.f9359c = a(this.a, this.f9360d) * 2 >= a(this.f9358b, this.f9360d) ? this.a : this.f9358b;
    }

    public int a() {
        return this.f9358b;
    }

    public int b() {
        return this.f9360d;
    }

    public int c() {
        return this.f9359c;
    }

    public int d() {
        return this.a;
    }
}
