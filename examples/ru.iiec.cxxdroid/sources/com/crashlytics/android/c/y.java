package com.crashlytics.android.c;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.crashlytics.android.c.a0;
import com.crashlytics.android.c.j;
import f.a.a.a.a;
import f.a.a.a.c;
import f.a.a.a.i;
import f.a.a.a.l;
import f.a.a.a.n.b.n;
import f.a.a.a.n.b.p;
import f.a.a.a.n.f.b;
import java.util.concurrent.ScheduledExecutorService;

/* access modifiers changed from: package-private */
public class y implements j.b {
    private final long a;

    /* renamed from: b  reason: collision with root package name */
    final d f2873b;

    /* renamed from: c  reason: collision with root package name */
    final a f2874c;

    /* renamed from: d  reason: collision with root package name */
    final j f2875d;

    /* renamed from: e  reason: collision with root package name */
    final g f2876e;

    y(d dVar, a aVar, j jVar, g gVar, long j2) {
        this.f2873b = dVar;
        this.f2874c = aVar;
        this.f2875d = jVar;
        this.f2876e = gVar;
        this.a = j2;
    }

    public static y a(i iVar, Context context, p pVar, String str, String str2, long j2) {
        d0 d0Var = new d0(context, pVar, str, str2);
        e eVar = new e(context, new b(iVar));
        f.a.a.a.n.e.b bVar = new f.a.a.a.n.e.b(c.g());
        a aVar = new a(context);
        ScheduledExecutorService b2 = n.b("Answers Events Handler");
        return new y(new d(iVar, context, eVar, d0Var, bVar, b2, new o(context)), aVar, new j(b2), g.a(context), j2);
    }

    @Override // com.crashlytics.android.c.j.b
    public void a() {
        c.g().e("Answers", "Flush events when app is backgrounded");
        this.f2873b.c();
    }

    public void a(long j2) {
        c.g().e("Answers", "Logged install");
        this.f2873b.b(a0.a(j2));
    }

    public void a(Activity activity, a0.c cVar) {
        l g2 = c.g();
        g2.e("Answers", "Logged lifecycle event: " + cVar.name());
        this.f2873b.a(a0.a(cVar, activity));
    }

    public void a(f.a.a.a.n.g.b bVar, String str) {
        this.f2875d.a(bVar.f8542i);
        this.f2873b.a(bVar, str);
    }

    public void a(String str, String str2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            c.g().e("Answers", "Logged crash");
            this.f2873b.c(a0.a(str, str2));
            return;
        }
        throw new IllegalStateException("onCrash called from main thread!!!");
    }

    public void b() {
        this.f2874c.a();
        this.f2873b.a();
    }

    public void c() {
        this.f2873b.b();
        this.f2874c.a(new f(this, this.f2875d));
        this.f2875d.a(this);
        if (d()) {
            a(this.a);
            this.f2876e.b();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return !this.f2876e.a();
    }
}
