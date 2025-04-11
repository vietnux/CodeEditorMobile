package e.c.b;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import e.c.b.l;
import java.util.List;

public interface d<Item extends l<? extends RecyclerView.e0>> {
    void a();

    void a(int i2, int i3);

    void a(int i2, int i3, Object obj);

    void a(CharSequence charSequence);

    void a(List<? extends Item> list, boolean z);

    boolean a(View view, int i2, b<Item> bVar, Item item);

    boolean a(View view, MotionEvent motionEvent, int i2, b<Item> bVar, Item item);

    void b(int i2, int i3);

    boolean b(View view, int i2, b<Item> bVar, Item item);
}
