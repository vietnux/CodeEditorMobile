package i.f0.k;

import android.os.Build;
import android.util.Log;
import i.f0.l.e;
import i.w;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* access modifiers changed from: package-private */
public class a extends f {

    /* renamed from: c  reason: collision with root package name */
    private final e<Socket> f9087c;

    /* renamed from: d  reason: collision with root package name */
    private final e<Socket> f9088d;

    /* renamed from: e  reason: collision with root package name */
    private final e<Socket> f9089e;

    /* renamed from: f  reason: collision with root package name */
    private final e<Socket> f9090f;

    /* renamed from: g  reason: collision with root package name */
    private final c f9091g = c.a();

    /* renamed from: i.f0.k.a$a  reason: collision with other inner class name */
    static final class C0139a extends i.f0.l.c {
        private final Object a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f9092b;

        C0139a(Object obj, Method method) {
            this.a = obj;
            this.f9092b = method;
        }

        @Override // i.f0.l.c
        public List<Certificate> a(List<Certificate> list, String str) {
            try {
                return (List) this.f9092b.invoke(this.a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C0139a;
        }

        public int hashCode() {
            return 0;
        }
    }

    static final class b implements e {
        private final X509TrustManager a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f9093b;

        b(X509TrustManager x509TrustManager, Method method) {
            this.f9093b = method;
            this.a = x509TrustManager;
        }

        @Override // i.f0.l.e
        public X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f9093b.invoke(this.a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e2) {
                throw i.f0.c.a("unable to get issues and signature", (Exception) e2);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.f9093b.equals(bVar.f9093b);
        }

        public int hashCode() {
            return this.a.hashCode() + (this.f9093b.hashCode() * 31);
        }
    }

    static final class c {
        private final Method a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f9094b;

        /* renamed from: c  reason: collision with root package name */
        private final Method f9095c;

        c(Method method, Method method2, Method method3) {
            this.a = method;
            this.f9094b = method2;
            this.f9095c = method3;
        }

        static c a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new c(method3, method, method2);
        }

        /* access modifiers changed from: package-private */
        public Object a(String str) {
            Method method = this.a;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.f9094b.invoke(invoke, str);
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f9095c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    a(Class<?> cls, e<Socket> eVar, e<Socket> eVar2, e<Socket> eVar3, e<Socket> eVar4) {
        this.f9087c = eVar;
        this.f9088d = eVar2;
        this.f9089e = eVar3;
        this.f9090f = eVar4;
    }

    private boolean a(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.b(str);
        }
    }

    private boolean b(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return a(str, cls, obj);
        }
    }

    public static f c() {
        Class<?> cls;
        e eVar;
        e eVar2;
        try {
            cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
        } catch (ClassNotFoundException unused) {
            try {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        }
        e eVar3 = new e(null, "setUseSessionTickets", Boolean.TYPE);
        e eVar4 = new e(null, "setHostname", String.class);
        if (f()) {
            e eVar5 = new e(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            eVar = new e(null, "setAlpnProtocols", byte[].class);
            eVar2 = eVar5;
        } else {
            eVar2 = null;
            eVar = null;
        }
        return new a(cls, eVar3, eVar4, eVar2, eVar);
    }

    private static boolean f() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // i.f0.k.f
    public i.f0.l.c a(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C0139a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.a(x509TrustManager);
        }
    }

    @Override // i.f0.k.f
    public Object a(String str) {
        return this.f9091g.a(str);
    }

    @Override // i.f0.k.f
    public void a(int i2, String str, Throwable th) {
        int min;
        int i3 = 5;
        if (i2 != 5) {
            i3 = 3;
        }
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i4 = 0;
        int length = str.length();
        while (i4 < length) {
            int indexOf = str.indexOf(10, i4);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i4 + 4000);
                Log.println(i3, "OkHttp", str.substring(i4, min));
                if (min >= indexOf) {
                    break;
                }
                i4 = min;
            }
            i4 = min + 1;
        }
    }

    @Override // i.f0.k.f
    public void a(String str, Object obj) {
        if (!this.f9091g.a(obj)) {
            a(5, str, (Throwable) null);
        }
    }

    @Override // i.f0.k.f
    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        try {
            socket.connect(inetSocketAddress, i2);
        } catch (AssertionError e2) {
            if (i.f0.c.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        } catch (SecurityException e3) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e3);
            throw iOException;
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException2 = new IOException("Exception in connect");
                iOException2.initCause(e4);
                throw iOException2;
            }
            throw e4;
        }
    }

    @Override // i.f0.k.f
    public void a(SSLSocket sSLSocket, String str, List<w> list) {
        if (str != null) {
            this.f9087c.c(sSLSocket, true);
            this.f9088d.c(sSLSocket, str);
        }
        e<Socket> eVar = this.f9090f;
        if (eVar != null && eVar.a(sSLSocket)) {
            this.f9090f.d(sSLSocket, f.b(list));
        }
    }

    @Override // i.f0.k.f
    public e b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.b(x509TrustManager);
        }
    }

    @Override // i.f0.k.f
    public String b(SSLSocket sSLSocket) {
        byte[] bArr;
        e<Socket> eVar = this.f9089e;
        if (eVar == null || !eVar.a(sSLSocket) || (bArr = (byte[]) this.f9089e.d(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, i.f0.c.f8805d);
    }

    @Override // i.f0.k.f
    public boolean b(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return b(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.b(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            throw i.f0.c.a("unable to determine cleartext support", e2);
        }
    }
}
