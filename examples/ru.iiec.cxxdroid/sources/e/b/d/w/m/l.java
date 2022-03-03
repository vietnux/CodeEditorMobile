package e.b.d.w.m;

import e.b.d.e;
import e.b.d.h;
import e.b.d.i;
import e.b.d.j;
import e.b.d.p;
import e.b.d.q;
import e.b.d.t;
import e.b.d.u;
import e.b.d.w.k;
import e.b.d.y.c;

public final class l<T> extends t<T> {
    private final q<T> a;

    /* renamed from: b  reason: collision with root package name */
    private final i<T> f7994b;

    /* renamed from: c  reason: collision with root package name */
    final e f7995c;

    /* renamed from: d  reason: collision with root package name */
    private final e.b.d.x.a<T> f7996d;

    /* renamed from: e  reason: collision with root package name */
    private final u f7997e;

    /* renamed from: f  reason: collision with root package name */
    private final l<T>.b f7998f = new b();

    /* renamed from: g  reason: collision with root package name */
    private t<T> f7999g;

    private final class b implements p, h {
        private b(l lVar) {
        }
    }

    public l(q<T> qVar, i<T> iVar, e eVar, e.b.d.x.a<T> aVar, u uVar) {
        this.a = qVar;
        this.f7994b = iVar;
        this.f7995c = eVar;
        this.f7996d = aVar;
        this.f7997e = uVar;
    }

    private t<T> b() {
        t<T> tVar = this.f7999g;
        if (tVar != null) {
            return tVar;
        }
        t<T> a2 = this.f7995c.a(this.f7997e, this.f7996d);
        this.f7999g = a2;
        return a2;
    }

    @Override // e.b.d.t
    public T a(e.b.d.y.a aVar) {
        if (this.f7994b == null) {
            return b().a(aVar);
        }
        j a2 = k.a(aVar);
        if (a2.e()) {
            return null;
        }
        return this.f7994b.a(a2, this.f7996d.b(), this.f7998f);
    }

    @Override // e.b.d.t
    public void a(c cVar, T t) {
        q<T> qVar = this.a;
        if (qVar == null) {
            b().a(cVar, t);
        } else if (t == null) {
            cVar.s();
        } else {
            k.a(qVar.a(t, this.f7996d.b(), this.f7998f), cVar);
        }
    }
}
