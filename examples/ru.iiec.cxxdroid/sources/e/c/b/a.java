package e.c.b;

import androidx.recyclerview.widget.RecyclerView;
import e.c.b.l;
import java.util.Iterator;

public abstract class a<Item extends l<? extends RecyclerView.e0>> implements c<Item> {
    private b<Item> a;

    /* renamed from: b  reason: collision with root package name */
    private int f8145b = -1;

    @Override // e.c.b.c
    public void a(int i2) {
        this.f8145b = i2;
    }

    @Override // e.c.b.c
    public void a(b<Item> bVar) {
        this.a = bVar;
    }

    @Override // e.c.b.c
    public void a(Iterable<? extends Item> iterable) {
        b<Item> c2 = c();
        if (c2 != null && iterable != null) {
            Iterator<? extends Item> it = iterable.iterator();
            while (it.hasNext()) {
                c2.a((Item) ((l) it.next()));
            }
        }
    }

    public b<Item> c() {
        return this.a;
    }

    public int d() {
        return this.f8145b;
    }
}
