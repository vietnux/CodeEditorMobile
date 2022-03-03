package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

final class ac implements Callable<String> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f3785b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Context f3786c;

    ac(yb ybVar, Context context, Context context2) {
        this.f3785b = context;
        this.f3786c = context2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.f3785b != null) {
            l9.e("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f3785b.getSharedPreferences("admob_user_agent", 0);
        } else {
            l9.e("Attempting to read user agent from local cache.");
            sharedPreferences = this.f3786c.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            l9.e("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f3786c);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                l9.e("Persisting user agent.");
            }
        }
        return string;
    }
}
