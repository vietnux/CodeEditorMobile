package iiec.androidterm.r;

/* access modifiers changed from: package-private */
public class c {
    private byte[] a;

    /* renamed from: b  reason: collision with root package name */
    private int f9356b;

    /* renamed from: c  reason: collision with root package name */
    private int f9357c;

    public c(int i2) {
        this.a = new byte[i2];
    }

    public int a() {
        int i2;
        synchronized (this) {
            i2 = this.f9357c;
        }
        return i2;
    }

    public int a(byte[] bArr, int i2, int i3) {
        int i4;
        if (i3 + i2 > bArr.length) {
            throw new IllegalArgumentException("length + offset > buffer.length");
        } else if (i3 < 0) {
            throw new IllegalArgumentException("length < 0");
        } else if (i3 == 0) {
            return 0;
        } else {
            synchronized (this) {
                while (this.f9357c == 0) {
                    wait();
                }
                int length = this.a.length;
                boolean z = length == this.f9357c;
                int i5 = i2;
                i4 = 0;
                while (i3 > 0 && this.f9357c > 0) {
                    int min = Math.min(i3, Math.min(length - this.f9356b, this.f9357c));
                    System.arraycopy(this.a, this.f9356b, bArr, i5, min);
                    this.f9356b += min;
                    if (this.f9356b >= length) {
                        this.f9356b = 0;
                    }
                    this.f9357c -= min;
                    i3 -= min;
                    i5 += min;
                    i4 += min;
                }
                if (z) {
                    notify();
                }
            }
            return i4;
        }
    }

    public int b(byte[] bArr, int i2, int i3) {
        int min;
        if (i3 + i2 > bArr.length) {
            throw new IllegalArgumentException("length + offset > buffer.length");
        } else if (i3 >= 0) {
            boolean z = false;
            if (i3 == 0) {
                return 0;
            }
            synchronized (this) {
                int length = this.a.length;
                if (this.f9357c == 0) {
                    z = true;
                }
                while (length == this.f9357c) {
                    wait();
                }
                int i4 = this.f9356b + this.f9357c;
                if (i4 >= length) {
                    i4 -= length;
                    length = this.f9356b;
                }
                min = Math.min(length - i4, i3);
                System.arraycopy(bArr, i2, this.a, i4, min);
                this.f9357c += min;
                if (z) {
                    notify();
                }
            }
            return min;
        } else {
            throw new IllegalArgumentException("length < 0");
        }
    }
}
