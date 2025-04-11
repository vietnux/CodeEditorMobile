package c.f.a.m;

import c.f.a.m.e;
import java.util.ArrayList;

public class c {
    protected e a;

    /* renamed from: b  reason: collision with root package name */
    protected e f2098b;

    /* renamed from: c  reason: collision with root package name */
    protected e f2099c;

    /* renamed from: d  reason: collision with root package name */
    protected e f2100d;

    /* renamed from: e  reason: collision with root package name */
    protected e f2101e;

    /* renamed from: f  reason: collision with root package name */
    protected e f2102f;

    /* renamed from: g  reason: collision with root package name */
    protected e f2103g;

    /* renamed from: h  reason: collision with root package name */
    protected ArrayList<e> f2104h;

    /* renamed from: i  reason: collision with root package name */
    protected int f2105i;

    /* renamed from: j  reason: collision with root package name */
    protected int f2106j;

    /* renamed from: k  reason: collision with root package name */
    protected float f2107k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    int f2108l;

    /* renamed from: m  reason: collision with root package name */
    int f2109m;
    int n;
    private int o;
    private boolean p = false;
    protected boolean q;
    protected boolean r;
    protected boolean s;
    private boolean t;

    public c(e eVar, int i2, boolean z) {
        this.a = eVar;
        this.o = i2;
        this.p = z;
    }

    private static boolean a(e eVar, int i2) {
        if (eVar.B() != 8 && eVar.V[i2] == e.b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.u;
            if (iArr[i2] == 0 || iArr[i2] == 3) {
                return true;
            }
        }
        return false;
    }

    private void b() {
        int i2 = this.o * 2;
        boolean z = false;
        e eVar = this.a;
        e eVar2 = eVar;
        boolean z2 = false;
        while (!z2) {
            this.f2105i++;
            e[] eVarArr = eVar.q0;
            int i3 = this.o;
            e eVar3 = null;
            eVarArr[i3] = null;
            eVar.p0[i3] = null;
            if (eVar.B() != 8) {
                this.f2108l++;
                if (eVar.b(this.o) != e.b.MATCH_CONSTRAINT) {
                    this.f2109m += eVar.c(this.o);
                }
                this.f2109m += eVar.S[i2].c();
                int i4 = i2 + 1;
                this.f2109m += eVar.S[i4].c();
                this.n += eVar.S[i2].c();
                this.n += eVar.S[i4].c();
                if (this.f2098b == null) {
                    this.f2098b = eVar;
                }
                this.f2100d = eVar;
                e.b[] bVarArr = eVar.V;
                int i5 = this.o;
                if (bVarArr[i5] == e.b.MATCH_CONSTRAINT) {
                    int[] iArr = eVar.u;
                    if (iArr[i5] == 0 || iArr[i5] == 3 || iArr[i5] == 2) {
                        this.f2106j++;
                        float[] fArr = eVar.o0;
                        int i6 = this.o;
                        float f2 = fArr[i6];
                        if (f2 > 0.0f) {
                            this.f2107k += fArr[i6];
                        }
                        if (a(eVar, this.o)) {
                            if (f2 < 0.0f) {
                                this.q = true;
                            } else {
                                this.r = true;
                            }
                            if (this.f2104h == null) {
                                this.f2104h = new ArrayList<>();
                            }
                            this.f2104h.add(eVar);
                        }
                        if (this.f2102f == null) {
                            this.f2102f = eVar;
                        }
                        e eVar4 = this.f2103g;
                        if (eVar4 != null) {
                            eVar4.p0[this.o] = eVar;
                        }
                        this.f2103g = eVar;
                    }
                    if (this.o == 0) {
                        if (eVar.s == 0 && eVar.v == 0) {
                            int i7 = eVar.w;
                        }
                    } else if (eVar.t == 0 && eVar.y == 0) {
                        int i8 = eVar.z;
                    }
                    int i9 = (eVar.Z > 0.0f ? 1 : (eVar.Z == 0.0f ? 0 : -1));
                }
            }
            if (eVar2 != eVar) {
                eVar2.q0[this.o] = eVar;
            }
            d dVar = eVar.S[i2 + 1].f2114f;
            if (dVar != null) {
                e eVar5 = dVar.f2112d;
                d[] dVarArr = eVar5.S;
                if (dVarArr[i2].f2114f != null && dVarArr[i2].f2114f.f2112d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z2 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f2098b;
        if (eVar6 != null) {
            this.f2109m -= eVar6.S[i2].c();
        }
        e eVar7 = this.f2100d;
        if (eVar7 != null) {
            this.f2109m -= eVar7.S[i2 + 1].c();
        }
        this.f2099c = eVar;
        this.f2101e = (this.o != 0 || !this.p) ? this.a : this.f2099c;
        if (this.r && this.q) {
            z = true;
        }
        this.s = z;
    }

    public void a() {
        if (!this.t) {
            b();
        }
        this.t = true;
    }
}
