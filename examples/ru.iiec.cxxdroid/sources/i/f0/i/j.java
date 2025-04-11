package i.f0.i;

import i.f0.i.d;
import j.c;
import j.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
public final class j implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    private static final Logger f9073h = Logger.getLogger(e.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private final d f9074b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9075c;

    /* renamed from: d  reason: collision with root package name */
    private final c f9076d = new c();

    /* renamed from: e  reason: collision with root package name */
    private int f9077e = 16384;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9078f;

    /* renamed from: g  reason: collision with root package name */
    final d.b f9079g = new d.b(this.f9076d);

    j(j.d dVar, boolean z) {
        this.f9074b = dVar;
        this.f9075c = z;
    }

    private static void a(j.d dVar, int i2) {
        dVar.writeByte((i2 >>> 16) & 255);
        dVar.writeByte((i2 >>> 8) & 255);
        dVar.writeByte(i2 & 255);
    }

    private void b(int i2, long j2) {
        while (j2 > 0) {
            int min = (int) Math.min((long) this.f9077e, j2);
            long j3 = (long) min;
            j2 -= j3;
            a(i2, min, (byte) 9, j2 == 0 ? (byte) 4 : 0);
            this.f9074b.a(this.f9076d, j3);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, byte b2, c cVar, int i3) {
        a(i2, i3, (byte) 0, b2);
        if (i3 > 0) {
            this.f9074b.a(cVar, (long) i3);
        }
    }

    public void a(int i2, int i3, byte b2, byte b3) {
        if (f9073h.isLoggable(Level.FINE)) {
            f9073h.fine(e.a(false, i2, i3, b2, b3));
        }
        int i4 = this.f9077e;
        if (i3 > i4) {
            e.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i4), Integer.valueOf(i3));
            throw null;
        } else if ((Integer.MIN_VALUE & i2) == 0) {
            a(this.f9074b, i3);
            this.f9074b.writeByte(b2 & 255);
            this.f9074b.writeByte(b3 & 255);
            this.f9074b.writeInt(i2 & Integer.MAX_VALUE);
        } else {
            e.a("reserved bit set: %s", Integer.valueOf(i2));
            throw null;
        }
    }

    public synchronized void a(int i2, int i3, List<c> list) {
        if (!this.f9078f) {
            this.f9079g.a(list);
            long t = this.f9076d.t();
            int min = (int) Math.min((long) (this.f9077e - 4), t);
            long j2 = (long) min;
            int i4 = (t > j2 ? 1 : (t == j2 ? 0 : -1));
            a(i2, min + 4, (byte) 5, i4 == 0 ? (byte) 4 : 0);
            this.f9074b.writeInt(i3 & Integer.MAX_VALUE);
            this.f9074b.a(this.f9076d, j2);
            if (i4 > 0) {
                b(i2, t - j2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(int i2, long j2) {
        if (this.f9078f) {
            throw new IOException("closed");
        } else if (j2 == 0 || j2 > 2147483647L) {
            e.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j2));
            throw null;
        } else {
            a(i2, 4, (byte) 8, (byte) 0);
            this.f9074b.writeInt((int) j2);
            this.f9074b.flush();
        }
    }

    public synchronized void a(int i2, b bVar) {
        if (this.f9078f) {
            throw new IOException("closed");
        } else if (bVar.f8947b != -1) {
            a(i2, 4, (byte) 3, (byte) 0);
            this.f9074b.writeInt(bVar.f8947b);
            this.f9074b.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void a(int i2, b bVar, byte[] bArr) {
        if (this.f9078f) {
            throw new IOException("closed");
        } else if (bVar.f8947b != -1) {
            a(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f9074b.writeInt(i2);
            this.f9074b.writeInt(bVar.f8947b);
            if (bArr.length > 0) {
                this.f9074b.write(bArr);
            }
            this.f9074b.flush();
        } else {
            e.a("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
    }

    public synchronized void a(m mVar) {
        if (!this.f9078f) {
            this.f9077e = mVar.c(this.f9077e);
            if (mVar.b() != -1) {
                this.f9079g.a(mVar.b());
            }
            a(0, 0, (byte) 4, (byte) 1);
            this.f9074b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(boolean z, int i2, int i3) {
        if (!this.f9078f) {
            a(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.f9074b.writeInt(i2);
            this.f9074b.writeInt(i3);
            this.f9074b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(boolean z, int i2, int i3, List<c> list) {
        if (!this.f9078f) {
            a(z, i2, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(boolean z, int i2, c cVar, int i3) {
        if (!this.f9078f) {
            byte b2 = 0;
            if (z) {
                b2 = (byte) 1;
            }
            a(i2, b2, cVar, i3);
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z, int i2, List<c> list) {
        if (!this.f9078f) {
            this.f9079g.a(list);
            long t = this.f9076d.t();
            int min = (int) Math.min((long) this.f9077e, t);
            long j2 = (long) min;
            int i3 = (t > j2 ? 1 : (t == j2 ? 0 : -1));
            byte b2 = i3 == 0 ? (byte) 4 : 0;
            if (z) {
                b2 = (byte) (b2 | 1);
            }
            a(i2, min, (byte) 1, b2);
            this.f9074b.a(this.f9076d, j2);
            if (i3 > 0) {
                b(i2, t - j2);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public synchronized void b(m mVar) {
        if (!this.f9078f) {
            int i2 = 0;
            a(0, mVar.d() * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (mVar.d(i2)) {
                    this.f9074b.writeShort(i2 == 4 ? 3 : i2 == 7 ? 4 : i2);
                    this.f9074b.writeInt(mVar.a(i2));
                }
                i2++;
            }
            this.f9074b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f9078f = true;
        this.f9074b.close();
    }

    public synchronized void flush() {
        if (!this.f9078f) {
            this.f9074b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void l() {
        if (this.f9078f) {
            throw new IOException("closed");
        } else if (this.f9075c) {
            if (f9073h.isLoggable(Level.FINE)) {
                f9073h.fine(i.f0.c.a(">> CONNECTION %s", e.a.i()));
            }
            this.f9074b.write(e.a.o());
            this.f9074b.flush();
        }
    }

    public int m() {
        return this.f9077e;
    }
}
