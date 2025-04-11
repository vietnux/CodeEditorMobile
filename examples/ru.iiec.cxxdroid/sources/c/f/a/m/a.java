package c.f.a.m;

import c.f.a.i;
import c.f.a.m.d;
import c.f.a.m.e;

public class a extends i {
    private int w0 = 0;
    private boolean x0 = true;
    private int y0 = 0;
    boolean z0 = false;

    public void A(int i2) {
        this.y0 = i2;
    }

    @Override // c.f.a.m.e
    public boolean O() {
        return this.z0;
    }

    @Override // c.f.a.m.e
    public boolean P() {
        return this.z0;
    }

    public boolean W() {
        int i2;
        d.b bVar;
        d.b bVar2;
        d.b bVar3;
        int i3;
        int i4;
        int i5 = 0;
        boolean z = true;
        while (true) {
            i2 = this.v0;
            if (i5 >= i2) {
                break;
            }
            e eVar = this.u0[i5];
            if ((this.x0 || eVar.c()) && ((((i3 = this.w0) == 0 || i3 == 1) && !eVar.O()) || (((i4 = this.w0) == 2 || i4 == 3) && !eVar.P()))) {
                z = false;
            }
            i5++;
        }
        if (!z || i2 <= 0) {
            return false;
        }
        int i6 = 0;
        boolean z2 = false;
        for (int i7 = 0; i7 < this.v0; i7++) {
            e eVar2 = this.u0[i7];
            if (this.x0 || eVar2.c()) {
                if (!z2) {
                    int i8 = this.w0;
                    if (i8 == 0) {
                        bVar3 = d.b.LEFT;
                    } else if (i8 == 1) {
                        bVar3 = d.b.RIGHT;
                    } else if (i8 == 2) {
                        bVar3 = d.b.TOP;
                    } else {
                        if (i8 == 3) {
                            bVar3 = d.b.BOTTOM;
                        }
                        z2 = true;
                    }
                    i6 = eVar2.a(bVar3).b();
                    z2 = true;
                }
                int i9 = this.w0;
                if (i9 == 0) {
                    bVar2 = d.b.LEFT;
                } else {
                    if (i9 == 1) {
                        bVar = d.b.RIGHT;
                    } else if (i9 == 2) {
                        bVar2 = d.b.TOP;
                    } else if (i9 == 3) {
                        bVar = d.b.BOTTOM;
                    }
                    i6 = Math.max(i6, eVar2.a(bVar).b());
                }
                i6 = Math.min(i6, eVar2.a(bVar2).b());
            }
        }
        int i10 = i6 + this.y0;
        int i11 = this.w0;
        if (i11 == 0 || i11 == 1) {
            b(i10, i10);
        } else {
            c(i10, i10);
        }
        this.z0 = true;
        return true;
    }

    public boolean X() {
        return this.x0;
    }

    public int Y() {
        return this.w0;
    }

    public int Z() {
        return this.y0;
    }

    @Override // c.f.a.m.e
    public void a(c.f.a.d dVar, boolean z) {
        Object[] objArr;
        boolean z2;
        i iVar;
        d dVar2;
        int i2;
        int i3;
        i iVar2;
        int i4;
        d[] dVarArr = this.S;
        dVarArr[0] = this.K;
        dVarArr[2] = this.L;
        dVarArr[1] = this.M;
        dVarArr[3] = this.N;
        int i5 = 0;
        while (true) {
            objArr = this.S;
            if (i5 >= objArr.length) {
                break;
            }
            objArr[i5].f2117i = dVar.a(objArr[i5]);
            i5++;
        }
        int i6 = this.w0;
        if (i6 >= 0 && i6 < 4) {
            d dVar3 = objArr[i6];
            if (!this.z0) {
                W();
            }
            if (this.z0) {
                this.z0 = false;
                int i7 = this.w0;
                if (i7 == 0 || i7 == 1) {
                    dVar.a(this.K.f2117i, this.b0);
                    iVar2 = this.M.f2117i;
                    i4 = this.b0;
                } else if (i7 == 2 || i7 == 3) {
                    dVar.a(this.L.f2117i, this.c0);
                    iVar2 = this.N.f2117i;
                    i4 = this.c0;
                } else {
                    return;
                }
                dVar.a(iVar2, i4);
                return;
            }
            int i8 = 0;
            while (true) {
                if (i8 >= this.v0) {
                    z2 = false;
                    break;
                }
                e eVar = this.u0[i8];
                if ((this.x0 || eVar.c()) && ((((i2 = this.w0) == 0 || i2 == 1) && eVar.n() == e.b.MATCH_CONSTRAINT && eVar.K.f2114f != null && eVar.M.f2114f != null) || (((i3 = this.w0) == 2 || i3 == 3) && eVar.z() == e.b.MATCH_CONSTRAINT && eVar.L.f2114f != null && eVar.N.f2114f != null))) {
                    z2 = true;
                } else {
                    i8++;
                }
            }
            z2 = true;
            boolean z3 = this.K.i() || this.M.i();
            boolean z4 = this.L.i() || this.N.i();
            boolean z5 = !z2 && ((this.w0 == 0 && z3) || ((this.w0 == 2 && z4) || ((this.w0 == 1 && z3) || (this.w0 == 3 && z4))));
            int i9 = 5;
            if (!z5) {
                i9 = 4;
            }
            for (int i10 = 0; i10 < this.v0; i10++) {
                e eVar2 = this.u0[i10];
                if (this.x0 || eVar2.c()) {
                    i a = dVar.a(eVar2.S[this.w0]);
                    d[] dVarArr2 = eVar2.S;
                    int i11 = this.w0;
                    dVarArr2[i11].f2117i = a;
                    int i12 = (dVarArr2[i11].f2114f == null || dVarArr2[i11].f2114f.f2112d != this) ? 0 : dVarArr2[i11].f2115g + 0;
                    int i13 = this.w0;
                    if (i13 == 0 || i13 == 2) {
                        dVar.b(dVar3.f2117i, a, this.y0 - i12, z2);
                    } else {
                        dVar.a(dVar3.f2117i, a, this.y0 + i12, z2);
                    }
                    dVar.a(dVar3.f2117i, a, this.y0 + i12, i9);
                }
            }
            int i14 = this.w0;
            if (i14 == 0) {
                dVar.a(this.M.f2117i, this.K.f2117i, 0, 8);
                dVar.a(this.K.f2117i, this.W.M.f2117i, 0, 4);
                iVar = this.K.f2117i;
                dVar2 = this.W.K;
            } else if (i14 == 1) {
                dVar.a(this.K.f2117i, this.M.f2117i, 0, 8);
                dVar.a(this.K.f2117i, this.W.K.f2117i, 0, 4);
                iVar = this.K.f2117i;
                dVar2 = this.W.M;
            } else if (i14 == 2) {
                dVar.a(this.N.f2117i, this.L.f2117i, 0, 8);
                dVar.a(this.L.f2117i, this.W.N.f2117i, 0, 4);
                iVar = this.L.f2117i;
                dVar2 = this.W.L;
            } else if (i14 == 3) {
                dVar.a(this.L.f2117i, this.N.f2117i, 0, 8);
                dVar.a(this.L.f2117i, this.W.L.f2117i, 0, 4);
                iVar = this.L.f2117i;
                dVar2 = this.W.N;
            } else {
                return;
            }
            dVar.a(iVar, dVar2.f2117i, 0, 0);
        }
    }

    public int a0() {
        int i2 = this.w0;
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        return (i2 == 2 || i2 == 3) ? 1 : -1;
    }

    /* access modifiers changed from: protected */
    public void b0() {
        for (int i2 = 0; i2 < this.v0; i2++) {
            e eVar = this.u0[i2];
            if (this.x0 || eVar.c()) {
                int i3 = this.w0;
                if (i3 == 0 || i3 == 1) {
                    eVar.a(0, true);
                } else if (i3 == 2 || i3 == 3) {
                    eVar.a(1, true);
                }
            }
        }
    }

    @Override // c.f.a.m.e
    public boolean c() {
        return true;
    }

    public void e(boolean z) {
        this.x0 = z;
    }

    @Override // c.f.a.m.e
    public String toString() {
        String str = "[Barrier] " + h() + " {";
        for (int i2 = 0; i2 < this.v0; i2++) {
            e eVar = this.u0[i2];
            if (i2 > 0) {
                str = str + ", ";
            }
            str = str + eVar.h();
        }
        return str + "}";
    }

    public void z(int i2) {
        this.w0 = i2;
    }
}
