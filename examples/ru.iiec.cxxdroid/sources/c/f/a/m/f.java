package c.f.a.m;

import c.f.a.d;
import c.f.a.e;
import c.f.a.i;
import c.f.a.m.e;
import c.f.a.m.m.b;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class f extends l {
    public e A0;
    protected d B0 = new d();
    int C0;
    int D0;
    public int E0 = 0;
    public int F0 = 0;
    c[] G0 = new c[4];
    c[] H0 = new c[4];
    private int I0 = 257;
    private boolean J0 = false;
    private boolean K0 = false;
    private WeakReference<d> L0 = null;
    private WeakReference<d> M0 = null;
    private WeakReference<d> N0 = null;
    private WeakReference<d> O0 = null;
    HashSet<e> P0 = new HashSet<>();
    public b.a Q0 = new b.a();
    b v0 = new b(this);
    public c.f.a.m.m.e w0 = new c.f.a.m.m.e(this);
    private int x0;
    protected b.AbstractC0041b y0 = null;
    private boolean z0 = false;

    private void a(d dVar, i iVar) {
        this.B0.b(iVar, this.B0.a(dVar), 0, 5);
    }

    public static boolean a(int i2, e eVar, b.AbstractC0041b bVar, b.a aVar, int i3) {
        int i4;
        int i5;
        if (bVar == null) {
            return false;
        }
        if (eVar.B() == 8 || (eVar instanceof g) || (eVar instanceof a)) {
            aVar.f2154e = 0;
            aVar.f2155f = 0;
            return false;
        }
        aVar.a = eVar.n();
        aVar.f2151b = eVar.z();
        aVar.f2152c = eVar.C();
        aVar.f2153d = eVar.k();
        aVar.f2158i = false;
        aVar.f2159j = i3;
        boolean z = aVar.a == e.b.MATCH_CONSTRAINT;
        boolean z2 = aVar.f2151b == e.b.MATCH_CONSTRAINT;
        boolean z3 = z && eVar.Z > 0.0f;
        boolean z4 = z2 && eVar.Z > 0.0f;
        if (z && eVar.g(0) && eVar.s == 0 && !z3) {
            aVar.a = e.b.WRAP_CONTENT;
            if (z2 && eVar.t == 0) {
                aVar.a = e.b.FIXED;
            }
            z = false;
        }
        if (z2 && eVar.g(1) && eVar.t == 0 && !z4) {
            aVar.f2151b = e.b.WRAP_CONTENT;
            if (z && eVar.s == 0) {
                aVar.f2151b = e.b.FIXED;
            }
            z2 = false;
        }
        if (eVar.O()) {
            aVar.a = e.b.FIXED;
            z = false;
        }
        if (eVar.P()) {
            aVar.f2151b = e.b.FIXED;
            z2 = false;
        }
        if (z3) {
            if (eVar.u[0] == 4) {
                aVar.a = e.b.FIXED;
            } else if (!z2) {
                if (aVar.f2151b == e.b.FIXED) {
                    i5 = aVar.f2153d;
                } else {
                    aVar.a = e.b.WRAP_CONTENT;
                    bVar.a(eVar, aVar);
                    i5 = aVar.f2155f;
                }
                aVar.a = e.b.FIXED;
                aVar.f2152c = (int) (eVar.i() * ((float) i5));
            }
        }
        if (z4) {
            if (eVar.u[1] == 4) {
                aVar.f2151b = e.b.FIXED;
            } else if (!z) {
                if (aVar.a == e.b.FIXED) {
                    i4 = aVar.f2152c;
                } else {
                    aVar.f2151b = e.b.WRAP_CONTENT;
                    bVar.a(eVar, aVar);
                    i4 = aVar.f2154e;
                }
                aVar.f2151b = e.b.FIXED;
                aVar.f2153d = eVar.j() == -1 ? (int) (((float) i4) / eVar.i()) : (int) (eVar.i() * ((float) i4));
            }
        }
        bVar.a(eVar, aVar);
        eVar.u(aVar.f2154e);
        eVar.m(aVar.f2155f);
        eVar.a(aVar.f2157h);
        eVar.i(aVar.f2156g);
        aVar.f2159j = b.a.f2148k;
        return aVar.f2158i;
    }

    private void b(d dVar, i iVar) {
        this.B0.b(this.B0.a(dVar), iVar, 0, 5);
    }

    private void d(e eVar) {
        int i2 = this.E0 + 1;
        c[] cVarArr = this.H0;
        if (i2 >= cVarArr.length) {
            this.H0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.H0[this.E0] = new c(eVar, 0, f0());
        this.E0++;
    }

    private void e(e eVar) {
        int i2 = this.F0 + 1;
        c[] cVarArr = this.G0;
        if (i2 >= cVarArr.length) {
            this.G0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.G0[this.F0] = new c(eVar, 1, f0());
        this.F0++;
    }

    private void i0() {
        this.E0 = 0;
        this.F0 = 0;
    }

    public void A(int i2) {
        this.x0 = i2;
    }

    @Override // c.f.a.m.e, c.f.a.m.l
    public void U() {
        this.B0.f();
        this.C0 = 0;
        this.D0 = 0;
        super.U();
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x032d  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // c.f.a.m.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void X() {
        /*
        // Method dump skipped, instructions count: 844
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.m.f.X():void");
    }

    public b.AbstractC0041b Z() {
        return this.y0;
    }

    public long a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.C0 = i9;
        this.D0 = i10;
        return this.v0.a(this, i2, i9, i10, i3, i4, i5, i6, i7, i8);
    }

    public void a(d dVar) {
        WeakReference<d> weakReference = this.O0;
        if (weakReference == null || weakReference.get() == null || dVar.b() > this.O0.get().b()) {
            this.O0 = new WeakReference<>(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(e eVar, int i2) {
        if (i2 == 0) {
            d(eVar);
        } else if (i2 == 1) {
            e(eVar);
        }
    }

    public void a(b.AbstractC0041b bVar) {
        this.y0 = bVar;
        this.w0.a(bVar);
    }

    @Override // c.f.a.m.e
    public void a(boolean z, boolean z2) {
        super.a(z, z2);
        int size = this.u0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.u0.get(i2).a(z, z2);
        }
    }

    public boolean a(d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean y = y(64);
        b(dVar, y);
        int size = this.u0.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = this.u0.get(i2);
            eVar.b(dVar, y);
            if (eVar.H()) {
                z = true;
            }
        }
        return z;
    }

    public boolean a(boolean z, int i2) {
        return this.w0.a(z, i2);
    }

    public int a0() {
        return this.I0;
    }

    public void b(d dVar) {
        WeakReference<d> weakReference = this.M0;
        if (weakReference == null || weakReference.get() == null || dVar.b() > this.M0.get().b()) {
            this.M0 = new WeakReference<>(dVar);
        }
    }

    public boolean b(d dVar) {
        boolean y = y(64);
        a(dVar, y);
        int size = this.u0.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = this.u0.get(i2);
            eVar.a(0, false);
            eVar.a(1, false);
            if (eVar instanceof a) {
                z = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                e eVar2 = this.u0.get(i3);
                if (eVar2 instanceof a) {
                    ((a) eVar2).b0();
                }
            }
        }
        this.P0.clear();
        for (int i4 = 0; i4 < size; i4++) {
            e eVar3 = this.u0.get(i4);
            if (eVar3.b()) {
                if (eVar3 instanceof k) {
                    this.P0.add(eVar3);
                } else {
                    eVar3.a(dVar, y);
                }
            }
        }
        while (this.P0.size() > 0) {
            int size2 = this.P0.size();
            Iterator<e> it = this.P0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k kVar = (k) it.next();
                if (kVar.a(this.P0)) {
                    kVar.a(dVar, y);
                    this.P0.remove(kVar);
                    break;
                }
            }
            if (size2 == this.P0.size()) {
                Iterator<e> it2 = this.P0.iterator();
                while (it2.hasNext()) {
                    it2.next().a(dVar, y);
                }
                this.P0.clear();
            }
        }
        if (d.r) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i5 = 0; i5 < size; i5++) {
                e eVar4 = this.u0.get(i5);
                if (!eVar4.b()) {
                    hashSet.add(eVar4);
                }
            }
            a(this, dVar, hashSet, n() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<e> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                e next = it3.next();
                j.a(this, dVar, next);
                next.a(dVar, y);
            }
        } else {
            for (int i6 = 0; i6 < size; i6++) {
                e eVar5 = this.u0.get(i6);
                if (eVar5 instanceof f) {
                    e.b[] bVarArr = eVar5.V;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    if (bVar == e.b.WRAP_CONTENT) {
                        eVar5.a(e.b.FIXED);
                    }
                    if (bVar2 == e.b.WRAP_CONTENT) {
                        eVar5.b(e.b.FIXED);
                    }
                    eVar5.a(dVar, y);
                    if (bVar == e.b.WRAP_CONTENT) {
                        eVar5.a(bVar);
                    }
                    if (bVar2 == e.b.WRAP_CONTENT) {
                        eVar5.b(bVar2);
                    }
                } else {
                    j.a(this, dVar, eVar5);
                    if (!eVar5.b()) {
                        eVar5.a(dVar, y);
                    }
                }
            }
        }
        if (this.E0 > 0) {
            b.a(this, dVar, null, 0);
        }
        if (this.F0 > 0) {
            b.a(this, dVar, null, 1);
        }
        return true;
    }

    public d b0() {
        return this.B0;
    }

    /* access modifiers changed from: package-private */
    public void c(d dVar) {
        WeakReference<d> weakReference = this.N0;
        if (weakReference == null || weakReference.get() == null || dVar.b() > this.N0.get().b()) {
            this.N0 = new WeakReference<>(dVar);
        }
    }

    public void c0() {
        this.w0.b();
    }

    /* access modifiers changed from: package-private */
    public void d(d dVar) {
        WeakReference<d> weakReference = this.L0;
        if (weakReference == null || weakReference.get() == null || dVar.b() > this.L0.get().b()) {
            this.L0 = new WeakReference<>(dVar);
        }
    }

    public void d0() {
        this.w0.c();
    }

    public boolean e(boolean z) {
        return this.w0.a(z);
    }

    public boolean e0() {
        return this.K0;
    }

    public boolean f(boolean z) {
        return this.w0.b(z);
    }

    public boolean f0() {
        return this.z0;
    }

    public void g(boolean z) {
        this.z0 = z;
    }

    public boolean g0() {
        return this.J0;
    }

    public void h0() {
        this.v0.a(this);
    }

    public boolean y(int i2) {
        return (this.I0 & i2) == i2;
    }

    public void z(int i2) {
        this.I0 = i2;
        d.r = y(512);
    }
}
