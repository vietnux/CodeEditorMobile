package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class s00 implements a10 {
    private final /* synthetic */ Activity a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f5487b;

    s00(r00 r00, Activity activity, Bundle bundle) {
        this.a = activity;
        this.f5487b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.a10
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.a, this.f5487b);
    }
}
