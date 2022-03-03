package e.c.b.t;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import e.c.b.b;
import e.c.b.l;
import e.c.b.p;
import g.k;
import g.r.d.i;
import java.util.List;

public class g<Item extends l<? extends RecyclerView.e0>> implements f {
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: e.c.b.b$b */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.c.b.t.f
    public void a(RecyclerView.e0 e0Var, int i2) {
        i.d(e0Var, "viewHolder");
        l a = b.w.a(e0Var, i2);
        if (a != null) {
            try {
                a.a(e0Var);
                if (!(e0Var instanceof b.AbstractC0118b)) {
                    e0Var = null;
                }
                b.AbstractC0118b bVar = (b.AbstractC0118b) e0Var;
                if (bVar != 0) {
                    bVar.a(a);
                }
            } catch (AbstractMethodError e2) {
                Log.e("FastAdapter", e2.toString());
            }
        }
    }

    @Override // e.c.b.t.f
    public void a(RecyclerView.e0 e0Var, int i2, List<Object> list) {
        Item d2;
        i.d(e0Var, "viewHolder");
        i.d(list, "payloads");
        b<Item> a = b.w.a(e0Var);
        if (a != null && (d2 = a.d(i2)) != null) {
            b.AbstractC0118b bVar = null;
            Item item = !(d2 instanceof l) ? null : d2;
            if (item != null) {
                item.a(e0Var, list);
            }
            if (e0Var instanceof b.AbstractC0118b) {
                bVar = e0Var;
            }
            b.AbstractC0118b bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.a(d2, list);
            }
            e0Var.a.setTag(p.fastadapter_item, d2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: e.c.b.b$b */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.c.b.t.f
    public boolean b(RecyclerView.e0 e0Var, int i2) {
        i.d(e0Var, "viewHolder");
        l b2 = b.w.b(e0Var);
        if (b2 == null) {
            return false;
        }
        boolean b3 = b2.b(e0Var);
        if (!(e0Var instanceof b.AbstractC0118b)) {
            return b3;
        }
        if (!b3) {
            b.AbstractC0118b bVar = (b.AbstractC0118b) e0Var;
            if (b2 == null) {
                throw new k("null cannot be cast to non-null type Item");
            } else if (!bVar.c(b2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: e.c.b.b$b */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.c.b.t.f
    public void c(RecyclerView.e0 e0Var, int i2) {
        i.d(e0Var, "viewHolder");
        l b2 = b.w.b(e0Var);
        if (b2 != null) {
            b2.d(e0Var);
            if (!(e0Var instanceof b.AbstractC0118b)) {
                e0Var = null;
            }
            b.AbstractC0118b bVar = (b.AbstractC0118b) e0Var;
            if (bVar == 0) {
                return;
            }
            if (b2 != null) {
                bVar.b(b2);
                return;
            }
            throw new k("null cannot be cast to non-null type Item");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: e.c.b.b$b */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.c.b.t.f
    public void d(RecyclerView.e0 e0Var, int i2) {
        i.d(e0Var, "viewHolder");
        l b2 = b.w.b(e0Var);
        if (b2 != null) {
            b2.c(e0Var);
            b.AbstractC0118b bVar = (b.AbstractC0118b) (!(e0Var instanceof b.AbstractC0118b) ? null : e0Var);
            if (bVar != 0) {
                bVar.d(b2);
            }
            e0Var.a.setTag(p.fastadapter_item, null);
            e0Var.a.setTag(p.fastadapter_item_adapter, null);
            return;
        }
        Log.e("FastAdapter", "The bindView method of this item should set the `Tag` on its itemView (https://github.com/mikepenz/FastAdapter/blob/develop/library-core/src/main/java/com/mikepenz/fastadapter/items/AbstractItem.java#L189)");
    }
}
