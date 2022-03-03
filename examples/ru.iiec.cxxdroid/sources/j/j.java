package j;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class j implements s {

    /* renamed from: b  reason: collision with root package name */
    private int f9484b = 0;

    /* renamed from: c  reason: collision with root package name */
    private final e f9485c;

    /* renamed from: d  reason: collision with root package name */
    private final Inflater f9486d;

    /* renamed from: e  reason: collision with root package name */
    private final k f9487e;

    /* renamed from: f  reason: collision with root package name */
    private final CRC32 f9488f = new CRC32();

    public j(s sVar) {
        if (sVar != null) {
            this.f9486d = new Inflater(true);
            this.f9485c = l.a(sVar);
            this.f9487e = new k(this.f9485c, this.f9486d);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void a(c cVar, long j2, long j3) {
        o oVar = cVar.f9473b;
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
            int i4 = (int) (((long) oVar.f9505b) + j2);
            int min = (int) Math.min((long) (oVar.f9506c - i4), j3);
            this.f9488f.update(oVar.a, i4, min);
            j3 -= (long) min;
            oVar = oVar.f9509f;
            j2 = 0;
        }
    }

    private void a(String str, int i2, int i3) {
        if (i3 != i2) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    private void c() {
        this.f9485c.f(10);
        byte g2 = this.f9485c.a().g(3);
        boolean z = ((g2 >> 1) & 1) == 1;
        if (z) {
            a(this.f9485c.a(), 0, 10);
        }
        a("ID1ID2", 8075, this.f9485c.readShort());
        this.f9485c.skip(8);
        if (((g2 >> 2) & 1) == 1) {
            this.f9485c.f(2);
            if (z) {
                a(this.f9485c.a(), 0, 2);
            }
            long h2 = (long) this.f9485c.a().h();
            this.f9485c.f(h2);
            if (z) {
                a(this.f9485c.a(), 0, h2);
            }
            this.f9485c.skip(h2);
        }
        if (((g2 >> 3) & 1) == 1) {
            long a = this.f9485c.a((byte) 0);
            if (a != -1) {
                if (z) {
                    a(this.f9485c.a(), 0, a + 1);
                }
                this.f9485c.skip(a + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((g2 >> 4) & 1) == 1) {
            long a2 = this.f9485c.a((byte) 0);
            if (a2 != -1) {
                if (z) {
                    a(this.f9485c.a(), 0, a2 + 1);
                }
                this.f9485c.skip(a2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            a("FHCRC", this.f9485c.h(), (short) ((int) this.f9488f.getValue()));
            this.f9488f.reset();
        }
    }

    private void l() {
        a("CRC", this.f9485c.f(), (int) this.f9488f.getValue());
        a("ISIZE", this.f9485c.f(), (int) this.f9486d.getBytesWritten());
    }

    @Override // j.s
    public long b(c cVar, long j2) {
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        } else if (i2 == 0) {
            return 0;
        } else {
            if (this.f9484b == 0) {
                c();
                this.f9484b = 1;
            }
            if (this.f9484b == 1) {
                long j3 = cVar.f9474c;
                long b2 = this.f9487e.b(cVar, j2);
                if (b2 != -1) {
                    a(cVar, j3, b2);
                    return b2;
                }
                this.f9484b = 2;
            }
            if (this.f9484b == 2) {
                l();
                this.f9484b = 3;
                if (!this.f9485c.g()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    @Override // j.s
    public t b() {
        return this.f9485c.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, j.s
    public void close() {
        this.f9487e.close();
    }
}
