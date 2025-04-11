package e.c.b.u;

import androidx.recyclerview.widget.RecyclerView;
import e.c.b.b;
import e.c.b.l;
import e.c.b.n;

public abstract class c<Item extends l<? extends RecyclerView.e0>> implements n<Item> {
    private b<Item> a;

    public final void a(b<Item> bVar) {
        this.a = bVar;
    }

    public final b<Item> b() {
        return this.a;
    }
}
