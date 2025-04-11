package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e.b.b.a.c.e.u1;
import e.b.b.a.c.e.x1;

public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements x1 {
    private u1 a;

    @Override // e.b.b.a.c.e.x1
    public final BroadcastReceiver.PendingResult a() {
        return goAsync();
    }

    @Override // e.b.b.a.c.e.x1
    public final void a(Context context, Intent intent) {
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.a == null) {
            this.a = new u1(this);
        }
        this.a.a(context, intent);
    }
}
