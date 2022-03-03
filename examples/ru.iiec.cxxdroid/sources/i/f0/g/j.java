package i.f0.g;

import i.a;
import i.a0;
import i.b0;
import i.c0;
import i.e;
import i.f0.c;
import i.g;
import i.p;
import i.s;
import i.t;
import i.v;
import i.y;
import i.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

public final class j implements t {
    private final v a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8909b;

    /* renamed from: c  reason: collision with root package name */
    private Object f8910c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f8911d;

    public j(v vVar, boolean z) {
        this.a = vVar;
        this.f8909b = z;
    }

    private int a(a0 a0Var, int i2) {
        String b2 = a0Var.b("Retry-After");
        if (b2 == null) {
            return i2;
        }
        if (b2.matches("\\d+")) {
            return Integer.valueOf(b2).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private a a(s sVar) {
        g gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (sVar.h()) {
            SSLSocketFactory C = this.a.C();
            hostnameVerifier = this.a.q();
            sSLSocketFactory = C;
            gVar = this.a.c();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new a(sVar.g(), sVar.j(), this.a.i(), this.a.B(), sSLSocketFactory, hostnameVerifier, gVar, this.a.x(), this.a.w(), this.a.v(), this.a.f(), this.a.y());
    }

    private y a(a0 a0Var, c0 c0Var) {
        String b2;
        s b3;
        if (a0Var != null) {
            int o = a0Var.o();
            String e2 = a0Var.y().e();
            z zVar = null;
            if (o == 307 || o == 308) {
                if (!e2.equals("GET") && !e2.equals("HEAD")) {
                    return null;
                }
            } else if (o == 401) {
                return this.a.a().a(c0Var, a0Var);
            } else {
                if (o != 503) {
                    if (o == 407) {
                        if ((c0Var != null ? c0Var.b() : this.a.w()).type() == Proxy.Type.HTTP) {
                            return this.a.x().a(c0Var, a0Var);
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    } else if (o != 408) {
                        switch (o) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else if (!this.a.A()) {
                        return null;
                    } else {
                        a0Var.y().a();
                        if ((a0Var.v() == null || a0Var.v().o() != 408) && a(a0Var, 0) <= 0) {
                            return a0Var.y();
                        }
                        return null;
                    }
                } else if ((a0Var.v() == null || a0Var.v().o() != 503) && a(a0Var, Integer.MAX_VALUE) == 0) {
                    return a0Var.y();
                } else {
                    return null;
                }
            }
            if (!this.a.k() || (b2 = a0Var.b("Location")) == null || (b3 = a0Var.y().g().b(b2)) == null) {
                return null;
            }
            if (!b3.m().equals(a0Var.y().g().m()) && !this.a.p()) {
                return null;
            }
            y.a f2 = a0Var.y().f();
            if (f.b(e2)) {
                boolean d2 = f.d(e2);
                if (f.c(e2)) {
                    f2.a("GET", (z) null);
                } else {
                    if (d2) {
                        zVar = a0Var.y().a();
                    }
                    f2.a(e2, zVar);
                }
                if (!d2) {
                    f2.a("Transfer-Encoding");
                    f2.a("Content-Length");
                    f2.a("Content-Type");
                }
            }
            if (!a(a0Var, b3)) {
                f2.a("Authorization");
            }
            f2.a(b3);
            return f2.a();
        }
        throw new IllegalStateException();
    }

    private boolean a(a0 a0Var, s sVar) {
        s g2 = a0Var.y().g();
        return g2.g().equals(sVar.g()) && g2.j() == sVar.j() && g2.m().equals(sVar.m());
    }

    private boolean a(IOException iOException, i.f0.f.g gVar, boolean z, y yVar) {
        gVar.a(iOException);
        if (!this.a.A()) {
            return false;
        }
        if (z) {
            yVar.a();
        }
        return a(iOException, z) && gVar.c();
    }

    private boolean a(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException);
    }

    @Override // i.t
    public a0 a(t.a aVar) {
        y d2 = aVar.d();
        g gVar = (g) aVar;
        e e2 = gVar.e();
        p g2 = gVar.g();
        i.f0.f.g gVar2 = new i.f0.f.g(this.a.e(), a(d2.g()), e2, g2, this.f8910c);
        a0 a0Var = null;
        int i2 = 0;
        while (!this.f8911d) {
            try {
                a0 a2 = gVar.a(d2, gVar2, null, null);
                if (a0Var != null) {
                    a0.a u = a2.u();
                    a0.a u2 = a0Var.u();
                    u2.a((b0) null);
                    u.c(u2.a());
                    a2 = u.a();
                }
                y a3 = a(a2, gVar2.f());
                if (a3 == null) {
                    if (!this.f8909b) {
                        gVar2.e();
                    }
                    return a2;
                }
                c.a(a2.l());
                int i3 = i2 + 1;
                if (i3 <= 20) {
                    a3.a();
                    if (!a(a2, a3.g())) {
                        gVar2.e();
                        gVar2 = new i.f0.f.g(this.a.e(), a(a3.g()), e2, g2, this.f8910c);
                    } else if (gVar2.a() != null) {
                        throw new IllegalStateException("Closing the body of " + a2 + " didn't close its backing stream. Bad interceptor?");
                    }
                    a0Var = a2;
                    d2 = a3;
                    i2 = i3;
                } else {
                    gVar2.e();
                    throw new ProtocolException("Too many follow-up requests: " + i3);
                }
            } catch (i.f0.f.e e3) {
                if (!a(e3.b(), gVar2, false, d2)) {
                    throw e3.b();
                }
            } catch (IOException e4) {
                if (!a(e4, gVar2, !(e4 instanceof i.f0.i.a), d2)) {
                    throw e4;
                }
            } catch (Throwable th) {
                gVar2.a((IOException) null);
                gVar2.e();
                throw th;
            }
        }
        gVar2.e();
        throw new IOException("Canceled");
    }

    public void a(Object obj) {
        this.f8910c = obj;
    }

    public boolean a() {
        return this.f8911d;
    }
}
