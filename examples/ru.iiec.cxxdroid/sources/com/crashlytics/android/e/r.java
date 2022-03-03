package com.crashlytics.android.e;

import f.a.a.a.c;
import f.a.a.a.n.g.u;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
public class r implements Thread.UncaughtExceptionHandler {
    private final a a;

    /* renamed from: b  reason: collision with root package name */
    private final b f3027b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3028c;

    /* renamed from: d  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f3029d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f3030e = new AtomicBoolean(false);

    /* access modifiers changed from: package-private */
    public interface a {
        void a(b bVar, Thread thread, Throwable th, boolean z);
    }

    /* access modifiers changed from: package-private */
    public interface b {
        u a();
    }

    public r(a aVar, b bVar, boolean z, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = aVar;
        this.f3027b = bVar;
        this.f3028c = z;
        this.f3029d = uncaughtExceptionHandler;
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f3030e.get();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        this.f3030e.set(true);
        try {
            this.a.a(this.f3027b, thread, th, this.f3028c);
        } catch (Exception e2) {
            c.g().c("CrashlyticsCore", "An error occurred in the uncaught exception handler", e2);
        } catch (Throwable th2) {
            c.g().e("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
            this.f3029d.uncaughtException(thread, th);
            this.f3030e.set(false);
            throw th2;
        }
        c.g().e("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
        this.f3029d.uncaughtException(thread, th);
        this.f3030e.set(false);
    }
}
