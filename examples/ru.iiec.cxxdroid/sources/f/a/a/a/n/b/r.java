package f.a.a.a.n.b;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class r implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    private static final Logger f8432h = Logger.getLogger(r.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private final RandomAccessFile f8433b;

    /* renamed from: c  reason: collision with root package name */
    int f8434c;

    /* renamed from: d  reason: collision with root package name */
    private int f8435d;

    /* renamed from: e  reason: collision with root package name */
    private b f8436e;

    /* renamed from: f  reason: collision with root package name */
    private b f8437f;

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f8438g = new byte[16];

    /* access modifiers changed from: package-private */
    public class a implements d {
        boolean a = true;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StringBuilder f8439b;

        a(r rVar, StringBuilder sb) {
            this.f8439b = sb;
        }

        @Override // f.a.a.a.n.b.r.d
        public void a(InputStream inputStream, int i2) {
            if (this.a) {
                this.a = false;
            } else {
                this.f8439b.append(", ");
            }
            this.f8439b.append(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: c  reason: collision with root package name */
        static final b f8440c = new b(0, 0);
        final int a;

        /* renamed from: b  reason: collision with root package name */
        final int f8441b;

        b(int i2, int i3) {
            this.a = i2;
            this.f8441b = i3;
        }

        public String toString() {
            return b.class.getSimpleName() + "[position = " + this.a + ", length = " + this.f8441b + "]";
        }
    }

    /* access modifiers changed from: private */
    public final class c extends InputStream {

        /* renamed from: b  reason: collision with root package name */
        private int f8442b;

        /* renamed from: c  reason: collision with root package name */
        private int f8443c;

        private c(b bVar) {
            this.f8442b = r.this.d(bVar.a + 4);
            this.f8443c = bVar.f8441b;
        }

        /* synthetic */ c(r rVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f8443c == 0) {
                return -1;
            }
            r.this.f8433b.seek((long) this.f8442b);
            int read = r.this.f8433b.read();
            this.f8442b = r.this.d(this.f8442b + 1);
            this.f8443c--;
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            r.b(bArr, "buffer");
            if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i4 = this.f8443c;
            if (i4 <= 0) {
                return -1;
            }
            if (i3 > i4) {
                i3 = i4;
            }
            r.this.a((r) this.f8442b, (int) bArr, (byte[]) i2, i3);
            this.f8442b = r.this.d(this.f8442b + i3);
            this.f8443c -= i3;
            return i3;
        }
    }

    public interface d {
        void a(InputStream inputStream, int i2);
    }

    public r(File file) {
        if (!file.exists()) {
            a(file);
        }
        this.f8433b = b(file);
        p();
    }

    private static int a(byte[] bArr, int i2) {
        return ((bArr[i2] & 255) << 24) + ((bArr[i2 + 1] & 255) << 16) + ((bArr[i2 + 2] & 255) << 8) + (bArr[i2 + 3] & 255);
    }

    private void a(int i2) {
        int i3 = i2 + 4;
        int q = q();
        if (q < i3) {
            int i4 = this.f8434c;
            do {
                q += i4;
                i4 <<= 1;
            } while (q < i3);
            c(i4);
            b bVar = this.f8437f;
            int d2 = d(bVar.a + 4 + bVar.f8441b);
            if (d2 < this.f8436e.a) {
                FileChannel channel = this.f8433b.getChannel();
                channel.position((long) this.f8434c);
                long j2 = (long) (d2 - 4);
                if (channel.transferTo(16, j2, channel) != j2) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i5 = this.f8437f.a;
            int i6 = this.f8436e.a;
            if (i5 < i6) {
                int i7 = (this.f8434c + i5) - 16;
                a(i4, this.f8435d, i6, i7);
                this.f8437f = new b(i7, this.f8437f.f8441b);
            } else {
                a(i4, this.f8435d, i6, i5);
            }
            this.f8434c = i4;
        }
    }

    private void a(int i2, int i3, int i4, int i5) {
        a(this.f8438g, i2, i3, i4, i5);
        this.f8433b.seek(0);
        this.f8433b.write(this.f8438g);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(int i2, byte[] bArr, int i3, int i4) {
        RandomAccessFile randomAccessFile;
        int d2 = d(i2);
        int i5 = d2 + i4;
        int i6 = this.f8434c;
        if (i5 <= i6) {
            this.f8433b.seek((long) d2);
            randomAccessFile = this.f8433b;
        } else {
            int i7 = i6 - d2;
            this.f8433b.seek((long) d2);
            this.f8433b.readFully(bArr, i3, i7);
            this.f8433b.seek(16);
            randomAccessFile = this.f8433b;
            i3 += i7;
            i4 -= i7;
        }
        randomAccessFile.readFully(bArr, i3, i4);
    }

    /* JADX INFO: finally extract failed */
    private static void a(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile b2 = b(file2);
        try {
            b2.setLength(4096);
            b2.seek(0);
            byte[] bArr = new byte[16];
            a(bArr, 4096, 0, 0, 0);
            b2.write(bArr);
            b2.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            b2.close();
            throw th;
        }
    }

    private static void a(byte[] bArr, int... iArr) {
        int i2 = 0;
        for (int i3 : iArr) {
            b(bArr, i2, i3);
            i2 += 4;
        }
    }

    private b b(int i2) {
        if (i2 == 0) {
            return b.f8440c;
        }
        this.f8433b.seek((long) i2);
        return new b(i2, this.f8433b.readInt());
    }

    private static RandomAccessFile b(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* access modifiers changed from: private */
    public static <T> T b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    private void b(int i2, byte[] bArr, int i3, int i4) {
        RandomAccessFile randomAccessFile;
        int d2 = d(i2);
        int i5 = d2 + i4;
        int i6 = this.f8434c;
        if (i5 <= i6) {
            this.f8433b.seek((long) d2);
            randomAccessFile = this.f8433b;
        } else {
            int i7 = i6 - d2;
            this.f8433b.seek((long) d2);
            this.f8433b.write(bArr, i3, i7);
            this.f8433b.seek(16);
            randomAccessFile = this.f8433b;
            i3 += i7;
            i4 -= i7;
        }
        randomAccessFile.write(bArr, i3, i4);
    }

    private static void b(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    private void c(int i2) {
        this.f8433b.setLength((long) i2);
        this.f8433b.getChannel().force(true);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int d(int i2) {
        int i3 = this.f8434c;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    private void p() {
        this.f8433b.seek(0);
        this.f8433b.readFully(this.f8438g);
        this.f8434c = a(this.f8438g, 0);
        if (((long) this.f8434c) <= this.f8433b.length()) {
            this.f8435d = a(this.f8438g, 4);
            int a2 = a(this.f8438g, 8);
            int a3 = a(this.f8438g, 12);
            this.f8436e = b(a2);
            this.f8437f = b(a3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f8434c + ", Actual length: " + this.f8433b.length());
    }

    private int q() {
        return this.f8434c - o();
    }

    public synchronized void a(d dVar) {
        int i2 = this.f8436e.a;
        for (int i3 = 0; i3 < this.f8435d; i3++) {
            b b2 = b(i2);
            dVar.a(new c(this, b2, null), b2.f8441b);
            i2 = d(b2.a + 4 + b2.f8441b);
        }
    }

    public void a(byte[] bArr) {
        a(bArr, 0, bArr.length);
    }

    public synchronized void a(byte[] bArr, int i2, int i3) {
        b(bArr, "buffer");
        if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        a(i3);
        boolean m2 = m();
        b bVar = new b(m2 ? 16 : d(this.f8437f.a + 4 + this.f8437f.f8441b), i3);
        b(this.f8438g, 0, i3);
        b(bVar.a, this.f8438g, 0, 4);
        b(bVar.a + 4, bArr, i2, i3);
        a(this.f8434c, this.f8435d + 1, m2 ? bVar.a : this.f8436e.a, bVar.a);
        this.f8437f = bVar;
        this.f8435d++;
        if (m2) {
            this.f8436e = this.f8437f;
        }
    }

    public boolean a(int i2, int i3) {
        return (o() + 4) + i2 <= i3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f8433b.close();
    }

    public synchronized void l() {
        a(4096, 0, 0, 0);
        this.f8435d = 0;
        this.f8436e = b.f8440c;
        this.f8437f = b.f8440c;
        if (this.f8434c > 4096) {
            c(4096);
        }
        this.f8434c = 4096;
    }

    public synchronized boolean m() {
        return this.f8435d == 0;
    }

    public synchronized void n() {
        if (m()) {
            throw new NoSuchElementException();
        } else if (this.f8435d == 1) {
            l();
        } else {
            int d2 = d(this.f8436e.a + 4 + this.f8436e.f8441b);
            a(d2, this.f8438g, 0, 4);
            int a2 = a(this.f8438g, 0);
            a(this.f8434c, this.f8435d - 1, d2, this.f8437f.a);
            this.f8435d--;
            this.f8436e = new b(d2, a2);
        }
    }

    public int o() {
        if (this.f8435d == 0) {
            return 16;
        }
        b bVar = this.f8437f;
        int i2 = bVar.a;
        int i3 = this.f8436e.a;
        return i2 >= i3 ? (i2 - i3) + 4 + bVar.f8441b + 16 : (((i2 + 4) + bVar.f8441b) + this.f8434c) - i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(r.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f8434c);
        sb.append(", size=");
        sb.append(this.f8435d);
        sb.append(", first=");
        sb.append(this.f8436e);
        sb.append(", last=");
        sb.append(this.f8437f);
        sb.append(", element lengths=[");
        try {
            a(new a(this, sb));
        } catch (IOException e2) {
            f8432h.log(Level.WARNING, "read error", (Throwable) e2);
        }
        sb.append("]]");
        return sb.toString();
    }
}
