package c.f.a;

import c.f.a.b;
import java.util.Arrays;

public class j implements b.a {

    /* renamed from: m  reason: collision with root package name */
    private static float f2065m = 0.001f;
    private int a = 16;

    /* renamed from: b  reason: collision with root package name */
    private int f2066b = 16;

    /* renamed from: c  reason: collision with root package name */
    int[] f2067c;

    /* renamed from: d  reason: collision with root package name */
    int[] f2068d;

    /* renamed from: e  reason: collision with root package name */
    int[] f2069e;

    /* renamed from: f  reason: collision with root package name */
    float[] f2070f;

    /* renamed from: g  reason: collision with root package name */
    int[] f2071g;

    /* renamed from: h  reason: collision with root package name */
    int[] f2072h;

    /* renamed from: i  reason: collision with root package name */
    int f2073i;

    /* renamed from: j  reason: collision with root package name */
    int f2074j;

    /* renamed from: k  reason: collision with root package name */
    private final b f2075k;

    /* renamed from: l  reason: collision with root package name */
    protected final c f2076l;

    j(b bVar, c cVar) {
        int i2 = this.a;
        this.f2067c = new int[i2];
        this.f2068d = new int[i2];
        this.f2069e = new int[i2];
        this.f2070f = new float[i2];
        this.f2071g = new int[i2];
        this.f2072h = new int[i2];
        this.f2073i = 0;
        this.f2074j = -1;
        this.f2075k = bVar;
        this.f2076l = cVar;
        clear();
    }

    private void a(int i2, i iVar, float f2) {
        this.f2069e[i2] = iVar.f2049d;
        this.f2070f[i2] = f2;
        this.f2071g[i2] = -1;
        this.f2072h[i2] = -1;
        iVar.a(this.f2075k);
        iVar.n++;
        this.f2073i++;
    }

    private void a(i iVar, int i2) {
        int[] iArr;
        int i3 = iVar.f2049d % this.f2066b;
        int[] iArr2 = this.f2067c;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            iArr2[i3] = i2;
        } else {
            while (true) {
                iArr = this.f2068d;
                if (iArr[i4] == -1) {
                    break;
                }
                i4 = iArr[i4];
            }
            iArr[i4] = i2;
        }
        this.f2068d[i2] = -1;
    }

    private void b(int i2, i iVar, float f2) {
        int c2 = c();
        a(c2, iVar, f2);
        if (i2 != -1) {
            this.f2071g[c2] = i2;
            int[] iArr = this.f2072h;
            iArr[c2] = iArr[i2];
            iArr[i2] = c2;
        } else {
            this.f2071g[c2] = -1;
            if (this.f2073i > 0) {
                this.f2072h[c2] = this.f2074j;
                this.f2074j = c2;
            } else {
                this.f2072h[c2] = -1;
            }
        }
        int[] iArr2 = this.f2072h;
        if (iArr2[c2] != -1) {
            this.f2071g[iArr2[c2]] = c2;
        }
        a(iVar, c2);
    }

    private int c() {
        for (int i2 = 0; i2 < this.a; i2++) {
            if (this.f2069e[i2] == -1) {
                return i2;
            }
        }
        return -1;
    }

    private void d() {
        int i2 = this.a * 2;
        this.f2069e = Arrays.copyOf(this.f2069e, i2);
        this.f2070f = Arrays.copyOf(this.f2070f, i2);
        this.f2071g = Arrays.copyOf(this.f2071g, i2);
        this.f2072h = Arrays.copyOf(this.f2072h, i2);
        this.f2068d = Arrays.copyOf(this.f2068d, i2);
        for (int i3 = this.a; i3 < i2; i3++) {
            this.f2069e[i3] = -1;
            this.f2068d[i3] = -1;
        }
        this.a = i2;
    }

    private void d(i iVar) {
        int i2 = iVar.f2049d;
        int i3 = i2 % this.f2066b;
        int[] iArr = this.f2067c;
        int i4 = iArr[i3];
        if (i4 != -1) {
            if (this.f2069e[i4] == i2) {
                int[] iArr2 = this.f2068d;
                iArr[i3] = iArr2[i4];
                iArr2[i4] = -1;
                return;
            }
            while (true) {
                int[] iArr3 = this.f2068d;
                if (iArr3[i4] == -1 || this.f2069e[iArr3[i4]] == i2) {
                    int[] iArr4 = this.f2068d;
                    int i5 = iArr4[i4];
                } else {
                    i4 = iArr3[i4];
                }
            }
            int[] iArr42 = this.f2068d;
            int i52 = iArr42[i4];
            if (i52 != -1 && this.f2069e[i52] == i2) {
                iArr42[i4] = iArr42[i52];
                iArr42[i52] = -1;
            }
        }
    }

    @Override // c.f.a.b.a
    public float a(int i2) {
        int i3 = this.f2073i;
        int i4 = this.f2074j;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2) {
                return this.f2070f[i4];
            }
            i4 = this.f2072h[i4];
            if (i4 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // c.f.a.b.a
    public float a(b bVar, boolean z) {
        float a2 = a(bVar.a);
        a(bVar.a, z);
        j jVar = (j) bVar.f2011e;
        int a3 = jVar.a();
        int i2 = jVar.f2074j;
        int i3 = 0;
        int i4 = 0;
        while (i3 < a3) {
            int[] iArr = jVar.f2069e;
            if (iArr[i4] != -1) {
                a(this.f2076l.f2015d[iArr[i4]], jVar.f2070f[i4] * a2, z);
                i3++;
            }
            i4++;
        }
        return a2;
    }

    @Override // c.f.a.b.a
    public float a(i iVar) {
        int c2 = c(iVar);
        if (c2 != -1) {
            return this.f2070f[c2];
        }
        return 0.0f;
    }

    @Override // c.f.a.b.a
    public float a(i iVar, boolean z) {
        int c2 = c(iVar);
        if (c2 == -1) {
            return 0.0f;
        }
        d(iVar);
        float f2 = this.f2070f[c2];
        if (this.f2074j == c2) {
            this.f2074j = this.f2072h[c2];
        }
        this.f2069e[c2] = -1;
        int[] iArr = this.f2071g;
        if (iArr[c2] != -1) {
            int[] iArr2 = this.f2072h;
            iArr2[iArr[c2]] = iArr2[c2];
        }
        int[] iArr3 = this.f2072h;
        if (iArr3[c2] != -1) {
            int[] iArr4 = this.f2071g;
            iArr4[iArr3[c2]] = iArr4[c2];
        }
        this.f2073i--;
        iVar.n--;
        if (z) {
            iVar.b(this.f2075k);
        }
        return f2;
    }

    @Override // c.f.a.b.a
    public int a() {
        return this.f2073i;
    }

    @Override // c.f.a.b.a
    public void a(float f2) {
        int i2 = this.f2073i;
        int i3 = this.f2074j;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f2070f;
            fArr[i3] = fArr[i3] / f2;
            i3 = this.f2072h[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // c.f.a.b.a
    public void a(i iVar, float f2) {
        float f3 = f2065m;
        if (f2 <= (-f3) || f2 >= f3) {
            if (this.f2073i == 0) {
                a(0, iVar, f2);
                a(iVar, 0);
                this.f2074j = 0;
                return;
            }
            int c2 = c(iVar);
            if (c2 != -1) {
                this.f2070f[c2] = f2;
                return;
            }
            if (this.f2073i + 1 >= this.a) {
                d();
            }
            int i2 = this.f2073i;
            int i3 = this.f2074j;
            int i4 = -1;
            for (int i5 = 0; i5 < i2; i5++) {
                int[] iArr = this.f2069e;
                int i6 = iArr[i3];
                int i7 = iVar.f2049d;
                if (i6 == i7) {
                    this.f2070f[i3] = f2;
                    return;
                }
                if (iArr[i3] < i7) {
                    i4 = i3;
                }
                i3 = this.f2072h[i3];
                if (i3 == -1) {
                    break;
                }
            }
            b(i4, iVar, f2);
            return;
        }
        a(iVar, true);
    }

    @Override // c.f.a.b.a
    public void a(i iVar, float f2, boolean z) {
        float f3 = f2065m;
        if (f2 <= (-f3) || f2 >= f3) {
            int c2 = c(iVar);
            if (c2 == -1) {
                a(iVar, f2);
                return;
            }
            float[] fArr = this.f2070f;
            fArr[c2] = fArr[c2] + f2;
            float f4 = fArr[c2];
            float f5 = f2065m;
            if (f4 > (-f5) && fArr[c2] < f5) {
                fArr[c2] = 0.0f;
                a(iVar, z);
            }
        }
    }

    @Override // c.f.a.b.a
    public i b(int i2) {
        int i3 = this.f2073i;
        if (i3 == 0) {
            return null;
        }
        int i4 = this.f2074j;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2 && i4 != -1) {
                return this.f2076l.f2015d[this.f2069e[i4]];
            }
            i4 = this.f2072h[i4];
            if (i4 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // c.f.a.b.a
    public void b() {
        int i2 = this.f2073i;
        int i3 = this.f2074j;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f2070f;
            fArr[i3] = fArr[i3] * -1.0f;
            i3 = this.f2072h[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // c.f.a.b.a
    public boolean b(i iVar) {
        return c(iVar) != -1;
    }

    public int c(i iVar) {
        if (!(this.f2073i == 0 || iVar == null)) {
            int i2 = iVar.f2049d;
            int i3 = this.f2067c[i2 % this.f2066b];
            if (i3 == -1) {
                return -1;
            }
            if (this.f2069e[i3] == i2) {
                return i3;
            }
            while (true) {
                int[] iArr = this.f2068d;
                if (iArr[i3] == -1 || this.f2069e[iArr[i3]] == i2) {
                    int[] iArr2 = this.f2068d;
                } else {
                    i3 = iArr[i3];
                }
            }
            int[] iArr22 = this.f2068d;
            if (iArr22[i3] != -1 && this.f2069e[iArr22[i3]] == i2) {
                return iArr22[i3];
            }
        }
        return -1;
    }

    @Override // c.f.a.b.a
    public void clear() {
        int i2 = this.f2073i;
        for (int i3 = 0; i3 < i2; i3++) {
            i b2 = b(i3);
            if (b2 != null) {
                b2.b(this.f2075k);
            }
        }
        for (int i4 = 0; i4 < this.a; i4++) {
            this.f2069e[i4] = -1;
            this.f2068d[i4] = -1;
        }
        for (int i5 = 0; i5 < this.f2066b; i5++) {
            this.f2067c[i5] = -1;
        }
        this.f2073i = 0;
        this.f2074j = -1;
    }

    public String toString() {
        StringBuilder sb;
        String str = hashCode() + " { ";
        int i2 = this.f2073i;
        for (int i3 = 0; i3 < i2; i3++) {
            i b2 = b(i3);
            if (b2 != null) {
                String str2 = str + b2 + " = " + a(i3) + " ";
                int c2 = c(b2);
                String str3 = str2 + "[p: ";
                if (this.f2071g[c2] != -1) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(this.f2076l.f2015d[this.f2069e[this.f2071g[c2]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("none");
                }
                String str4 = sb.toString() + ", n: ";
                str = (this.f2072h[c2] != -1 ? str4 + this.f2076l.f2015d[this.f2069e[this.f2072h[c2]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
