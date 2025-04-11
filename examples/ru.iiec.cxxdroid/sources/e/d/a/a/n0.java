package e.d.a.a;

public class n0 {
    private h0[] a = new h0[4];

    public n0() {
        this.a[0] = new h0(0, 0);
        for (int i2 = 1; i2 < 4; i2++) {
            this.a[i2] = new h0(-1, -1);
        }
    }

    private void b(int i2, int i3) {
        d(3);
        this.a[1] = new h0(i2, i3);
    }

    private boolean c(int i2, int i3) {
        for (int i4 = 1; i4 < 4; i4++) {
            if (this.a[i4].a() == i2) {
                this.a[i4].b(i3);
                return true;
            }
        }
        return false;
    }

    private void d(int i2) {
        if (i2 != 0) {
            h0 h0Var = this.a[i2];
            while (i2 > 1) {
                h0[] h0VarArr = this.a;
                h0VarArr[i2] = h0VarArr[i2 - 1];
                i2--;
            }
            this.a[1] = h0Var;
        }
    }

    public h0 a(int i2) {
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < 4; i5++) {
            int abs = Math.abs(i2 - this.a[i5].b());
            if (abs < i4) {
                i3 = i5;
                i4 = abs;
            }
        }
        h0 h0Var = this.a[i3];
        d(i3);
        return h0Var;
    }

    public void a(int i2, int i3) {
        if (i2 > 0 && !c(i2, i3)) {
            b(i2, i3);
        }
    }

    public h0 b(int i2) {
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < 4; i5++) {
            int abs = Math.abs(i2 - this.a[i5].a());
            if (abs < i4) {
                i3 = i5;
                i4 = abs;
            }
        }
        h0 h0Var = this.a[i3];
        d(i3);
        return h0Var;
    }

    /* access modifiers changed from: protected */
    public final void c(int i2) {
        for (int i3 = 1; i3 < 4; i3++) {
            if (this.a[i3].b() >= i2) {
                this.a[i3] = new h0(-1, -1);
            }
        }
    }
}
