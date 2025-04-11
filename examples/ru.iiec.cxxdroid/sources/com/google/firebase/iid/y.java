package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

public final class y extends Binder {

    /* renamed from: b  reason: collision with root package name */
    private final u f6676b;

    y(u uVar) {
        this.f6676b = uVar;
    }

    public final void a(w wVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "service received new intent via bind strategy");
            }
            if (this.f6676b.b(wVar.a)) {
                wVar.a();
                return;
            }
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "intent being queued for bg execution");
            }
            this.f6676b.f6663b.execute(new z(this, wVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
