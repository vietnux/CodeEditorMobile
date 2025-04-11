package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.t.c;
import com.google.android.gms.common.util.n;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

@k2
public final class v8 implements r9 {
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private oz f5815b;

    /* renamed from: c  reason: collision with root package name */
    private final c9 f5816c = new c9();

    /* renamed from: d  reason: collision with root package name */
    private final n9 f5817d = new n9();

    /* renamed from: e  reason: collision with root package name */
    private boolean f5818e = false;

    /* renamed from: f  reason: collision with root package name */
    private Context f5819f;

    /* renamed from: g  reason: collision with root package name */
    private sc f5820g;

    /* renamed from: h  reason: collision with root package name */
    private n80 f5821h = null;

    /* renamed from: i  reason: collision with root package name */
    private i10 f5822i = null;

    /* renamed from: j  reason: collision with root package name */
    private d10 f5823j = null;

    /* renamed from: k  reason: collision with root package name */
    private Boolean f5824k = null;

    /* renamed from: l  reason: collision with root package name */
    private final AtomicInteger f5825l = new AtomicInteger(0);

    /* renamed from: m  reason: collision with root package name */
    private final y8 f5826m = new y8(null);
    private final Object n = new Object();
    private ld<ArrayList<String>> o;

    private final i10 a(Context context, boolean z, boolean z2) {
        if (!((Boolean) a50.g().a(k80.Q)).booleanValue() || !n.b()) {
            return null;
        }
        if (!((Boolean) a50.g().a(k80.Y)).booleanValue()) {
            if (!((Boolean) a50.g().a(k80.W)).booleanValue()) {
                return null;
            }
        }
        if (z && z2) {
            return null;
        }
        synchronized (this.a) {
            if (Looper.getMainLooper() != null) {
                if (context != null) {
                    if (this.f5823j == null) {
                        this.f5823j = new d10();
                    }
                    if (this.f5822i == null) {
                        this.f5822i = new i10(this.f5823j, e2.a(context, this.f5820g));
                    }
                    this.f5822i.b();
                    qc.c("start fetching content...");
                    return this.f5822i;
                }
            }
            return null;
        }
    }

    @TargetApi(16)
    private static ArrayList<String> b(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo b2 = c.b(context).b(context.getApplicationInfo().packageName, 4096);
            if (b2.requestedPermissions != null && b2.requestedPermissionsFlags != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = b2.requestedPermissions;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if ((b2.requestedPermissionsFlags[i2] & 2) != 0) {
                        arrayList.add(strArr[i2]);
                    }
                    i2++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final Context a() {
        return this.f5819f;
    }

    public final i10 a(Context context) {
        return a(context, this.f5817d.b(), this.f5817d.d());
    }

    @TargetApi(23)
    public final void a(Context context, sc scVar) {
        n80 n80;
        synchronized (this.a) {
            if (!this.f5818e) {
                this.f5819f = context.getApplicationContext();
                this.f5820g = scVar;
                x0.i().a(x0.k());
                this.f5817d.a(this.f5819f);
                this.f5817d.a(this);
                e2.a(this.f5819f, this.f5820g);
                x0.f().a(context, scVar.f5529b);
                this.f5815b = new oz(context.getApplicationContext(), this.f5820g);
                x0.o();
                if (!((Boolean) a50.g().a(k80.N)).booleanValue()) {
                    l9.e("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    n80 = null;
                } else {
                    n80 = new n80();
                }
                this.f5821h = n80;
                yc.a((ld) new x8(this).a(), "AppState.registerCsiReporter");
                this.f5818e = true;
                n();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r9
    public final void a(Bundle bundle) {
        if (bundle.containsKey("content_url_opted_out") && bundle.containsKey("content_vertical_opted_out")) {
            a(this.f5819f, bundle.getBoolean("content_url_opted_out"), bundle.getBoolean("content_vertical_opted_out"));
        }
    }

    public final void a(Boolean bool) {
        synchronized (this.a) {
            this.f5824k = bool;
        }
    }

    public final void a(Throwable th, String str) {
        e2.a(this.f5819f, this.f5820g).a(th, str);
    }

    public final void a(boolean z) {
        this.f5826m.a(z);
    }

    public final Resources b() {
        if (this.f5820g.f5532e) {
            return this.f5819f.getResources();
        }
        try {
            DynamiteModule a2 = DynamiteModule.a(this.f5819f, DynamiteModule.f3739h, ModuleDescriptor.MODULE_ID);
            if (a2 != null) {
                return a2.a().getResources();
            }
            return null;
        } catch (DynamiteModule.a e2) {
            qc.c("Cannot load resource from dynamite apk or local jar", e2);
            return null;
        }
    }

    public final void b(Throwable th, String str) {
        e2.a(this.f5819f, this.f5820g).a(th, str, ((Float) a50.g().a(k80.f4792f)).floatValue());
    }

    public final c9 c() {
        return this.f5816c;
    }

    public final n80 d() {
        n80 n80;
        synchronized (this.a) {
            n80 = this.f5821h;
        }
        return n80;
    }

    public final Boolean e() {
        Boolean bool;
        synchronized (this.a) {
            bool = this.f5824k;
        }
        return bool;
    }

    public final boolean f() {
        return this.f5826m.a();
    }

    public final boolean g() {
        return this.f5826m.b();
    }

    public final void h() {
        this.f5826m.c();
    }

    public final oz i() {
        return this.f5815b;
    }

    public final void j() {
        this.f5825l.incrementAndGet();
    }

    public final void k() {
        this.f5825l.decrementAndGet();
    }

    public final int l() {
        return this.f5825l.get();
    }

    public final n9 m() {
        n9 n9Var;
        synchronized (this.a) {
            n9Var = this.f5817d;
        }
        return n9Var;
    }

    public final ld<ArrayList<String>> n() {
        if (this.f5819f != null && n.d()) {
            if (!((Boolean) a50.g().a(k80.G1)).booleanValue()) {
                synchronized (this.n) {
                    if (this.o != null) {
                        return this.o;
                    }
                    ld<ArrayList<String>> a2 = s9.a(new w8(this));
                    this.o = a2;
                    return a2;
                }
            }
        }
        return ad.a(new ArrayList());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList o() {
        return b(this.f5819f);
    }
}
