package h.a.a;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;

class a {
    private final ByteArrayInputStream a;

    /* renamed from: b  reason: collision with root package name */
    private final MappedByteBuffer f8646b = null;

    /* renamed from: c  reason: collision with root package name */
    private final long f8647c = -1;

    public a(ByteArrayInputStream byteArrayInputStream) {
        this.a = byteArrayInputStream;
    }

    public int a(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = this.a;
        if (byteArrayInputStream != null) {
            try {
                return byteArrayInputStream.read(bArr);
            } catch (IOException e2) {
                throw new RuntimeException("Error reading " + bArr.length + " bytes", e2);
            }
        } else {
            MappedByteBuffer mappedByteBuffer = this.f8646b;
            if (mappedByteBuffer != null) {
                mappedByteBuffer.get(bArr);
                return bArr.length;
            }
            throw new RuntimeException("No way to read from file or buffer");
        }
    }

    /* access modifiers changed from: package-private */
    public short a() {
        int i2;
        ByteArrayInputStream byteArrayInputStream = this.a;
        if (byteArrayInputStream != null) {
            i2 = byteArrayInputStream.read();
        } else {
            MappedByteBuffer mappedByteBuffer = this.f8646b;
            i2 = mappedByteBuffer != null ? mappedByteBuffer.get() & 255 : -1;
        }
        if (i2 >= 0) {
            return (short) i2;
        }
        throw new c("Trying to read outside file");
    }

    public void a(int i2) {
        ByteArrayInputStream byteArrayInputStream = this.a;
        if (byteArrayInputStream != null) {
            long j2 = (long) i2;
            long skip = byteArrayInputStream.skip(j2);
            if (skip != j2) {
                throw new IllegalArgumentException("Wanted to skip " + i2 + " bytes, but only able to skip " + skip);
            }
            return;
        }
        MappedByteBuffer mappedByteBuffer = this.f8646b;
        mappedByteBuffer.position(mappedByteBuffer.position() + i2);
    }

    public void a(long j2) {
        ByteArrayInputStream byteArrayInputStream = this.a;
        if (byteArrayInputStream != null) {
            byteArrayInputStream.reset();
            if (this.a.skip(j2) != j2) {
                throw new c("seeking outside file");
            }
            return;
        }
        MappedByteBuffer mappedByteBuffer = this.f8646b;
        if (mappedByteBuffer != null) {
            mappedByteBuffer.position((int) (this.f8647c + j2));
        }
    }
}
