package j;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
public final class n implements e {

    /* renamed from: b  reason: collision with root package name */
    public final c f9501b = new c();

    /* renamed from: c  reason: collision with root package name */
    public final s f9502c;

    /* renamed from: d  reason: collision with root package name */
    boolean f9503d;

    class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            n nVar = n.this;
            if (!nVar.f9503d) {
                return (int) Math.min(nVar.f9501b.f9474c, 2147483647L);
            }
            throw new IOException("closed");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public void close() {
            n.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            n nVar = n.this;
            if (!nVar.f9503d) {
                c cVar = nVar.f9501b;
                if (cVar.f9474c == 0 && nVar.f9502c.b(cVar, 8192) == -1) {
                    return -1;
                }
                return n.this.f9501b.readByte() & 255;
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            if (!n.this.f9503d) {
                u.a((long) bArr.length, (long) i2, (long) i3);
                n nVar = n.this;
                c cVar = nVar.f9501b;
                if (cVar.f9474c == 0 && nVar.f9502c.b(cVar, 8192) == -1) {
                    return -1;
                }
                return n.this.f9501b.a(bArr, i2, i3);
            }
            throw new IOException("closed");
        }

        public String toString() {
            return n.this + ".inputStream()";
        }
    }

    n(s sVar) {
        if (sVar != null) {
            this.f9502c = sVar;
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // j.e
    public long a(byte b2) {
        return a(b2, 0, Long.MAX_VALUE);
    }

    public long a(byte b2, long j2, long j3) {
        if (this.f9503d) {
            throw new IllegalStateException("closed");
        } else if (j2 < 0 || j3 < j2) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j2), Long.valueOf(j3)));
        } else {
            while (j2 < j3) {
                long a2 = this.f9501b.a(b2, j2, j3);
                if (a2 == -1) {
                    c cVar = this.f9501b;
                    long j4 = cVar.f9474c;
                    if (j4 >= j3 || this.f9502c.b(cVar, 8192) == -1) {
                        break;
                    }
                    j2 = Math.max(j2, j4);
                } else {
                    return a2;
                }
            }
            return -1;
        }
    }

    @Override // j.e
    public c a() {
        return this.f9501b;
    }

    public boolean a(long j2) {
        c cVar;
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        } else if (!this.f9503d) {
            do {
                cVar = this.f9501b;
                if (cVar.f9474c >= j2) {
                    return true;
                }
            } while (this.f9502c.b(cVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // j.e
    public boolean a(long j2, f fVar) {
        return a(j2, fVar, 0, fVar.m());
    }

    public boolean a(long j2, f fVar, int i2, int i3) {
        if (this.f9503d) {
            throw new IllegalStateException("closed");
        } else if (j2 < 0 || i2 < 0 || i3 < 0 || fVar.m() - i2 < i3) {
            return false;
        } else {
            for (int i4 = 0; i4 < i3; i4++) {
                long j3 = ((long) i4) + j2;
                if (!(a(1 + j3) && this.f9501b.g(j3) == fVar.a(i2 + i4))) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override // j.s
    public long b(c cVar, long j2) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        } else if (!this.f9503d) {
            c cVar2 = this.f9501b;
            if (cVar2.f9474c == 0 && this.f9502c.b(cVar2, 8192) == -1) {
                return -1;
            }
            return this.f9501b.b(cVar, Math.min(j2, this.f9501b.f9474c));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // j.s
    public t b() {
        return this.f9502c.b();
    }

    @Override // j.e
    public f c(long j2) {
        f(j2);
        return this.f9501b.c(j2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, j.s, java.nio.channels.Channel
    public void close() {
        if (!this.f9503d) {
            this.f9503d = true;
            this.f9502c.close();
            this.f9501b.p();
        }
    }

    @Override // j.e
    public String d() {
        return e(Long.MAX_VALUE);
    }

    @Override // j.e
    public byte[] d(long j2) {
        f(j2);
        return this.f9501b.d(j2);
    }

    @Override // j.e
    public String e(long j2) {
        if (j2 >= 0) {
            long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
            long a2 = a((byte) 10, 0, j3);
            if (a2 != -1) {
                return this.f9501b.i(a2);
            }
            if (j3 < Long.MAX_VALUE && a(j3) && this.f9501b.g(j3 - 1) == 13 && a(1 + j3) && this.f9501b.g(j3) == 10) {
                return this.f9501b.i(j3);
            }
            c cVar = new c();
            c cVar2 = this.f9501b;
            cVar2.a(cVar, 0, Math.min(32L, cVar2.t()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f9501b.t(), j2) + " content=" + cVar.r().i() + (char) 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j2);
    }

    @Override // j.e
    public byte[] e() {
        this.f9501b.a(this.f9502c);
        return this.f9501b.e();
    }

    @Override // j.e
    public int f() {
        f(4);
        return this.f9501b.f();
    }

    @Override // j.e
    public void f(long j2) {
        if (!a(j2)) {
            throw new EOFException();
        }
    }

    @Override // j.e
    public boolean g() {
        if (!this.f9503d) {
            return this.f9501b.g() && this.f9502c.b(this.f9501b, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    @Override // j.e
    public short h() {
        f(2);
        return this.f9501b.h();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    @Override // j.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long i() {
        /*
            r6 = this;
            r0 = 1
            r6.f(r0)
            r0 = 0
            r1 = 0
        L_0x0007:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.a(r3)
            if (r3 == 0) goto L_0x0040
            j.c r3 = r6.f9501b
            long r4 = (long) r1
            byte r3 = r3.g(r4)
            r4 = 48
            if (r3 < r4) goto L_0x001f
            r4 = 57
            if (r3 <= r4) goto L_0x0026
        L_0x001f:
            if (r1 != 0) goto L_0x0028
            r4 = 45
            if (r3 == r4) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = r2
            goto L_0x0007
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x0040
        L_0x002b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x0040:
            j.c r0 = r6.f9501b
            long r0 = r0.i()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.n.i():long");
    }

    public boolean isOpen() {
        return !this.f9503d;
    }

    @Override // j.e
    public long j() {
        f(1);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!a((long) i3)) {
                break;
            }
            byte g2 = this.f9501b.g((long) i2);
            if ((g2 >= 48 && g2 <= 57) || ((g2 >= 97 && g2 <= 102) || (g2 >= 65 && g2 <= 70))) {
                i2 = i3;
            } else if (i2 == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(g2)));
            }
        }
        return this.f9501b.j();
    }

    @Override // j.e
    public InputStream k() {
        return new a();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        c cVar = this.f9501b;
        if (cVar.f9474c == 0 && this.f9502c.b(cVar, 8192) == -1) {
            return -1;
        }
        return this.f9501b.read(byteBuffer);
    }

    @Override // j.e
    public byte readByte() {
        f(1);
        return this.f9501b.readByte();
    }

    @Override // j.e
    public void readFully(byte[] bArr) {
        try {
            f((long) bArr.length);
            this.f9501b.readFully(bArr);
        } catch (EOFException e2) {
            int i2 = 0;
            while (true) {
                c cVar = this.f9501b;
                long j2 = cVar.f9474c;
                if (j2 > 0) {
                    int a2 = cVar.a(bArr, i2, (int) j2);
                    if (a2 != -1) {
                        i2 += a2;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e2;
                }
            }
        }
    }

    @Override // j.e
    public int readInt() {
        f(4);
        return this.f9501b.readInt();
    }

    @Override // j.e
    public short readShort() {
        f(2);
        return this.f9501b.readShort();
    }

    @Override // j.e
    public void skip(long j2) {
        if (!this.f9503d) {
            while (j2 > 0) {
                c cVar = this.f9501b;
                if (cVar.f9474c == 0 && this.f9502c.b(cVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j2, this.f9501b.t());
                this.f9501b.skip(min);
                j2 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        return "buffer(" + this.f9502c + ")";
    }
}
