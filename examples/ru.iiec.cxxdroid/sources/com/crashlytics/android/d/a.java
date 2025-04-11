package com.crashlytics.android.d;

import android.annotation.SuppressLint;
import android.content.Context;
import f.a.a.a.l;
import f.a.a.a.n.b.k;
import f.a.a.a.n.b.p;
import f.a.a.a.n.e.e;
import f.a.a.a.n.f.c;
import f.a.a.a.n.g.g;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class a implements j {
    private final AtomicBoolean a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f2877b;

    /* renamed from: c  reason: collision with root package name */
    private Context f2878c;

    /* renamed from: d  reason: collision with root package name */
    private c f2879d;

    /* renamed from: e  reason: collision with root package name */
    private p f2880e;

    /* renamed from: f  reason: collision with root package name */
    private g f2881f;

    /* renamed from: g  reason: collision with root package name */
    private d f2882g;

    /* renamed from: h  reason: collision with root package name */
    private c f2883h;

    /* renamed from: i  reason: collision with root package name */
    private k f2884i;

    /* renamed from: j  reason: collision with root package name */
    private e f2885j;

    /* renamed from: k  reason: collision with root package name */
    private long f2886k;

    public a() {
        this(false);
    }

    public a(boolean z) {
        this.a = new AtomicBoolean();
        this.f2886k = 0;
        this.f2877b = new AtomicBoolean(z);
    }

    private void e() {
        f.a.a.a.c.g().e("Beta", "Performing update check");
        c cVar = this.f2879d;
        new e(cVar, cVar.t(), this.f2881f.a, this.f2885j, new g()).a(new f.a.a.a.n.b.g().d(this.f2878c), this.f2880e.g().get(p.a.FONT_TOKEN), this.f2882g);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"CommitPrefEdits"})
    public void a() {
        synchronized (this.f2883h) {
            if (this.f2883h.get().contains("last_update_check")) {
                this.f2883h.a(this.f2883h.a().remove("last_update_check"));
            }
        }
        long a2 = this.f2884i.a();
        long j2 = ((long) this.f2881f.f8558b) * 1000;
        l g2 = f.a.a.a.c.g();
        g2.e("Beta", "Check for updates delay: " + j2);
        l g3 = f.a.a.a.c.g();
        g3.e("Beta", "Check for updates last check time: " + b());
        long b2 = b() + j2;
        l g4 = f.a.a.a.c.g();
        g4.e("Beta", "Check for updates current time: " + a2 + ", next check time: " + b2);
        if (a2 >= b2) {
            try {
                e();
            } finally {
                a(a2);
            }
        } else {
            f.a.a.a.c.g().e("Beta", "Check for updates next check time was not passed");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long j2) {
        this.f2886k = j2;
    }

    @Override // com.crashlytics.android.d.j
    public void a(Context context, c cVar, p pVar, g gVar, d dVar, c cVar2, k kVar, e eVar) {
        this.f2878c = context;
        this.f2879d = cVar;
        this.f2880e = pVar;
        this.f2881f = gVar;
        this.f2882g = dVar;
        this.f2883h = cVar2;
        this.f2884i = kVar;
        this.f2885j = eVar;
        if (d()) {
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public long b() {
        return this.f2886k;
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        this.f2877b.set(true);
        return this.a.get();
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        this.a.set(true);
        return this.f2877b.get();
    }
}
