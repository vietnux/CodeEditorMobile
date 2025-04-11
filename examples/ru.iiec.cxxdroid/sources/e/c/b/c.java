package e.c.b;

import androidx.recyclerview.widget.RecyclerView;
import e.c.b.l;
import java.util.List;

public interface c<Item extends l<? extends RecyclerView.e0>> {
    List<Item> a();

    void a(int i2);

    void a(b<Item> bVar);

    void a(Iterable<? extends Item> iterable);

    int b();

    Item b(int i2);
}
