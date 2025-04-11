package e.b.d.w.m;

import e.b.d.e;
import e.b.d.t;
import e.b.d.w.m.i;
import e.b.d.y.a;
import e.b.d.y.c;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* access modifiers changed from: package-private */
public final class m<T> extends t<T> {
    private final e a;

    /* renamed from: b  reason: collision with root package name */
    private final t<T> f8000b;

    /* renamed from: c  reason: collision with root package name */
    private final Type f8001c;

    m(e eVar, t<T> tVar, Type type) {
        this.a = eVar;
        this.f8000b = tVar;
        this.f8001c = type;
    }

    private Type a(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // e.b.d.t
    public T a(a aVar) {
        return this.f8000b.a(aVar);
    }

    @Override // e.b.d.t
    public void a(c cVar, T t) {
        t<T> tVar = this.f8000b;
        Type a2 = a(this.f8001c, t);
        if (a2 != this.f8001c) {
            tVar = this.a.a((e.b.d.x.a) e.b.d.x.a.a(a2));
            if (tVar instanceof i.b) {
                t<T> tVar2 = this.f8000b;
                if (!(tVar2 instanceof i.b)) {
                    tVar = tVar2;
                }
            }
        }
        tVar.a(cVar, t);
    }
}
