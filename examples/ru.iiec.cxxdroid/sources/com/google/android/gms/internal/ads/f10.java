package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.ads.internal.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
@TargetApi(14)
public final class f10 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b  reason: collision with root package name */
    private Activity f4250b;

    /* renamed from: c  reason: collision with root package name */
    private Context f4251c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f4252d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private boolean f4253e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4254f = false;

    /* renamed from: g  reason: collision with root package name */
    private final List<h10> f4255g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List<u10> f4256h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private Runnable f4257i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f4258j = false;

    /* renamed from: k  reason: collision with root package name */
    private long f4259k;

    f10() {
    }

    private final void a(Activity activity) {
        synchronized (this.f4252d) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f4250b = activity;
            }
        }
    }

    public final Activity a() {
        return this.f4250b;
    }

    public final void a(Application application, Context context) {
        if (!this.f4258j) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                a((Activity) context);
            }
            this.f4251c = application;
            this.f4259k = ((Long) a50.g().a(k80.F0)).longValue();
            this.f4258j = true;
        }
    }

    public final void a(h10 h10) {
        synchronized (this.f4252d) {
            this.f4255g.add(h10);
        }
    }

    public final Context b() {
        return this.f4251c;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f4252d) {
            if (this.f4250b != null) {
                if (this.f4250b.equals(activity)) {
                    this.f4250b = null;
                }
                Iterator<u10> it = this.f4256h.iterator();
                while (it.hasNext()) {
                    try {
                        if (it.next().a(activity)) {
                            it.remove();
                        }
                    } catch (Exception e2) {
                        x0.j().a(e2, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        qc.b("", e2);
                    }
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        a(activity);
        synchronized (this.f4252d) {
            for (u10 u10 : this.f4256h) {
                try {
                    u10.onActivityPaused(activity);
                } catch (Exception e2) {
                    x0.j().a(e2, "AppActivityTracker.ActivityListener.onActivityPaused");
                    qc.b("", e2);
                }
            }
        }
        this.f4254f = true;
        Runnable runnable = this.f4257i;
        if (runnable != null) {
            u9.f5718h.removeCallbacks(runnable);
        }
        Handler handler = u9.f5718h;
        g10 g10 = new g10(this);
        this.f4257i = g10;
        handler.postDelayed(g10, this.f4259k);
    }

    public final void onActivityResumed(Activity activity) {
        a(activity);
        this.f4254f = false;
        boolean z = !this.f4253e;
        this.f4253e = true;
        Runnable runnable = this.f4257i;
        if (runnable != null) {
            u9.f5718h.removeCallbacks(runnable);
        }
        synchronized (this.f4252d) {
            for (u10 u10 : this.f4256h) {
                try {
                    u10.onActivityResumed(activity);
                } catch (Exception e2) {
                    x0.j().a(e2, "AppActivityTracker.ActivityListener.onActivityResumed");
                    qc.b("", e2);
                }
            }
            if (z) {
                for (h10 h10 : this.f4255g) {
                    try {
                        h10.a(true);
                    } catch (Exception e3) {
                        qc.b("", e3);
                    }
                }
            } else {
                qc.b("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }
}
