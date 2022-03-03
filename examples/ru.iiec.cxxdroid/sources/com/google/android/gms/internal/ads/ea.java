package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class ea implements Callable<Boolean> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f4199b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ WebSettings f4200c;

    ea(da daVar, Context context, WebSettings webSettings) {
        this.f4199b = context;
        this.f4200c = webSettings;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Boolean call() {
        if (this.f4199b.getCacheDir() != null) {
            this.f4200c.setAppCachePath(this.f4199b.getCacheDir().getAbsolutePath());
            this.f4200c.setAppCacheMaxSize(0);
            this.f4200c.setAppCacheEnabled(true);
        }
        this.f4200c.setDatabasePath(this.f4199b.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        this.f4200c.setDatabaseEnabled(true);
        this.f4200c.setDomStorageEnabled(true);
        this.f4200c.setDisplayZoomControls(false);
        this.f4200c.setBuiltInZoomControls(true);
        this.f4200c.setSupportZoom(true);
        this.f4200c.setAllowContentAccess(false);
        return true;
    }
}
