package e.b.b.a.c.e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.y;

/* access modifiers changed from: package-private */
public class i1 extends BroadcastReceiver {
    private final j5 a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f7313b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7314c;

    i1(j5 j5Var) {
        y.a(j5Var);
        this.a = j5Var;
    }

    public final void a() {
        this.a.n();
        this.a.e();
        this.a.e();
        if (this.f7313b) {
            this.a.a().F().a("Unregistering connectivity change receiver");
            this.f7313b = false;
            this.f7314c = false;
            try {
                this.a.getContext().unregisterReceiver(this);
            } catch (IllegalArgumentException e2) {
                this.a.a().y().a("Failed to unregister the network broadcast receiver", e2);
            }
        }
    }

    public final void b() {
        this.a.n();
        this.a.e();
        if (!this.f7313b) {
            this.a.getContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f7314c = this.a.m().y();
            this.a.a().F().a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f7314c));
            this.f7313b = true;
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.a.n();
        String action = intent.getAction();
        this.a.a().F().a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean y = this.a.m().y();
            if (this.f7314c != y) {
                this.f7314c = y;
                this.a.c().a(new j1(this, y));
                return;
            }
            return;
        }
        this.a.a().B().a("NetworkBroadcastReceiver received unknown action", action);
    }
}
