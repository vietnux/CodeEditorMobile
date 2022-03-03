package c.f.a.m;

import c.f.a.i;
import c.f.a.m.d;
import c.f.a.m.e;

public class g extends e {
    protected float u0 = -1.0f;
    protected int v0 = -1;
    protected int w0 = -1;
    private d x0 = this.L;
    private int y0;
    private boolean z0;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = new int[d.b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
            // Method dump skipped, instructions count: 111
            */
            throw new UnsupportedOperationException("Method not decompiled: c.f.a.m.g.a.<clinit>():void");
        }
    }

    public g() {
        this.y0 = 0;
        this.T.clear();
        this.T.add(this.x0);
        int length = this.S.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.S[i2] = this.x0;
        }
    }

    public void A(int i2) {
        if (i2 > -1) {
            this.u0 = -1.0f;
            this.v0 = -1;
            this.w0 = i2;
        }
    }

    public void B(int i2) {
        if (this.y0 != i2) {
            this.y0 = i2;
            this.T.clear();
            this.x0 = this.y0 == 1 ? this.K : this.L;
            this.T.add(this.x0);
            int length = this.S.length;
            for (int i3 = 0; i3 < length; i3++) {
                this.S[i3] = this.x0;
            }
        }
    }

    @Override // c.f.a.m.e
    public boolean O() {
        return this.z0;
    }

    @Override // c.f.a.m.e
    public boolean P() {
        return this.z0;
    }

    public d W() {
        return this.x0;
    }

    public int X() {
        return this.y0;
    }

    public int Y() {
        return this.v0;
    }

    public int Z() {
        return this.w0;
    }

    @Override // c.f.a.m.e
    public d a(d.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.y0 == 1) {
                    return this.x0;
                }
                break;
            case 3:
            case 4:
                if (this.y0 == 0) {
                    return this.x0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        return null;
    }

    @Override // c.f.a.m.e
    public void a(c.f.a.d dVar, boolean z) {
        f fVar = (f) v();
        if (fVar != null) {
            d a2 = fVar.a(d.b.LEFT);
            d a3 = fVar.a(d.b.RIGHT);
            e eVar = this.W;
            boolean z2 = eVar != null && eVar.V[0] == e.b.WRAP_CONTENT;
            if (this.y0 == 0) {
                a2 = fVar.a(d.b.TOP);
                a3 = fVar.a(d.b.BOTTOM);
                e eVar2 = this.W;
                z2 = eVar2 != null && eVar2.V[1] == e.b.WRAP_CONTENT;
            }
            if (this.z0 && this.x0.k()) {
                i a4 = dVar.a(this.x0);
                dVar.a(a4, this.x0.b());
                if (this.v0 != -1) {
                    if (z2) {
                        dVar.b(dVar.a(a3), a4, 0, 5);
                    }
                } else if (this.w0 != -1 && z2) {
                    i a5 = dVar.a(a3);
                    dVar.b(a4, dVar.a(a2), 0, 5);
                    dVar.b(a5, a4, 0, 5);
                }
                this.z0 = false;
            } else if (this.v0 != -1) {
                i a6 = dVar.a(this.x0);
                dVar.a(a6, dVar.a(a2), this.v0, 8);
                if (z2) {
                    dVar.b(dVar.a(a3), a6, 0, 5);
                }
            } else if (this.w0 != -1) {
                i a7 = dVar.a(this.x0);
                i a8 = dVar.a(a3);
                dVar.a(a7, a8, -this.w0, 8);
                if (z2) {
                    dVar.b(a7, dVar.a(a2), 0, 5);
                    dVar.b(a8, a7, 0, 5);
                }
            } else if (this.u0 != -1.0f) {
                dVar.a(c.f.a.d.a(dVar, dVar.a(this.x0), dVar.a(a3), this.u0));
            }
        }
    }

    public float a0() {
        return this.u0;
    }

    @Override // c.f.a.m.e
    public void b(c.f.a.d dVar, boolean z) {
        if (v() != null) {
            int b2 = dVar.b(this.x0);
            if (this.y0 == 1) {
                w(b2);
                x(0);
                m(v().k());
                u(0);
                return;
            }
            w(0);
            x(b2);
            u(v().C());
            m(0);
        }
    }

    @Override // c.f.a.m.e
    public boolean c() {
        return true;
    }

    public void e(float f2) {
        if (f2 > -1.0f) {
            this.u0 = f2;
            this.v0 = -1;
            this.w0 = -1;
        }
    }

    public void y(int i2) {
        this.x0.a(i2);
        this.z0 = true;
    }

    public void z(int i2) {
        if (i2 > -1) {
            this.u0 = -1.0f;
            this.v0 = i2;
            this.w0 = -1;
        }
    }
}
