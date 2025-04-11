package e.b.b.a.c.e;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.s.a;
import com.google.android.gms.common.t.b;
import com.google.android.gms.common.t.c;
import java.util.List;

public final class q1 {
    private final d2 a;

    /* renamed from: b  reason: collision with root package name */
    volatile o6 f7518b;

    /* renamed from: c  reason: collision with root package name */
    private ServiceConnection f7519c;

    q1(d2 d2Var) {
        this.a = d2Var;
    }

    private final boolean c() {
        try {
            b b2 = c.b(this.a.getContext());
            if (b2 != null) {
                return b2.b("com.android.vending", 128).versionCode >= 80837300;
            }
            this.a.a().D().a("Failed to retrieve Package Manager to check Play Store compatibility");
            return false;
        } catch (Exception e2) {
            this.a.a().D().a("Failed to retrieve Play Store version", e2);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.a.e();
        if (!c()) {
            this.a.a().D().a("Install Referrer Reporter is not available");
            this.f7519c = null;
            return;
        }
        this.f7519c = new s1(this);
        this.a.a().D().a("Install Referrer Reporter is initializing");
        this.a.e();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.a.getContext().getPackageManager();
        if (packageManager == null) {
            this.a.a().B().a("Failed to obtain Package Manager to verify binding conditions");
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.a.a().D().a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ResolveInfo resolveInfo = queryIntentServices.get(0);
        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
        if (serviceInfo != null) {
            String str = serviceInfo.packageName;
            if (resolveInfo.serviceInfo.name == null || this.f7519c == null || !"com.android.vending".equals(str) || !c()) {
                this.a.a().D().a("Play Store missing or incompatible. Version 8.3.73 or later required");
                return;
            }
            try {
                this.a.a().D().a("Install Referrer Service is", a.a().a(this.a.getContext(), new Intent(intent), this.f7519c, 1) ? "available" : "not available");
            } catch (Exception e2) {
                this.a.a().y().a("Exception occurred while binding to Install Referrer Service", e2.getMessage());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle) {
        b1 y;
        String str;
        this.a.e();
        if (bundle != null) {
            long j2 = bundle.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j2 == 0) {
                y = this.a.a().y();
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = bundle.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    y = this.a.a().y();
                    str = "No referrer defined in install referrer response";
                } else {
                    this.a.a().F().a("InstallReferrer API result", string);
                    s5 h2 = this.a.h();
                    String valueOf = String.valueOf(string);
                    Bundle a2 = h2.a(Uri.parse(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")));
                    if (a2 == null) {
                        y = this.a.a().y();
                        str = "No campaign params defined in install referrer result";
                    } else {
                        String string2 = a2.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j3 = bundle.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j3 == 0) {
                                y = this.a.a().y();
                                str = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                a2.putLong("click_timestamp", j3);
                            }
                        }
                        if (j2 == this.a.i().f7381k.a()) {
                            y = this.a.a().F();
                            str = "Campaign has already been logged";
                        } else {
                            a2.putString("_cis", "referrer API");
                            this.a.i().f7381k.a(j2);
                            this.a.u().b("auto", "_cmp", a2);
                            if (this.f7519c != null) {
                                a.a().b(this.a.getContext(), this.f7519c);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            y.a(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle b() {
        this.a.e();
        if (this.f7518b == null) {
            this.a.a().B().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.a.getContext().getPackageName());
        try {
            Bundle g2 = this.f7518b.g(bundle);
            if (g2 != null) {
                return g2;
            }
            this.a.a().y().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e2) {
            this.a.a().y().a("Exception occurred while retrieving the Install Referrer", e2.getMessage());
            return null;
        }
    }
}
