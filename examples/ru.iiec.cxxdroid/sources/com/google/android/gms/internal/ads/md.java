package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

/* access modifiers changed from: package-private */
public final class md extends FilterInputStream {

    /* renamed from: b  reason: collision with root package name */
    private final long f4945b;

    /* renamed from: c  reason: collision with root package name */
    private long f4946c;

    md(InputStream inputStream, long j2) {
        super(inputStream);
        this.f4945b = j2;
    }

    /* access modifiers changed from: package-private */
    public final long l() {
        return this.f4945b - this.f4946c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f4946c++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        int read = super.read(bArr, i2, i3);
        if (read != -1) {
            this.f4946c += (long) read;
        }
        return read;
    }
}
