package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class b {
    private boolean a;

    /* renamed from: b  reason: collision with root package name */
    private CopyOnWriteArrayList<a> f88b = new CopyOnWriteArrayList<>();

    public b(boolean z) {
        this.a = z;
    }

    public abstract void a();

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f88b.add(aVar);
    }

    public final void a(boolean z) {
        this.a = z;
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar) {
        this.f88b.remove(aVar);
    }

    public final boolean b() {
        return this.a;
    }

    public final void c() {
        Iterator<a> it = this.f88b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
