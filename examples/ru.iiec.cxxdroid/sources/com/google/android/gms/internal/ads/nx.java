package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class nx implements px {
    private final /* synthetic */ Activity a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f5116b;

    nx(hx hxVar, Activity activity, Bundle bundle) {
        this.a = activity;
        this.f5116b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.a, this.f5116b);
    }
}
