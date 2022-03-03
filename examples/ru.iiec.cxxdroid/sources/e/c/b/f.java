package e.c.b;

import g.r.d.i;

public final class f implements g {
    f() {
    }

    @Override // e.c.b.g
    public boolean a(b<?> bVar, int i2, int i3, int i4) {
        i.d(bVar, "fastAdapter");
        if (i2 > i3) {
            if (i3 > 0) {
                b.a(bVar, i4, i3, null, 4, null);
            }
            bVar.d(i4 + i3, i2 - i3);
            return false;
        }
        if (1 <= i2 && i3 > i2) {
            b.a(bVar, i4, i2, null, 4, null);
            i4 += i2;
            i3 -= i2;
        } else if (i2 != 0) {
            bVar.s();
            return false;
        }
        bVar.e(i4, i3);
        return false;
    }
}
