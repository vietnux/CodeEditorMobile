package c.f.a.m;

import c.f.a.m.m.b;
import java.util.HashSet;

public class k extends i {
    private boolean w0 = false;

    public k() {
        new b.a();
    }

    public void W() {
        for (int i2 = 0; i2 < this.v0; i2++) {
            e eVar = this.u0[i2];
            if (eVar != null) {
                eVar.c(true);
            }
        }
    }

    public boolean X() {
        return this.w0;
    }

    @Override // c.f.a.m.h, c.f.a.m.i
    public void a(f fVar) {
        W();
    }

    public boolean a(HashSet<e> hashSet) {
        for (int i2 = 0; i2 < this.v0; i2++) {
            if (hashSet.contains(this.u0[i2])) {
                return true;
            }
        }
        return false;
    }
}
