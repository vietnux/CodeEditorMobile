package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class w00 implements a10 {
    private final /* synthetic */ Activity a;

    w00(r00 r00, Activity activity) {
        this.a = activity;
    }

    @Override // com.google.android.gms.internal.ads.a10
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.a);
    }
}
