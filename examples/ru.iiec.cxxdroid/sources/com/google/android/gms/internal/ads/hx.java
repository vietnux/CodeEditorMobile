package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class hx implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b  reason: collision with root package name */
    private final Application f4565b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f4566c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4567d = false;

    public hx(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f4566c = new WeakReference<>(activityLifecycleCallbacks);
        this.f4565b = application;
    }

    private final void a(px pxVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f4566c.get();
            if (activityLifecycleCallbacks != null) {
                pxVar.a(activityLifecycleCallbacks);
            } else if (!this.f4567d) {
                this.f4565b.unregisterActivityLifecycleCallbacks(this);
                this.f4567d = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new ix(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        a(new ox(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        a(new lx(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        a(new kx(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new nx(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        a(new jx(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        a(new mx(this, activity));
    }
}
