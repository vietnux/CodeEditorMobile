package i.f0.f;

import i.c0;
import i.e;
import i.f0.c;
import i.p;
import i.s;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public final class f {
    private final i.a a;

    /* renamed from: b  reason: collision with root package name */
    private final d f8873b;

    /* renamed from: c  reason: collision with root package name */
    private final e f8874c;

    /* renamed from: d  reason: collision with root package name */
    private final p f8875d;

    /* renamed from: e  reason: collision with root package name */
    private List<Proxy> f8876e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    private int f8877f;

    /* renamed from: g  reason: collision with root package name */
    private List<InetSocketAddress> f8878g = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    private final List<c0> f8879h = new ArrayList();

    public static final class a {
        private final List<c0> a;

        /* renamed from: b  reason: collision with root package name */
        private int f8880b = 0;

        a(List<c0> list) {
            this.a = list;
        }

        public List<c0> a() {
            return new ArrayList(this.a);
        }

        public boolean b() {
            return this.f8880b < this.a.size();
        }

        public c0 c() {
            if (b()) {
                List<c0> list = this.a;
                int i2 = this.f8880b;
                this.f8880b = i2 + 1;
                return list.get(i2);
            }
            throw new NoSuchElementException();
        }
    }

    public f(i.a aVar, d dVar, e eVar, p pVar) {
        this.a = aVar;
        this.f8873b = dVar;
        this.f8874c = eVar;
        this.f8875d = pVar;
        a(aVar.k(), aVar.f());
    }

    static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    private void a(s sVar, Proxy proxy) {
        List<Proxy> a2;
        if (proxy != null) {
            a2 = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.a.h().select(sVar.n());
            if (select == null || select.isEmpty()) {
                a2 = c.a(Proxy.NO_PROXY);
            } else {
                a2 = c.a(select);
            }
        }
        this.f8876e = a2;
        this.f8877f = 0;
    }

    private void a(Proxy proxy) {
        String str;
        int i2;
        this.f8878g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.a.k().g();
            i2 = this.a.k().j();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = a(inetSocketAddress);
                i2 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        }
        if (i2 < 1 || i2 > 65535) {
            throw new SocketException("No route to " + str + ":" + i2 + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            this.f8878g.add(InetSocketAddress.createUnresolved(str, i2));
        } else {
            this.f8875d.a(this.f8874c, str);
            List<InetAddress> a2 = this.a.c().a(str);
            if (!a2.isEmpty()) {
                this.f8875d.a(this.f8874c, str, a2);
                int size = a2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    this.f8878g.add(new InetSocketAddress(a2.get(i3), i2));
                }
                return;
            }
            throw new UnknownHostException(this.a.c() + " returned no addresses for " + str);
        }
    }

    private boolean c() {
        return this.f8877f < this.f8876e.size();
    }

    private Proxy d() {
        if (c()) {
            List<Proxy> list = this.f8876e;
            int i2 = this.f8877f;
            this.f8877f = i2 + 1;
            Proxy proxy = list.get(i2);
            a(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.a.k().g() + "; exhausted proxy configurations: " + this.f8876e);
    }

    public void a(c0 c0Var, IOException iOException) {
        if (!(c0Var.b().type() == Proxy.Type.DIRECT || this.a.h() == null)) {
            this.a.h().connectFailed(this.a.k().n(), c0Var.b().address(), iOException);
        }
        this.f8873b.b(c0Var);
    }

    public boolean a() {
        return c() || !this.f8879h.isEmpty();
    }

    public a b() {
        if (a()) {
            ArrayList arrayList = new ArrayList();
            while (c()) {
                Proxy d2 = d();
                int size = this.f8878g.size();
                for (int i2 = 0; i2 < size; i2++) {
                    c0 c0Var = new c0(this.a, d2, this.f8878g.get(i2));
                    if (this.f8873b.c(c0Var)) {
                        this.f8879h.add(c0Var);
                    } else {
                        arrayList.add(c0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f8879h);
                this.f8879h.clear();
            }
            return new a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
