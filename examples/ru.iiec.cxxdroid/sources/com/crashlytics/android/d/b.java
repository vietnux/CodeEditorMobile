package com.crashlytics.android.d;

import android.annotation.TargetApi;
import android.app.Activity;
import f.a.a.a.a;
import java.util.concurrent.ExecutorService;

/* access modifiers changed from: package-private */
@TargetApi(14)
public class b extends a {

    /* renamed from: l  reason: collision with root package name */
    private final a.b f2887l = new a();

    /* renamed from: m  reason: collision with root package name */
    private final ExecutorService f2888m;

    class a extends a.b {

        /* renamed from: com.crashlytics.android.d.b$a$a  reason: collision with other inner class name */
        class RunnableC0069a implements Runnable {
            RunnableC0069a() {
            }

            public void run() {
                b.this.a();
            }
        }

        a() {
        }

        @Override // f.a.a.a.a.b
        public void d(Activity activity) {
            if (b.this.c()) {
                b.this.f2888m.submit(new RunnableC0069a());
            }
        }
    }

    public b(f.a.a.a.a aVar, ExecutorService executorService) {
        this.f2888m = executorService;
        aVar.a(this.f2887l);
    }
}
