package e.b.c.f;

import android.content.Context;
import e.b.c.a;
import java.util.concurrent.atomic.AtomicReference;

public final class b {
    private static final AtomicReference<b> a = new AtomicReference<>();

    private b(Context context) {
    }

    public static b a(Context context) {
        a.compareAndSet(null, new b(context));
        return a.get();
    }

    public static void a(a aVar) {
    }
}
