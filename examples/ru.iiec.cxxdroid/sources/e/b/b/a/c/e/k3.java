package e.b.b.a.c.e;

import com.google.android.gms.measurement.AppMeasurement;

/* access modifiers changed from: package-private */
public final class k3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AppMeasurement.ConditionalUserProperty f7386b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ c3 f7387c;

    k3(c3 c3Var, AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        this.f7387c = c3Var;
        this.f7386b = conditionalUserProperty;
    }

    public final void run() {
        this.f7387c.e(this.f7386b);
    }
}
