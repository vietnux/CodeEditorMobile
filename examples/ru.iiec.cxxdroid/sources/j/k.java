package j;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class k implements s {

    /* renamed from: b  reason: collision with root package name */
    private final e f9489b;

    /* renamed from: c  reason: collision with root package name */
    private final Inflater f9490c;

    /* renamed from: d  reason: collision with root package name */
    private int f9491d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9492e;

    k(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f9489b = eVar;
            this.f9490c = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    private void l() {
        int i2 = this.f9491d;
        if (i2 != 0) {
            int remaining = i2 - this.f9490c.getRemaining();
            this.f9491d -= remaining;
            this.f9489b.skip((long) remaining);
        }
    }

    @Override // j.s
    public long b(c cVar, long j2) {
        o b2;
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        } else if (this.f9492e) {
            throw new IllegalStateException("closed");
        } else if (i2 == 0) {
            return 0;
        } else {
            while (true) {
                boolean c2 = c();
                try {
                    b2 = cVar.b(1);
                    int inflate = this.f9490c.inflate(b2.a, b2.f9506c, (int) Math.min(j2, (long) (8192 - b2.f9506c)));
                    if (inflate > 0) {
                        b2.f9506c += inflate;
                        long j3 = (long) inflate;
                        cVar.f9474c += j3;
                        return j3;
                    } else if (this.f9490c.finished()) {
                        break;
                    } else if (this.f9490c.needsDictionary()) {
                        break;
                    } else if (c2) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            }
            l();
            if (b2.f9505b != b2.f9506c) {
                return -1;
            }
            cVar.f9473b = b2.b();
            p.a(b2);
            return -1;
        }
    }

    @Override // j.s
    public t b() {
        return this.f9489b.b();
    }

    public boolean c() {
        if (!this.f9490c.needsInput()) {
            return false;
        }
        l();
        if (this.f9490c.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f9489b.g()) {
            return true;
        } else {
            o oVar = this.f9489b.a().f9473b;
            int i2 = oVar.f9506c;
            int i3 = oVar.f9505b;
            this.f9491d = i2 - i3;
            this.f9490c.setInput(oVar.a, i3, this.f9491d);
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, j.s
    public void close() {
        if (!this.f9492e) {
            this.f9490c.end();
            this.f9492e = true;
            this.f9489b.close();
        }
    }
}
