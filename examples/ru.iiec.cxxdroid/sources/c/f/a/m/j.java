package c.f.a.m;

import c.f.a.d;
import c.f.a.m.e;

public class j {
    static boolean[] a = new boolean[3];

    static void a(f fVar, d dVar, e eVar) {
        eVar.p = -1;
        eVar.q = -1;
        if (fVar.V[0] != e.b.WRAP_CONTENT && eVar.V[0] == e.b.MATCH_PARENT) {
            int i2 = eVar.K.f2115g;
            int C = fVar.C() - eVar.M.f2115g;
            d dVar2 = eVar.K;
            dVar2.f2117i = dVar.a(dVar2);
            d dVar3 = eVar.M;
            dVar3.f2117i = dVar.a(dVar3);
            dVar.a(eVar.K.f2117i, i2);
            dVar.a(eVar.M.f2117i, C);
            eVar.p = 2;
            eVar.d(i2, C);
        }
        if (fVar.V[1] != e.b.WRAP_CONTENT && eVar.V[1] == e.b.MATCH_PARENT) {
            int i3 = eVar.L.f2115g;
            int k2 = fVar.k() - eVar.N.f2115g;
            d dVar4 = eVar.L;
            dVar4.f2117i = dVar.a(dVar4);
            d dVar5 = eVar.N;
            dVar5.f2117i = dVar.a(dVar5);
            dVar.a(eVar.L.f2117i, i3);
            dVar.a(eVar.N.f2117i, k2);
            if (eVar.d0 > 0 || eVar.B() == 8) {
                d dVar6 = eVar.O;
                dVar6.f2117i = dVar.a(dVar6);
                dVar.a(eVar.O.f2117i, eVar.d0 + i3);
            }
            eVar.q = 2;
            eVar.g(i3, k2);
        }
    }

    public static final boolean a(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}
