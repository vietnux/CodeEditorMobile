package e.b.b.a.c.e;

import com.google.android.gms.measurement.AppMeasurement;

/* access modifiers changed from: package-private */
public final class j3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AppMeasurement.ConditionalUserProperty f7350b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ c3 f7351c;

    j3(c3 c3Var, AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        this.f7351c = c3Var;
        this.f7350b = conditionalUserProperty;
    }

    public final void run() {
        this.f7351c.d(this.f7350b);
    }
}
