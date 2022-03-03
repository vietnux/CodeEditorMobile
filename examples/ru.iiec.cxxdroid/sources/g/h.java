package g;

import g.r.d.i;
import java.io.Serializable;

public final class h<A, B> implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    private final A f8602b;

    /* renamed from: c  reason: collision with root package name */
    private final B f8603c;

    public h(A a, B b2) {
        this.f8602b = a;
        this.f8603c = b2;
    }

    public final A b() {
        return this.f8602b;
    }

    public final B c() {
        return this.f8603c;
    }

    public final A d() {
        return this.f8602b;
    }

    public final B e() {
        return this.f8603c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return i.a(this.f8602b, hVar.f8602b) && i.a(this.f8603c, hVar.f8603c);
    }

    public int hashCode() {
        A a = this.f8602b;
        int i2 = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b2 = this.f8603c;
        if (b2 != null) {
            i2 = b2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return '(' + ((Object) this.f8602b) + ", " + ((Object) this.f8603c) + ')';
    }
}
