package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

@k2
public final class rd {
    public static final Executor a = new sd();

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f5433b = new td();

    static {
        a(a);
        a(f5433b);
    }

    public static qd a(Executor executor) {
        return new ud(executor, null);
    }
}
