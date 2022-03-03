package e.c.b.t;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import e.c.b.l;
import e.c.b.t.c;
import g.r.d.i;
import java.util.List;

public abstract class b<Item extends l<? extends RecyclerView.e0>> implements c<Item> {
    @Override // e.c.b.t.c
    public View a(RecyclerView.e0 e0Var) {
        i.d(e0Var, "viewHolder");
        return c.a.a(this, e0Var);
    }

    public abstract void a(View view, RecyclerView.e0 e0Var);

    @Override // e.c.b.t.c
    public List<View> b(RecyclerView.e0 e0Var) {
        i.d(e0Var, "viewHolder");
        return c.a.b(this, e0Var);
    }
}
