package c.f.a.m;

import c.f.a.d;
import java.util.ArrayList;

public class b {
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r2.m0 == 2) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        if (r2.n0 == 2) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0276 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02cf A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x036c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x04f5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0501  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x052c  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0539 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x03b7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:336:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(c.f.a.m.f r38, c.f.a.d r39, int r40, int r41, c.f.a.m.c r42) {
        /*
        // Method dump skipped, instructions count: 1369
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.m.b.a(c.f.a.m.f, c.f.a.d, int, int, c.f.a.m.c):void");
    }

    public static void a(f fVar, d dVar, ArrayList<e> arrayList, int i2) {
        int i3;
        c[] cVarArr;
        int i4;
        if (i2 == 0) {
            i4 = fVar.E0;
            cVarArr = fVar.H0;
            i3 = 0;
        } else {
            i4 = fVar.F0;
            cVarArr = fVar.G0;
            i3 = 2;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            c cVar = cVarArr[i5];
            cVar.a();
            if (arrayList == null || (arrayList != null && arrayList.contains(cVar.a))) {
                a(fVar, dVar, i2, i3, cVar);
            }
        }
    }
}
