package j;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

public interface e extends s, ReadableByteChannel {
    long a(byte b2);

    c a();

    boolean a(long j2, f fVar);

    f c(long j2);

    String d();

    byte[] d(long j2);

    String e(long j2);

    byte[] e();

    int f();

    void f(long j2);

    boolean g();

    short h();

    long i();

    long j();

    InputStream k();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    short readShort();

    void skip(long j2);
}
