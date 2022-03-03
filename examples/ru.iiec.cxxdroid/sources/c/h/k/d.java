package c.h.k;

public class d<F, S> {
    public final F a;

    /* renamed from: b  reason: collision with root package name */
    public final S f2368b;

    public d(F f2, S s) {
        this.a = f2;
        this.f2368b = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.a, this.a) && c.a(dVar.f2368b, this.f2368b);
    }

    public int hashCode() {
        F f2 = this.a;
        int i2 = 0;
        int hashCode = f2 == null ? 0 : f2.hashCode();
        S s = this.f2368b;
        if (s != null) {
            i2 = s.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        return "Pair{" + ((Object) this.a) + " " + ((Object) this.f2368b) + "}";
    }
}
