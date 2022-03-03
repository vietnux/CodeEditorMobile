package i.f0.i;

import i.f0.i.d;
import j.c;
import j.e;
import j.f;
import j.s;
import j.t;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
public final class h implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    static final Logger f9041f = Logger.getLogger(e.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private final e f9042b;

    /* renamed from: c  reason: collision with root package name */
    private final a f9043c = new a(this.f9042b);

    /* renamed from: d  reason: collision with root package name */
    private final boolean f9044d;

    /* renamed from: e  reason: collision with root package name */
    final d.a f9045e = new d.a(4096, this.f9043c);

    /* access modifiers changed from: package-private */
    public static final class a implements s {

        /* renamed from: b  reason: collision with root package name */
        private final e f9046b;

        /* renamed from: c  reason: collision with root package name */
        int f9047c;

        /* renamed from: d  reason: collision with root package name */
        byte f9048d;

        /* renamed from: e  reason: collision with root package name */
        int f9049e;

        /* renamed from: f  reason: collision with root package name */
        int f9050f;

        /* renamed from: g  reason: collision with root package name */
        short f9051g;

        a(e eVar) {
            this.f9046b = eVar;
        }

        private void c() {
            int i2 = this.f9049e;
            int a = h.a(this.f9046b);
            this.f9050f = a;
            this.f9047c = a;
            byte readByte = (byte) (this.f9046b.readByte() & 255);
            this.f9048d = (byte) (this.f9046b.readByte() & 255);
            if (h.f9041f.isLoggable(Level.FINE)) {
                h.f9041f.fine(e.a(true, this.f9049e, this.f9047c, readByte, this.f9048d));
            }
            this.f9049e = this.f9046b.readInt() & Integer.MAX_VALUE;
            if (readByte != 9) {
                e.b("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                throw null;
            } else if (this.f9049e != i2) {
                e.b("TYPE_CONTINUATION streamId changed", new Object[0]);
                throw null;
            }
        }

        @Override // j.s
        public long b(c cVar, long j2) {
            while (true) {
                int i2 = this.f9050f;
                if (i2 == 0) {
                    this.f9046b.skip((long) this.f9051g);
                    this.f9051g = 0;
                    if ((this.f9048d & 4) != 0) {
                        return -1;
                    }
                    c();
                } else {
                    long b2 = this.f9046b.b(cVar, Math.min(j2, (long) i2));
                    if (b2 == -1) {
                        return -1;
                    }
                    this.f9050f = (int) (((long) this.f9050f) - b2);
                    return b2;
                }
            }
        }

        @Override // j.s
        public t b() {
            return this.f9046b.b();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, j.s
        public void close() {
        }
    }

    /* access modifiers changed from: package-private */
    public interface b {
        void a();

        void a(int i2, int i3, int i4, boolean z);

        void a(int i2, int i3, List<c> list);

        void a(int i2, long j2);

        void a(int i2, b bVar);

        void a(int i2, b bVar, f fVar);

        void a(boolean z, int i2, int i3);

        void a(boolean z, int i2, int i3, List<c> list);

        void a(boolean z, int i2, e eVar, int i3);

        void a(boolean z, m mVar);
    }

    h(e eVar, boolean z) {
        this.f9042b = eVar;
        this.f9044d = z;
    }

    static int a(int i2, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i2--;
        }
        if (s <= i2) {
            return (short) (i2 - s);
        }
        e.b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i2));
        throw null;
    }

    static int a(e eVar) {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << 16) | ((eVar.readByte() & 255) << 8);
    }

    private List<c> a(int i2, short s, byte b2, int i3) {
        a aVar = this.f9043c;
        aVar.f9050f = i2;
        aVar.f9047c = i2;
        aVar.f9051g = s;
        aVar.f9048d = b2;
        aVar.f9049e = i3;
        this.f9045e.c();
        return this.f9045e.a();
    }

    private void a(b bVar, int i2) {
        int readInt = this.f9042b.readInt();
        bVar.a(i2, readInt & Integer.MAX_VALUE, (this.f9042b.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    private void a(b bVar, int i2, byte b2, int i3) {
        short s = 0;
        if (i3 != 0) {
            boolean z = true;
            boolean z2 = (b2 & 1) != 0;
            if ((b2 & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b2 & 8) != 0) {
                    s = (short) (this.f9042b.readByte() & 255);
                }
                bVar.a(z2, i3, this.f9042b, a(i2, b2, s));
                this.f9042b.skip((long) s);
                return;
            }
            e.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        e.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        throw null;
    }

    private void b(b bVar, int i2, byte b2, int i3) {
        if (i2 < 8) {
            e.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i2));
            throw null;
        } else if (i3 == 0) {
            int readInt = this.f9042b.readInt();
            int readInt2 = this.f9042b.readInt();
            int i4 = i2 - 8;
            b a2 = b.a(readInt2);
            if (a2 != null) {
                f fVar = f.f9477f;
                if (i4 > 0) {
                    fVar = this.f9042b.c((long) i4);
                }
                bVar.a(readInt, a2, fVar);
                return;
            }
            e.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        } else {
            e.b("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    private void c(b bVar, int i2, byte b2, int i3) {
        short s = 0;
        if (i3 != 0) {
            boolean z = (b2 & 1) != 0;
            if ((b2 & 8) != 0) {
                s = (short) (this.f9042b.readByte() & 255);
            }
            if ((b2 & 32) != 0) {
                a(bVar, i3);
                i2 -= 5;
            }
            bVar.a(z, i3, -1, a(a(i2, b2, s), s, b2, i3));
            return;
        }
        e.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    private void d(b bVar, int i2, byte b2, int i3) {
        boolean z = false;
        if (i2 != 8) {
            e.b("TYPE_PING length != 8: %s", Integer.valueOf(i2));
            throw null;
        } else if (i3 == 0) {
            int readInt = this.f9042b.readInt();
            int readInt2 = this.f9042b.readInt();
            if ((b2 & 1) != 0) {
                z = true;
            }
            bVar.a(z, readInt, readInt2);
        } else {
            e.b("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }

    private void e(b bVar, int i2, byte b2, int i3) {
        if (i2 != 5) {
            e.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i2));
            throw null;
        } else if (i3 != 0) {
            a(bVar, i3);
        } else {
            e.b("TYPE_PRIORITY streamId == 0", new Object[0]);
            throw null;
        }
    }

    private void f(b bVar, int i2, byte b2, int i3) {
        short s = 0;
        if (i3 != 0) {
            if ((b2 & 8) != 0) {
                s = (short) (this.f9042b.readByte() & 255);
            }
            bVar.a(i3, this.f9042b.readInt() & Integer.MAX_VALUE, a(a(i2 - 4, b2, s), s, b2, i3));
            return;
        }
        e.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }

    private void g(b bVar, int i2, byte b2, int i3) {
        if (i2 != 4) {
            e.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i2));
            throw null;
        } else if (i3 != 0) {
            int readInt = this.f9042b.readInt();
            b a2 = b.a(readInt);
            if (a2 != null) {
                bVar.a(i3, a2);
                return;
            }
            e.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            throw null;
        } else {
            e.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
    }

    private void h(b bVar, int i2, byte b2, int i3) {
        if (i3 != 0) {
            e.b("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        } else if ((b2 & 1) != 0) {
            if (i2 == 0) {
                bVar.a();
            } else {
                e.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        } else if (i2 % 6 == 0) {
            m mVar = new m();
            for (int i4 = 0; i4 < i2; i4 += 6) {
                int readShort = this.f9042b.readShort() & 65535;
                int readInt = this.f9042b.readInt();
                switch (readShort) {
                    case 2:
                        if (!(readInt == 0 || readInt == 1)) {
                            e.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            throw null;
                        }
                    case 3:
                        readShort = 4;
                        break;
                    case 4:
                        readShort = 7;
                        if (readInt >= 0) {
                            break;
                        } else {
                            e.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            throw null;
                        }
                    case 5:
                        if (readInt >= 16384 && readInt <= 16777215) {
                            break;
                        } else {
                            e.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                            throw null;
                        }
                        break;
                }
                mVar.a(readShort, readInt);
            }
            bVar.a(false, mVar);
        } else {
            e.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i2));
            throw null;
        }
    }

    private void i(b bVar, int i2, byte b2, int i3) {
        if (i2 == 4) {
            long readInt = ((long) this.f9042b.readInt()) & 2147483647L;
            if (readInt != 0) {
                bVar.a(i3, readInt);
                return;
            }
            e.b("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        e.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i2));
        throw null;
    }

    public void a(b bVar) {
        if (!this.f9044d) {
            f c2 = this.f9042b.c((long) e.a.m());
            if (f9041f.isLoggable(Level.FINE)) {
                f9041f.fine(i.f0.c.a("<< CONNECTION %s", c2.i()));
            }
            if (!e.a.equals(c2)) {
                e.b("Expected a connection header but was %s", c2.p());
                throw null;
            }
        } else if (!a(true, bVar)) {
            e.b("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }

    public boolean a(boolean z, b bVar) {
        try {
            this.f9042b.f(9);
            int a2 = a(this.f9042b);
            if (a2 < 0 || a2 > 16384) {
                e.b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a2));
                throw null;
            }
            byte readByte = (byte) (this.f9042b.readByte() & 255);
            if (!z || readByte == 4) {
                byte readByte2 = (byte) (this.f9042b.readByte() & 255);
                int readInt = this.f9042b.readInt() & Integer.MAX_VALUE;
                if (f9041f.isLoggable(Level.FINE)) {
                    f9041f.fine(e.a(true, readInt, a2, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        a(bVar, a2, readByte2, readInt);
                        break;
                    case 1:
                        c(bVar, a2, readByte2, readInt);
                        break;
                    case 2:
                        e(bVar, a2, readByte2, readInt);
                        break;
                    case 3:
                        g(bVar, a2, readByte2, readInt);
                        break;
                    case 4:
                        h(bVar, a2, readByte2, readInt);
                        break;
                    case 5:
                        f(bVar, a2, readByte2, readInt);
                        break;
                    case 6:
                        d(bVar, a2, readByte2, readInt);
                        break;
                    case 7:
                        b(bVar, a2, readByte2, readInt);
                        break;
                    case 8:
                        i(bVar, a2, readByte2, readInt);
                        break;
                    default:
                        this.f9042b.skip((long) a2);
                        break;
                }
                return true;
            }
            e.b("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
            throw null;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9042b.close();
    }
}
