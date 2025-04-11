package e.b.b.a.c.e;

import android.content.Intent;

/* access modifiers changed from: package-private */
public final /* synthetic */ class v4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final u4 f7627b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7628c;

    /* renamed from: d  reason: collision with root package name */
    private final z0 f7629d;

    /* renamed from: e  reason: collision with root package name */
    private final Intent f7630e;

    v4(u4 u4Var, int i2, z0 z0Var, Intent intent) {
        this.f7627b = u4Var;
        this.f7628c = i2;
        this.f7629d = z0Var;
        this.f7630e = intent;
    }

    public final void run() {
        this.f7627b.a(this.f7628c, this.f7629d, this.f7630e);
    }
}
