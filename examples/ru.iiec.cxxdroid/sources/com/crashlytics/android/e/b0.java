package com.crashlytics.android.e;

import android.content.Context;
import android.os.Bundle;

/* access modifiers changed from: package-private */
public class b0 implements v0 {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2905b;

    public b0(Context context, String str) {
        this.a = context;
        this.f2905b = str;
    }

    @Override // com.crashlytics.android.e.v0
    public String a() {
        try {
            Bundle bundle = this.a.getPackageManager().getApplicationInfo(this.f2905b, 128).metaData;
            if (bundle != null) {
                return bundle.getString("io.fabric.unity.crashlytics.version");
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
