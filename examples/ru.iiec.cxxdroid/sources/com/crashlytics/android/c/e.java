package com.crashlytics.android.c;

import android.content.Context;
import android.os.Looper;
import f.a.a.a.n.b.t;
import f.a.a.a.n.d.g;
import f.a.a.a.n.f.a;

/* access modifiers changed from: package-private */
public class e {
    final Context a;

    /* renamed from: b  reason: collision with root package name */
    final a f2843b;

    public e(Context context, a aVar) {
        this.a = context;
        this.f2843b = aVar;
    }

    public w a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return new w(this.a, new c0(), new t(), new g(this.a, this.f2843b.a(), "session_analytics.tap", "session_analytics_to_send"));
        }
        throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
    }
}
