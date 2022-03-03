package androidx.coordinatorlayout.widget;

import c.e.g;
import c.h.k.e;
import c.h.k.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class a<T> {
    private final e<ArrayList<T>> a = new f(10);

    /* renamed from: b  reason: collision with root package name */
    private final g<T, ArrayList<T>> f984b = new g<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<T> f985c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<T> f986d = new HashSet<>();

    private void a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList<T> arrayList2 = this.f984b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        a(arrayList2.get(i2), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    private void a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.a.a(arrayList);
    }

    private ArrayList<T> c() {
        ArrayList<T> a2 = this.a.a();
        return a2 == null ? new ArrayList<>() : a2;
    }

    public void a() {
        int size = this.f984b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> d2 = this.f984b.d(i2);
            if (d2 != null) {
                a((ArrayList) d2);
            }
        }
        this.f984b.clear();
    }

    public void a(T t) {
        if (!this.f984b.containsKey(t)) {
            this.f984b.put(t, null);
        }
    }

    public void a(T t, T t2) {
        if (!this.f984b.containsKey(t) || !this.f984b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.f984b.get(t);
        if (arrayList == null) {
            arrayList = c();
            this.f984b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    public ArrayList<T> b() {
        this.f985c.clear();
        this.f986d.clear();
        int size = this.f984b.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(this.f984b.b(i2), this.f985c, this.f986d);
        }
        return this.f985c;
    }

    public boolean b(T t) {
        return this.f984b.containsKey(t);
    }

    public List c(T t) {
        return this.f984b.get(t);
    }

    public List<T> d(T t) {
        int size = this.f984b.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> d2 = this.f984b.d(i2);
            if (d2 != null && d2.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f984b.b(i2));
            }
        }
        return arrayList;
    }

    public boolean e(T t) {
        int size = this.f984b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> d2 = this.f984b.d(i2);
            if (d2 != null && d2.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
