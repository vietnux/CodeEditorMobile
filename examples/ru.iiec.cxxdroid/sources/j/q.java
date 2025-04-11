package j;

import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class q extends f {

    /* renamed from: g  reason: collision with root package name */
    final transient byte[][] f9512g;

    /* renamed from: h  reason: collision with root package name */
    final transient int[] f9513h;

    q(c cVar, int i2) {
        super(null);
        u.a(cVar.f9474c, 0, (long) i2);
        int i3 = 0;
        o oVar = cVar.f9473b;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = oVar.f9506c;
            int i7 = oVar.f9505b;
            if (i6 != i7) {
                i4 += i6 - i7;
                i5++;
                oVar = oVar.f9509f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f9512g = new byte[i5][];
        this.f9513h = new int[(i5 * 2)];
        o oVar2 = cVar.f9473b;
        int i8 = 0;
        while (i3 < i2) {
            this.f9512g[i8] = oVar2.a;
            i3 += oVar2.f9506c - oVar2.f9505b;
            if (i3 > i2) {
                i3 = i2;
            }
            int[] iArr = this.f9513h;
            iArr[i8] = i3;
            iArr[this.f9512g.length + i8] = oVar2.f9505b;
            oVar2.f9507d = true;
            i8++;
            oVar2 = oVar2.f9509f;
        }
    }

    private int b(int i2) {
        int binarySearch = Arrays.binarySearch(this.f9513h, 0, this.f9512g.length, i2 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    private f q() {
        return new f(o());
    }

    @Override // j.f
    public byte a(int i2) {
        u.a((long) this.f9513h[this.f9512g.length - 1], (long) i2, 1);
        int b2 = b(i2);
        int i3 = b2 == 0 ? 0 : this.f9513h[b2 - 1];
        int[] iArr = this.f9513h;
        byte[][] bArr = this.f9512g;
        return bArr[b2][(i2 - i3) + iArr[bArr.length + b2]];
    }

    @Override // j.f
    public f a(int i2, int i3) {
        return q().a(i2, i3);
    }

    /* access modifiers changed from: package-private */
    @Override // j.f
    public void a(c cVar) {
        int length = this.f9512g.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr = this.f9513h;
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            o oVar = new o(this.f9512g[i2], i4, (i4 + i5) - i3, true, false);
            o oVar2 = cVar.f9473b;
            if (oVar2 == null) {
                oVar.f9510g = oVar;
                oVar.f9509f = oVar;
                cVar.f9473b = oVar;
            } else {
                oVar2.f9510g.a(oVar);
            }
            i2++;
            i3 = i5;
        }
        cVar.f9474c += (long) i3;
    }

    @Override // j.f
    public boolean a(int i2, f fVar, int i3, int i4) {
        if (i2 < 0 || i2 > m() - i4) {
            return false;
        }
        int b2 = b(i2);
        while (i4 > 0) {
            int i5 = b2 == 0 ? 0 : this.f9513h[b2 - 1];
            int min = Math.min(i4, ((this.f9513h[b2] - i5) + i5) - i2);
            int[] iArr = this.f9513h;
            byte[][] bArr = this.f9512g;
            if (!fVar.a(i3, bArr[b2], (i2 - i5) + iArr[bArr.length + b2], min)) {
                return false;
            }
            i2 += min;
            i3 += min;
            i4 -= min;
            b2++;
        }
        return true;
    }

    @Override // j.f
    public boolean a(int i2, byte[] bArr, int i3, int i4) {
        if (i2 < 0 || i2 > m() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int b2 = b(i2);
        while (i4 > 0) {
            int i5 = b2 == 0 ? 0 : this.f9513h[b2 - 1];
            int min = Math.min(i4, ((this.f9513h[b2] - i5) + i5) - i2);
            int[] iArr = this.f9513h;
            byte[][] bArr2 = this.f9512g;
            if (!u.a(bArr2[b2], (i2 - i5) + iArr[bArr2.length + b2], bArr, i3, min)) {
                return false;
            }
            i2 += min;
            i3 += min;
            i4 -= min;
            b2++;
        }
        return true;
    }

    @Override // j.f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return fVar.m() == m() && a(0, fVar, 0, m());
        }
    }

    @Override // j.f
    public String h() {
        return q().h();
    }

    @Override // j.f
    public int hashCode() {
        int i2 = this.f9479c;
        if (i2 != 0) {
            return i2;
        }
        int length = this.f9512g.length;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i3 < length) {
            byte[] bArr = this.f9512g[i3];
            int[] iArr = this.f9513h;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            int i8 = (i7 - i5) + i6;
            while (i6 < i8) {
                i4 = (i4 * 31) + bArr[i6];
                i6++;
            }
            i3++;
            i5 = i7;
        }
        this.f9479c = i4;
        return i4;
    }

    @Override // j.f
    public String i() {
        return q().i();
    }

    @Override // j.f
    public f j() {
        return q().j();
    }

    @Override // j.f
    public f k() {
        return q().k();
    }

    @Override // j.f
    public f l() {
        return q().l();
    }

    @Override // j.f
    public int m() {
        return this.f9513h[this.f9512g.length - 1];
    }

    @Override // j.f
    public f n() {
        return q().n();
    }

    @Override // j.f
    public byte[] o() {
        int[] iArr = this.f9513h;
        byte[][] bArr = this.f9512g;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr2 = this.f9513h;
            int i4 = iArr2[length + i2];
            int i5 = iArr2[i2];
            System.arraycopy(this.f9512g[i2], i4, bArr2, i3, i5 - i3);
            i2++;
            i3 = i5;
        }
        return bArr2;
    }

    @Override // j.f
    public String p() {
        return q().p();
    }

    @Override // j.f
    public String toString() {
        return q().toString();
    }
}
