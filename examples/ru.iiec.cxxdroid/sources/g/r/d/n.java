package g.r.d;

import g.t.b;
import g.t.g;

public abstract class n extends c implements g {
    public n() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return g().equals(nVar.g()) && f().equals(nVar.f()) && i().equals(nVar.i()) && i.a(e(), nVar.e());
        } else if (obj instanceof g) {
            return obj.equals(c());
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // g.r.d.c
    public g h() {
        return (g) super.h();
    }

    public int hashCode() {
        return (((g().hashCode() * 31) + f().hashCode()) * 31) + i().hashCode();
    }

    public String toString() {
        b c2 = c();
        if (c2 != this) {
            return c2.toString();
        }
        return "property " + f() + " (Kotlin reflection is not available)";
    }
}
