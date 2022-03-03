package i.f0.f;

import i.a0;
import i.c0;
import i.f0.h.a;
import i.f0.i.b;
import i.f0.i.g;
import i.f0.k.f;
import i.i;
import i.j;
import i.p;
import i.q;
import i.s;
import i.t;
import i.v;
import i.w;
import i.y;
import j.d;
import j.e;
import j.l;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class c extends g.h implements i {

    /* renamed from: b  reason: collision with root package name */
    private final j f8859b;

    /* renamed from: c  reason: collision with root package name */
    private final c0 f8860c;

    /* renamed from: d  reason: collision with root package name */
    private Socket f8861d;

    /* renamed from: e  reason: collision with root package name */
    private Socket f8862e;

    /* renamed from: f  reason: collision with root package name */
    private q f8863f;

    /* renamed from: g  reason: collision with root package name */
    private w f8864g;

    /* renamed from: h  reason: collision with root package name */
    private g f8865h;

    /* renamed from: i  reason: collision with root package name */
    private e f8866i;

    /* renamed from: j  reason: collision with root package name */
    private d f8867j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8868k;

    /* renamed from: l  reason: collision with root package name */
    public int f8869l;

    /* renamed from: m  reason: collision with root package name */
    public int f8870m = 1;
    public final List<Reference<g>> n = new ArrayList();
    public long o = Long.MAX_VALUE;

    public c(j jVar, c0 c0Var) {
        this.f8859b = jVar;
        this.f8860c = c0Var;
    }

    private y a(int i2, int i3, y yVar, s sVar) {
        String str = "CONNECT " + i.f0.c.a(sVar, true) + " HTTP/1.1";
        while (true) {
            a aVar = new a(null, null, this.f8866i, this.f8867j);
            this.f8866i.b().a((long) i2, TimeUnit.MILLISECONDS);
            this.f8867j.b().a((long) i3, TimeUnit.MILLISECONDS);
            aVar.a(yVar.c(), str);
            aVar.a();
            a0.a a = aVar.a(false);
            a.a(yVar);
            a0 a2 = a.a();
            long a3 = i.f0.g.e.a(a2);
            if (a3 == -1) {
                a3 = 0;
            }
            j.s b2 = aVar.b(a3);
            i.f0.c.b(b2, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            b2.close();
            int o2 = a2.o();
            if (o2 != 200) {
                if (o2 == 407) {
                    y a4 = this.f8860c.a().g().a(this.f8860c, a2);
                    if (a4 == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if ("close".equalsIgnoreCase(a2.b("Connection"))) {
                        return a4;
                    } else {
                        yVar = a4;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + a2.o());
                }
            } else if (this.f8866i.a().g() && this.f8867j.a().g()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private void a(int i2, int i3, int i4, i.e eVar, p pVar) {
        y e2 = e();
        s g2 = e2.g();
        for (int i5 = 0; i5 < 21; i5++) {
            a(i2, i3, eVar, pVar);
            e2 = a(i3, i4, e2, g2);
            if (e2 != null) {
                i.f0.c.a(this.f8861d);
                this.f8861d = null;
                this.f8867j = null;
                this.f8866i = null;
                pVar.a(eVar, this.f8860c.d(), this.f8860c.b(), null);
            } else {
                return;
            }
        }
    }

    private void a(int i2, int i3, i.e eVar, p pVar) {
        Proxy b2 = this.f8860c.b();
        this.f8861d = (b2.type() == Proxy.Type.DIRECT || b2.type() == Proxy.Type.HTTP) ? this.f8860c.a().i().createSocket() : new Socket(b2);
        pVar.a(eVar, this.f8860c.d(), b2);
        this.f8861d.setSoTimeout(i3);
        try {
            f.d().a(this.f8861d, this.f8860c.d(), i2);
            try {
                this.f8866i = l.a(l.b(this.f8861d));
                this.f8867j = l.a(l.a(this.f8861d));
            } catch (NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f8860c.d());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011f A[Catch:{ all -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0125 A[Catch:{ all -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(i.f0.f.b r8) {
        /*
        // Method dump skipped, instructions count: 307
        */
        throw new UnsupportedOperationException("Method not decompiled: i.f0.f.c.a(i.f0.f.b):void");
    }

    private void a(b bVar, int i2, i.e eVar, p pVar) {
        if (this.f8860c.a().j() == null) {
            this.f8864g = w.HTTP_1_1;
            this.f8862e = this.f8861d;
            return;
        }
        pVar.g(eVar);
        a(bVar);
        pVar.a(eVar, this.f8863f);
        if (this.f8864g == w.HTTP_2) {
            this.f8862e.setSoTimeout(0);
            g.C0137g gVar = new g.C0137g(true);
            gVar.a(this.f8862e, this.f8860c.a().k().g(), this.f8866i, this.f8867j);
            gVar.a(this);
            gVar.a(i2);
            this.f8865h = gVar.a();
            this.f8865h.n();
        }
    }

    private boolean a(SSLSession sSLSession) {
        return !"NONE".equals(sSLSession.getProtocol()) && !"SSL_NULL_WITH_NULL_NULL".equals(sSLSession.getCipherSuite());
    }

    private y e() {
        y.a aVar = new y.a();
        aVar.a(this.f8860c.a().k());
        aVar.a("Host", i.f0.c.a(this.f8860c.a().k(), true));
        aVar.a("Proxy-Connection", "Keep-Alive");
        aVar.a("User-Agent", i.f0.d.a());
        return aVar.a();
    }

    public i.f0.g.c a(v vVar, t.a aVar, g gVar) {
        g gVar2 = this.f8865h;
        if (gVar2 != null) {
            return new i.f0.i.f(vVar, aVar, gVar, gVar2);
        }
        this.f8862e.setSoTimeout(aVar.b());
        this.f8866i.b().a((long) aVar.b(), TimeUnit.MILLISECONDS);
        this.f8867j.b().a((long) aVar.c(), TimeUnit.MILLISECONDS);
        return new a(vVar, gVar, this.f8866i, this.f8867j);
    }

    public q a() {
        return this.f8863f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x007e A[Catch:{ IOException -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r17, int r18, int r19, int r20, boolean r21, i.e r22, i.p r23) {
        /*
        // Method dump skipped, instructions count: 314
        */
        throw new UnsupportedOperationException("Method not decompiled: i.f0.f.c.a(int, int, int, int, boolean, i.e, i.p):void");
    }

    @Override // i.f0.i.g.h
    public void a(g gVar) {
        synchronized (this.f8859b) {
            this.f8870m = gVar.m();
        }
    }

    @Override // i.f0.i.g.h
    public void a(i.f0.i.i iVar) {
        iVar.a(b.REFUSED_STREAM);
    }

    public boolean a(i.a aVar, c0 c0Var) {
        if (this.n.size() >= this.f8870m || this.f8868k || !i.f0.a.a.a(this.f8860c.a(), aVar)) {
            return false;
        }
        if (aVar.k().g().equals(c().a().k().g())) {
            return true;
        }
        if (this.f8865h == null || c0Var == null || c0Var.b().type() != Proxy.Type.DIRECT || this.f8860c.b().type() != Proxy.Type.DIRECT || !this.f8860c.d().equals(c0Var.d()) || c0Var.a().d() != i.f0.l.d.a || !a(aVar.k())) {
            return false;
        }
        try {
            aVar.a().a(aVar.k().g(), a().c());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean a(s sVar) {
        if (sVar.j() != this.f8860c.a().k().j()) {
            return false;
        }
        if (!sVar.g().equals(this.f8860c.a().k().g())) {
            return this.f8863f != null && i.f0.l.d.a.a(sVar.g(), (X509Certificate) this.f8863f.c().get(0));
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    public boolean a(boolean z) {
        if (this.f8862e.isClosed() || this.f8862e.isInputShutdown() || this.f8862e.isOutputShutdown()) {
            return false;
        }
        g gVar = this.f8865h;
        if (gVar != null) {
            return !gVar.l();
        }
        if (z) {
            try {
                int soTimeout = this.f8862e.getSoTimeout();
                try {
                    this.f8862e.setSoTimeout(1);
                    if (this.f8866i.g()) {
                        this.f8862e.setSoTimeout(soTimeout);
                        return false;
                    }
                    this.f8862e.setSoTimeout(soTimeout);
                    return true;
                } catch (Throwable th) {
                    this.f8862e.setSoTimeout(soTimeout);
                    throw th;
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public boolean b() {
        return this.f8865h != null;
    }

    public c0 c() {
        return this.f8860c;
    }

    public Socket d() {
        return this.f8862e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f8860c.a().k().g());
        sb.append(":");
        sb.append(this.f8860c.a().k().j());
        sb.append(", proxy=");
        sb.append(this.f8860c.b());
        sb.append(" hostAddress=");
        sb.append(this.f8860c.d());
        sb.append(" cipherSuite=");
        q qVar = this.f8863f;
        sb.append(qVar != null ? qVar.a() : "none");
        sb.append(" protocol=");
        sb.append(this.f8864g);
        sb.append('}');
        return sb.toString();
    }
}
