package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.f;

public final class b {
    private final c a;

    /* renamed from: b  reason: collision with root package name */
    private final SavedStateRegistry f1733b = new SavedStateRegistry();

    private b(c cVar) {
        this.a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    public SavedStateRegistry a() {
        return this.f1733b;
    }

    public void a(Bundle bundle) {
        f a2 = this.a.a();
        if (a2.a() == f.c.INITIALIZED) {
            a2.a(new Recreator(this.a));
            this.f1733b.a(a2, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void b(Bundle bundle) {
        this.f1733b.a(bundle);
    }
}
