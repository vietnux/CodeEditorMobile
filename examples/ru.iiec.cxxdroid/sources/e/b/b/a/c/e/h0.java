package e.b.b.a.c.e;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class h0 extends z2 {

    /* renamed from: c  reason: collision with root package name */
    private long f7290c;

    /* renamed from: d  reason: collision with root package name */
    private String f7291d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f7292e;

    h0(d2 d2Var) {
        super(d2Var);
    }

    public final boolean a(Context context) {
        if (this.f7292e == null) {
            this.f7292e = false;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.f7292e = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.f7292e.booleanValue();
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.z2
    public final boolean u() {
        Calendar instance = Calendar.getInstance();
        this.f7290c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f7291d = sb.toString();
        return false;
    }

    public final long y() {
        t();
        return this.f7290c;
    }

    public final String z() {
        t();
        return this.f7291d;
    }
}
