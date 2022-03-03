package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends j> extends g<R> {
    static final ThreadLocal<Boolean> n = new v0();
    private final Object a;

    /* renamed from: b  reason: collision with root package name */
    private final a<R> f3479b;

    /* renamed from: c  reason: collision with root package name */
    private final CountDownLatch f3480c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<g.a> f3481d;

    /* renamed from: e  reason: collision with root package name */
    private k<? super R> f3482e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference<o0> f3483f;

    /* renamed from: g  reason: collision with root package name */
    private R f3484g;

    /* renamed from: h  reason: collision with root package name */
    private Status f3485h;

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f3486i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3487j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3488k;

    /* renamed from: l  reason: collision with root package name */
    private volatile m0<R> f3489l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f3490m;

    public static class a<R extends j> extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(k<? super R> kVar, R r) {
            sendMessage(obtainMessage(1, new Pair(kVar, r)));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.android.gms.common.api.k */
        /* JADX WARN: Multi-variable type inference failed */
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                Pair pair = (Pair) message.obj;
                k kVar = (k) pair.first;
                j jVar = (j) pair.second;
                try {
                    kVar.a(jVar);
                } catch (RuntimeException e2) {
                    BasePendingResult.c(jVar);
                    throw e2;
                }
            } else if (i2 != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i2);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).b(Status.f3461g);
            }
        }
    }

    /* access modifiers changed from: private */
    public final class b {
        private b() {
        }

        /* synthetic */ b(BasePendingResult basePendingResult, v0 v0Var) {
            this();
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            BasePendingResult.c(BasePendingResult.this.f3484g);
            super.finalize();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.a = new Object();
        this.f3480c = new CountDownLatch(1);
        this.f3481d = new ArrayList<>();
        this.f3483f = new AtomicReference<>();
        this.f3490m = false;
        this.f3479b = new a<>(Looper.getMainLooper());
        new WeakReference(null);
    }

    protected BasePendingResult(f fVar) {
        this.a = new Object();
        this.f3480c = new CountDownLatch(1);
        this.f3481d = new ArrayList<>();
        this.f3483f = new AtomicReference<>();
        this.f3490m = false;
        this.f3479b = new a<>(fVar != null ? fVar.a() : Looper.getMainLooper());
        new WeakReference(fVar);
    }

    private final void b(R r) {
        this.f3484g = r;
        this.f3480c.countDown();
        this.f3485h = this.f3484g.m();
        if (this.f3487j) {
            this.f3482e = null;
        } else if (this.f3482e != null) {
            this.f3479b.removeMessages(2);
            this.f3479b.a(this.f3482e, d());
        } else if (this.f3484g instanceof h) {
            new b(this, null);
        }
        ArrayList<g.a> arrayList = this.f3481d;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            g.a aVar = arrayList.get(i2);
            i2++;
            aVar.a(this.f3485h);
        }
        this.f3481d.clear();
    }

    public static void c(j jVar) {
        if (jVar instanceof h) {
            try {
                ((h) jVar).a();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(jVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e2);
            }
        }
    }

    private final R d() {
        R r;
        synchronized (this.a) {
            y.b(!this.f3486i, "Result has already been consumed.");
            y.b(b(), "Result is not ready.");
            r = this.f3484g;
            this.f3484g = null;
            this.f3482e = null;
            this.f3486i = true;
        }
        o0 andSet = this.f3483f.getAndSet(null);
        if (andSet != null) {
            andSet.a(this);
        }
        return r;
    }

    /* access modifiers changed from: protected */
    public abstract R a(Status status);

    public final void a(g.a aVar) {
        y.a(aVar != null, "Callback cannot be null.");
        synchronized (this.a) {
            if (b()) {
                aVar.a(this.f3485h);
            } else {
                this.f3481d.add(aVar);
            }
        }
    }

    public final void a(R r) {
        synchronized (this.a) {
            if (this.f3488k || this.f3487j) {
                c(r);
                return;
            }
            b();
            boolean z = true;
            y.b(!b(), "Results have already been set");
            if (this.f3486i) {
                z = false;
            }
            y.b(z, "Result has already been consumed");
            b(r);
        }
    }

    @Override // com.google.android.gms.common.api.g
    public final void a(k<? super R> kVar) {
        synchronized (this.a) {
            if (kVar == null) {
                this.f3482e = null;
                return;
            }
            boolean z = true;
            y.b(!this.f3486i, "Result has already been consumed.");
            if (this.f3489l != null) {
                z = false;
            }
            y.b(z, "Cannot set callbacks if then() has been called.");
            if (!a()) {
                if (b()) {
                    this.f3479b.a(kVar, d());
                } else {
                    this.f3482e = kVar;
                }
            }
        }
    }

    public boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.f3487j;
        }
        return z;
    }

    public final void b(Status status) {
        synchronized (this.a) {
            if (!b()) {
                a(a(status));
                this.f3488k = true;
            }
        }
    }

    public final boolean b() {
        return this.f3480c.getCount() == 0;
    }

    public final void c() {
        this.f3490m = this.f3490m || n.get().booleanValue();
    }
}
