package e.c.b.t;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import e.c.b.b;
import e.c.b.l;
import e.c.b.t.c;
import g.r.d.i;
import java.util.List;

public abstract class j<Item extends l<? extends RecyclerView.e0>> implements c<Item> {
    @Override // e.c.b.t.c
    public View a(RecyclerView.e0 e0Var) {
        i.d(e0Var, "viewHolder");
        return c.a.a(this, e0Var);
    }

    public abstract boolean a(View view, MotionEvent motionEvent, int i2, b<Item> bVar, Item item);

    @Override // e.c.b.t.c
    public List<View> b(RecyclerView.e0 e0Var) {
        i.d(e0Var, "viewHolder");
        return c.a.b(this, e0Var);
    }
}
