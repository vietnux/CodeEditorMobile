package e.b.b.a.c.b;

import java.util.Arrays;

public final class t extends c0<t> {

    /* renamed from: e  reason: collision with root package name */
    private static volatile t[] f7082e;

    /* renamed from: c  reason: collision with root package name */
    public String f7083c = "";

    /* renamed from: d  reason: collision with root package name */
    public byte[] f7084d = l0.f7053b;

    public t() {
        this.f7030b = null;
        this.a = -1;
    }

    public static t[] d() {
        if (f7082e == null) {
            synchronized (g0.f7047b) {
                if (f7082e == null) {
                    f7082e = new t[0];
                }
            }
        }
        return f7082e;
    }

    @Override // e.b.b.a.c.b.i0
    public final /* synthetic */ i0 a(y yVar) {
        while (true) {
            int d2 = yVar.d();
            if (d2 == 0) {
                return this;
            }
            if (d2 == 10) {
                this.f7083c = yVar.c();
            } else if (d2 == 18) {
                this.f7084d = yVar.b();
            } else if (!super.a(yVar, d2)) {
                return this;
            }
        }
    }

    @Override // e.b.b.a.c.b.c0, e.b.b.a.c.b.i0
    public final void a(z zVar) {
        String str = this.f7083c;
        if (str != null && !str.equals("")) {
            zVar.a(1, this.f7083c);
        }
        if (!Arrays.equals(this.f7084d, l0.f7053b)) {
            zVar.a(2, this.f7084d);
        }
        super.a(zVar);
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.b.c0, e.b.b.a.c.b.i0
    public final int c() {
        int c2 = super.c();
        String str = this.f7083c;
        if (str != null && !str.equals("")) {
            c2 += z.b(1, this.f7083c);
        }
        if (Arrays.equals(this.f7084d, l0.f7053b)) {
            return c2;
        }
        return c2 + z.d(2) + z.c(this.f7084d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        String str = this.f7083c;
        if (str == null) {
            if (tVar.f7083c != null) {
                return false;
            }
        } else if (!str.equals(tVar.f7083c)) {
            return false;
        }
        if (!Arrays.equals(this.f7084d, tVar.f7084d)) {
            return false;
        }
        e0 e0Var = this.f7030b;
        if (e0Var != null && !e0Var.a()) {
            return this.f7030b.equals(tVar.f7030b);
        }
        e0 e0Var2 = tVar.f7030b;
        return e0Var2 == null || e0Var2.a();
    }

    public final int hashCode() {
        int hashCode = (t.class.getName().hashCode() + 527) * 31;
        String str = this.f7083c;
        int i2 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Arrays.hashCode(this.f7084d)) * 31;
        e0 e0Var = this.f7030b;
        if (e0Var != null && !e0Var.a()) {
            i2 = this.f7030b.hashCode();
        }
        return hashCode2 + i2;
    }
}
