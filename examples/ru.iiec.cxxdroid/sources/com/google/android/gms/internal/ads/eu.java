package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;
import java.util.Arrays;

public final class eu {

    /* renamed from: f  reason: collision with root package name */
    private static final eu f4229f = new eu(0, new int[0], new Object[0], false);
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f4230b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f4231c;

    /* renamed from: d  reason: collision with root package name */
    private int f4232d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4233e;

    private eu() {
        this(0, new int[8], new Object[8], true);
    }

    private eu(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f4232d = -1;
        this.a = i2;
        this.f4230b = iArr;
        this.f4231c = objArr;
        this.f4233e = z;
    }

    static eu a(eu euVar, eu euVar2) {
        int i2 = euVar.a + euVar2.a;
        int[] copyOf = Arrays.copyOf(euVar.f4230b, i2);
        System.arraycopy(euVar2.f4230b, 0, copyOf, euVar.a, euVar2.a);
        Object[] copyOf2 = Arrays.copyOf(euVar.f4231c, i2);
        System.arraycopy(euVar2.f4231c, 0, copyOf2, euVar.a, euVar2.a);
        return new eu(i2, copyOf, copyOf2, true);
    }

    private static void a(int i2, Object obj, xu xuVar) {
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            xuVar.d(i3, ((Long) obj).longValue());
        } else if (i4 == 1) {
            xuVar.c(i3, ((Long) obj).longValue());
        } else if (i4 == 2) {
            xuVar.a(i3, (fq) obj);
        } else if (i4 != 3) {
            if (i4 == 5) {
                xuVar.e(i3, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(sr.g());
        } else if (xuVar.a() == mr.e.f4986k) {
            xuVar.b(i3);
            ((eu) obj).b(xuVar);
            xuVar.a(i3);
        } else {
            xuVar.a(i3);
            ((eu) obj).b(xuVar);
            xuVar.b(i3);
        }
    }

    public static eu d() {
        return f4229f;
    }

    static eu e() {
        return new eu();
    }

    public final void a() {
        this.f4233e = false;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, Object obj) {
        if (this.f4233e) {
            int i3 = this.a;
            if (i3 == this.f4230b.length) {
                int i4 = this.a + (i3 < 4 ? 8 : i3 >> 1);
                this.f4230b = Arrays.copyOf(this.f4230b, i4);
                this.f4231c = Arrays.copyOf(this.f4231c, i4);
            }
            int[] iArr = this.f4230b;
            int i5 = this.a;
            iArr[i5] = i2;
            this.f4231c[i5] = obj;
            this.a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public final void a(xu xuVar) {
        if (xuVar.a() == mr.e.f4987l) {
            for (int i2 = this.a - 1; i2 >= 0; i2--) {
                xuVar.a(this.f4230b[i2] >>> 3, this.f4231c[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.a; i3++) {
            xuVar.a(this.f4230b[i3] >>> 3, this.f4231c[i3]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.a; i3++) {
            vs.a(sb, i2, String.valueOf(this.f4230b[i3] >>> 3), this.f4231c[i3]);
        }
    }

    public final int b() {
        int i2;
        int i3 = this.f4232d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.a; i5++) {
            int i6 = this.f4230b[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 == 0) {
                i2 = sq.e(i7, ((Long) this.f4231c[i5]).longValue());
            } else if (i8 == 1) {
                i2 = sq.g(i7, ((Long) this.f4231c[i5]).longValue());
            } else if (i8 == 2) {
                i2 = sq.c(i7, (fq) this.f4231c[i5]);
            } else if (i8 == 3) {
                i2 = (sq.e(i7) << 1) + ((eu) this.f4231c[i5]).b();
            } else if (i8 == 5) {
                i2 = sq.i(i7, ((Integer) this.f4231c[i5]).intValue());
            } else {
                throw new IllegalStateException(sr.g());
            }
            i4 += i2;
        }
        this.f4232d = i4;
        return i4;
    }

    public final void b(xu xuVar) {
        if (this.a != 0) {
            if (xuVar.a() == mr.e.f4986k) {
                for (int i2 = 0; i2 < this.a; i2++) {
                    a(this.f4230b[i2], this.f4231c[i2], xuVar);
                }
                return;
            }
            for (int i3 = this.a - 1; i3 >= 0; i3--) {
                a(this.f4230b[i3], this.f4231c[i3], xuVar);
            }
        }
    }

    public final int c() {
        int i2 = this.f4232d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.a; i4++) {
            i3 += sq.d(this.f4230b[i4] >>> 3, (fq) this.f4231c[i4]);
        }
        this.f4232d = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof eu)) {
            return false;
        }
        eu euVar = (eu) obj;
        int i2 = this.a;
        if (i2 == euVar.a) {
            int[] iArr = this.f4230b;
            int[] iArr2 = euVar.f4230b;
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
                Object[] objArr = this.f4231c;
                Object[] objArr2 = euVar.f4231c;
                int i4 = this.a;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        z2 = true;
                        break;
                    } else if (!objArr[i5].equals(objArr2[i5])) {
                        z2 = false;
                        break;
                    } else {
                        i5++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i2 = this.a;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.f4230b;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        Object[] objArr = this.f4231c;
        int i8 = this.a;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }
}
