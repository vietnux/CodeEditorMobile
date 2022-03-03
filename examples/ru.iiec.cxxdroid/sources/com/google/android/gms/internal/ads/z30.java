package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class z30 implements Executor {
    private final /* synthetic */ Handler a;

    z30(y20 y20, Handler handler) {
        this.a = handler;
    }

    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
