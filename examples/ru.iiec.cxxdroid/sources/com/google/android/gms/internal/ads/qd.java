package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public interface qd extends ExecutorService {
    ld<?> a(Runnable runnable);

    <T> ld<T> a(Callable<T> callable);
}
