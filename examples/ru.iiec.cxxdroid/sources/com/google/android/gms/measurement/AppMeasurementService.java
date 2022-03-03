package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import c.o.a.a;
import e.b.b.a.c.e.u4;
import e.b.b.a.c.e.y4;

public final class AppMeasurementService extends Service implements y4 {

    /* renamed from: b  reason: collision with root package name */
    private u4<AppMeasurementService> f6246b;

    private final u4<AppMeasurementService> a() {
        if (this.f6246b == null) {
            this.f6246b = new u4<>(this);
        }
        return this.f6246b;
    }

    @Override // e.b.b.a.c.e.y4
    public final void a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // e.b.b.a.c.e.y4
    public final void a(Intent intent) {
        a.a(intent);
    }

    @Override // e.b.b.a.c.e.y4
    public final boolean a(int i2) {
        return stopSelfResult(i2);
    }

    public final IBinder onBind(Intent intent) {
        return a().a(intent);
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

    public final int onStartCommand(Intent intent, int i2, int i3) {
        return a().a(intent, i2, i3);
    }

    public final boolean onUnbind(Intent intent) {
        return a().c(intent);
    }
}
