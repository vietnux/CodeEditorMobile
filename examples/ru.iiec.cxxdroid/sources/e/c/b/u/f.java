package e.c.b.u;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import e.c.b.l;
import e.c.b.p;
import e.c.b.t.e;
import e.c.b.t.j;
import g.k;
import g.r.d.i;
import java.util.Iterator;
import java.util.List;

public final class f {

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.c.b.t.c f8170b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecyclerView.e0 f8171c;

        a(e.c.b.t.c cVar, RecyclerView.e0 e0Var) {
            this.f8170b = cVar;
            this.f8171c = e0Var;
        }

        public final void onClick(View view) {
            int e2;
            l b2;
            Object tag = this.f8171c.a.getTag(p.fastadapter_item_adapter);
            if (!(tag instanceof e.c.b.b)) {
                tag = null;
            }
            e.c.b.b bVar = (e.c.b.b) tag;
            if (bVar != null && (e2 = bVar.e(this.f8171c)) != -1 && (b2 = e.c.b.b.w.b(this.f8171c)) != null) {
                e.c.b.t.c cVar = this.f8170b;
                if (cVar != null) {
                    i.a((Object) view, "v");
                    ((e.c.b.t.a) cVar).a(view, e2, bVar, b2);
                    return;
                }
                throw new k("null cannot be cast to non-null type com.mikepenz.fastadapter.listeners.ClickEventHook<Item>");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.c.b.t.c f8172b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecyclerView.e0 f8173c;

        b(e.c.b.t.c cVar, RecyclerView.e0 e0Var) {
            this.f8172b = cVar;
            this.f8173c = e0Var;
        }

        public final boolean onLongClick(View view) {
            int e2;
            l b2;
            Object tag = this.f8173c.a.getTag(p.fastadapter_item_adapter);
            if (!(tag instanceof e.c.b.b)) {
                tag = null;
            }
            e.c.b.b bVar = (e.c.b.b) tag;
            if (bVar == null || (e2 = bVar.e(this.f8173c)) == -1 || (b2 = e.c.b.b.w.b(this.f8173c)) == null) {
                return false;
            }
            e.c.b.t.c cVar = this.f8172b;
            if (cVar != null) {
                i.a((Object) view, "v");
                return ((e) cVar).a(view, e2, bVar, b2);
            }
            throw new k("null cannot be cast to non-null type com.mikepenz.fastadapter.listeners.LongClickEventHook<Item>");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnTouchListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e.c.b.t.c f8174b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecyclerView.e0 f8175c;

        c(e.c.b.t.c cVar, RecyclerView.e0 e0Var) {
            this.f8174b = cVar;
            this.f8175c = e0Var;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int e2;
            l b2;
            Object tag = this.f8175c.a.getTag(p.fastadapter_item_adapter);
            if (!(tag instanceof e.c.b.b)) {
                tag = null;
            }
            e.c.b.b bVar = (e.c.b.b) tag;
            if (bVar == null || (e2 = bVar.e(this.f8175c)) == -1 || (b2 = e.c.b.b.w.b(this.f8175c)) == null) {
                return false;
            }
            e.c.b.t.c cVar = this.f8174b;
            if (cVar != null) {
                i.a((Object) view, "v");
                i.a((Object) motionEvent, "e");
                return ((j) cVar).a(view, motionEvent, e2, bVar, b2);
            }
            throw new k("null cannot be cast to non-null type com.mikepenz.fastadapter.listeners.TouchEventHook<Item>");
        }
    }

    public static final <Item extends l<? extends RecyclerView.e0>> void a(e.c.b.t.c<Item> cVar, RecyclerView.e0 e0Var, View view) {
        i.d(cVar, "$this$attachToView");
        i.d(e0Var, "viewHolder");
        i.d(view, "view");
        if (cVar instanceof e.c.b.t.a) {
            view.setOnClickListener(new a(cVar, e0Var));
        } else if (cVar instanceof e) {
            view.setOnLongClickListener(new b(cVar, e0Var));
        } else if (cVar instanceof j) {
            view.setOnTouchListener(new c(cVar, e0Var));
        } else if (cVar instanceof e.c.b.t.b) {
            ((e.c.b.t.b) cVar).a(view, e0Var);
        }
    }

    public static final void a(List<? extends e.c.b.t.c<? extends l<? extends RecyclerView.e0>>> list, RecyclerView.e0 e0Var) {
        i.d(list, "$this$bind");
        i.d(e0Var, "viewHolder");
        Iterator<? extends e.c.b.t.c<? extends l<? extends RecyclerView.e0>>> it = list.iterator();
        while (it.hasNext()) {
            e.c.b.t.c cVar = (e.c.b.t.c) it.next();
            View a2 = cVar.a(e0Var);
            if (a2 != null) {
                a(cVar, e0Var, a2);
            }
            List<View> b2 = cVar.b(e0Var);
            if (b2 != null) {
                for (View view : b2) {
                    a(cVar, e0Var, view);
                }
            }
        }
    }
}
