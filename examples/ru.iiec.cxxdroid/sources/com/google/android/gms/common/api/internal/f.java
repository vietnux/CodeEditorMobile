package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.p;

@Deprecated
public final class f {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f3537d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static f f3538e;
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final Status f3539b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3540c;

    f(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(p.common_google_play_services_unknown_issue));
        boolean z = false;
        if (identifier != 0) {
            this.f3540c = !(resources.getInteger(identifier) != 0 ? true : z);
        } else {
            this.f3540c = false;
        }
        String a2 = w.a(context);
        a2 = a2 == null ? new e0(context).a("google_app_id") : a2;
        if (TextUtils.isEmpty(a2)) {
            this.f3539b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.a = null;
            return;
        }
        this.a = a2;
        this.f3539b = Status.f3460f;
    }

    public static Status a(Context context) {
        Status status;
        y.a(context, "Context must not be null.");
        synchronized (f3537d) {
            if (f3538e == null) {
                f3538e = new f(context);
            }
            status = f3538e.f3539b;
        }
        return status;
    }

    private static f a(String str) {
        f fVar;
        synchronized (f3537d) {
            if (f3538e != null) {
                fVar = f3538e;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return fVar;
    }

    public static String a() {
        return a("getGoogleAppId").a;
    }

    public static boolean b() {
        return a("isMeasurementExplicitlyDisabled").f3540c;
    }
}
