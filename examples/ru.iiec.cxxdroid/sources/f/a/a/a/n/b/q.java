package f.a.a.a.n.b;

import android.content.Context;
import f.a.a.a.c;
import f.a.a.a.n.a.b;
import f.a.a.a.n.a.d;

public class q {
    private final d<String> a = new a(this);

    /* renamed from: b  reason: collision with root package name */
    private final b<String> f8431b = new b<>();

    class a implements d<String> {
        a(q qVar) {
        }

        @Override // f.a.a.a.n.a.d
        public String a(Context context) {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            return installerPackageName == null ? "" : installerPackageName;
        }
    }

    public String a(Context context) {
        try {
            String a2 = this.f8431b.a(context, this.a);
            if ("".equals(a2)) {
                return null;
            }
            return a2;
        } catch (Exception e2) {
            c.g().c("Fabric", "Failed to determine installer package name", e2);
            return null;
        }
    }
}
