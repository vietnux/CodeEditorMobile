package e.b.b.a.c.e;

import android.os.Bundle;

/* access modifiers changed from: package-private */
public final class u3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f7610b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7611c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f7612d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Bundle f7613e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f7614f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ boolean f7615g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ boolean f7616h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ String f7617i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ c3 f7618j;

    u3(c3 c3Var, String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f7618j = c3Var;
        this.f7610b = str;
        this.f7611c = str2;
        this.f7612d = j2;
        this.f7613e = bundle;
        this.f7614f = z;
        this.f7615g = z2;
        this.f7616h = z3;
        this.f7617i = str3;
    }

    public final void run() {
        this.f7618j.b(this.f7610b, this.f7611c, this.f7612d, this.f7613e, this.f7614f, this.f7615g, this.f7616h, this.f7617i);
    }
}
