package f.a.a.a.n.g;

import android.content.Context;
import f.a.a.a.c;
import f.a.a.a.i;
import f.a.a.a.n.b.g;
import f.a.a.a.n.b.l;
import f.a.a.a.n.b.p;
import f.a.a.a.n.b.t;
import f.a.a.a.n.e.e;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public class r {
    private final AtomicReference<u> a;

    /* renamed from: b  reason: collision with root package name */
    private final CountDownLatch f8578b;

    /* renamed from: c  reason: collision with root package name */
    private t f8579c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8580d;

    /* access modifiers changed from: package-private */
    public static class b {
        private static final r a = new r();
    }

    private r() {
        this.a = new AtomicReference<>();
        this.f8578b = new CountDownLatch(1);
        this.f8580d = false;
    }

    private void a(u uVar) {
        this.a.set(uVar);
        this.f8578b.countDown();
    }

    public static r d() {
        return b.a;
    }

    public synchronized r a(i iVar, p pVar, e eVar, String str, String str2, String str3) {
        if (this.f8580d) {
            return this;
        }
        if (this.f8579c == null) {
            Context j2 = iVar.j();
            String e2 = pVar.e();
            String d2 = new g().d(j2);
            String h2 = pVar.h();
            t tVar = new t();
            l lVar = new l();
            j jVar = new j(iVar);
            String c2 = f.a.a.a.n.b.i.c(j2);
            this.f8579c = new k(iVar, new x(d2, pVar.i(), pVar.j(), pVar.k(), pVar.b(), pVar.f(), pVar.d(), f.a.a.a.n.b.i.a(f.a.a.a.n.b.i.n(j2)), str2, str, l.a(h2).h(), c2), tVar, lVar, jVar, new m(iVar, str3, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", e2), eVar));
        }
        this.f8580d = true;
        return this;
    }

    public u a() {
        try {
            this.f8578b.await();
            return this.a.get();
        } catch (InterruptedException unused) {
            c.g().c("Fabric", "Interrupted while waiting for settings data.");
            return null;
        }
    }

    public synchronized boolean b() {
        u a2;
        a2 = this.f8579c.a();
        a(a2);
        return a2 != null;
    }

    public synchronized boolean c() {
        u a2;
        a2 = this.f8579c.a(s.SKIP_CACHE_LOOKUP);
        a(a2);
        if (a2 == null) {
            c.g().c("Fabric", "Failed to force reload of settings from Crashlytics.", null);
        }
        return a2 != null;
    }
}
