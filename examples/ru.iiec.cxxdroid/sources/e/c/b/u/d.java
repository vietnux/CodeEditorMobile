package e.c.b.u;

import androidx.recyclerview.widget.RecyclerView;
import e.c.b.b;
import e.c.b.l;
import g.r.d.g;
import g.r.d.i;
import java.util.ArrayList;
import java.util.List;

public class d<Item extends l<? extends RecyclerView.e0>> extends c<Item> {

    /* renamed from: b  reason: collision with root package name */
    private List<Item> f8169b;

    public d(List<Item> list) {
        i.d(list, "mItems");
        this.f8169b = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? new ArrayList() : list);
    }

    @Override // e.c.b.n
    public List<Item> a() {
        return this.f8169b;
    }

    @Override // e.c.b.n
    public void a(int i2) {
        int size = this.f8169b.size();
        this.f8169b.clear();
        b<Item> b2 = b();
        if (b2 != null) {
            b2.e(i2, size);
        }
    }

    @Override // e.c.b.n
    public void a(List<? extends Item> list, int i2) {
        i.d(list, "items");
        int size = this.f8169b.size();
        this.f8169b.addAll(list);
        b<Item> b2 = b();
        if (b2 != null) {
            b2.d(i2 + size, list.size());
        }
    }

    @Override // e.c.b.n
    public void a(List<? extends Item> list, int i2, e.c.b.g gVar) {
        i.d(list, "items");
        int size = list.size();
        int size2 = this.f8169b.size();
        List<Item> list2 = this.f8169b;
        if (list != list2) {
            if (!list2.isEmpty()) {
                this.f8169b.clear();
            }
            this.f8169b.addAll(list);
        }
        b<Item> b2 = b();
        if (b2 != null) {
            if (gVar == null) {
                gVar = e.c.b.g.a;
            }
            gVar.a(b2, size, size2, i2);
        }
    }

    @Override // e.c.b.n
    public Item get(int i2) {
        return this.f8169b.get(i2);
    }

    @Override // e.c.b.n
    public int size() {
        return this.f8169b.size();
    }
}
