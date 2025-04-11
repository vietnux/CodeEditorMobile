package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import e.b.b.a.c.e.u4;
import e.b.b.a.c.e.y4;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements y4 {

    /* renamed from: b  reason: collision with root package name */
    private u4<AppMeasurementJobService> f6244b;

    private final u4<AppMeasurementJobService> a() {
        if (this.f6244b == null) {
            this.f6244b = new u4<>(this);
        }
        return this.f6244b;
    }

    @Override // e.b.b.a.c.e.y4
    @TargetApi(24)
    public final void a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // e.b.b.a.c.e.y4
    public final void a(Intent intent) {
    }

    @Override // e.b.b.a.c.e.y4
    public final boolean a(int i2) {
        throw new UnsupportedOperationException();
    }

    public final void onCreate() {
        super.onCreate();
        a().a();
    }

    public final void onDestroy() {
        a().b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        a().b(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return a().a(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return a().c(intent);
    }
}
