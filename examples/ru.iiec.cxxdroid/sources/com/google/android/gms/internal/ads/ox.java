package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class ox implements px {
    private final /* synthetic */ Activity a;

    ox(hx hxVar, Activity activity) {
        this.a = activity;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.a);
    }
}
