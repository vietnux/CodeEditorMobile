package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

public final class qj extends ByteArrayOutputStream {

    /* renamed from: b  reason: collision with root package name */
    private final j9 f5345b;

    public qj(j9 j9Var, int i2) {
        this.f5345b = j9Var;
        ((ByteArrayOutputStream) this).buf = this.f5345b.a(Math.max(i2, 256));
    }

    private final void a(int i2) {
        int i3 = ((ByteArrayOutputStream) this).count;
        if (i3 + i2 > ((ByteArrayOutputStream) this).buf.length) {
            byte[] a = this.f5345b.a((i3 + i2) << 1);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a, 0, ((ByteArrayOutputStream) this).count);
            this.f5345b.a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = a;
        }
    }

    @Override // java.io.OutputStream, java.io.ByteArrayOutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5345b.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    @Override // java.lang.Object
    public final void finalize() {
        this.f5345b.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.OutputStream, java.io.ByteArrayOutputStream
    public final synchronized void write(int i2) {
        a(1);
        super.write(i2);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i2, int i3) {
        a(i3);
        super.write(bArr, i2, i3);
    }
}
