package c.f.a;

import c.f.a.d;
import c.f.a.i;
import java.util.ArrayList;

public class b implements d.a {
    i a = null;

    /* renamed from: b  reason: collision with root package name */
    float f2008b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    boolean f2009c;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<i> f2010d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public a f2011e;

    /* renamed from: f  reason: collision with root package name */
    boolean f2012f = false;

    public interface a {
        float a(int i2);

        float a(b bVar, boolean z);

        float a(i iVar);

        float a(i iVar, boolean z);

        int a();

        void a(float f2);

        void a(i iVar, float f2);

        void a(i iVar, float f2, boolean z);

        i b(int i2);

        void b();

        boolean b(i iVar);

        void clear();
    }

    public b() {
    }

    public b(c cVar) {
        this.f2011e = new a(this, cVar);
    }

    private i a(boolean[] zArr, i iVar) {
        i.a aVar;
        int a2 = this.f2011e.a();
        i iVar2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < a2; i2++) {
            float a3 = this.f2011e.a(i2);
            if (a3 < 0.0f) {
                i b2 = this.f2011e.b(i2);
                if ((zArr == null || !zArr[b2.f2049d]) && b2 != iVar && (((aVar = b2.f2056k) == i.a.SLACK || aVar == i.a.ERROR) && a3 < f2)) {
                    f2 = a3;
                    iVar2 = b2;
                }
            }
        }
        return iVar2;
    }

    private boolean a(i iVar, d dVar) {
        return iVar.n <= 1;
    }

    public b a(float f2, float f3, float f4, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f2008b = 0.0f;
        if (f3 == 0.0f || f2 == f4) {
            this.f2011e.a(iVar, 1.0f);
            this.f2011e.a(iVar2, -1.0f);
            this.f2011e.a(iVar4, 1.0f);
            this.f2011e.a(iVar3, -1.0f);
        } else if (f2 == 0.0f) {
            this.f2011e.a(iVar, 1.0f);
            this.f2011e.a(iVar2, -1.0f);
        } else if (f4 == 0.0f) {
            this.f2011e.a(iVar3, 1.0f);
            this.f2011e.a(iVar4, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.f2011e.a(iVar, 1.0f);
            this.f2011e.a(iVar2, -1.0f);
            this.f2011e.a(iVar4, f5);
            this.f2011e.a(iVar3, -f5);
        }
        return this;
    }

    public b a(d dVar, int i2) {
        this.f2011e.a(dVar.a(i2, "ep"), 1.0f);
        this.f2011e.a(dVar.a(i2, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public b a(i iVar, int i2) {
        this.f2011e.a(iVar, (float) i2);
        return this;
    }

    /* access modifiers changed from: package-private */
    public b a(i iVar, i iVar2, float f2) {
        this.f2011e.a(iVar, -1.0f);
        this.f2011e.a(iVar2, f2);
        return this;
    }

    public b a(i iVar, i iVar2, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f2008b = (float) i2;
        }
        if (!z) {
            this.f2011e.a(iVar, -1.0f);
            this.f2011e.a(iVar2, 1.0f);
        } else {
            this.f2011e.a(iVar, 1.0f);
            this.f2011e.a(iVar2, -1.0f);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public b a(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3) {
        float f3;
        int i4;
        if (iVar2 == iVar3) {
            this.f2011e.a(iVar, 1.0f);
            this.f2011e.a(iVar4, 1.0f);
            this.f2011e.a(iVar2, -2.0f);
            return this;
        }
        if (f2 == 0.5f) {
            this.f2011e.a(iVar, 1.0f);
            this.f2011e.a(iVar2, -1.0f);
            this.f2011e.a(iVar3, -1.0f);
            this.f2011e.a(iVar4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                i4 = (-i2) + i3;
            }
            return this;
        }
        if (f2 <= 0.0f) {
            this.f2011e.a(iVar, -1.0f);
            this.f2011e.a(iVar2, 1.0f);
            f3 = (float) i2;
        } else if (f2 >= 1.0f) {
            this.f2011e.a(iVar4, -1.0f);
            this.f2011e.a(iVar3, 1.0f);
            i4 = -i3;
        } else {
            float f4 = 1.0f - f2;
            this.f2011e.a(iVar, f4 * 1.0f);
            this.f2011e.a(iVar2, f4 * -1.0f);
            this.f2011e.a(iVar3, -1.0f * f2);
            this.f2011e.a(iVar4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                f3 = (((float) (-i2)) * f4) + (((float) i3) * f2);
            }
            return this;
        }
        this.f2008b = f3;
        return this;
        f3 = (float) i4;
        this.f2008b = f3;
        return this;
    }

    public b a(i iVar, i iVar2, i iVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f2008b = (float) i2;
        }
        if (!z) {
            this.f2011e.a(iVar, -1.0f);
            this.f2011e.a(iVar2, 1.0f);
            this.f2011e.a(iVar3, 1.0f);
        } else {
            this.f2011e.a(iVar, 1.0f);
            this.f2011e.a(iVar2, -1.0f);
            this.f2011e.a(iVar3, -1.0f);
        }
        return this;
    }

    public b a(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f2011e.a(iVar, -1.0f);
        this.f2011e.a(iVar2, 1.0f);
        this.f2011e.a(iVar3, f2);
        this.f2011e.a(iVar4, -f2);
        return this;
    }

    @Override // c.f.a.d.a
    public i a(d dVar, boolean[] zArr) {
        return a(zArr, (i) null);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        float f2 = this.f2008b;
        if (f2 < 0.0f) {
            this.f2008b = f2 * -1.0f;
            this.f2011e.b();
        }
    }

    @Override // c.f.a.d.a
    public void a(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.a = null;
            this.f2011e.clear();
            for (int i2 = 0; i2 < bVar.f2011e.a(); i2++) {
                this.f2011e.a(bVar.f2011e.b(i2), bVar.f2011e.a(i2), true);
            }
        }
    }

    public void a(d dVar, b bVar, boolean z) {
        this.f2008b += bVar.f2008b * this.f2011e.a(bVar, z);
        if (z) {
            bVar.a.b(this);
        }
        if (d.t && this.a != null && this.f2011e.a() == 0) {
            this.f2012f = true;
            dVar.a = true;
        }
    }

    public void a(d dVar, i iVar, boolean z) {
        if (iVar != null && iVar.f2053h) {
            this.f2008b += iVar.f2052g * this.f2011e.a(iVar);
            this.f2011e.a(iVar, z);
            if (z) {
                iVar.b(this);
            }
            if (d.t && this.f2011e.a() == 0) {
                this.f2012f = true;
                dVar.a = true;
            }
        }
    }

    @Override // c.f.a.d.a
    public void a(i iVar) {
        int i2 = iVar.f2051f;
        float f2 = 1.0f;
        if (i2 != 1) {
            if (i2 == 2) {
                f2 = 1000.0f;
            } else if (i2 == 3) {
                f2 = 1000000.0f;
            } else if (i2 == 4) {
                f2 = 1.0E9f;
            } else if (i2 == 5) {
                f2 = 1.0E12f;
            }
        }
        this.f2011e.a(iVar, f2);
    }

    /* access modifiers changed from: package-private */
    public boolean a(d dVar) {
        boolean z;
        i b2 = b(dVar);
        if (b2 == null) {
            z = true;
        } else {
            d(b2);
            z = false;
        }
        if (this.f2011e.a() == 0) {
            this.f2012f = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public b b(i iVar, int i2) {
        this.a = iVar;
        float f2 = (float) i2;
        iVar.f2052g = f2;
        this.f2008b = f2;
        this.f2012f = true;
        return this;
    }

    public b b(i iVar, i iVar2, i iVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f2008b = (float) i2;
        }
        if (!z) {
            this.f2011e.a(iVar, -1.0f);
            this.f2011e.a(iVar2, 1.0f);
            this.f2011e.a(iVar3, -1.0f);
        } else {
            this.f2011e.a(iVar, 1.0f);
            this.f2011e.a(iVar2, -1.0f);
            this.f2011e.a(iVar3, 1.0f);
        }
        return this;
    }

    public b b(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f2011e.a(iVar3, 0.5f);
        this.f2011e.a(iVar4, 0.5f);
        this.f2011e.a(iVar, -0.5f);
        this.f2011e.a(iVar2, -0.5f);
        this.f2008b = -f2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public i b(d dVar) {
        int a2 = this.f2011e.a();
        i iVar = null;
        i iVar2 = null;
        float f2 = 0.0f;
        boolean z = false;
        float f3 = 0.0f;
        boolean z2 = false;
        for (int i2 = 0; i2 < a2; i2++) {
            float a3 = this.f2011e.a(i2);
            i b2 = this.f2011e.b(i2);
            if (b2.f2056k == i.a.UNRESTRICTED) {
                if (iVar == null || f2 > a3) {
                    z = a(b2, dVar);
                    f2 = a3;
                    iVar = b2;
                } else if (!z && a(b2, dVar)) {
                    f2 = a3;
                    iVar = b2;
                    z = true;
                }
            } else if (iVar == null && a3 < 0.0f) {
                if (iVar2 == null || f3 > a3) {
                    z2 = a(b2, dVar);
                    f3 = a3;
                    iVar2 = b2;
                } else if (!z2 && a(b2, dVar)) {
                    f3 = a3;
                    iVar2 = b2;
                    z2 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    public void b(d dVar, i iVar, boolean z) {
        if (iVar != null && iVar.o) {
            float a2 = this.f2011e.a(iVar);
            this.f2008b += iVar.q * a2;
            this.f2011e.a(iVar, z);
            if (z) {
                iVar.b(this);
            }
            this.f2011e.a(dVar.n.f2015d[iVar.p], a2, z);
            if (d.t && this.f2011e.a() == 0) {
                this.f2012f = true;
                dVar.a = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        i iVar = this.a;
        return iVar != null && (iVar.f2056k == i.a.UNRESTRICTED || this.f2008b >= 0.0f);
    }

    /* access modifiers changed from: package-private */
    public boolean b(i iVar) {
        return this.f2011e.b(iVar);
    }

    public b c(i iVar, int i2) {
        a aVar;
        float f2;
        if (i2 < 0) {
            this.f2008b = (float) (i2 * -1);
            aVar = this.f2011e;
            f2 = 1.0f;
        } else {
            this.f2008b = (float) i2;
            aVar = this.f2011e;
            f2 = -1.0f;
        }
        aVar.a(iVar, f2);
        return this;
    }

    public i c(i iVar) {
        return a((boolean[]) null, iVar);
    }

    public void c() {
        this.a = null;
        this.f2011e.clear();
        this.f2008b = 0.0f;
        this.f2012f = false;
    }

    public void c(d dVar) {
        if (dVar.f2021g.length != 0) {
            boolean z = false;
            while (!z) {
                int a2 = this.f2011e.a();
                for (int i2 = 0; i2 < a2; i2++) {
                    i b2 = this.f2011e.b(i2);
                    if (b2.f2050e != -1 || b2.f2053h || b2.o) {
                        this.f2010d.add(b2);
                    }
                }
                int size = this.f2010d.size();
                if (size > 0) {
                    for (int i3 = 0; i3 < size; i3++) {
                        i iVar = this.f2010d.get(i3);
                        if (iVar.f2053h) {
                            a(dVar, iVar, true);
                        } else if (iVar.o) {
                            b(dVar, iVar, true);
                        } else {
                            a(dVar, dVar.f2021g[iVar.f2050e], true);
                        }
                    }
                    this.f2010d.clear();
                } else {
                    z = true;
                }
            }
            if (d.t && this.a != null && this.f2011e.a() == 0) {
                this.f2012f = true;
                dVar.a = true;
            }
        }
    }

    @Override // c.f.a.d.a
    public void clear() {
        this.f2011e.clear();
        this.a = null;
        this.f2008b = 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String d() {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.d():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public void d(i iVar) {
        i iVar2 = this.a;
        if (iVar2 != null) {
            this.f2011e.a(iVar2, -1.0f);
            this.a.f2050e = -1;
            this.a = null;
        }
        float a2 = this.f2011e.a(iVar, true) * -1.0f;
        this.a = iVar;
        if (a2 != 1.0f) {
            this.f2008b /= a2;
            this.f2011e.a(a2);
        }
    }

    @Override // c.f.a.d.a
    public i getKey() {
        return this.a;
    }

    @Override // c.f.a.d.a
    public boolean isEmpty() {
        return this.a == null && this.f2008b == 0.0f && this.f2011e.a() == 0;
    }

    public String toString() {
        return d();
    }
}
