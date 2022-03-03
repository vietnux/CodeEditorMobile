package i.f0.f;

import i.a0;
import i.f0.g.g;
import i.t;
import i.v;
import i.y;

public final class a implements t {
    public final v a;

    public a(v vVar) {
        this.a = vVar;
    }

    @Override // i.t
    public a0 a(t.a aVar) {
        g gVar = (g) aVar;
        y d2 = gVar.d();
        g i2 = gVar.i();
        return gVar.a(d2, i2, i2.a(this.a, aVar, !d2.e().equals("GET")), i2.b());
    }
}
