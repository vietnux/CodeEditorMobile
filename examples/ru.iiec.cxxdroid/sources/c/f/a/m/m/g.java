package c.f.a.m.m;

import c.f.a.m.m.f;

/* access modifiers changed from: package-private */
public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f2189m;

    public g(p pVar) {
        super(pVar);
        this.f2172e = pVar instanceof l ? f.a.HORIZONTAL_DIMENSION : f.a.VERTICAL_DIMENSION;
    }

    @Override // c.f.a.m.m.f
    public void a(int i2) {
        if (!this.f2177j) {
            this.f2177j = true;
            this.f2174g = i2;
            for (d dVar : this.f2178k) {
                dVar.a(dVar);
            }
        }
    }
}
