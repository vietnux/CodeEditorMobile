package e.c.b.t;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import e.c.b.l;
import g.r.d.i;
import java.util.List;

public interface c<Item extends l<? extends RecyclerView.e0>> {

    public static final class a {
        public static <Item extends l<? extends RecyclerView.e0>> View a(c<Item> cVar, RecyclerView.e0 e0Var) {
            i.d(e0Var, "viewHolder");
            return null;
        }

        public static <Item extends l<? extends RecyclerView.e0>> List<View> b(c<Item> cVar, RecyclerView.e0 e0Var) {
            i.d(e0Var, "viewHolder");
            return null;
        }
    }

    View a(RecyclerView.e0 e0Var);

    List<View> b(RecyclerView.e0 e0Var);
}
