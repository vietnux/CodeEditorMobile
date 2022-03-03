package c.f.a;

import c.f.a.b;
import java.util.Arrays;
import java.util.Comparator;

public class h extends b {

    /* renamed from: g  reason: collision with root package name */
    private int f2041g = 128;

    /* renamed from: h  reason: collision with root package name */
    private i[] f2042h;

    /* renamed from: i  reason: collision with root package name */
    private i[] f2043i;

    /* renamed from: j  reason: collision with root package name */
    private int f2044j;

    /* renamed from: k  reason: collision with root package name */
    b f2045k;

    /* access modifiers changed from: package-private */
    public class a implements Comparator<i> {
        a(h hVar) {
        }

        /* renamed from: a */
        public int compare(i iVar, i iVar2) {
            return iVar.f2049d - iVar2.f2049d;
        }
    }

    class b {
        i a;

        public b(h hVar) {
        }

        public void a(i iVar) {
            this.a = iVar;
        }

        public final boolean a() {
            for (int i2 = 8; i2 >= 0; i2--) {
                float f2 = this.a.f2055j[i2];
                if (f2 > 0.0f) {
                    return false;
                }
                if (f2 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public boolean a(i iVar, float f2) {
            boolean z = true;
            if (this.a.f2047b) {
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr = this.a.f2055j;
                    fArr[i2] = fArr[i2] + (iVar.f2055j[i2] * f2);
                    if (Math.abs(fArr[i2]) < 1.0E-4f) {
                        this.a.f2055j[i2] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    h.this.f(this.a);
                }
                return false;
            }
            for (int i3 = 0; i3 < 9; i3++) {
                float f3 = iVar.f2055j[i3];
                if (f3 != 0.0f) {
                    float f4 = f3 * f2;
                    if (Math.abs(f4) < 1.0E-4f) {
                        f4 = 0.0f;
                    }
                    this.a.f2055j[i3] = f4;
                } else {
                    this.a.f2055j[i3] = 0.0f;
                }
            }
            return true;
        }

        public void b() {
            Arrays.fill(this.a.f2055j, 0.0f);
        }

        public final boolean b(i iVar) {
            int i2 = 8;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                float f2 = iVar.f2055j[i2];
                float f3 = this.a.f2055j[i2];
                if (f3 == f2) {
                    i2--;
                } else if (f3 < f2) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            String str = "[ ";
            if (this.a != null) {
                for (int i2 = 0; i2 < 9; i2++) {
                    str = str + this.a.f2055j[i2] + " ";
                }
            }
            return str + "] " + this.a;
        }
    }

    public h(c cVar) {
        super(cVar);
        int i2 = this.f2041g;
        this.f2042h = new i[i2];
        this.f2043i = new i[i2];
        this.f2044j = 0;
        this.f2045k = new b(this);
    }

    private final void e(i iVar) {
        int i2;
        int i3 = this.f2044j + 1;
        i[] iVarArr = this.f2042h;
        if (i3 > iVarArr.length) {
            this.f2042h = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            i[] iVarArr2 = this.f2042h;
            this.f2043i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f2042h;
        int i4 = this.f2044j;
        iVarArr3[i4] = iVar;
        this.f2044j = i4 + 1;
        int i5 = this.f2044j;
        if (i5 > 1 && iVarArr3[i5 - 1].f2049d > iVar.f2049d) {
            int i6 = 0;
            while (true) {
                i2 = this.f2044j;
                if (i6 >= i2) {
                    break;
                }
                this.f2043i[i6] = this.f2042h[i6];
                i6++;
            }
            Arrays.sort(this.f2043i, 0, i2, new a(this));
            for (int i7 = 0; i7 < this.f2044j; i7++) {
                this.f2042h[i7] = this.f2043i[i7];
            }
        }
        iVar.f2047b = true;
        iVar.a(this);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void f(i iVar) {
        int i2 = 0;
        while (i2 < this.f2044j) {
            if (this.f2042h[i2] == iVar) {
                while (true) {
                    int i3 = this.f2044j;
                    if (i2 < i3 - 1) {
                        i[] iVarArr = this.f2042h;
                        int i4 = i2 + 1;
                        iVarArr[i2] = iVarArr[i4];
                        i2 = i4;
                    } else {
                        this.f2044j = i3 - 1;
                        iVar.f2047b = false;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // c.f.a.d.a, c.f.a.b
    public i a(d dVar, boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.f2044j; i3++) {
            i iVar = this.f2042h[i3];
            if (!zArr[iVar.f2049d]) {
                this.f2045k.a(iVar);
                b bVar = this.f2045k;
                if (i2 == -1) {
                    if (!bVar.a()) {
                    }
                } else if (!bVar.b(this.f2042h[i2])) {
                }
                i2 = i3;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.f2042h[i2];
    }

    @Override // c.f.a.b
    public void a(d dVar, b bVar, boolean z) {
        i iVar = bVar.a;
        if (iVar != null) {
            b.a aVar = bVar.f2011e;
            int a2 = aVar.a();
            for (int i2 = 0; i2 < a2; i2++) {
                i b2 = aVar.b(i2);
                float a3 = aVar.a(i2);
                this.f2045k.a(b2);
                if (this.f2045k.a(iVar, a3)) {
                    e(b2);
                }
                this.f2008b += bVar.f2008b * a3;
            }
            f(iVar);
        }
    }

    @Override // c.f.a.d.a, c.f.a.b
    public void a(i iVar) {
        this.f2045k.a(iVar);
        this.f2045k.b();
        iVar.f2055j[iVar.f2051f] = 1.0f;
        e(iVar);
    }

    @Override // c.f.a.d.a, c.f.a.b
    public void clear() {
        this.f2044j = 0;
        this.f2008b = 0.0f;
    }

    @Override // c.f.a.d.a, c.f.a.b
    public boolean isEmpty() {
        return this.f2044j == 0;
    }

    @Override // c.f.a.b
    public String toString() {
        String str = "" + " goal -> (" + this.f2008b + ") : ";
        for (int i2 = 0; i2 < this.f2044j; i2++) {
            this.f2045k.a(this.f2042h[i2]);
            str = str + this.f2045k + " ";
        }
        return str;
    }
}
