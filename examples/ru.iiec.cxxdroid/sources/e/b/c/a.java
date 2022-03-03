package e.b.c;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.n;
import com.google.firebase.components.l;
import com.google.firebase.components.p;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class a {

    /* renamed from: h  reason: collision with root package name */
    private static final List<String> f7858h = Arrays.asList("com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId");

    /* renamed from: i  reason: collision with root package name */
    private static final List<String> f7859i = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");

    /* renamed from: j  reason: collision with root package name */
    private static final List<String> f7860j = Arrays.asList("com.google.android.gms.measurement.AppMeasurement");

    /* renamed from: k  reason: collision with root package name */
    private static final List<String> f7861k = Arrays.asList(new String[0]);

    /* renamed from: l  reason: collision with root package name */
    private static final Set<String> f7862l = Collections.emptySet();

    /* renamed from: m  reason: collision with root package name */
    private static final Object f7863m = new Object();
    static final Map<String, a> n = new c.e.a();
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7864b;

    /* renamed from: c  reason: collision with root package name */
    private final c f7865c;

    /* renamed from: d  reason: collision with root package name */
    private final p f7866d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f7867e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f7868f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    private final List<AbstractC0107a> f7869g;

    /* renamed from: e.b.c.a$a  reason: collision with other inner class name */
    public interface AbstractC0107a {
        void a(boolean z);
    }

    public interface b {
    }

    /* access modifiers changed from: private */
    @TargetApi(24)
    public static class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<c> f7870b = new AtomicReference<>();
        private final Context a;

        private c(Context context) {
            this.a = context;
        }

        /* access modifiers changed from: private */
        public static void a(Context context) {
            if (f7870b.get() == null) {
                c cVar = new c(context);
                if (f7870b.compareAndSet(null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public final void onReceive(Context context, Intent intent) {
            synchronized (a.f7863m) {
                for (a aVar : a.n.values()) {
                    aVar.g();
                }
            }
            this.a.unregisterReceiver(this);
        }
    }

    private a(Context context, String str, c cVar) {
        new CopyOnWriteArrayList();
        this.f7869g = new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        y.a(context);
        this.a = context;
        y.b(str);
        this.f7864b = str;
        y.a(cVar);
        this.f7865c = cVar;
        new e.b.c.f.a();
        this.f7866d = new p(new l(this.a).a(), com.google.firebase.components.a.a(Context.class, this.a), com.google.firebase.components.a.a(a.class, this), com.google.firebase.components.a.a(c.class, this.f7865c));
    }

    public static a a(Context context) {
        synchronized (f7863m) {
            if (n.containsKey("[DEFAULT]")) {
                return e();
            }
            c a2 = c.a(context);
            if (a2 == null) {
                return null;
            }
            return a(context, a2);
        }
    }

    public static a a(Context context, c cVar) {
        return a(context, cVar, "[DEFAULT]");
    }

    public static a a(Context context, c cVar, String str) {
        a aVar;
        e.b.c.f.b.a(context);
        if (n.b() && (context.getApplicationContext() instanceof Application)) {
            com.google.android.gms.common.api.internal.b.a((Application) context.getApplicationContext());
            com.google.android.gms.common.api.internal.b.b().a(new h());
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f7863m) {
            boolean z = !n.containsKey(trim);
            StringBuilder sb = new StringBuilder(String.valueOf(trim).length() + 33);
            sb.append("FirebaseApp name ");
            sb.append(trim);
            sb.append(" already exists!");
            y.b(z, sb.toString());
            y.a(context, "Application context cannot be null.");
            aVar = new a(context, trim, cVar);
            n.put(trim, aVar);
        }
        e.b.c.f.b.a(aVar);
        aVar.g();
        return aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void a(Class<T> cls, T t, Iterable<String> iterable, boolean z) {
        for (String str : iterable) {
            if (z) {
                try {
                    if (!f7861k.contains(str)) {
                    }
                } catch (ClassNotFoundException unused) {
                    if (!f7862l.contains(str)) {
                        Log.d("FirebaseApp", String.valueOf(str).concat(" is not linked. Skipping initialization."));
                    } else {
                        throw new IllegalStateException(String.valueOf(str).concat(" is missing, but is required. Check if it has been removed by Proguard."));
                    }
                } catch (NoSuchMethodException unused2) {
                    throw new IllegalStateException(String.valueOf(str).concat("#getInstance has been removed by Proguard. Add keep rule to prevent it."));
                } catch (InvocationTargetException e2) {
                    Log.wtf("FirebaseApp", "Firebase API initialization failure.", e2);
                } catch (IllegalAccessException e3) {
                    String valueOf = String.valueOf(str);
                    Log.wtf("FirebaseApp", valueOf.length() != 0 ? "Failed to initialize ".concat(valueOf) : new String("Failed to initialize "), e3);
                }
            }
            Method method = Class.forName(str).getMethod("getInstance", cls);
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, t);
            }
        }
    }

    public static void a(boolean z) {
        synchronized (f7863m) {
            ArrayList arrayList = new ArrayList(n.values());
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                a aVar = (a) obj;
                if (aVar.f7867e.get()) {
                    aVar.b(z);
                }
            }
        }
    }

    private final void b(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (AbstractC0107a aVar : this.f7869g) {
            aVar.a(z);
        }
    }

    public static a e() {
        a aVar;
        synchronized (f7863m) {
            aVar = n.get("[DEFAULT]");
            if (aVar == null) {
                String a2 = com.google.android.gms.common.util.p.a();
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 116);
                sb.append("Default FirebaseApp is not initialized in this process ");
                sb.append(a2);
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return aVar;
    }

    private final void f() {
        y.b(!this.f7868f.get(), "FirebaseApp was deleted");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void g() {
        boolean b2 = c.h.d.a.b(this.a);
        if (b2) {
            c.a(this.a);
        } else {
            this.f7866d.a(d());
        }
        a(a.class, this, f7858h, b2);
        if (d()) {
            a(a.class, this, f7859i, b2);
            a(Context.class, this.a, f7860j, b2);
        }
    }

    public Context a() {
        f();
        return this.a;
    }

    public <T> T a(Class<T> cls) {
        f();
        return (T) this.f7866d.a(cls);
    }

    public String b() {
        f();
        return this.f7864b;
    }

    public c c() {
        f();
        return this.f7865c;
    }

    public boolean d() {
        return "[DEFAULT]".equals(b());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f7864b.equals(((a) obj).b());
    }

    public int hashCode() {
        return this.f7864b.hashCode();
    }

    public String toString() {
        x.a a2 = x.a(this);
        a2.a("name", this.f7864b);
        a2.a("options", this.f7865c);
        return a2.toString();
    }
}
