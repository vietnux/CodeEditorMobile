package e.b.d.w.m;

import e.b.d.e;
import e.b.d.i;
import e.b.d.q;
import e.b.d.t;
import e.b.d.u;
import e.b.d.v.b;
import e.b.d.w.c;
import e.b.d.x.a;

public final class d implements u {

    /* renamed from: b  reason: collision with root package name */
    private final c f7970b;

    public d(c cVar) {
        this.f7970b = cVar;
    }

    @Override // e.b.d.u
    public <T> t<T> a(e eVar, a<T> aVar) {
        b bVar = (b) aVar.a().getAnnotation(b.class);
        if (bVar == null) {
            return null;
        }
        return (t<T>) a(this.f7970b, eVar, aVar, bVar);
    }

    /* access modifiers changed from: package-private */
    public t<?> a(c cVar, e eVar, a<?> aVar, b bVar) {
        t<?> tVar;
        Object a = cVar.a(a.a((Class) bVar.value())).a();
        if (a instanceof t) {
            tVar = (t) a;
        } else if (a instanceof u) {
            tVar = ((u) a).a(eVar, aVar);
        } else {
            boolean z = a instanceof q;
            if (z || (a instanceof i)) {
                i iVar = null;
                q qVar = z ? (q) a : null;
                if (a instanceof i) {
                    iVar = (i) a;
                }
                tVar = new l<>(qVar, iVar, eVar, aVar, null);
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        return (tVar == null || !bVar.nullSafe()) ? tVar : tVar.a();
    }
}
