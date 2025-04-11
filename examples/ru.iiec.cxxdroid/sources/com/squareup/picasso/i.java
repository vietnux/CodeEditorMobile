package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* access modifiers changed from: package-private */
public class i {
    final b a = new b();

    /* renamed from: b  reason: collision with root package name */
    final Context f6827b;

    /* renamed from: c  reason: collision with root package name */
    final ExecutorService f6828c;

    /* renamed from: d  reason: collision with root package name */
    final j f6829d;

    /* renamed from: e  reason: collision with root package name */
    final Map<String, c> f6830e;

    /* renamed from: f  reason: collision with root package name */
    final Map<Object, a> f6831f;

    /* renamed from: g  reason: collision with root package name */
    final Map<Object, a> f6832g;

    /* renamed from: h  reason: collision with root package name */
    final Set<Object> f6833h;

    /* renamed from: i  reason: collision with root package name */
    final Handler f6834i;

    /* renamed from: j  reason: collision with root package name */
    final Handler f6835j;

    /* renamed from: k  reason: collision with root package name */
    final d f6836k;

    /* renamed from: l  reason: collision with root package name */
    final a0 f6837l;

    /* renamed from: m  reason: collision with root package name */
    final List<c> f6838m;
    final c n;
    final boolean o;
    boolean p;

    private static class a extends Handler {
        private final i a;

        /* renamed from: com.squareup.picasso.i$a$a  reason: collision with other inner class name */
        class RunnableC0099a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Message f6839b;

            RunnableC0099a(a aVar, Message message) {
                this.f6839b = message;
            }

            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f6839b.what);
            }
        }

        a(Looper looper, i iVar) {
            super(looper);
            this.a = iVar;
        }

        public void handleMessage(Message message) {
            boolean z = false;
            switch (message.what) {
                case 1:
                    this.a.d((a) message.obj);
                    return;
                case 2:
                    this.a.c((a) message.obj);
                    return;
                case 3:
                case 8:
                default:
                    t.p.post(new RunnableC0099a(this, message));
                    return;
                case 4:
                    this.a.d((c) message.obj);
                    return;
                case 5:
                    this.a.e((c) message.obj);
                    return;
                case 6:
                    this.a.a((c) message.obj, false);
                    return;
                case 7:
                    this.a.a();
                    return;
                case 9:
                    this.a.b((NetworkInfo) message.obj);
                    return;
                case 10:
                    i iVar = this.a;
                    if (message.arg1 == 1) {
                        z = true;
                    }
                    iVar.b(z);
                    return;
                case 11:
                    this.a.a(message.obj);
                    return;
                case 12:
                    this.a.b(message.obj);
                    return;
            }
        }
    }

    static class b extends HandlerThread {
        b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    static class c extends BroadcastReceiver {
        private final i a;

        c(i iVar) {
            this.a = iVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.a.o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.a.f6827b.registerReceiver(this, intentFilter);
        }

        @SuppressLint({"MissingPermission"})
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if (intent.hasExtra("state")) {
                        this.a.a(intent.getBooleanExtra("state", false));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    this.a.a(((ConnectivityManager) d0.a(context, "connectivity")).getActiveNetworkInfo());
                }
            }
        }
    }

    i(Context context, ExecutorService executorService, Handler handler, j jVar, d dVar, a0 a0Var) {
        this.a.start();
        d0.a(this.a.getLooper());
        this.f6827b = context;
        this.f6828c = executorService;
        this.f6830e = new LinkedHashMap();
        this.f6831f = new WeakHashMap();
        this.f6832g = new WeakHashMap();
        this.f6833h = new LinkedHashSet();
        this.f6834i = new a(this.a.getLooper(), this);
        this.f6829d = jVar;
        this.f6835j = handler;
        this.f6836k = dVar;
        this.f6837l = a0Var;
        this.f6838m = new ArrayList(4);
        this.p = d0.c(this.f6827b);
        this.o = d0.b(context, "android.permission.ACCESS_NETWORK_STATE");
        this.n = new c(this);
        this.n.a();
    }

    private void a(List<c> list) {
        if (!(list == null || list.isEmpty() || !list.get(0).i().n)) {
            StringBuilder sb = new StringBuilder();
            for (c cVar : list) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(d0.a(cVar));
            }
            d0.a("Dispatcher", "delivered", sb.toString());
        }
    }

    private void b() {
        if (!this.f6831f.isEmpty()) {
            Iterator<a> it = this.f6831f.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                it.remove();
                if (next.e().n) {
                    d0.a("Dispatcher", "replaying", next.g().d());
                }
                a(next, false);
            }
        }
    }

    private void e(a aVar) {
        Object i2 = aVar.i();
        if (i2 != null) {
            aVar.f6774k = true;
            this.f6831f.put(i2, aVar);
        }
    }

    private void f(c cVar) {
        if (!cVar.m()) {
            Bitmap bitmap = cVar.n;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.f6838m.add(cVar);
            if (!this.f6834i.hasMessages(7)) {
                this.f6834i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    private void g(c cVar) {
        a b2 = cVar.b();
        if (b2 != null) {
            e(b2);
        }
        List<a> c2 = cVar.c();
        if (c2 != null) {
            int size = c2.size();
            for (int i2 = 0; i2 < size; i2++) {
                e(c2.get(i2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        ArrayList arrayList = new ArrayList(this.f6838m);
        this.f6838m.clear();
        Handler handler = this.f6835j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        a((List<c>) arrayList);
    }

    /* access modifiers changed from: package-private */
    public void a(NetworkInfo networkInfo) {
        Handler handler = this.f6834i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        Handler handler = this.f6834i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar, boolean z) {
        if (this.f6833h.contains(aVar.h())) {
            this.f6832g.put(aVar.i(), aVar);
            if (aVar.e().n) {
                String d2 = aVar.f6765b.d();
                d0.a("Dispatcher", "paused", d2, "because tag '" + aVar.h() + "' is paused");
                return;
            }
            return;
        }
        c cVar = this.f6830e.get(aVar.b());
        if (cVar != null) {
            cVar.a(aVar);
        } else if (!this.f6828c.isShutdown()) {
            c a2 = c.a(aVar.e(), this, this.f6836k, this.f6837l, aVar);
            a2.o = this.f6828c.submit(a2);
            this.f6830e.put(aVar.b(), a2);
            if (z) {
                this.f6831f.remove(aVar.i());
            }
            if (aVar.e().n) {
                d0.a("Dispatcher", "enqueued", aVar.f6765b.d());
            }
        } else if (aVar.e().n) {
            d0.a("Dispatcher", "ignored", aVar.f6765b.d(), "because shut down");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar) {
        Handler handler = this.f6834i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar, boolean z) {
        if (cVar.i().n) {
            String a2 = d0.a(cVar);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            sb.append(z ? " (will replay)" : "");
            d0.a("Dispatcher", "batched", a2, sb.toString());
        }
        this.f6830e.remove(cVar.f());
        f(cVar);
    }

    /* access modifiers changed from: package-private */
    public void a(Object obj) {
        if (this.f6833h.add(obj)) {
            Iterator<c> it = this.f6830e.values().iterator();
            while (it.hasNext()) {
                c next = it.next();
                boolean z = next.i().n;
                a b2 = next.b();
                List<a> c2 = next.c();
                boolean z2 = c2 != null && !c2.isEmpty();
                if (b2 != null || z2) {
                    if (b2 != null && b2.h().equals(obj)) {
                        next.b(b2);
                        this.f6832g.put(b2.i(), b2);
                        if (z) {
                            d0.a("Dispatcher", "paused", b2.f6765b.d(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z2) {
                        for (int size = c2.size() - 1; size >= 0; size--) {
                            a aVar = c2.get(size);
                            if (aVar.h().equals(obj)) {
                                next.b(aVar);
                                this.f6832g.put(aVar.i(), aVar);
                                if (z) {
                                    d0.a("Dispatcher", "paused", aVar.f6765b.d(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (next.a()) {
                        it.remove();
                        if (z) {
                            d0.a("Dispatcher", "canceled", d0.a(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        Handler handler = this.f6834i;
        handler.sendMessage(handler.obtainMessage(10, z ? 1 : 0, 0));
    }

    /* access modifiers changed from: package-private */
    public void b(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f6828c;
        if (executorService instanceof v) {
            ((v) executorService).a(networkInfo);
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar) {
        Handler handler = this.f6834i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    /* access modifiers changed from: package-private */
    public void b(c cVar) {
        Handler handler = this.f6834i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    /* access modifiers changed from: package-private */
    public void b(Object obj) {
        if (this.f6833h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator<a> it = this.f6832g.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.h().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f6835j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z) {
        this.p = z;
    }

    /* access modifiers changed from: package-private */
    public void c(a aVar) {
        String b2 = aVar.b();
        c cVar = this.f6830e.get(b2);
        if (cVar != null) {
            cVar.b(aVar);
            if (cVar.a()) {
                this.f6830e.remove(b2);
                if (aVar.e().n) {
                    d0.a("Dispatcher", "canceled", aVar.g().d());
                }
            }
        }
        if (this.f6833h.contains(aVar.h())) {
            this.f6832g.remove(aVar.i());
            if (aVar.e().n) {
                d0.a("Dispatcher", "canceled", aVar.g().d(), "because paused request got canceled");
            }
        }
        a remove = this.f6831f.remove(aVar.i());
        if (remove != null && remove.e().n) {
            d0.a("Dispatcher", "canceled", remove.g().d(), "from replaying");
        }
    }

    /* access modifiers changed from: package-private */
    public void c(c cVar) {
        Handler handler = this.f6834i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500);
    }

    /* access modifiers changed from: package-private */
    public void d(a aVar) {
        a(aVar, true);
    }

    /* access modifiers changed from: package-private */
    public void d(c cVar) {
        if (p.b(cVar.h())) {
            this.f6836k.a(cVar.f(), cVar.k());
        }
        this.f6830e.remove(cVar.f());
        f(cVar);
        if (cVar.i().n) {
            d0.a("Dispatcher", "batched", d0.a(cVar), "for completion");
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    public void e(c cVar) {
        if (!cVar.m()) {
            boolean z = false;
            if (this.f6828c.isShutdown()) {
                a(cVar, false);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.o) {
                networkInfo = ((ConnectivityManager) d0.a(this.f6827b, "connectivity")).getActiveNetworkInfo();
            }
            if (cVar.a(this.p, networkInfo)) {
                if (cVar.i().n) {
                    d0.a("Dispatcher", "retrying", d0.a(cVar));
                }
                if (cVar.e() instanceof r.a) {
                    cVar.f6812j |= q.NO_CACHE.f6865b;
                }
                cVar.o = this.f6828c.submit(cVar);
                return;
            }
            if (this.o && cVar.n()) {
                z = true;
            }
            a(cVar, z);
            if (z) {
                g(cVar);
            }
        }
    }
}
