package c.f.a.m;

import c.f.a.m.d;
import c.f.a.m.m.c;
import c.f.a.m.m.f;
import c.f.a.m.m.l;
import c.f.a.m.m.n;
import c.f.a.m.m.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class e {
    public static float t0 = 0.5f;
    public float A;
    int B;
    float C;
    private int[] D;
    private float E;
    private boolean F;
    private boolean G;
    private boolean H;
    private int I;
    private int J;
    public d K;
    public d L;
    public d M;
    public d N;
    public d O;
    d P;
    d Q;
    public d R;
    public d[] S;
    protected ArrayList<d> T;
    private boolean[] U;
    public b[] V;
    public e W;
    int X;
    int Y;
    public float Z;
    public boolean a = false;
    protected int a0;

    /* renamed from: b  reason: collision with root package name */
    public c f2128b;
    protected int b0;

    /* renamed from: c  reason: collision with root package name */
    public c f2129c;
    protected int c0;

    /* renamed from: d  reason: collision with root package name */
    public l f2130d = null;
    int d0;

    /* renamed from: e  reason: collision with root package name */
    public n f2131e = null;
    protected int e0;

    /* renamed from: f  reason: collision with root package name */
    public boolean[] f2132f = {true, true};
    protected int f0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2133g = true;
    float g0;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2134h = false;
    float h0;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2135i = true;
    private Object i0;

    /* renamed from: j  reason: collision with root package name */
    private int f2136j = -1;
    private int j0;

    /* renamed from: k  reason: collision with root package name */
    private int f2137k = -1;
    private String k0;

    /* renamed from: l  reason: collision with root package name */
    private boolean f2138l;
    private String l0;

    /* renamed from: m  reason: collision with root package name */
    private boolean f2139m;
    int m0;
    private boolean n;
    int n0;
    private boolean o;
    public float[] o0;
    public int p;
    protected e[] p0;
    public int q;
    protected e[] q0;
    private int r;
    public int r0;
    public int s;
    public int s0;
    public int t;
    public int[] u;
    public int v;
    public int w;
    public float x;
    public int y;
    public int z;

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a = new int[d.b.values().length];

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f2140b = new int[b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0093 */
        static {
            /*
            // Method dump skipped, instructions count: 160
            */
            throw new UnsupportedOperationException("Method not decompiled: c.f.a.m.e.a.<clinit>():void");
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        new c.f.a.l.a(this);
        this.f2138l = false;
        this.f2139m = false;
        this.n = false;
        this.o = false;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = new int[2];
        this.v = 0;
        this.w = 0;
        this.x = 1.0f;
        this.y = 0;
        this.z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = 0.0f;
        this.F = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        this.K = new d(this, d.b.LEFT);
        this.L = new d(this, d.b.TOP);
        this.M = new d(this, d.b.RIGHT);
        this.N = new d(this, d.b.BOTTOM);
        this.O = new d(this, d.b.BASELINE);
        this.P = new d(this, d.b.CENTER_X);
        this.Q = new d(this, d.b.CENTER_Y);
        this.R = new d(this, d.b.CENTER);
        this.S = new d[]{this.K, this.M, this.L, this.N, this.O, this.R};
        this.T = new ArrayList<>();
        this.U = new boolean[2];
        b bVar = b.FIXED;
        this.V = new b[]{bVar, bVar};
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.a0 = -1;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        float f2 = t0;
        this.g0 = f2;
        this.h0 = f2;
        this.j0 = 0;
        this.k0 = null;
        this.l0 = null;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = new float[]{-1.0f, -1.0f};
        this.p0 = new e[]{null, null};
        this.q0 = new e[]{null, null};
        this.r0 = -1;
        this.s0 = -1;
        W();
    }

    private void W() {
        this.T.add(this.K);
        this.T.add(this.L);
        this.T.add(this.M);
        this.T.add(this.N);
        this.T.add(this.P);
        this.T.add(this.Q);
        this.T.add(this.R);
        this.T.add(this.O);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:261:0x045b, code lost:
        if ((r3 instanceof c.f.a.m.a) != false) goto L_0x0460;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0499 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x04e4  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0517 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0553 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:375:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:379:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(c.f.a.d r36, boolean r37, boolean r38, boolean r39, boolean r40, c.f.a.i r41, c.f.a.i r42, c.f.a.m.e.b r43, boolean r44, c.f.a.m.d r45, c.f.a.m.d r46, int r47, int r48, int r49, int r50, float r51, boolean r52, boolean r53, boolean r54, boolean r55, boolean r56, int r57, int r58, int r59, int r60, float r61, boolean r62) {
        /*
        // Method dump skipped, instructions count: 1423
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.m.e.a(c.f.a.d, boolean, boolean, boolean, boolean, c.f.a.i, c.f.a.i, c.f.a.m.e$b, boolean, c.f.a.m.d, c.f.a.m.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private boolean y(int i2) {
        int i3 = i2 * 2;
        d[] dVarArr = this.S;
        if (!(dVarArr[i3].f2114f == null || dVarArr[i3].f2114f.f2114f == dVarArr[i3])) {
            int i4 = i3 + 1;
            return dVarArr[i4].f2114f != null && dVarArr[i4].f2114f.f2114f == dVarArr[i4];
        }
    }

    public int A() {
        int i2 = 0;
        if (this.K != null) {
            i2 = 0 + this.L.f2115g;
        }
        return this.M != null ? i2 + this.N.f2115g : i2;
    }

    public int B() {
        return this.j0;
    }

    public int C() {
        if (this.j0 == 8) {
            return 0;
        }
        return this.X;
    }

    public int D() {
        e eVar = this.W;
        return (eVar == null || !(eVar instanceof f)) ? this.b0 : ((f) eVar).C0 + this.b0;
    }

    public int E() {
        e eVar = this.W;
        return (eVar == null || !(eVar instanceof f)) ? this.c0 : ((f) eVar).D0 + this.c0;
    }

    public boolean F() {
        return this.F;
    }

    public boolean G() {
        int size = this.T.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.T.get(i2).j()) {
                return true;
            }
        }
        return false;
    }

    public boolean H() {
        return (this.f2136j == -1 && this.f2137k == -1) ? false : true;
    }

    public boolean I() {
        return this.n;
    }

    public boolean J() {
        d dVar = this.K;
        d dVar2 = dVar.f2114f;
        if (dVar2 != null && dVar2.f2114f == dVar) {
            return true;
        }
        d dVar3 = this.M;
        d dVar4 = dVar3.f2114f;
        return dVar4 != null && dVar4.f2114f == dVar3;
    }

    public boolean K() {
        return this.G;
    }

    public boolean L() {
        d dVar = this.L;
        d dVar2 = dVar.f2114f;
        if (dVar2 != null && dVar2.f2114f == dVar) {
            return true;
        }
        d dVar3 = this.N;
        d dVar4 = dVar3.f2114f;
        return dVar4 != null && dVar4.f2114f == dVar3;
    }

    public boolean M() {
        return this.H;
    }

    public boolean N() {
        return this.f2133g && this.j0 != 8;
    }

    public boolean O() {
        return this.f2138l || (this.K.k() && this.M.k());
    }

    public boolean P() {
        return this.f2139m || (this.L.k() && this.N.k());
    }

    public boolean Q() {
        return this.o;
    }

    public void R() {
        this.n = true;
    }

    public void S() {
        this.o = true;
    }

    public boolean T() {
        b[] bVarArr = this.V;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public void U() {
        this.K.m();
        this.L.m();
        this.M.m();
        this.N.m();
        this.O.m();
        this.P.m();
        this.Q.m();
        this.R.m();
        this.W = null;
        this.E = 0.0f;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.a0 = -1;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0;
        float f2 = t0;
        this.g0 = f2;
        this.h0 = f2;
        b[] bVarArr = this.V;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.i0 = null;
        this.j0 = 0;
        this.l0 = null;
        this.m0 = 0;
        this.n0 = 0;
        float[] fArr = this.o0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.p = -1;
        this.q = -1;
        int[] iArr = this.D;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.s = 0;
        this.t = 0;
        this.x = 1.0f;
        this.A = 1.0f;
        this.w = Integer.MAX_VALUE;
        this.z = Integer.MAX_VALUE;
        this.v = 0;
        this.y = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.f2132f;
        zArr[0] = true;
        zArr[1] = true;
        this.H = false;
        boolean[] zArr2 = this.U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f2133g = true;
        int[] iArr2 = this.u;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f2136j = -1;
        this.f2137k = -1;
    }

    public void V() {
        this.f2138l = false;
        this.f2139m = false;
        this.n = false;
        this.o = false;
        int size = this.T.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.T.get(i2).n();
        }
    }

    public float a(int i2) {
        if (i2 == 0) {
            return this.g0;
        }
        if (i2 == 1) {
            return this.h0;
        }
        return -1.0f;
    }

    public d a(d.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return this.K;
            case 2:
                return this.L;
            case 3:
                return this.M;
            case 4:
                return this.N;
            case 5:
                return this.O;
            case 6:
                return this.R;
            case 7:
                return this.P;
            case 8:
                return this.Q;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public void a(float f2) {
        this.g0 = f2;
    }

    public void a(int i2, int i3, int i4, float f2) {
        this.s = i2;
        this.v = i3;
        if (i4 == Integer.MAX_VALUE) {
            i4 = 0;
        }
        this.w = i4;
        this.x = f2;
        if (f2 > 0.0f && f2 < 1.0f && this.s == 0) {
            this.s = 2;
        }
    }

    public void a(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        this.b0 = i2;
        this.c0 = i3;
        if (this.j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        if (this.V[0] != b.FIXED || i8 >= (i6 = this.X)) {
            i6 = i8;
        }
        if (this.V[1] != b.FIXED || i9 >= (i7 = this.Y)) {
            i7 = i9;
        }
        this.X = i6;
        this.Y = i7;
        int i10 = this.Y;
        int i11 = this.f0;
        if (i10 < i11) {
            this.Y = i11;
        }
        int i12 = this.X;
        int i13 = this.e0;
        if (i12 < i13) {
            this.X = i13;
        }
        int i14 = this.w;
        if (i14 > 0 && this.V[0] == b.MATCH_CONSTRAINT) {
            this.X = Math.min(this.X, i14);
        }
        int i15 = this.z;
        if (i15 > 0 && this.V[1] == b.MATCH_CONSTRAINT) {
            this.Y = Math.min(this.Y, i15);
        }
        int i16 = this.X;
        if (i6 != i16) {
            this.f2136j = i16;
        }
        int i17 = this.Y;
        if (i7 != i17) {
            this.f2137k = i17;
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i2, boolean z2) {
        this.U[i2] = z2;
    }

    public void a(c.f.a.c cVar) {
        this.K.a(cVar);
        this.L.a(cVar);
        this.M.a(cVar);
        this.N.a(cVar);
        this.O.a(cVar);
        this.R.a(cVar);
        this.P.a(cVar);
        this.Q.a(cVar);
    }

    public void a(c.f.a.d dVar) {
        dVar.a(this.K);
        dVar.a(this.L);
        dVar.a(this.M);
        dVar.a(this.N);
        if (this.d0 > 0) {
            dVar.a(this.O);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:192:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0471 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04a8  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0540  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0543  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x05af  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x05b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(c.f.a.d r51, boolean r52) {
        /*
        // Method dump skipped, instructions count: 1503
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.m.e.a(c.f.a.d, boolean):void");
    }

    public void a(d.b bVar, e eVar, d.b bVar2, int i2, int i3) {
        a(bVar).a(eVar.a(bVar2), i2, i3, true);
    }

    public void a(b bVar) {
        this.V[0] = bVar;
    }

    public void a(e eVar, float f2, int i2) {
        d.b bVar = d.b.CENTER;
        a(bVar, eVar, bVar, i2, 0);
        this.E = f2;
    }

    public void a(f fVar, c.f.a.d dVar, HashSet<e> hashSet, int i2, boolean z2) {
        if (z2) {
            if (hashSet.contains(this)) {
                j.a(fVar, dVar, this);
                hashSet.remove(this);
                a(dVar, fVar.y(64));
            } else {
                return;
            }
        }
        if (i2 == 0) {
            HashSet<d> a2 = this.K.a();
            if (a2 != null) {
                Iterator<d> it = a2.iterator();
                while (it.hasNext()) {
                    it.next().f2112d.a(fVar, dVar, hashSet, i2, true);
                }
            }
            HashSet<d> a3 = this.M.a();
            if (a3 != null) {
                Iterator<d> it2 = a3.iterator();
                while (it2.hasNext()) {
                    it2.next().f2112d.a(fVar, dVar, hashSet, i2, true);
                }
                return;
            }
            return;
        }
        HashSet<d> a4 = this.L.a();
        if (a4 != null) {
            Iterator<d> it3 = a4.iterator();
            while (it3.hasNext()) {
                it3.next().f2112d.a(fVar, dVar, hashSet, i2, true);
            }
        }
        HashSet<d> a5 = this.N.a();
        if (a5 != null) {
            Iterator<d> it4 = a5.iterator();
            while (it4.hasNext()) {
                it4.next().f2112d.a(fVar, dVar, hashSet, i2, true);
            }
        }
        HashSet<d> a6 = this.O.a();
        if (a6 != null) {
            Iterator<d> it5 = a6.iterator();
            while (it5.hasNext()) {
                it5.next().f2112d.a(fVar, dVar, hashSet, i2, true);
            }
        }
    }

    public void a(Object obj) {
        this.i0 = obj;
    }

    public void a(String str) {
        this.k0 = str;
    }

    public void a(boolean z2) {
        this.F = z2;
    }

    public void a(boolean z2, boolean z3) {
        int i2;
        int i3;
        boolean e2 = z2 & this.f2130d.e();
        boolean e3 = z3 & this.f2131e.e();
        l lVar = this.f2130d;
        int i4 = lVar.f2209h.f2174g;
        n nVar = this.f2131e;
        int i5 = nVar.f2209h.f2174g;
        int i6 = lVar.f2210i.f2174g;
        int i7 = nVar.f2210i.f2174g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i4 = 0;
            i7 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (e2) {
            this.b0 = i4;
        }
        if (e3) {
            this.c0 = i5;
        }
        if (this.j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        if (e2) {
            if (this.V[0] != b.FIXED || i9 >= (i3 = this.X)) {
                i3 = i9;
            }
            this.X = i3;
            int i11 = this.X;
            int i12 = this.e0;
            if (i11 < i12) {
                this.X = i12;
            }
        }
        if (e3) {
            if (this.V[1] != b.FIXED || i10 >= (i2 = this.Y)) {
                i2 = i10;
            }
            this.Y = i2;
            int i13 = this.Y;
            int i14 = this.f0;
            if (i13 < i14) {
                this.Y = i14;
            }
        }
    }

    public void a(boolean z2, boolean z3, boolean z4, boolean z5) {
        if (this.B == -1) {
            if (z4 && !z5) {
                this.B = 0;
            } else if (!z4 && z5) {
                this.B = 1;
                if (this.a0 == -1) {
                    this.C = 1.0f / this.C;
                }
            }
        }
        if (this.B == 0 && (!this.L.l() || !this.N.l())) {
            this.B = 1;
        } else if (this.B == 1 && (!this.K.l() || !this.M.l())) {
            this.B = 0;
        }
        if (this.B == -1 && (!this.L.l() || !this.N.l() || !this.K.l() || !this.M.l())) {
            if (this.L.l() && this.N.l()) {
                this.B = 0;
            } else if (this.K.l() && this.M.l()) {
                this.C = 1.0f / this.C;
                this.B = 1;
            }
        }
        if (this.B != -1) {
            return;
        }
        if (this.v > 0 && this.y == 0) {
            this.B = 0;
        } else if (this.v == 0 && this.y > 0) {
            this.C = 1.0f / this.C;
            this.B = 1;
        }
    }

    public boolean a(int i2, int i3) {
        d dVar;
        d dVar2;
        if (i2 == 0) {
            d dVar3 = this.K.f2114f;
            return dVar3 != null && dVar3.k() && (dVar2 = this.M.f2114f) != null && dVar2.k() && (this.M.f2114f.b() - this.M.c()) - (this.K.f2114f.b() + this.K.c()) >= i3;
        }
        d dVar4 = this.L.f2114f;
        return dVar4 != null && dVar4.k() && (dVar = this.N.f2114f) != null && dVar.k() && (this.N.f2114f.b() - this.N.c()) - (this.L.f2114f.b() + this.L.c()) >= i3;
        return false;
    }

    public b b(int i2) {
        if (i2 == 0) {
            return n();
        }
        if (i2 == 1) {
            return z();
        }
        return null;
    }

    public void b(float f2) {
        this.o0[0] = f2;
    }

    public void b(int i2, int i3) {
        if (!this.f2138l) {
            this.K.a(i2);
            this.M.a(i3);
            this.b0 = i2;
            this.X = i3 - i2;
            this.f2138l = true;
        }
    }

    public void b(int i2, int i3, int i4, float f2) {
        this.t = i2;
        this.y = i3;
        if (i4 == Integer.MAX_VALUE) {
            i4 = 0;
        }
        this.z = i4;
        this.A = f2;
        if (f2 > 0.0f && f2 < 1.0f && this.t == 0) {
            this.t = 2;
        }
    }

    public void b(c.f.a.d dVar, boolean z2) {
        n nVar;
        l lVar;
        int b2 = dVar.b(this.K);
        int b3 = dVar.b(this.L);
        int b4 = dVar.b(this.M);
        int b5 = dVar.b(this.N);
        if (z2 && (lVar = this.f2130d) != null) {
            f fVar = lVar.f2209h;
            if (fVar.f2177j) {
                f fVar2 = lVar.f2210i;
                if (fVar2.f2177j) {
                    b2 = fVar.f2174g;
                    b4 = fVar2.f2174g;
                }
            }
        }
        if (z2 && (nVar = this.f2131e) != null) {
            f fVar3 = nVar.f2209h;
            if (fVar3.f2177j) {
                f fVar4 = nVar.f2210i;
                if (fVar4.f2177j) {
                    b3 = fVar3.f2174g;
                    b5 = fVar4.f2174g;
                }
            }
        }
        int i2 = b5 - b3;
        if (b4 - b2 < 0 || i2 < 0 || b2 == Integer.MIN_VALUE || b2 == Integer.MAX_VALUE || b3 == Integer.MIN_VALUE || b3 == Integer.MAX_VALUE || b4 == Integer.MIN_VALUE || b4 == Integer.MAX_VALUE || b5 == Integer.MIN_VALUE || b5 == Integer.MAX_VALUE) {
            b5 = 0;
            b2 = 0;
            b3 = 0;
            b4 = 0;
        }
        a(b2, b3, b4, b5);
    }

    public void b(b bVar) {
        this.V[1] = bVar;
    }

    public void b(e eVar) {
        this.W = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.m.e.b(java.lang.String):void");
    }

    public void b(boolean z2) {
        this.G = z2;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return (this instanceof k) || (this instanceof g);
    }

    public int c(int i2) {
        if (i2 == 0) {
            return C();
        }
        if (i2 == 1) {
            return k();
        }
        return 0;
    }

    public void c(float f2) {
        this.h0 = f2;
    }

    public void c(int i2, int i3) {
        if (!this.f2139m) {
            this.L.a(i2);
            this.N.a(i3);
            this.c0 = i2;
            this.Y = i3 - i2;
            if (this.F) {
                this.O.a(i2 + this.d0);
            }
            this.f2139m = true;
        }
    }

    public void c(boolean z2) {
        this.H = z2;
    }

    public boolean c() {
        return this.j0 != 8;
    }

    public e d(int i2) {
        d dVar;
        d dVar2;
        if (i2 == 0) {
            d dVar3 = this.M;
            d dVar4 = dVar3.f2114f;
            if (dVar4 == null || dVar4.f2114f != dVar3) {
                return null;
            }
            return dVar4.f2112d;
        } else if (i2 == 1 && (dVar2 = (dVar = this.N).f2114f) != null && dVar2.f2114f == dVar) {
            return dVar2.f2112d;
        } else {
            return null;
        }
    }

    public void d() {
        if (this.f2130d == null) {
            this.f2130d = new l(this);
        }
        if (this.f2131e == null) {
            this.f2131e = new n(this);
        }
    }

    public void d(float f2) {
        this.o0[1] = f2;
    }

    public void d(int i2, int i3) {
        this.b0 = i2;
        this.X = i3 - i2;
        int i4 = this.X;
        int i5 = this.e0;
        if (i4 < i5) {
            this.X = i5;
        }
    }

    public void d(boolean z2) {
        this.f2133g = z2;
    }

    public int e() {
        return this.d0;
    }

    public e e(int i2) {
        d dVar;
        d dVar2;
        if (i2 == 0) {
            d dVar3 = this.K;
            d dVar4 = dVar3.f2114f;
            if (dVar4 == null || dVar4.f2114f != dVar3) {
                return null;
            }
            return dVar4.f2112d;
        } else if (i2 == 1 && (dVar2 = (dVar = this.L).f2114f) != null && dVar2.f2114f == dVar) {
            return dVar2.f2112d;
        } else {
            return null;
        }
    }

    public void e(int i2, int i3) {
        this.I = i2;
        this.J = i3;
        d(false);
    }

    public int f() {
        return E() + this.Y;
    }

    public p f(int i2) {
        if (i2 == 0) {
            return this.f2130d;
        }
        if (i2 == 1) {
            return this.f2131e;
        }
        return null;
    }

    public void f(int i2, int i3) {
        this.b0 = i2;
        this.c0 = i3;
    }

    public Object g() {
        return this.i0;
    }

    public void g(int i2, int i3) {
        this.c0 = i2;
        this.Y = i3 - i2;
        int i4 = this.Y;
        int i5 = this.f0;
        if (i4 < i5) {
            this.Y = i5;
        }
    }

    public boolean g(int i2) {
        if (i2 == 0) {
            return (this.K.f2114f != null ? 1 : 0) + (this.M.f2114f != null ? 1 : 0) < 2;
        }
        return ((this.L.f2114f != null ? 1 : 0) + (this.N.f2114f != null ? 1 : 0)) + (this.O.f2114f != null ? 1 : 0) < 2;
    }

    public String h() {
        return this.k0;
    }

    public boolean h(int i2) {
        return this.U[i2];
    }

    public float i() {
        return this.Z;
    }

    public void i(int i2) {
        this.d0 = i2;
        this.F = i2 > 0;
    }

    public int j() {
        return this.a0;
    }

    public void j(int i2) {
        if (this.F) {
            int i3 = i2 - this.d0;
            int i4 = this.Y + i3;
            this.c0 = i3;
            this.L.a(i3);
            this.N.a(i4);
            this.O.a(i2);
            this.f2139m = true;
        }
    }

    public int k() {
        if (this.j0 == 8) {
            return 0;
        }
        return this.Y;
    }

    public void k(int i2) {
        this.K.a(i2);
        this.b0 = i2;
    }

    public float l() {
        return this.g0;
    }

    public void l(int i2) {
        this.L.a(i2);
        this.c0 = i2;
    }

    public int m() {
        return this.m0;
    }

    public void m(int i2) {
        this.Y = i2;
        int i3 = this.Y;
        int i4 = this.f0;
        if (i3 < i4) {
            this.Y = i4;
        }
    }

    public b n() {
        return this.V[0];
    }

    public void n(int i2) {
        this.m0 = i2;
    }

    public int o() {
        d dVar = this.K;
        int i2 = 0;
        if (dVar != null) {
            i2 = 0 + dVar.f2115g;
        }
        d dVar2 = this.M;
        return dVar2 != null ? i2 + dVar2.f2115g : i2;
    }

    public void o(int i2) {
        this.D[1] = i2;
    }

    public int p() {
        return this.I;
    }

    public void p(int i2) {
        this.D[0] = i2;
    }

    public int q() {
        return this.J;
    }

    public void q(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.f0 = i2;
    }

    public int r() {
        return this.D[1];
    }

    public void r(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.e0 = i2;
    }

    public int s() {
        return this.D[0];
    }

    public void s(int i2) {
        this.n0 = i2;
    }

    public int t() {
        return this.f0;
    }

    public void t(int i2) {
        this.j0 = i2;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.l0 != null) {
            str = "type: " + this.l0 + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.k0 != null) {
            str2 = "id: " + this.k0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.b0);
        sb.append(", ");
        sb.append(this.c0);
        sb.append(") - (");
        sb.append(this.X);
        sb.append(" x ");
        sb.append(this.Y);
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        return this.e0;
    }

    public void u(int i2) {
        this.X = i2;
        int i3 = this.X;
        int i4 = this.e0;
        if (i3 < i4) {
            this.X = i4;
        }
    }

    public e v() {
        return this.W;
    }

    public void v(int i2) {
        if (i2 >= 0 && i2 <= 3) {
            this.r = i2;
        }
    }

    public int w() {
        return D() + this.X;
    }

    public void w(int i2) {
        this.b0 = i2;
    }

    public float x() {
        return this.h0;
    }

    public void x(int i2) {
        this.c0 = i2;
    }

    public int y() {
        return this.n0;
    }

    public b z() {
        return this.V[1];
    }
}
