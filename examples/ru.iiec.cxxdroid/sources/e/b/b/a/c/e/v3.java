package e.b.b.a.c.e;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* access modifiers changed from: package-private */
@TargetApi(14)
public final class v3 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ c3 f7626b;

    private v3(c3 c3Var) {
        this.f7626b = c3Var;
    }

    /* synthetic */ v3(c3 c3Var, d3 d3Var) {
        this(c3Var);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Uri data;
        try {
            this.f7626b.a().F().a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (!(intent == null || (data = intent.getData()) == null || !data.isHierarchical())) {
                if (bundle == null) {
                    Bundle a = this.f7626b.o().a(data);
                    this.f7626b.o();
                    String str = s5.a(intent) ? "gs" : "auto";
                    if (a != null) {
                        this.f7626b.b(str, "_cmp", a);
                    }
                }
                String queryParameter = data.getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (!(queryParameter.contains("gclid") && (queryParameter.contains("utm_campaign") || queryParameter.contains("utm_source") || queryParameter.contains("utm_medium") || queryParameter.contains("utm_term") || queryParameter.contains("utm_content")))) {
                        this.f7626b.a().E().a("Activity created with data 'referrer' param without gclid and at least one utm field");
                        return;
                    }
                    this.f7626b.a().E().a("Activity created with referrer", queryParameter);
                    if (!TextUtils.isEmpty(queryParameter)) {
                        this.f7626b.a("auto", "_ldl", (Object) queryParameter);
                    }
                } else {
                    return;
                }
            }
        } catch (Exception e2) {
            this.f7626b.a().y().a("Throwable caught in onActivityCreated", e2);
        }
        this.f7626b.l().a(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f7626b.l().a(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f7626b.l().b(activity);
        z4 p = this.f7626b.p();
        p.c().a(new d5(p, p.b().b()));
    }

    public final void onActivityResumed(Activity activity) {
        this.f7626b.l().c(activity);
        z4 p = this.f7626b.p();
        p.c().a(new c5(p, p.b().b()));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f7626b.l().b(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
