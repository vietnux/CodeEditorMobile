package e.b.b.a.c.e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;

/* access modifiers changed from: package-private */
public final class w1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ d2 f7647b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f7648c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Bundle f7649d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Context f7650e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ z0 f7651f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ BroadcastReceiver.PendingResult f7652g;

    w1(u1 u1Var, d2 d2Var, long j2, Bundle bundle, Context context, z0 z0Var, BroadcastReceiver.PendingResult pendingResult) {
        this.f7647b = d2Var;
        this.f7648c = j2;
        this.f7649d = bundle;
        this.f7650e = context;
        this.f7651f = z0Var;
        this.f7652g = pendingResult;
    }

    public final void run() {
        long a = this.f7647b.i().f7380j.a();
        long j2 = this.f7648c;
        if (a > 0 && (j2 >= a || j2 <= 0)) {
            j2 = a - 1;
        }
        if (j2 > 0) {
            this.f7649d.putLong("click_timestamp", j2);
        }
        this.f7649d.putString("_cis", "referrer broadcast");
        AppMeasurement.getInstance(this.f7650e).logEventInternal("auto", "_cmp", this.f7649d);
        this.f7651f.F().a("Install campaign recorded");
        BroadcastReceiver.PendingResult pendingResult = this.f7652g;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
