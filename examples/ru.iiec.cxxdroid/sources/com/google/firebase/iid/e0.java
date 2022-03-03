package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import e.b.b.a.e.g;
import e.b.b.a.e.h;
import e.b.c.a;
import java.io.IOException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* access modifiers changed from: package-private */
public final class e0 implements h0 {
    private final a a;

    /* renamed from: b  reason: collision with root package name */
    private final FirebaseInstanceId f6613b;

    /* renamed from: c  reason: collision with root package name */
    private final g f6614c;

    /* renamed from: d  reason: collision with root package name */
    private final n f6615d;

    /* renamed from: e  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f6616e = new ScheduledThreadPoolExecutor(1);

    e0(a aVar, FirebaseInstanceId firebaseInstanceId, g gVar) {
        this.a = aVar;
        this.f6613b = firebaseInstanceId;
        this.f6614c = gVar;
        this.f6615d = new n(aVar.a(), gVar);
    }

    /* access modifiers changed from: private */
    public final String a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                this.f6613b.f();
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    private final Bundle b(String str, String str2, Bundle bundle) {
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("appid", FirebaseInstanceId.l());
        bundle.putString("gmp_app_id", this.a.c().a());
        bundle.putString("gmsv", Integer.toString(this.f6614c.a()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f6614c.c());
        bundle.putString("app_ver_name", this.f6614c.d());
        bundle.putString("cliv", "fiid-12451000");
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public final String a(String str, String str2, Bundle bundle) {
        b(str, str2, bundle);
        return a(this.f6615d.a(bundle));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bundle bundle, h hVar) {
        try {
            hVar.a(this.f6615d.a(bundle));
        } catch (IOException e2) {
            hVar.a((Exception) e2);
        }
    }

    @Override // com.google.firebase.iid.h0
    public final g<String> b(String str, String str2) {
        Bundle bundle = new Bundle();
        b(str, str2, bundle);
        h hVar = new h();
        this.f6616e.execute(new f0(this, bundle, hVar));
        return hVar.a().a(this.f6616e, new g0(this));
    }
}
