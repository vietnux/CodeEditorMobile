package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class sq extends eq {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f5550b = Logger.getLogger(sq.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f5551c = ju.b();
    uq a;

    /* access modifiers changed from: package-private */
    public static class a extends sq {

        /* renamed from: d  reason: collision with root package name */
        private final byte[] f5552d;

        /* renamed from: e  reason: collision with root package name */
        private final int f5553e;

        /* renamed from: f  reason: collision with root package name */
        private int f5554f;

        a(byte[] bArr, int i2, int i3) {
            super();
            if (bArr != null) {
                int i4 = i3 + 0;
                if ((i3 | 0 | (bArr.length - i4)) >= 0) {
                    this.f5552d = bArr;
                    this.f5554f = 0;
                    this.f5553e = i4;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i3)));
            }
            throw new NullPointerException("buffer");
        }

        @Override // com.google.android.gms.internal.ads.sq
        public final int a() {
            return this.f5553e - this.f5554f;
        }

        @Override // com.google.android.gms.internal.ads.sq
        public final void a(byte b2) {
            try {
                byte[] bArr = this.f5552d;
                int i2 = this.f5554f;
                this.f5554f = i2 + 1;
                bArr[i2] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5554f), Integer.valueOf(this.f5553e), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.sq
        public final void a(int i2) {
            if (i2 >= 0) {
                b(i2);
            } else {
                a((long) i2);
            }
        }

        @Override // com.google.android.gms.internal.ads.sq
        public final void a(int i2, int i3) {
            b((i2 << 3) | i3);
        }

        @Override // com.google.android.gms.internal.ads.sq
        public final void a(int i2, long j2) {
            a(i2, 0);
            a(j2);
        }

        @Override // com.google.android.gms.internal.ads.sq
        public final void a(int i2, fq fqVar) {
            a(i2, 2);
            b(fqVar);
        }

        @Override // com.google.android.gms.internal.ads.sq
        public final void a(int i2, ss ssVar) {
            a(1, 3);
            c(2, i2);
            a(3, 2);
            c(ssVar);
            a(1, 4);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.sq
        public final void a(int i2, ss ssVar, kt ktVar) {
            a(i2, 2);
            up upVar = (up) ssVar;
            int g2 = upVar.g();
            if (g2 == -1) {
                g2 = ktVar.a(upVar);
                upVar.a(g2);
            }
            b(g2);
            ktVar.a((Object) ssVar, (xu) this.a);
        }

        @Override // com.google.android.gms.internal.ads.sq
        public final void a(int i2, String str) {
            a(i2, 2);
            b(str);
        }

        @Override // com.google.android.gms.internal.ads.sq
        public final void a(int i2, boolean z) {
            a(i2, 0);
            a(z ? (byte) 1 : 0);
        }

        @Override // com.google.android.gms.internal.ads.sq
        public final void a(long j2) {
            if (!sq.f5551c || a() < 10) {
                while ((j2 & -128) != 0) {
                    byte[] bArr = this.f5552d;
                    int i2 = this.f5554f;
                    this.f5554f = i2 + 1;
                    bArr[i2] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f5552d;
                    int i3 = this.f5554f;
                    this.f5554f = i3 + 1;
                    bArr2[i3] = (byte) ((int) j2);
                } catch (IndexOutOfBoundsException e2) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5554f), Integer.valueOf(this.f5553e), 1), e2);
                }
            } else {
                while ((j2 & -128) != 0) {
                    byte[] bArr3 = this.f5552d;
                    int i4 = this.f5554f;
                    this.f5554f = i4 + 1;
                    ju.a(bArr3, (long) i4, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr4 = this.f5552d;
                int i5 = this.f5554f;
                this.f5554f = i5 + 1;
                ju.a(bArr4, (long) i5, (byte) ((int) j2));
            }
        }

        @Override // com.google.android.gms.internal.ads.eq
        public final void a(byte[] bArr, int i2, int i3) {
            b(bArr, i2, i3);
        }

        @Override // com.google.android.gms.internal.ads.sq
        public final void b(int i2) {
            if (!sq.f5551c || a() < 10) {
                while ((i2 & -128) != 0) {
                    byte[] bArr = this.f5552d;
                    int i3 = this.f5554f;
                    this.f5554f = i3 + 1;
                    bArr[i3] = (byte) ((i2 & 127) | 128);
                    i2 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f5552d;
                    int i4 = this.f5554f;
                    this.f5554f = i4 + 1;
                    bArr2[i4] = (byte) i2;
                } catch (IndexOutOfBoundsException e2) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5554f), Integer.valueOf(this.f5553e), 1), e2);
                }
            } else {
                while ((i2 & -128) != 0) {
                    byte[] bArr3 = this.f5552d;
                    int i5 = this.f5554f;
                    this.f5554f = i5 + 1;
                    ju.a(bArr3, (long) i5, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
                byte[] bArr4 = this.f5552d;
                int i6 = this.f5554f;
                this.f5554f = i6 + 1;
                ju.a(bArr4, (long) i6, (byte) i2);
            }
        }

        @Override // com.google.android.gms.internal.ads.sq
        public final void b(int i2, int i3) {
            a(i2, 0);
            a(i3);
        }

        @Override // com.google.android.gms.internal.ads.sq
        public final void b(int i2, fq fqVar) {
            a(1, 3);
            c(2, i2);
            a(3, fqVar);
            a(1, 4);
        }

        public final void b(fq fqVar) {
            b(fqVar.size());
            fqVar.a(this);
        }

        public final void b(String str) {
            int i2 = this.f5554f;
            try {
                int g2 = sq.g(str.length() * 3);
                int g3 = sq.g(str.length());
                if (g3 == g2) {
                    this.f5554f = i2 + g3;
                    int a = lu.a(str, this.f5552d, this.f5554f, a());
                    this.f5554f = i2;
                    b((a - i2) - g3);
                    this.f5554f = a;
                    return;
                }
                b(lu.a(str));
                this.f5554f = lu.a(str, this.f5552d, this.f5554f, a());
            } catch (ou e2) {
                this.f5554f = i2;
                a(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new b(e3);
            }
        }

        public final void b(byte[] bArr, int i2, int i3) {
            try {
                System.arraycopy(bArr, i2, this.f5552d, this.f5554f, i3);
                this.f5554f += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5554f), Integer.valueOf(this.f5553e), Integer.valueOf(i3)), e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.sq
        public final void c(int i2, int i3) {
            a(i2, 0);
            b(i3);
        }

        @Override // com.google.android.gms.internal.ads.sq
        public final void c(int i2, long j2) {
            a(i2, 1);
            c(j2);
        }

        @Override // com.google.android.gms.internal.ads.sq
        public final void c(long j2) {
            try {
                byte[] bArr = this.f5552d;
                int i2 = this.f5554f;
                this.f5554f = i2 + 1;
                bArr[i2] = (byte) ((int) j2);
                byte[] bArr2 = this.f5552d;
                int i3 = this.f5554f;
                this.f5554f = i3 + 1;
                bArr2[i3] = (byte) ((int) (j2 >> 8));
                byte[] bArr3 = this.f5552d;
                int i4 = this.f5554f;
                this.f5554f = i4 + 1;
                bArr3[i4] = (byte) ((int) (j2 >> 16));
                byte[] bArr4 = this.f5552d;
                int i5 = this.f5554f;
                this.f5554f = i5 + 1;
                bArr4[i5] = (byte) ((int) (j2 >> 24));
                byte[] bArr5 = this.f5552d;
                int i6 = this.f5554f;
                this.f5554f = i6 + 1;
                bArr5[i6] = (byte) ((int) (j2 >> 32));
                byte[] bArr6 = this.f5552d;
                int i7 = this.f5554f;
                this.f5554f = i7 + 1;
                bArr6[i7] = (byte) ((int) (j2 >> 40));
                byte[] bArr7 = this.f5552d;
                int i8 = this.f5554f;
                this.f5554f = i8 + 1;
                bArr7[i8] = (byte) ((int) (j2 >> 48));
                byte[] bArr8 = this.f5552d;
                int i9 = this.f5554f;
                this.f5554f = i9 + 1;
                bArr8[i9] = (byte) ((int) (j2 >> 56));
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5554f), Integer.valueOf(this.f5553e), 1), e2);
            }
        }

        public final void c(ss ssVar) {
            b(ssVar.b());
            ssVar.a(this);
        }

        @Override // com.google.android.gms.internal.ads.sq
        public final void d(int i2) {
            try {
                byte[] bArr = this.f5552d;
                int i3 = this.f5554f;
                this.f5554f = i3 + 1;
                bArr[i3] = (byte) i2;
                byte[] bArr2 = this.f5552d;
                int i4 = this.f5554f;
                this.f5554f = i4 + 1;
                bArr2[i4] = (byte) (i2 >> 8);
                byte[] bArr3 = this.f5552d;
                int i5 = this.f5554f;
                this.f5554f = i5 + 1;
                bArr3[i5] = (byte) (i2 >> 16);
                byte[] bArr4 = this.f5552d;
                int i6 = this.f5554f;
                this.f5554f = i6 + 1;
                bArr4[i6] = i2 >> 24;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5554f), Integer.valueOf(this.f5553e), 1), e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.sq
        public final void e(int i2, int i3) {
            a(i2, 5);
            d(i3);
        }
    }

    public static class b extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        b(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sq.b.<init>(java.lang.String, java.lang.Throwable):void");
        }

        b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private sq() {
    }

    public static int a(int i2, as asVar) {
        int e2 = e(i2);
        int b2 = asVar.b();
        return e2 + g(b2) + b2;
    }

    public static int a(as asVar) {
        int b2 = asVar.b();
        return g(b2) + b2;
    }

    public static int a(fq fqVar) {
        int size = fqVar.size();
        return g(size) + size;
    }

    public static int a(ss ssVar) {
        int b2 = ssVar.b();
        return g(b2) + b2;
    }

    static int a(ss ssVar, kt ktVar) {
        up upVar = (up) ssVar;
        int g2 = upVar.g();
        if (g2 == -1) {
            g2 = ktVar.a(upVar);
            upVar.a(g2);
        }
        return g(g2) + g2;
    }

    public static int a(String str) {
        int i2;
        try {
            i2 = lu.a(str);
        } catch (ou unused) {
            i2 = str.getBytes(or.a).length;
        }
        return g(i2) + i2;
    }

    public static sq a(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int b(double d2) {
        return 8;
    }

    public static int b(float f2) {
        return 4;
    }

    public static int b(int i2, double d2) {
        return e(i2) + 8;
    }

    public static int b(int i2, float f2) {
        return e(i2) + 4;
    }

    public static int b(int i2, as asVar) {
        return (e(1) << 1) + g(2, i2) + a(3, asVar);
    }

    public static int b(int i2, ss ssVar) {
        return (e(1) << 1) + g(2, i2) + e(3) + a(ssVar);
    }

    static int b(int i2, ss ssVar, kt ktVar) {
        return e(i2) + a(ssVar, ktVar);
    }

    public static int b(int i2, String str) {
        return e(i2) + a(str);
    }

    public static int b(int i2, boolean z) {
        return e(i2) + 1;
    }

    @Deprecated
    public static int b(ss ssVar) {
        return ssVar.b();
    }

    public static int b(boolean z) {
        return 1;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        return g(length) + length;
    }

    public static int c(int i2, fq fqVar) {
        int e2 = e(i2);
        int size = fqVar.size();
        return e2 + g(size) + size;
    }

    @Deprecated
    static int c(int i2, ss ssVar, kt ktVar) {
        int e2 = e(i2) << 1;
        up upVar = (up) ssVar;
        int g2 = upVar.g();
        if (g2 == -1) {
            g2 = ktVar.a(upVar);
            upVar.a(g2);
        }
        return e2 + g2;
    }

    public static int d(int i2, long j2) {
        return e(i2) + e(j2);
    }

    public static int d(int i2, fq fqVar) {
        return (e(1) << 1) + g(2, i2) + c(3, fqVar);
    }

    public static int d(long j2) {
        return e(j2);
    }

    public static int e(int i2) {
        return g(i2 << 3);
    }

    public static int e(int i2, long j2) {
        return e(i2) + e(j2);
    }

    public static int e(long j2) {
        int i2;
        if ((-128 & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if ((-34359738368L & j2) != 0) {
            i2 = 6;
            j2 >>>= 28;
        } else {
            i2 = 2;
        }
        if ((-2097152 & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & -16384) != 0 ? i2 + 1 : i2;
    }

    public static int f(int i2) {
        if (i2 >= 0) {
            return g(i2);
        }
        return 10;
    }

    public static int f(int i2, int i3) {
        return e(i2) + f(i3);
    }

    public static int f(int i2, long j2) {
        return e(i2) + e(i(j2));
    }

    public static int f(long j2) {
        return e(i(j2));
    }

    public static int g(int i2) {
        if ((i2 & -128) == 0) {
            return 1;
        }
        if ((i2 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i2) == 0) {
            return 3;
        }
        return (i2 & -268435456) == 0 ? 4 : 5;
    }

    public static int g(int i2, int i3) {
        return e(i2) + g(i3);
    }

    public static int g(int i2, long j2) {
        return e(i2) + 8;
    }

    public static int g(long j2) {
        return 8;
    }

    public static int h(int i2) {
        return g(l(i2));
    }

    public static int h(int i2, int i3) {
        return e(i2) + g(l(i3));
    }

    public static int h(int i2, long j2) {
        return e(i2) + 8;
    }

    public static int h(long j2) {
        return 8;
    }

    public static int i(int i2) {
        return 4;
    }

    public static int i(int i2, int i3) {
        return e(i2) + 4;
    }

    private static long i(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static int j(int i2) {
        return 4;
    }

    public static int j(int i2, int i3) {
        return e(i2) + 4;
    }

    public static int k(int i2) {
        return f(i2);
    }

    public static int k(int i2, int i3) {
        return e(i2) + f(i3);
    }

    private static int l(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    @Deprecated
    public static int m(int i2) {
        return g(i2);
    }

    public abstract int a();

    public abstract void a(byte b2);

    public final void a(double d2) {
        c(Double.doubleToRawLongBits(d2));
    }

    public final void a(float f2) {
        d(Float.floatToRawIntBits(f2));
    }

    public abstract void a(int i2);

    public final void a(int i2, double d2) {
        c(i2, Double.doubleToRawLongBits(d2));
    }

    public final void a(int i2, float f2) {
        e(i2, Float.floatToRawIntBits(f2));
    }

    public abstract void a(int i2, int i3);

    public abstract void a(int i2, long j2);

    public abstract void a(int i2, fq fqVar);

    public abstract void a(int i2, ss ssVar);

    /* access modifiers changed from: package-private */
    public abstract void a(int i2, ss ssVar, kt ktVar);

    public abstract void a(int i2, String str);

    public abstract void a(int i2, boolean z);

    public abstract void a(long j2);

    /* access modifiers changed from: package-private */
    public final void a(String str, ou ouVar) {
        f5550b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) ouVar);
        byte[] bytes = str.getBytes(or.a);
        try {
            b(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new b(e2);
        } catch (b e3) {
            throw e3;
        }
    }

    public final void a(boolean z) {
        a(z ? (byte) 1 : 0);
    }

    public final void b() {
        if (a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void b(int i2);

    public abstract void b(int i2, int i3);

    public final void b(int i2, long j2) {
        a(i2, i(j2));
    }

    public abstract void b(int i2, fq fqVar);

    public final void b(long j2) {
        a(i(j2));
    }

    public final void c(int i2) {
        b(l(i2));
    }

    public abstract void c(int i2, int i3);

    public abstract void c(int i2, long j2);

    public abstract void c(long j2);

    public abstract void d(int i2);

    public final void d(int i2, int i3) {
        c(i2, l(i3));
    }

    public abstract void e(int i2, int i3);
}
