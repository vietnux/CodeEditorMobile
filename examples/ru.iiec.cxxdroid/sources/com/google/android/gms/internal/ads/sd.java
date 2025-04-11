package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.x0;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class sd implements Executor {
    private final Handler a = new m9(Looper.getMainLooper());

    sd() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                x0.f();
                u9.a(x0.j().a(), th);
                throw th;
            }
        } else {
            this.a.post(runnable);
        }
    }
}
