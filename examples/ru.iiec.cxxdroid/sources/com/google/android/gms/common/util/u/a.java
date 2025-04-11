package com.google.android.gms.common.util.u;

import com.google.android.gms.common.internal.y;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class a implements ThreadFactory {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3724b;

    /* renamed from: c  reason: collision with root package name */
    private final ThreadFactory f3725c;

    public a(String str) {
        this(str, 0);
    }

    public a(String str, int i2) {
        this.f3725c = Executors.defaultThreadFactory();
        y.a((Object) str, (Object) "Name must not be null");
        this.a = str;
        this.f3724b = i2;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f3725c.newThread(new b(runnable, this.f3724b));
        newThread.setName(this.a);
        return newThread;
    }
}
