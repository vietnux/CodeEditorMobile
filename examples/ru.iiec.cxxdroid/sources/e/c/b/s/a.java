package e.c.b.s;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e0;
import e.c.b.l;
import g.r.d.i;
import java.util.List;

public abstract class a<VH extends RecyclerView.e0> implements l<VH> {
    private long a = -1;

    /* renamed from: b  reason: collision with root package name */
    private boolean f8166b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8167c;

    public View a(Context context, ViewGroup viewGroup) {
        i.d(context, "ctx");
        View inflate = LayoutInflater.from(context).inflate(c(), viewGroup, false);
        i.a((Object) inflate, "LayoutInflater.from(ctx)…layoutRes, parent, false)");
        return inflate;
    }

    public abstract VH a(View view);

    @Override // e.c.b.l
    public VH a(ViewGroup viewGroup) {
        i.d(viewGroup, "parent");
        Context context = viewGroup.getContext();
        i.a((Object) context, "parent.context");
        return a(a(context, viewGroup));
    }

    @Override // e.c.b.k
    public void a(long j2) {
        this.a = j2;
    }

    @Override // e.c.b.l
    public void a(VH vh) {
        i.d(vh, "holder");
    }

    @Override // e.c.b.l
    public void a(VH vh, List<Object> list) {
        i.d(vh, "holder");
        i.d(list, "payloads");
        View view = vh.a;
        i.a((Object) view, "holder.itemView");
        view.setSelected(d());
    }

    @Override // e.c.b.k
    public long b() {
        return this.a;
    }

    @Override // e.c.b.l
    public boolean b(VH vh) {
        i.d(vh, "holder");
        return false;
    }

    @Override // e.c.b.l
    public void c(VH vh) {
        i.d(vh, "holder");
    }

    @Override // e.c.b.l
    public void d(VH vh) {
        i.d(vh, "holder");
    }

    public boolean d() {
        return this.f8167c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!i.a(getClass(), obj.getClass()))) {
            return false;
        }
        if (!(obj instanceof a)) {
            obj = null;
        }
        a aVar = (a) obj;
        return aVar != null && b() == aVar.b();
    }

    public int hashCode() {
        return Long.valueOf(b()).hashCode();
    }

    @Override // e.c.b.l
    public boolean isEnabled() {
        return this.f8166b;
    }
}
