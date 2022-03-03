package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

/* access modifiers changed from: package-private */
public final class x implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Intent f6674b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ w f6675c;

    x(w wVar, Intent intent) {
        this.f6675c = wVar;
        this.f6674b = intent;
    }

    public final void run() {
        String action = this.f6674b.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("EnhancedIntentService", sb.toString());
        this.f6675c.a();
    }
}
