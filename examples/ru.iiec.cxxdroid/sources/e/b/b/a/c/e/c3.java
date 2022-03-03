package e.b.b.a.c.e;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import c.e.a;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.f;
import com.google.android.gms.measurement.AppMeasurement;
import e.b.b.a.e.g;
import e.b.b.a.e.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

public final class c3 extends z2 {

    /* renamed from: c  reason: collision with root package name */
    protected v3 f7195c;

    /* renamed from: d  reason: collision with root package name */
    private AppMeasurement.b f7196d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<AppMeasurement.c> f7197e = new CopyOnWriteArraySet();

    /* renamed from: f  reason: collision with root package name */
    private boolean f7198f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference<String> f7199g = new AtomicReference<>();

    /* renamed from: h  reason: collision with root package name */
    protected boolean f7200h = true;

    protected c3(d2 d2Var) {
        super(d2Var);
    }

    private final void a(String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            Bundle bundle3 = new Bundle(bundle);
            for (String str4 : bundle3.keySet()) {
                Object obj = bundle3.get(str4);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str4, new Bundle((Bundle) obj));
                } else {
                    int i2 = 0;
                    if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        while (i2 < parcelableArr.length) {
                            if (parcelableArr[i2] instanceof Bundle) {
                                parcelableArr[i2] = new Bundle((Bundle) parcelableArr[i2]);
                            }
                            i2++;
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        while (i2 < arrayList.size()) {
                            Object obj2 = arrayList.get(i2);
                            if (obj2 instanceof Bundle) {
                                arrayList.set(i2, new Bundle((Bundle) obj2));
                            }
                            i2++;
                        }
                    }
                }
            }
            bundle2 = bundle3;
        }
        c().a(new u3(this, str, str2, j2, bundle2, z, z2, z3, str3));
    }

    private final void a(String str, String str2, long j2, Object obj) {
        c().a(new e3(this, str, str2, obj, j2));
    }

    private final void a(String str, String str2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        a(str, str2, b().a(), bundle, true, z2, z3, null);
    }

    /* access modifiers changed from: private */
    public final void a(String str, String str2, Object obj, long j2) {
        y.b(str);
        y.b(str2);
        d();
        t();
        if (!this.a.s()) {
            a().E().a("User property not set since app measurement is disabled");
        } else if (this.a.H()) {
            a().E().a("Setting user property (FE)", n().a(str2), obj);
            k().a(new p5(str2, j2, obj, str));
        }
    }

    private final List<AppMeasurement.ConditionalUserProperty> b(String str, String str2, String str3) {
        b1 y;
        String str4;
        if (c().y()) {
            y = a().y();
            str4 = "Cannot get conditional user properties from analytics worker thread";
        } else {
            c();
            if (z1.A()) {
                y = a().y();
                str4 = "Cannot get conditional user properties from main thread";
            } else {
                AtomicReference atomicReference = new AtomicReference();
                synchronized (atomicReference) {
                    this.a.c().a(new l3(this, atomicReference, str, str2, str3));
                    try {
                        atomicReference.wait(5000);
                    } catch (InterruptedException e2) {
                        a().B().a("Interrupted waiting for get conditional user properties", str, e2);
                    }
                }
                List<w> list = (List) atomicReference.get();
                if (list == null) {
                    a().B().a("Timed out waiting for get conditional user properties", str);
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList(list.size());
                for (w wVar : list) {
                    AppMeasurement.ConditionalUserProperty conditionalUserProperty = new AppMeasurement.ConditionalUserProperty();
                    conditionalUserProperty.mAppId = str;
                    conditionalUserProperty.mOrigin = str2;
                    conditionalUserProperty.mCreationTimestamp = wVar.f7638e;
                    p5 p5Var = wVar.f7637d;
                    conditionalUserProperty.mName = p5Var.f7509c;
                    conditionalUserProperty.mValue = p5Var.t();
                    conditionalUserProperty.mActive = wVar.f7639f;
                    conditionalUserProperty.mTriggerEventName = wVar.f7640g;
                    n0 n0Var = wVar.f7641h;
                    if (n0Var != null) {
                        conditionalUserProperty.mTimedOutEventName = n0Var.f7448b;
                        k0 k0Var = n0Var.f7449c;
                        if (k0Var != null) {
                            conditionalUserProperty.mTimedOutEventParams = k0Var.t();
                        }
                    }
                    conditionalUserProperty.mTriggerTimeout = wVar.f7642i;
                    n0 n0Var2 = wVar.f7643j;
                    if (n0Var2 != null) {
                        conditionalUserProperty.mTriggeredEventName = n0Var2.f7448b;
                        k0 k0Var2 = n0Var2.f7449c;
                        if (k0Var2 != null) {
                            conditionalUserProperty.mTriggeredEventParams = k0Var2.t();
                        }
                    }
                    conditionalUserProperty.mTriggeredTimestamp = wVar.f7637d.f7510d;
                    conditionalUserProperty.mTimeToLive = wVar.f7644k;
                    n0 n0Var3 = wVar.f7645l;
                    if (n0Var3 != null) {
                        conditionalUserProperty.mExpiredEventName = n0Var3.f7448b;
                        k0 k0Var3 = n0Var3.f7449c;
                        if (k0Var3 != null) {
                            conditionalUserProperty.mExpiredEventParams = k0Var3.t();
                        }
                    }
                    arrayList.add(conditionalUserProperty);
                }
                return arrayList;
            }
        }
        y.a(str4);
        return Collections.emptyList();
    }

    private final Map<String, Object> b(String str, String str2, String str3, boolean z) {
        b1 B;
        String str4;
        if (c().y()) {
            B = a().y();
            str4 = "Cannot get user properties from analytics worker thread";
        } else {
            c();
            if (z1.A()) {
                B = a().y();
                str4 = "Cannot get user properties from main thread";
            } else {
                AtomicReference atomicReference = new AtomicReference();
                synchronized (atomicReference) {
                    this.a.c().a(new m3(this, atomicReference, str, str2, str3, z));
                    try {
                        atomicReference.wait(5000);
                    } catch (InterruptedException e2) {
                        a().B().a("Interrupted waiting for get user properties", e2);
                    }
                }
                List<p5> list = (List) atomicReference.get();
                if (list == null) {
                    B = a().B();
                    str4 = "Timed out waiting for get user properties";
                } else {
                    a aVar = new a(list.size());
                    for (p5 p5Var : list) {
                        aVar.put(p5Var.f7509c, p5Var.t());
                    }
                    return aVar;
                }
            }
        }
        B.a(str4);
        return Collections.emptyMap();
    }

    /* access modifiers changed from: private */
    public final void b(String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        String[] strArr;
        int i2;
        int i3;
        Bundle bundle2;
        y.b(str);
        y.b(str2);
        y.a(bundle);
        d();
        t();
        if (!this.a.s()) {
            a().E().a("Event not sent since app measurement is disabled");
            return;
        }
        int i4 = 0;
        if (!this.f7198f) {
            this.f7198f = true;
            try {
                try {
                    Class.forName("com.google.android.gms.tagmanager.TagManagerService").getDeclaredMethod("initialize", Context.class).invoke(null, getContext());
                } catch (Exception e2) {
                    a().B().a("Failed to invoke Tag Manager's initialize() method", e2);
                }
            } catch (ClassNotFoundException unused) {
                a().D().a("Tag Manager is not found and thus will not be used");
            }
        }
        if (z3 && !"_iap".equals(str2)) {
            s5 h2 = this.a.h();
            int i5 = 2;
            if (h2.b("event", str2)) {
                if (!h2.a("event", AppMeasurement.a.a, str2)) {
                    i5 = 13;
                } else if (h2.a("event", 40, str2)) {
                    i5 = 0;
                }
            }
            if (i5 != 0) {
                a().A().a("Invalid public event name. Event will not be logged (FE)", n().a(str2));
                this.a.h();
                String a = s5.a(str2, 40, true);
                if (str2 != null) {
                    i4 = str2.length();
                }
                this.a.h().a(i5, "_ev", a, i4);
                return;
            }
        }
        w3 y = l().y();
        if (y != null && !bundle.containsKey("_sc")) {
            y.f7657d = true;
        }
        x3.a(y, bundle, z && z3);
        boolean equals = "am".equals(str);
        boolean j3 = s5.j(str2);
        if (z && this.f7196d != null && !j3 && !equals) {
            a().E().a("Passing event to registered event handler (FE)", n().a(str2), n().a(bundle));
            this.f7196d.a(str, str2, bundle, j2);
        } else if (this.a.H()) {
            int a2 = o().a(str2);
            if (a2 != 0) {
                a().A().a("Invalid event name. Event will not be logged (FE)", n().a(str2));
                o();
                String a3 = s5.a(str2, 40, true);
                if (str2 != null) {
                    i4 = str2.length();
                }
                this.a.h().a(str3, a2, "_ev", a3, i4);
                return;
            }
            List<String> a4 = f.a((Object[]) new String[]{"_o", "_sn", "_sc", "_si"});
            Bundle a5 = o().a(str2, bundle, a4, z3, true);
            w3 w3Var = (a5 == null || !a5.containsKey("_sc") || !a5.containsKey("_si")) ? null : new w3(a5.getString("_sn"), a5.getString("_sc"), Long.valueOf(a5.getLong("_si")).longValue());
            if (w3Var == null) {
                w3Var = y;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(a5);
            long nextLong = o().z().nextLong();
            String[] strArr2 = (String[]) a5.keySet().toArray(new String[bundle.size()]);
            Arrays.sort(strArr2);
            int length = strArr2.length;
            int i6 = 0;
            int i7 = 0;
            while (i7 < length) {
                String str4 = strArr2[i7];
                Object obj = a5.get(str4);
                o();
                Bundle[] a6 = s5.a(obj);
                if (a6 != null) {
                    String str5 = "_eid";
                    a5.putInt(str4, a6.length);
                    String str6 = str4;
                    for (int i8 = 0; i8 < a6.length; i8++) {
                        Bundle bundle3 = a6[i8];
                        x3.a(w3Var, bundle3, true);
                        Bundle a7 = o().a("_ep", bundle3, a4, z3, false);
                        a7.putString("_en", str2);
                        a7.putLong(str5, nextLong);
                        a7.putString("_gn", str6);
                        a7.putInt("_ll", a6.length);
                        a7.putInt("_i", i8);
                        arrayList.add(a7);
                        str6 = str6;
                        a5 = a5;
                        i7 = i7;
                        length = length;
                        i6 = i6;
                        strArr2 = strArr2;
                        str5 = str5;
                    }
                    i3 = i7;
                    i2 = length;
                    strArr = strArr2;
                    bundle2 = a5;
                    i6 += a6.length;
                } else {
                    i3 = i7;
                    i2 = length;
                    strArr = strArr2;
                    bundle2 = a5;
                }
                i7 = i3 + 1;
                a5 = bundle2;
                length = i2;
                strArr2 = strArr;
            }
            if (i6 != 0) {
                a5.putLong("_eid", nextLong);
                a5.putInt("_epc", i6);
            }
            int i9 = 0;
            while (i9 < arrayList.size()) {
                Bundle bundle4 = (Bundle) arrayList.get(i9);
                String str7 = i9 != 0 ? "_ep" : str2;
                bundle4.putString("_o", str);
                if (z2) {
                    bundle4 = o().a(bundle4);
                }
                a().E().a("Logging event (FE)", n().a(str2), n().a(bundle4));
                k().a(new n0(str7, new k0(bundle4), str, j2), str3);
                if (!equals) {
                    for (AppMeasurement.c cVar : this.f7197e) {
                        cVar.a(str, str2, new Bundle(bundle4), j2);
                    }
                }
                i9++;
            }
            if (l().y() != null && "_ae".equals(str2)) {
                p().a(true);
            }
        }
    }

    private final void b(String str, String str2, String str3, Bundle bundle) {
        long a = b().a();
        y.b(str2);
        AppMeasurement.ConditionalUserProperty conditionalUserProperty = new AppMeasurement.ConditionalUserProperty();
        conditionalUserProperty.mAppId = str;
        conditionalUserProperty.mName = str2;
        conditionalUserProperty.mCreationTimestamp = a;
        if (str3 != null) {
            conditionalUserProperty.mExpiredEventName = str3;
            conditionalUserProperty.mExpiredEventParams = bundle;
        }
        c().a(new k3(this, conditionalUserProperty));
    }

    private final void c(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        long a = b().a();
        y.a(conditionalUserProperty);
        y.b(conditionalUserProperty.mName);
        y.b(conditionalUserProperty.mOrigin);
        y.a(conditionalUserProperty.mValue);
        conditionalUserProperty.mCreationTimestamp = a;
        String str = conditionalUserProperty.mName;
        Object obj = conditionalUserProperty.mValue;
        if (o().c(str) != 0) {
            a().y().a("Invalid conditional user property name", n().c(str));
        } else if (o().b(str, obj) != 0) {
            a().y().a("Invalid conditional user property value", n().c(str), obj);
        } else {
            Object c2 = o().c(str, obj);
            if (c2 == null) {
                a().y().a("Unable to normalize conditional user property value", n().c(str), obj);
                return;
            }
            conditionalUserProperty.mValue = c2;
            long j2 = conditionalUserProperty.mTriggerTimeout;
            if (TextUtils.isEmpty(conditionalUserProperty.mTriggerEventName) || (j2 <= 15552000000L && j2 >= 1)) {
                long j3 = conditionalUserProperty.mTimeToLive;
                if (j3 > 15552000000L || j3 < 1) {
                    a().y().a("Invalid conditional user property time to live", n().c(str), Long.valueOf(j3));
                } else {
                    c().a(new j3(this, conditionalUserProperty));
                }
            } else {
                a().y().a("Invalid conditional user property timeout", n().c(str), Long.valueOf(j2));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void c(boolean z) {
        d();
        t();
        a().E().a("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        q().a(z);
        if (!r().i(i().z())) {
            k().D();
        } else if (!this.a.s() || !this.f7200h) {
            k().D();
        } else {
            a().E().a("Recording app launch after enabling measurement for the first time (FE)");
            G();
        }
    }

    /* access modifiers changed from: private */
    public final void d(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        d();
        t();
        y.a(conditionalUserProperty);
        y.b(conditionalUserProperty.mName);
        y.b(conditionalUserProperty.mOrigin);
        y.a(conditionalUserProperty.mValue);
        if (!this.a.s()) {
            a().E().a("Conditional property not sent since Firebase Analytics is disabled");
            return;
        }
        p5 p5Var = new p5(conditionalUserProperty.mName, conditionalUserProperty.mTriggeredTimestamp, conditionalUserProperty.mValue, conditionalUserProperty.mOrigin);
        try {
            n0 a = o().a(conditionalUserProperty.mTriggeredEventName, conditionalUserProperty.mTriggeredEventParams, conditionalUserProperty.mOrigin, 0, true, false);
            k().a(new w(conditionalUserProperty.mAppId, conditionalUserProperty.mOrigin, p5Var, conditionalUserProperty.mCreationTimestamp, false, conditionalUserProperty.mTriggerEventName, o().a(conditionalUserProperty.mTimedOutEventName, conditionalUserProperty.mTimedOutEventParams, conditionalUserProperty.mOrigin, 0, true, false), conditionalUserProperty.mTriggerTimeout, a, conditionalUserProperty.mTimeToLive, o().a(conditionalUserProperty.mExpiredEventName, conditionalUserProperty.mExpiredEventParams, conditionalUserProperty.mOrigin, 0, true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void e(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        d();
        t();
        y.a(conditionalUserProperty);
        y.b(conditionalUserProperty.mName);
        if (!this.a.s()) {
            a().E().a("Conditional property not cleared since Firebase Analytics is disabled");
            return;
        }
        try {
            k().a(new w(conditionalUserProperty.mAppId, conditionalUserProperty.mOrigin, new p5(conditionalUserProperty.mName, 0, null, null), conditionalUserProperty.mCreationTimestamp, conditionalUserProperty.mActive, conditionalUserProperty.mTriggerEventName, null, conditionalUserProperty.mTriggerTimeout, null, conditionalUserProperty.mTimeToLive, o().a(conditionalUserProperty.mExpiredEventName, conditionalUserProperty.mExpiredEventParams, conditionalUserProperty.mOrigin, conditionalUserProperty.mCreationTimestamp, true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    public final String A() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) c().a(atomicReference, 15000, "String test flag value", new n3(this, atomicReference));
    }

    public final String B() {
        return this.f7199g.get();
    }

    public final Boolean C() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) c().a(atomicReference, 15000, "boolean test flag value", new d3(this, atomicReference));
    }

    public final Long D() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) c().a(atomicReference, 15000, "long test flag value", new o3(this, atomicReference));
    }

    public final Integer E() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) c().a(atomicReference, 15000, "int test flag value", new p3(this, atomicReference));
    }

    public final Double F() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) c().a(atomicReference, 15000, "double test flag value", new q3(this, atomicReference));
    }

    public final void G() {
        d();
        t();
        if (this.a.H()) {
            k().C();
            this.f7200h = false;
            String C = q().C();
            if (!TextUtils.isEmpty(C)) {
                j().t();
                if (!C.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", C);
                    b("auto", "_ou", bundle);
                }
            }
        }
    }

    public final List<AppMeasurement.ConditionalUserProperty> a(String str, String str2, String str3) {
        y.b(str);
        e();
        throw null;
    }

    public final Map<String, Object> a(String str, String str2, String str3, boolean z) {
        y.b(str);
        e();
        throw null;
    }

    public final Map<String, Object> a(String str, String str2, boolean z) {
        return b((String) null, str, str2, z);
    }

    public final void a(long j2) {
        c().a(new s3(this, j2));
    }

    public final void a(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        y.a(conditionalUserProperty);
        AppMeasurement.ConditionalUserProperty conditionalUserProperty2 = new AppMeasurement.ConditionalUserProperty(conditionalUserProperty);
        if (!TextUtils.isEmpty(conditionalUserProperty2.mAppId)) {
            a().B().a("Package name should be null when calling setConditionalUserProperty");
        }
        conditionalUserProperty2.mAppId = null;
        c(conditionalUserProperty2);
    }

    public final void a(AppMeasurement.b bVar) {
        AppMeasurement.b bVar2;
        d();
        t();
        if (!(bVar == null || bVar == (bVar2 = this.f7196d))) {
            y.b(bVar2 == null, "EventInterceptor already set.");
        }
        this.f7196d = bVar;
    }

    public final void a(AppMeasurement.c cVar) {
        t();
        y.a(cVar);
        if (!this.f7197e.add(cVar)) {
            a().B().a("OnEventListener already registered");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        this.f7199g.set(str);
    }

    public final void a(String str, String str2, Bundle bundle) {
        b((String) null, str, str2, bundle);
    }

    public final void a(String str, String str2, Bundle bundle, long j2) {
        a(str, str2, j2, bundle, false, true, true, null);
    }

    public final void a(String str, String str2, Bundle bundle, boolean z) {
        a(str, str2, bundle, true, this.f7196d == null || s5.j(str2), true, null);
    }

    public final void a(String str, String str2, Object obj) {
        y.b(str);
        long a = b().a();
        int c2 = o().c(str2);
        int i2 = 0;
        if (c2 != 0) {
            o();
            String a2 = s5.a(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.a.h().a(c2, "_ev", a2, i2);
        } else if (obj != null) {
            int b2 = o().b(str2, obj);
            if (b2 != 0) {
                o();
                String a3 = s5.a(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.a.h().a(b2, "_ev", a3, i2);
                return;
            }
            Object c3 = o().c(str2, obj);
            if (c3 != null) {
                a(str, str2, a, c3);
            }
        } else {
            a(str, str2, a, (Object) null);
        }
    }

    public final void a(String str, String str2, String str3, Bundle bundle) {
        y.b(str);
        e();
        throw null;
    }

    public final void a(boolean z) {
        t();
        c().a(new r3(this, z));
    }

    public final List<AppMeasurement.ConditionalUserProperty> b(String str, String str2) {
        return b((String) null, str, str2);
    }

    public final List<p5> b(boolean z) {
        b1 B;
        String str;
        t();
        a().E().a("Fetching user attributes (FE)");
        if (c().y()) {
            B = a().y();
            str = "Cannot get all user properties from analytics worker thread";
        } else {
            c();
            if (z1.A()) {
                B = a().y();
                str = "Cannot get all user properties from main thread";
            } else {
                AtomicReference atomicReference = new AtomicReference();
                synchronized (atomicReference) {
                    this.a.c().a(new f3(this, atomicReference, z));
                    try {
                        atomicReference.wait(5000);
                    } catch (InterruptedException e2) {
                        a().B().a("Interrupted waiting for get user properties", e2);
                    }
                }
                List<p5> list = (List) atomicReference.get();
                if (list != null) {
                    return list;
                }
                B = a().B();
                str = "Timed out waiting for get user properties";
            }
        }
        B.a(str);
        return Collections.emptyList();
    }

    public final void b(long j2) {
        c().a(new t3(this, j2));
    }

    public final void b(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        y.a(conditionalUserProperty);
        y.b(conditionalUserProperty.mAppId);
        e();
        throw null;
    }

    public final void b(AppMeasurement.c cVar) {
        t();
        y.a(cVar);
        if (!this.f7197e.remove(cVar)) {
            a().B().a("OnEventListener had not been registered");
        }
    }

    public final void b(String str, String str2, Bundle bundle) {
        a(str, str2, bundle, true, this.f7196d == null || s5.j(str2), false, null);
    }

    /* access modifiers changed from: package-private */
    public final String c(long j2) {
        AtomicReference atomicReference = new AtomicReference();
        synchronized (atomicReference) {
            c().a(new h3(this, atomicReference));
            try {
                atomicReference.wait(j2);
            } catch (InterruptedException unused) {
                a().B().a("Interrupted waiting for app instance id");
                return null;
            }
        }
        return (String) atomicReference.get();
    }

    /* access modifiers changed from: package-private */
    public final void c(String str, String str2, Bundle bundle) {
        d();
        b(str, str2, b().a(), bundle, true, this.f7196d == null || s5.j(str2), false, null);
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.z2
    public final boolean u() {
        return false;
    }

    public final g<String> y() {
        try {
            String z = q().z();
            return z != null ? j.a(z) : j.a(c().z(), new g3(this));
        } catch (Exception e2) {
            a().B().a("Failed to schedule task for getAppInstanceId");
            return j.a(e2);
        }
    }

    public final void z() {
        c().a(new i3(this, b().a()));
    }
}
