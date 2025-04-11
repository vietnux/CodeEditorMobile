package f.a.a.a.n.c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class k implements c<m>, j, m {

    /* renamed from: b  reason: collision with root package name */
    private final List<m> f8482b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f8483c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<Throwable> f8484d = new AtomicReference<>(null);

    public static boolean b(Object obj) {
        try {
            return (((c) obj) == null || ((m) obj) == null || ((j) obj) == null) ? false : true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public synchronized void a(m mVar) {
        this.f8482b.add(mVar);
    }

    @Override // f.a.a.a.n.c.m
    public void a(Throwable th) {
        this.f8484d.set(th);
    }

    @Override // f.a.a.a.n.c.m
    public synchronized void a(boolean z) {
        this.f8483c.set(z);
    }

    @Override // f.a.a.a.n.c.m
    public boolean a() {
        return this.f8483c.get();
    }

    @Override // f.a.a.a.n.c.c
    public boolean b() {
        for (m mVar : d()) {
            if (!mVar.a()) {
                return false;
            }
        }
        return true;
    }

    @Override // f.a.a.a.n.c.j
    public f c() {
        return f.NORMAL;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return f.a(this, obj);
    }

    @Override // f.a.a.a.n.c.c
    public synchronized Collection<m> d() {
        return Collections.unmodifiableCollection(this.f8482b);
    }
}
