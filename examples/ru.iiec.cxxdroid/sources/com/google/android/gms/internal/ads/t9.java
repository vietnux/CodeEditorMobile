package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
public final class t9 implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5597b;

    t9(String str) {
        this.f5597b = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f5597b;
        int andIncrement = this.a.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
