package e.b.b.a.c.c;

public final class f implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private static final g f7118e = new g();

    /* renamed from: b  reason: collision with root package name */
    private int[] f7119b;

    /* renamed from: c  reason: collision with root package name */
    private g[] f7120c;

    /* renamed from: d  reason: collision with root package name */
    private int f7121d;

    f() {
        this(10);
    }

    private f(int i2) {
        int b2 = b(i2);
        this.f7119b = new int[b2];
        this.f7120c = new g[b2];
        this.f7121d = 0;
    }

    private static int b(int i2) {
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

    private final int c(int i2) {
        int i3 = this.f7121d - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = this.f7119b[i5];
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
        int c2 = c(i2);
        if (c2 < 0) {
            return null;
        }
        g[] gVarArr = this.f7120c;
        if (gVarArr[c2] == f7118e) {
            return null;
        }
        return gVarArr[c2];
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, g gVar) {
        int c2 = c(i2);
        if (c2 >= 0) {
            this.f7120c[c2] = gVar;
            return;
        }
        int i3 = ~c2;
        if (i3 < this.f7121d) {
            g[] gVarArr = this.f7120c;
            if (gVarArr[i3] == f7118e) {
                this.f7119b[i3] = i2;
                gVarArr[i3] = gVar;
                return;
            }
        }
        int i4 = this.f7121d;
        if (i4 >= this.f7119b.length) {
            int b2 = b(i4 + 1);
            int[] iArr = new int[b2];
            g[] gVarArr2 = new g[b2];
            int[] iArr2 = this.f7119b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            g[] gVarArr3 = this.f7120c;
            System.arraycopy(gVarArr3, 0, gVarArr2, 0, gVarArr3.length);
            this.f7119b = iArr;
            this.f7120c = gVarArr2;
        }
        int i5 = this.f7121d;
        if (i5 - i3 != 0) {
            int[] iArr3 = this.f7119b;
            int i6 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i6, i5 - i3);
            g[] gVarArr4 = this.f7120c;
            System.arraycopy(gVarArr4, i3, gVarArr4, i6, this.f7121d - i3);
        }
        this.f7119b[i3] = i2;
        this.f7120c[i3] = gVar;
        this.f7121d++;
    }

    @Override // java.lang.Object
    public final /* synthetic */ Object clone() {
        int i2 = this.f7121d;
        f fVar = new f(i2);
        System.arraycopy(this.f7119b, 0, fVar.f7119b, 0, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            g[] gVarArr = this.f7120c;
            if (gVarArr[i3] != null) {
                fVar.f7120c[i3] = (g) gVarArr[i3].clone();
            }
        }
        fVar.f7121d = i2;
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
        int i2 = this.f7121d;
        if (i2 != fVar.f7121d) {
            return false;
        }
        int[] iArr = this.f7119b;
        int[] iArr2 = fVar.f7119b;
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
            g[] gVarArr = this.f7120c;
            g[] gVarArr2 = fVar.f7120c;
            int i4 = this.f7121d;
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
        for (int i3 = 0; i3 < this.f7121d; i3++) {
            i2 = (((i2 * 31) + this.f7119b[i3]) * 31) + this.f7120c[i3].hashCode();
        }
        return i2;
    }
}
