package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

final class n extends InputStream {

    /* renamed from: b  reason: collision with root package name */
    private final InputStream f6842b;

    /* renamed from: c  reason: collision with root package name */
    private long f6843c;

    /* renamed from: d  reason: collision with root package name */
    private long f6844d;

    /* renamed from: e  reason: collision with root package name */
    private long f6845e;

    /* renamed from: f  reason: collision with root package name */
    private long f6846f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6847g;

    /* renamed from: h  reason: collision with root package name */
    private int f6848h;

    n(InputStream inputStream) {
        this(inputStream, 4096);
    }

    n(InputStream inputStream, int i2) {
        this(inputStream, i2, 1024);
    }

    private n(InputStream inputStream, int i2, int i3) {
        this.f6846f = -1;
        this.f6847g = true;
        this.f6848h = -1;
        this.f6842b = !inputStream.markSupported() ? new BufferedInputStream(inputStream, i2) : inputStream;
        this.f6848h = i3;
    }

    private void a(long j2, long j3) {
        while (j2 < j3) {
            long skip = this.f6842b.skip(j3 - j2);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j2 += skip;
        }
    }

    private void h(long j2) {
        try {
            if (this.f6844d >= this.f6843c || this.f6843c > this.f6845e) {
                this.f6844d = this.f6843c;
                this.f6842b.mark((int) (j2 - this.f6843c));
            } else {
                this.f6842b.reset();
                this.f6842b.mark((int) (j2 - this.f6844d));
                a(this.f6844d, this.f6843c);
            }
            this.f6845e = j2;
        } catch (IOException e2) {
            throw new IllegalStateException("Unable to mark: " + e2);
        }
    }

    public long a(int i2) {
        long j2 = this.f6843c + ((long) i2);
        if (this.f6845e < j2) {
            h(j2);
        }
        return this.f6843c;
    }

    public void a(boolean z) {
        this.f6847g = z;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f6842b.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        this.f6842b.close();
    }

    public void g(long j2) {
        if (this.f6843c > this.f6845e || j2 < this.f6844d) {
            throw new IOException("Cannot reset");
        }
        this.f6842b.reset();
        a(this.f6844d, j2);
        this.f6843c = j2;
    }

    public void mark(int i2) {
        this.f6846f = a(i2);
    }

    public boolean markSupported() {
        return this.f6842b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        if (!this.f6847g) {
            long j2 = this.f6845e;
            if (this.f6843c + 1 > j2) {
                h(j2 + ((long) this.f6848h));
            }
        }
        int read = this.f6842b.read();
        if (read != -1) {
            this.f6843c++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        if (!this.f6847g) {
            long j2 = this.f6843c;
            if (((long) bArr.length) + j2 > this.f6845e) {
                h(j2 + ((long) bArr.length) + ((long) this.f6848h));
            }
        }
        int read = this.f6842b.read(bArr);
        if (read != -1) {
            this.f6843c += (long) read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        if (!this.f6847g) {
            long j2 = this.f6843c;
            long j3 = (long) i3;
            if (j2 + j3 > this.f6845e) {
                h(j2 + j3 + ((long) this.f6848h));
            }
        }
        int read = this.f6842b.read(bArr, i2, i3);
        if (read != -1) {
            this.f6843c += (long) read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() {
        g(this.f6846f);
    }

    @Override // java.io.InputStream
    public long skip(long j2) {
        if (!this.f6847g) {
            long j3 = this.f6843c;
            if (j3 + j2 > this.f6845e) {
                h(j3 + j2 + ((long) this.f6848h));
            }
        }
        long skip = this.f6842b.skip(j2);
        this.f6843c += skip;
        return skip;
    }
}
