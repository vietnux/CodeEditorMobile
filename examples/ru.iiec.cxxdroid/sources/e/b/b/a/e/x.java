package e.b.b.a.e;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.internal.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class x<TResult> extends g<TResult> {
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final v<TResult> f7810b = new v<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f7811c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f7812d;

    /* renamed from: e  reason: collision with root package name */
    private TResult f7813e;

    /* renamed from: f  reason: collision with root package name */
    private Exception f7814f;

    private static class a extends LifecycleCallback {

        /* renamed from: c  reason: collision with root package name */
        private final List<WeakReference<u<?>>> f7815c = new ArrayList();

        private a(h hVar) {
            super(hVar);
            this.f3491b.a("TaskOnStopCallback", this);
        }

        public static a b(Activity activity) {
            h a = LifecycleCallback.a(activity);
            a aVar = (a) a.a("TaskOnStopCallback", a.class);
            return aVar == null ? new a(a) : aVar;
        }

        public final <T> void a(u<T> uVar) {
            synchronized (this.f7815c) {
                this.f7815c.add(new WeakReference<>(uVar));
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void d() {
            synchronized (this.f7815c) {
                for (WeakReference<u<?>> weakReference : this.f7815c) {
                    u<?> uVar = weakReference.get();
                    if (uVar != null) {
                        uVar.cancel();
                    }
                }
                this.f7815c.clear();
            }
        }
    }

    x() {
    }

    private final void g() {
        y.b(this.f7811c, "Task is not yet complete");
    }

    private final void h() {
        y.b(!this.f7811c, "Task is already complete");
    }

    private final void i() {
        if (this.f7812d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void j() {
        synchronized (this.a) {
            if (this.f7811c) {
                this.f7810b.a(this);
            }
        }
    }

    @Override // e.b.b.a.e.g
    public final g<TResult> a(Activity activity, c<TResult> cVar) {
        o oVar = new o(i.a, cVar);
        this.f7810b.a(oVar);
        a.b(activity).a(oVar);
        j();
        return this;
    }

    @Override // e.b.b.a.e.g
    public final g<TResult> a(c<TResult> cVar) {
        a(i.a, cVar);
        return this;
    }

    @Override // e.b.b.a.e.g
    public final <TContinuationResult> g<TContinuationResult> a(Executor executor, a<TResult, TContinuationResult> aVar) {
        x xVar = new x();
        this.f7810b.a(new k(executor, aVar, xVar));
        j();
        return xVar;
    }

    @Override // e.b.b.a.e.g
    public final g<TResult> a(Executor executor, b bVar) {
        this.f7810b.a(new m(executor, bVar));
        j();
        return this;
    }

    public final g<TResult> a(Executor executor, c<TResult> cVar) {
        this.f7810b.a(new o(executor, cVar));
        j();
        return this;
    }

    @Override // e.b.b.a.e.g
    public final g<TResult> a(Executor executor, d dVar) {
        this.f7810b.a(new q(executor, dVar));
        j();
        return this;
    }

    @Override // e.b.b.a.e.g
    public final g<TResult> a(Executor executor, e<? super TResult> eVar) {
        this.f7810b.a(new s(executor, eVar));
        j();
        return this;
    }

    @Override // e.b.b.a.e.g
    public final Exception a() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f7814f;
        }
        return exc;
    }

    @Override // e.b.b.a.e.g
    public final <X extends Throwable> TResult a(Class<X> cls) {
        TResult tresult;
        synchronized (this.a) {
            g();
            i();
            if (cls.isInstance(this.f7814f)) {
                throw cls.cast(this.f7814f);
            } else if (this.f7814f == null) {
                tresult = this.f7813e;
            } else {
                throw new f(this.f7814f);
            }
        }
        return tresult;
    }

    public final void a(Exception exc) {
        y.a(exc, "Exception must not be null");
        synchronized (this.a) {
            h();
            this.f7811c = true;
            this.f7814f = exc;
        }
        this.f7810b.a(this);
    }

    public final void a(TResult tresult) {
        synchronized (this.a) {
            h();
            this.f7811c = true;
            this.f7813e = tresult;
        }
        this.f7810b.a(this);
    }

    @Override // e.b.b.a.e.g
    public final TResult b() {
        TResult tresult;
        synchronized (this.a) {
            g();
            i();
            if (this.f7814f == null) {
                tresult = this.f7813e;
            } else {
                throw new f(this.f7814f);
            }
        }
        return tresult;
    }

    public final boolean b(Exception exc) {
        y.a(exc, "Exception must not be null");
        synchronized (this.a) {
            if (this.f7811c) {
                return false;
            }
            this.f7811c = true;
            this.f7814f = exc;
            this.f7810b.a(this);
            return true;
        }
    }

    public final boolean b(TResult tresult) {
        synchronized (this.a) {
            if (this.f7811c) {
                return false;
            }
            this.f7811c = true;
            this.f7813e = tresult;
            this.f7810b.a(this);
            return true;
        }
    }

    @Override // e.b.b.a.e.g
    public final boolean c() {
        return this.f7812d;
    }

    @Override // e.b.b.a.e.g
    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            z = this.f7811c;
        }
        return z;
    }

    @Override // e.b.b.a.e.g
    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = this.f7811c && !this.f7812d && this.f7814f == null;
        }
        return z;
    }

    public final boolean f() {
        synchronized (this.a) {
            if (this.f7811c) {
                return false;
            }
            this.f7811c = true;
            this.f7812d = true;
            this.f7810b.a(this);
            return true;
        }
    }
}
