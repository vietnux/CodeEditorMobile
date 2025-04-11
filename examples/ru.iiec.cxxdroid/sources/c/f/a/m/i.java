package c.f.a.m;

import c.f.a.m.m.o;
import java.util.ArrayList;
import java.util.Arrays;

public class i extends e implements h {
    public e[] u0 = new e[4];
    public int v0 = 0;

    @Override // c.f.a.m.h
    public void a() {
        this.v0 = 0;
        Arrays.fill(this.u0, (Object) null);
    }

    @Override // c.f.a.m.h
    public void a(e eVar) {
        if (eVar != this && eVar != null) {
            int i2 = this.v0 + 1;
            e[] eVarArr = this.u0;
            if (i2 > eVarArr.length) {
                this.u0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            }
            e[] eVarArr2 = this.u0;
            int i3 = this.v0;
            eVarArr2[i3] = eVar;
            this.v0 = i3 + 1;
        }
    }

    @Override // c.f.a.m.h
    public void a(f fVar) {
    }

    public void a(ArrayList<o> arrayList, int i2, o oVar) {
        for (int i3 = 0; i3 < this.v0; i3++) {
            oVar.a(this.u0[i3]);
        }
        for (int i4 = 0; i4 < this.v0; i4++) {
            c.f.a.m.m.i.a(this.u0[i4], i2, arrayList, oVar);
        }
    }

    public int y(int i2) {
        int i3;
        int i4;
        for (int i5 = 0; i5 < this.v0; i5++) {
            e eVar = this.u0[i5];
            if (i2 == 0 && (i4 = eVar.r0) != -1) {
                return i4;
            }
            if (i2 == 1 && (i3 = eVar.s0) != -1) {
                return i3;
            }
        }
        return -1;
    }
}
