package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class kx implements px {
    private final /* synthetic */ Activity a;

    kx(hx hxVar, Activity activity) {
        this.a = activity;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.a);
    }
}
