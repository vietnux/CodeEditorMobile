package iiec.androidterm.r;

import android.util.Log;
import iiec.androidterm.r.t.a;
import iiec.androidterm.r.t.b;

/* access modifiers changed from: package-private */
public class r {
    private Object[] a;

    /* renamed from: b  reason: collision with root package name */
    private k[] f9435b;

    /* renamed from: c  reason: collision with root package name */
    private boolean[] f9436c;

    /* renamed from: d  reason: collision with root package name */
    private int f9437d;

    /* renamed from: e  reason: collision with root package name */
    private int f9438e;

    /* renamed from: f  reason: collision with root package name */
    private int f9439f;

    /* renamed from: g  reason: collision with root package name */
    private int f9440g = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f9441h = 0;

    /* renamed from: i  reason: collision with root package name */
    private int f9442i = 0;

    /* renamed from: j  reason: collision with root package name */
    private char[] f9443j;

    /* renamed from: k  reason: collision with root package name */
    private k f9444k;

    public r(int i2, int i3, int i4, int i5) {
        this.f9439f = i2;
        this.f9437d = i3;
        this.f9438e = i4;
        this.a = new Object[i3];
        this.f9435b = new k[i3];
        this.f9436c = new boolean[i3];
        this.f9444k = new k(i5, this.f9439f);
        this.f9441h = i5;
    }

    public static int a(char c2, char c3) {
        return g(Character.toCodePoint(c2, c3));
    }

    public static int a(char[] cArr, int i2) {
        char c2 = cArr[i2];
        return Character.isHighSurrogate(c2) ? a(c2, cArr[i2 + 1]) : g(c2);
    }

    private char[] a(int i2, int i3) {
        char[] cArr = new char[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            cArr[i4] = ' ';
        }
        this.a[i2] = cArr;
        k[] kVarArr = this.f9435b;
        if (kVarArr[i2] == null) {
            kVarArr[i2] = new k(0, i3);
        }
        return cArr;
    }

    private char[] a(int i2, int i3, int i4, boolean z) {
        int i5;
        if (i2 < (-this.f9440g) || i2 > this.f9438e - 1) {
            throw new IllegalArgumentException();
        }
        int i6 = this.f9439f;
        int h2 = h(i2);
        Object[] objArr = this.a;
        if (objArr[h2] == null) {
            return null;
        }
        if (!(objArr[h2] instanceof char[])) {
            f fVar = (f) objArr[h2];
            char[] a2 = fVar.a();
            if (i3 == 0 && i4 == i6) {
                int b2 = fVar.b();
                if (b2 < a2.length) {
                    a2[b2] = 0;
                }
                return a2;
            }
            int a3 = fVar.a(i3);
            if (i4 < i6) {
                i5 = fVar.a(i4);
                if (!z && i4 > 0 && i4 < i6 - 1 && i5 == fVar.a(i4 - 1)) {
                    i5 = fVar.a(i4 + 1);
                }
            } else {
                i5 = fVar.b();
            }
            int i7 = i5 - a3;
            char[] cArr = this.f9443j;
            if (cArr == null || cArr.length < i7 + 1) {
                this.f9443j = new char[(i7 + 1)];
            }
            System.arraycopy(a2, a3, this.f9443j, 0, i7);
            char[] cArr2 = this.f9443j;
            cArr2[i7] = 0;
            return cArr2;
        } else if (i3 == 0 && i4 == i6) {
            return (char[]) objArr[h2];
        } else {
            char[] cArr3 = this.f9443j;
            if (cArr3 == null || cArr3.length < i6 + 1) {
                this.f9443j = new char[(i6 + 1)];
            }
            int i8 = i4 - i3;
            System.arraycopy(this.a[h2], i3, this.f9443j, 0, i8);
            char[] cArr4 = this.f9443j;
            cArr4[i8] = 0;
            return cArr4;
        }
    }

    private f b(int i2, int i3) {
        f fVar = new f(i3);
        this.a[i2] = fVar;
        k[] kVarArr = this.f9435b;
        if (kVarArr[i2] == null) {
            kVarArr[i2] = new k(0, i3);
        }
        return fVar;
    }

    private k b(int i2, int i3, int i4, boolean z) {
        if (i2 < (-this.f9440g) || i2 > this.f9438e - 1) {
            throw new IllegalArgumentException();
        }
        int h2 = h(i2);
        k kVar = this.f9435b[h2];
        k kVar2 = this.f9444k;
        if (kVar == null) {
            return null;
        }
        int i5 = this.f9439f;
        if (!z) {
            Object[] objArr = this.a;
            if (objArr[h2] != null && (objArr[h2] instanceof f)) {
                f fVar = (f) objArr[h2];
                if (i3 > 0 && fVar.a(i3 - 1) == fVar.a(i3)) {
                    i3--;
                }
                if (i4 < i5 - 1) {
                    int i6 = i4 + 1;
                    if (fVar.a(i6) == fVar.a(i4)) {
                        i4 = i6;
                    }
                }
            }
        }
        if (i3 == 0 && i4 == i5) {
            return kVar;
        }
        kVar.a(i3, kVar2, 0, i4 - i3);
        return kVar2;
    }

    private void e(int i2, int i3, int i4) {
        int i5 = this.f9437d;
        int i6 = i2 + i4;
        int i7 = i6 >= 0 ? i6 % i5 : i5 + i2 + i4;
        if (i2 + i3 <= i5 && i7 + i3 <= i5) {
            Object[] objArr = this.a;
            System.arraycopy(objArr, i2, objArr, i7, i3);
            k[] kVarArr = this.f9435b;
            System.arraycopy(kVarArr, i2, kVarArr, i7, i3);
            boolean[] zArr = this.f9436c;
            System.arraycopy(zArr, i2, zArr, i7, i3);
        } else if (i4 < 0) {
            for (int i8 = 0; i8 < i3; i8++) {
                Object[] objArr2 = this.a;
                int i9 = (i7 + i8) % i5;
                int i10 = (i2 + i8) % i5;
                objArr2[i9] = objArr2[i10];
                k[] kVarArr2 = this.f9435b;
                kVarArr2[i9] = kVarArr2[i10];
                boolean[] zArr2 = this.f9436c;
                zArr2[i9] = zArr2[i10];
            }
        } else {
            for (int i11 = i3 - 1; i11 >= 0; i11--) {
                Object[] objArr3 = this.a;
                int i12 = (i7 + i11) % i5;
                int i13 = (i2 + i11) % i5;
                objArr3[i12] = objArr3[i13];
                k[] kVarArr3 = this.f9435b;
                kVarArr3[i12] = kVarArr3[i13];
                boolean[] zArr3 = this.f9436c;
                zArr3[i12] = zArr3[i13];
            }
        }
    }

    public static int g(int i2) {
        if ((i2 > 31 && i2 < 127) || i2 == 27) {
            return 1;
        }
        int type = Character.getType(i2);
        if (type == 6 || type == 7 || type == 15 || type == 16) {
            return 0;
        }
        if ((i2 >= 4448 && i2 <= 4607) || (i2 >= 55216 && i2 <= 55295)) {
            return b.a >= 16 ? 0 : 2;
        }
        if (Character.charCount(i2) == 1) {
            int a2 = a.a((char) i2);
            if (a2 == 3 || a2 == 5) {
                return 2;
            }
        } else {
            int i3 = (i2 >> 16) & 15;
            if (i3 == 2 || i3 == 3) {
                return 2;
            }
        }
        return 1;
    }

    private int h(int i2) {
        if (i2 < (-this.f9440g) || i2 > this.f9438e) {
            String str = "externalToInternalRow " + i2 + " " + this.f9438e + " " + this.f9440g;
            Log.e("UnicodeTranscript", str);
            throw new IllegalArgumentException(str);
        } else if (i2 >= 0) {
            return (this.f9442i + i2) % this.f9437d;
        } else {
            int i3 = -i2;
            int i4 = this.f9442i;
            return i3 > i4 ? this.f9437d + i4 + i2 : i4 + i2;
        }
    }

    private boolean i(int i2) {
        return g(i2) == 1 && Character.charCount(i2) == 1;
    }

    public int a() {
        return this.f9440g + this.f9438e;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x00cd */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:87:0x0176 */
    public void a(int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char c2;
        int i14;
        Object[] objArr;
        int i15;
        k[] kVarArr;
        int i16;
        int i17;
        char c3;
        int i18 = i3;
        int i19 = i5;
        if (i2 < 0 || (i8 = i2 + i4) > (i9 = this.f9439f) || i18 < 0 || i18 + i19 > (i10 = this.f9438e) || i6 < 0 || i6 + i4 > i9 || i7 < 0 || i7 + i19 > i10) {
            throw new IllegalArgumentException();
        }
        Object[] objArr2 = this.a;
        k[] kVarArr2 = this.f9435b;
        if (i18 > i7) {
            int i20 = 0;
            while (i20 < i19) {
                int i21 = i18 + i20;
                int h2 = h(i21);
                int i22 = i7 + i20;
                int h3 = h(i22);
                if (!(objArr2[h2] instanceof char[]) || !(objArr2[h3] instanceof char[])) {
                    char[] a2 = a(i21, i2, i8, true);
                    if (a2 == null) {
                        i14 = i20;
                        kVarArr = kVarArr2;
                        b(i6, i22, i4, 1, 32, this.f9441h);
                        i15 = i8;
                        objArr = objArr2;
                        i20 = i14 + 1;
                        kVarArr2 = kVarArr;
                        i8 = i15;
                        objArr2 = objArr;
                    } else {
                        i14 = i20;
                        kVarArr = kVarArr2;
                        int i23 = this.f9439f;
                        i15 = i8;
                        objArr = objArr2;
                        int i24 = 0;
                        int i25 = 0;
                        char c4 = 0;
                        while (i24 < a2.length && a2[i24] != 0 && (i16 = i6 + i25) < i23) {
                            if (Character.isHighSurrogate(a2[i24])) {
                                c4 = a2[i24];
                                i17 = i23;
                            } else {
                                if (Character.isLowSurrogate(a2[i24])) {
                                    i17 = i23;
                                    int codePoint = Character.toCodePoint(c4 == 1 ? (char) 1 : 0, a2[i24]);
                                    d(i16, i22, codePoint);
                                    c3 = codePoint;
                                } else {
                                    i17 = i23;
                                    d(i16, i22, a2[i24]);
                                    c3 = a2[i24];
                                }
                                i25 += g(c3 == 1 ? 1 : 0);
                            }
                            i24++;
                            i23 = i17;
                            c4 = c4;
                        }
                    }
                } else {
                    System.arraycopy(objArr2[h2], i2, objArr2[h3], i6, i4);
                    i14 = i20;
                    kVarArr = kVarArr2;
                    i15 = i8;
                    objArr = objArr2;
                }
                kVarArr[h2].a(i2, kVarArr[h3], i6, i4);
                i20 = i14 + 1;
                kVarArr2 = kVarArr;
                i8 = i15;
                objArr2 = objArr;
            }
            return;
        }
        int i26 = i8;
        int i27 = 0;
        while (i27 < i19) {
            int i28 = i27 + 1;
            int i29 = i19 - i28;
            int i30 = i18 + i29;
            int h4 = h(i30);
            int i31 = i7 + i29;
            int h5 = h(i31);
            if (!(objArr2[h4] instanceof char[]) || !(objArr2[h5] instanceof char[])) {
                i11 = i26;
                char[] a3 = a(i30, i2, i11, true);
                if (a3 == null) {
                    b(i6, i31, i4, 1, 32, this.f9441h);
                    i18 = i3;
                    i19 = i5;
                    i27 = i28;
                    i26 = i11;
                } else {
                    int i32 = this.f9439f;
                    int i33 = 0;
                    int i34 = 0;
                    char c5 = 0;
                    while (i33 < a3.length && a3[i33] != 0 && (i12 = i6 + i34) < i32) {
                        if (Character.isHighSurrogate(a3[i33])) {
                            c5 = a3[i33];
                            i13 = i32;
                        } else {
                            if (Character.isLowSurrogate(a3[i33])) {
                                i13 = i32;
                                int codePoint2 = Character.toCodePoint(c5 == 1 ? (char) 1 : 0, a3[i33]);
                                d(i12, i31, codePoint2);
                                c2 = codePoint2;
                            } else {
                                i13 = i32;
                                d(i12, i31, a3[i33]);
                                c2 = a3[i33];
                            }
                            i34 += g(c2 == 1 ? 1 : 0);
                        }
                        i33++;
                        i32 = i13;
                        c5 = c5;
                    }
                }
            } else {
                System.arraycopy(objArr2[h4], i2, objArr2[h5], i6, i4);
                i11 = i26;
            }
            kVarArr2[h4].a(i2, kVarArr2[h5], i6, i4);
            i18 = i3;
            i19 = i5;
            i27 = i28;
            i26 = i11;
        }
    }

    public boolean a(int i2, int i3, int i4, int i5) {
        if (!d(i2, i3, i4)) {
            return false;
        }
        this.f9435b[h(i3)].a(i2, i5);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r17, int r18, int[] r19) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: iiec.androidterm.r.r.a(int, int, int[]):boolean");
    }

    public char[] a(int i2) {
        return a(i2, 0, this.f9439f, true);
    }

    public char[] a(int i2, int i3, int i4) {
        return a(i2, i3, i4, false);
    }

    public int b() {
        return this.f9440g;
    }

    public k b(int i2) {
        return b(i2, 0, this.f9439f, true);
    }

    public k b(int i2, int i3, int i4) {
        return b(i2, i3, i4, false);
    }

    public void b(int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i2 < 0 || i2 + i4 > this.f9439f || i3 < 0 || i3 + i5 > this.f9438e) {
            Log.e("UnicodeTranscript", "illegal arguments! " + i2 + " " + i3 + " " + i4 + " " + i5 + " " + i6 + " " + this.f9439f + " " + this.f9438e);
            throw new IllegalArgumentException();
        }
        for (int i8 = 0; i8 < i5; i8++) {
            for (int i9 = 0; i9 < i4; i9++) {
                a(i2 + i9, i3 + i8, i6, i7);
            }
        }
    }

    public int c() {
        return this.f9441h;
    }

    public void c(int i2, int i3, int i4) {
        int i5 = i3 - 1;
        if (i2 > i5) {
            throw new IllegalArgumentException();
        } else if (i2 >= 0) {
            int i6 = this.f9438e;
            if (i3 <= i6) {
                int i7 = this.f9437d;
                if (i2 == 0 && i3 == i6) {
                    this.f9442i = (this.f9442i + 1) % i7;
                    int i8 = this.f9440g;
                    if (i8 < i7 - i6) {
                        this.f9440g = i8 + 1;
                    }
                    int h2 = h(i5);
                    this.a[h2] = null;
                    this.f9435b[h2] = new k(i4, this.f9439f);
                    this.f9436c[h2] = false;
                    return;
                }
                int i9 = this.f9442i;
                int h3 = h(i2);
                int h4 = h(i3);
                Object[] objArr = this.a;
                k[] kVarArr = this.f9435b;
                boolean[] zArr = this.f9436c;
                Object obj = objArr[h3];
                k kVar = kVarArr[h3];
                boolean z = zArr[h3];
                e(i9, i2, 1);
                e(h4, i6 - i3, 1);
                objArr[i9] = obj;
                kVarArr[i9] = kVar;
                zArr[i9] = z;
                this.f9442i = (i9 + 1) % i7;
                int i10 = this.f9440g;
                if (i10 < i7 - i6) {
                    this.f9440g = i10 + 1;
                }
                int h5 = h(i5);
                objArr[h5] = null;
                kVarArr[h5] = new k(i4, this.f9439f);
                zArr[h5] = false;
                return;
            }
            throw new IllegalArgumentException();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean c(int i2) {
        return this.f9436c[h(i2)];
    }

    /* access modifiers changed from: package-private */
    public boolean d(int i2) {
        if (i2 >= (-this.f9440g) && i2 <= this.f9438e - 1) {
            return this.a[h(i2)] instanceof char[];
        }
        throw new IllegalArgumentException();
    }

    public boolean d(int i2, int i3, int i4) {
        char c2;
        if (i3 >= this.f9438e || i2 >= this.f9439f) {
            Log.e("UnicodeTranscript", "illegal arguments! " + i3 + " " + i2 + " " + this.f9438e + " " + this.f9439f);
            throw new IllegalArgumentException();
        }
        int h2 = h(i3);
        if (this.a[h2] != null) {
            c2 = 65535;
        } else if (i(i4)) {
            a(h2, this.f9439f);
            c2 = 1;
        } else {
            b(h2, this.f9439f);
            c2 = 0;
        }
        Object[] objArr = this.a;
        if (objArr[h2] instanceof char[]) {
            char[] cArr = (char[]) objArr[h2];
            if (c2 == 65535) {
                c2 = i(i4) ? (char) 1 : 0;
            }
            if (c2 == 1) {
                cArr[i2] = (char) i4;
                return true;
            }
            this.a[h2] = new f(cArr);
        }
        ((f) this.a[h2]).a(i2, i4);
        return true;
    }

    public void e(int i2) {
        this.f9441h = i2;
    }

    public void f(int i2) {
        this.f9436c[h(i2)] = true;
    }
}
