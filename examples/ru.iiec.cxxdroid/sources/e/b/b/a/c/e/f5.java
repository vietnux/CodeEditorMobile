package e.b.b.a.c.e;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;

public final class f5 extends i5 {

    /* renamed from: d  reason: collision with root package name */
    private final AlarmManager f7255d = ((AlarmManager) getContext().getSystemService("alarm"));

    /* renamed from: e  reason: collision with root package name */
    private final f0 f7256e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f7257f;

    protected f5(j5 j5Var) {
        super(j5Var);
        this.f7256e = new g5(this, j5Var.r(), j5Var);
    }

    private final PendingIntent A() {
        Intent className = new Intent().setClassName(getContext(), "com.google.android.gms.measurement.AppMeasurementReceiver");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        return PendingIntent.getBroadcast(getContext(), 0, className, 0);
    }

    @TargetApi(24)
    private final void B() {
        a().F().a("Cancelling job. JobID", Integer.valueOf(z()));
        ((JobScheduler) getContext().getSystemService("jobscheduler")).cancel(z());
    }

    private final int z() {
        if (this.f7257f == null) {
            String valueOf = String.valueOf(getContext().getPackageName());
            this.f7257f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f7257f.intValue();
    }

    public final void a(long j2) {
        v();
        if (!u1.a(getContext())) {
            a().E().a("Receiver not registered/enabled");
        }
        if (!u4.a(getContext(), false)) {
            a().E().a("Service not registered/enabled");
        }
        y();
        long b2 = b().b() + j2;
        if (j2 < Math.max(0L, p0.z.a().longValue()) && !this.f7256e.c()) {
            a().F().a("Scheduling upload with DelayedRunnable");
            this.f7256e.a(j2);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            a().F().a("Scheduling upload with JobScheduler");
            JobInfo.Builder builder = new JobInfo.Builder(z(), new ComponentName(getContext(), "com.google.android.gms.measurement.AppMeasurementJobService"));
            builder.setMinimumLatency(j2);
            builder.setOverrideDeadline(j2 << 1);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            builder.setExtras(persistableBundle);
            JobInfo build = builder.build();
            a().F().a("Scheduling job. JobID", Integer.valueOf(z()));
            ((JobScheduler) getContext().getSystemService("jobscheduler")).schedule(build);
            return;
        }
        a().F().a("Scheduling upload with AlarmManager");
        this.f7255d.setInexactRepeating(2, b2, Math.max(p0.u.a().longValue(), j2), A());
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.i5
    public final boolean w() {
        this.f7255d.cancel(A());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        B();
        return false;
    }

    public final void y() {
        v();
        this.f7255d.cancel(A());
        this.f7256e.a();
        if (Build.VERSION.SDK_INT >= 24) {
            B();
        }
    }
}
