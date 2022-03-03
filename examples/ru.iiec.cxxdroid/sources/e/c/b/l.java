package e.c.b;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e0;
import java.util.List;

public interface l<VH extends RecyclerView.e0> extends k {
    int a();

    VH a(ViewGroup viewGroup);

    void a(VH vh);

    void a(VH vh, List<Object> list);

    boolean b(VH vh);

    int c();

    void c(VH vh);

    void d(VH vh);

    boolean isEnabled();
}
