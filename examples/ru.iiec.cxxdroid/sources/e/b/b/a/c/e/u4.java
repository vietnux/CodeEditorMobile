package e.b.b.a.c.e;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.google.android.gms.common.internal.y;
import e.b.b.a.c.e.y4;

public final class u4<T extends Context & y4> {
    private final T a;

    public u4(T t) {
        y.a(t);
        this.a = t;
    }

    private final void a(Runnable runnable) {
        d2 a2 = d2.a(this.a);
        a2.c().a(new x4(this, a2, runnable));
    }

    public static boolean a(Context context, boolean z) {
        y.a(context);
        return s5.b(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    private final z0 c() {
        return d2.a(this.a).a();
    }

    public final int a(Intent intent, int i2, int i3) {
        z0 a2 = d2.a(this.a).a();
        if (intent == null) {
            a2.B().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        a2.F().a("Local AppMeasurementService called. startId, action", Integer.valueOf(i3), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            a(new v4(this, i3, a2, intent));
        }
        return 2;
    }

    public final IBinder a(Intent intent) {
        if (intent == null) {
            c().y().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new f2(d2.a(this.a));
        }
        c().B().a("onBind received unknown action", action);
        return null;
    }

    public final void a() {
        d2.a(this.a).a().F().a("Local AppMeasurementService is starting up");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i2, z0 z0Var, Intent intent) {
        if (this.a.a(i2)) {
            z0Var.F().a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i2));
            c().F().a("Completed wakeful intent.");
            this.a.a(intent);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(z0 z0Var, JobParameters jobParameters) {
        z0Var.F().a("AppMeasurementJobService processed last upload request.");
        this.a.a(jobParameters, false);
    }

    @TargetApi(24)
    public final boolean a(JobParameters jobParameters) {
        z0 a2 = d2.a(this.a).a();
        String string = jobParameters.getExtras().getString("action");
        a2.F().a("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        a(new w4(this, a2, jobParameters));
        return true;
    }

    public final void b() {
        d2.a(this.a).a().F().a("Local AppMeasurementService is shutting down");
    }

    public final void b(Intent intent) {
        if (intent == null) {
            c().y().a("onRebind called with null intent");
            return;
        }
        c().F().a("onRebind called. action", intent.getAction());
    }

    public final boolean c(Intent intent) {
        if (intent == null) {
            c().y().a("onUnbind called with null intent");
            return true;
        }
        c().F().a("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
