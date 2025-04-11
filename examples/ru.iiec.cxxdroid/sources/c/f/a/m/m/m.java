package c.f.a.m.m;

import c.f.a.m.f;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class m {

    /* renamed from: d  reason: collision with root package name */
    public static int f2193d;
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    p f2194b = null;

    /* renamed from: c  reason: collision with root package name */
    ArrayList<p> f2195c = new ArrayList<>();

    public m(p pVar, int i2) {
        f2193d++;
        this.f2194b = pVar;
    }

    private long a(f fVar, long j2) {
        p pVar = fVar.f2171d;
        if (pVar instanceof k) {
            return j2;
        }
        int size = fVar.f2178k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = fVar.f2178k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f2171d != pVar) {
                    j3 = Math.min(j3, a(fVar2, ((long) fVar2.f2173f) + j2));
                }
            }
        }
        if (fVar != pVar.f2210i) {
            return j3;
        }
        long d2 = j2 - pVar.d();
        return Math.min(Math.min(j3, a(pVar.f2209h, d2)), d2 - ((long) pVar.f2209h.f2173f));
    }

    private long b(f fVar, long j2) {
        p pVar = fVar.f2171d;
        if (pVar instanceof k) {
            return j2;
        }
        int size = fVar.f2178k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = fVar.f2178k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f2171d != pVar) {
                    j3 = Math.max(j3, b(fVar2, ((long) fVar2.f2173f) + j2));
                }
            }
        }
        if (fVar != pVar.f2209h) {
            return j3;
        }
        long d2 = j2 + pVar.d();
        return Math.max(Math.max(j3, b(pVar.f2210i, d2)), d2 - ((long) pVar.f2210i.f2173f));
    }

    public long a(f fVar, int i2) {
        p pVar;
        long j2;
        long j3;
        long j4;
        p pVar2 = this.f2194b;
        long j5 = 0;
        if (pVar2 instanceof c) {
            if (((c) pVar2).f2207f != i2) {
                return 0;
            }
        } else if (i2 == 0) {
            if (!(pVar2 instanceof l)) {
                return 0;
            }
        } else if (!(pVar2 instanceof n)) {
            return 0;
        }
        f fVar2 = (i2 == 0 ? fVar.f2130d : fVar.f2131e).f2209h;
        f fVar3 = (i2 == 0 ? fVar.f2130d : fVar.f2131e).f2210i;
        boolean contains = this.f2194b.f2209h.f2179l.contains(fVar2);
        boolean contains2 = this.f2194b.f2210i.f2179l.contains(fVar3);
        long d2 = this.f2194b.d();
        if (!contains || !contains2) {
            if (contains) {
                f fVar4 = this.f2194b.f2209h;
                j4 = b(fVar4, (long) fVar4.f2173f);
                j3 = ((long) this.f2194b.f2209h.f2173f) + d2;
            } else if (contains2) {
                f fVar5 = this.f2194b.f2210i;
                long a2 = a(fVar5, (long) fVar5.f2173f);
                j3 = ((long) (-this.f2194b.f2210i.f2173f)) + d2;
                j4 = -a2;
            } else {
                p pVar3 = this.f2194b;
                j2 = ((long) pVar3.f2209h.f2173f) + pVar3.d();
                pVar = this.f2194b;
            }
            return Math.max(j4, j3);
        }
        long b2 = b(this.f2194b.f2209h, 0);
        long a3 = a(this.f2194b.f2210i, 0);
        long j6 = b2 - d2;
        int i3 = this.f2194b.f2210i.f2173f;
        if (j6 >= ((long) (-i3))) {
            j6 += (long) i3;
        }
        int i4 = this.f2194b.f2209h.f2173f;
        long j7 = ((-a3) - d2) - ((long) i4);
        if (j7 >= ((long) i4)) {
            j7 -= (long) i4;
        }
        float a4 = this.f2194b.f2203b.a(i2);
        if (a4 > 0.0f) {
            j5 = (long) ((((float) j7) / a4) + (((float) j6) / (1.0f - a4)));
        }
        float f2 = (float) j5;
        long j8 = ((long) ((f2 * a4) + 0.5f)) + d2 + ((long) ((f2 * (1.0f - a4)) + 0.5f));
        pVar = this.f2194b;
        j2 = ((long) pVar.f2209h.f2173f) + j8;
        return j2 - ((long) pVar.f2210i.f2173f);
    }

    public void a(p pVar) {
        this.f2195c.add(pVar);
    }
}
