package e.c.b.t;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import e.c.b.b;
import e.c.b.l;
import e.c.b.u.f;
import java.util.List;

public class i<Item extends l<? extends RecyclerView.e0>> implements h<Item> {
    @Override // e.c.b.t.h
    public RecyclerView.e0 a(b<Item> bVar, ViewGroup viewGroup, int i2, Item item) {
        g.r.d.i.d(bVar, "fastAdapter");
        g.r.d.i.d(viewGroup, "parent");
        g.r.d.i.d(item, "typeInstance");
        return item.a(viewGroup);
    }

    @Override // e.c.b.t.h
    public RecyclerView.e0 a(b<Item> bVar, RecyclerView.e0 e0Var, Item item) {
        List<c<Item>> a;
        g.r.d.i.d(bVar, "fastAdapter");
        g.r.d.i.d(e0Var, "viewHolder");
        g.r.d.i.d(item, "typeInstance");
        f.a(bVar.g(), e0Var);
        if (!(item instanceof e.c.b.i)) {
            item = null;
        }
        e.c.b.i iVar = (e.c.b.i) item;
        if (!(iVar == null || (a = iVar.a()) == null)) {
            f.a(a, e0Var);
        }
        return e0Var;
    }
}
