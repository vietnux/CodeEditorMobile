package f.a.a.a.n.c;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class i<V> extends FutureTask<V> implements c<m>, j, m, b {

    /* renamed from: b  reason: collision with root package name */
    final Object f8481b;

    public i(Runnable runnable, V v) {
        super(runnable, v);
        this.f8481b = b(runnable);
    }

    public i(Callable<V> callable) {
        super(callable);
        this.f8481b = b(callable);
    }

    public void a(m mVar) {
        ((c) ((j) e())).a(mVar);
    }

    @Override // f.a.a.a.n.c.m
    public void a(Throwable th) {
        ((m) ((j) e())).a(th);
    }

    @Override // f.a.a.a.n.c.m
    public void a(boolean z) {
        ((m) ((j) e())).a(z);
    }

    @Override // f.a.a.a.n.c.m
    public boolean a() {
        return ((m) ((j) e())).a();
    }

    /* access modifiers changed from: protected */
    public <T extends c<m> & j & m> T b(Object obj) {
        return k.b(obj) ? (T) ((c) obj) : new k();
    }

    @Override // f.a.a.a.n.c.c
    public boolean b() {
        return ((c) ((j) e())).b();
    }

    @Override // f.a.a.a.n.c.j
    public f c() {
        return ((j) e()).c();
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return ((j) e()).compareTo(obj);
    }

    @Override // f.a.a.a.n.c.c
    public Collection<m> d() {
        return ((c) ((j) e())).d();
    }

    public <T extends c<m> & j & m> T e() {
        return (T) ((c) this.f8481b);
    }
}
