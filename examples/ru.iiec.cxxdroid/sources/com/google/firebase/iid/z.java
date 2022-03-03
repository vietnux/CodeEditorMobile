package com.google.firebase.iid;

import android.util.Log;

/* access modifiers changed from: package-private */
public final class z implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ w f6677b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ y f6678c;

    z(y yVar, w wVar) {
        this.f6678c = yVar;
        this.f6677b = wVar;
    }

    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        this.f6678c.f6676b.c(this.f6677b.a);
        this.f6677b.a();
    }
}
