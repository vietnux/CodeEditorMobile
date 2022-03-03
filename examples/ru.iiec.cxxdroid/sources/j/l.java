package j;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class l {
    static final Logger a = Logger.getLogger(l.class.getName());

    /* access modifiers changed from: package-private */
    public class a implements r {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f9493b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ OutputStream f9494c;

        a(t tVar, OutputStream outputStream) {
            this.f9493b = tVar;
            this.f9494c = outputStream;
        }

        @Override // j.r
        public void a(c cVar, long j2) {
            u.a(cVar.f9474c, 0, j2);
            while (j2 > 0) {
                this.f9493b.e();
                o oVar = cVar.f9473b;
                int min = (int) Math.min(j2, (long) (oVar.f9506c - oVar.f9505b));
                this.f9494c.write(oVar.a, oVar.f9505b, min);
                oVar.f9505b += min;
                long j3 = (long) min;
                j2 -= j3;
                cVar.f9474c -= j3;
                if (oVar.f9505b == oVar.f9506c) {
                    cVar.f9473b = oVar.b();
                    p.a(oVar);
                }
            }
        }

        @Override // j.r
        public t b() {
            return this.f9493b;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, j.r
        public void close() {
            this.f9494c.close();
        }

        @Override // j.r, java.io.Flushable
        public void flush() {
            this.f9494c.flush();
        }

        public String toString() {
            return "sink(" + this.f9494c + ")";
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements s {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f9495b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InputStream f9496c;

        b(t tVar, InputStream inputStream) {
            this.f9495b = tVar;
            this.f9496c = inputStream;
        }

        @Override // j.s
        public long b(c cVar, long j2) {
            int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            } else if (i2 == 0) {
                return 0;
            } else {
                try {
                    this.f9495b.e();
                    o b2 = cVar.b(1);
                    int read = this.f9496c.read(b2.a, b2.f9506c, (int) Math.min(j2, (long) (8192 - b2.f9506c)));
                    if (read == -1) {
                        return -1;
                    }
                    b2.f9506c += read;
                    long j3 = (long) read;
                    cVar.f9474c += j3;
                    return j3;
                } catch (AssertionError e2) {
                    if (l.a(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
            }
        }

        @Override // j.s
        public t b() {
            return this.f9495b;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, j.s
        public void close() {
            this.f9496c.close();
        }

        public String toString() {
            return "source(" + this.f9496c + ")";
        }
    }

    class c implements r {
        c() {
        }

        @Override // j.r
        public void a(c cVar, long j2) {
            cVar.skip(j2);
        }

        @Override // j.r
        public t b() {
            return t.f9514d;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, j.r
        public void close() {
        }

        @Override // j.r, java.io.Flushable
        public void flush() {
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends a {

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Socket f9497k;

        d(Socket socket) {
            this.f9497k = socket;
        }

        /* access modifiers changed from: protected */
        @Override // j.a
        public IOException b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.AssertionError */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: protected */
        @Override // j.a
        public void i() {
            StringBuilder sb;
            Level level;
            Logger logger;
            Exception exc;
            try {
                this.f9497k.close();
                return;
            } catch (Exception e2) {
                Logger logger2 = l.a;
                level = Level.WARNING;
                sb = new StringBuilder();
                exc = e2;
                logger = logger2;
            } catch (AssertionError e3) {
                if (l.a(e3)) {
                    Logger logger3 = l.a;
                    level = Level.WARNING;
                    sb = new StringBuilder();
                    exc = e3;
                    logger = logger3;
                } else {
                    throw e3;
                }
            }
            sb.append("Failed to close timed out socket ");
            sb.append(this.f9497k);
            logger.log(level, sb.toString(), (Throwable) exc);
        }
    }

    private l() {
    }

    public static d a(r rVar) {
        return new m(rVar);
    }

    public static e a(s sVar) {
        return new n(sVar);
    }

    public static r a() {
        return new c();
    }

    public static r a(File file) {
        if (file != null) {
            return a(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static r a(OutputStream outputStream) {
        return a(outputStream, new t());
    }

    private static r a(OutputStream outputStream, t tVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (tVar != null) {
            return new a(tVar, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static r a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            a c2 = c(socket);
            return c2.a(a(socket.getOutputStream(), c2));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    public static s a(InputStream inputStream) {
        return a(inputStream, new t());
    }

    private static s a(InputStream inputStream, t tVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (tVar != null) {
            return new b(tVar, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static r b(File file) {
        if (file != null) {
            return a(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static s b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            a c2 = c(socket);
            return c2.a(a(socket.getInputStream(), c2));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    private static a c(Socket socket) {
        return new d(socket);
    }

    public static s c(File file) {
        if (file != null) {
            return a(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }
}
