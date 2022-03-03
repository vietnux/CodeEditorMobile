package f.a.a.a;

import android.content.Context;
import f.a.a.a.n.b.p;
import f.a.a.a.n.c.e;
import f.a.a.a.n.c.m;
import java.io.File;
import java.util.Collection;

public abstract class i<Result> implements Comparable<i> {

    /* renamed from: b  reason: collision with root package name */
    c f8356b;

    /* renamed from: c  reason: collision with root package name */
    h<Result> f8357c = new h<>(this);

    /* renamed from: d  reason: collision with root package name */
    Context f8358d;

    /* renamed from: e  reason: collision with root package name */
    f<Result> f8359e;

    /* renamed from: f  reason: collision with root package name */
    p f8360f;

    /* renamed from: g  reason: collision with root package name */
    final e f8361g = ((e) getClass().getAnnotation(e.class));

    /* renamed from: a */
    public int compareTo(i iVar) {
        if (b(iVar)) {
            return 1;
        }
        if (iVar.b((i) this)) {
            return -1;
        }
        if (!q() || iVar.q()) {
            return (q() || !iVar.q()) ? 0 : -1;
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, c cVar, f<Result> fVar, p pVar) {
        this.f8356b = cVar;
        this.f8358d = new d(context, n(), o());
        this.f8359e = fVar;
        this.f8360f = pVar;
    }

    /* access modifiers changed from: protected */
    public void a(Result result) {
    }

    /* access modifiers changed from: protected */
    public void b(Result result) {
    }

    /* access modifiers changed from: package-private */
    public boolean b(i iVar) {
        if (q()) {
            for (Class<?> cls : this.f8361g.value()) {
                if (cls.isAssignableFrom(iVar.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract Result i();

    public Context j() {
        return this.f8358d;
    }

    /* access modifiers changed from: protected */
    public Collection<m> k() {
        return this.f8357c.d();
    }

    public c l() {
        return this.f8356b;
    }

    /* access modifiers changed from: protected */
    public p m() {
        return this.f8360f;
    }

    public abstract String n();

    public String o() {
        return ".Fabric" + File.separator + n();
    }

    public abstract String p();

    /* access modifiers changed from: package-private */
    public boolean q() {
        return this.f8361g != null;
    }

    /* access modifiers changed from: package-private */
    public final void r() {
        this.f8357c.a(this.f8356b.c(), (Object[]) new Void[]{null});
    }

    /* access modifiers changed from: protected */
    public boolean s() {
        return true;
    }
}
