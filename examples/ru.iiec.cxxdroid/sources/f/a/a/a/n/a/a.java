package f.a.a.a.n.a;

import android.content.Context;

public abstract class a<T> implements c<T> {
    private final c<T> a;

    public a(c<T> cVar) {
        this.a = cVar;
    }

    private void b(Context context, T t) {
        if (t != null) {
            a(context, (Object) t);
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    public abstract T a(Context context);

    @Override // f.a.a.a.n.a.c
    public final synchronized T a(Context context, d<T> dVar) {
        T a2;
        a2 = a(context);
        if (a2 == null) {
            a2 = this.a != null ? this.a.a(context, dVar) : dVar.a(context);
            b(context, a2);
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public abstract void a(Context context, T t);
}
