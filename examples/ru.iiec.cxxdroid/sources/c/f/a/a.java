package c.f.a;

import c.f.a.b;
import java.util.Arrays;

public class a implements b.a {

    /* renamed from: l  reason: collision with root package name */
    private static float f1997l = 0.001f;
    int a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final b f1998b;

    /* renamed from: c  reason: collision with root package name */
    protected final c f1999c;

    /* renamed from: d  reason: collision with root package name */
    private int f2000d = 8;

    /* renamed from: e  reason: collision with root package name */
    private i f2001e = null;

    /* renamed from: f  reason: collision with root package name */
    private int[] f2002f;

    /* renamed from: g  reason: collision with root package name */
    private int[] f2003g;

    /* renamed from: h  reason: collision with root package name */
    private float[] f2004h;

    /* renamed from: i  reason: collision with root package name */
    private int f2005i;

    /* renamed from: j  reason: collision with root package name */
    private int f2006j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f2007k;

    a(b bVar, c cVar) {
        int i2 = this.f2000d;
        this.f2002f = new int[i2];
        this.f2003g = new int[i2];
        this.f2004h = new float[i2];
        this.f2005i = -1;
        this.f2006j = -1;
        this.f2007k = false;
        this.f1998b = bVar;
        this.f1999c = cVar;
    }

    @Override // c.f.a.b.a
    public float a(int i2) {
        int i3 = this.f2005i;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.f2004h[i3];
            }
            i3 = this.f2003g[i3];
            i4++;
        }
        return 0.0f;
    }

    @Override // c.f.a.b.a
    public float a(b bVar, boolean z) {
        float a2 = a(bVar.a);
        a(bVar.a, z);
        b.a aVar = bVar.f2011e;
        int a3 = aVar.a();
        for (int i2 = 0; i2 < a3; i2++) {
            i b2 = aVar.b(i2);
            a(b2, aVar.a(b2) * a2, z);
        }
        return a2;
    }

    @Override // c.f.a.b.a
    public final float a(i iVar) {
        int i2 = this.f2005i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.f2002f[i2] == iVar.f2049d) {
                return this.f2004h[i2];
            }
            i2 = this.f2003g[i2];
            i3++;
        }
        return 0.0f;
    }

    @Override // c.f.a.b.a
    public final float a(i iVar, boolean z) {
        if (this.f2001e == iVar) {
            this.f2001e = null;
        }
        int i2 = this.f2005i;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.a) {
            if (this.f2002f[i2] == iVar.f2049d) {
                if (i2 == this.f2005i) {
                    this.f2005i = this.f2003g[i2];
                } else {
                    int[] iArr = this.f2003g;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    iVar.b(this.f1998b);
                }
                iVar.n--;
                this.a--;
                this.f2002f[i2] = -1;
                if (this.f2007k) {
                    this.f2006j = i2;
                }
                return this.f2004h[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f2003g[i2];
        }
        return 0.0f;
    }

    @Override // c.f.a.b.a
    public int a() {
        return this.a;
    }

    @Override // c.f.a.b.a
    public void a(float f2) {
        int i2 = this.f2005i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            float[] fArr = this.f2004h;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f2003g[i2];
            i3++;
        }
    }

    @Override // c.f.a.b.a
    public final void a(i iVar, float f2) {
        if (f2 == 0.0f) {
            a(iVar, true);
            return;
        }
        int i2 = this.f2005i;
        if (i2 == -1) {
            this.f2005i = 0;
            float[] fArr = this.f2004h;
            int i3 = this.f2005i;
            fArr[i3] = f2;
            this.f2002f[i3] = iVar.f2049d;
            this.f2003g[i3] = -1;
            iVar.n++;
            iVar.a(this.f1998b);
            this.a++;
            if (!this.f2007k) {
                this.f2006j++;
                int i4 = this.f2006j;
                int[] iArr = this.f2002f;
                if (i4 >= iArr.length) {
                    this.f2007k = true;
                    this.f2006j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i5 = 0;
        int i6 = -1;
        while (i2 != -1 && i5 < this.a) {
            int[] iArr2 = this.f2002f;
            int i7 = iArr2[i2];
            int i8 = iVar.f2049d;
            if (i7 == i8) {
                this.f2004h[i2] = f2;
                return;
            }
            if (iArr2[i2] < i8) {
                i6 = i2;
            }
            i2 = this.f2003g[i2];
            i5++;
        }
        int i9 = this.f2006j;
        int i10 = i9 + 1;
        if (this.f2007k) {
            int[] iArr3 = this.f2002f;
            if (iArr3[i9] != -1) {
                i9 = iArr3.length;
            }
        } else {
            i9 = i10;
        }
        int[] iArr4 = this.f2002f;
        if (i9 >= iArr4.length && this.a < iArr4.length) {
            int i11 = 0;
            while (true) {
                int[] iArr5 = this.f2002f;
                if (i11 >= iArr5.length) {
                    break;
                } else if (iArr5[i11] == -1) {
                    i9 = i11;
                    break;
                } else {
                    i11++;
                }
            }
        }
        int[] iArr6 = this.f2002f;
        if (i9 >= iArr6.length) {
            i9 = iArr6.length;
            this.f2000d *= 2;
            this.f2007k = false;
            this.f2006j = i9 - 1;
            this.f2004h = Arrays.copyOf(this.f2004h, this.f2000d);
            this.f2002f = Arrays.copyOf(this.f2002f, this.f2000d);
            this.f2003g = Arrays.copyOf(this.f2003g, this.f2000d);
        }
        this.f2002f[i9] = iVar.f2049d;
        this.f2004h[i9] = f2;
        int[] iArr7 = this.f2003g;
        if (i6 != -1) {
            iArr7[i9] = iArr7[i6];
            iArr7[i6] = i9;
        } else {
            iArr7[i9] = this.f2005i;
            this.f2005i = i9;
        }
        iVar.n++;
        iVar.a(this.f1998b);
        this.a++;
        if (!this.f2007k) {
            this.f2006j++;
        }
        if (this.a >= this.f2002f.length) {
            this.f2007k = true;
        }
        int i12 = this.f2006j;
        int[] iArr8 = this.f2002f;
        if (i12 >= iArr8.length) {
            this.f2007k = true;
            this.f2006j = iArr8.length - 1;
        }
    }

    @Override // c.f.a.b.a
    public void a(i iVar, float f2, boolean z) {
        float f3 = f1997l;
        if (f2 <= (-f3) || f2 >= f3) {
            int i2 = this.f2005i;
            if (i2 == -1) {
                this.f2005i = 0;
                float[] fArr = this.f2004h;
                int i3 = this.f2005i;
                fArr[i3] = f2;
                this.f2002f[i3] = iVar.f2049d;
                this.f2003g[i3] = -1;
                iVar.n++;
                iVar.a(this.f1998b);
                this.a++;
                if (!this.f2007k) {
                    this.f2006j++;
                    int i4 = this.f2006j;
                    int[] iArr = this.f2002f;
                    if (i4 >= iArr.length) {
                        this.f2007k = true;
                        this.f2006j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i5 = 0;
            int i6 = -1;
            while (i2 != -1 && i5 < this.a) {
                int[] iArr2 = this.f2002f;
                int i7 = iArr2[i2];
                int i8 = iVar.f2049d;
                if (i7 == i8) {
                    float f4 = this.f2004h[i2] + f2;
                    float f5 = f1997l;
                    if (f4 > (-f5) && f4 < f5) {
                        f4 = 0.0f;
                    }
                    this.f2004h[i2] = f4;
                    if (f4 == 0.0f) {
                        if (i2 == this.f2005i) {
                            this.f2005i = this.f2003g[i2];
                        } else {
                            int[] iArr3 = this.f2003g;
                            iArr3[i6] = iArr3[i2];
                        }
                        if (z) {
                            iVar.b(this.f1998b);
                        }
                        if (this.f2007k) {
                            this.f2006j = i2;
                        }
                        iVar.n--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i8) {
                    i6 = i2;
                }
                i2 = this.f2003g[i2];
                i5++;
            }
            int i9 = this.f2006j;
            int i10 = i9 + 1;
            if (this.f2007k) {
                int[] iArr4 = this.f2002f;
                if (iArr4[i9] != -1) {
                    i9 = iArr4.length;
                }
            } else {
                i9 = i10;
            }
            int[] iArr5 = this.f2002f;
            if (i9 >= iArr5.length && this.a < iArr5.length) {
                int i11 = 0;
                while (true) {
                    int[] iArr6 = this.f2002f;
                    if (i11 >= iArr6.length) {
                        break;
                    } else if (iArr6[i11] == -1) {
                        i9 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            int[] iArr7 = this.f2002f;
            if (i9 >= iArr7.length) {
                i9 = iArr7.length;
                this.f2000d *= 2;
                this.f2007k = false;
                this.f2006j = i9 - 1;
                this.f2004h = Arrays.copyOf(this.f2004h, this.f2000d);
                this.f2002f = Arrays.copyOf(this.f2002f, this.f2000d);
                this.f2003g = Arrays.copyOf(this.f2003g, this.f2000d);
            }
            this.f2002f[i9] = iVar.f2049d;
            this.f2004h[i9] = f2;
            int[] iArr8 = this.f2003g;
            if (i6 != -1) {
                iArr8[i9] = iArr8[i6];
                iArr8[i6] = i9;
            } else {
                iArr8[i9] = this.f2005i;
                this.f2005i = i9;
            }
            iVar.n++;
            iVar.a(this.f1998b);
            this.a++;
            if (!this.f2007k) {
                this.f2006j++;
            }
            int i12 = this.f2006j;
            int[] iArr9 = this.f2002f;
            if (i12 >= iArr9.length) {
                this.f2007k = true;
                this.f2006j = iArr9.length - 1;
            }
        }
    }

    @Override // c.f.a.b.a
    public i b(int i2) {
        int i3 = this.f2005i;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.f1999c.f2015d[this.f2002f[i3]];
            }
            i3 = this.f2003g[i3];
            i4++;
        }
        return null;
    }

    @Override // c.f.a.b.a
    public void b() {
        int i2 = this.f2005i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            float[] fArr = this.f2004h;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f2003g[i2];
            i3++;
        }
    }

    @Override // c.f.a.b.a
    public boolean b(i iVar) {
        int i2 = this.f2005i;
        if (i2 == -1) {
            return false;
        }
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.f2002f[i2] == iVar.f2049d) {
                return true;
            }
            i2 = this.f2003g[i2];
            i3++;
        }
        return false;
    }

    @Override // c.f.a.b.a
    public final void clear() {
        int i2 = this.f2005i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            i iVar = this.f1999c.f2015d[this.f2002f[i2]];
            if (iVar != null) {
                iVar.b(this.f1998b);
            }
            i2 = this.f2003g[i2];
            i3++;
        }
        this.f2005i = -1;
        this.f2006j = -1;
        this.f2007k = false;
        this.a = 0;
    }

    public String toString() {
        int i2 = this.f2005i;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            str = ((str + " -> ") + this.f2004h[i2] + " : ") + this.f1999c.f2015d[this.f2002f[i2]];
            i2 = this.f2003g[i2];
            i3++;
        }
        return str;
    }
}
