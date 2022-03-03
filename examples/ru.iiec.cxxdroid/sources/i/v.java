package i;

import i.a0;
import i.e;
import i.f0.c;
import i.f0.e.f;
import i.f0.f.d;
import i.f0.f.g;
import i.p;
import i.r;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public class v implements Cloneable, e.a, e0 {
    static final List<w> C = c.a(w.HTTP_2, w.HTTP_1_1);
    static final List<k> D = c.a(k.f9133f, k.f9134g);
    final int A;
    final int B;

    /* renamed from: b  reason: collision with root package name */
    final n f9183b;

    /* renamed from: c  reason: collision with root package name */
    final Proxy f9184c;

    /* renamed from: d  reason: collision with root package name */
    final List<w> f9185d;

    /* renamed from: e  reason: collision with root package name */
    final List<k> f9186e;

    /* renamed from: f  reason: collision with root package name */
    final List<t> f9187f;

    /* renamed from: g  reason: collision with root package name */
    final List<t> f9188g;

    /* renamed from: h  reason: collision with root package name */
    final p.c f9189h;

    /* renamed from: i  reason: collision with root package name */
    final ProxySelector f9190i;

    /* renamed from: j  reason: collision with root package name */
    final m f9191j;

    /* renamed from: k  reason: collision with root package name */
    final c f9192k;

    /* renamed from: l  reason: collision with root package name */
    final f f9193l;

    /* renamed from: m  reason: collision with root package name */
    final SocketFactory f9194m;
    final SSLSocketFactory n;
    final i.f0.l.c o;
    final HostnameVerifier p;
    final g q;
    final b r;
    final b s;
    final j t;
    final o u;
    final boolean v;
    final boolean w;
    final boolean x;
    final int y;
    final int z;

    class a extends i.f0.a {
        a() {
        }

        @Override // i.f0.a
        public int a(a0.a aVar) {
            return aVar.f8734c;
        }

        @Override // i.f0.a
        public i.f0.f.c a(j jVar, a aVar, g gVar, c0 c0Var) {
            return jVar.a(aVar, gVar, c0Var);
        }

        @Override // i.f0.a
        public d a(j jVar) {
            return jVar.f9129e;
        }

        @Override // i.f0.a
        public Socket a(j jVar, a aVar, g gVar) {
            return jVar.a(aVar, gVar);
        }

        @Override // i.f0.a
        public void a(k kVar, SSLSocket sSLSocket, boolean z) {
            kVar.a(sSLSocket, z);
        }

        @Override // i.f0.a
        public void a(r.a aVar, String str) {
            aVar.a(str);
        }

        @Override // i.f0.a
        public void a(r.a aVar, String str, String str2) {
            aVar.b(str, str2);
        }

        @Override // i.f0.a
        public boolean a(a aVar, a aVar2) {
            return aVar.a(aVar2);
        }

        @Override // i.f0.a
        public boolean a(j jVar, i.f0.f.c cVar) {
            return jVar.a(cVar);
        }

        @Override // i.f0.a
        public void b(j jVar, i.f0.f.c cVar) {
            jVar.b(cVar);
        }
    }

    public static final class b {
        int A;
        n a = new n();

        /* renamed from: b  reason: collision with root package name */
        Proxy f9195b;

        /* renamed from: c  reason: collision with root package name */
        List<w> f9196c = v.C;

        /* renamed from: d  reason: collision with root package name */
        List<k> f9197d = v.D;

        /* renamed from: e  reason: collision with root package name */
        final List<t> f9198e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        final List<t> f9199f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        p.c f9200g = p.a(p.a);

        /* renamed from: h  reason: collision with root package name */
        ProxySelector f9201h = ProxySelector.getDefault();

        /* renamed from: i  reason: collision with root package name */
        m f9202i = m.a;

        /* renamed from: j  reason: collision with root package name */
        c f9203j;

        /* renamed from: k  reason: collision with root package name */
        f f9204k;

        /* renamed from: l  reason: collision with root package name */
        SocketFactory f9205l = SocketFactory.getDefault();

        /* renamed from: m  reason: collision with root package name */
        SSLSocketFactory f9206m;
        i.f0.l.c n;
        HostnameVerifier o = i.f0.l.d.a;
        g p = g.f9108c;
        b q;
        b r;
        j s;
        o t;
        boolean u;
        boolean v;
        boolean w;
        int x;
        int y;
        int z;

        public b() {
            b bVar = b.a;
            this.q = bVar;
            this.r = bVar;
            this.s = new j();
            this.t = o.a;
            this.u = true;
            this.v = true;
            this.w = true;
            this.x = 10000;
            this.y = 10000;
            this.z = 10000;
            this.A = 0;
        }

        public b a(c cVar) {
            this.f9203j = cVar;
            this.f9204k = null;
            return this;
        }

        public v a() {
            return new v(this);
        }
    }

    static {
        i.f0.a.a = new a();
    }

    public v() {
        this(new b());
    }

    v(b bVar) {
        boolean z2;
        i.f0.l.c cVar;
        this.f9183b = bVar.a;
        this.f9184c = bVar.f9195b;
        this.f9185d = bVar.f9196c;
        this.f9186e = bVar.f9197d;
        this.f9187f = c.a(bVar.f9198e);
        this.f9188g = c.a(bVar.f9199f);
        this.f9189h = bVar.f9200g;
        this.f9190i = bVar.f9201h;
        this.f9191j = bVar.f9202i;
        this.f9192k = bVar.f9203j;
        this.f9193l = bVar.f9204k;
        this.f9194m = bVar.f9205l;
        Iterator<k> it = this.f9186e.iterator();
        loop0:
        while (true) {
            z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                k next = it.next();
                if (z2 || next.b()) {
                    z2 = true;
                }
            }
        }
        if (bVar.f9206m != null || !z2) {
            this.n = bVar.f9206m;
            cVar = bVar.n;
        } else {
            X509TrustManager E = E();
            this.n = a(E);
            cVar = i.f0.l.c.a(E);
        }
        this.o = cVar;
        this.p = bVar.o;
        this.q = bVar.p.a(this.o);
        this.r = bVar.q;
        this.s = bVar.r;
        this.t = bVar.s;
        this.u = bVar.t;
        this.v = bVar.u;
        this.w = bVar.v;
        this.x = bVar.w;
        this.y = bVar.x;
        this.z = bVar.y;
        this.A = bVar.z;
        this.B = bVar.A;
        if (this.f9187f.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f9187f);
        } else if (this.f9188g.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f9188g);
        }
    }

    private X509TrustManager E() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e2) {
            throw c.a("No System TLS", (Exception) e2);
        }
    }

    private SSLSocketFactory a(X509TrustManager x509TrustManager) {
        try {
            SSLContext b2 = i.f0.k.f.d().b();
            b2.init(null, new TrustManager[]{x509TrustManager}, null);
            return b2.getSocketFactory();
        } catch (GeneralSecurityException e2) {
            throw c.a("No System TLS", (Exception) e2);
        }
    }

    public boolean A() {
        return this.x;
    }

    public SocketFactory B() {
        return this.f9194m;
    }

    public SSLSocketFactory C() {
        return this.n;
    }

    public int D() {
        return this.A;
    }

    public b a() {
        return this.s;
    }

    @Override // i.e.a
    public e a(y yVar) {
        return x.a(this, yVar, false);
    }

    public c b() {
        return this.f9192k;
    }

    public g c() {
        return this.q;
    }

    public int d() {
        return this.y;
    }

    public j e() {
        return this.t;
    }

    public List<k> f() {
        return this.f9186e;
    }

    public m g() {
        return this.f9191j;
    }

    public n h() {
        return this.f9183b;
    }

    public o i() {
        return this.u;
    }

    public p.c j() {
        return this.f9189h;
    }

    public boolean k() {
        return this.w;
    }

    public boolean p() {
        return this.v;
    }

    public HostnameVerifier q() {
        return this.p;
    }

    public List<t> r() {
        return this.f9187f;
    }

    /* access modifiers changed from: package-private */
    public f s() {
        c cVar = this.f9192k;
        return cVar != null ? cVar.f8746b : this.f9193l;
    }

    public List<t> t() {
        return this.f9188g;
    }

    public int u() {
        return this.B;
    }

    public List<w> v() {
        return this.f9185d;
    }

    public Proxy w() {
        return this.f9184c;
    }

    public b x() {
        return this.r;
    }

    public ProxySelector y() {
        return this.f9190i;
    }

    public int z() {
        return this.z;
    }
}
