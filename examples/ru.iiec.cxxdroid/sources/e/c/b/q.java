package e.c.b;

import android.util.Log;
import g.r.d.i;

public final class q {
    private boolean a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8156b;

    public q(String str) {
        i.d(str, "tag");
        this.f8156b = str;
    }

    public final void a(String str) {
        i.d(str, "message");
        if (this.a) {
            Log.v(this.f8156b, str);
        }
    }

    public final boolean a() {
        return this.a;
    }
}
