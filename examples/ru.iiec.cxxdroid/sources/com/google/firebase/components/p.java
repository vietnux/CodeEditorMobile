package com.google.firebase.components;

import e.b.c.e.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class p implements c {
    private final List<a<?>> a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, r<?>> f6582b = new HashMap();

    public p(Iterable<e> iterable, a<?>... aVarArr) {
        q qVar;
        ArrayList<a> arrayList = new ArrayList();
        for (e eVar : iterable) {
            arrayList.addAll(eVar.getComponents());
        }
        Collections.addAll(arrayList, aVarArr);
        HashMap hashMap = new HashMap(arrayList.size());
        for (a aVar : arrayList) {
            q qVar2 = new q(aVar);
            Iterator it = aVar.a().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls = (Class) it.next();
                    if (hashMap.put(cls, qVar2) != null) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                    }
                }
            }
        }
        for (q qVar3 : hashMap.values()) {
            for (f fVar : qVar3.b().b()) {
                if (fVar.c() && (qVar = (q) hashMap.get(fVar.a())) != null) {
                    qVar3.a(qVar);
                    qVar.b(qVar3);
                }
            }
        }
        HashSet<q> hashSet = new HashSet(hashMap.values());
        HashSet hashSet2 = new HashSet();
        for (q qVar4 : hashSet) {
            if (qVar4.c()) {
                hashSet2.add(qVar4);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        while (!hashSet2.isEmpty()) {
            q qVar5 = (q) hashSet2.iterator().next();
            hashSet2.remove(qVar5);
            arrayList2.add(qVar5.b());
            for (q qVar6 : qVar5.a()) {
                qVar6.c(qVar5);
                if (qVar6.c()) {
                    hashSet2.add(qVar6);
                }
            }
        }
        if (arrayList2.size() == arrayList.size()) {
            Collections.reverse(arrayList2);
            this.a = Collections.unmodifiableList(arrayList2);
            for (a<?> aVar2 : this.a) {
                r<?> rVar = new r<>(aVar2.c(), new u(aVar2.b(), this));
                for (Class<? super Object> cls2 : aVar2.a()) {
                    this.f6582b.put(cls2, rVar);
                }
            }
            for (a<?> aVar3 : this.a) {
                Iterator<f> it2 = aVar3.b().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        f next = it2.next();
                        if (next.b() && !this.f6582b.containsKey(next.a())) {
                            throw new i(String.format("Unsatisfied dependency for component %s: %s", aVar3, next.a()));
                        }
                    }
                }
            }
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        for (q qVar7 : hashSet) {
            if (!qVar7.c() && !qVar7.d()) {
                arrayList3.add(qVar7.b());
            }
        }
        throw new g(arrayList3);
    }

    @Override // com.google.firebase.components.c
    public final Object a(Class cls) {
        return b.a(this, cls);
    }

    public final void a(boolean z) {
        for (a<?> aVar : this.a) {
            if (aVar.d() || (aVar.e() && z)) {
                a(aVar.a().iterator().next());
            }
        }
    }

    @Override // com.google.firebase.components.c
    public final <T> a<T> b(Class<T> cls) {
        t.a(cls, "Null interface requested.");
        return this.f6582b.get(cls);
    }
}
