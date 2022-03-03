package e.b.d.w.m;

import e.b.d.e;
import e.b.d.t;
import e.b.d.u;
import e.b.d.w.g;
import e.b.d.y.c;
import java.util.ArrayList;

public final class h extends t<Object> {

    /* renamed from: b  reason: collision with root package name */
    public static final u f7977b = new a();
    private final e a;

    static class a implements u {
        a() {
        }

        @Override // e.b.d.u
        public <T> t<T> a(e eVar, e.b.d.x.a<T> aVar) {
            if (aVar.a() == Object.class) {
                return new h(eVar);
            }
            return null;
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a = new int[e.b.d.y.b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                e.b.d.y.b[] r0 = e.b.d.y.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                e.b.d.w.m.h.b.a = r0
                int[] r0 = e.b.d.w.m.h.b.a     // Catch:{ NoSuchFieldError -> 0x0014 }
                e.b.d.y.b r1 = e.b.d.y.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = e.b.d.w.m.h.b.a     // Catch:{ NoSuchFieldError -> 0x001f }
                e.b.d.y.b r1 = e.b.d.y.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = e.b.d.w.m.h.b.a     // Catch:{ NoSuchFieldError -> 0x002a }
                e.b.d.y.b r1 = e.b.d.y.b.STRING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = e.b.d.w.m.h.b.a     // Catch:{ NoSuchFieldError -> 0x0035 }
                e.b.d.y.b r1 = e.b.d.y.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = e.b.d.w.m.h.b.a     // Catch:{ NoSuchFieldError -> 0x0040 }
                e.b.d.y.b r1 = e.b.d.y.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = e.b.d.w.m.h.b.a     // Catch:{ NoSuchFieldError -> 0x004b }
                e.b.d.y.b r1 = e.b.d.y.b.NULL     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.b.d.w.m.h.b.<clinit>():void");
        }
    }

    h(e eVar) {
        this.a = eVar;
    }

    @Override // e.b.d.t
    public Object a(e.b.d.y.a aVar) {
        switch (b.a[aVar.B().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.l();
                while (aVar.r()) {
                    arrayList.add(a(aVar));
                }
                aVar.o();
                return arrayList;
            case 2:
                g gVar = new g();
                aVar.m();
                while (aVar.r()) {
                    gVar.put(aVar.y(), a(aVar));
                }
                aVar.p();
                return gVar;
            case 3:
                return aVar.A();
            case 4:
                return Double.valueOf(aVar.v());
            case 5:
                return Boolean.valueOf(aVar.u());
            case 6:
                aVar.z();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // e.b.d.t
    public void a(c cVar, Object obj) {
        if (obj == null) {
            cVar.s();
            return;
        }
        t a2 = this.a.a((Class) obj.getClass());
        if (a2 instanceof h) {
            cVar.m();
            cVar.o();
            return;
        }
        a2.a(cVar, obj);
    }
}
