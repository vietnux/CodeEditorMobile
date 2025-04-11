package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.g;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.n;
import e.b.b.a.e.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class e implements Handler.Callback {
    public static final Status n = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status o = new Status(4, "The user must be signed in to make this API call.");
    private static final Object p = new Object();
    private static e q;
    private long a = 5000;

    /* renamed from: b  reason: collision with root package name */
    private long f3506b = 120000;

    /* renamed from: c  reason: collision with root package name */
    private long f3507c = 10000;

    /* renamed from: d  reason: collision with root package name */
    private final Context f3508d;

    /* renamed from: e  reason: collision with root package name */
    private final g f3509e;

    /* renamed from: f  reason: collision with root package name */
    private final q f3510f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicInteger f3511g = new AtomicInteger(1);

    /* renamed from: h  reason: collision with root package name */
    private final AtomicInteger f3512h = new AtomicInteger(0);

    /* renamed from: i  reason: collision with root package name */
    private final Map<s0<?>, a<?>> f3513i = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: j  reason: collision with root package name */
    private q f3514j = null;

    /* renamed from: k  reason: collision with root package name */
    private final Set<s0<?>> f3515k = new c.e.b();

    /* renamed from: l  reason: collision with root package name */
    private final Set<s0<?>> f3516l = new c.e.b();

    /* renamed from: m  reason: collision with root package name */
    private final Handler f3517m;

    public class a<O extends a.d> implements f.a, f.b, w0 {

        /* renamed from: b  reason: collision with root package name */
        private final Queue<t> f3518b = new LinkedList();

        /* renamed from: c  reason: collision with root package name */
        private final a.f f3519c;

        /* renamed from: d  reason: collision with root package name */
        private final a.b f3520d;

        /* renamed from: e  reason: collision with root package name */
        private final s0<O> f3521e;

        /* renamed from: f  reason: collision with root package name */
        private final n f3522f;

        /* renamed from: g  reason: collision with root package name */
        private final Set<t0> f3523g = new HashSet();

        /* renamed from: h  reason: collision with root package name */
        private final Map<i<?>, e0> f3524h = new HashMap();

        /* renamed from: i  reason: collision with root package name */
        private final int f3525i;

        /* renamed from: j  reason: collision with root package name */
        private final f0 f3526j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f3527k;

        /* renamed from: l  reason: collision with root package name */
        private final List<b> f3528l = new ArrayList();

        /* renamed from: m  reason: collision with root package name */
        private com.google.android.gms.common.b f3529m = null;

        public a(com.google.android.gms.common.api.e<O> eVar) {
            this.f3519c = eVar.a(e.this.f3517m.getLooper(), this);
            a.b bVar = this.f3519c;
            this.f3520d = bVar instanceof d0 ? ((d0) bVar).B() : bVar;
            this.f3521e = eVar.e();
            this.f3522f = new n();
            this.f3525i = eVar.c();
            if (this.f3519c.i()) {
                this.f3526j = eVar.a(e.this.f3508d, e.this.f3517m);
            } else {
                this.f3526j = null;
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void a(b bVar) {
            if (!this.f3528l.contains(bVar) || this.f3527k) {
                return;
            }
            if (!this.f3519c.a()) {
                a();
            } else {
                o();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final boolean a(boolean z) {
            y.a(e.this.f3517m);
            if (!this.f3519c.a() || this.f3524h.size() != 0) {
                return false;
            }
            if (this.f3522f.a()) {
                if (z) {
                    q();
                }
                return false;
            }
            this.f3519c.g();
            return true;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void b(b bVar) {
            com.google.android.gms.common.e[] a;
            if (this.f3528l.remove(bVar)) {
                e.this.f3517m.removeMessages(15, bVar);
                e.this.f3517m.removeMessages(16, bVar);
                com.google.android.gms.common.e eVar = bVar.f3530b;
                ArrayList arrayList = new ArrayList(this.f3518b.size());
                for (t tVar : this.f3518b) {
                    if ((tVar instanceof q0) && (a = ((q0) tVar).a()) != null && com.google.android.gms.common.util.b.a(a, eVar)) {
                        arrayList.add(tVar);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    t tVar2 = (t) obj;
                    this.f3518b.remove(tVar2);
                    tVar2.a(new m(eVar));
                }
            }
        }

        private final boolean b(t tVar) {
            if (!(tVar instanceof q0)) {
                c(tVar);
                return true;
            }
            q0 q0Var = (q0) tVar;
            com.google.android.gms.common.e[] a = q0Var.a();
            if (a == null || a.length == 0) {
                c(tVar);
                return true;
            }
            com.google.android.gms.common.e[] e2 = this.f3519c.e();
            if (e2 == null) {
                e2 = new com.google.android.gms.common.e[0];
            }
            c.e.a aVar = new c.e.a(e2.length);
            for (com.google.android.gms.common.e eVar : e2) {
                aVar.put(eVar.t(), Long.valueOf(eVar.u()));
            }
            for (com.google.android.gms.common.e eVar2 : a) {
                if (!aVar.containsKey(eVar2.t()) || ((Long) aVar.get(eVar2.t())).longValue() < eVar2.u()) {
                    if (q0Var.b()) {
                        b bVar = new b(this.f3521e, eVar2, null);
                        int indexOf = this.f3528l.indexOf(bVar);
                        if (indexOf >= 0) {
                            b bVar2 = this.f3528l.get(indexOf);
                            e.this.f3517m.removeMessages(15, bVar2);
                            e.this.f3517m.sendMessageDelayed(Message.obtain(e.this.f3517m, 15, bVar2), e.this.a);
                        } else {
                            this.f3528l.add(bVar);
                            e.this.f3517m.sendMessageDelayed(Message.obtain(e.this.f3517m, 15, bVar), e.this.a);
                            e.this.f3517m.sendMessageDelayed(Message.obtain(e.this.f3517m, 16, bVar), e.this.f3506b);
                            com.google.android.gms.common.b bVar3 = new com.google.android.gms.common.b(2, null);
                            if (!c(bVar3)) {
                                e.this.b(bVar3, this.f3525i);
                            }
                        }
                    } else {
                        q0Var.a(new m(eVar2));
                    }
                    return false;
                }
                this.f3528l.remove(new b(this.f3521e, eVar2, null));
            }
            c(tVar);
            return true;
        }

        private final void c(t tVar) {
            tVar.a(this.f3522f, d());
            try {
                tVar.a((a<?>) this);
            } catch (DeadObjectException unused) {
                e(1);
                this.f3519c.g();
            }
        }

        private final boolean c(com.google.android.gms.common.b bVar) {
            synchronized (e.p) {
                if (e.this.f3514j != null) {
                    if (e.this.f3515k.contains(this.f3521e)) {
                        e.this.f3514j.a(bVar, this.f3525i);
                        throw null;
                    }
                }
            }
            return false;
        }

        private final void d(com.google.android.gms.common.b bVar) {
            for (t0 t0Var : this.f3523g) {
                String str = null;
                if (x.a(bVar, com.google.android.gms.common.b.f3576f)) {
                    str = this.f3519c.f();
                }
                t0Var.a(this.f3521e, bVar, str);
            }
            this.f3523g.clear();
        }

        /* access modifiers changed from: private */
        public final void m() {
            j();
            d(com.google.android.gms.common.b.f3576f);
            p();
            for (e0 e0Var : this.f3524h.values()) {
                try {
                    e0Var.a.a(this.f3520d, new h<>());
                } catch (DeadObjectException unused) {
                    e(1);
                    this.f3519c.g();
                } catch (RemoteException unused2) {
                }
            }
            o();
            q();
        }

        /* access modifiers changed from: private */
        public final void n() {
            j();
            this.f3527k = true;
            this.f3522f.c();
            e.this.f3517m.sendMessageDelayed(Message.obtain(e.this.f3517m, 9, this.f3521e), e.this.a);
            e.this.f3517m.sendMessageDelayed(Message.obtain(e.this.f3517m, 11, this.f3521e), e.this.f3506b);
            e.this.f3510f.a();
        }

        private final void o() {
            ArrayList arrayList = new ArrayList(this.f3518b);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                t tVar = (t) obj;
                if (!this.f3519c.a()) {
                    return;
                }
                if (b(tVar)) {
                    this.f3518b.remove(tVar);
                }
            }
        }

        private final void p() {
            if (this.f3527k) {
                e.this.f3517m.removeMessages(11, this.f3521e);
                e.this.f3517m.removeMessages(9, this.f3521e);
                this.f3527k = false;
            }
        }

        private final void q() {
            e.this.f3517m.removeMessages(12, this.f3521e);
            e.this.f3517m.sendMessageDelayed(e.this.f3517m.obtainMessage(12, this.f3521e), e.this.f3507c);
        }

        public final void a() {
            y.a(e.this.f3517m);
            if (!this.f3519c.a() && !this.f3519c.d()) {
                int a = e.this.f3510f.a(e.this.f3508d, this.f3519c);
                if (a != 0) {
                    a(new com.google.android.gms.common.b(a, null));
                    return;
                }
                c cVar = new c(this.f3519c, this.f3521e);
                if (this.f3519c.i()) {
                    this.f3526j.a(cVar);
                }
                this.f3519c.a(cVar);
            }
        }

        public final void a(Status status) {
            y.a(e.this.f3517m);
            for (t tVar : this.f3518b) {
                tVar.a(status);
            }
            this.f3518b.clear();
        }

        public final void a(t0 t0Var) {
            y.a(e.this.f3517m);
            this.f3523g.add(t0Var);
        }

        public final void a(t tVar) {
            y.a(e.this.f3517m);
            if (!this.f3519c.a()) {
                this.f3518b.add(tVar);
                com.google.android.gms.common.b bVar = this.f3529m;
                if (bVar == null || !bVar.w()) {
                    a();
                } else {
                    a(this.f3529m);
                }
            } else if (b(tVar)) {
                q();
            } else {
                this.f3518b.add(tVar);
            }
        }

        @Override // com.google.android.gms.common.api.f.b
        public final void a(com.google.android.gms.common.b bVar) {
            y.a(e.this.f3517m);
            f0 f0Var = this.f3526j;
            if (f0Var != null) {
                f0Var.M();
            }
            j();
            e.this.f3510f.a();
            d(bVar);
            if (bVar.t() == 4) {
                a(e.o);
            } else if (this.f3518b.isEmpty()) {
                this.f3529m = bVar;
            } else if (!c(bVar) && !e.this.b(bVar, this.f3525i)) {
                if (bVar.t() == 18) {
                    this.f3527k = true;
                }
                if (this.f3527k) {
                    e.this.f3517m.sendMessageDelayed(Message.obtain(e.this.f3517m, 9, this.f3521e), e.this.a);
                    return;
                }
                String a = this.f3521e.a();
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 38);
                sb.append("API: ");
                sb.append(a);
                sb.append(" is not available on this device.");
                a(new Status(17, sb.toString()));
            }
        }

        public final int b() {
            return this.f3525i;
        }

        public final void b(com.google.android.gms.common.b bVar) {
            y.a(e.this.f3517m);
            this.f3519c.g();
            a(bVar);
        }

        /* access modifiers changed from: package-private */
        public final boolean c() {
            return this.f3519c.a();
        }

        public final boolean d() {
            return this.f3519c.i();
        }

        public final void e() {
            y.a(e.this.f3517m);
            if (this.f3527k) {
                a();
            }
        }

        @Override // com.google.android.gms.common.api.f.a
        public final void e(int i2) {
            if (Looper.myLooper() == e.this.f3517m.getLooper()) {
                n();
            } else {
                e.this.f3517m.post(new w(this));
            }
        }

        public final a.f f() {
            return this.f3519c;
        }

        public final void g() {
            y.a(e.this.f3517m);
            if (this.f3527k) {
                p();
                a(e.this.f3509e.b(e.this.f3508d) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                this.f3519c.g();
            }
        }

        public final void h() {
            y.a(e.this.f3517m);
            a(e.n);
            this.f3522f.b();
            for (i iVar : (i[]) this.f3524h.keySet().toArray(new i[this.f3524h.size()])) {
                a(new r0(iVar, new h()));
            }
            d(new com.google.android.gms.common.b(4));
            if (this.f3519c.a()) {
                this.f3519c.a(new x(this));
            }
        }

        public final Map<i<?>, e0> i() {
            return this.f3524h;
        }

        public final void j() {
            y.a(e.this.f3517m);
            this.f3529m = null;
        }

        @Override // com.google.android.gms.common.api.f.a
        public final void j(Bundle bundle) {
            if (Looper.myLooper() == e.this.f3517m.getLooper()) {
                m();
            } else {
                e.this.f3517m.post(new v(this));
            }
        }

        public final com.google.android.gms.common.b k() {
            y.a(e.this.f3517m);
            return this.f3529m;
        }

        public final boolean l() {
            return a(true);
        }
    }

    /* access modifiers changed from: private */
    public static class b {
        private final s0<?> a;

        /* renamed from: b  reason: collision with root package name */
        private final com.google.android.gms.common.e f3530b;

        private b(s0<?> s0Var, com.google.android.gms.common.e eVar) {
            this.a = s0Var;
            this.f3530b = eVar;
        }

        /* synthetic */ b(s0 s0Var, com.google.android.gms.common.e eVar, u uVar) {
            this(s0Var, eVar);
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                return x.a(this.a, bVar.a) && x.a(this.f3530b, bVar.f3530b);
            }
        }

        public final int hashCode() {
            return x.a(this.a, this.f3530b);
        }

        public final String toString() {
            x.a a2 = x.a(this);
            a2.a("key", this.a);
            a2.a("feature", this.f3530b);
            return a2.toString();
        }
    }

    /* access modifiers changed from: private */
    public class c implements j0, d.AbstractC0078d {
        private final a.f a;

        /* renamed from: b  reason: collision with root package name */
        private final s0<?> f3531b;

        /* renamed from: c  reason: collision with root package name */
        private r f3532c = null;

        /* renamed from: d  reason: collision with root package name */
        private Set<Scope> f3533d = null;

        /* renamed from: e  reason: collision with root package name */
        private boolean f3534e = false;

        public c(a.f fVar, s0<?> s0Var) {
            this.a = fVar;
            this.f3531b = s0Var;
        }

        /* access modifiers changed from: private */
        public final void a() {
            r rVar;
            if (this.f3534e && (rVar = this.f3532c) != null) {
                this.a.a(rVar, this.f3533d);
            }
        }

        @Override // com.google.android.gms.common.internal.d.AbstractC0078d
        public final void a(com.google.android.gms.common.b bVar) {
            e.this.f3517m.post(new z(this, bVar));
        }

        @Override // com.google.android.gms.common.api.internal.j0
        public final void a(r rVar, Set<Scope> set) {
            if (rVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                b(new com.google.android.gms.common.b(4));
                return;
            }
            this.f3532c = rVar;
            this.f3533d = set;
            a();
        }

        @Override // com.google.android.gms.common.api.internal.j0
        public final void b(com.google.android.gms.common.b bVar) {
            ((a) e.this.f3513i.get(this.f3531b)).b(bVar);
        }
    }

    private e(Context context, Looper looper, g gVar) {
        this.f3508d = context;
        this.f3517m = new Handler(looper, this);
        this.f3509e = gVar;
        this.f3510f = new q(gVar);
        Handler handler = this.f3517m;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static e a(Context context) {
        e eVar;
        synchronized (p) {
            if (q == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                q = new e(context.getApplicationContext(), handlerThread.getLooper(), g.a());
            }
            eVar = q;
        }
        return eVar;
    }

    private final void b(com.google.android.gms.common.api.e<?> eVar) {
        s0<?> e2 = eVar.e();
        a<?> aVar = this.f3513i.get(e2);
        if (aVar == null) {
            aVar = new a<>(eVar);
            this.f3513i.put(e2, aVar);
        }
        if (aVar.d()) {
            this.f3516l.add(e2);
        }
        aVar.a();
    }

    public final int a() {
        return this.f3511g.getAndIncrement();
    }

    public final void a(com.google.android.gms.common.api.e<?> eVar) {
        Handler handler = this.f3517m;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final <O extends a.d> void a(com.google.android.gms.common.api.e<O> eVar, int i2, c<? extends j, a.b> cVar) {
        p0 p0Var = new p0(i2, cVar);
        Handler handler = this.f3517m;
        handler.sendMessage(handler.obtainMessage(4, new d0(p0Var, this.f3512h.get(), eVar)));
    }

    public final void a(com.google.android.gms.common.b bVar, int i2) {
        if (!b(bVar, i2)) {
            Handler handler = this.f3517m;
            handler.sendMessage(handler.obtainMessage(5, i2, 0, bVar));
        }
    }

    public final void b() {
        Handler handler = this.f3517m;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* access modifiers changed from: package-private */
    public final boolean b(com.google.android.gms.common.b bVar, int i2) {
        return this.f3509e.a(this.f3508d, bVar, i2);
    }

    public boolean handleMessage(Message message) {
        a<?> aVar;
        h<Boolean> hVar;
        boolean z;
        int i2 = message.what;
        long j2 = 300000;
        switch (i2) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j2 = 10000;
                }
                this.f3507c = j2;
                this.f3517m.removeMessages(12);
                for (s0<?> s0Var : this.f3513i.keySet()) {
                    Handler handler = this.f3517m;
                    handler.sendMessageDelayed(handler.obtainMessage(12, s0Var), this.f3507c);
                }
                break;
            case 2:
                t0 t0Var = (t0) message.obj;
                Iterator<s0<?>> it = t0Var.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        s0<?> next = it.next();
                        a<?> aVar2 = this.f3513i.get(next);
                        if (aVar2 == null) {
                            t0Var.a(next, new com.google.android.gms.common.b(13), null);
                            break;
                        } else if (aVar2.c()) {
                            t0Var.a(next, com.google.android.gms.common.b.f3576f, aVar2.f().f());
                        } else if (aVar2.k() != null) {
                            t0Var.a(next, aVar2.k(), null);
                        } else {
                            aVar2.a(t0Var);
                        }
                    }
                }
            case 3:
                for (a<?> aVar3 : this.f3513i.values()) {
                    aVar3.j();
                    aVar3.a();
                }
                break;
            case 4:
            case 8:
            case 13:
                d0 d0Var = (d0) message.obj;
                a<?> aVar4 = this.f3513i.get(d0Var.f3505c.e());
                if (aVar4 == null) {
                    b(d0Var.f3505c);
                    aVar4 = this.f3513i.get(d0Var.f3505c.e());
                }
                if (!aVar4.d() || this.f3512h.get() == d0Var.f3504b) {
                    aVar4.a(d0Var.a);
                    break;
                } else {
                    d0Var.a.a(n);
                    aVar4.h();
                    break;
                }
            case 5:
                int i3 = message.arg1;
                com.google.android.gms.common.b bVar = (com.google.android.gms.common.b) message.obj;
                Iterator<a<?>> it2 = this.f3513i.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        aVar = it2.next();
                        if (aVar.b() == i3) {
                        }
                    } else {
                        aVar = null;
                    }
                }
                if (aVar != null) {
                    String a2 = this.f3509e.a(bVar.t());
                    String u = bVar.u();
                    StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 69 + String.valueOf(u).length());
                    sb.append("Error resolution was canceled by the user, original error message: ");
                    sb.append(a2);
                    sb.append(": ");
                    sb.append(u);
                    aVar.a(new Status(17, sb.toString()));
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i3);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (n.b() && (this.f3508d.getApplicationContext() instanceof Application)) {
                    b.a((Application) this.f3508d.getApplicationContext());
                    b.b().a(new u(this));
                    if (!b.b().a(true)) {
                        this.f3507c = 300000;
                        break;
                    }
                }
                break;
            case 7:
                b((com.google.android.gms.common.api.e) message.obj);
                break;
            case 9:
                if (this.f3513i.containsKey(message.obj)) {
                    this.f3513i.get(message.obj).e();
                    break;
                }
                break;
            case 10:
                for (s0<?> s0Var2 : this.f3516l) {
                    this.f3513i.remove(s0Var2).h();
                }
                this.f3516l.clear();
                break;
            case 11:
                if (this.f3513i.containsKey(message.obj)) {
                    this.f3513i.get(message.obj).g();
                    break;
                }
                break;
            case 12:
                if (this.f3513i.containsKey(message.obj)) {
                    this.f3513i.get(message.obj).l();
                    break;
                }
                break;
            case 14:
                r rVar = (r) message.obj;
                s0<?> b2 = rVar.b();
                if (!this.f3513i.containsKey(b2)) {
                    hVar = rVar.a();
                    z = false;
                } else {
                    boolean a3 = this.f3513i.get(b2).a((a) false);
                    hVar = rVar.a();
                    z = Boolean.valueOf(a3);
                }
                hVar.a(z);
                break;
            case 15:
                b bVar2 = (b) message.obj;
                if (this.f3513i.containsKey(bVar2.a)) {
                    this.f3513i.get(bVar2.a).a((a) bVar2);
                    break;
                }
                break;
            case 16:
                b bVar3 = (b) message.obj;
                if (this.f3513i.containsKey(bVar3.a)) {
                    this.f3513i.get(bVar3.a).b((a) bVar3);
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }
}
