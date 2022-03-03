package e.c.b.u;

import e.c.b.j;
import e.c.b.k;
import g.r.d.i;
import java.util.List;

public abstract class a<Identifiable extends k> implements j<Identifiable> {
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: e.c.b.u.a<Identifiable extends e.c.b.k> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends Identifiable extends e.c.b.k> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.c.b.j
    public List<Identifiable> a(List<? extends Identifiable> list) {
        i.d(list, "identifiables");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            b((k) list.get(i2));
        }
        return list;
    }

    public Identifiable b(Identifiable identifiable) {
        i.d(identifiable, "identifiable");
        if (identifiable.b() == -1) {
            identifiable.a(a(identifiable));
        }
        return identifiable;
    }
}
