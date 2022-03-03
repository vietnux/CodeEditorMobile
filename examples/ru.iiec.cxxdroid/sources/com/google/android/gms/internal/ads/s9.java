package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@k2
public final class s9 {
    public static final qd a = rd.a(new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), a("Default")));

    /* renamed from: b  reason: collision with root package name */
    private static final qd f5520b;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), a("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f5520b = rd.a(threadPoolExecutor);
    }

    public static ld<?> a(Runnable runnable) {
        return a.a(runnable);
    }

    public static <T> ld<T> a(Callable<T> callable) {
        return a.a(callable);
    }

    private static ThreadFactory a(String str) {
        return new t9(str);
    }

    public static ld<?> b(Runnable runnable) {
        return f5520b.a(runnable);
    }
}
