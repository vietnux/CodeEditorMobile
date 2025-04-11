package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import c.h.d.c;
import java.util.Calendar;

/* access modifiers changed from: package-private */
public class o {

    /* renamed from: d  reason: collision with root package name */
    private static o f242d;
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f243b;

    /* renamed from: c  reason: collision with root package name */
    private final a f244c = new a();

    /* access modifiers changed from: private */
    public static class a {
        boolean a;

        /* renamed from: b  reason: collision with root package name */
        long f245b;

        /* renamed from: c  reason: collision with root package name */
        long f246c;

        /* renamed from: d  reason: collision with root package name */
        long f247d;

        /* renamed from: e  reason: collision with root package name */
        long f248e;

        /* renamed from: f  reason: collision with root package name */
        long f249f;

        a() {
        }
    }

    o(Context context, LocationManager locationManager) {
        this.a = context;
        this.f243b = locationManager;
    }

    private Location a(String str) {
        try {
            if (this.f243b.isProviderEnabled(str)) {
                return this.f243b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    static o a(Context context) {
        if (f242d == null) {
            Context applicationContext = context.getApplicationContext();
            f242d = new o(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f242d;
    }

    private void a(Location location) {
        long j2;
        a aVar = this.f244c;
        long currentTimeMillis = System.currentTimeMillis();
        n a2 = n.a();
        a2.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = a2.a;
        a2.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a2.f241c == 1;
        long j4 = a2.f240b;
        long j5 = a2.a;
        a2.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j6 = a2.f240b;
        if (j4 == -1 || j5 == -1) {
            j2 = 43200000 + currentTimeMillis;
        } else {
            j2 = (currentTimeMillis > j5 ? 0 + j6 : currentTimeMillis > j4 ? 0 + j5 : 0 + j4) + 60000;
        }
        aVar.a = z;
        aVar.f245b = j3;
        aVar.f246c = j4;
        aVar.f247d = j5;
        aVar.f248e = j6;
        aVar.f249f = j2;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location = null;
        Location a2 = c.b(this.a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? a("network") : null;
        if (c.b(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = a("gps");
        }
        return (location == null || a2 == null) ? location != null ? location : a2 : location.getTime() > a2.getTime() ? location : a2;
    }

    private boolean c() {
        return this.f244c.f249f > System.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        a aVar = this.f244c;
        if (c()) {
            return aVar.a;
        }
        Location b2 = b();
        if (b2 != null) {
            a(b2);
            return aVar.a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i2 = Calendar.getInstance().get(11);
        return i2 < 6 || i2 >= 22;
    }
}
