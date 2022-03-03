package com.crashlytics.android;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.crashlytics.android.CrashlyticsInitProvider;

class b implements CrashlyticsInitProvider.a {
    b() {
    }

    @Override // com.crashlytics.android.CrashlyticsInitProvider.a
    public boolean a(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            return bundle == null || bundle.getBoolean("firebase_crashlytics_collection_enabled", true);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
