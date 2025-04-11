package e.b.b.a.c.c;

public final class a {
    private final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7110b;

    /* renamed from: c  reason: collision with root package name */
    private int f7111c;

    /* renamed from: d  reason: collision with root package name */
    private int f7112d;

    /* renamed from: e  reason: collision with root package name */
    private int f7113e;

    /* renamed from: f  reason: collision with root package name */
    private int f7114f;

    /* renamed from: g  reason: collision with root package name */
    private int f7115g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    private int f7116h;

    /* renamed from: i  reason: collision with root package name */
    private int f7117i = 64;

    private a(byte[] bArr, int i2, int i3) {
        this.a = bArr;
        this.f7110b = i2;
        this.f7111c = i3 + i2;
        this.f7113e = i2;
    }

    public static a a(byte[] bArr, int i2, int i3) {
        return new a(bArr, 0, i3);
    }

    private final void c(int i2) {
        if (i2 >= 0) {
            int i3 = this.f7113e;
            int i4 = i3 + i2;
            int i5 = this.f7115g;
            if (i4 > i5) {
                c(i5 - i3);
                throw i.b();
            } else if (i2 <= this.f7111c - i3) {
                this.f7113e = i3 + i2;
            } else {
                throw i.b();
            }
        } else {
            throw i.c();
        }
    }

    private final void g() {
        this.f7111c += this.f7112d;
        int i2 = this.f7111c;
        int i3 = this.f7115g;
        if (i2 > i3) {
            this.f7112d = i2 - i3;
            this.f7111c = i2 - this.f7112d;
            return;
        }
        this.f7112d = 0;
    }

    private final byte h() {
        int i2 = this.f7113e;
        if (i2 != this.f7111c) {
            byte[] bArr = this.a;
            this.f7113e = i2 + 1;
            return bArr[i2];
        }
        throw i.b();
    }

    public final int a() {
        return this.f7113e - this.f7110b;
    }

    public final void a(int i2) {
        if (this.f7114f != i2) {
            throw new i("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final void a(j jVar) {
        int f2 = f();
        if (this.f7116h >= this.f7117i) {
            throw new i("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        } else if (f2 >= 0) {
            int i2 = f2 + this.f7113e;
            int i3 = this.f7115g;
            if (i2 <= i3) {
                this.f7115g = i2;
                g();
                this.f7116h++;
                jVar.a(this);
                a(0);
                this.f7116h--;
                this.f7115g = i3;
                g();
                return;
            }
            throw i.b();
        } else {
            throw i.c();
        }
    }

    public final byte[] a(int i2, int i3) {
        if (i3 == 0) {
            return m.a;
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.a, this.f7110b + i2, bArr, 0, i3);
        return bArr;
    }

    public final String b() {
        int f2 = f();
        if (f2 >= 0) {
            int i2 = this.f7111c;
            int i3 = this.f7113e;
            if (f2 <= i2 - i3) {
                String str = new String(this.a, i3, f2, h.a);
                this.f7113e += f2;
                return str;
            }
            throw i.b();
        }
        throw i.c();
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2, int i3) {
        int i4 = this.f7113e;
        int i5 = this.f7110b;
        if (i2 > i4 - i5) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i2);
            sb.append(" is beyond current ");
            sb.append(i4 - i5);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= 0) {
            this.f7113e = i5 + i2;
            this.f7114f = 106;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final boolean b(int i2) {
        int c2;
        int i3 = i2 & 7;
        if (i3 == 0) {
            f();
            return true;
        } else if (i3 == 1) {
            h();
            h();
            h();
            h();
            h();
            h();
            h();
            h();
            return true;
        } else if (i3 == 2) {
            c(f());
            return true;
        } else if (i3 == 3) {
            do {
                c2 = c();
                if (c2 == 0) {
                    break;
                }
            } while (b(c2));
            a(((i2 >>> 3) << 3) | 4);
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
            throw new i("Protocol message tag had invalid wire type.");
        }
    }

    public final int c() {
        if (this.f7113e == this.f7111c) {
            this.f7114f = 0;
            return 0;
        }
        this.f7114f = f();
        int i2 = this.f7114f;
        if (i2 != 0) {
            return i2;
        }
        throw new i("Protocol message contained an invalid tag (zero).");
    }

    public final long d() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte h2 = h();
            j2 |= ((long) (h2 & Byte.MAX_VALUE)) << i2;
            if ((h2 & 128) == 0) {
                return j2;
            }
        }
        throw i.d();
    }

    public final int e() {
        return f();
    }

    public final int f() {
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
                    throw i.d();
                }
            }
        }
        return i3 | i2;
    }
}
