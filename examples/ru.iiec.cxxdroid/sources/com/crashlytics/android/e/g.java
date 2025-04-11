package com.crashlytics.android.e;

import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

final class g implements Flushable {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f2915b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2916c;

    /* renamed from: d  reason: collision with root package name */
    private int f2917d = 0;

    /* renamed from: e  reason: collision with root package name */
    private final OutputStream f2918e;

    /* access modifiers changed from: package-private */
    public static class a extends IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private g(OutputStream outputStream, byte[] bArr) {
        this.f2918e = outputStream;
        this.f2915b = bArr;
        this.f2916c = bArr.length;
    }

    public static g a(OutputStream outputStream) {
        return a(outputStream, 4096);
    }

    public static g a(OutputStream outputStream, int i2) {
        return new g(outputStream, new byte[i2]);
    }

    public static int b(float f2) {
        return 4;
    }

    public static int b(int i2, float f2) {
        return l(i2) + b(f2);
    }

    public static int b(int i2, long j2) {
        return l(i2) + f(j2);
    }

    public static int b(int i2, d dVar) {
        return l(i2) + c(dVar);
    }

    public static int b(int i2, boolean z) {
        return l(i2) + b(z);
    }

    public static int b(boolean z) {
        return 1;
    }

    public static int c(d dVar) {
        return j(dVar.b()) + dVar.b();
    }

    private void d() {
        OutputStream outputStream = this.f2918e;
        if (outputStream != null) {
            outputStream.write(this.f2915b, 0, this.f2917d);
            this.f2917d = 0;
            return;
        }
        throw new a();
    }

    public static int e(int i2, int i3) {
        return l(i2) + h(i3);
    }

    public static int e(long j2) {
        if ((-128 & j2) == 0) {
            return 1;
        }
        if ((-16384 & j2) == 0) {
            return 2;
        }
        if ((-2097152 & j2) == 0) {
            return 3;
        }
        if ((-268435456 & j2) == 0) {
            return 4;
        }
        if ((-34359738368L & j2) == 0) {
            return 5;
        }
        if ((-4398046511104L & j2) == 0) {
            return 6;
        }
        if ((-562949953421312L & j2) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int f(int i2, int i3) {
        return l(i2) + k(i3);
    }

    public static int f(long j2) {
        return e(j2);
    }

    public static int g(int i2, int i3) {
        return l(i2) + m(i3);
    }

    public static int h(int i2) {
        return i(i2);
    }

    public static int i(int i2) {
        if (i2 >= 0) {
            return j(i2);
        }
        return 10;
    }

    public static int j(int i2) {
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

    public static int k(int i2) {
        return j(n(i2));
    }

    public static int l(int i2) {
        return j(y0.a(i2, 0));
    }

    public static int m(int i2) {
        return j(i2);
    }

    public static int n(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public void a(byte b2) {
        if (this.f2917d == this.f2916c) {
            d();
        }
        byte[] bArr = this.f2915b;
        int i2 = this.f2917d;
        this.f2917d = i2 + 1;
        bArr[i2] = b2;
    }

    public void a(float f2) {
        d(Float.floatToRawIntBits(f2));
    }

    public void a(int i2) {
        b(i2);
    }

    public void a(int i2, float f2) {
        c(i2, 5);
        a(f2);
    }

    public void a(int i2, int i3) {
        c(i2, 0);
        a(i3);
    }

    public void a(int i2, long j2) {
        c(i2, 0);
        d(j2);
    }

    public void a(int i2, d dVar) {
        c(i2, 2);
        a(dVar);
    }

    public void a(int i2, boolean z) {
        c(i2, 0);
        a(z);
    }

    public void a(d dVar) {
        e(dVar.b());
        b(dVar);
    }

    public void a(d dVar, int i2, int i3) {
        int i4 = this.f2916c;
        int i5 = this.f2917d;
        if (i4 - i5 >= i3) {
            dVar.a(this.f2915b, i2, i5, i3);
            this.f2917d += i3;
            return;
        }
        int i6 = i4 - i5;
        dVar.a(this.f2915b, i2, i5, i6);
        int i7 = i2 + i6;
        int i8 = i3 - i6;
        this.f2917d = this.f2916c;
        d();
        if (i8 <= this.f2916c) {
            dVar.a(this.f2915b, i7, 0, i8);
            this.f2917d = i8;
            return;
        }
        InputStream a2 = dVar.a();
        long j2 = (long) i7;
        if (j2 == a2.skip(j2)) {
            while (i8 > 0) {
                int min = Math.min(i8, this.f2916c);
                int read = a2.read(this.f2915b, 0, min);
                if (read == min) {
                    this.f2918e.write(this.f2915b, 0, read);
                    i8 -= read;
                } else {
                    throw new IllegalStateException("Read failed.");
                }
            }
            return;
        }
        throw new IllegalStateException("Skip failed.");
    }

    public void a(boolean z) {
        c(z ? 1 : 0);
    }

    public void a(byte[] bArr) {
        a(bArr, 0, bArr.length);
    }

    public void a(byte[] bArr, int i2, int i3) {
        int i4 = this.f2916c;
        int i5 = this.f2917d;
        if (i4 - i5 >= i3) {
            System.arraycopy(bArr, i2, this.f2915b, i5, i3);
            this.f2917d += i3;
            return;
        }
        int i6 = i4 - i5;
        System.arraycopy(bArr, i2, this.f2915b, i5, i6);
        int i7 = i2 + i6;
        int i8 = i3 - i6;
        this.f2917d = this.f2916c;
        d();
        if (i8 <= this.f2916c) {
            System.arraycopy(bArr, i7, this.f2915b, 0, i8);
            this.f2917d = i8;
            return;
        }
        this.f2918e.write(bArr, i7, i8);
    }

    public void b(int i2) {
        if (i2 >= 0) {
            e(i2);
        } else {
            c((long) i2);
        }
    }

    public void b(int i2, int i3) {
        c(i2, 0);
        f(i3);
    }

    public void b(d dVar) {
        a(dVar, 0, dVar.b());
    }

    public void c(int i2) {
        a((byte) i2);
    }

    public void c(int i2, int i3) {
        e(y0.a(i2, i3));
    }

    public void c(long j2) {
        while ((-128 & j2) != 0) {
            c((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        c((int) j2);
    }

    public void d(int i2) {
        c(i2 & 255);
        c((i2 >> 8) & 255);
        c((i2 >> 16) & 255);
        c((i2 >> 24) & 255);
    }

    public void d(int i2, int i3) {
        c(i2, 0);
        g(i3);
    }

    public void d(long j2) {
        c(j2);
    }

    public void e(int i2) {
        while ((i2 & -128) != 0) {
            c((i2 & 127) | 128);
            i2 >>>= 7;
        }
        c(i2);
    }

    public void f(int i2) {
        e(n(i2));
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f2918e != null) {
            d();
        }
    }

    public void g(int i2) {
        e(i2);
    }
}
