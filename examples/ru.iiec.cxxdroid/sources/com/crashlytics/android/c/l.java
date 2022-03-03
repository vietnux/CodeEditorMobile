package com.crashlytics.android.c;

import android.content.Context;
import com.crashlytics.android.c.a0;
import f.a.a.a.c;
import f.a.a.a.i;
import f.a.a.a.n.b.g;
import f.a.a.a.n.d.f;
import f.a.a.a.n.e.e;
import f.a.a.a.n.g.b;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

class l implements z {
    private final i a;

    /* renamed from: b  reason: collision with root package name */
    private final e f2852b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f2853c;

    /* renamed from: d  reason: collision with root package name */
    private final w f2854d;

    /* renamed from: e  reason: collision with root package name */
    private final ScheduledExecutorService f2855e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference<ScheduledFuture<?>> f2856f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    final b0 f2857g;

    /* renamed from: h  reason: collision with root package name */
    private final o f2858h;

    /* renamed from: i  reason: collision with root package name */
    f f2859i;

    /* renamed from: j  reason: collision with root package name */
    g f2860j = new g();

    /* renamed from: k  reason: collision with root package name */
    m f2861k = new r();

    /* renamed from: l  reason: collision with root package name */
    boolean f2862l = true;

    /* renamed from: m  reason: collision with root package name */
    boolean f2863m = true;
    volatile int n = -1;
    boolean o = false;
    boolean p = false;

    public l(i iVar, Context context, ScheduledExecutorService scheduledExecutorService, w wVar, e eVar, b0 b0Var, o oVar) {
        this.a = iVar;
        this.f2853c = context;
        this.f2855e = scheduledExecutorService;
        this.f2854d = wVar;
        this.f2852b = eVar;
        this.f2857g = b0Var;
        this.f2858h = oVar;
    }

    @Override // com.crashlytics.android.c.z
    public void a() {
        if (this.f2859i == null) {
            f.a.a.a.n.b.i.c(this.f2853c, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        f.a.a.a.n.b.i.c(this.f2853c, "Sending all files");
        List<File> d2 = this.f2854d.d();
        int i2 = 0;
        while (true) {
            try {
                if (d2.size() <= 0) {
                    break;
                }
                f.a.a.a.n.b.i.c(this.f2853c, String.format(Locale.US, "attempt to send batch of %d files", Integer.valueOf(d2.size())));
                boolean a2 = this.f2859i.a(d2);
                if (a2) {
                    i2 += d2.size();
                    this.f2854d.a(d2);
                }
                if (!a2) {
                    break;
                }
                d2 = this.f2854d.d();
            } catch (Exception e2) {
                Context context = this.f2853c;
                f.a.a.a.n.b.i.a(context, "Failed to send batch of analytics files to server: " + e2.getMessage(), e2);
            }
        }
        if (i2 == 0) {
            this.f2854d.b();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long j2, long j3) {
        if (this.f2856f.get() == null) {
            f.a.a.a.n.d.i iVar = new f.a.a.a.n.d.i(this.f2853c, this);
            Context context = this.f2853c;
            f.a.a.a.n.b.i.c(context, "Scheduling time based file roll over every " + j3 + " seconds");
            try {
                this.f2856f.set(this.f2855e.scheduleAtFixedRate(iVar, j2, j3, TimeUnit.SECONDS));
            } catch (RejectedExecutionException e2) {
                f.a.a.a.n.b.i.a(this.f2853c, "Failed to schedule time based file roll over", e2);
            }
        }
    }

    @Override // com.crashlytics.android.c.z
    public void a(a0.b bVar) {
        f.a.a.a.l g2;
        StringBuilder sb;
        String str;
        a0 a2 = bVar.a(this.f2857g);
        if (!this.f2862l && a0.c.CUSTOM.equals(a2.f2788c)) {
            g2 = c.g();
            sb = new StringBuilder();
            str = "Custom events tracking disabled - skipping event: ";
        } else if (!this.f2863m && a0.c.PREDEFINED.equals(a2.f2788c)) {
            g2 = c.g();
            sb = new StringBuilder();
            str = "Predefined events tracking disabled - skipping event: ";
        } else if (this.f2861k.a(a2)) {
            g2 = c.g();
            sb = new StringBuilder();
            str = "Skipping filtered event: ";
        } else {
            try {
                this.f2854d.a(a2);
            } catch (IOException e2) {
                f.a.a.a.l g3 = c.g();
                g3.c("Answers", "Failed to write event: " + a2, e2);
            }
            e();
            boolean z = a0.c.CUSTOM.equals(a2.f2788c) || a0.c.PREDEFINED.equals(a2.f2788c);
            boolean equals = "purchase".equals(a2.f2792g);
            if (this.o && z) {
                if (!equals || this.p) {
                    try {
                        this.f2858h.a(a2);
                        return;
                    } catch (Exception e3) {
                        f.a.a.a.l g4 = c.g();
                        g4.c("Answers", "Failed to map event to Firebase: " + a2, e3);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        sb.append(str);
        sb.append(a2);
        g2.e("Answers", sb.toString());
    }

    @Override // com.crashlytics.android.c.z
    public void a(b bVar, String str) {
        this.f2859i = h.a(new x(this.a, str, bVar.a, this.f2852b, this.f2860j.d(this.f2853c)));
        this.f2854d.a(bVar);
        this.o = bVar.f8538e;
        this.p = bVar.f8539f;
        f.a.a.a.l g2 = c.g();
        StringBuilder sb = new StringBuilder();
        sb.append("Firebase analytics forwarding ");
        String str2 = "enabled";
        sb.append(this.o ? str2 : "disabled");
        g2.e("Answers", sb.toString());
        f.a.a.a.l g3 = c.g();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Firebase analytics including purchase events ");
        sb2.append(this.p ? str2 : "disabled");
        g3.e("Answers", sb2.toString());
        this.f2862l = bVar.f8540g;
        f.a.a.a.l g4 = c.g();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Custom event tracking ");
        sb3.append(this.f2862l ? str2 : "disabled");
        g4.e("Answers", sb3.toString());
        this.f2863m = bVar.f8541h;
        f.a.a.a.l g5 = c.g();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Predefined event tracking ");
        if (!this.f2863m) {
            str2 = "disabled";
        }
        sb4.append(str2);
        g5.e("Answers", sb4.toString());
        if (bVar.f8543j > 1) {
            c.g().e("Answers", "Event sampling enabled");
            this.f2861k = new v(bVar.f8543j);
        }
        this.n = bVar.f8535b;
        a(0, (long) this.n);
    }

    @Override // f.a.a.a.n.d.e
    public boolean b() {
        try {
            return this.f2854d.g();
        } catch (IOException e2) {
            f.a.a.a.n.b.i.a(this.f2853c, "Failed to roll file over.", e2);
            return false;
        }
    }

    @Override // f.a.a.a.n.d.e
    public void c() {
        if (this.f2856f.get() != null) {
            f.a.a.a.n.b.i.c(this.f2853c, "Cancelling time-based rollover because no events are currently being generated.");
            this.f2856f.get().cancel(false);
            this.f2856f.set(null);
        }
    }

    @Override // com.crashlytics.android.c.z
    public void d() {
        this.f2854d.a();
    }

    public void e() {
        if (this.n != -1) {
            a((long) this.n, (long) this.n);
        }
    }
}
