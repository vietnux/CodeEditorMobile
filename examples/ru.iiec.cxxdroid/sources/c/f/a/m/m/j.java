package c.f.a.m.m;

import c.f.a.m.e;
import c.f.a.m.g;

/* access modifiers changed from: package-private */
public class j extends p {
    public j(e eVar) {
        super(eVar);
        eVar.f2130d.c();
        eVar.f2131e.c();
        this.f2207f = ((g) eVar).X();
    }

    private void a(f fVar) {
        this.f2209h.f2178k.add(fVar);
        fVar.f2179l.add(this.f2209h);
    }

    /* access modifiers changed from: package-private */
    @Override // c.f.a.m.m.p
    public void a() {
        p pVar;
        f fVar;
        f fVar2;
        g gVar = (g) this.f2203b;
        int Y = gVar.Y();
        int Z = gVar.Z();
        gVar.a0();
        if (gVar.X() == 1) {
            f fVar3 = this.f2209h;
            if (Y != -1) {
                fVar3.f2179l.add(this.f2203b.W.f2130d.f2209h);
                this.f2203b.W.f2130d.f2209h.f2178k.add(this.f2209h);
                fVar2 = this.f2209h;
            } else if (Z != -1) {
                fVar3.f2179l.add(this.f2203b.W.f2130d.f2210i);
                this.f2203b.W.f2130d.f2210i.f2178k.add(this.f2209h);
                fVar2 = this.f2209h;
                Y = -Z;
            } else {
                fVar3.f2169b = true;
                fVar3.f2179l.add(this.f2203b.W.f2130d.f2210i);
                this.f2203b.W.f2130d.f2210i.f2178k.add(this.f2209h);
                a(this.f2203b.f2130d.f2209h);
                pVar = this.f2203b.f2130d;
            }
            fVar2.f2173f = Y;
            a(this.f2203b.f2130d.f2209h);
            pVar = this.f2203b.f2130d;
        } else {
            f fVar4 = this.f2209h;
            if (Y != -1) {
                fVar4.f2179l.add(this.f2203b.W.f2131e.f2209h);
                this.f2203b.W.f2131e.f2209h.f2178k.add(this.f2209h);
                fVar = this.f2209h;
            } else if (Z != -1) {
                fVar4.f2179l.add(this.f2203b.W.f2131e.f2210i);
                this.f2203b.W.f2131e.f2210i.f2178k.add(this.f2209h);
                fVar = this.f2209h;
                Y = -Z;
            } else {
                fVar4.f2169b = true;
                fVar4.f2179l.add(this.f2203b.W.f2131e.f2210i);
                this.f2203b.W.f2131e.f2210i.f2178k.add(this.f2209h);
                a(this.f2203b.f2131e.f2209h);
                pVar = this.f2203b.f2131e;
            }
            fVar.f2173f = Y;
            a(this.f2203b.f2131e.f2209h);
            pVar = this.f2203b.f2131e;
        }
        a(pVar.f2210i);
    }

    @Override // c.f.a.m.m.p, c.f.a.m.m.d
    public void a(d dVar) {
        f fVar = this.f2209h;
        if (fVar.f2170c && !fVar.f2177j) {
            this.f2209h.a((int) ((((float) fVar.f2179l.get(0).f2174g) * ((g) this.f2203b).a0()) + 0.5f));
        }
    }

    @Override // c.f.a.m.m.p
    public void b() {
        if (((g) this.f2203b).X() == 1) {
            this.f2203b.w(this.f2209h.f2174g);
        } else {
            this.f2203b.x(this.f2209h.f2174g);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // c.f.a.m.m.p
    public void c() {
        this.f2209h.a();
    }

    /* access modifiers changed from: package-private */
    @Override // c.f.a.m.m.p
    public boolean f() {
        return false;
    }
}
