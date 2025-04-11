package f.a.a.a.n.c;

import f.a.a.a.n.c.a;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public abstract class g<Params, Progress, Result> extends a<Params, Progress, Result> implements c<m>, j, m, b {
    private final k o = new k();

    /* access modifiers changed from: private */
    public static class a<Result> implements Executor {
        private final Executor a;

        /* renamed from: b  reason: collision with root package name */
        private final g f8479b;

        /* renamed from: f.a.a.a.n.c.g$a$a  reason: collision with other inner class name */
        class C0128a extends i<Result> {
            C0128a(Runnable runnable, Object obj) {
                super(runnable, obj);
            }

            @Override // f.a.a.a.n.c.i
            public <T extends c<m> & j & m> T e() {
                return a.this.f8479b;
            }
        }

        public a(Executor executor, g gVar) {
            this.a = executor;
            this.f8479b = gVar;
        }

        public void execute(Runnable runnable) {
            this.a.execute(new C0128a(runnable, null));
        }
    }

    public void a(m mVar) {
        if (e() == a.h.PENDING) {
            ((c) ((j) h())).a(mVar);
            return;
        }
        throw new IllegalStateException("Must not add Dependency after task is running");
    }

    @Override // f.a.a.a.n.c.m
    public void a(Throwable th) {
        ((m) ((j) h())).a(th);
    }

    public final void a(ExecutorService executorService, Params... paramsArr) {
        super.a(new a(executorService, this), paramsArr);
    }

    @Override // f.a.a.a.n.c.m
    public void a(boolean z) {
        ((m) ((j) h())).a(z);
    }

    @Override // f.a.a.a.n.c.m
    public boolean a() {
        return ((m) ((j) h())).a();
    }

    @Override // f.a.a.a.n.c.c
    public boolean b() {
        return ((c) ((j) h())).b();
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return f.a(this, obj);
    }

    @Override // f.a.a.a.n.c.c
    public Collection<m> d() {
        return ((c) ((j) h())).d();
    }

    public <T extends c<m> & j & m> T h() {
        return this.o;
    }
}
