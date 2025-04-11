package e.b.b.a.c.e;

public final class f implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private static final g f7240e = new g();

    /* renamed from: b  reason: collision with root package name */
    private int[] f7241b;

    /* renamed from: c  reason: collision with root package name */
    private g[] f7242c;

    /* renamed from: d  reason: collision with root package name */
    private int f7243d;

    f() {
        this(10);
    }

    private f(int i2) {
        int c2 = c(i2);
        this.f7241b = new int[c2];
        this.f7242c = new g[c2];
        this.f7243d = 0;
    }

    private static int c(int i2) {
        int i3 = i2 << 2;
        int i4 = 4;
        while (true) {
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (i3 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        return i3 / 4;
    }

    private final int d(int i2) {
        int i3 = this.f7243d - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = this.f7241b[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* access modifiers changed from: package-private */
    public final g a(int i2) {
        int d2 = d(i2);
        if (d2 < 0) {
            return null;
        }
        g[] gVarArr = this.f7242c;
        if (gVarArr[d2] == f7240e) {
            return null;
        }
        return gVarArr[d2];
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, g gVar) {
        int d2 = d(i2);
        if (d2 >= 0) {
            this.f7242c[d2] = gVar;
            return;
        }
        int i3 = ~d2;
        if (i3 < this.f7243d) {
            g[] gVarArr = this.f7242c;
            if (gVarArr[i3] == f7240e) {
                this.f7241b[i3] = i2;
                gVarArr[i3] = gVar;
                return;
            }
        }
        int i4 = this.f7243d;
        if (i4 >= this.f7241b.length) {
            int c2 = c(i4 + 1);
            int[] iArr = new int[c2];
            g[] gVarArr2 = new g[c2];
            int[] iArr2 = this.f7241b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            g[] gVarArr3 = this.f7242c;
            System.arraycopy(gVarArr3, 0, gVarArr2, 0, gVarArr3.length);
            this.f7241b = iArr;
            this.f7242c = gVarArr2;
        }
        int i5 = this.f7243d;
        if (i5 - i3 != 0) {
            int[] iArr3 = this.f7241b;
            int i6 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i6, i5 - i3);
            g[] gVarArr4 = this.f7242c;
            System.arraycopy(gVarArr4, i3, gVarArr4, i6, this.f7243d - i3);
        }
        this.f7241b[i3] = i2;
        this.f7242c[i3] = gVar;
        this.f7243d++;
    }

    public final boolean a() {
        return this.f7243d == 0;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.f7243d;
    }

    /* access modifiers changed from: package-private */
    public final g b(int i2) {
        return this.f7242c[i2];
    }

    @Override // java.lang.Object
    public final /* synthetic */ Object clone() {
        int i2 = this.f7243d;
        f fVar = new f(i2);
        System.arraycopy(this.f7241b, 0, fVar.f7241b, 0, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            g[] gVarArr = this.f7242c;
            if (gVarArr[i3] != null) {
                fVar.f7242c[i3] = (g) gVarArr[i3].clone();
            }
        }
        fVar.f7243d = i2;
        return fVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        int i2 = this.f7243d;
        if (i2 != fVar.f7243d) {
            return false;
        }
        int[] iArr = this.f7241b;
        int[] iArr2 = fVar.f7241b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                z = true;
                break;
            } else if (iArr[i3] != iArr2[i3]) {
                z = false;
                break;
            } else {
                i3++;
            }
        }
        if (z) {
            g[] gVarArr = this.f7242c;
            g[] gVarArr2 = fVar.f7242c;
            int i4 = this.f7243d;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    z2 = true;
                    break;
                } else if (!gVarArr[i5].equals(gVarArr2[i5])) {
                    z2 = false;
                    break;
                } else {
                    i5++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = 17;
        for (int i3 = 0; i3 < this.f7243d; i3++) {
            i2 = (((i2 * 31) + this.f7241b[i3]) * 31) + this.f7242c[i3].hashCode();
        }
        return i2;
    }
}
