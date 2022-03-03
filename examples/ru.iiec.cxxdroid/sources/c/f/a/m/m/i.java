package c.f.a.m.m;

import c.f.a.m.d;
import c.f.a.m.e;
import c.f.a.m.g;
import java.util.ArrayList;

public class i {
    public static o a(e eVar, int i2, ArrayList<o> arrayList, o oVar) {
        d dVar;
        int y;
        int i3 = i2 == 0 ? eVar.r0 : eVar.s0;
        int i4 = 0;
        if (i3 != -1 && (oVar == null || i3 != oVar.f2199b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i5);
                if (oVar2.a() == i3) {
                    if (oVar != null) {
                        oVar.a(i2, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i5++;
                }
            }
        } else if (i3 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof c.f.a.m.i) && (y = ((c.f.a.m.i) eVar).y(i2)) != -1) {
                int i6 = 0;
                while (true) {
                    if (i6 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = arrayList.get(i6);
                    if (oVar3.a() == y) {
                        oVar = oVar3;
                        break;
                    }
                    i6++;
                }
            }
            if (oVar == null) {
                oVar = new o(i2);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof g) {
                g gVar = (g) eVar;
                d W = gVar.W();
                if (gVar.X() == 0) {
                    i4 = 1;
                }
                W.a(i4, arrayList, oVar);
            }
            int a = oVar.a();
            if (i2 == 0) {
                eVar.r0 = a;
                eVar.K.a(i2, arrayList, oVar);
                dVar = eVar.M;
            } else {
                eVar.s0 = a;
                eVar.L.a(i2, arrayList, oVar);
                eVar.O.a(i2, arrayList, oVar);
                dVar = eVar.N;
            }
            dVar.a(i2, arrayList, oVar);
            eVar.R.a(i2, arrayList, oVar);
        }
        return oVar;
    }

    private static o a(ArrayList<o> arrayList, int i2) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            o oVar = arrayList.get(i3);
            if (i2 == oVar.f2199b) {
                return oVar;
            }
        }
        return null;
    }

    public static boolean a(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        return (bVar3 == e.b.FIXED || bVar3 == e.b.WRAP_CONTENT || (bVar3 == e.b.MATCH_PARENT && bVar != e.b.WRAP_CONTENT)) || (bVar4 == e.b.FIXED || bVar4 == e.b.WRAP_CONTENT || (bVar4 == e.b.MATCH_PARENT && bVar2 != e.b.WRAP_CONTENT));
    }

    /* JADX WARNING: Removed duplicated region for block: B:174:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0394 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(c.f.a.m.f r16, c.f.a.m.m.b.AbstractC0041b r17) {
        /*
        // Method dump skipped, instructions count: 920
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.m.m.i.a(c.f.a.m.f, c.f.a.m.m.b$b):boolean");
    }
}
