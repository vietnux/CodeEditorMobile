package e.b.b.a.c.e;

import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class m3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7433b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7434c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f7435d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f7436e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f7437f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ c3 f7438g;

    m3(c3 c3Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f7438g = c3Var;
        this.f7433b = atomicReference;
        this.f7434c = str;
        this.f7435d = str2;
        this.f7436e = str3;
        this.f7437f = z;
    }

    public final void run() {
        this.f7438g.a.w().a(this.f7433b, this.f7434c, this.f7435d, this.f7436e, this.f7437f);
    }
}
