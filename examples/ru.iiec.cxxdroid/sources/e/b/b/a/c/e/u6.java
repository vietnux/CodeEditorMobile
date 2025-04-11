package e.b.b.a.c.e;

import android.database.ContentObserver;
import android.os.Handler;

final class u6 extends ContentObserver {
    private final /* synthetic */ t6 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    u6(t6 t6Var, Handler handler) {
        super(null);
        this.a = t6Var;
    }

    public final void onChange(boolean z) {
        this.a.b();
        t6.a(this.a);
    }
}
