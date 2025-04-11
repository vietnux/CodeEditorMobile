package qwe.qweqwe.texteditor;

import android.content.pm.PackageManager;
import android.os.Bundle;

public class a0 {

    /* access modifiers changed from: package-private */
    public enum a {
        PYDROID("pydroid", "ru.iiec.pydroid"),
        PYDROID2("pydroid2", "ru.iiec.pydroid2"),
        PYDROID3("pydroid3", "ru.iiec.pydroid3"),
        CXXDROID("cxxdroid", "ru.iiec.cxxdroid");
        

        /* renamed from: b  reason: collision with root package name */
        private final String f9601b;

        /* renamed from: c  reason: collision with root package name */
        private final String f9602c;

        private a(String str, String str2) {
            this.f9601b = str;
            this.f9602c = str2;
        }
    }

    public static void a(Bundle bundle, e0 e0Var) {
        if (bundle == null) {
            a(e0Var);
        }
    }

    private static void a(e0 e0Var) {
        try {
            PackageManager packageManager = e0Var.getPackageManager();
            a[] values = a.values();
            for (a aVar : values) {
                e0Var.b("has_" + aVar.f9601b, String.valueOf(a(packageManager, aVar.f9602c)));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static boolean a(PackageManager packageManager, String str) {
        try {
            packageManager.getPackageInfo(str, 1);
            return packageManager.getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
