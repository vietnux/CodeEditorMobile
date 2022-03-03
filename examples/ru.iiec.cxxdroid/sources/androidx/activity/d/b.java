package androidx.activity.d;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class b {
    private final Set<c> a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private volatile Context f89b;

    public void a() {
        this.f89b = null;
    }

    public void a(Context context) {
        this.f89b = context;
        for (c cVar : this.a) {
            cVar.a(context);
        }
    }

    public void a(c cVar) {
        if (this.f89b != null) {
            cVar.a(this.f89b);
        }
        this.a.add(cVar);
    }
}
