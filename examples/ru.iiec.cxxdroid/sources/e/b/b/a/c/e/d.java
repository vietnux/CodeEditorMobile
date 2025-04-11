package e.b.b.a.c.e;

import e.b.b.a.c.e.d;

public abstract class d<M extends d<M>> extends j {

    /* renamed from: b  reason: collision with root package name */
    protected f f7211b;

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.j
    public int a() {
        if (this.f7211b == null) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f7211b.b(); i3++) {
            i2 += this.f7211b.b(i3).a();
        }
        return i2;
    }

    @Override // e.b.b.a.c.e.j
    public void a(b bVar) {
        if (this.f7211b != null) {
            for (int i2 = 0; i2 < this.f7211b.b(); i2++) {
                this.f7211b.b(i2).a(bVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(a aVar, int i2) {
        int a = aVar.a();
        if (!aVar.c(i2)) {
            return false;
        }
        int i3 = i2 >>> 3;
        l lVar = new l(i2, aVar.a(a, aVar.a() - a));
        g gVar = null;
        f fVar = this.f7211b;
        if (fVar == null) {
            this.f7211b = new f();
        } else {
            gVar = fVar.a(i3);
        }
        if (gVar == null) {
            gVar = new g();
            this.f7211b.a(i3, gVar);
        }
        gVar.a(lVar);
        return true;
    }

    @Override // e.b.b.a.c.e.j
    public final /* synthetic */ j b() {
        return (d) clone();
    }

    @Override // e.b.b.a.c.e.j
    public /* synthetic */ Object clone() {
        d dVar = (d) super.clone();
        h.a(this, dVar);
        return dVar;
    }
}
