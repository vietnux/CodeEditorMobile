package i;

import i.f0.c;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class q {
    private final d0 a;

    /* renamed from: b  reason: collision with root package name */
    private final h f9159b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Certificate> f9160c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Certificate> f9161d;

    private q(d0 d0Var, h hVar, List<Certificate> list, List<Certificate> list2) {
        this.a = d0Var;
        this.f9159b = hVar;
        this.f9160c = list;
        this.f9161d = list2;
    }

    public static q a(d0 d0Var, h hVar, List<Certificate> list, List<Certificate> list2) {
        if (d0Var == null) {
            throw new NullPointerException("tlsVersion == null");
        } else if (hVar != null) {
            return new q(d0Var, hVar, c.a(list), c.a(list2));
        } else {
            throw new NullPointerException("cipherSuite == null");
        }
    }

    public static q a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            h a2 = h.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol != null) {
                d0 a3 = d0.a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                List a4 = certificateArr != null ? c.a(certificateArr) : Collections.emptyList();
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new q(a3, a2, a4, localCertificates != null ? c.a(localCertificates) : Collections.emptyList());
            }
            throw new IllegalStateException("tlsVersion == null");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public h a() {
        return this.f9159b;
    }

    public List<Certificate> b() {
        return this.f9161d;
    }

    public List<Certificate> c() {
        return this.f9160c;
    }

    public d0 d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a.equals(qVar.a) && this.f9159b.equals(qVar.f9159b) && this.f9160c.equals(qVar.f9160c) && this.f9161d.equals(qVar.f9161d);
    }

    public int hashCode() {
        return ((((((527 + this.a.hashCode()) * 31) + this.f9159b.hashCode()) * 31) + this.f9160c.hashCode()) * 31) + this.f9161d.hashCode();
    }
}
