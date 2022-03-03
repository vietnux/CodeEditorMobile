package e.b.b.a.c.b;

public final class y {
    private final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7102b;

    /* renamed from: c  reason: collision with root package name */
    private int f7103c;

    /* renamed from: d  reason: collision with root package name */
    private int f7104d;

    /* renamed from: e  reason: collision with root package name */
    private int f7105e;

    /* renamed from: f  reason: collision with root package name */
    private int f7106f;

    /* renamed from: g  reason: collision with root package name */
    private int f7107g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    private int f7108h;

    /* renamed from: i  reason: collision with root package name */
    private int f7109i = 64;

    private y(byte[] bArr, int i2, int i3) {
        this.a = bArr;
        this.f7102b = 0;
        this.f7103c = i3 + 0;
        this.f7105e = 0;
    }

    public static y a(byte[] bArr, int i2, int i3) {
        return new y(bArr, 0, i3);
    }

    private final void b(int i2) {
        if (this.f7106f != i2) {
            throw new h0("Protocol message end-group tag did not match expected tag.");
        }
    }

    private final void c(int i2) {
        if (i2 >= 0) {
            int i3 = this.f7105e;
            int i4 = i3 + i2;
            int i5 = this.f7107g;
            if (i4 > i5) {
                c(i5 - i3);
                throw h0.b();
            } else if (i2 <= this.f7103c - i3) {
                this.f7105e = i3 + i2;
            } else {
                throw h0.b();
            }
        } else {
            throw h0.c();
        }
    }

    private final void g() {
        this.f7103c += this.f7104d;
        int i2 = this.f7103c;
        int i3 = this.f7107g;
        if (i2 > i3) {
            this.f7104d = i2 - i3;
            this.f7103c = i2 - this.f7104d;
            return;
        }
        this.f7104d = 0;
    }

    private final byte h() {
        int i2 = this.f7105e;
        if (i2 != this.f7103c) {
            byte[] bArr = this.a;
            this.f7105e = i2 + 1;
            return bArr[i2];
        }
        throw h0.b();
    }

    public final int a() {
        return this.f7105e - this.f7102b;
    }

    public final void a(i0 i0Var) {
        int e2 = e();
        if (this.f7108h >= this.f7109i) {
            throw new h0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        } else if (e2 >= 0) {
            int i2 = e2 + this.f7105e;
            int i3 = this.f7107g;
            if (i2 <= i3) {
                this.f7107g = i2;
                g();
                this.f7108h++;
                i0Var.a(this);
                b(0);
                this.f7108h--;
                this.f7107g = i3;
                g();
                return;
            }
            throw h0.b();
        } else {
            throw h0.c();
        }
    }

    public final boolean a(int i2) {
        int d2;
        int i3 = i2 & 7;
        if (i3 == 0) {
            e();
            return true;
        } else if (i3 == 1) {
            f();
            return true;
        } else if (i3 == 2) {
            c(e());
            return true;
        } else if (i3 == 3) {
            do {
                d2 = d();
                if (d2 == 0) {
                    break;
                }
            } while (a(d2));
            b(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                h();
                h();
                h();
                h();
                return true;
            }
            throw new h0("Protocol message tag had invalid wire type.");
        }
    }

    public final byte[] a(int i2, int i3) {
        if (i3 == 0) {
            return l0.f7053b;
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.a, this.f7102b + i2, bArr, 0, i3);
        return bArr;
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2, int i3) {
        int i4 = this.f7105e;
        int i5 = this.f7102b;
        if (i2 > i4 - i5) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i2);
            sb.append(" is beyond current ");
            sb.append(i4 - i5);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= 0) {
            this.f7105e = i5 + i2;
            this.f7106f = i3;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final byte[] b() {
        int e2 = e();
        if (e2 < 0) {
            throw h0.c();
        } else if (e2 == 0) {
            return l0.f7053b;
        } else {
            int i2 = this.f7103c;
            int i3 = this.f7105e;
            if (e2 <= i2 - i3) {
                byte[] bArr = new byte[e2];
                System.arraycopy(this.a, i3, bArr, 0, e2);
                this.f7105e += e2;
                return bArr;
            }
            throw h0.b();
        }
    }

    public final String c() {
        int e2 = e();
        if (e2 >= 0) {
            int i2 = this.f7103c;
            int i3 = this.f7105e;
            if (e2 <= i2 - i3) {
                String str = new String(this.a, i3, e2, g0.a);
                this.f7105e += e2;
                return str;
            }
            throw h0.b();
        }
        throw h0.c();
    }

    public final int d() {
        if (this.f7105e == this.f7103c) {
            this.f7106f = 0;
            return 0;
        }
        this.f7106f = e();
        int i2 = this.f7106f;
        if (i2 != 0) {
            return i2;
        }
        throw new h0("Protocol message contained an invalid tag (zero).");
    }

    public final int e() {
        int i2;
        byte h2 = h();
        if (h2 >= 0) {
            return h2;
        }
        int i3 = h2 & Byte.MAX_VALUE;
        byte h3 = h();
        if (h3 >= 0) {
            i2 = h3 << 7;
        } else {
            i3 |= (h3 & Byte.MAX_VALUE) << 7;
            byte h4 = h();
            if (h4 >= 0) {
                i2 = h4 << 14;
            } else {
                i3 |= (h4 & Byte.MAX_VALUE) << 14;
                byte h5 = h();
                if (h5 >= 0) {
                    i2 = h5 << 21;
                } else {
                    int i4 = i3 | ((h5 & Byte.MAX_VALUE) << 21);
                    byte h6 = h();
                    int i5 = i4 | (h6 << 28);
                    if (h6 >= 0) {
                        return i5;
                    }
                    for (int i6 = 0; i6 < 5; i6++) {
                        if (h() >= 0) {
                            return i5;
                        }
                    }
                    throw new h0("CodedInputStream encountered a malformed varint.");
                }
            }
        }
        return i3 | i2;
    }

    public final long f() {
        byte h2 = h();
        byte h3 = h();
        return ((((long) h3) & 255) << 8) | (((long) h2) & 255) | ((((long) h()) & 255) << 16) | ((((long) h()) & 255) << 24) | ((((long) h()) & 255) << 32) | ((((long) h()) & 255) << 40) | ((((long) h()) & 255) << 48) | ((((long) h()) & 255) << 56);
    }
}
