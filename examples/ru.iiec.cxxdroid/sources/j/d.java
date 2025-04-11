package j;

import java.nio.channels.WritableByteChannel;

public interface d extends r, WritableByteChannel {
    c a();

    d a(long j2);

    d a(String str);

    d b(long j2);

    d c();

    @Override // j.r, java.io.Flushable
    void flush();

    d write(byte[] bArr);

    d write(byte[] bArr, int i2, int i3);

    d writeByte(int i2);

    d writeInt(int i2);

    d writeShort(int i2);
}
