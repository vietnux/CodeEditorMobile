package e.c.b.u;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import e.c.b.l;
import e.c.b.o;
import g.r.d.i;

public final class e<Item extends l<? extends RecyclerView.e0>> implements o<Item> {
    private final SparseArray<Item> a = new SparseArray<>();

    @Override // e.c.b.o
    public boolean a(Item item) {
        i.d(item, "item");
        if (this.a.indexOfKey(item.a()) >= 0) {
            return false;
        }
        this.a.put(item.a(), item);
        return true;
    }

    @Override // e.c.b.o
    public Item get(int i2) {
        Item item = this.a.get(i2);
        i.a((Object) item, "mTypeInstances.get(type)");
        return item;
    }
}
