package c.f.a.m;

import c.f.a.c;
import java.util.ArrayList;

public class l extends e {
    public ArrayList<e> u0 = new ArrayList<>();

    @Override // c.f.a.m.e
    public void U() {
        this.u0.clear();
        super.U();
    }

    public ArrayList<e> W() {
        return this.u0;
    }

    public void X() {
        ArrayList<e> arrayList = this.u0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = this.u0.get(i2);
                if (eVar instanceof l) {
                    ((l) eVar).X();
                }
            }
        }
    }

    public void Y() {
        this.u0.clear();
    }

    @Override // c.f.a.m.e
    public void a(c cVar) {
        super.a(cVar);
        int size = this.u0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.u0.get(i2).a(cVar);
        }
    }

    public void a(e eVar) {
        this.u0.add(eVar);
        if (eVar.v() != null) {
            ((l) eVar.v()).c(eVar);
        }
        eVar.b(this);
    }

    public void c(e eVar) {
        this.u0.remove(eVar);
        eVar.U();
    }
}
