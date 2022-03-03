package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.squareup.picasso.a;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

public class t {
    static final Handler p = new a(Looper.getMainLooper());
    @SuppressLint({"StaticFieldLeak"})
    static volatile t q = null;
    private final d a;

    /* renamed from: b  reason: collision with root package name */
    private final g f6869b;

    /* renamed from: c  reason: collision with root package name */
    private final c f6870c;

    /* renamed from: d  reason: collision with root package name */
    private final List<y> f6871d;

    /* renamed from: e  reason: collision with root package name */
    final Context f6872e;

    /* renamed from: f  reason: collision with root package name */
    final i f6873f;

    /* renamed from: g  reason: collision with root package name */
    final d f6874g;

    /* renamed from: h  reason: collision with root package name */
    final a0 f6875h;

    /* renamed from: i  reason: collision with root package name */
    final Map<Object, a> f6876i;

    /* renamed from: j  reason: collision with root package name */
    final Map<ImageView, h> f6877j;

    /* renamed from: k  reason: collision with root package name */
    final ReferenceQueue<Object> f6878k;

    /* renamed from: l  reason: collision with root package name */
    final Bitmap.Config f6879l;

    /* renamed from: m  reason: collision with root package name */
    boolean f6880m;
    volatile boolean n;
    boolean o;

    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 != 3) {
                int i3 = 0;
                if (i2 == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    while (i3 < size) {
                        c cVar = (c) list.get(i3);
                        cVar.f6805c.a(cVar);
                        i3++;
                    }
                } else if (i2 == 13) {
                    List list2 = (List) message.obj;
                    int size2 = list2.size();
                    while (i3 < size2) {
                        a aVar = (a) list2.get(i3);
                        aVar.a.b(aVar);
                        i3++;
                    }
                } else {
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
            } else {
                a aVar2 = (a) message.obj;
                if (aVar2.e().n) {
                    d0.a("Main", "canceled", aVar2.f6765b.d(), "target got garbage collected");
                }
                aVar2.a.a(aVar2.i());
            }
        }
    }

    public static class b {
        private final Context a;

        /* renamed from: b  reason: collision with root package name */
        private j f6881b;

        /* renamed from: c  reason: collision with root package name */
        private ExecutorService f6882c;

        /* renamed from: d  reason: collision with root package name */
        private d f6883d;

        /* renamed from: e  reason: collision with root package name */
        private d f6884e;

        /* renamed from: f  reason: collision with root package name */
        private g f6885f;

        /* renamed from: g  reason: collision with root package name */
        private List<y> f6886g;

        /* renamed from: h  reason: collision with root package name */
        private Bitmap.Config f6887h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f6888i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f6889j;

        public b(Context context) {
            if (context != null) {
                this.a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public t a() {
            Context context = this.a;
            if (this.f6881b == null) {
                this.f6881b = new s(context);
            }
            if (this.f6883d == null) {
                this.f6883d = new m(context);
            }
            if (this.f6882c == null) {
                this.f6882c = new v();
            }
            if (this.f6885f == null) {
                this.f6885f = g.a;
            }
            a0 a0Var = new a0(this.f6883d);
            return new t(context, new i(context, this.f6882c, t.p, this.f6881b, this.f6883d, a0Var), this.f6883d, this.f6884e, this.f6885f, this.f6886g, a0Var, this.f6887h, this.f6888i, this.f6889j);
        }
    }

    private static class c extends Thread {

        /* renamed from: b  reason: collision with root package name */
        private final ReferenceQueue<Object> f6890b;

        /* renamed from: c  reason: collision with root package name */
        private final Handler f6891c;

        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Exception f6892b;

            a(c cVar, Exception exc) {
                this.f6892b = exc;
            }

            public void run() {
                throw new RuntimeException(this.f6892b);
            }
        }

        c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f6890b = referenceQueue;
            this.f6891c = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a.C0096a aVar = (a.C0096a) this.f6890b.remove(1000);
                    Message obtainMessage = this.f6891c.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.a;
                        this.f6891c.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e2) {
                    this.f6891c.post(new a(this, e2));
                    return;
                }
            }
        }
    }

    public interface d {
        void a(t tVar, Uri uri, Exception exc);
    }

    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        

        /* renamed from: b  reason: collision with root package name */
        final int f6897b;

        private e(int i2) {
            this.f6897b = i2;
        }
    }

    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    public interface g {
        public static final g a = new a();

        static class a implements g {
            a() {
            }

            @Override // com.squareup.picasso.t.g
            public w a(w wVar) {
                return wVar;
            }
        }

        w a(w wVar);
    }

    t(Context context, i iVar, d dVar, d dVar2, g gVar, List<y> list, a0 a0Var, Bitmap.Config config, boolean z, boolean z2) {
        this.f6872e = context;
        this.f6873f = iVar;
        this.f6874g = dVar;
        this.a = dVar2;
        this.f6869b = gVar;
        this.f6879l = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new z(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new f(context));
        arrayList.add(new o(context));
        arrayList.add(new g(context));
        arrayList.add(new b(context));
        arrayList.add(new k(context));
        arrayList.add(new r(iVar.f6829d, a0Var));
        this.f6871d = Collections.unmodifiableList(arrayList);
        this.f6875h = a0Var;
        this.f6876i = new WeakHashMap();
        this.f6877j = new WeakHashMap();
        this.f6880m = z;
        this.n = z2;
        this.f6878k = new ReferenceQueue<>();
        this.f6870c = new c(this.f6878k, p);
        this.f6870c.start();
    }

    private void a(Bitmap bitmap, e eVar, a aVar, Exception exc) {
        String str;
        String str2;
        String str3;
        if (!aVar.j()) {
            if (!aVar.k()) {
                this.f6876i.remove(aVar.i());
            }
            if (bitmap == null) {
                aVar.a(exc);
                if (this.n) {
                    str3 = aVar.f6765b.d();
                    str2 = exc.getMessage();
                    str = "errored";
                } else {
                    return;
                }
            } else if (eVar != null) {
                aVar.a(bitmap, eVar);
                if (this.n) {
                    str3 = aVar.f6765b.d();
                    str2 = "from " + eVar;
                    str = "completed";
                } else {
                    return;
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
            d0.a("Main", str, str3, str2);
        }
    }

    public static t b() {
        if (q == null) {
            synchronized (t.class) {
                if (q == null) {
                    if (PicassoProvider.f6764b != null) {
                        q = new b(PicassoProvider.f6764b).a();
                    } else {
                        throw new IllegalStateException("context == null");
                    }
                }
            }
        }
        return q;
    }

    /* access modifiers changed from: package-private */
    public w a(w wVar) {
        this.f6869b.a(wVar);
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("Request transformer " + this.f6869b.getClass().getCanonicalName() + " returned null for " + wVar);
    }

    public x a(Uri uri) {
        return new x(this, uri, 0);
    }

    public x a(String str) {
        if (str == null) {
            return new x(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return a(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* access modifiers changed from: package-private */
    public List<y> a() {
        return this.f6871d;
    }

    public void a(ImageView imageView) {
        if (imageView != null) {
            a((Object) imageView);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    /* access modifiers changed from: package-private */
    public void a(ImageView imageView, h hVar) {
        if (this.f6877j.containsKey(imageView)) {
            a((Object) imageView);
        }
        this.f6877j.put(imageView, hVar);
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        Object i2 = aVar.i();
        if (!(i2 == null || this.f6876i.get(i2) == aVar)) {
            a(i2);
            this.f6876i.put(i2, aVar);
        }
        c(aVar);
    }

    /* access modifiers changed from: package-private */
    public void a(c cVar) {
        a b2 = cVar.b();
        List<a> c2 = cVar.c();
        boolean z = true;
        boolean z2 = c2 != null && !c2.isEmpty();
        if (b2 == null && !z2) {
            z = false;
        }
        if (z) {
            Uri uri = cVar.d().f6912d;
            Exception e2 = cVar.e();
            Bitmap k2 = cVar.k();
            e g2 = cVar.g();
            if (b2 != null) {
                a(k2, g2, b2, e2);
            }
            if (z2) {
                int size = c2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    a(k2, g2, c2.get(i2), e2);
                }
            }
            d dVar = this.a;
            if (!(dVar == null || e2 == null)) {
                dVar.a(this, uri, e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Object obj) {
        h remove;
        d0.a();
        a remove2 = this.f6876i.remove(obj);
        if (remove2 != null) {
            remove2.a();
            this.f6873f.a(remove2);
        }
        if ((obj instanceof ImageView) && (remove = this.f6877j.remove((ImageView) obj)) != null) {
            remove.a();
        }
    }

    /* access modifiers changed from: package-private */
    public Bitmap b(String str) {
        Bitmap a2 = this.f6874g.a(str);
        a0 a0Var = this.f6875h;
        if (a2 != null) {
            a0Var.b();
        } else {
            a0Var.c();
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar) {
        Bitmap b2 = p.a(aVar.f6768e) ? b(aVar.b()) : null;
        if (b2 != null) {
            a(b2, e.MEMORY, aVar, null);
            if (this.n) {
                String d2 = aVar.f6765b.d();
                d0.a("Main", "completed", d2, "from " + e.MEMORY);
                return;
            }
            return;
        }
        a(aVar);
        if (this.n) {
            d0.a("Main", "resumed", aVar.f6765b.d());
        }
    }

    /* access modifiers changed from: package-private */
    public void c(a aVar) {
        this.f6873f.b(aVar);
    }
}
