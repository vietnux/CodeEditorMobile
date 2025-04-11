package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import c.o.a.a;
import e.b.b.a.c.e.u1;
import e.b.b.a.c.e.x1;

public final class AppMeasurementReceiver extends a implements x1 {

    /* renamed from: c  reason: collision with root package name */
    private u1 f6245c;

    @Override // e.b.b.a.c.e.x1
    public final BroadcastReceiver.PendingResult a() {
        return goAsync();
    }

    @Override // e.b.b.a.c.e.x1
    public final void a(Context context, Intent intent) {
        a.b(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f6245c == null) {
            this.f6245c = new u1(this);
        }
        this.f6245c.a(context, intent);
    }
}
