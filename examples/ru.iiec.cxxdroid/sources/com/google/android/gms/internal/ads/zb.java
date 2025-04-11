package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.util.q;
import java.util.concurrent.Callable;

final class zb implements Callable<String> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f6196b;

    zb(yb ybVar, Context context) {
        this.f6196b = context;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        SharedPreferences sharedPreferences = this.f6196b.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            l9.e("User agent is not initialized on Google Play Services. Initializing.");
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f6196b);
            q.a(this.f6196b, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
            return defaultUserAgent;
        }
        l9.e("User agent is already initialized on Google Play Services.");
        return string;
    }
}
