package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.internal.y;
import com.google.firebase.analytics.FirebaseAnalytics;
import e.b.b.a.c.e.d2;
import e.b.b.a.c.e.p5;
import e.b.b.a.c.e.s5;
import e.b.b.a.c.e.w3;
import java.util.List;
import java.util.Map;

@Keep
@Deprecated
public class AppMeasurement {
    public static final String CRASH_ORIGIN = "crash";
    public static final String FCM_ORIGIN = "fcm";
    private final d2 zzacw;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
            y.a(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                this.mValue = s5.b(obj);
                if (this.mValue == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            Bundle bundle = conditionalUserProperty.mTimedOutEventParams;
            if (bundle != null) {
                this.mTimedOutEventParams = new Bundle(bundle);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            Bundle bundle2 = conditionalUserProperty.mTriggeredEventParams;
            if (bundle2 != null) {
                this.mTriggeredEventParams = new Bundle(bundle2);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            Bundle bundle3 = conditionalUserProperty.mExpiredEventParams;
            if (bundle3 != null) {
                this.mExpiredEventParams = new Bundle(bundle3);
            }
        }
    }

    public static final class a extends FirebaseAnalytics.a {
        public static final String[] a = {"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "ad_reward", "screen_view", "ga_extra_parameter"};

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f6241b = {"_cd", "_ae", "_ui", "_ug", "_in", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_e", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "_ar", "_vs", "_ep"};

        public static String a(String str) {
            return s5.a(str, a, f6241b);
        }
    }

    public interface b {
        void a(String str, String str2, Bundle bundle, long j2);
    }

    public interface c {
        void a(String str, String str2, Bundle bundle, long j2);
    }

    public static final class d extends FirebaseAnalytics.b {
        public static final String[] a = {"firebase_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "message_device_time", "message_id", "message_name", "message_time", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "deferred_analytics_collection"};

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f6242b = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_ndt", "_nmid", "_nmn", "_nmt", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_dac"};

        public static String a(String str) {
            return s5.a(str, a, f6242b);
        }
    }

    public static final class e extends FirebaseAnalytics.c {
        public static final String[] a = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "first_open_after_install", "lifetime_user_engagement"};

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f6243b = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_fi", "_lte"};

        public static String a(String str) {
            return s5.a(str, a, f6243b);
        }
    }

    public AppMeasurement(d2 d2Var) {
        y.a(d2Var);
        this.zzacw = d2Var;
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return d2.a(context).D();
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.zzacw.t().a(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.zzacw.u().a(str, str2, bundle);
    }

    /* access modifiers changed from: protected */
    @Keep
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        this.zzacw.u().a(str, str2, str3, bundle);
        throw null;
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.zzacw.t().b(str);
    }

    @Keep
    public long generateEventId() {
        return this.zzacw.h().y();
    }

    @Keep
    public String getAppInstanceId() {
        return this.zzacw.u().B();
    }

    public Boolean getBoolean() {
        return this.zzacw.u().C();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        return this.zzacw.u().b(str, str2);
    }

    /* access modifiers changed from: protected */
    @Keep
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        this.zzacw.u().a(str, str2, str3);
        throw null;
    }

    @Keep
    public String getCurrentScreenClass() {
        w3 z = this.zzacw.x().z();
        if (z != null) {
            return z.f7655b;
        }
        return null;
    }

    @Keep
    public String getCurrentScreenName() {
        w3 z = this.zzacw.x().z();
        if (z != null) {
            return z.a;
        }
        return null;
    }

    public Double getDouble() {
        return this.zzacw.u().F();
    }

    @Keep
    public String getGmpAppId() {
        try {
            return f.a();
        } catch (IllegalStateException e2) {
            this.zzacw.a().y().a("getGoogleAppId failed with exception", e2);
            return null;
        }
    }

    public Integer getInteger() {
        return this.zzacw.u().E();
    }

    public Long getLong() {
        return this.zzacw.u().D();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        this.zzacw.u();
        y.b(str);
        return 25;
    }

    public String getString() {
        return this.zzacw.u().A();
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.zzacw.u().a(str, str2, z);
    }

    public Map<String, Object> getUserProperties(boolean z) {
        List<p5> b2 = this.zzacw.u().b(z);
        c.e.a aVar = new c.e.a(b2.size());
        for (p5 p5Var : b2) {
            aVar.put(p5Var.f7509c, p5Var.t());
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        this.zzacw.u().a(str, str2, str3, z);
        throw null;
    }

    public final void logEvent(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzacw.u().a("app", str, bundle, true);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzacw.u().b(str, str2, bundle);
    }

    public void logEventInternalNoInterceptor(String str, String str2, Bundle bundle, long j2) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzacw.u().a(str, str2, bundle, j2);
    }

    public void registerOnMeasurementEventListener(c cVar) {
        this.zzacw.u().a(cVar);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        this.zzacw.u().a(conditionalUserProperty);
    }

    /* access modifiers changed from: protected */
    @Keep
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        this.zzacw.u().b(conditionalUserProperty);
        throw null;
    }

    public void setEventInterceptor(b bVar) {
        this.zzacw.u().a(bVar);
    }

    @Deprecated
    public void setMeasurementEnabled(boolean z) {
        this.zzacw.u().a(z);
    }

    public final void setMinimumSessionDuration(long j2) {
        this.zzacw.u().a(j2);
    }

    public final void setSessionTimeoutDuration(long j2) {
        this.zzacw.u().b(j2);
    }

    public final void setUserProperty(String str, String str2) {
        int b2 = this.zzacw.h().b(str);
        if (b2 != 0) {
            this.zzacw.h();
            this.zzacw.h().a(b2, "_ev", s5.a(str, 24, true), str != null ? str.length() : 0);
            return;
        }
        setUserPropertyInternal("app", str, str2);
    }

    public void setUserPropertyInternal(String str, String str2, Object obj) {
        this.zzacw.u().a(str, str2, obj);
    }

    public void unregisterOnMeasurementEventListener(c cVar) {
        this.zzacw.u().b(cVar);
    }
}
