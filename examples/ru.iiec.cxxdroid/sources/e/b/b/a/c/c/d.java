package e.b.b.a.c.c;

import e.b.b.a.c.c.d;

public abstract class d<M extends d<M>> extends j {
    protected f a;

    @Override // e.b.b.a.c.c.j
    public final /* synthetic */ j a() {
        return (d) clone();
    }

    /* access modifiers changed from: protected */
    public final boolean a(a aVar, int i2) {
        int a2 = aVar.a();
        if (!aVar.b(i2)) {
            return false;
        }
        int i3 = i2 >>> 3;
        l lVar = new l(i2, aVar.a(a2, aVar.a() - a2));
        g gVar = null;
        f fVar = this.a;
        if (fVar == null) {
            this.a = new f();
        } else {
            gVar = fVar.a(i3);
        }
        if (gVar == null) {
            gVar = new g();
            this.a.a(i3, gVar);
        }
        gVar.a(lVar);
        return true;
    }

    @Override // e.b.b.a.c.c.j
    public /* synthetic */ Object clone() {
        d dVar = (d) super.clone();
        h.a(this, dVar);
        return dVar;
    }
}
