package e.b.b.a.c.b;

import e.b.b.a.c.b.c0;

public abstract class c0<M extends c0<M>> extends i0 {

    /* renamed from: b  reason: collision with root package name */
    protected e0 f7030b;

    @Override // e.b.b.a.c.b.i0
    public final /* synthetic */ i0 a() {
        return (c0) clone();
    }

    @Override // e.b.b.a.c.b.i0
    public void a(z zVar) {
        if (this.f7030b != null) {
            for (int i2 = 0; i2 < this.f7030b.b(); i2++) {
                this.f7030b.b(i2).a(zVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(y yVar, int i2) {
        int a = yVar.a();
        if (!yVar.a(i2)) {
            return false;
        }
        int i3 = i2 >>> 3;
        k0 k0Var = new k0(i2, yVar.a(a, yVar.a() - a));
        f0 f0Var = null;
        e0 e0Var = this.f7030b;
        if (e0Var == null) {
            this.f7030b = new e0();
        } else {
            f0Var = e0Var.a(i3);
        }
        if (f0Var == null) {
            f0Var = new f0();
            this.f7030b.a(i3, f0Var);
        }
        f0Var.a(k0Var);
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.b.i0
    public int c() {
        if (this.f7030b == null) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f7030b.b(); i3++) {
            i2 += this.f7030b.b(i3).a();
        }
        return i2;
    }

    @Override // e.b.b.a.c.b.i0
    public /* synthetic */ Object clone() {
        c0 c0Var = (c0) super.clone();
        g0.a(this, c0Var);
        return c0Var;
    }
}
