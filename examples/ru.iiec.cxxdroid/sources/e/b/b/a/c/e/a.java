package e.b.b.a.c.e;

public final class a {
    private final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7139b;

    /* renamed from: c  reason: collision with root package name */
    private int f7140c;

    /* renamed from: d  reason: collision with root package name */
    private int f7141d;

    /* renamed from: e  reason: collision with root package name */
    private int f7142e;

    /* renamed from: f  reason: collision with root package name */
    private int f7143f;

    /* renamed from: g  reason: collision with root package name */
    private int f7144g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    private int f7145h;

    /* renamed from: i  reason: collision with root package name */
    private int f7146i = 64;

    private a(byte[] bArr, int i2, int i3) {
        this.a = bArr;
        this.f7139b = i2;
        this.f7140c = i3 + i2;
        this.f7142e = i2;
    }

    public static a a(byte[] bArr, int i2, int i3) {
        return new a(bArr, 0, i3);
    }

    private final void f(int i2) {
        if (i2 >= 0) {
            int i3 = this.f7142e;
            int i4 = i3 + i2;
            int i5 = this.f7144g;
            if (i4 > i5) {
                f(i5 - i3);
                throw i.b();
            } else if (i2 <= this.f7140c - i3) {
                this.f7142e = i3 + i2;
            } else {
                throw i.b();
            }
        } else {
            throw i.c();
        }
    }

    private final void j() {
        this.f7140c += this.f7141d;
        int i2 = this.f7140c;
        int i3 = this.f7144g;
        if (i2 > i3) {
            this.f7141d = i2 - i3;
            this.f7140c = i2 - this.f7141d;
            return;
        }
        this.f7141d = 0;
    }

    private final byte k() {
        int i2 = this.f7142e;
        if (i2 != this.f7140c) {
            byte[] bArr = this.a;
            this.f7142e = i2 + 1;
            return bArr[i2];
        }
        throw i.b();
    }

    public final int a() {
        return this.f7142e - this.f7139b;
    }

    public final int a(int i2) {
        if (i2 >= 0) {
            int i3 = i2 + this.f7142e;
            int i4 = this.f7144g;
            if (i3 <= i4) {
                this.f7144g = i3;
                j();
                return i4;
            }
            throw i.b();
        }
        throw i.c();
    }

    public final void a(j jVar) {
        int e2 = e();
        if (this.f7145h < this.f7146i) {
            int a2 = a(e2);
            this.f7145h++;
            jVar.a(this);
            b(0);
            this.f7145h--;
            d(a2);
            return;
        }
        throw i.e();
    }

    public final byte[] a(int i2, int i3) {
        if (i3 == 0) {
            return m.f7424c;
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.a, this.f7139b + i2, bArr, 0, i3);
        return bArr;
    }

    public final String b() {
        int e2 = e();
        if (e2 >= 0) {
            int i2 = this.f7140c;
            int i3 = this.f7142e;
            if (e2 <= i2 - i3) {
                String str = new String(this.a, i3, e2, h.a);
                this.f7142e += e2;
                return str;
            }
            throw i.b();
        }
        throw i.c();
    }

    public final void b(int i2) {
        if (this.f7143f != i2) {
            throw new i("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2, int i3) {
        int i4 = this.f7142e;
        int i5 = this.f7139b;
        if (i2 > i4 - i5) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i2);
            sb.append(" is beyond current ");
            sb.append(i4 - i5);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= 0) {
            this.f7142e = i5 + i2;
            this.f7143f = i3;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final int c() {
        if (this.f7142e == this.f7140c) {
            this.f7143f = 0;
            return 0;
        }
        this.f7143f = e();
        int i2 = this.f7143f;
        if (i2 != 0) {
            return i2;
        }
        throw new i("Protocol message contained an invalid tag (zero).");
    }

    public final boolean c(int i2) {
        int c2;
        int i3 = i2 & 7;
        if (i3 == 0) {
            e();
            return true;
        } else if (i3 == 1) {
            h();
            return true;
        } else if (i3 == 2) {
            f(e());
            return true;
        } else if (i3 == 3) {
            do {
                c2 = c();
                if (c2 == 0) {
                    break;
                }
            } while (c(c2));
            b(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                g();
                return true;
            }
            throw new i("Protocol message tag had invalid wire type.");
        }
    }

    public final void d(int i2) {
        this.f7144g = i2;
        j();
    }

    public final boolean d() {
        return e() != 0;
    }

    public final int e() {
        int i2;
        byte k2 = k();
        if (k2 >= 0) {
            return k2;
        }
        int i3 = k2 & Byte.MAX_VALUE;
        byte k3 = k();
        if (k3 >= 0) {
            i2 = k3 << 7;
        } else {
            i3 |= (k3 & Byte.MAX_VALUE) << 7;
            byte k4 = k();
            if (k4 >= 0) {
                i2 = k4 << 14;
            } else {
                i3 |= (k4 & Byte.MAX_VALUE) << 14;
                byte k5 = k();
                if (k5 >= 0) {
                    i2 = k5 << 21;
                } else {
                    int i4 = i3 | ((k5 & Byte.MAX_VALUE) << 21);
                    byte k6 = k();
                    int i5 = i4 | (k6 << 28);
                    if (k6 >= 0) {
                        return i5;
                    }
                    for (int i6 = 0; i6 < 5; i6++) {
                        if (k() >= 0) {
                            return i5;
                        }
                    }
                    throw i.d();
                }
            }
        }
        return i3 | i2;
    }

    public final void e(int i2) {
        b(i2, this.f7143f);
    }

    public final long f() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte k2 = k();
            j2 |= ((long) (k2 & Byte.MAX_VALUE)) << i2;
            if ((k2 & 128) == 0) {
                return j2;
            }
        }
        throw i.d();
    }

    public final int g() {
        return (k() & 255) | ((k() & 255) << 8) | ((k() & 255) << 16) | ((k() & 255) << 24);
    }

    public final long h() {
        byte k2 = k();
        byte k3 = k();
        return ((((long) k3) & 255) << 8) | (((long) k2) & 255) | ((((long) k()) & 255) << 16) | ((((long) k()) & 255) << 24) | ((((long) k()) & 255) << 32) | ((((long) k()) & 255) << 40) | ((((long) k()) & 255) << 48) | ((((long) k()) & 255) << 56);
    }

    public final int i() {
        int i2 = this.f7144g;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - this.f7142e;
    }
}
