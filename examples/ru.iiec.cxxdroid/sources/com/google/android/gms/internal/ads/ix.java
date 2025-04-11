package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class ix implements px {
    private final /* synthetic */ Activity a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f4648b;

    ix(hx hxVar, Activity activity, Bundle bundle) {
        this.a = activity;
        this.f4648b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.a, this.f4648b);
    }
}
