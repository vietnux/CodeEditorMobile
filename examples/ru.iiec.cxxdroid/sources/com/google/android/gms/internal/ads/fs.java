package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class fs extends ds {

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f4351c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private fs() {
        super();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> a(Object obj, long j2, int i2) {
        bs bsVar;
        List<L> c2 = c(obj, j2);
        if (c2.isEmpty()) {
            List<L> bsVar2 = c2 instanceof cs ? new bs(i2) : new ArrayList<>(i2);
            ju.a(obj, j2, bsVar2);
            return bsVar2;
        }
        if (f4351c.isAssignableFrom(c2.getClass())) {
            ArrayList arrayList = new ArrayList(c2.size() + i2);
            arrayList.addAll(c2);
            bsVar = arrayList;
        } else if (!(c2 instanceof gu)) {
            return c2;
        } else {
            bs bsVar3 = new bs(c2.size() + i2);
            bsVar3.addAll((gu) c2);
            bsVar = bsVar3;
        }
        ju.a(obj, j2, bsVar);
        return bsVar;
    }

    private static <E> List<E> c(Object obj, long j2) {
        return (List) ju.f(obj, j2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ds
    public final <L> List<L> a(Object obj, long j2) {
        return a(obj, j2, 10);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ds
    public final <E> void a(Object obj, Object obj2, long j2) {
        List c2 = c(obj2, j2);
        List a = a(obj, j2, c2.size());
        int size = a.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c2);
        }
        if (size > 0) {
            c2 = a;
        }
        ju.a(obj, j2, c2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ds
    public final void b(Object obj, long j2) {
        Object obj2;
        List list = (List) ju.f(obj, j2);
        if (list instanceof cs) {
            obj2 = ((cs) list).s();
        } else if (!f4351c.isAssignableFrom(list.getClass())) {
            obj2 = Collections.unmodifiableList(list);
        } else {
            return;
        }
        ju.a(obj, j2, obj2);
    }
}
