package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.p;

public class e0 {
    private final Resources a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3658b = this.a.getResourcePackageName(p.common_google_play_services_unknown_issue);

    public e0(Context context) {
        y.a(context);
        this.a = context.getResources();
    }

    public String a(String str) {
        int identifier = this.a.getIdentifier(str, "string", this.f3658b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
