package f.a.a.a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import f.a.a.a.a;
import f.a.a.a.n.b.p;
import f.a.a.a.n.c.e;
import f.a.a.a.n.c.l;
import f.a.a.a.n.c.m;
import f.a.a.a.n.c.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

public class c {

    /* renamed from: l  reason: collision with root package name */
    static volatile c f8331l;

    /* renamed from: m  reason: collision with root package name */
    static final l f8332m = new b();
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<? extends i>, i> f8333b;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f8334c;

    /* renamed from: d  reason: collision with root package name */
    private final f<c> f8335d;

    /* renamed from: e  reason: collision with root package name */
    private final f<?> f8336e;

    /* renamed from: f  reason: collision with root package name */
    private final p f8337f;

    /* renamed from: g  reason: collision with root package name */
    private a f8338g;

    /* renamed from: h  reason: collision with root package name */
    private WeakReference<Activity> f8339h;

    /* renamed from: i  reason: collision with root package name */
    private AtomicBoolean f8340i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    final l f8341j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f8342k;

    /* access modifiers changed from: package-private */
    public class a extends a.b {
        a() {
        }

        @Override // f.a.a.a.a.b
        public void a(Activity activity, Bundle bundle) {
            c.this.a(activity);
        }

        @Override // f.a.a.a.a.b
        public void c(Activity activity) {
            c.this.a(activity);
        }

        @Override // f.a.a.a.a.b
        public void d(Activity activity) {
            c.this.a(activity);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements f {

        /* renamed from: b  reason: collision with root package name */
        final CountDownLatch f8343b = new CountDownLatch(this.f8344c);

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f8344c;

        b(int i2) {
            this.f8344c = i2;
        }

        @Override // f.a.a.a.f
        public void a(Exception exc) {
            c.this.f8335d.a(exc);
        }

        @Override // f.a.a.a.f
        public void a(Object obj) {
            this.f8343b.countDown();
            if (this.f8343b.getCount() == 0) {
                c.this.f8340i.set(true);
                c.this.f8335d.a(c.this);
            }
        }
    }

    /* renamed from: f.a.a.a.c$c  reason: collision with other inner class name */
    public static class C0124c {
        private final Context a;

        /* renamed from: b  reason: collision with root package name */
        private i[] f8346b;

        /* renamed from: c  reason: collision with root package name */
        private l f8347c;

        /* renamed from: d  reason: collision with root package name */
        private Handler f8348d;

        /* renamed from: e  reason: collision with root package name */
        private l f8349e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f8350f;

        /* renamed from: g  reason: collision with root package name */
        private String f8351g;

        /* renamed from: h  reason: collision with root package name */
        private String f8352h;

        /* renamed from: i  reason: collision with root package name */
        private f<c> f8353i;

        public C0124c(Context context) {
            if (context != null) {
                this.a = context;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public C0124c a(i... iVarArr) {
            if (this.f8346b == null) {
                this.f8346b = iVarArr;
                return this;
            }
            throw new IllegalStateException("Kits already set.");
        }

        public c a() {
            if (this.f8347c == null) {
                this.f8347c = l.a();
            }
            if (this.f8348d == null) {
                this.f8348d = new Handler(Looper.getMainLooper());
            }
            if (this.f8349e == null) {
                this.f8349e = this.f8350f ? new b(3) : new b();
            }
            if (this.f8352h == null) {
                this.f8352h = this.a.getPackageName();
            }
            if (this.f8353i == null) {
                this.f8353i = f.a;
            }
            i[] iVarArr = this.f8346b;
            Map hashMap = iVarArr == null ? new HashMap() : c.b(Arrays.asList(iVarArr));
            Context applicationContext = this.a.getApplicationContext();
            return new c(applicationContext, hashMap, this.f8347c, this.f8348d, this.f8349e, this.f8350f, this.f8353i, new p(applicationContext, this.f8352h, this.f8351g, hashMap.values()), c.d(this.a));
        }
    }

    c(Context context, Map<Class<? extends i>, i> map, l lVar, Handler handler, l lVar2, boolean z, f fVar, p pVar, Activity activity) {
        this.a = context;
        this.f8333b = map;
        this.f8334c = lVar;
        this.f8341j = lVar2;
        this.f8342k = z;
        this.f8335d = fVar;
        this.f8336e = a(map.size());
        this.f8337f = pVar;
        a(activity);
    }

    public static c a(Context context, i... iVarArr) {
        if (f8331l == null) {
            synchronized (c.class) {
                if (f8331l == null) {
                    C0124c cVar = new C0124c(context);
                    cVar.a(iVarArr);
                    c(cVar.a());
                }
            }
        }
        return f8331l;
    }

    public static <T extends i> T a(Class<T> cls) {
        return (T) j().f8333b.get(cls);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.Class<? extends f.a.a.a.i>, f.a.a.a.i> */
    /* JADX WARN: Multi-variable type inference failed */
    private static void a(Map<Class<? extends i>, i> map, Collection<? extends i> collection) {
        for (i iVar : collection) {
            map.put(iVar.getClass(), iVar);
            if (iVar instanceof j) {
                a(map, ((j) iVar).a());
            }
        }
    }

    /* access modifiers changed from: private */
    public static Map<Class<? extends i>, i> b(Collection<? extends i> collection) {
        HashMap hashMap = new HashMap(collection.size());
        a(hashMap, collection);
        return hashMap;
    }

    private static void c(c cVar) {
        f8331l = cVar;
        cVar.h();
    }

    /* access modifiers changed from: private */
    public static Activity d(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public static l g() {
        return f8331l == null ? f8332m : f8331l.f8341j;
    }

    private void h() {
        this.f8338g = new a(this.a);
        this.f8338g.a(new a());
        b(this.a);
    }

    public static boolean i() {
        if (f8331l == null) {
            return false;
        }
        return f8331l.f8342k;
    }

    static c j() {
        if (f8331l != null) {
            return f8331l;
        }
        throw new IllegalStateException("Must Initialize Fabric before using singleton()");
    }

    public a a() {
        return this.f8338g;
    }

    public c a(Activity activity) {
        this.f8339h = new WeakReference<>(activity);
        return this;
    }

    /* access modifiers changed from: package-private */
    public f<?> a(int i2) {
        return new b(i2);
    }

    /* access modifiers changed from: package-private */
    public Future<Map<String, k>> a(Context context) {
        return c().submit(new e(context.getPackageCodePath()));
    }

    /* access modifiers changed from: package-private */
    public void a(Map<Class<? extends i>, i> map, i iVar) {
        e eVar = iVar.f8361g;
        if (eVar != null) {
            Class<?>[] value = eVar.value();
            for (Class<?> cls : value) {
                if (cls.isInterface()) {
                    for (i iVar2 : map.values()) {
                        if (cls.isAssignableFrom(iVar2.getClass())) {
                            iVar.f8357c.a((m) iVar2.f8357c);
                        }
                    }
                } else if (map.get(cls) != null) {
                    iVar.f8357c.a((m) map.get(cls).f8357c);
                } else {
                    throw new n("Referenced Kit was null, does the kit exist?");
                }
            }
        }
    }

    public Activity b() {
        WeakReference<Activity> weakReference = this.f8339h;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void b(Context context) {
        StringBuilder sb;
        Future<Map<String, k>> a2 = a(context);
        Collection<i> e2 = e();
        m mVar = new m(a2, e2);
        ArrayList<i> arrayList = new ArrayList(e2);
        Collections.sort(arrayList);
        mVar.a(context, this, f.a, this.f8337f);
        for (i iVar : arrayList) {
            iVar.a(context, this, this.f8336e, this.f8337f);
        }
        mVar.r();
        if (g().a("Fabric", 3)) {
            sb = new StringBuilder("Initializing ");
            sb.append(d());
            sb.append(" [Version: ");
            sb.append(f());
            sb.append("], with the following kits:\n");
        } else {
            sb = null;
        }
        for (i iVar2 : arrayList) {
            iVar2.f8357c.a((m) mVar.f8357c);
            a(this.f8333b, iVar2);
            iVar2.r();
            if (sb != null) {
                sb.append(iVar2.n());
                sb.append(" [Version: ");
                sb.append(iVar2.p());
                sb.append("]\n");
            }
        }
        if (sb != null) {
            g().e("Fabric", sb.toString());
        }
    }

    public ExecutorService c() {
        return this.f8334c;
    }

    public String d() {
        return "io.fabric.sdk.android:fabric";
    }

    public Collection<i> e() {
        return this.f8333b.values();
    }

    public String f() {
        return "1.4.2.22";
    }
}
