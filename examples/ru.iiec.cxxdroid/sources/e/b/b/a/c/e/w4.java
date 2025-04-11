package e.b.b.a.c.e;

import android.app.job.JobParameters;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final u4 f7658b;

    /* renamed from: c  reason: collision with root package name */
    private final z0 f7659c;

    /* renamed from: d  reason: collision with root package name */
    private final JobParameters f7660d;

    w4(u4 u4Var, z0 z0Var, JobParameters jobParameters) {
        this.f7658b = u4Var;
        this.f7659c = z0Var;
        this.f7660d = jobParameters;
    }

    public final void run() {
        this.f7658b.a(this.f7659c, this.f7660d);
    }
}
