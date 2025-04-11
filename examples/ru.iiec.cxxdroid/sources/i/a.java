package i;

import i.f0.c;
import i.s;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class a {
    final s a;

    /* renamed from: b  reason: collision with root package name */
    final o f8711b;

    /* renamed from: c  reason: collision with root package name */
    final SocketFactory f8712c;

    /* renamed from: d  reason: collision with root package name */
    final b f8713d;

    /* renamed from: e  reason: collision with root package name */
    final List<w> f8714e;

    /* renamed from: f  reason: collision with root package name */
    final List<k> f8715f;

    /* renamed from: g  reason: collision with root package name */
    final ProxySelector f8716g;

    /* renamed from: h  reason: collision with root package name */
    final Proxy f8717h;

    /* renamed from: i  reason: collision with root package name */
    final SSLSocketFactory f8718i;

    /* renamed from: j  reason: collision with root package name */
    final HostnameVerifier f8719j;

    /* renamed from: k  reason: collision with root package name */
    final g f8720k;

    public a(String str, int i2, o oVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, b bVar, Proxy proxy, List<w> list, List<k> list2, ProxySelector proxySelector) {
        s.a aVar = new s.a();
        aVar.d(sSLSocketFactory != null ? "https" : "http");
        aVar.b(str);
        aVar.a(i2);
        this.a = aVar.a();
        if (oVar != null) {
            this.f8711b = oVar;
            if (socketFactory != null) {
                this.f8712c = socketFactory;
                if (bVar != null) {
                    this.f8713d = bVar;
                    if (list != null) {
                        this.f8714e = c.a(list);
                        if (list2 != null) {
                            this.f8715f = c.a(list2);
                            if (proxySelector != null) {
                                this.f8716g = proxySelector;
                                this.f8717h = proxy;
                                this.f8718i = sSLSocketFactory;
                                this.f8719j = hostnameVerifier;
                                this.f8720k = gVar;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    public g a() {
        return this.f8720k;
    }

    /* access modifiers changed from: package-private */
    public boolean a(a aVar) {
        return this.f8711b.equals(aVar.f8711b) && this.f8713d.equals(aVar.f8713d) && this.f8714e.equals(aVar.f8714e) && this.f8715f.equals(aVar.f8715f) && this.f8716g.equals(aVar.f8716g) && c.a(this.f8717h, aVar.f8717h) && c.a(this.f8718i, aVar.f8718i) && c.a(this.f8719j, aVar.f8719j) && c.a(this.f8720k, aVar.f8720k) && k().j() == aVar.k().j();
    }

    public List<k> b() {
        return this.f8715f;
    }

    public o c() {
        return this.f8711b;
    }

    public HostnameVerifier d() {
        return this.f8719j;
    }

    public List<w> e() {
        return this.f8714e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && a(aVar);
        }
    }

    public Proxy f() {
        return this.f8717h;
    }

    public b g() {
        return this.f8713d;
    }

    public ProxySelector h() {
        return this.f8716g;
    }

    public int hashCode() {
        int hashCode = (((((((((((527 + this.a.hashCode()) * 31) + this.f8711b.hashCode()) * 31) + this.f8713d.hashCode()) * 31) + this.f8714e.hashCode()) * 31) + this.f8715f.hashCode()) * 31) + this.f8716g.hashCode()) * 31;
        Proxy proxy = this.f8717h;
        int i2 = 0;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f8718i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f8719j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        g gVar = this.f8720k;
        if (gVar != null) {
            i2 = gVar.hashCode();
        }
        return hashCode4 + i2;
    }

    public SocketFactory i() {
        return this.f8712c;
    }

    public SSLSocketFactory j() {
        return this.f8718i;
    }

    public s k() {
        return this.a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.a.g());
        sb.append(":");
        sb.append(this.a.j());
        if (this.f8717h != null) {
            sb.append(", proxy=");
            obj = this.f8717h;
        } else {
            sb.append(", proxySelector=");
            obj = this.f8716g;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
