package e.b.b.a.c.e;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* access modifiers changed from: package-private */
public final class s1 implements ServiceConnection {
    final /* synthetic */ q1 a;

    private s1(q1 q1Var) {
        this.a = q1Var;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.a.a.a().B().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            this.a.f7518b = p6.a(iBinder);
            if (this.a.f7518b == null) {
                this.a.a.a().B().a("Install Referrer Service implementation was not found");
                return;
            }
            this.a.a.a().D().a("Install Referrer Service connected");
            this.a.a.c().a(new t1(this));
        } catch (Exception e2) {
            this.a.a.a().B().a("Exception occurred while calling Install Referrer API", e2);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        q1 q1Var = this.a;
        q1Var.f7518b = null;
        q1Var.a.a().D().a("Install Referrer Service disconnected");
    }
}
