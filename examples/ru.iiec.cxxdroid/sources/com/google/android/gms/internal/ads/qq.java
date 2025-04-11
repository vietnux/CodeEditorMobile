package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class qq extends oq {

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f5353d;

    /* renamed from: e  reason: collision with root package name */
    private int f5354e;

    /* renamed from: f  reason: collision with root package name */
    private int f5355f;

    /* renamed from: g  reason: collision with root package name */
    private int f5356g;

    /* renamed from: h  reason: collision with root package name */
    private int f5357h;

    /* renamed from: i  reason: collision with root package name */
    private int f5358i;

    /* renamed from: j  reason: collision with root package name */
    private int f5359j;

    private qq(byte[] bArr, int i2, int i3, boolean z) {
        super();
        this.f5359j = Integer.MAX_VALUE;
        this.f5353d = bArr;
        this.f5354e = i3 + i2;
        this.f5356g = i2;
        this.f5357h = this.f5356g;
    }

    private final byte A() {
        int i2 = this.f5356g;
        if (i2 != this.f5354e) {
            byte[] bArr = this.f5353d;
            this.f5356g = i2 + 1;
            return bArr[i2];
        }
        throw sr.b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int v() {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qq.v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long w() {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qq.w():long");
    }

    private final int x() {
        int i2 = this.f5356g;
        if (this.f5354e - i2 >= 4) {
            byte[] bArr = this.f5353d;
            this.f5356g = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }
        throw sr.b();
    }

    private final long y() {
        int i2 = this.f5356g;
        if (this.f5354e - i2 >= 8) {
            byte[] bArr = this.f5353d;
            this.f5356g = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }
        throw sr.b();
    }

    private final void z() {
        this.f5354e += this.f5355f;
        int i2 = this.f5354e;
        int i3 = i2 - this.f5357h;
        int i4 = this.f5359j;
        if (i3 > i4) {
            this.f5355f = i3 - i4;
            this.f5354e = i2 - this.f5355f;
            return;
        }
        this.f5355f = 0;
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final double a() {
        return Double.longBitsToDouble(y());
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final void a(int i2) {
        if (this.f5358i != i2) {
            throw sr.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final float b() {
        return Float.intBitsToFloat(x());
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final boolean b(int i2) {
        int d2;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.f5354e - this.f5356g >= 10) {
                while (i4 < 10) {
                    byte[] bArr = this.f5353d;
                    int i5 = this.f5356g;
                    this.f5356g = i5 + 1;
                    if (bArr[i5] < 0) {
                        i4++;
                    }
                }
                throw sr.d();
            }
            while (i4 < 10) {
                if (A() < 0) {
                    i4++;
                }
            }
            throw sr.d();
            return true;
        } else if (i3 == 1) {
            f(8);
            return true;
        } else if (i3 == 2) {
            f(v());
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
                f(4);
                return true;
            }
            throw sr.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final int c(int i2) {
        if (i2 >= 0) {
            int t = i2 + t();
            int i3 = this.f5359j;
            if (t <= i3) {
                this.f5359j = t;
                z();
                return i3;
            }
            throw sr.b();
        }
        throw sr.c();
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final String c() {
        int v = v();
        if (v > 0) {
            int i2 = this.f5354e;
            int i3 = this.f5356g;
            if (v <= i2 - i3) {
                String str = new String(this.f5353d, i3, v, or.a);
                this.f5356g += v;
                return str;
            }
        }
        if (v == 0) {
            return "";
        }
        if (v < 0) {
            throw sr.c();
        }
        throw sr.b();
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final int d() {
        if (s()) {
            this.f5358i = 0;
            return 0;
        }
        this.f5358i = v();
        int i2 = this.f5358i;
        if ((i2 >>> 3) != 0) {
            return i2;
        }
        throw sr.e();
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final void d(int i2) {
        this.f5359j = i2;
        z();
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final long e() {
        return w();
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final long f() {
        return w();
    }

    public final void f(int i2) {
        if (i2 >= 0) {
            int i3 = this.f5354e;
            int i4 = this.f5356g;
            if (i2 <= i3 - i4) {
                this.f5356g = i4 + i2;
                return;
            }
        }
        if (i2 < 0) {
            throw sr.c();
        }
        throw sr.b();
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final int g() {
        return v();
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final long h() {
        return y();
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final int i() {
        return x();
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final boolean j() {
        return w() != 0;
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final String k() {
        int v = v();
        if (v > 0) {
            int i2 = this.f5354e;
            int i3 = this.f5356g;
            if (v <= i2 - i3) {
                if (lu.a(this.f5353d, i3, i3 + v)) {
                    int i4 = this.f5356g;
                    this.f5356g = i4 + v;
                    return new String(this.f5353d, i4, v, or.a);
                }
                throw sr.i();
            }
        }
        if (v == 0) {
            return "";
        }
        if (v <= 0) {
            throw sr.c();
        }
        throw sr.b();
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final fq l() {
        byte[] bArr;
        int v = v();
        if (v > 0) {
            int i2 = this.f5354e;
            int i3 = this.f5356g;
            if (v <= i2 - i3) {
                fq a = fq.a(this.f5353d, i3, v);
                this.f5356g += v;
                return a;
            }
        }
        if (v == 0) {
            return fq.f4347c;
        }
        if (v > 0) {
            int i4 = this.f5354e;
            int i5 = this.f5356g;
            if (v <= i4 - i5) {
                this.f5356g = v + i5;
                bArr = Arrays.copyOfRange(this.f5353d, i5, this.f5356g);
                return fq.b(bArr);
            }
        }
        if (v > 0) {
            throw sr.b();
        } else if (v == 0) {
            bArr = or.f5189b;
            return fq.b(bArr);
        } else {
            throw sr.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final int m() {
        return v();
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final int n() {
        return v();
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final int o() {
        return x();
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final long p() {
        return y();
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final int q() {
        return oq.e(v());
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final long r() {
        return oq.a(w());
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final boolean s() {
        return this.f5356g == this.f5354e;
    }

    @Override // com.google.android.gms.internal.ads.oq
    public final int t() {
        return this.f5356g - this.f5357h;
    }

    /* access modifiers changed from: package-private */
    public final long u() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte A = A();
            j2 |= ((long) (A & Byte.MAX_VALUE)) << i2;
            if ((A & 128) == 0) {
                return j2;
            }
        }
        throw sr.d();
    }
}
