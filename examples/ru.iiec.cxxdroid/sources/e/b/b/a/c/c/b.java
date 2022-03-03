package e.b.b.a.c.c;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class b {
    private final ByteBuffer a;

    private b(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        this.a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private b(byte[] bArr, int i2, int i3) {
        this(ByteBuffer.wrap(bArr, 0, i3));
    }

    public static b b(byte[] bArr) {
        return new b(bArr, 0, bArr.length);
    }

    private final void b(int i2) {
        byte b2 = (byte) i2;
        if (this.a.hasRemaining()) {
            this.a.put(b2);
            return;
        }
        throw new c(this.a.position(), this.a.limit());
    }

    public static int c(int i2) {
        if ((i2 & -128) == 0) {
            return 1;
        }
        if ((i2 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i2) == 0) {
            return 3;
        }
        return (i2 & -268435456) == 0 ? 4 : 5;
    }

    public final void a(int i2) {
        while ((i2 & -128) != 0) {
            b((i2 & 127) | 128);
            i2 >>>= 7;
        }
        b(i2);
    }

    public final void a(byte[] bArr) {
        int length = bArr.length;
        if (this.a.remaining() >= length) {
            this.a.put(bArr, 0, length);
            return;
        }
        throw new c(this.a.position(), this.a.limit());
    }
}
