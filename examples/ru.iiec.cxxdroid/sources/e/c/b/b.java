package e.c.b;

import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import e.c.b.l;
import e.c.b.t.f;
import e.c.b.t.g;
import e.c.b.t.h;
import e.c.b.t.i;
import e.c.b.t.j;
import g.r.c.r;
import g.r.c.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class b<Item extends l<? extends RecyclerView.e0>> extends RecyclerView.h<RecyclerView.e0> {
    public static final a w = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<c<Item>> f8146d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private o<Item> f8147e = new e.c.b.u.e();

    /* renamed from: f  reason: collision with root package name */
    private final SparseArray<c<Item>> f8148f = new SparseArray<>();

    /* renamed from: g  reason: collision with root package name */
    private int f8149g;

    /* renamed from: h  reason: collision with root package name */
    private List<e.c.b.t.c<? extends Item>> f8150h;

    /* renamed from: i  reason: collision with root package name */
    private final c.e.a<Class<?>, d<Item>> f8151i = new c.e.a<>();

    /* renamed from: j  reason: collision with root package name */
    private boolean f8152j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8153k = true;

    /* renamed from: l  reason: collision with root package name */
    private final q f8154l = new q("FastAdapter");

    /* renamed from: m  reason: collision with root package name */
    private r<? super View, ? super c<Item>, ? super Item, ? super Integer, Boolean> f8155m;
    private r<? super View, ? super c<Item>, ? super Item, ? super Integer, Boolean> n;
    private r<? super View, ? super c<Item>, ? super Item, ? super Integer, Boolean> o;
    private r<? super View, ? super c<Item>, ? super Item, ? super Integer, Boolean> p;
    private s<? super View, ? super MotionEvent, ? super c<Item>, ? super Item, ? super Integer, Boolean> q;
    private h<Item> r = new i();
    private f s = new g();
    private final e.c.b.t.a<Item> t = new c();
    private final e.c.b.t.e<Item> u = new d();
    private final j<Item> v = new e();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g.r.d.g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final int a(SparseArray<?> sparseArray, int i2) {
            int indexOfKey = sparseArray.indexOfKey(i2);
            return indexOfKey < 0 ? (~indexOfKey) - 1 : indexOfKey;
        }

        public final <Item extends l<? extends RecyclerView.e0>> b<Item> a(RecyclerView.e0 e0Var) {
            View view;
            Object tag = (e0Var == null || (view = e0Var.a) == null) ? null : view.getTag(p.fastadapter_item_adapter);
            if (!(tag instanceof b)) {
                tag = null;
            }
            return (b) tag;
        }

        public final <Item extends l<? extends RecyclerView.e0>, A extends c<Item>> b<Item> a(A a) {
            g.r.d.i.d(a, "adapter");
            b<Item> bVar = new b<>();
            bVar.a(0, a);
            return bVar;
        }

        public final <Item extends l<? extends RecyclerView.e0>> Item a(RecyclerView.e0 e0Var, int i2) {
            b<Item> a = a(e0Var);
            if (a != null) {
                return a.d(i2);
            }
            return null;
        }

        public final <Item extends l<? extends RecyclerView.e0>> Item b(RecyclerView.e0 e0Var) {
            View view;
            Object tag = (e0Var == null || (view = e0Var.a) == null) ? null : view.getTag(p.fastadapter_item);
            if (!(tag instanceof l)) {
                tag = null;
            }
            return (Item) ((l) tag);
        }
    }

    /* renamed from: e.c.b.b$b  reason: collision with other inner class name */
    public static abstract class AbstractC0118b<Item extends l<? extends RecyclerView.e0>> extends RecyclerView.e0 {
        public final void a(Item item) {
            g.r.d.i.d(item, "item");
        }

        public abstract void a(Item item, List<Object> list);

        public final void b(Item item) {
            g.r.d.i.d(item, "item");
        }

        public final boolean c(Item item) {
            g.r.d.i.d(item, "item");
            return false;
        }

        public abstract void d(Item item);
    }

    public static final class c extends e.c.b.t.a<Item> {
        c() {
        }

        @Override // e.c.b.t.a
        public void a(View view, int i2, b<Item> bVar, Item item) {
            c<Item> c2;
            r<View, c<Item>, Item, Integer, Boolean> i3;
            r<View, c<Item>, Item, Integer, Boolean> a;
            r<View, c<Item>, Item, Integer, Boolean> b2;
            g.r.d.i.d(view, "v");
            g.r.d.i.d(bVar, "fastAdapter");
            g.r.d.i.d(item, "item");
            if (item.isEnabled() && (c2 = bVar.c(i2)) != null) {
                boolean z = item instanceof h;
                h hVar = null;
                h hVar2 = (h) (!z ? null : item);
                if (hVar2 == null || (b2 = hVar2.b()) == null || !b2.a(view, c2, item, Integer.valueOf(i2)).booleanValue()) {
                    r<View, c<Item>, Item, Integer, Boolean> k2 = bVar.k();
                    if (k2 == null || !k2.a(view, c2, item, Integer.valueOf(i2)).booleanValue()) {
                        for (d dVar : ((b) bVar).f8151i.values()) {
                            if (dVar.b(view, i2, bVar, item)) {
                                return;
                            }
                        }
                        if (z) {
                            hVar = item;
                        }
                        h hVar3 = hVar;
                        if ((hVar3 == null || (a = hVar3.a()) == null || !a.a(view, c2, item, Integer.valueOf(i2)).booleanValue()) && (i3 = bVar.i()) != null && i3.a(view, c2, item, Integer.valueOf(i2)).booleanValue()) {
                        }
                    }
                }
            }
        }
    }

    public static final class d extends e.c.b.t.e<Item> {
        d() {
        }

        @Override // e.c.b.t.e
        public boolean a(View view, int i2, b<Item> bVar, Item item) {
            c<Item> c2;
            g.r.d.i.d(view, "v");
            g.r.d.i.d(bVar, "fastAdapter");
            g.r.d.i.d(item, "item");
            if (item.isEnabled() && (c2 = bVar.c(i2)) != null) {
                r<View, c<Item>, Item, Integer, Boolean> l2 = bVar.l();
                if (l2 != null && l2.a(view, c2, item, Integer.valueOf(i2)).booleanValue()) {
                    return true;
                }
                for (d dVar : ((b) bVar).f8151i.values()) {
                    if (dVar.a(view, i2, bVar, item)) {
                        return true;
                    }
                }
                r<View, c<Item>, Item, Integer, Boolean> j2 = bVar.j();
                return j2 != null && j2.a(view, c2, item, Integer.valueOf(i2)).booleanValue();
            }
        }
    }

    public static final class e extends j<Item> {
        e() {
        }

        @Override // e.c.b.t.j
        public boolean a(View view, MotionEvent motionEvent, int i2, b<Item> bVar, Item item) {
            c<Item> c2;
            s<View, MotionEvent, c<Item>, Item, Integer, Boolean> m2;
            g.r.d.i.d(view, "v");
            g.r.d.i.d(motionEvent, "event");
            g.r.d.i.d(bVar, "fastAdapter");
            g.r.d.i.d(item, "item");
            for (d dVar : ((b) bVar).f8151i.values()) {
                if (dVar.a(view, motionEvent, i2, bVar, item)) {
                    return true;
                }
            }
            return (bVar.m() == null || (c2 = bVar.c(i2)) == null || (m2 = bVar.m()) == null || !m2.a(view, motionEvent, c2, item, Integer.valueOf(i2)).booleanValue()) ? false : true;
        }
    }

    public b() {
        a(true);
    }

    public static /* synthetic */ void a(b bVar, int i2, int i3, Object obj, int i4, Object obj2) {
        if (obj2 == null) {
            if ((i4 & 4) != 0) {
                obj = null;
            }
            bVar.b(i2, i3, obj);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyAdapterItemRangeChanged");
    }

    private final void a(c<Item> cVar) {
        cVar.a(this);
        cVar.a(cVar.a());
        int i2 = 0;
        for (T t2 : this.f8146d) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                t2.a(i2);
                i2 = i3;
            } else {
                g.o.g.b();
                throw null;
            }
        }
        f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long a(int i2) {
        Item d2 = d(i2);
        return d2 != null ? d2.b() : super.a(i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: A extends e.c.b.c<Item> */
    /* JADX WARN: Multi-variable type inference failed */
    public <A extends c<Item>> b<Item> a(int i2, A a2) {
        g.r.d.i.d(a2, "adapter");
        this.f8146d.add(i2, a2);
        a(a2);
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void a(RecyclerView.e0 e0Var, int i2, List<Object> list) {
        g.r.d.i.d(e0Var, "holder");
        g.r.d.i.d(list, "payloads");
        if (!this.f8152j) {
            if (o()) {
                Log.v("FastAdapter", "onBindViewHolder: " + i2 + "/" + e0Var.j() + " isLegacy: false");
            }
            e0Var.a.setTag(p.fastadapter_item_adapter, this);
            this.s.a(e0Var, i2, list);
        }
        super.a(e0Var, i2, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void a(RecyclerView recyclerView) {
        g.r.d.i.d(recyclerView, "recyclerView");
        this.f8154l.a("onAttachedToRecyclerView");
        super.a(recyclerView);
    }

    public final void a(Item item) {
        g.r.d.i.d(item, "item");
        n().a(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public boolean a(RecyclerView.e0 e0Var) {
        g.r.d.i.d(e0Var, "holder");
        q qVar = this.f8154l;
        qVar.a("onFailedToRecycleView: " + e0Var.j());
        return this.s.b(e0Var, e0Var.g()) || super.a(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int b() {
        return this.f8149g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int b(int i2) {
        Item d2 = d(i2);
        return d2 != null ? d2.a() : super.b(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 b(ViewGroup viewGroup, int i2) {
        g.r.d.i.d(viewGroup, "parent");
        q qVar = this.f8154l;
        qVar.a("onCreateViewHolder: " + i2);
        Item f2 = f(i2);
        RecyclerView.e0 a2 = this.r.a(this, viewGroup, i2, f2);
        a2.a.setTag(p.fastadapter_item_adapter, this);
        if (this.f8153k) {
            e.c.b.t.a<Item> p2 = p();
            View view = a2.a;
            g.r.d.i.a((Object) view, "holder.itemView");
            e.c.b.u.f.a(p2, a2, view);
            e.c.b.t.e<Item> q2 = q();
            View view2 = a2.a;
            g.r.d.i.a((Object) view2, "holder.itemView");
            e.c.b.u.f.a(q2, a2, view2);
            j<Item> r2 = r();
            View view3 = a2.a;
            g.r.d.i.a((Object) view3, "holder.itemView");
            e.c.b.u.f.a(r2, a2, view3);
        }
        this.r.a(this, a2, f2);
        return a2;
    }

    public void b(int i2, int i3, Object obj) {
        for (d<Item> dVar : this.f8151i.values()) {
            dVar.a(i2, i3, obj);
        }
        if (obj == null) {
            a(i2, i3);
        } else {
            a(i2, i3, obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void b(RecyclerView.e0 e0Var) {
        g.r.d.i.d(e0Var, "holder");
        q qVar = this.f8154l;
        qVar.a("onViewAttachedToWindow: " + e0Var.j());
        super.b(e0Var);
        this.s.a(e0Var, e0Var.g());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void b(RecyclerView.e0 e0Var, int i2) {
        g.r.d.i.d(e0Var, "holder");
        if (this.f8152j) {
            if (o()) {
                Log.v("FastAdapter", "onBindViewHolderLegacy: " + i2 + "/" + e0Var.j() + " isLegacy: true");
            }
            e0Var.a.setTag(p.fastadapter_item_adapter, this);
            f fVar = this.s;
            List<Object> emptyList = Collections.emptyList();
            g.r.d.i.a((Object) emptyList, "Collections.emptyList()");
            fVar.a(e0Var, i2, emptyList);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void b(RecyclerView recyclerView) {
        g.r.d.i.d(recyclerView, "recyclerView");
        this.f8154l.a("onDetachedFromRecyclerView");
        super.b(recyclerView);
    }

    public c<Item> c(int i2) {
        if (i2 < 0 || i2 >= this.f8149g) {
            return null;
        }
        this.f8154l.a("getAdapter");
        SparseArray<c<Item>> sparseArray = this.f8148f;
        return sparseArray.valueAt(w.a((a) sparseArray, (SparseArray) i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void c(RecyclerView.e0 e0Var) {
        g.r.d.i.d(e0Var, "holder");
        q qVar = this.f8154l;
        qVar.a("onViewDetachedFromWindow: " + e0Var.j());
        super.c(e0Var);
        this.s.c(e0Var, e0Var.g());
    }

    public Item d(int i2) {
        if (i2 < 0 || i2 >= this.f8149g) {
            return null;
        }
        int a2 = w.a((a) this.f8148f, (SparseArray) i2);
        return this.f8148f.valueAt(a2).b(i2 - this.f8148f.keyAt(a2));
    }

    public void d(int i2, int i3) {
        for (d<Item> dVar : this.f8151i.values()) {
            dVar.a(i2, i3);
        }
        f();
        b(i2, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void d(RecyclerView.e0 e0Var) {
        g.r.d.i.d(e0Var, "holder");
        q qVar = this.f8154l;
        qVar.a("onViewRecycled: " + e0Var.j());
        super.d(e0Var);
        this.s.d(e0Var, e0Var.g());
    }

    public int e(int i2) {
        if (this.f8149g == 0) {
            return 0;
        }
        int min = Math.min(i2, this.f8146d.size());
        int i3 = 0;
        for (int i4 = 0; i4 < min; i4++) {
            i3 += this.f8146d.get(i4).b();
        }
        return i3;
    }

    public int e(RecyclerView.e0 e0Var) {
        g.r.d.i.d(e0Var, "holder");
        return e0Var.g();
    }

    public void e(int i2, int i3) {
        for (d<Item> dVar : this.f8151i.values()) {
            dVar.b(i2, i3);
        }
        f();
        c(i2, i3);
    }

    public final Item f(int i2) {
        return n().get(i2);
    }

    /* access modifiers changed from: protected */
    public final void f() {
        this.f8148f.clear();
        Iterator<c<Item>> it = this.f8146d.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            c<Item> next = it.next();
            if (next.b() > 0) {
                this.f8148f.append(i2, next);
                i2 += next.b();
            }
        }
        if (i2 == 0 && this.f8146d.size() > 0) {
            this.f8148f.append(0, this.f8146d.get(0));
        }
        this.f8149g = i2;
    }

    public final List<e.c.b.t.c<? extends Item>> g() {
        List<e.c.b.t.c<? extends Item>> list = this.f8150h;
        if (list != null) {
            return list;
        }
        LinkedList linkedList = new LinkedList();
        this.f8150h = linkedList;
        return linkedList;
    }

    public final Collection<d<Item>> h() {
        Collection<d<Item>> values = this.f8151i.values();
        g.r.d.i.a((Object) values, "extensionsCache.values");
        return values;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: g.r.c.r<? super android.view.View, ? super e.c.b.c<Item extends e.c.b.l<? extends androidx.recyclerview.widget.RecyclerView$e0>>, ? super Item extends e.c.b.l<? extends androidx.recyclerview.widget.RecyclerView$e0>, ? super java.lang.Integer, java.lang.Boolean>, g.r.c.r<android.view.View, e.c.b.c<Item extends e.c.b.l<? extends androidx.recyclerview.widget.RecyclerView$e0>>, Item extends e.c.b.l<? extends androidx.recyclerview.widget.RecyclerView$e0>, java.lang.Integer, java.lang.Boolean> */
    public final r<View, c<Item>, Item, Integer, Boolean> i() {
        return (r<? super View, ? super c<Item>, ? super Item, ? super Integer, Boolean>) this.n;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: g.r.c.r<? super android.view.View, ? super e.c.b.c<Item extends e.c.b.l<? extends androidx.recyclerview.widget.RecyclerView$e0>>, ? super Item extends e.c.b.l<? extends androidx.recyclerview.widget.RecyclerView$e0>, ? super java.lang.Integer, java.lang.Boolean>, g.r.c.r<android.view.View, e.c.b.c<Item extends e.c.b.l<? extends androidx.recyclerview.widget.RecyclerView$e0>>, Item extends e.c.b.l<? extends androidx.recyclerview.widget.RecyclerView$e0>, java.lang.Integer, java.lang.Boolean> */
    public final r<View, c<Item>, Item, Integer, Boolean> j() {
        return (r<? super View, ? super c<Item>, ? super Item, ? super Integer, Boolean>) this.p;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: g.r.c.r<? super android.view.View, ? super e.c.b.c<Item extends e.c.b.l<? extends androidx.recyclerview.widget.RecyclerView$e0>>, ? super Item extends e.c.b.l<? extends androidx.recyclerview.widget.RecyclerView$e0>, ? super java.lang.Integer, java.lang.Boolean>, g.r.c.r<android.view.View, e.c.b.c<Item extends e.c.b.l<? extends androidx.recyclerview.widget.RecyclerView$e0>>, Item extends e.c.b.l<? extends androidx.recyclerview.widget.RecyclerView$e0>, java.lang.Integer, java.lang.Boolean> */
    public final r<View, c<Item>, Item, Integer, Boolean> k() {
        return (r<? super View, ? super c<Item>, ? super Item, ? super Integer, Boolean>) this.f8155m;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: g.r.c.r<? super android.view.View, ? super e.c.b.c<Item extends e.c.b.l<? extends androidx.recyclerview.widget.RecyclerView$e0>>, ? super Item extends e.c.b.l<? extends androidx.recyclerview.widget.RecyclerView$e0>, ? super java.lang.Integer, java.lang.Boolean>, g.r.c.r<android.view.View, e.c.b.c<Item extends e.c.b.l<? extends androidx.recyclerview.widget.RecyclerView$e0>>, Item extends e.c.b.l<? extends androidx.recyclerview.widget.RecyclerView$e0>, java.lang.Integer, java.lang.Boolean> */
    public final r<View, c<Item>, Item, Integer, Boolean> l() {
        return (r<? super View, ? super c<Item>, ? super Item, ? super Integer, Boolean>) this.o;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: g.r.c.s<? super android.view.View, ? super android.view.MotionEvent, ? super e.c.b.c<Item extends e.c.b.l<? extends androidx.recyclerview.widget.RecyclerView$e0>>, ? super Item extends e.c.b.l<? extends androidx.recyclerview.widget.RecyclerView$e0>, ? super java.lang.Integer, java.lang.Boolean>, g.r.c.s<android.view.View, android.view.MotionEvent, e.c.b.c<Item extends e.c.b.l<? extends androidx.recyclerview.widget.RecyclerView$e0>>, Item extends e.c.b.l<? extends androidx.recyclerview.widget.RecyclerView$e0>, java.lang.Integer, java.lang.Boolean> */
    public final s<View, MotionEvent, c<Item>, Item, Integer, Boolean> m() {
        return (s<? super View, ? super MotionEvent, ? super c<Item>, ? super Item, ? super Integer, Boolean>) this.q;
    }

    public o<Item> n() {
        return this.f8147e;
    }

    public final boolean o() {
        return this.f8154l.a();
    }

    public e.c.b.t.a<Item> p() {
        return this.t;
    }

    public e.c.b.t.e<Item> q() {
        return this.u;
    }

    public j<Item> r() {
        return this.v;
    }

    public void s() {
        for (d<Item> dVar : this.f8151i.values()) {
            dVar.a();
        }
        f();
        e();
    }
}
