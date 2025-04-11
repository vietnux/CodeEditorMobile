package e.c.b.r;

import androidx.recyclerview.widget.RecyclerView;
import e.c.b.b;
import e.c.b.j;
import e.c.b.l;
import e.c.b.m;
import e.c.b.n;
import e.c.b.u.d;
import g.k;
import g.r.d.g;
import g.r.d.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class c<Model, Item extends l<? extends RecyclerView.e0>> extends e.c.b.a<Item> implements m<Model, Item> {

    /* renamed from: c  reason: collision with root package name */
    private j<Item> f8161c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8162d;

    /* renamed from: e  reason: collision with root package name */
    private b<Model, Item> f8163e;

    /* renamed from: f  reason: collision with root package name */
    private final n<Item> f8164f;

    /* renamed from: g  reason: collision with root package name */
    private g.r.c.l<? super Model, ? extends Item> f8165g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    static {
        new a(null);
    }

    public c(n<Item> nVar, g.r.c.l<? super Model, ? extends Item> lVar) {
        i.d(nVar, "itemList");
        i.d(lVar, "interceptor");
        this.f8164f = nVar;
        this.f8165g = lVar;
        j<Item> jVar = (j<Item>) j.a;
        if (jVar != null) {
            this.f8161c = jVar;
            this.f8162d = true;
            this.f8163e = new b<>(this);
            return;
        }
        throw new k("null cannot be cast to non-null type com.mikepenz.fastadapter.IIdDistributor<Item>");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(g.r.c.l<? super Model, ? extends Item> lVar) {
        this(new d(null, 1, null), lVar);
        i.d(lVar, "interceptor");
    }

    public Item a(Model model) {
        return (Item) ((l) this.f8165g.a(model));
    }

    public c<Model, Item> a(List<? extends Model> list) {
        i.d(list, "items");
        b(c(list));
        return this;
    }

    public c<Model, Item> a(List<? extends Item> list, boolean z, e.c.b.g gVar) {
        Collection<e.c.b.d<Item>> h2;
        i.d(list, "items");
        if (this.f8162d) {
            f().a(list);
        }
        if (z && g().a() != null) {
            g().b();
        }
        b<Item> c2 = c();
        if (!(c2 == null || (h2 = c2.h()) == null)) {
            Iterator<T> it = h2.iterator();
            while (it.hasNext()) {
                it.next().a(list, z);
            }
        }
        a((Iterable) list);
        b<Item> c3 = c();
        this.f8164f.a(list, c3 != null ? c3.e(d()) : 0, gVar);
        return this;
    }

    @SafeVarargs
    public c<Model, Item> a(Model... modelArr) {
        i.d(modelArr, "items");
        List<? extends Model> asList = Arrays.asList(Arrays.copyOf(modelArr, modelArr.length));
        i.a((Object) asList, "asList(*items)");
        a((List) asList);
        return this;
    }

    @Override // e.c.b.c
    public List<Item> a() {
        return this.f8164f.a();
    }

    @Override // e.c.b.a, e.c.b.c
    public void a(b<Item> bVar) {
        n<Item> nVar = this.f8164f;
        if (nVar instanceof e.c.b.u.c) {
            if (nVar != null) {
                ((e.c.b.u.c) nVar).a(bVar);
            } else {
                throw new k("null cannot be cast to non-null type com.mikepenz.fastadapter.utils.DefaultItemList<Item>");
            }
        }
        super.a((b) bVar);
    }

    @Override // e.c.b.c
    public int b() {
        return this.f8164f.size();
    }

    @Override // e.c.b.c
    public Item b(int i2) {
        Item item = this.f8164f.get(i2);
        if (item != null) {
            return item;
        }
        throw new RuntimeException("A normal ModelAdapter does not allow null items.");
    }

    public c<Model, Item> b(List<? extends Item> list) {
        i.d(list, "items");
        if (this.f8162d) {
            f().a(list);
        }
        b<Item> c2 = c();
        if (c2 != null) {
            this.f8164f.a(list, c2.e(d()));
        } else {
            this.f8164f.a(list, 0);
        }
        a((Iterable) list);
        return this;
    }

    @Override // e.c.b.a
    public b<Item> c() {
        return super.c();
    }

    public List<Item> c(List<? extends Model> list) {
        i.d(list, "models");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Item a2 = a((Object) it.next());
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public c<Model, Item> e() {
        n<Item> nVar = this.f8164f;
        b<Item> c2 = c();
        nVar.a(c2 != null ? c2.e(d()) : 0);
        return this;
    }

    public j<Item> f() {
        return this.f8161c;
    }

    public b<Model, Item> g() {
        return this.f8163e;
    }
}
