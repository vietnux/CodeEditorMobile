package j;

/* access modifiers changed from: package-private */
public final class o {
    final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    int f9505b;

    /* renamed from: c  reason: collision with root package name */
    int f9506c;

    /* renamed from: d  reason: collision with root package name */
    boolean f9507d;

    /* renamed from: e  reason: collision with root package name */
    boolean f9508e;

    /* renamed from: f  reason: collision with root package name */
    o f9509f;

    /* renamed from: g  reason: collision with root package name */
    o f9510g;

    o() {
        this.a = new byte[8192];
        this.f9508e = true;
        this.f9507d = false;
    }

    o(byte[] bArr, int i2, int i3, boolean z, boolean z2) {
        this.a = bArr;
        this.f9505b = i2;
        this.f9506c = i3;
        this.f9507d = z;
        this.f9508e = z2;
    }

    public o a(int i2) {
        o oVar;
        if (i2 <= 0 || i2 > this.f9506c - this.f9505b) {
            throw new IllegalArgumentException();
        }
        if (i2 >= 1024) {
            oVar = c();
        } else {
            oVar = p.a();
            System.arraycopy(this.a, this.f9505b, oVar.a, 0, i2);
        }
        oVar.f9506c = oVar.f9505b + i2;
        this.f9505b += i2;
        this.f9510g.a(oVar);
        return oVar;
    }

    public o a(o oVar) {
        oVar.f9510g = this;
        oVar.f9509f = this.f9509f;
        this.f9509f.f9510g = oVar;
        this.f9509f = oVar;
        return oVar;
    }

    public void a() {
        o oVar = this.f9510g;
        if (oVar == this) {
            throw new IllegalStateException();
        } else if (oVar.f9508e) {
            int i2 = this.f9506c - this.f9505b;
            if (i2 <= (8192 - oVar.f9506c) + (oVar.f9507d ? 0 : oVar.f9505b)) {
                a(this.f9510g, i2);
                b();
                p.a(this);
            }
        }
    }

    public void a(o oVar, int i2) {
        if (oVar.f9508e) {
            int i3 = oVar.f9506c;
            if (i3 + i2 > 8192) {
                if (!oVar.f9507d) {
                    int i4 = oVar.f9505b;
                    if ((i3 + i2) - i4 <= 8192) {
                        byte[] bArr = oVar.a;
                        System.arraycopy(bArr, i4, bArr, 0, i3 - i4);
                        oVar.f9506c -= oVar.f9505b;
                        oVar.f9505b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.a, this.f9505b, oVar.a, oVar.f9506c, i2);
            oVar.f9506c += i2;
            this.f9505b += i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public o b() {
        o oVar = this.f9509f;
        if (oVar == this) {
            oVar = null;
        }
        o oVar2 = this.f9510g;
        oVar2.f9509f = this.f9509f;
        this.f9509f.f9510g = oVar2;
        this.f9509f = null;
        this.f9510g = null;
        return oVar;
    }

    /* access modifiers changed from: package-private */
    public o c() {
        this.f9507d = true;
        return new o(this.a, this.f9505b, this.f9506c, true, false);
    }
}
