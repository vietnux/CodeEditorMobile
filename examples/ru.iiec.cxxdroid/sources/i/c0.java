package i;

import java.net.InetSocketAddress;
import java.net.Proxy;

public final class c0 {
    final a a;

    /* renamed from: b  reason: collision with root package name */
    final Proxy f8774b;

    /* renamed from: c  reason: collision with root package name */
    final InetSocketAddress f8775c;

    public c0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.a = aVar;
            this.f8774b = proxy;
            this.f8775c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public a a() {
        return this.a;
    }

    public Proxy b() {
        return this.f8774b;
    }

    public boolean c() {
        return this.a.f8718i != null && this.f8774b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.f8775c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return c0Var.a.equals(this.a) && c0Var.f8774b.equals(this.f8774b) && c0Var.f8775c.equals(this.f8775c);
        }
    }

    public int hashCode() {
        return ((((527 + this.a.hashCode()) * 31) + this.f8774b.hashCode()) * 31) + this.f8775c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f8775c + "}";
    }
}
