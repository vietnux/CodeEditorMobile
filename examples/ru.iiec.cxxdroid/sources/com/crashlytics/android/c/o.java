package com.crashlytics.android.c;

import android.content.Context;
import f.a.a.a.c;
import f.a.a.a.l;

/* access modifiers changed from: package-private */
public class o {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final q f2864b;

    /* renamed from: c  reason: collision with root package name */
    private n f2865c;

    public o(Context context) {
        this(context, new q());
    }

    public o(Context context, q qVar) {
        this.a = context;
        this.f2864b = qVar;
    }

    public n a() {
        if (this.f2865c == null) {
            this.f2865c = i.b(this.a);
        }
        return this.f2865c;
    }

    public void a(a0 a0Var) {
        n a2 = a();
        if (a2 == null) {
            c.g().e("Answers", "Firebase analytics logging was enabled, but not available...");
            return;
        }
        p a3 = this.f2864b.a(a0Var);
        if (a3 == null) {
            l g2 = c.g();
            g2.e("Answers", "Fabric event was not mappable to Firebase event: " + a0Var);
            return;
        }
        a2.a(a3.a(), a3.b());
        if ("levelEnd".equals(a0Var.f2792g)) {
            a2.a("post_score", a3.b());
        }
    }
}
