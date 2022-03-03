package c.f.a;

import c.f.a.i;
import c.f.a.m.d;
import c.f.a.m.e;
import java.util.Arrays;
import java.util.HashMap;

public class d {
    public static boolean r = false;
    public static boolean s = true;
    public static boolean t = true;
    public static boolean u = true;
    public static boolean v = false;
    private static int w = 1000;
    public static e x;
    public static long y;
    public static long z;
    public boolean a = false;

    /* renamed from: b  reason: collision with root package name */
    int f2016b = 0;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, i> f2017c = null;

    /* renamed from: d  reason: collision with root package name */
    private a f2018d;

    /* renamed from: e  reason: collision with root package name */
    private int f2019e = 32;

    /* renamed from: f  reason: collision with root package name */
    private int f2020f;

    /* renamed from: g  reason: collision with root package name */
    b[] f2021g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2022h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2023i;

    /* renamed from: j  reason: collision with root package name */
    private boolean[] f2024j;

    /* renamed from: k  reason: collision with root package name */
    int f2025k;

    /* renamed from: l  reason: collision with root package name */
    int f2026l;

    /* renamed from: m  reason: collision with root package name */
    private int f2027m;
    final c n;
    private i[] o;
    private int p;
    private a q;

    /* access modifiers changed from: package-private */
    public interface a {
        i a(d dVar, boolean[] zArr);

        void a(a aVar);

        void a(i iVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    /* access modifiers changed from: package-private */
    public class b extends b {
        public b(d dVar, c cVar) {
            this.f2011e = new j(this, cVar);
        }
    }

    public d() {
        int i2 = this.f2019e;
        this.f2020f = i2;
        this.f2021g = null;
        this.f2022h = false;
        this.f2023i = false;
        this.f2024j = new boolean[i2];
        this.f2025k = 1;
        this.f2026l = 0;
        this.f2027m = i2;
        this.o = new i[w];
        this.p = 0;
        this.f2021g = new b[i2];
        j();
        this.n = new c();
        this.f2018d = new h(this.n);
        this.q = v ? new b(this, this.n) : new b(this.n);
    }

    private final int a(a aVar, boolean z2) {
        e eVar = x;
        if (eVar != null) {
            eVar.f2034h++;
        }
        for (int i2 = 0; i2 < this.f2025k; i2++) {
            this.f2024j[i2] = false;
        }
        boolean z3 = false;
        int i3 = 0;
        while (!z3) {
            e eVar2 = x;
            if (eVar2 != null) {
                eVar2.f2035i++;
            }
            i3++;
            if (i3 >= this.f2025k * 2) {
                return i3;
            }
            if (aVar.getKey() != null) {
                this.f2024j[aVar.getKey().f2049d] = true;
            }
            i a2 = aVar.a(this, this.f2024j);
            if (a2 != null) {
                boolean[] zArr = this.f2024j;
                int i4 = a2.f2049d;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (a2 != null) {
                int i5 = -1;
                float f2 = Float.MAX_VALUE;
                for (int i6 = 0; i6 < this.f2026l; i6++) {
                    b bVar = this.f2021g[i6];
                    if (bVar.a.f2056k != i.a.UNRESTRICTED && !bVar.f2012f && bVar.b(a2)) {
                        float a3 = bVar.f2011e.a(a2);
                        if (a3 < 0.0f) {
                            float f3 = (-bVar.f2008b) / a3;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    b bVar2 = this.f2021g[i5];
                    bVar2.a.f2050e = -1;
                    e eVar3 = x;
                    if (eVar3 != null) {
                        eVar3.f2036j++;
                    }
                    bVar2.d(a2);
                    i iVar = bVar2.a;
                    iVar.f2050e = i5;
                    iVar.a(this, bVar2);
                }
            } else {
                z3 = true;
            }
        }
        return i3;
    }

    public static b a(d dVar, i iVar, i iVar2, float f2) {
        b b2 = dVar.b();
        b2.a(iVar, iVar2, f2);
        return b2;
    }

    private i a(i.a aVar, String str) {
        i a2 = this.n.f2014c.a();
        if (a2 == null) {
            a2 = new i(aVar, str);
        } else {
            a2.a();
        }
        a2.a(aVar, str);
        int i2 = this.p;
        int i3 = w;
        if (i2 >= i3) {
            w = i3 * 2;
            this.o = (i[]) Arrays.copyOf(this.o, w);
        }
        i[] iVarArr = this.o;
        int i4 = this.p;
        this.p = i4 + 1;
        iVarArr[i4] = a2;
        return a2;
    }

    private int b(a aVar) {
        boolean z2;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f2026l) {
                z2 = false;
                break;
            }
            b[] bVarArr = this.f2021g;
            if (bVarArr[i2].a.f2056k != i.a.UNRESTRICTED && bVarArr[i2].f2008b < 0.0f) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (!z2) {
            return 0;
        }
        boolean z3 = false;
        int i3 = 0;
        while (!z3) {
            e eVar = x;
            if (eVar != null) {
                eVar.f2037k++;
            }
            i3++;
            int i4 = -1;
            int i5 = -1;
            float f2 = Float.MAX_VALUE;
            int i6 = 0;
            for (int i7 = 0; i7 < this.f2026l; i7++) {
                b bVar = this.f2021g[i7];
                if (bVar.a.f2056k != i.a.UNRESTRICTED && !bVar.f2012f && bVar.f2008b < 0.0f) {
                    int i8 = 9;
                    if (u) {
                        int a2 = bVar.f2011e.a();
                        int i9 = i6;
                        float f3 = f2;
                        int i10 = i5;
                        int i11 = i4;
                        int i12 = 0;
                        while (i12 < a2) {
                            i b2 = bVar.f2011e.b(i12);
                            float a3 = bVar.f2011e.a(b2);
                            if (a3 > 0.0f) {
                                int i13 = i9;
                                int i14 = 0;
                                while (i14 < i8) {
                                    float f4 = b2.f2054i[i14] / a3;
                                    if ((f4 < f3 && i14 == i13) || i14 > i13) {
                                        i11 = i7;
                                        i10 = b2.f2049d;
                                        f3 = f4;
                                        i13 = i14;
                                    }
                                    i14++;
                                    i8 = 9;
                                }
                                i9 = i13;
                            }
                            i12++;
                            i8 = 9;
                        }
                        i4 = i11;
                        i5 = i10;
                        f2 = f3;
                        i6 = i9;
                    } else {
                        for (int i15 = 1; i15 < this.f2025k; i15++) {
                            i iVar = this.n.f2015d[i15];
                            float a4 = bVar.f2011e.a(iVar);
                            if (a4 > 0.0f) {
                                for (int i16 = 0; i16 < 9; i16++) {
                                    float f5 = iVar.f2054i[i16] / a4;
                                    if ((f5 < f2 && i16 == i6) || i16 > i6) {
                                        i5 = i15;
                                        i4 = i7;
                                        i6 = i16;
                                        f2 = f5;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i4 != -1) {
                b bVar2 = this.f2021g[i4];
                bVar2.a.f2050e = -1;
                e eVar2 = x;
                if (eVar2 != null) {
                    eVar2.f2036j++;
                }
                bVar2.d(this.n.f2015d[i5]);
                i iVar2 = bVar2.a;
                iVar2.f2050e = i4;
                iVar2.a(this, bVar2);
            } else {
                z3 = true;
            }
            if (i3 > this.f2025k / 2) {
                z3 = true;
            }
        }
        return i3;
    }

    private final void b(b bVar) {
        int i2;
        if (!t || !bVar.f2012f) {
            b[] bVarArr = this.f2021g;
            int i3 = this.f2026l;
            bVarArr[i3] = bVar;
            i iVar = bVar.a;
            iVar.f2050e = i3;
            this.f2026l = i3 + 1;
            iVar.a(this, bVar);
        } else {
            bVar.a.a(this, bVar.f2008b);
        }
        if (t && this.a) {
            int i4 = 0;
            while (i4 < this.f2026l) {
                if (this.f2021g[i4] == null) {
                    System.out.println("WTF");
                }
                b[] bVarArr2 = this.f2021g;
                if (bVarArr2[i4] != null && bVarArr2[i4].f2012f) {
                    b bVar2 = bVarArr2[i4];
                    bVar2.a.a(this, bVar2.f2008b);
                    (v ? this.n.a : this.n.f2013b).a(bVar2);
                    this.f2021g[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.f2026l;
                        if (i5 >= i2) {
                            break;
                        }
                        b[] bVarArr3 = this.f2021g;
                        int i7 = i5 - 1;
                        bVarArr3[i7] = bVarArr3[i5];
                        if (bVarArr3[i7].a.f2050e == i5) {
                            bVarArr3[i7].a.f2050e = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.f2021g[i6] = null;
                    }
                    this.f2026l--;
                    i4--;
                }
                i4++;
            }
            this.a = false;
        }
    }

    private void g() {
        for (int i2 = 0; i2 < this.f2026l; i2++) {
            b bVar = this.f2021g[i2];
            bVar.a.f2052g = bVar.f2008b;
        }
    }

    public static e h() {
        return x;
    }

    private void i() {
        this.f2019e *= 2;
        this.f2021g = (b[]) Arrays.copyOf(this.f2021g, this.f2019e);
        c cVar = this.n;
        cVar.f2015d = (i[]) Arrays.copyOf(cVar.f2015d, this.f2019e);
        int i2 = this.f2019e;
        this.f2024j = new boolean[i2];
        this.f2020f = i2;
        this.f2027m = i2;
        e eVar = x;
        if (eVar != null) {
            eVar.f2030d++;
            eVar.o = Math.max(eVar.o, (long) i2);
            e eVar2 = x;
            eVar2.x = eVar2.o;
        }
    }

    private void j() {
        int i2 = 0;
        if (v) {
            while (i2 < this.f2026l) {
                b bVar = this.f2021g[i2];
                if (bVar != null) {
                    this.n.a.a(bVar);
                }
                this.f2021g[i2] = null;
                i2++;
            }
            return;
        }
        while (i2 < this.f2026l) {
            b bVar2 = this.f2021g[i2];
            if (bVar2 != null) {
                this.n.f2013b.a(bVar2);
            }
            this.f2021g[i2] = null;
            i2++;
        }
    }

    public b a(i iVar, i iVar2, int i2, int i3) {
        if (!s || i3 != 8 || !iVar2.f2053h || iVar.f2050e != -1) {
            b b2 = b();
            b2.a(iVar, iVar2, i2);
            if (i3 != 8) {
                b2.a(this, i3);
            }
            a(b2);
            return b2;
        }
        iVar.a(this, iVar2.f2052g + ((float) i2));
        return null;
    }

    public i a() {
        e eVar = x;
        if (eVar != null) {
            eVar.n++;
        }
        if (this.f2025k + 1 >= this.f2020f) {
            i();
        }
        i a2 = a(i.a.SLACK, (String) null);
        this.f2016b++;
        this.f2025k++;
        int i2 = this.f2016b;
        a2.f2049d = i2;
        this.n.f2015d[i2] = a2;
        return a2;
    }

    public i a(int i2, String str) {
        e eVar = x;
        if (eVar != null) {
            eVar.f2038l++;
        }
        if (this.f2025k + 1 >= this.f2020f) {
            i();
        }
        i a2 = a(i.a.ERROR, str);
        this.f2016b++;
        this.f2025k++;
        int i3 = this.f2016b;
        a2.f2049d = i3;
        a2.f2051f = i2;
        this.n.f2015d[i3] = a2;
        this.f2018d.a(a2);
        return a2;
    }

    public i a(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f2025k + 1 >= this.f2020f) {
            i();
        }
        if (obj instanceof c.f.a.m.d) {
            c.f.a.m.d dVar = (c.f.a.m.d) obj;
            iVar = dVar.f();
            if (iVar == null) {
                dVar.a(this.n);
                iVar = dVar.f();
            }
            int i2 = iVar.f2049d;
            if (i2 == -1 || i2 > this.f2016b || this.n.f2015d[i2] == null) {
                if (iVar.f2049d != -1) {
                    iVar.a();
                }
                this.f2016b++;
                this.f2025k++;
                int i3 = this.f2016b;
                iVar.f2049d = i3;
                iVar.f2056k = i.a.UNRESTRICTED;
                this.n.f2015d[i3] = iVar;
            }
        }
        return iVar;
    }

    public void a(b bVar) {
        i c2;
        if (bVar != null) {
            e eVar = x;
            if (eVar != null) {
                eVar.f2032f++;
                if (bVar.f2012f) {
                    eVar.f2033g++;
                }
            }
            if (this.f2026l + 1 >= this.f2027m || this.f2025k + 1 >= this.f2020f) {
                i();
            }
            boolean z2 = false;
            if (!bVar.f2012f) {
                bVar.c(this);
                if (!bVar.isEmpty()) {
                    bVar.a();
                    if (bVar.a(this)) {
                        i a2 = a();
                        bVar.a = a2;
                        int i2 = this.f2026l;
                        b(bVar);
                        if (this.f2026l == i2 + 1) {
                            this.q.a(bVar);
                            a(this.q, true);
                            if (a2.f2050e == -1) {
                                if (bVar.a == a2 && (c2 = bVar.c(a2)) != null) {
                                    e eVar2 = x;
                                    if (eVar2 != null) {
                                        eVar2.f2036j++;
                                    }
                                    bVar.d(c2);
                                }
                                if (!bVar.f2012f) {
                                    bVar.a.a(this, bVar);
                                }
                                (v ? this.n.a : this.n.f2013b).a(bVar);
                                this.f2026l--;
                            }
                            z2 = true;
                        }
                    }
                    if (!bVar.b()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!z2) {
                b(bVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar, int i2, int i3) {
        bVar.a(a(i3, (String) null), i2);
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        e eVar = x;
        if (eVar != null) {
            eVar.t++;
            eVar.u = Math.max(eVar.u, (long) this.f2025k);
            e eVar2 = x;
            eVar2.v = Math.max(eVar2.v, (long) this.f2026l);
        }
        b(aVar);
        a(aVar, false);
        g();
    }

    public void a(i iVar, int i2) {
        b bVar;
        if (!s || iVar.f2050e != -1) {
            int i3 = iVar.f2050e;
            if (i3 != -1) {
                b bVar2 = this.f2021g[i3];
                if (!bVar2.f2012f) {
                    if (bVar2.f2011e.a() == 0) {
                        bVar2.f2012f = true;
                    } else {
                        bVar = b();
                        bVar.c(iVar, i2);
                    }
                }
                bVar2.f2008b = (float) i2;
                return;
            }
            bVar = b();
            bVar.b(iVar, i2);
            a(bVar);
            return;
        }
        float f2 = (float) i2;
        iVar.a(this, f2);
        for (int i4 = 0; i4 < this.f2016b + 1; i4++) {
            i iVar2 = this.n.f2015d[i4];
            if (iVar2 != null && iVar2.o && iVar2.p == iVar.f2049d) {
                iVar2.a(this, iVar2.q + f2);
            }
        }
    }

    public void a(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3, int i4) {
        b b2 = b();
        b2.a(iVar, iVar2, i2, f2, iVar3, iVar4, i3);
        if (i4 != 8) {
            b2.a(this, i4);
        }
        a(b2);
    }

    public void a(i iVar, i iVar2, int i2, boolean z2) {
        b b2 = b();
        i c2 = c();
        c2.f2051f = 0;
        b2.a(iVar, iVar2, c2, i2);
        a(b2);
    }

    public void a(i iVar, i iVar2, i iVar3, i iVar4, float f2, int i2) {
        b b2 = b();
        b2.a(iVar, iVar2, iVar3, iVar4, f2);
        if (i2 != 8) {
            b2.a(this, i2);
        }
        a(b2);
    }

    public void a(e eVar, e eVar2, float f2, int i2) {
        i a2 = a(eVar.a(d.b.LEFT));
        i a3 = a(eVar.a(d.b.TOP));
        i a4 = a(eVar.a(d.b.RIGHT));
        i a5 = a(eVar.a(d.b.BOTTOM));
        i a6 = a(eVar2.a(d.b.LEFT));
        i a7 = a(eVar2.a(d.b.TOP));
        i a8 = a(eVar2.a(d.b.RIGHT));
        i a9 = a(eVar2.a(d.b.BOTTOM));
        b b2 = b();
        double d2 = (double) f2;
        double d3 = (double) i2;
        b2.b(a3, a5, a7, a9, (float) (Math.sin(d2) * d3));
        a(b2);
        b b3 = b();
        b3.b(a2, a4, a6, a8, (float) (Math.cos(d2) * d3));
        a(b3);
    }

    public int b(Object obj) {
        i f2 = ((c.f.a.m.d) obj).f();
        if (f2 != null) {
            return (int) (f2.f2052g + 0.5f);
        }
        return 0;
    }

    public b b() {
        b bVar;
        if (v) {
            bVar = this.n.a.a();
            if (bVar == null) {
                bVar = new b(this, this.n);
                z++;
                i.h();
                return bVar;
            }
        } else {
            bVar = this.n.f2013b.a();
            if (bVar == null) {
                bVar = new b(this.n);
                y++;
                i.h();
                return bVar;
            }
        }
        bVar.c();
        i.h();
        return bVar;
    }

    public void b(i iVar, i iVar2, int i2, int i3) {
        b b2 = b();
        i c2 = c();
        c2.f2051f = 0;
        b2.a(iVar, iVar2, c2, i2);
        if (i3 != 8) {
            a(b2, (int) (b2.f2011e.a(c2) * -1.0f), i3);
        }
        a(b2);
    }

    public void b(i iVar, i iVar2, int i2, boolean z2) {
        b b2 = b();
        i c2 = c();
        c2.f2051f = 0;
        b2.b(iVar, iVar2, c2, i2);
        a(b2);
    }

    public i c() {
        e eVar = x;
        if (eVar != null) {
            eVar.f2039m++;
        }
        if (this.f2025k + 1 >= this.f2020f) {
            i();
        }
        i a2 = a(i.a.SLACK, (String) null);
        this.f2016b++;
        this.f2025k++;
        int i2 = this.f2016b;
        a2.f2049d = i2;
        this.n.f2015d[i2] = a2;
        return a2;
    }

    public void c(i iVar, i iVar2, int i2, int i3) {
        b b2 = b();
        i c2 = c();
        c2.f2051f = 0;
        b2.b(iVar, iVar2, c2, i2);
        if (i3 != 8) {
            a(b2, (int) (b2.f2011e.a(c2) * -1.0f), i3);
        }
        a(b2);
    }

    public c d() {
        return this.n;
    }

    public void e() {
        e eVar = x;
        if (eVar != null) {
            eVar.f2031e++;
        }
        if (this.f2018d.isEmpty()) {
            g();
            return;
        }
        if (this.f2022h || this.f2023i) {
            e eVar2 = x;
            if (eVar2 != null) {
                eVar2.q++;
            }
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f2026l) {
                    z2 = true;
                    break;
                } else if (!this.f2021g[i2].f2012f) {
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                e eVar3 = x;
                if (eVar3 != null) {
                    eVar3.p++;
                }
                g();
                return;
            }
        }
        a(this.f2018d);
    }

    public void f() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.n;
            i[] iVarArr = cVar.f2015d;
            if (i2 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i2];
            if (iVar != null) {
                iVar.a();
            }
            i2++;
        }
        cVar.f2014c.a(this.o, this.p);
        this.p = 0;
        Arrays.fill(this.n.f2015d, (Object) null);
        HashMap<String, i> hashMap = this.f2017c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f2016b = 0;
        this.f2018d.clear();
        this.f2025k = 1;
        for (int i3 = 0; i3 < this.f2026l; i3++) {
            b[] bVarArr = this.f2021g;
            if (bVarArr[i3] != null) {
                bVarArr[i3].f2009c = false;
            }
        }
        j();
        this.f2026l = 0;
        this.q = v ? new b(this, this.n) : new b(this.n);
    }
}
