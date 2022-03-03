package e.b.b.a.c.e;

import android.content.ComponentName;

final class s4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ o4 f7579b;

    s4(o4 o4Var) {
        this.f7579b = o4Var;
    }

    public final void run() {
        a4 a4Var = this.f7579b.f7483c;
        a4Var.a((a4) new ComponentName(a4Var.getContext(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
