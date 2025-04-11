package e.b.b.a.c.b;

public final class s extends c0<s> {

    /* renamed from: c  reason: collision with root package name */
    public v[] f7074c = v.d();

    /* renamed from: d  reason: collision with root package name */
    public long f7075d = 0;

    /* renamed from: e  reason: collision with root package name */
    public byte[][] f7076e = l0.a;

    public s() {
        this.f7030b = null;
        this.a = -1;
    }

    @Override // e.b.b.a.c.b.i0
    public final /* synthetic */ i0 a(y yVar) {
        while (true) {
            int d2 = yVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 == 10) {
                int a = l0.a(yVar, 10);
                v[] vVarArr = this.f7074c;
                int length = vVarArr == null ? 0 : vVarArr.length;
                v[] vVarArr2 = new v[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f7074c, 0, vVarArr2, 0, length);
                }
                while (length < vVarArr2.length - 1) {
                    vVarArr2[length] = new v();
                    yVar.a(vVarArr2[length]);
                    yVar.d();
                    length++;
                }
                vVarArr2[length] = new v();
                yVar.a(vVarArr2[length]);
                this.f7074c = vVarArr2;
            } else if (d2 == 17) {
                this.f7075d = yVar.f();
            } else if (d2 == 26) {
                int a2 = l0.a(yVar, 26);
                byte[][] bArr = this.f7076e;
                int length2 = bArr == null ? 0 : bArr.length;
                byte[][] bArr2 = new byte[(a2 + length2)][];
                if (length2 != 0) {
                    System.arraycopy(this.f7076e, 0, bArr2, 0, length2);
                }
                while (length2 < bArr2.length - 1) {
                    bArr2[length2] = yVar.b();
                    yVar.d();
                    length2++;
                }
                bArr2[length2] = yVar.b();
                this.f7076e = bArr2;
            } else if (!super.a(yVar, d2)) {
                return this;
            }
        }
    }

    @Override // e.b.b.a.c.b.c0, e.b.b.a.c.b.i0
    public final void a(z zVar) {
        v[] vVarArr = this.f7074c;
        int i2 = 0;
        if (vVarArr != null && vVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                v[] vVarArr2 = this.f7074c;
                if (i3 >= vVarArr2.length) {
                    break;
                }
                v vVar = vVarArr2[i3];
                if (vVar != null) {
                    zVar.a(1, vVar);
                }
                i3++;
            }
        }
        long j2 = this.f7075d;
        if (j2 != 0) {
            zVar.a(2, j2);
        }
        byte[][] bArr = this.f7076e;
        if (bArr != null && bArr.length > 0) {
            while (true) {
                byte[][] bArr2 = this.f7076e;
                if (i2 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i2];
                if (bArr3 != null) {
                    zVar.a(3, bArr3);
                }
                i2++;
            }
        }
        super.a(zVar);
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.b.c0, e.b.b.a.c.b.i0
    public final int c() {
        int c2 = super.c();
        v[] vVarArr = this.f7074c;
        int i2 = 0;
        if (vVarArr != null && vVarArr.length > 0) {
            int i3 = c2;
            int i4 = 0;
            while (true) {
                v[] vVarArr2 = this.f7074c;
                if (i4 >= vVarArr2.length) {
                    break;
                }
                v vVar = vVarArr2[i4];
                if (vVar != null) {
                    i3 += z.b(1, vVar);
                }
                i4++;
            }
            c2 = i3;
        }
        if (this.f7075d != 0) {
            c2 += z.d(2) + 8;
        }
        byte[][] bArr = this.f7076e;
        if (bArr == null || bArr.length <= 0) {
            return c2;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[][] bArr2 = this.f7076e;
            if (i2 >= bArr2.length) {
                return c2 + i5 + (i6 * 1);
            }
            byte[] bArr3 = bArr2[i2];
            if (bArr3 != null) {
                i6++;
                i5 += z.c(bArr3);
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (!g0.a(this.f7074c, sVar.f7074c) || this.f7075d != sVar.f7075d || !g0.a(this.f7076e, sVar.f7076e)) {
            return false;
        }
        e0 e0Var = this.f7030b;
        if (e0Var != null && !e0Var.a()) {
            return this.f7030b.equals(sVar.f7030b);
        }
        e0 e0Var2 = sVar.f7030b;
        return e0Var2 == null || e0Var2.a();
    }

    public final int hashCode() {
        long j2 = this.f7075d;
        int hashCode = (((((((s.class.getName().hashCode() + 527) * 31) + g0.a(this.f7074c)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + g0.a(this.f7076e)) * 31;
        e0 e0Var = this.f7030b;
        return hashCode + ((e0Var == null || e0Var.a()) ? 0 : this.f7030b.hashCode());
    }
}
