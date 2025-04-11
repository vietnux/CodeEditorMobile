package c.f.a.m.m;

import c.f.a.m.a;
import c.f.a.m.e;
import c.f.a.m.m.f;

/* access modifiers changed from: package-private */
public class k extends p {
    public k(e eVar) {
        super(eVar);
    }

    private void a(f fVar) {
        this.f2209h.f2178k.add(fVar);
        fVar.f2179l.add(this.f2209h);
    }

    /* access modifiers changed from: package-private */
    @Override // c.f.a.m.m.p
    public void a() {
        p pVar;
        e eVar = this.f2203b;
        if (eVar instanceof a) {
            this.f2209h.f2169b = true;
            a aVar = (a) eVar;
            int Y = aVar.Y();
            boolean X = aVar.X();
            int i2 = 0;
            if (Y == 0) {
                this.f2209h.f2172e = f.a.LEFT;
                while (i2 < aVar.v0) {
                    e eVar2 = aVar.u0[i2];
                    if (X || eVar2.B() != 8) {
                        f fVar = eVar2.f2130d.f2209h;
                        fVar.f2178k.add(this.f2209h);
                        this.f2209h.f2179l.add(fVar);
                    }
                    i2++;
                }
            } else if (Y != 1) {
                if (Y == 2) {
                    this.f2209h.f2172e = f.a.TOP;
                    while (i2 < aVar.v0) {
                        e eVar3 = aVar.u0[i2];
                        if (X || eVar3.B() != 8) {
                            f fVar2 = eVar3.f2131e.f2209h;
                            fVar2.f2178k.add(this.f2209h);
                            this.f2209h.f2179l.add(fVar2);
                        }
                        i2++;
                    }
                } else if (Y == 3) {
                    this.f2209h.f2172e = f.a.BOTTOM;
                    while (i2 < aVar.v0) {
                        e eVar4 = aVar.u0[i2];
                        if (X || eVar4.B() != 8) {
                            f fVar3 = eVar4.f2131e.f2210i;
                            fVar3.f2178k.add(this.f2209h);
                            this.f2209h.f2179l.add(fVar3);
                        }
                        i2++;
                    }
                } else {
                    return;
                }
                a(this.f2203b.f2131e.f2209h);
                pVar = this.f2203b.f2131e;
                a(pVar.f2210i);
            } else {
                this.f2209h.f2172e = f.a.RIGHT;
                while (i2 < aVar.v0) {
                    e eVar5 = aVar.u0[i2];
                    if (X || eVar5.B() != 8) {
                        f fVar4 = eVar5.f2130d.f2210i;
                        fVar4.f2178k.add(this.f2209h);
                        this.f2209h.f2179l.add(fVar4);
                    }
                    i2++;
                }
            }
            a(this.f2203b.f2130d.f2209h);
            pVar = this.f2203b.f2130d;
            a(pVar.f2210i);
        }
    }

    @Override // c.f.a.m.m.p, c.f.a.m.m.d
    public void a(d dVar) {
        a aVar = (a) this.f2203b;
        int Y = aVar.Y();
        int i2 = -1;
        int i3 = 0;
        for (f fVar : this.f2209h.f2179l) {
            int i4 = fVar.f2174g;
            if (i2 == -1 || i4 < i2) {
                i2 = i4;
            }
            if (i3 < i4) {
                i3 = i4;
            }
        }
        if (Y == 0 || Y == 2) {
            this.f2209h.a(i2 + aVar.Z());
        } else {
            this.f2209h.a(i3 + aVar.Z());
        }
    }

    @Override // c.f.a.m.m.p
    public void b() {
        e eVar = this.f2203b;
        if (eVar instanceof a) {
            int Y = ((a) eVar).Y();
            if (Y == 0 || Y == 1) {
                this.f2203b.w(this.f2209h.f2174g);
            } else {
                this.f2203b.x(this.f2209h.f2174g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // c.f.a.m.m.p
    public void c() {
        this.f2204c = null;
        this.f2209h.a();
    }

    /* access modifiers changed from: package-private */
    @Override // c.f.a.m.m.p
    public boolean f() {
        return false;
    }
}
