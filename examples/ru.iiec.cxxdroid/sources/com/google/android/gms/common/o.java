package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.t.c;

public class o {

    /* renamed from: b  reason: collision with root package name */
    private static o f3709b;
    private final Context a;

    private o(Context context) {
        this.a = context.getApplicationContext();
    }

    private static i.a a(PackageInfo packageInfo, i.a... aVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        u uVar = new u(signatureArr[0].toByteArray());
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            if (aVarArr[i2].equals(uVar)) {
                return aVarArr[i2];
            }
        }
        return null;
    }

    public static o a(Context context) {
        y.a(context);
        synchronized (o.class) {
            if (f3709b == null) {
                i.a(context);
                f3709b = new o(context);
            }
        }
        return f3709b;
    }

    private final z a(String str) {
        try {
            return b(c.b(this.a).b(str, 64));
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            return z.a(valueOf.length() != 0 ? "no pkg ".concat(valueOf) : new String("no pkg "));
        }
    }

    private final z b(int i2) {
        String[] a2 = c.b(this.a).a(i2);
        if (a2 == null || a2.length == 0) {
            return z.a("no pkgs");
        }
        z zVar = null;
        for (String str : a2) {
            zVar = a(str);
            if (zVar.a) {
                return zVar;
            }
        }
        return zVar;
    }

    private final z b(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        String str;
        boolean honorsDebugCertificates = n.honorsDebugCertificates(this.a);
        if (packageInfo == null) {
            str = "null pkg";
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr.length != 1) {
                str = "single cert required";
            } else {
                u uVar = new u(signatureArr[0].toByteArray());
                String str2 = packageInfo.packageName;
                z a2 = i.a(str2, uVar, honorsDebugCertificates);
                if (!a2.a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || (honorsDebugCertificates && !i.a(str2, uVar, false).a)) {
                    return a2;
                }
                str = "debuggable release cert app rejected";
            }
        }
        return z.a(str);
    }

    public boolean a(int i2) {
        z b2 = b(i2);
        b2.b();
        return b2.a;
    }

    public boolean a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (a(packageInfo, false)) {
            return true;
        }
        if (a(packageInfo, true)) {
            if (n.honorsDebugCertificates(this.a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean a(PackageInfo packageInfo, boolean z) {
        i.a aVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                aVar = a(packageInfo, w.a);
            } else {
                aVar = a(packageInfo, w.a[0]);
            }
            if (aVar != null) {
                return true;
            }
        }
        return false;
    }
}
