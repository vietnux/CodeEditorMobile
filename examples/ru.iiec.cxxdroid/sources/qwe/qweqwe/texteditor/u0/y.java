package qwe.qweqwe.texteditor.u0;

import android.util.Log;
import com.android.billingclient.api.a;
import com.android.billingclient.api.c;
import com.android.billingclient.api.e;
import com.android.billingclient.api.f;
import com.android.billingclient.api.g;
import com.android.billingclient.api.h;
import com.android.billingclient.api.j;
import com.android.billingclient.api.k;
import com.android.billingclient.api.l;
import com.android.billingclient.api.m;
import g.n;
import g.r.c.l;
import g.r.d.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qwe.qweqwe.texteditor.e0;

public class y implements j {
    private final e0 a;

    /* renamed from: b  reason: collision with root package name */
    private final l<Boolean, Boolean> f9762b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9763c;

    /* renamed from: d  reason: collision with root package name */
    private final com.android.billingclient.api.c f9764d;

    /* renamed from: e  reason: collision with root package name */
    private k f9765e;

    /* renamed from: f  reason: collision with root package name */
    private k f9766f;

    /* renamed from: g  reason: collision with root package name */
    private Runnable f9767g;

    public static final class a implements e {
        final /* synthetic */ y a;

        a(y yVar) {
            this.a = yVar;
        }

        /* access modifiers changed from: private */
        public static final void b(y yVar, g gVar, List list) {
            i.c(yVar, "this$0");
            i.c(gVar, "br");
            i.c(list, "historyRecords");
            Log.d("InAppHelper", i.a("onPurchaseHistoryResponse: responseCode=", (Object) Integer.valueOf(gVar.b())));
            yVar.a((y) list, (List) false);
        }

        @Override // com.android.billingclient.api.e
        public void a() {
            Log.d("InAppHelper", "onBillingServiceDisconnected");
        }

        @Override // com.android.billingclient.api.e
        public void a(g gVar) {
            i.c(gVar, "p0");
            Log.d("InAppHelper", i.a("onBillingSetupFinished: ", (Object) gVar.a()));
            this.a.f9764d.a("inapp", new o(this.a));
            this.a.e();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g.r.d.g gVar) {
            this();
        }
    }

    public static final class c implements m {
        final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ y f9768b;

        c(String str, y yVar) {
            this.a = str;
            this.f9768b = yVar;
        }

        @Override // com.android.billingclient.api.m
        public void a(g gVar, List<k> list) {
            T t;
            i.c(gVar, "p0");
            Log.d("InAppHelper", i.a("onSkuDetailsResponse: ", (Object) gVar.a()));
            g gVar2 = null;
            if (list != null) {
                String str = this.a;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (i.a((Object) t.d(), (Object) str)) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    y yVar = this.f9768b;
                    f.a h2 = f.h();
                    h2.a(t2);
                    f a2 = h2.a();
                    i.b(a2, "newBuilder()\n                            .setSkuDetails(skuDetails)\n                            .build()");
                    gVar2 = yVar.f9764d.a(yVar.a, a2);
                }
            }
            if (gVar2 == null) {
                y yVar2 = this.f9768b;
                Log.e("InAppHelper", "skuDetails is null");
                yVar2.a((y) ((gVar.b() == -1 || gVar.b() == 2) ? "SERVICE_UNAVAILABLE" : gVar.a()));
            }
        }
    }

    static {
        new b(null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: g.r.c.l<? super java.lang.Boolean, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public y(e0 e0Var, l<? super Boolean, Boolean> lVar) {
        i.c(e0Var, "activity");
        i.c(lVar, "onPurchaseCallback");
        this.a = e0Var;
        this.f9762b = lVar;
        c.a a2 = com.android.billingclient.api.c.a(this.a);
        a2.b();
        a2.a(this);
        com.android.billingclient.api.c a3 = a2.a();
        i.b(a3, "newBuilder(activity).enablePendingPurchases().setListener(this).build()");
        this.f9764d = a3;
        this.f9764d.a(new a(this));
    }

    /* access modifiers changed from: private */
    public static final void a(g gVar) {
        i.c(gVar, "it");
        Log.d("InAppHelper", i.a("acknowledgePurchase: ", (Object) gVar.a()));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(String str) {
        Log.e("InAppHelper", str);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(List<h> list, boolean z) {
        T t;
        T t2;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.e().contains("premium_forever")) {
                break;
            }
        }
        T t3 = t;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it2.next();
            if (t2.e().contains("premium_monthly_sub")) {
                break;
            }
        }
        T t4 = t2;
        if (z) {
            for (h hVar : g.o.g.b(t3, t4)) {
                if (!hVar.f()) {
                    Log.d("InAppHelper", "Purchase not isAcknowledged");
                    com.android.billingclient.api.c cVar = this.f9764d;
                    a.C0067a b2 = com.android.billingclient.api.a.b();
                    b2.a(hVar.c());
                    cVar.a(b2.a(), r.a);
                } else {
                    Log.d("InAppHelper", "Purchase already isAcknowledged");
                }
            }
        }
        if ((t3 == null || t3.b() != 1) && (t4 == null || !t4.g())) {
            a(false);
        } else {
            a(true);
        }
    }

    private final void a(boolean z) {
        this.f9762b.a(Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    public static final void c(y yVar, g gVar, List list) {
        Object obj;
        i.c(yVar, "this$0");
        i.c(gVar, "$noName_0");
        Log.d("InAppHelper", "query premium_forever done");
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (i.a((Object) ((k) obj).d(), (Object) "premium_forever")) {
                    break;
                }
            }
            k kVar = (k) obj;
            if (kVar != null) {
                yVar.b(kVar);
                yVar.j();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void d(y yVar, g gVar, List list) {
        Object obj;
        i.c(yVar, "this$0");
        i.c(gVar, "$noName_0");
        Log.d("InAppHelper", "query premium_monthly_sub done");
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (i.a((Object) ((k) obj).d(), (Object) "premium_monthly_sub")) {
                    break;
                }
            }
            k kVar = (k) obj;
            if (kVar != null) {
                yVar.a(kVar);
                yVar.j();
            }
        }
    }

    private final void j() {
        try {
            Runnable runnable = this.f9767g;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final String a() {
        k kVar = this.f9766f;
        if (kVar == null) {
            return null;
        }
        return kVar.a();
    }

    @Override // com.android.billingclient.api.j
    public void a(g gVar, List<h> list) {
        i.c(gVar, "p0");
        int b2 = gVar.b();
        if (!(b2 == 0 || b2 == 1)) {
            int b3 = gVar.b();
            a(b3 != -3 ? b3 != -2 ? b3 != -1 ? b3 != 2 ? b3 != 3 ? b3 != 4 ? b3 != 5 ? b3 != 7 ? b3 != 8 ? "ERROR" : "ITEM_NOT_OWNED" : "ITEM_ALREADY_OWNED" : "DEVELOPER_ERROR" : "ITEM_UNAVAILABLE" : "BILLING_UNAVAILABLE" : "SERVICE_UNAVAILABLE" : "SERVICE_DISCONNECTED" : "FEATURE_NOT_SUPPORTED" : "SERVICE_TIMEOUT");
        }
        Log.d("InAppHelper", "onPurchasesUpdated");
        if (list != null) {
            a(list, true);
        }
        v.a(this.a);
    }

    public final void a(k kVar) {
        this.f9766f = kVar;
    }

    public final void a(Runnable runnable) {
        i.c(runnable, "callback");
        Log.d("InAppHelper", "setPricesUpdatedCallback");
        this.f9767g = runnable;
    }

    public final void a(String str, String str2) {
        i.c(str, "productId");
        i.c(str2, "type");
        com.android.billingclient.api.c cVar = this.f9764d;
        l.a c2 = com.android.billingclient.api.l.c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        n nVar = n.a;
        c2.a(arrayList);
        c2.a(str2);
        cVar.a(c2.a(), new c(str, this));
    }

    public final String b() {
        k kVar = this.f9766f;
        if (kVar == null) {
            return "Loading...";
        }
        String c2 = kVar.c();
        i.b(c2, "it.price");
        return c2;
    }

    public final void b(k kVar) {
        this.f9765e = kVar;
    }

    public final String c() {
        k kVar = this.f9765e;
        if (kVar == null) {
            return "Loading...";
        }
        String c2 = kVar.c();
        i.b(c2, "it.price");
        return c2;
    }

    public final boolean d() {
        return this.f9763c;
    }

    public final void e() {
        Log.d("InAppHelper", "loadSkus");
        com.android.billingclient.api.c cVar = this.f9764d;
        l.a c2 = com.android.billingclient.api.l.c();
        ArrayList arrayList = new ArrayList();
        arrayList.add("premium_monthly_sub");
        n nVar = n.a;
        c2.a(arrayList);
        c2.a("subs");
        cVar.a(c2.a(), new q(this));
        com.android.billingclient.api.c cVar2 = this.f9764d;
        l.a c3 = com.android.billingclient.api.l.c();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("premium_forever");
        n nVar2 = n.a;
        c3.a(arrayList2);
        c3.a("inapp");
        cVar2.a(c3.a(), new p(this));
    }

    public final void f() {
        a("premium_forever", "inapp");
    }

    public final void g() {
        a("premium_monthly_sub", "subs");
    }

    public final void h() {
        this.f9764d.a();
    }

    public final void i() {
        Log.d("InAppHelper", "removePricesUpdatedCallback");
        this.f9767g = null;
    }
}
