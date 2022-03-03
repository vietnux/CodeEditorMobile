package e.c.b;

import androidx.recyclerview.widget.RecyclerView;
import e.c.b.l;
import java.util.List;

public interface n<Item extends l<? extends RecyclerView.e0>> {
    List<Item> a();

    void a(int i2);

    void a(List<? extends Item> list, int i2);

    void a(List<? extends Item> list, int i2, g gVar);

    Item get(int i2);

    int size();
}
