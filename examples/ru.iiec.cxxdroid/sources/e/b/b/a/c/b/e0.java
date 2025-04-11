package e.b.b.a.c.b;

public final class e0 implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private static final f0 f7040e = new f0();

    /* renamed from: b  reason: collision with root package name */
    private int[] f7041b;

    /* renamed from: c  reason: collision with root package name */
    private f0[] f7042c;

    /* renamed from: d  reason: collision with root package name */
    private int f7043d;

    e0() {
        this(10);
    }

    private e0(int i2) {
        int c2 = c(i2);
        this.f7041b = new int[c2];
        this.f7042c = new f0[c2];
        this.f7043d = 0;
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
        int i3 = this.f7043d - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = this.f7041b[i5];
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
    public final f0 a(int i2) {
        int d2 = d(i2);
        if (d2 < 0) {
            return null;
        }
        f0[] f0VarArr = this.f7042c;
        if (f0VarArr[d2] == f7040e) {
            return null;
        }
        return f0VarArr[d2];
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, f0 f0Var) {
        int d2 = d(i2);
        if (d2 >= 0) {
            this.f7042c[d2] = f0Var;
            return;
        }
        int i3 = ~d2;
        if (i3 < this.f7043d) {
            f0[] f0VarArr = this.f7042c;
            if (f0VarArr[i3] == f7040e) {
                this.f7041b[i3] = i2;
                f0VarArr[i3] = f0Var;
                return;
            }
        }
        int i4 = this.f7043d;
        if (i4 >= this.f7041b.length) {
            int c2 = c(i4 + 1);
            int[] iArr = new int[c2];
            f0[] f0VarArr2 = new f0[c2];
            int[] iArr2 = this.f7041b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            f0[] f0VarArr3 = this.f7042c;
            System.arraycopy(f0VarArr3, 0, f0VarArr2, 0, f0VarArr3.length);
            this.f7041b = iArr;
            this.f7042c = f0VarArr2;
        }
        int i5 = this.f7043d;
        if (i5 - i3 != 0) {
            int[] iArr3 = this.f7041b;
            int i6 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i6, i5 - i3);
            f0[] f0VarArr4 = this.f7042c;
            System.arraycopy(f0VarArr4, i3, f0VarArr4, i6, this.f7043d - i3);
        }
        this.f7041b[i3] = i2;
        this.f7042c[i3] = f0Var;
        this.f7043d++;
    }

    public final boolean a() {
        return this.f7043d == 0;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.f7043d;
    }

    /* access modifiers changed from: package-private */
    public final f0 b(int i2) {
        return this.f7042c[i2];
    }

    @Override // java.lang.Object
    public final /* synthetic */ Object clone() {
        int i2 = this.f7043d;
        e0 e0Var = new e0(i2);
        System.arraycopy(this.f7041b, 0, e0Var.f7041b, 0, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            f0[] f0VarArr = this.f7042c;
            if (f0VarArr[i3] != null) {
                e0Var.f7042c[i3] = (f0) f0VarArr[i3].clone();
            }
        }
        e0Var.f7043d = i2;
        return e0Var;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        int i2 = this.f7043d;
        if (i2 != e0Var.f7043d) {
            return false;
        }
        int[] iArr = this.f7041b;
        int[] iArr2 = e0Var.f7041b;
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
            f0[] f0VarArr = this.f7042c;
            f0[] f0VarArr2 = e0Var.f7042c;
            int i4 = this.f7043d;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    z2 = true;
                    break;
                } else if (!f0VarArr[i5].equals(f0VarArr2[i5])) {
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
        for (int i3 = 0; i3 < this.f7043d; i3++) {
            i2 = (((i2 * 31) + this.f7041b[i3]) * 31) + this.f7042c[i3].hashCode();
        }
        return i2;
    }
}
