package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.g;
import com.android.billingclient.api.h;
import e.b.b.a.c.f.a;
import e.b.b.a.c.f.p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

/* access modifiers changed from: package-private */
public class d extends c {
    private volatile int a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2710b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f2711c;

    /* renamed from: d  reason: collision with root package name */
    private volatile d0 f2712d;

    /* renamed from: e  reason: collision with root package name */
    private Context f2713e;

    /* renamed from: f  reason: collision with root package name */
    private volatile e.b.b.a.c.f.d f2714f;

    /* renamed from: g  reason: collision with root package name */
    private volatile s f2715g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2716h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2717i;

    /* renamed from: j  reason: collision with root package name */
    private int f2718j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f2719k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f2720l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f2721m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private ExecutorService t;

    private d(Context context, boolean z, j jVar, String str, String str2) {
        this.a = 0;
        this.f2711c = new Handler(Looper.getMainLooper());
        this.f2718j = 0;
        this.f2710b = str;
        a(context, jVar, z);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    d(java.lang.String r7, boolean r8, android.content.Context r9, com.android.billingclient.api.j r10) {
        /*
            r6 = this;
            java.lang.String r7 = "com.android.billingclient.ktx.BuildConfig"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ Exception -> 0x0014 }
            java.lang.String r0 = "VERSION_NAME"
            java.lang.reflect.Field r7 = r7.getField(r0)     // Catch:{ Exception -> 0x0014 }
            r0 = 0
            java.lang.Object r7 = r7.get(r0)     // Catch:{ Exception -> 0x0014 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0014 }
            goto L_0x0016
        L_0x0014:
            java.lang.String r7 = "4.0.0"
        L_0x0016:
            r4 = r7
            r5 = 0
            r0 = r6
            r1 = r9
            r2 = r8
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.d.<init>(java.lang.String, boolean, android.content.Context, com.android.billingclient.api.j):void");
    }

    static /* synthetic */ h.a a(d dVar, String str) {
        String valueOf = String.valueOf(str);
        a.a("BillingClient", valueOf.length() != 0 ? "Querying owned items, item type: ".concat(valueOf) : new String("Querying owned items, item type: "));
        ArrayList arrayList = new ArrayList();
        Bundle a2 = a.a(dVar.f2721m, dVar.s, dVar.f2710b);
        String str2 = null;
        do {
            try {
                Bundle a3 = dVar.f2721m ? dVar.f2714f.a(9, dVar.f2713e.getPackageName(), str, str2, a2) : dVar.f2714f.a(3, dVar.f2713e.getPackageName(), str, str2);
                g a4 = w.a(a3, "BillingClient", "getPurchase()");
                if (a4 != v.f2783k) {
                    return new h.a(a4, null);
                }
                ArrayList<String> stringArrayList = a3.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = a3.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = a3.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    String str3 = stringArrayList2.get(i2);
                    String str4 = stringArrayList3.get(i2);
                    String valueOf2 = String.valueOf(stringArrayList.get(i2));
                    a.a("BillingClient", valueOf2.length() != 0 ? "Sku is owned: ".concat(valueOf2) : new String("Sku is owned: "));
                    try {
                        h hVar = new h(str3, str4);
                        if (TextUtils.isEmpty(hVar.c())) {
                            a.b("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(hVar);
                    } catch (JSONException e2) {
                        String valueOf3 = String.valueOf(e2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 48);
                        sb.append("Got an exception trying to decode the purchase: ");
                        sb.append(valueOf3);
                        a.b("BillingClient", sb.toString());
                        return new h.a(v.f2782j, null);
                    }
                }
                str2 = a3.getString("INAPP_CONTINUATION_TOKEN");
                String valueOf4 = String.valueOf(str2);
                a.a("BillingClient", valueOf4.length() != 0 ? "Continuation token: ".concat(valueOf4) : new String("Continuation token: "));
            } catch (Exception e3) {
                String valueOf5 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf5).length() + 57);
                sb2.append("Got exception trying to get purchases: ");
                sb2.append(valueOf5);
                sb2.append("; try to reconnect");
                a.b("BillingClient", sb2.toString());
                return new h.a(v.f2784l, null);
            }
        } while (!TextUtils.isEmpty(str2));
        return new h.a(v.f2783k, arrayList);
    }

    /* access modifiers changed from: private */
    public final <T> Future<T> a(Callable<T> callable, long j2, Runnable runnable, Handler handler) {
        long j3 = (long) (((double) j2) * 0.95d);
        if (this.t == null) {
            this.t = Executors.newFixedThreadPool(a.a, new p(this));
        }
        try {
            Future<T> submit = this.t.submit(callable);
            handler.postDelayed(new m0(submit, runnable), j3);
            return submit;
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Async task throws exception ");
            sb.append(valueOf);
            a.b("BillingClient", sb.toString());
            return null;
        }
    }

    private void a(Context context, j jVar, boolean z) {
        this.f2713e = context.getApplicationContext();
        this.f2712d = new d0(this.f2713e, jVar);
        this.s = z;
    }

    private final g b(g gVar) {
        if (Thread.interrupted()) {
            return gVar;
        }
        this.f2711c.post(new j0(this, gVar));
        return gVar;
    }

    /* access modifiers changed from: private */
    public final Handler c() {
        return Looper.myLooper() == null ? this.f2711c : new Handler(Looper.myLooper());
    }

    /* access modifiers changed from: private */
    public final g d() {
        return (this.a == 0 || this.a == 3) ? v.f2784l : v.f2782j;
    }

    public final /* synthetic */ Bundle a(int i2, k kVar, String str, f fVar, Bundle bundle) {
        return this.f2714f.a(i2, this.f2713e.getPackageName(), kVar.d(), str, null, bundle);
    }

    public final /* synthetic */ Bundle a(k kVar, String str) {
        return this.f2714f.a(3, this.f2713e.getPackageName(), kVar.d(), str, (String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.android.billingclient.api.n0] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.android.billingclient.api.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.android.billingclient.api.g a(android.app.Activity r29, com.android.billingclient.api.f r30) {
        /*
        // Method dump skipped, instructions count: 851
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.d.a(android.app.Activity, com.android.billingclient.api.f):com.android.billingclient.api.g");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008a, code lost:
        e.b.b.a.c.f.a.b("BillingClient", r0);
        r0 = null;
        r6 = 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object a(java.lang.String r22, java.util.List r23, java.lang.String r24, com.android.billingclient.api.m r25) {
        /*
        // Method dump skipped, instructions count: 338
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.d.a(java.lang.String, java.util.List, java.lang.String, com.android.billingclient.api.m):java.lang.Object");
    }

    @Override // com.android.billingclient.api.c
    public final void a() {
        try {
            this.f2712d.b();
            if (this.f2715g != null) {
                this.f2715g.c();
            }
            if (!(this.f2715g == null || this.f2714f == null)) {
                a.a("BillingClient", "Unbinding from service.");
                this.f2713e.unbindService(this.f2715g);
                this.f2715g = null;
            }
            this.f2714f = null;
            ExecutorService executorService = this.t;
            if (executorService != null) {
                executorService.shutdownNow();
                this.t = null;
            }
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
            sb.append("There was an exception while ending connection: ");
            sb.append(valueOf);
            a.b("BillingClient", sb.toString());
        } finally {
            this.a = 3;
        }
    }

    @Override // com.android.billingclient.api.c
    public final void a(a aVar, b bVar) {
        g d2;
        if (!b()) {
            d2 = v.f2784l;
        } else if (TextUtils.isEmpty(aVar.a())) {
            a.b("BillingClient", "Please provide a valid purchase token.");
            d2 = v.f2781i;
        } else if (!this.f2721m) {
            d2 = v.f2774b;
        } else if (a(new g0(this, aVar, bVar), 30000, new f0(bVar), c()) == null) {
            d2 = d();
        } else {
            return;
        }
        bVar.a(d2);
    }

    @Override // com.android.billingclient.api.c
    public final void a(e eVar) {
        ResolveInfo resolveInfo;
        ServiceInfo serviceInfo;
        String str;
        if (b()) {
            a.a("BillingClient", "Service connection is valid. No need to re-initialize.");
            eVar.a(v.f2783k);
        } else if (this.a == 1) {
            a.b("BillingClient", "Client is already in the process of connecting to billing service.");
            eVar.a(v.f2776d);
        } else if (this.a == 3) {
            a.b("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            eVar.a(v.f2784l);
        } else {
            this.a = 1;
            this.f2712d.c();
            a.a("BillingClient", "Starting in-app billing setup.");
            this.f2715g = new s(this, eVar, null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.f2713e.getPackageManager().queryIntentServices(intent, 0);
            if (!(queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = (resolveInfo = queryIntentServices.get(0)).serviceInfo) == null)) {
                String str2 = serviceInfo.packageName;
                String str3 = resolveInfo.serviceInfo.name;
                if (!"com.android.vending".equals(str2) || str3 == null) {
                    str = "The device doesn't have valid Play Store.";
                } else {
                    ComponentName componentName = new ComponentName(str2, str3);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f2710b);
                    if (this.f2713e.bindService(intent2, this.f2715g, 1)) {
                        a.a("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    str = "Connection to Billing service is blocked.";
                }
                a.b("BillingClient", str);
            }
            this.a = 0;
            a.a("BillingClient", "Billing service unavailable on device.");
            eVar.a(v.f2775c);
        }
    }

    public final /* synthetic */ void a(g gVar) {
        this.f2712d.a().a(gVar, null);
    }

    @Override // com.android.billingclient.api.c
    public final void a(l lVar, m mVar) {
        g gVar;
        if (!b()) {
            gVar = v.f2784l;
        } else {
            String a2 = lVar.a();
            List<String> b2 = lVar.b();
            if (TextUtils.isEmpty(a2)) {
                a.b("BillingClient", "Please fix the input params. SKU type can't be empty.");
                gVar = v.f2778f;
            } else if (b2 != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : b2) {
                    z zVar = new z(null);
                    zVar.a(str);
                    arrayList.add(zVar.a());
                }
                if (a(new i0(this, a2, arrayList, null, mVar), 30000, new l0(mVar), c()) == null) {
                    gVar = d();
                } else {
                    return;
                }
            } else {
                a.b("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
                gVar = v.f2777e;
            }
        }
        mVar.a(gVar, null);
    }

    @Override // com.android.billingclient.api.c
    public void a(String str, i iVar) {
        g d2;
        if (!b()) {
            d2 = v.f2784l;
        } else if (TextUtils.isEmpty(str)) {
            a.b("BillingClient", "Please provide a valid SKU type.");
            d2 = v.f2778f;
        } else if (a(new o(this, str, iVar), 30000, new k0(iVar), c()) == null) {
            d2 = d();
        } else {
            return;
        }
        iVar.a(d2, p.e());
    }

    public final /* synthetic */ Object b(a aVar, b bVar) {
        g gVar;
        try {
            Bundle b2 = this.f2714f.b(9, this.f2713e.getPackageName(), aVar.a(), a.a(aVar, this.f2710b));
            int a2 = a.a(b2, "BillingClient");
            String b3 = a.b(b2, "BillingClient");
            g.a c2 = g.c();
            c2.a(a2);
            c2.a(b3);
            gVar = c2.a();
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("Error acknowledge purchase; ex: ");
            sb.append(valueOf);
            a.b("BillingClient", sb.toString());
            gVar = v.f2784l;
        }
        bVar.a(gVar);
        return null;
    }

    public final boolean b() {
        return (this.a != 2 || this.f2714f == null || this.f2715g == null) ? false : true;
    }
}
