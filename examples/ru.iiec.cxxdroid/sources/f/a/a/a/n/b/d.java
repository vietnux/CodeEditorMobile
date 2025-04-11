package f.a.a.a.n.b;

import android.content.Context;
import f.a.a.a.c;

class d implements f {
    private final Context a;

    public d(Context context) {
        this.a = context.getApplicationContext();
    }

    private String b() {
        try {
            return (String) Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("getId", new Class[0]).invoke(c(), new Object[0]);
        } catch (Exception unused) {
            c.g().a("Fabric", "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return null;
        }
    }

    private Object c() {
        try {
            return Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", Context.class).invoke(null, this.a);
        } catch (Exception unused) {
            c.g().a("Fabric", "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient");
            return null;
        }
    }

    private boolean d() {
        try {
            return ((Boolean) Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(c(), new Object[0])).booleanValue();
        } catch (Exception unused) {
            c.g().a("Fabric", "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return false;
        }
    }

    @Override // f.a.a.a.n.b.f
    public b a() {
        if (a(this.a)) {
            return new b(b(), d());
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean a(Context context) {
        try {
            return ((Integer) Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", new Class[]{Context.class}).invoke(null, new Object[]{context})).intValue() == 0;
        } catch (Exception unused) {
            return false;
        }
    }
}
