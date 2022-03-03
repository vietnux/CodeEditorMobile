package com.google.android.gms.internal.ads;

public final class ev implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private static final fv f4234e = new fv();

    /* renamed from: b  reason: collision with root package name */
    private int[] f4235b;

    /* renamed from: c  reason: collision with root package name */
    private fv[] f4236c;

    /* renamed from: d  reason: collision with root package name */
    private int f4237d;

    ev() {
        this(10);
    }

    private ev(int i2) {
        int c2 = c(i2);
        this.f4235b = new int[c2];
        this.f4236c = new fv[c2];
        this.f4237d = 0;
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
        int i3 = this.f4237d - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = this.f4235b[i5];
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
    public final int a() {
        return this.f4237d;
    }

    /* access modifiers changed from: package-private */
    public final fv a(int i2) {
        int d2 = d(i2);
        if (d2 < 0) {
            return null;
        }
        fv[] fvVarArr = this.f4236c;
        if (fvVarArr[d2] == f4234e) {
            return null;
        }
        return fvVarArr[d2];
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, fv fvVar) {
        int d2 = d(i2);
        if (d2 >= 0) {
            this.f4236c[d2] = fvVar;
            return;
        }
        int i3 = ~d2;
        if (i3 < this.f4237d) {
            fv[] fvVarArr = this.f4236c;
            if (fvVarArr[i3] == f4234e) {
                this.f4235b[i3] = i2;
                fvVarArr[i3] = fvVar;
                return;
            }
        }
        int i4 = this.f4237d;
        if (i4 >= this.f4235b.length) {
            int c2 = c(i4 + 1);
            int[] iArr = new int[c2];
            fv[] fvVarArr2 = new fv[c2];
            int[] iArr2 = this.f4235b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            fv[] fvVarArr3 = this.f4236c;
            System.arraycopy(fvVarArr3, 0, fvVarArr2, 0, fvVarArr3.length);
            this.f4235b = iArr;
            this.f4236c = fvVarArr2;
        }
        int i5 = this.f4237d;
        if (i5 - i3 != 0) {
            int[] iArr3 = this.f4235b;
            int i6 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i6, i5 - i3);
            fv[] fvVarArr4 = this.f4236c;
            System.arraycopy(fvVarArr4, i3, fvVarArr4, i6, this.f4237d - i3);
        }
        this.f4235b[i3] = i2;
        this.f4236c[i3] = fvVar;
        this.f4237d++;
    }

    /* access modifiers changed from: package-private */
    public final fv b(int i2) {
        return this.f4236c[i2];
    }

    @Override // java.lang.Object
    public final /* synthetic */ Object clone() {
        int i2 = this.f4237d;
        ev evVar = new ev(i2);
        System.arraycopy(this.f4235b, 0, evVar.f4235b, 0, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            fv[] fvVarArr = this.f4236c;
            if (fvVarArr[i3] != null) {
                evVar.f4236c[i3] = (fv) fvVarArr[i3].clone();
            }
        }
        evVar.f4237d = i2;
        return evVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ev)) {
            return false;
        }
        ev evVar = (ev) obj;
        int i2 = this.f4237d;
        if (i2 != evVar.f4237d) {
            return false;
        }
        int[] iArr = this.f4235b;
        int[] iArr2 = evVar.f4235b;
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
            fv[] fvVarArr = this.f4236c;
            fv[] fvVarArr2 = evVar.f4236c;
            int i4 = this.f4237d;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    z2 = true;
                    break;
                } else if (!fvVarArr[i5].equals(fvVarArr2[i5])) {
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
        for (int i3 = 0; i3 < this.f4237d; i3++) {
            i2 = (((i2 * 31) + this.f4235b[i3]) * 31) + this.f4236c[i3].hashCode();
        }
        return i2;
    }
}
