package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class mx implements px {
    private final /* synthetic */ Activity a;

    mx(hx hxVar, Activity activity) {
        this.a = activity;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.a);
    }
}
