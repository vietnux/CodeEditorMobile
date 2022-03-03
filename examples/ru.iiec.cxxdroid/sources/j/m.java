package j;

import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
public final class m implements d {

    /* renamed from: b  reason: collision with root package name */
    public final c f9498b = new c();

    /* renamed from: c  reason: collision with root package name */
    public final r f9499c;

    /* renamed from: d  reason: collision with root package name */
    boolean f9500d;

    m(r rVar) {
        if (rVar != null) {
            this.f9499c = rVar;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    @Override // j.d
    public c a() {
        return this.f9498b;
    }

    @Override // j.d
    public d a(long j2) {
        if (!this.f9500d) {
            this.f9498b.a(j2);
            return c();
        }
        throw new IllegalStateException("closed");
    }

    @Override // j.d
    public d a(String str) {
        if (!this.f9500d) {
            this.f9498b.a(str);
            return c();
        }
        throw new IllegalStateException("closed");
    }

    @Override // j.r
    public void a(c cVar, long j2) {
        if (!this.f9500d) {
            this.f9498b.a(cVar, j2);
            c();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // j.d
    public d b(long j2) {
        if (!this.f9500d) {
            this.f9498b.b(j2);
            c();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // j.r
    public t b() {
        return this.f9499c.b();
    }

    @Override // j.d
    public d c() {
        if (!this.f9500d) {
            long q = this.f9498b.q();
            if (q > 0) {
                this.f9499c.a(this.f9498b, q);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, j.r, java.nio.channels.Channel
    public void close() {
        Throwable th;
        if (!this.f9500d) {
            try {
                if (this.f9498b.f9474c > 0) {
                    this.f9499c.a(this.f9498b, this.f9498b.f9474c);
                }
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f9499c.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f9500d = true;
            if (th != null) {
                u.a(th);
                throw null;
            }
        }
    }

    @Override // j.d, j.r, java.io.Flushable
    public void flush() {
        if (!this.f9500d) {
            c cVar = this.f9498b;
            long j2 = cVar.f9474c;
            if (j2 > 0) {
                this.f9499c.a(cVar, j2);
            }
            this.f9499c.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f9500d;
    }

    public String toString() {
        return "buffer(" + this.f9499c + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (!this.f9500d) {
            int write = this.f9498b.write(byteBuffer);
            c();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    @Override // j.d
    public d write(byte[] bArr) {
        if (!this.f9500d) {
            this.f9498b.write(bArr);
            c();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // j.d
    public d write(byte[] bArr, int i2, int i3) {
        if (!this.f9500d) {
            this.f9498b.write(bArr, i2, i3);
            c();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // j.d
    public d writeByte(int i2) {
        if (!this.f9500d) {
            this.f9498b.writeByte(i2);
            c();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // j.d
    public d writeInt(int i2) {
        if (!this.f9500d) {
            this.f9498b.writeInt(i2);
            return c();
        }
        throw new IllegalStateException("closed");
    }

    @Override // j.d
    public d writeShort(int i2) {
        if (!this.f9500d) {
            this.f9498b.writeShort(i2);
            c();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
