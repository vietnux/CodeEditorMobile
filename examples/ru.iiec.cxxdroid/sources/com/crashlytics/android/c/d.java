package com.crashlytics.android.c;

import android.content.Context;
import com.crashlytics.android.c.a0;
import f.a.a.a.i;
import java.util.concurrent.ScheduledExecutorService;

/* access modifiers changed from: package-private */
public class d implements f.a.a.a.n.d.d {
    private final i a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f2823b;

    /* renamed from: c  reason: collision with root package name */
    private final e f2824c;

    /* renamed from: d  reason: collision with root package name */
    private final d0 f2825d;

    /* renamed from: e  reason: collision with root package name */
    private final f.a.a.a.n.e.e f2826e;

    /* renamed from: f  reason: collision with root package name */
    private final o f2827f;

    /* renamed from: g  reason: collision with root package name */
    final ScheduledExecutorService f2828g;

    /* renamed from: h  reason: collision with root package name */
    z f2829h = new k();

    /* access modifiers changed from: package-private */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f.a.a.a.n.g.b f2830b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f2831c;

        a(f.a.a.a.n.g.b bVar, String str) {
            this.f2830b = bVar;
            this.f2831c = str;
        }

        public void run() {
            try {
                d.this.f2829h.a(this.f2830b, this.f2831c);
            } catch (Exception e2) {
                f.a.a.a.c.g().c("Answers", "Failed to set analytics settings data", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        b() {
        }

        public void run() {
            try {
                z zVar = d.this.f2829h;
                d.this.f2829h = new k();
                zVar.d();
            } catch (Exception e2) {
                f.a.a.a.c.g().c("Answers", "Failed to disable events", e2);
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            try {
                d.this.f2829h.a();
            } catch (Exception e2) {
                f.a.a.a.c.g().c("Answers", "Failed to send events files", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.crashlytics.android.c.d$d  reason: collision with other inner class name */
    public class RunnableC0068d implements Runnable {
        RunnableC0068d() {
        }

        public void run() {
            try {
                b0 a = d.this.f2825d.a();
                w a2 = d.this.f2824c.a();
                a2.a((f.a.a.a.n.d.d) d.this);
                d.this.f2829h = new l(d.this.a, d.this.f2823b, d.this.f2828g, a2, d.this.f2826e, a, d.this.f2827f);
            } catch (Exception e2) {
                f.a.a.a.c.g().c("Answers", "Failed to enable events", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements Runnable {
        e() {
        }

        public void run() {
            try {
                d.this.f2829h.b();
            } catch (Exception e2) {
                f.a.a.a.c.g().c("Answers", "Failed to flush events", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a0.b f2837b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f2838c;

        f(a0.b bVar, boolean z) {
            this.f2837b = bVar;
            this.f2838c = z;
        }

        public void run() {
            try {
                d.this.f2829h.a(this.f2837b);
                if (this.f2838c) {
                    d.this.f2829h.b();
                }
            } catch (Exception e2) {
                f.a.a.a.c.g().c("Answers", "Failed to process event", e2);
            }
        }
    }

    public d(i iVar, Context context, e eVar, d0 d0Var, f.a.a.a.n.e.e eVar2, ScheduledExecutorService scheduledExecutorService, o oVar) {
        this.a = iVar;
        this.f2823b = context;
        this.f2824c = eVar;
        this.f2825d = d0Var;
        this.f2826e = eVar2;
        this.f2828g = scheduledExecutorService;
        this.f2827f = oVar;
    }

    private void a(Runnable runnable) {
        try {
            this.f2828g.submit(runnable);
        } catch (Exception e2) {
            f.a.a.a.c.g().c("Answers", "Failed to submit events task", e2);
        }
    }

    private void b(Runnable runnable) {
        try {
            this.f2828g.submit(runnable).get();
        } catch (Exception e2) {
            f.a.a.a.c.g().c("Answers", "Failed to run events task", e2);
        }
    }

    public void a() {
        a(new b());
    }

    public void a(a0.b bVar) {
        a(bVar, false, false);
    }

    /* access modifiers changed from: package-private */
    public void a(a0.b bVar, boolean z, boolean z2) {
        f fVar = new f(bVar, z2);
        if (z) {
            b(fVar);
        } else {
            a(fVar);
        }
    }

    public void a(f.a.a.a.n.g.b bVar, String str) {
        a(new a(bVar, str));
    }

    @Override // f.a.a.a.n.d.d
    public void a(String str) {
        a(new c());
    }

    public void b() {
        a(new RunnableC0068d());
    }

    public void b(a0.b bVar) {
        a(bVar, false, true);
    }

    public void c() {
        a(new e());
    }

    public void c(a0.b bVar) {
        a(bVar, true, false);
    }
}
