package e.b.b.a.c.e;

import com.google.android.gms.common.internal.y;
import java.lang.Thread;

/* access modifiers changed from: package-private */
public final class a2 implements Thread.UncaughtExceptionHandler {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ z1 f7153b;

    public a2(z1 z1Var, String str) {
        this.f7153b = z1Var;
        y.a((Object) str);
        this.a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f7153b.a().y().a(this.a, th);
    }
}
