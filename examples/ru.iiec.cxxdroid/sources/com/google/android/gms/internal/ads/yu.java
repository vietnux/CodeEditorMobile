package com.google.android.gms.internal.ads;

public final class yu {
    private final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6155b;

    /* renamed from: c  reason: collision with root package name */
    private int f6156c;

    /* renamed from: d  reason: collision with root package name */
    private int f6157d;

    /* renamed from: e  reason: collision with root package name */
    private int f6158e;

    /* renamed from: f  reason: collision with root package name */
    private int f6159f;

    /* renamed from: g  reason: collision with root package name */
    private int f6160g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    private int f6161h;

    /* renamed from: i  reason: collision with root package name */
    private int f6162i = 64;

    private yu(byte[] bArr, int i2, int i3) {
        this.a = bArr;
        this.f6155b = i2;
        this.f6156c = i3 + i2;
        this.f6158e = i2;
    }

    public static yu a(byte[] bArr, int i2, int i3) {
        return new yu(bArr, 0, i3);
    }

    private final void f(int i2) {
        if (i2 >= 0) {
            int i3 = this.f6158e;
            int i4 = i3 + i2;
            int i5 = this.f6160g;
            if (i4 > i5) {
                f(i5 - i3);
                throw hv.b();
            } else if (i2 <= this.f6156c - i3) {
                this.f6158e = i3 + i2;
            } else {
                throw hv.b();
            }
        } else {
            throw hv.c();
        }
    }

    private final void k() {
        this.f6156c += this.f6157d;
        int i2 = this.f6156c;
        int i3 = this.f6160g;
        if (i2 > i3) {
            this.f6157d = i2 - i3;
            this.f6156c = i2 - this.f6157d;
            return;
        }
        this.f6157d = 0;
    }

    private final byte l() {
        int i2 = this.f6158e;
        if (i2 != this.f6156c) {
            byte[] bArr = this.a;
            this.f6158e = i2 + 1;
            return bArr[i2];
        }
        throw hv.b();
    }

    public final int a() {
        return this.f6158e - this.f6155b;
    }

    public final void a(int i2) {
        if (this.f6159f != i2) {
            throw new hv("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final void a(iv ivVar) {
        int h2 = h();
        if (this.f6161h < this.f6162i) {
            int c2 = c(h2);
            this.f6161h++;
            ivVar.a(this);
            a(0);
            this.f6161h--;
            d(c2);
            return;
        }
        throw new hv("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final byte[] a(int i2, int i3) {
        if (i3 == 0) {
            return lv.f4907e;
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.a, this.f6155b + i2, bArr, 0, i3);
        return bArr;
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2, int i3) {
        int i4 = this.f6158e;
        int i5 = this.f6155b;
        if (i2 > i4 - i5) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i2);
            sb.append(" is beyond current ");
            sb.append(i4 - i5);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= 0) {
            this.f6158e = i5 + i2;
            this.f6159f = i3;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final boolean b(int i2) {
        int d2;
        int i3 = i2 & 7;
        if (i3 == 0) {
            h();
            return true;
        } else if (i3 == 1) {
            l();
            l();
            l();
            l();
            l();
            l();
            l();
            l();
            return true;
        } else if (i3 == 2) {
            f(h());
            return true;
        } else if (i3 == 3) {
            do {
                d2 = d();
                if (d2 == 0) {
                    break;
                }
            } while (b(d2));
            a(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                l();
                l();
                l();
                l();
                return true;
            }
            throw new hv("Protocol message tag had invalid wire type.");
        }
    }

    public final byte[] b() {
        int h2 = h();
        if (h2 < 0) {
            throw hv.c();
        } else if (h2 == 0) {
            return lv.f4907e;
        } else {
            int i2 = this.f6156c;
            int i3 = this.f6158e;
            if (h2 <= i2 - i3) {
                byte[] bArr = new byte[h2];
                System.arraycopy(this.a, i3, bArr, 0, h2);
                this.f6158e += h2;
                return bArr;
            }
            throw hv.b();
        }
    }

    public final int c(int i2) {
        if (i2 >= 0) {
            int i3 = i2 + this.f6158e;
            int i4 = this.f6160g;
            if (i3 <= i4) {
                this.f6160g = i3;
                k();
                return i4;
            }
            throw hv.b();
        }
        throw hv.c();
    }

    public final String c() {
        int h2 = h();
        if (h2 >= 0) {
            int i2 = this.f6156c;
            int i3 = this.f6158e;
            if (h2 <= i2 - i3) {
                String str = new String(this.a, i3, h2, gv.a);
                this.f6158e += h2;
                return str;
            }
            throw hv.b();
        }
        throw hv.c();
    }

    public final int d() {
        if (this.f6158e == this.f6156c) {
            this.f6159f = 0;
            return 0;
        }
        this.f6159f = h();
        int i2 = this.f6159f;
        if (i2 != 0) {
            return i2;
        }
        throw new hv("Protocol message contained an invalid tag (zero).");
    }

    public final void d(int i2) {
        this.f6160g = i2;
        k();
    }

    public final long e() {
        return i();
    }

    public final void e(int i2) {
        b(i2, this.f6159f);
    }

    public final int f() {
        return h();
    }

    public final boolean g() {
        return h() != 0;
    }

    public final int h() {
        int i2;
        byte l2 = l();
        if (l2 >= 0) {
            return l2;
        }
        int i3 = l2 & Byte.MAX_VALUE;
        byte l3 = l();
        if (l3 >= 0) {
            i2 = l3 << 7;
        } else {
            i3 |= (l3 & Byte.MAX_VALUE) << 7;
            byte l4 = l();
            if (l4 >= 0) {
                i2 = l4 << 14;
            } else {
                i3 |= (l4 & Byte.MAX_VALUE) << 14;
                byte l5 = l();
                if (l5 >= 0) {
                    i2 = l5 << 21;
                } else {
                    int i4 = i3 | ((l5 & Byte.MAX_VALUE) << 21);
                    byte l6 = l();
                    int i5 = i4 | (l6 << 28);
                    if (l6 >= 0) {
                        return i5;
                    }
                    for (int i6 = 0; i6 < 5; i6++) {
                        if (l() >= 0) {
                            return i5;
                        }
                    }
                    throw hv.d();
                }
            }
        }
        return i3 | i2;
    }

    public final long i() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte l2 = l();
            j2 |= ((long) (l2 & Byte.MAX_VALUE)) << i2;
            if ((l2 & 128) == 0) {
                return j2;
            }
        }
        throw hv.d();
    }

    public final int j() {
        int i2 = this.f6160g;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - this.f6158e;
    }
}
