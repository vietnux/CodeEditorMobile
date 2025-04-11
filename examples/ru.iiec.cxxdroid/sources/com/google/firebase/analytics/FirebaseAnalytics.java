package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.y;
import e.b.b.a.c.e.d2;
import e.b.b.a.e.g;

@Keep
public final class FirebaseAnalytics {
    private final d2 zzacw;

    public static class a {
    }

    public static class b {
    }

    public static class c {
    }

    public FirebaseAnalytics(d2 d2Var) {
        y.a(d2Var);
        this.zzacw = d2Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        return d2.a(context).E();
    }

    public final g<String> getAppInstanceId() {
        return this.zzacw.u().y();
    }

    public final void logEvent(String str, Bundle bundle) {
        this.zzacw.D().logEvent(str, bundle);
    }

    public final void resetAnalyticsData() {
        this.zzacw.u().z();
    }

    public final void setAnalyticsCollectionEnabled(boolean z) {
        this.zzacw.D().setMeasurementEnabled(z);
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.zzacw.x().a(activity, str, str2);
    }

    public final void setMinimumSessionDuration(long j2) {
        this.zzacw.D().setMinimumSessionDuration(j2);
    }

    public final void setSessionTimeoutDuration(long j2) {
        this.zzacw.D().setSessionTimeoutDuration(j2);
    }

    public final void setUserId(String str) {
        this.zzacw.D().setUserPropertyInternal("app", "_id", str);
    }

    public final void setUserProperty(String str, String str2) {
        this.zzacw.D().setUserProperty(str, str2);
    }
}
