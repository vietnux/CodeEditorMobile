package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class d<T extends IInterface> {
    private static final com.google.android.gms.common.e[] v = new com.google.android.gms.common.e[0];
    private p a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3621b;

    /* renamed from: c  reason: collision with root package name */
    private final n f3622c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.gms.common.h f3623d;

    /* renamed from: e  reason: collision with root package name */
    final Handler f3624e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f3625f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f3626g;

    /* renamed from: h  reason: collision with root package name */
    private u f3627h;

    /* renamed from: i  reason: collision with root package name */
    protected AbstractC0078d f3628i;

    /* renamed from: j  reason: collision with root package name */
    private T f3629j;

    /* renamed from: k  reason: collision with root package name */
    private final ArrayList<d<T>.c> f3630k;

    /* renamed from: l  reason: collision with root package name */
    private d<T>.f f3631l;

    /* renamed from: m  reason: collision with root package name */
    private int f3632m;
    private final a n;
    private final b o;
    private final int p;
    private final String q;
    private com.google.android.gms.common.b r;
    private boolean s;
    private volatile g t;
    protected AtomicInteger u;

    public interface a {
        void e(int i2);

        void j(Bundle bundle);
    }

    public interface b {
        void a(com.google.android.gms.common.b bVar);
    }

    /* access modifiers changed from: protected */
    public abstract class c<TListener> {
        private TListener a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f3633b = false;

        public c(TListener tlistener) {
            this.a = tlistener;
        }

        public void a() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.a;
                if (this.f3633b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    a(tlistener);
                } catch (RuntimeException e2) {
                    b();
                    throw e2;
                }
            } else {
                b();
            }
            synchronized (this) {
                this.f3633b = true;
            }
            d();
        }

        /* access modifiers changed from: protected */
        public abstract void a(TListener tlistener);

        /* access modifiers changed from: protected */
        public abstract void b();

        public void c() {
            synchronized (this) {
                this.a = null;
            }
        }

        public void d() {
            c();
            synchronized (d.this.f3630k) {
                d.this.f3630k.remove(this);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$d  reason: collision with other inner class name */
    public interface AbstractC0078d {
        void a(com.google.android.gms.common.b bVar);
    }

    public static final class e extends t.a {

        /* renamed from: b  reason: collision with root package name */
        private d f3635b;

        /* renamed from: c  reason: collision with root package name */
        private final int f3636c;

        public e(d dVar, int i2) {
            this.f3635b = dVar;
            this.f3636c = i2;
        }

        @Override // com.google.android.gms.common.internal.t
        public final void a(int i2, IBinder iBinder, Bundle bundle) {
            y.a(this.f3635b, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f3635b.a(i2, iBinder, bundle, this.f3636c);
            this.f3635b = null;
        }

        @Override // com.google.android.gms.common.internal.t
        public final void a(int i2, IBinder iBinder, g gVar) {
            y.a(this.f3635b, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            y.a(gVar);
            this.f3635b.a((d) gVar);
            a(i2, iBinder, gVar.u());
        }

        @Override // com.google.android.gms.common.internal.t
        public final void c(int i2, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }
    }

    public final class f implements ServiceConnection {
        private final int a;

        public f(int i2) {
            this.a = i2;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d dVar = d.this;
            if (iBinder == null) {
                dVar.c((d) 16);
                return;
            }
            synchronized (dVar.f3626g) {
                d.this.f3627h = u.a.a(iBinder);
            }
            d.this.a(0, (Bundle) null, this.a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (d.this.f3626g) {
                d.this.f3627h = null;
            }
            Handler handler = d.this.f3624e;
            handler.sendMessage(handler.obtainMessage(6, this.a, 1));
        }
    }

    /* access modifiers changed from: protected */
    public class g implements AbstractC0078d {
        public g() {
        }

        @Override // com.google.android.gms.common.internal.d.AbstractC0078d
        public void a(com.google.android.gms.common.b bVar) {
            if (bVar.x()) {
                d dVar = d.this;
                dVar.a((r) null, dVar.u());
            } else if (d.this.o != null) {
                d.this.o.a(bVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final class h extends k {

        /* renamed from: g  reason: collision with root package name */
        public final IBinder f3638g;

        public h(int i2, IBinder iBinder, Bundle bundle) {
            super(i2, bundle);
            this.f3638g = iBinder;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.d.k
        public final void a(com.google.android.gms.common.b bVar) {
            if (d.this.o != null) {
                d.this.o.a(bVar);
            }
            d.this.a(bVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.d.k
        public final boolean e() {
            try {
                String interfaceDescriptor = this.f3638g.getInterfaceDescriptor();
                if (!d.this.x().equals(interfaceDescriptor)) {
                    String x = d.this.x();
                    StringBuilder sb = new StringBuilder(String.valueOf(x).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(x);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface a = d.this.a(this.f3638g);
                if (a == null || (!d.this.a((d) 2, 4, (int) a) && !d.this.a((d) 3, 4, (int) a))) {
                    return false;
                }
                d.this.r = null;
                Bundle o = d.this.o();
                if (d.this.n == null) {
                    return true;
                }
                d.this.n.j(o);
                return true;
            } catch (RemoteException unused) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final class i extends k {
        public i(int i2, Bundle bundle) {
            super(i2, bundle);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.d.k
        public final void a(com.google.android.gms.common.b bVar) {
            d.this.f3628i.a(bVar);
            d.this.a(bVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.d.k
        public final boolean e() {
            d.this.f3628i.a(com.google.android.gms.common.b.f3576f);
            return true;
        }
    }

    public interface j {
        void a();
    }

    private abstract class k extends d<T>.c {

        /* renamed from: d  reason: collision with root package name */
        public final int f3641d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f3642e;

        protected k(int i2, Bundle bundle) {
            super(true);
            this.f3641d = i2;
            this.f3642e = bundle;
        }

        /* access modifiers changed from: protected */
        public abstract void a(com.google.android.gms.common.b bVar);

        /* access modifiers changed from: protected */
        public void a(Boolean bool) {
            PendingIntent pendingIntent = null;
            if (bool == null) {
                d.this.b(1, null);
                return;
            }
            int i2 = this.f3641d;
            if (i2 != 0) {
                if (i2 != 10) {
                    d.this.b(1, null);
                    Bundle bundle = this.f3642e;
                    if (bundle != null) {
                        pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                    }
                    a(new com.google.android.gms.common.b(this.f3641d, pendingIntent));
                    return;
                }
                d.this.b(1, null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            } else if (!e()) {
                d.this.b(1, null);
                a(new com.google.android.gms.common.b(8, null));
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.d.c
        public void b() {
        }

        /* access modifiers changed from: protected */
        public abstract boolean e();
    }

    final class l extends Handler {
        public l(Looper looper) {
            super(looper);
        }

        private static void a(Message message) {
            c cVar = (c) message.obj;
            cVar.b();
            cVar.d();
        }

        private static boolean b(Message message) {
            int i2 = message.what;
            return i2 == 2 || i2 == 1 || i2 == 7;
        }

        public final void handleMessage(Message message) {
            if (d.this.u.get() == message.arg1) {
                int i2 = message.what;
                if ((i2 == 1 || i2 == 7 || i2 == 4 || i2 == 5) && !d.this.d()) {
                    a(message);
                    return;
                }
                int i3 = message.what;
                PendingIntent pendingIntent = null;
                if (i3 == 4) {
                    d.this.r = new com.google.android.gms.common.b(message.arg2);
                    if (!d.this.C() || d.this.s) {
                        com.google.android.gms.common.b bVar = d.this.r != null ? d.this.r : new com.google.android.gms.common.b(8);
                        d.this.f3628i.a(bVar);
                        d.this.a(bVar);
                        return;
                    }
                    d.this.b(3, null);
                } else if (i3 == 5) {
                    com.google.android.gms.common.b bVar2 = d.this.r != null ? d.this.r : new com.google.android.gms.common.b(8);
                    d.this.f3628i.a(bVar2);
                    d.this.a(bVar2);
                } else if (i3 == 3) {
                    Object obj = message.obj;
                    if (obj instanceof PendingIntent) {
                        pendingIntent = (PendingIntent) obj;
                    }
                    com.google.android.gms.common.b bVar3 = new com.google.android.gms.common.b(message.arg2, pendingIntent);
                    d.this.f3628i.a(bVar3);
                    d.this.a(bVar3);
                } else if (i3 == 6) {
                    d.this.b(5, null);
                    if (d.this.n != null) {
                        d.this.n.e(message.arg2);
                    }
                    d.this.a(message.arg2);
                    d.this.a((d) 5, 1, (int) null);
                } else if (i3 == 2 && !d.this.a()) {
                    a(message);
                } else if (b(message)) {
                    ((c) message.obj).a();
                } else {
                    int i4 = message.what;
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i4);
                    Log.wtf("GmsClient", sb.toString(), new Exception());
                }
            } else if (b(message)) {
                a(message);
            }
        }
    }

    static {
        new String[]{"service_esmobile", "service_googleme"};
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected d(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.d.a r13, com.google.android.gms.common.internal.d.b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.n r3 = com.google.android.gms.common.internal.n.a(r10)
            com.google.android.gms.common.h r4 = com.google.android.gms.common.h.a()
            com.google.android.gms.common.internal.y.a(r13)
            r6 = r13
            com.google.android.gms.common.internal.d$a r6 = (com.google.android.gms.common.internal.d.a) r6
            com.google.android.gms.common.internal.y.a(r14)
            r7 = r14
            com.google.android.gms.common.internal.d$b r7 = (com.google.android.gms.common.internal.d.b) r7
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.d.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.d$a, com.google.android.gms.common.internal.d$b, java.lang.String):void");
    }

    protected d(Context context, Looper looper, n nVar, com.google.android.gms.common.h hVar, int i2, a aVar, b bVar, String str) {
        this.f3625f = new Object();
        this.f3626g = new Object();
        this.f3630k = new ArrayList<>();
        this.f3632m = 1;
        this.r = null;
        this.s = false;
        this.t = null;
        this.u = new AtomicInteger(0);
        y.a(context, "Context must not be null");
        this.f3621b = context;
        y.a(looper, "Looper must not be null");
        y.a(nVar, "Supervisor must not be null");
        this.f3622c = nVar;
        y.a(hVar, "API availability must not be null");
        this.f3623d = hVar;
        this.f3624e = new l(looper);
        this.p = i2;
        this.n = aVar;
        this.o = bVar;
        this.q = str;
    }

    private final boolean B() {
        boolean z;
        synchronized (this.f3625f) {
            z = this.f3632m == 3;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final boolean C() {
        if (this.s || TextUtils.isEmpty(x()) || TextUtils.isEmpty(r())) {
            return false;
        }
        try {
            Class.forName(x());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(g gVar) {
        this.t = gVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final boolean a(int i2, int i3, T t2) {
        synchronized (this.f3625f) {
            if (this.f3632m != i2) {
                return false;
            }
            b(i3, t2);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void b(int i2, T t2) {
        y.a((i2 == 4) == (t2 != null));
        synchronized (this.f3625f) {
            this.f3632m = i2;
            this.f3629j = t2;
            a(i2, t2);
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    if (!(this.f3631l == null || this.a == null)) {
                        String c2 = this.a.c();
                        String b2 = this.a.b();
                        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 70 + String.valueOf(b2).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(c2);
                        sb.append(" on ");
                        sb.append(b2);
                        Log.e("GmsClient", sb.toString());
                        this.f3622c.b(this.a.c(), this.a.b(), this.a.a(), this.f3631l, s());
                        this.u.incrementAndGet();
                    }
                    this.f3631l = new f(this.u.get());
                    this.a = (this.f3632m != 3 || r() == null) ? new p(z(), y(), false, w()) : new p(p().getPackageName(), r(), true, w());
                    if (!this.f3622c.a(this.a.c(), this.a.b(), this.a.a(), this.f3631l, s())) {
                        String c3 = this.a.c();
                        String b3 = this.a.b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(c3).length() + 34 + String.valueOf(b3).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(c3);
                        sb2.append(" on ");
                        sb2.append(b3);
                        Log.e("GmsClient", sb2.toString());
                        a(16, (Bundle) null, this.u.get());
                    }
                } else if (i2 == 4) {
                    a(t2);
                }
            } else if (this.f3631l != null) {
                this.f3622c.b(y(), z(), w(), this.f3631l, s());
                this.f3631l = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void c(int i2) {
        int i3;
        if (B()) {
            i3 = 5;
            this.s = true;
        } else {
            i3 = 4;
        }
        Handler handler = this.f3624e;
        handler.sendMessage(handler.obtainMessage(i3, this.u.get(), 16));
    }

    public boolean A() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract T a(IBinder iBinder);

    /* access modifiers changed from: protected */
    public void a(int i2) {
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void a(int i2, Bundle bundle, int i3) {
        Handler handler = this.f3624e;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new i(i2, bundle)));
    }

    /* access modifiers changed from: protected */
    public void a(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.f3624e;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new h(i2, iBinder, bundle)));
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, T t2) {
    }

    /* access modifiers changed from: protected */
    public void a(T t2) {
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public void a(com.google.android.gms.common.b bVar) {
        bVar.t();
        System.currentTimeMillis();
    }

    public void a(AbstractC0078d dVar) {
        y.a(dVar, "Connection progress callbacks cannot be null.");
        this.f3628i = dVar;
        b(2, null);
    }

    /* access modifiers changed from: protected */
    public void a(AbstractC0078d dVar, int i2, PendingIntent pendingIntent) {
        y.a(dVar, "Connection progress callbacks cannot be null.");
        this.f3628i = dVar;
        Handler handler = this.f3624e;
        handler.sendMessage(handler.obtainMessage(3, this.u.get(), i2, pendingIntent));
    }

    public void a(j jVar) {
        jVar.a();
    }

    public void a(r rVar, Set<Scope> set) {
        Bundle q2 = q();
        j jVar = new j(this.p);
        jVar.b(this.f3621b.getPackageName());
        jVar.a(q2);
        if (set != null) {
            jVar.a(set);
        }
        if (i()) {
            jVar.a(m());
            jVar.a(rVar);
        } else if (A()) {
            jVar.a(l());
        }
        jVar.b(t());
        jVar.a(n());
        try {
            synchronized (this.f3626g) {
                if (this.f3627h != null) {
                    this.f3627h.a(new e(this, this.u.get()), jVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            b(1);
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException | RuntimeException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            a(8, (IBinder) null, (Bundle) null, this.u.get());
        }
    }

    public boolean a() {
        boolean z;
        synchronized (this.f3625f) {
            z = this.f3632m == 4;
        }
        return z;
    }

    public void b(int i2) {
        Handler handler = this.f3624e;
        handler.sendMessage(handler.obtainMessage(6, this.u.get(), i2));
    }

    public boolean b() {
        return true;
    }

    public int c() {
        return com.google.android.gms.common.h.a;
    }

    public boolean d() {
        boolean z;
        synchronized (this.f3625f) {
            if (this.f3632m != 2) {
                if (this.f3632m != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public final com.google.android.gms.common.e[] e() {
        g gVar = this.t;
        if (gVar == null) {
            return null;
        }
        return gVar.t();
    }

    public String f() {
        p pVar;
        if (a() && (pVar = this.a) != null) {
            return pVar.b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public void g() {
        this.u.incrementAndGet();
        synchronized (this.f3630k) {
            int size = this.f3630k.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f3630k.get(i2).c();
            }
            this.f3630k.clear();
        }
        synchronized (this.f3626g) {
            this.f3627h = null;
        }
        b(1, null);
    }

    public boolean i() {
        return false;
    }

    public void j() {
        int a2 = this.f3623d.a(this.f3621b, c());
        if (a2 != 0) {
            b(1, null);
            a(new g(), a2, (PendingIntent) null);
            return;
        }
        a(new g());
    }

    /* access modifiers changed from: protected */
    public final void k() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public Account l() {
        return null;
    }

    public final Account m() {
        return l() != null ? l() : new Account("<<default account>>", "com.google");
    }

    public com.google.android.gms.common.e[] n() {
        return v;
    }

    public Bundle o() {
        return null;
    }

    public final Context p() {
        return this.f3621b;
    }

    /* access modifiers changed from: protected */
    public Bundle q() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    public String r() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final String s() {
        String str = this.q;
        return str == null ? this.f3621b.getClass().getName() : str;
    }

    public com.google.android.gms.common.e[] t() {
        return v;
    }

    /* access modifiers changed from: protected */
    public Set<Scope> u() {
        return Collections.EMPTY_SET;
    }

    public final T v() {
        T t2;
        synchronized (this.f3625f) {
            if (this.f3632m != 5) {
                k();
                y.b(this.f3629j != null, "Client is connected but service is null");
                t2 = this.f3629j;
            } else {
                throw new DeadObjectException();
            }
        }
        return t2;
    }

    /* access modifiers changed from: protected */
    public int w() {
        return 129;
    }

    /* access modifiers changed from: protected */
    public abstract String x();

    /* access modifiers changed from: protected */
    public abstract String y();

    /* access modifiers changed from: protected */
    public String z() {
        return "com.google.android.gms";
    }
}
