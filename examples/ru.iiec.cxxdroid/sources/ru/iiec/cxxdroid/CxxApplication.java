package ru.iiec.cxxdroid;

import android.content.Context;
import com.crashlytics.android.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import f.a.a.a.c;
import qwe.qweqwe.texteditor.b0;

public class CxxApplication extends b0 {
    static {
        b0.f9604c = false;
        b0.f9605d = false;
        b0.f9606e = "ru.iiec.cxxdroid";
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.b0
    public void a(boolean z) {
        try {
            FirebaseAnalytics.getInstance(this).setAnalyticsCollectionEnabled(z);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (z) {
            try {
                c.a(this, new a());
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        try {
            com.google.firebase.messaging.a.a().a(z);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.b0
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        c.q.a.c(this);
    }

    @Override // qwe.qweqwe.texteditor.b0
    public void onCreate() {
        super.onCreate();
        getApplicationContext();
    }
}
