package j;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

public final class c implements e, d, Cloneable, ByteChannel {

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f9472d = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: b  reason: collision with root package name */
    o f9473b;

    /* renamed from: c  reason: collision with root package name */
    long f9474c;

    /* access modifiers changed from: package-private */
    public class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(c.this.f9474c, 2147483647L);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            c cVar = c.this;
            if (cVar.f9474c > 0) {
                return cVar.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            return c.this.a(bArr, i2, i3);
        }

        public String toString() {
            return c.this + ".inputStream()";
        }
    }

    public int a(byte[] bArr, int i2, int i3) {
        u.a((long) bArr.length, (long) i2, (long) i3);
        o oVar = this.f9473b;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(i3, oVar.f9506c - oVar.f9505b);
        System.arraycopy(oVar.a, oVar.f9505b, bArr, i2, min);
        oVar.f9505b += min;
        this.f9474c -= (long) min;
        if (oVar.f9505b == oVar.f9506c) {
            this.f9473b = oVar.b();
            p.a(oVar);
        }
        return min;
    }

    @Override // j.e
    public long a(byte b2) {
        return a(b2, 0, Long.MAX_VALUE);
    }

    public long a(byte b2, long j2, long j3) {
        o oVar;
        long j4 = 0;
        if (j2 < 0 || j3 < j2) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f9474c), Long.valueOf(j2), Long.valueOf(j3)));
        }
        long j5 = this.f9474c;
        if (j3 <= j5) {
            j5 = j3;
        }
        if (j2 == j5 || (oVar = this.f9473b) == null) {
            return -1;
        }
        long j6 = this.f9474c;
        if (j6 - j2 >= j2) {
            while (true) {
                j6 = j4;
                j4 = ((long) (oVar.f9506c - oVar.f9505b)) + j6;
                if (j4 >= j2) {
                    break;
                }
                oVar = oVar.f9509f;
            }
        } else {
            while (j6 > j2) {
                oVar = oVar.f9510g;
                j6 -= (long) (oVar.f9506c - oVar.f9505b);
            }
        }
        long j7 = j2;
        while (j6 < j5) {
            byte[] bArr = oVar.a;
            int min = (int) Math.min((long) oVar.f9506c, (((long) oVar.f9505b) + j5) - j6);
            for (int i2 = (int) ((((long) oVar.f9505b) + j7) - j6); i2 < min; i2++) {
                if (bArr[i2] == b2) {
                    return ((long) (i2 - oVar.f9505b)) + j6;
                }
            }
            j7 = ((long) (oVar.f9506c - oVar.f9505b)) + j6;
            oVar = oVar.f9509f;
            j6 = j7;
        }
        return -1;
    }

    public long a(s sVar) {
        if (sVar != null) {
            long j2 = 0;
            while (true) {
                long b2 = sVar.b(this, 8192);
                if (b2 == -1) {
                    return j2;
                }
                j2 += b2;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    @Override // j.e, j.d
    public c a() {
        return this;
    }

    @Override // j.d
    public c a(long j2) {
        if (j2 == 0) {
            writeByte(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j2)) / 4) + 1;
        o b2 = b(numberOfTrailingZeros);
        byte[] bArr = b2.a;
        int i2 = b2.f9506c;
        for (int i3 = (i2 + numberOfTrailingZeros) - 1; i3 >= i2; i3--) {
            bArr[i3] = f9472d[(int) (15 & j2)];
            j2 >>>= 4;
        }
        b2.f9506c += numberOfTrailingZeros;
        this.f9474c += (long) numberOfTrailingZeros;
        return this;
    }

    public c a(c cVar, long j2, long j3) {
        if (cVar != null) {
            u.a(this.f9474c, j2, j3);
            if (j3 == 0) {
                return this;
            }
            cVar.f9474c += j3;
            o oVar = this.f9473b;
            while (true) {
                int i2 = oVar.f9506c;
                int i3 = oVar.f9505b;
                if (j2 < ((long) (i2 - i3))) {
                    break;
                }
                j2 -= (long) (i2 - i3);
                oVar = oVar.f9509f;
            }
            while (j3 > 0) {
                o c2 = oVar.c();
                c2.f9505b = (int) (((long) c2.f9505b) + j2);
                c2.f9506c = Math.min(c2.f9505b + ((int) j3), c2.f9506c);
                o oVar2 = cVar.f9473b;
                if (oVar2 == null) {
                    c2.f9510g = c2;
                    c2.f9509f = c2;
                    cVar.f9473b = c2;
                } else {
                    oVar2.f9510g.a(c2);
                }
                j3 -= (long) (c2.f9506c - c2.f9505b);
                oVar = oVar.f9509f;
                j2 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public c a(f fVar) {
        if (fVar != null) {
            fVar.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // j.d
    public c a(String str) {
        a(str, 0, str.length());
        return this;
    }

    public c a(String str, int i2, int i3) {
        int i4;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i2);
        } else if (i3 < i2) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i3 + " < " + i2);
        } else if (i3 <= str.length()) {
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (charAt < 128) {
                    o b2 = b(1);
                    byte[] bArr = b2.a;
                    int i5 = b2.f9506c - i2;
                    int min = Math.min(i3, 8192 - i5);
                    int i6 = i2 + 1;
                    bArr[i2 + i5] = (byte) charAt;
                    while (i6 < min) {
                        char charAt2 = str.charAt(i6);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i6 + i5] = (byte) charAt2;
                        i6++;
                    }
                    int i7 = b2.f9506c;
                    int i8 = (i5 + i6) - i7;
                    b2.f9506c = i7 + i8;
                    this.f9474c += (long) i8;
                    i2 = i6;
                } else {
                    if (charAt < 2048) {
                        i4 = (charAt >> 6) | 192;
                    } else if (charAt < 55296 || charAt > 57343) {
                        writeByte((charAt >> '\f') | 224);
                        i4 = ((charAt >> 6) & 63) | 128;
                    } else {
                        int i9 = i2 + 1;
                        char charAt3 = i9 < i3 ? str.charAt(i9) : 0;
                        if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            writeByte(63);
                            i2 = i9;
                        } else {
                            int i10 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                            writeByte((i10 >> 18) | 240);
                            writeByte(((i10 >> 12) & 63) | 128);
                            writeByte(((i10 >> 6) & 63) | 128);
                            writeByte((i10 & 63) | 128);
                            i2 += 2;
                        }
                    }
                    writeByte(i4);
                    writeByte((charAt & '?') | 128);
                    i2++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i3 + " > " + str.length());
        }
    }

    public c a(String str, int i2, int i3, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i2 < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i2);
        } else if (i3 < i2) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i3 + " < " + i2);
        } else if (i3 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i3 + " > " + str.length());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(u.a)) {
            a(str, i2, i3);
            return this;
        } else {
            byte[] bytes = str.substring(i2, i3).getBytes(charset);
            write(bytes, 0, bytes.length);
            return this;
        }
    }

    public f a(int i2) {
        return i2 == 0 ? f.f9477f : new q(this, i2);
    }

    public String a(long j2, Charset charset) {
        u.a(this.f9474c, 0, j2);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j2 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j2);
        } else if (j2 == 0) {
            return "";
        } else {
            o oVar = this.f9473b;
            int i2 = oVar.f9505b;
            if (((long) i2) + j2 > ((long) oVar.f9506c)) {
                return new String(d(j2), charset);
            }
            String str = new String(oVar.a, i2, (int) j2, charset);
            oVar.f9505b = (int) (((long) oVar.f9505b) + j2);
            this.f9474c -= j2;
            if (oVar.f9505b == oVar.f9506c) {
                this.f9473b = oVar.b();
                p.a(oVar);
            }
            return str;
        }
    }

    @Override // j.r
    public void a(c cVar, long j2) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (cVar != this) {
            u.a(cVar.f9474c, 0, j2);
            while (j2 > 0) {
                o oVar = cVar.f9473b;
                if (j2 < ((long) (oVar.f9506c - oVar.f9505b))) {
                    o oVar2 = this.f9473b;
                    o oVar3 = oVar2 != null ? oVar2.f9510g : null;
                    if (oVar3 != null && oVar3.f9508e) {
                        if ((((long) oVar3.f9506c) + j2) - ((long) (oVar3.f9507d ? 0 : oVar3.f9505b)) <= 8192) {
                            cVar.f9473b.a(oVar3, (int) j2);
                            cVar.f9474c -= j2;
                            this.f9474c += j2;
                            return;
                        }
                    }
                    cVar.f9473b = cVar.f9473b.a((int) j2);
                }
                o oVar4 = cVar.f9473b;
                long j3 = (long) (oVar4.f9506c - oVar4.f9505b);
                cVar.f9473b = oVar4.b();
                o oVar5 = this.f9473b;
                if (oVar5 == null) {
                    this.f9473b = oVar4;
                    o oVar6 = this.f9473b;
                    oVar6.f9510g = oVar6;
                    oVar6.f9509f = oVar6;
                } else {
                    oVar5.f9510g.a(oVar4);
                    oVar4.a();
                }
                cVar.f9474c -= j3;
                this.f9474c += j3;
                j2 -= j3;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    @Override // j.e
    public boolean a(long j2, f fVar) {
        return a(j2, fVar, 0, fVar.m());
    }

    public boolean a(long j2, f fVar, int i2, int i3) {
        if (j2 < 0 || i2 < 0 || i3 < 0 || this.f9474c - j2 < ((long) i3) || fVar.m() - i2 < i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (g(((long) i4) + j2) != fVar.a(i2 + i4)) {
                return false;
            }
        }
        return true;
    }

    @Override // j.s
    public long b(c cVar, long j2) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j2 >= 0) {
            long j3 = this.f9474c;
            if (j3 == 0) {
                return -1;
            }
            if (j2 > j3) {
                j2 = j3;
            }
            cVar.a(this, j2);
            return j2;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
    }

    @Override // j.d
    public c b(long j2) {
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 == 0) {
            writeByte(48);
            return this;
        }
        boolean z = false;
        int i3 = 1;
        if (i2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                a("-9223372036854775808");
                return this;
            }
            z = true;
        }
        if (j2 >= 100000000) {
            i3 = j2 < 1000000000000L ? j2 < 10000000000L ? j2 < 1000000000 ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < 1000000000000000000L ? 18 : 19;
        } else if (j2 >= 10000) {
            i3 = j2 < 1000000 ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8;
        } else if (j2 >= 100) {
            i3 = j2 < 1000 ? 3 : 4;
        } else if (j2 >= 10) {
            i3 = 2;
        }
        if (z) {
            i3++;
        }
        o b2 = b(i3);
        byte[] bArr = b2.a;
        int i4 = b2.f9506c + i3;
        while (j2 != 0) {
            i4--;
            bArr[i4] = f9472d[(int) (j2 % 10)];
            j2 /= 10;
        }
        if (z) {
            bArr[i4 - 1] = 45;
        }
        b2.f9506c += i3;
        this.f9474c += (long) i3;
        return this;
    }

    /* access modifiers changed from: package-private */
    public o b(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException();
        }
        o oVar = this.f9473b;
        if (oVar == null) {
            this.f9473b = p.a();
            o oVar2 = this.f9473b;
            oVar2.f9510g = oVar2;
            oVar2.f9509f = oVar2;
            return oVar2;
        }
        o oVar3 = oVar.f9510g;
        if (oVar3.f9506c + i2 <= 8192 && oVar3.f9508e) {
            return oVar3;
        }
        o a2 = p.a();
        oVar3.a(a2);
        return a2;
    }

    @Override // j.s, j.r
    public t b() {
        return t.f9514d;
    }

    @Override // j.d
    public c c() {
        return this;
    }

    public c c(int i2) {
        int i3;
        int i4;
        if (i2 >= 128) {
            if (i2 < 2048) {
                i4 = (i2 >> 6) | 192;
            } else {
                if (i2 < 65536) {
                    if (i2 < 55296 || i2 > 57343) {
                        i3 = (i2 >> 12) | 224;
                    } else {
                        writeByte(63);
                        return this;
                    }
                } else if (i2 <= 1114111) {
                    writeByte((i2 >> 18) | 240);
                    i3 = ((i2 >> 12) & 63) | 128;
                } else {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i2));
                }
                writeByte(i3);
                i4 = ((i2 >> 6) & 63) | 128;
            }
            writeByte(i4);
            i2 = (i2 & 63) | 128;
        }
        writeByte(i2);
        return this;
    }

    @Override // j.e
    public f c(long j2) {
        return new f(d(j2));
    }

    @Override // java.lang.Object
    public c clone() {
        c cVar = new c();
        if (this.f9474c == 0) {
            return cVar;
        }
        cVar.f9473b = this.f9473b.c();
        o oVar = cVar.f9473b;
        oVar.f9510g = oVar;
        oVar.f9509f = oVar;
        o oVar2 = this.f9473b;
        while (true) {
            oVar2 = oVar2.f9509f;
            if (oVar2 != this.f9473b) {
                cVar.f9473b.f9510g.a(oVar2.c());
            } else {
                cVar.f9474c = this.f9474c;
                return cVar;
            }
        }
    }

    @Override // java.lang.AutoCloseable, j.s, j.r, java.io.Closeable, java.nio.channels.Channel
    public void close() {
    }

    @Override // j.e
    public String d() {
        return e(Long.MAX_VALUE);
    }

    @Override // j.e
    public byte[] d(long j2) {
        u.a(this.f9474c, 0, j2);
        if (j2 <= 2147483647L) {
            byte[] bArr = new byte[((int) j2)];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j2);
    }

    @Override // j.e
    public String e(long j2) {
        if (j2 >= 0) {
            long j3 = Long.MAX_VALUE;
            if (j2 != Long.MAX_VALUE) {
                j3 = j2 + 1;
            }
            long a2 = a((byte) 10, 0, j3);
            if (a2 != -1) {
                return i(a2);
            }
            if (j3 < t() && g(j3 - 1) == 13 && g(j3) == 10) {
                return i(j3);
            }
            c cVar = new c();
            a(cVar, 0, Math.min(32L, t()));
            throw new EOFException("\\n not found: limit=" + Math.min(t(), j2) + " content=" + cVar.r().i() + (char) 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j2);
    }

    @Override // j.e
    public byte[] e() {
        try {
            return d(this.f9474c);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j2 = this.f9474c;
        if (j2 != cVar.f9474c) {
            return false;
        }
        long j3 = 0;
        if (j2 == 0) {
            return true;
        }
        o oVar = this.f9473b;
        o oVar2 = cVar.f9473b;
        int i2 = oVar.f9505b;
        int i3 = oVar2.f9505b;
        while (j3 < this.f9474c) {
            long min = (long) Math.min(oVar.f9506c - i2, oVar2.f9506c - i3);
            int i4 = i3;
            int i5 = i2;
            int i6 = 0;
            while (((long) i6) < min) {
                int i7 = i5 + 1;
                int i8 = i4 + 1;
                if (oVar.a[i5] != oVar2.a[i4]) {
                    return false;
                }
                i6++;
                i5 = i7;
                i4 = i8;
            }
            if (i5 == oVar.f9506c) {
                oVar = oVar.f9509f;
                i2 = oVar.f9505b;
            } else {
                i2 = i5;
            }
            if (i4 == oVar2.f9506c) {
                oVar2 = oVar2.f9509f;
                i3 = oVar2.f9505b;
            } else {
                i3 = i4;
            }
            j3 += min;
        }
        return true;
    }

    @Override // j.e
    public int f() {
        return u.a(readInt());
    }

    @Override // j.e
    public void f(long j2) {
        if (this.f9474c < j2) {
            throw new EOFException();
        }
    }

    @Override // j.d, j.r, java.io.Flushable
    public void flush() {
    }

    public byte g(long j2) {
        int i2;
        u.a(this.f9474c, j2, 1);
        long j3 = this.f9474c;
        if (j3 - j2 > j2) {
            o oVar = this.f9473b;
            while (true) {
                int i3 = oVar.f9506c;
                int i4 = oVar.f9505b;
                long j4 = (long) (i3 - i4);
                if (j2 < j4) {
                    return oVar.a[i4 + ((int) j2)];
                }
                j2 -= j4;
                oVar = oVar.f9509f;
            }
        } else {
            long j5 = j2 - j3;
            o oVar2 = this.f9473b;
            do {
                oVar2 = oVar2.f9510g;
                int i5 = oVar2.f9506c;
                i2 = oVar2.f9505b;
                j5 += (long) (i5 - i2);
            } while (j5 < 0);
            return oVar2.a[i2 + ((int) j5)];
        }
    }

    @Override // j.e
    public boolean g() {
        return this.f9474c == 0;
    }

    public String h(long j2) {
        return a(j2, u.a);
    }

    @Override // j.e
    public short h() {
        return u.a(readShort());
    }

    public int hashCode() {
        o oVar = this.f9473b;
        if (oVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = oVar.f9506c;
            for (int i4 = oVar.f9505b; i4 < i3; i4++) {
                i2 = (i2 * 31) + oVar.a[i4];
            }
            oVar = oVar.f9509f;
        } while (oVar != this.f9473b);
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r5 != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r1.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        throw new java.lang.NumberFormatException("Number too large: " + r1.s());
     */
    @Override // j.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long i() {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: j.c.i():long");
    }

    /* access modifiers changed from: package-private */
    public String i(long j2) {
        String h2;
        long j3 = 1;
        if (j2 > 0) {
            long j4 = j2 - 1;
            if (g(j4) == 13) {
                h2 = h(j4);
                j3 = 2;
                skip(j3);
                return h2;
            }
        }
        h2 = h(j2);
        skip(j3);
        return h2;
    }

    public boolean isOpen() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        if (r8 != r9) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        r15.f9473b = r6.b();
        j.p.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        r6.f9505b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        if (r0 != false) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0074 A[SYNTHETIC] */
    @Override // j.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long j() {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: j.c.j():long");
    }

    @Override // j.e
    public InputStream k() {
        return new a();
    }

    public void p() {
        try {
            skip(this.f9474c);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public long q() {
        long j2 = this.f9474c;
        if (j2 == 0) {
            return 0;
        }
        o oVar = this.f9473b.f9510g;
        int i2 = oVar.f9506c;
        return (i2 >= 8192 || !oVar.f9508e) ? j2 : j2 - ((long) (i2 - oVar.f9505b));
    }

    public f r() {
        return new f(e());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        o oVar = this.f9473b;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), oVar.f9506c - oVar.f9505b);
        byteBuffer.put(oVar.a, oVar.f9505b, min);
        oVar.f9505b += min;
        this.f9474c -= (long) min;
        if (oVar.f9505b == oVar.f9506c) {
            this.f9473b = oVar.b();
            p.a(oVar);
        }
        return min;
    }

    @Override // j.e
    public byte readByte() {
        long j2 = this.f9474c;
        if (j2 != 0) {
            o oVar = this.f9473b;
            int i2 = oVar.f9505b;
            int i3 = oVar.f9506c;
            int i4 = i2 + 1;
            byte b2 = oVar.a[i2];
            this.f9474c = j2 - 1;
            if (i4 == i3) {
                this.f9473b = oVar.b();
                p.a(oVar);
            } else {
                oVar.f9505b = i4;
            }
            return b2;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // j.e
    public void readFully(byte[] bArr) {
        int i2 = 0;
        while (i2 < bArr.length) {
            int a2 = a(bArr, i2, bArr.length - i2);
            if (a2 != -1) {
                i2 += a2;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // j.e
    public int readInt() {
        long j2 = this.f9474c;
        if (j2 >= 4) {
            o oVar = this.f9473b;
            int i2 = oVar.f9505b;
            int i3 = oVar.f9506c;
            if (i3 - i2 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = oVar.a;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] & 255) << 24) | ((bArr[i4] & 255) << 16);
            int i7 = i5 + 1;
            int i8 = i6 | ((bArr[i5] & 255) << 8);
            int i9 = i7 + 1;
            int i10 = i8 | (bArr[i7] & 255);
            this.f9474c = j2 - 4;
            if (i9 == i3) {
                this.f9473b = oVar.b();
                p.a(oVar);
            } else {
                oVar.f9505b = i9;
            }
            return i10;
        }
        throw new IllegalStateException("size < 4: " + this.f9474c);
    }

    @Override // j.e
    public short readShort() {
        long j2 = this.f9474c;
        if (j2 >= 2) {
            o oVar = this.f9473b;
            int i2 = oVar.f9505b;
            int i3 = oVar.f9506c;
            if (i3 - i2 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = oVar.a;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] & 255) << 8) | (bArr[i4] & 255);
            this.f9474c = j2 - 2;
            if (i5 == i3) {
                this.f9473b = oVar.b();
                p.a(oVar);
            } else {
                oVar.f9505b = i5;
            }
            return (short) i6;
        }
        throw new IllegalStateException("size < 2: " + this.f9474c);
    }

    public String s() {
        try {
            return a(this.f9474c, u.a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // j.e
    public void skip(long j2) {
        while (j2 > 0) {
            o oVar = this.f9473b;
            if (oVar != null) {
                int min = (int) Math.min(j2, (long) (oVar.f9506c - oVar.f9505b));
                long j3 = (long) min;
                this.f9474c -= j3;
                j2 -= j3;
                o oVar2 = this.f9473b;
                oVar2.f9505b += min;
                if (oVar2.f9505b == oVar2.f9506c) {
                    this.f9473b = oVar2.b();
                    p.a(oVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public long t() {
        return this.f9474c;
    }

    public String toString() {
        return u().toString();
    }

    public f u() {
        long j2 = this.f9474c;
        if (j2 <= 2147483647L) {
            return a((int) j2);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f9474c);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i2 = remaining;
            while (i2 > 0) {
                o b2 = b(1);
                int min = Math.min(i2, 8192 - b2.f9506c);
                byteBuffer.get(b2.a, b2.f9506c, min);
                i2 -= min;
                b2.f9506c += min;
            }
            this.f9474c += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // j.d
    public c write(byte[] bArr) {
        if (bArr != null) {
            write(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // j.d
    public c write(byte[] bArr, int i2, int i3) {
        if (bArr != null) {
            long j2 = (long) i3;
            u.a((long) bArr.length, (long) i2, j2);
            int i4 = i3 + i2;
            while (i2 < i4) {
                o b2 = b(1);
                int min = Math.min(i4 - i2, 8192 - b2.f9506c);
                System.arraycopy(bArr, i2, b2.a, b2.f9506c, min);
                i2 += min;
                b2.f9506c += min;
            }
            this.f9474c += j2;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // j.d
    public c writeByte(int i2) {
        o b2 = b(1);
        byte[] bArr = b2.a;
        int i3 = b2.f9506c;
        b2.f9506c = i3 + 1;
        bArr[i3] = (byte) i2;
        this.f9474c++;
        return this;
    }

    @Override // j.d
    public c writeInt(int i2) {
        o b2 = b(4);
        byte[] bArr = b2.a;
        int i3 = b2.f9506c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & 255);
        bArr[i6] = (byte) (i2 & 255);
        b2.f9506c = i6 + 1;
        this.f9474c += 4;
        return this;
    }

    @Override // j.d
    public c writeShort(int i2) {
        o b2 = b(2);
        byte[] bArr = b2.a;
        int i3 = b2.f9506c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i4] = (byte) (i2 & 255);
        b2.f9506c = i4 + 1;
        this.f9474c += 2;
        return this;
    }
}
