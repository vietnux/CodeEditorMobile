package c.f.a;

import java.util.Arrays;

public class i implements Comparable<i> {
    private static int r = 1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2047b;

    /* renamed from: c  reason: collision with root package name */
    private String f2048c;

    /* renamed from: d  reason: collision with root package name */
    public int f2049d = -1;

    /* renamed from: e  reason: collision with root package name */
    int f2050e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f2051f = 0;

    /* renamed from: g  reason: collision with root package name */
    public float f2052g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2053h = false;

    /* renamed from: i  reason: collision with root package name */
    float[] f2054i = new float[9];

    /* renamed from: j  reason: collision with root package name */
    float[] f2055j = new float[9];

    /* renamed from: k  reason: collision with root package name */
    a f2056k;

    /* renamed from: l  reason: collision with root package name */
    b[] f2057l = new b[16];

    /* renamed from: m  reason: collision with root package name */
    int f2058m = 0;
    public int n = 0;
    boolean o = false;
    int p = -1;
    float q = 0.0f;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f2056k = aVar;
    }

    static void h() {
        r++;
    }

    /* renamed from: a */
    public int compareTo(i iVar) {
        return this.f2049d - iVar.f2049d;
    }

    public void a() {
        this.f2048c = null;
        this.f2056k = a.UNKNOWN;
        this.f2051f = 0;
        this.f2049d = -1;
        this.f2050e = -1;
        this.f2052g = 0.0f;
        this.f2053h = false;
        this.o = false;
        this.p = -1;
        this.q = 0.0f;
        int i2 = this.f2058m;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f2057l[i3] = null;
        }
        this.f2058m = 0;
        this.n = 0;
        this.f2047b = false;
        Arrays.fill(this.f2055j, 0.0f);
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.f2058m;
            if (i2 >= i3) {
                b[] bVarArr = this.f2057l;
                if (i3 >= bVarArr.length) {
                    this.f2057l = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f2057l;
                int i4 = this.f2058m;
                bVarArr2[i4] = bVar;
                this.f2058m = i4 + 1;
                return;
            } else if (this.f2057l[i2] != bVar) {
                i2++;
            } else {
                return;
            }
        }
    }

    public void a(d dVar, float f2) {
        this.f2052g = f2;
        this.f2053h = true;
        this.o = false;
        this.p = -1;
        this.q = 0.0f;
        int i2 = this.f2058m;
        this.f2050e = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f2057l[i3].a(dVar, this, false);
        }
        this.f2058m = 0;
    }

    public final void a(d dVar, b bVar) {
        int i2 = this.f2058m;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f2057l[i3].a(dVar, bVar, false);
        }
        this.f2058m = 0;
    }

    public void a(a aVar, String str) {
        this.f2056k = aVar;
    }

    public final void b(b bVar) {
        int i2 = this.f2058m;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f2057l[i3] == bVar) {
                while (i3 < i2 - 1) {
                    b[] bVarArr = this.f2057l;
                    int i4 = i3 + 1;
                    bVarArr[i3] = bVarArr[i4];
                    i3 = i4;
                }
                this.f2058m--;
                return;
            }
            i3++;
        }
    }

    public String toString() {
        StringBuilder sb;
        if (this.f2048c != null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f2048c);
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f2049d);
        }
        return sb.toString();
    }
}
