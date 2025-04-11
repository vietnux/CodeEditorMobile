package i;

import i.f0.c;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class k {

    /* renamed from: e  reason: collision with root package name */
    private static final h[] f9132e = {h.f9122k, h.f9124m, h.f9123l, h.n, h.p, h.o, h.f9120i, h.f9121j, h.f9118g, h.f9119h, h.f9116e, h.f9117f, h.f9115d};

    /* renamed from: f  reason: collision with root package name */
    public static final k f9133f;

    /* renamed from: g  reason: collision with root package name */
    public static final k f9134g = new a(false).a();
    final boolean a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f9135b;

    /* renamed from: c  reason: collision with root package name */
    final String[] f9136c;

    /* renamed from: d  reason: collision with root package name */
    final String[] f9137d;

    public static final class a {
        boolean a;

        /* renamed from: b  reason: collision with root package name */
        String[] f9138b;

        /* renamed from: c  reason: collision with root package name */
        String[] f9139c;

        /* renamed from: d  reason: collision with root package name */
        boolean f9140d;

        public a(k kVar) {
            this.a = kVar.a;
            this.f9138b = kVar.f9136c;
            this.f9139c = kVar.f9137d;
            this.f9140d = kVar.f9135b;
        }

        a(boolean z) {
            this.a = z;
        }

        public a a(boolean z) {
            if (this.a) {
                this.f9140d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public a a(d0... d0VarArr) {
            if (this.a) {
                String[] strArr = new String[d0VarArr.length];
                for (int i2 = 0; i2 < d0VarArr.length; i2++) {
                    strArr[i2] = d0VarArr[i2].f8801b;
                }
                b(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a a(h... hVarArr) {
            if (this.a) {
                String[] strArr = new String[hVarArr.length];
                for (int i2 = 0; i2 < hVarArr.length; i2++) {
                    strArr[i2] = hVarArr[i2].a;
                }
                a(strArr);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a a(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f9138b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public k a() {
            return new k(this);
        }

        public a b(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f9139c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }
    }

    static {
        a aVar = new a(true);
        aVar.a(f9132e);
        aVar.a(d0.TLS_1_3, d0.TLS_1_2, d0.TLS_1_1, d0.TLS_1_0);
        aVar.a(true);
        f9133f = aVar.a();
        a aVar2 = new a(f9133f);
        aVar2.a(d0.TLS_1_0);
        aVar2.a(true);
        aVar2.a();
    }

    k(a aVar) {
        this.a = aVar.a;
        this.f9136c = aVar.f9138b;
        this.f9137d = aVar.f9139c;
        this.f9135b = aVar.f9140d;
    }

    private k b(SSLSocket sSLSocket, boolean z) {
        String[] a2 = this.f9136c != null ? c.a(h.f9113b, sSLSocket.getEnabledCipherSuites(), this.f9136c) : sSLSocket.getEnabledCipherSuites();
        String[] a3 = this.f9137d != null ? c.a(c.f8807f, sSLSocket.getEnabledProtocols(), this.f9137d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int a4 = c.a(h.f9113b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && a4 != -1) {
            a2 = c.a(a2, supportedCipherSuites[a4]);
        }
        a aVar = new a(this);
        aVar.a(a2);
        aVar.b(a3);
        return aVar.a();
    }

    public List<h> a() {
        String[] strArr = this.f9136c;
        if (strArr != null) {
            return h.a(strArr);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(SSLSocket sSLSocket, boolean z) {
        k b2 = b(sSLSocket, z);
        String[] strArr = b2.f9137d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = b2.f9136c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.f9137d;
        if (strArr != null && !c.b(c.f8807f, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f9136c;
        return strArr2 == null || c.b(h.f9113b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean b() {
        return this.a;
    }

    public boolean c() {
        return this.f9135b;
    }

    public List<d0> d() {
        String[] strArr = this.f9137d;
        if (strArr != null) {
            return d0.a(strArr);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        k kVar = (k) obj;
        boolean z = this.a;
        if (z != kVar.a) {
            return false;
        }
        return !z || (Arrays.equals(this.f9136c, kVar.f9136c) && Arrays.equals(this.f9137d, kVar.f9137d) && this.f9135b == kVar.f9135b);
    }

    public int hashCode() {
        if (this.a) {
            return ((((527 + Arrays.hashCode(this.f9136c)) * 31) + Arrays.hashCode(this.f9137d)) * 31) + (!this.f9135b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        String str = "[all enabled]";
        String obj = this.f9136c != null ? a().toString() : str;
        if (this.f9137d != null) {
            str = d().toString();
        }
        return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + str + ", supportsTlsExtensions=" + this.f9135b + ")";
    }
}
