package iiec.androidterm.r;

import android.graphics.Canvas;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public class q implements j {
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private int f9432b;

    /* renamed from: c  reason: collision with root package name */
    private int f9433c;

    /* renamed from: d  reason: collision with root package name */
    private r f9434d;

    public q(int i2, int i3, int i4, d dVar) {
        c(i2, i3, i4, p.a);
    }

    private String b(g gVar, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        char c2;
        int i8;
        int i9;
        int i10;
        q qVar = this;
        StringBuilder sb = new StringBuilder();
        r rVar = qVar.f9434d;
        int i11 = qVar.a;
        int i12 = i3 < (-rVar.b()) ? -rVar.b() : i3;
        int i13 = qVar.f9433c;
        int i14 = i5 >= i13 ? i13 - 1 : i5;
        k kVar = null;
        int i15 = i12;
        while (i15 <= i14) {
            int i16 = i15 == i12 ? i2 : 0;
            if (i15 != i14 || (i6 = i4 + 1) > i11) {
                i6 = i11;
            }
            char[] a2 = rVar.a(i15, i16, i6);
            if (gVar != null) {
                kVar = rVar.b(i15, i16, i6);
            }
            if (a2 == null) {
                if (!rVar.c(i15) && i15 < i14 && i15 < qVar.f9433c - 1) {
                    sb.append('\n');
                    if (gVar != null) {
                        gVar.a(0);
                    }
                }
                i7 = i12;
            } else {
                int c3 = qVar.f9434d.c();
                int length = a2.length;
                int i17 = -1;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    i7 = i12;
                    if (i18 < length && (c2 = a2[i18]) != 0) {
                        if (kVar != null) {
                            try {
                                i10 = kVar.a(i19);
                            } catch (ArrayIndexOutOfBoundsException unused) {
                                i8 = length;
                                i9 = c3;
                            }
                        } else {
                            i10 = c3;
                        }
                        i8 = length;
                        i9 = i10;
                        if (!(c2 == ' ' && i9 == c3)) {
                            i17 = i18;
                        }
                        if (!Character.isLowSurrogate(c2)) {
                            i19 += r.a(a2, i18);
                        }
                        i18++;
                        i12 = i7;
                        length = i8;
                    }
                }
                if (rVar.c(i15) && i17 > -1 && i6 == i11) {
                    i17 = i18 - 1;
                }
                sb.append(a2, 0, i17 + 1);
                if (gVar != null) {
                    int i20 = 0;
                    if (kVar != null) {
                        int i21 = 0;
                        while (i20 <= i17) {
                            gVar.a(kVar.a(i21));
                            i21 += r.a(a2, i20);
                            if (Character.isHighSurrogate(a2[i20])) {
                                i20++;
                            }
                            i20++;
                        }
                    } else {
                        while (i20 <= i17) {
                            gVar.a(c3);
                            if (Character.isHighSurrogate(a2[i20])) {
                                i20++;
                            }
                            i20++;
                        }
                    }
                }
                if (rVar.c(i15) || i15 >= i14) {
                    qVar = this;
                } else {
                    qVar = this;
                    if (i15 < qVar.f9433c - 1) {
                        sb.append('\n');
                        if (gVar != null) {
                            gVar.a(0);
                        }
                    }
                }
            }
            i15++;
            i12 = i7;
        }
        return sb.toString();
    }

    private void c(int i2, int i3, int i4, int i5) {
        this.a = i2;
        this.f9432b = i3;
        this.f9433c = i4;
        this.f9434d = new r(i2, i3, i4, i5);
        this.f9434d.b(0, 0, this.a, this.f9433c, 32, i5);
    }

    public String a(int i2, int i3, int i4, int i5) {
        return b(null, i2, i3, i4, i5);
    }

    public String a(g gVar) {
        return b(gVar, 0, -this.f9434d.b(), this.a, this.f9433c);
    }

    public String a(g gVar, int i2, int i3, int i4, int i5) {
        return b(gVar, i2, i3, i4, i5);
    }

    public void a() {
        this.f9434d = null;
    }

    public void a(int i2, int i3, int i4) {
        if (i3 > this.f9432b) {
            this.f9432b = i3;
        }
        c(i2, this.f9432b, i3, i4);
    }

    public void a(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f9434d.a(i2, i3, i4, i5, i6, i7);
    }

    public final void a(int i2, Canvas canvas, float f2, float f3, o oVar, int i3, int i4, int i5, String str, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        char[] cArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        k kVar;
        boolean z;
        int i16;
        int i17;
        int i18;
        boolean z2;
        int i19 = i3;
        int i20 = i4;
        int i21 = i5;
        try {
            char[] a2 = this.f9434d.a(i2);
            k b2 = this.f9434d.b(i2);
            int c2 = this.f9434d.c();
            if (a2 == null) {
                if (i20 != i21) {
                    int i22 = i21 - i20;
                    char[] cArr2 = new char[i22];
                    Arrays.fill(cArr2, ' ');
                    oVar.a(canvas, f2, f3, i4, i22, cArr2, 0, 1, true, c2, i3, 0, 1, 1, i6);
                }
                if (i3 != -1) {
                    char[] cArr3 = new char[1];
                    Arrays.fill(cArr3, ' ');
                    oVar.a(canvas, f2, f3, i3, 1, cArr3, 0, 1, true, c2, i3, 0, 1, 1, i6);
                    return;
                }
                return;
            }
            int i23 = this.a;
            int length = a2.length;
            int i24 = 0;
            int i25 = 0;
            boolean z3 = false;
            boolean z4 = false;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 1;
            int i30 = -1;
            int i31 = -1;
            int i32 = 0;
            int i33 = 0;
            int i34 = 0;
            while (i24 < i23 && i27 < length && a2[i27] != 0) {
                if (Character.isHighSurrogate(a2[i27])) {
                    i8 = r.a(a2, i27);
                    i7 = 2;
                } else {
                    i8 = r.g(a2[i27]);
                    i7 = 1;
                }
                if (i8 > 0) {
                    i10 = i8;
                    i9 = i34;
                } else {
                    i9 = i24;
                    i10 = i25;
                }
                int a3 = b2.a(i9);
                boolean z5 = (i9 >= i20 || (i10 == 2 && i9 == i20 + -1)) && i9 <= i21;
                if (a3 == i26 && z5 == z4 && (i8 <= 0 || !z3)) {
                    i15 = i10;
                    i24 = i9;
                    i14 = i27;
                    i13 = i8;
                    i12 = length;
                    i11 = i23;
                    kVar = b2;
                    cArr = a2;
                    i16 = i19;
                    z = z3;
                } else {
                    if (i30 >= 0) {
                        i15 = i10;
                        i18 = a3;
                        i14 = i27;
                        i13 = i8;
                        i12 = length;
                        i11 = i23;
                        z2 = z5;
                        kVar = b2;
                        cArr = a2;
                        i17 = i9;
                        i16 = i19;
                        oVar.a(canvas, f2, f3, i30, i28, a2, i31, i27 - i31, z4, i26, i3, i32, i33, i29, i6);
                    } else {
                        i18 = a3;
                        i15 = i10;
                        i17 = i9;
                        i14 = i27;
                        i13 = i8;
                        i12 = length;
                        i11 = i23;
                        z2 = z5;
                        kVar = b2;
                        cArr = a2;
                        i16 = i19;
                    }
                    i24 = i17;
                    i30 = i24;
                    z4 = z2;
                    i26 = i18;
                    i31 = i14;
                    z = false;
                    i28 = 0;
                }
                if (i16 == i24) {
                    if (i13 > 0) {
                        i29 = i13;
                        i33 = i7;
                        i32 = i14;
                    } else {
                        i33 += i7;
                    }
                }
                i28 += i13;
                i34 += i13;
                i27 = i14 + i7;
                if (i13 > 1) {
                    z = true;
                }
                i20 = i4;
                i21 = i5;
                i19 = i16;
                z3 = z;
                b2 = kVar;
                i25 = i15;
                length = i12;
                i23 = i11;
                a2 = cArr;
            }
            if (i30 >= 0) {
                oVar.a(canvas, f2, f3, i30, i28, a2, i31, i27 - i31, z4, i26, i3, i32, i33, i29, i6);
            }
            if (i19 >= 0 && str.length() > 0) {
                int min = Math.min(i23, str.length());
                oVar.a(canvas, f2, f3, Math.min(i19, i23 - min), min, str.toCharArray(), str.length() - min, min, true, p.a(15, 0, 0), -1, 0, 0, 0, 0);
            }
        } catch (IllegalArgumentException | NullPointerException unused) {
        }
    }

    public void a(d dVar) {
        this.f9434d.e(p.a);
    }

    public boolean a(int i2, int i3, int[] iArr) {
        r rVar = this.f9434d;
        if (rVar == null) {
            return true;
        }
        if (!rVar.a(i2, i3, iArr)) {
            return false;
        }
        this.a = i2;
        this.f9433c = i3;
        return true;
    }

    /* access modifiers changed from: package-private */
    public char[] a(int i2) {
        try {
            return this.f9434d.a(i2);
        } catch (IllegalArgumentException | NullPointerException unused) {
            return null;
        }
    }

    public int b() {
        return this.f9434d.a();
    }

    public void b(int i2, int i3, int i4) {
        this.f9434d.c(i2, i3, i4);
    }

    public void b(int i2, int i3, int i4, int i5) {
        this.f9434d.a(i2, i3, i4, i5);
    }

    public void b(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f9434d.b(i2, i3, i4, i5, i6, i7);
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i2) {
        return this.f9434d.c(i2);
    }

    public int c() {
        return this.f9434d.b();
    }

    /* access modifiers changed from: package-private */
    public boolean c(int i2) {
        r rVar = this.f9434d;
        if (rVar != null) {
            return rVar.d(i2);
        }
        return true;
    }

    public String d() {
        return b(null, 0, -this.f9434d.b(), this.a, this.f9433c);
    }

    public void d(int i2) {
        this.f9434d.f(i2);
    }
}
