package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final class td implements Executor {
    td() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
