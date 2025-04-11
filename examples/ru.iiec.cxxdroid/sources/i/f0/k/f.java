package i.f0.k;

import i.f0.l.a;
import i.f0.l.b;
import i.f0.l.e;
import i.v;
import i.w;
import j.c;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

public class f {
    private static final f a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f9107b = Logger.getLogger(v.class.getName());

    public static List<String> a(List<w> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            w wVar = list.get(i2);
            if (wVar != w.HTTP_1_0) {
                arrayList.add(wVar.toString());
            }
        }
        return arrayList;
    }

    static byte[] b(List<w> list) {
        c cVar = new c();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            w wVar = list.get(i2);
            if (wVar != w.HTTP_1_0) {
                cVar.writeByte(wVar.toString().length());
                cVar.a(wVar.toString());
            }
        }
        return cVar.e();
    }

    private static f c() {
        f c2;
        f c3 = a.c();
        if (c3 != null) {
            return c3;
        }
        if (e() && (c2 = b.c()) != null) {
            return c2;
        }
        c c4 = c.c();
        if (c4 != null) {
            return c4;
        }
        f c5 = d.c();
        return c5 != null ? c5 : new f();
    }

    public static f d() {
        return a;
    }

    public static boolean e() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    public i.f0.l.c a(X509TrustManager x509TrustManager) {
        return new a(b(x509TrustManager));
    }

    public Object a(String str) {
        if (f9107b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public String a() {
        return "OkHttp";
    }

    public void a(int i2, String str, Throwable th) {
        f9107b.log(i2 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void a(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        a(5, str, (Throwable) obj);
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        socket.connect(inetSocketAddress, i2);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void a(SSLSocket sSLSocket, String str, List<w> list) {
    }

    public e b(X509TrustManager x509TrustManager) {
        return new b(x509TrustManager.getAcceptedIssuers());
    }

    public String b(SSLSocket sSLSocket) {
        return null;
    }

    public SSLContext b() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    public boolean b(String str) {
        return true;
    }
}
