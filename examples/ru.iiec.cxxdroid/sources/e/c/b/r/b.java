package e.c.b.r;

import android.widget.Filter;
import androidx.recyclerview.widget.RecyclerView;
import e.c.b.l;
import e.c.b.t.d;
import g.k;
import g.r.c.p;
import g.r.d.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class b<Model, Item extends l<? extends RecyclerView.e0>> extends Filter {
    private List<Item> a;

    /* renamed from: b  reason: collision with root package name */
    private CharSequence f8157b;

    /* renamed from: c  reason: collision with root package name */
    private d<Item> f8158c;

    /* renamed from: d  reason: collision with root package name */
    private p<? super Item, ? super CharSequence, Boolean> f8159d;

    /* renamed from: e  reason: collision with root package name */
    private final c<Model, Item> f8160e;

    public b(c<Model, Item> cVar) {
        i.d(cVar, "mItemAdapter");
        this.f8160e = cVar;
    }

    public final CharSequence a() {
        return this.f8157b;
    }

    public final void b() {
        performFiltering(null);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        List<Item> list;
        Collection<e.c.b.d<Item>> h2;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        boolean z = false;
        if (this.a == null) {
            if (charSequence == null || charSequence.length() == 0) {
                return filterResults;
            }
        }
        e.c.b.b<Item> c2 = this.f8160e.c();
        if (!(c2 == null || (h2 = c2.h()) == null)) {
            Iterator<T> it = h2.iterator();
            while (it.hasNext()) {
                it.next().a(charSequence);
            }
        }
        this.f8157b = charSequence;
        List<Item> list2 = this.a;
        if (list2 == null) {
            list2 = new ArrayList(this.f8160e.a());
            this.a = list2;
        }
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        }
        if (z) {
            filterResults.values = list2;
            filterResults.count = list2.size();
            this.a = null;
            d<Item> dVar = this.f8158c;
            if (dVar != null) {
                dVar.a();
            }
        } else {
            p<? super Item, ? super CharSequence, Boolean> pVar = this.f8159d;
            if (pVar != null) {
                list = new ArrayList<>();
                for (Item item : list2) {
                    if (pVar.a(item, charSequence).booleanValue()) {
                        list.add(item);
                    }
                }
            } else {
                list = this.f8160e.a();
            }
            filterResults.values = list;
            filterResults.count = list.size();
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        d<Item> dVar;
        i.d(filterResults, "results");
        Object obj = filterResults.values;
        if (obj != null) {
            c<Model, Item> cVar = this.f8160e;
            if (obj != null) {
                cVar.a((List) obj, false, null);
            } else {
                throw new k("null cannot be cast to non-null type kotlin.collections.List<Item>");
            }
        }
        if (this.a != null && (dVar = this.f8158c) != null) {
            Object obj2 = filterResults.values;
            if (obj2 != null) {
                dVar.a(charSequence, (List) obj2);
                return;
            }
            throw new k("null cannot be cast to non-null type kotlin.collections.List<Item>");
        }
    }
}
