package e.b.b.a.c.e;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.measurement.AppMeasurement;

public final class z0 extends z2 {

    /* renamed from: c  reason: collision with root package name */
    private char f7714c = 0;

    /* renamed from: d  reason: collision with root package name */
    private long f7715d = -1;

    /* renamed from: e  reason: collision with root package name */
    private String f7716e;

    /* renamed from: f  reason: collision with root package name */
    private final b1 f7717f = new b1(this, 6, false, false);

    /* renamed from: g  reason: collision with root package name */
    private final b1 f7718g = new b1(this, 6, true, false);

    /* renamed from: h  reason: collision with root package name */
    private final b1 f7719h = new b1(this, 6, false, true);

    /* renamed from: i  reason: collision with root package name */
    private final b1 f7720i = new b1(this, 5, false, false);

    /* renamed from: j  reason: collision with root package name */
    private final b1 f7721j;

    /* renamed from: k  reason: collision with root package name */
    private final b1 f7722k;

    /* renamed from: l  reason: collision with root package name */
    private final b1 f7723l;

    /* renamed from: m  reason: collision with root package name */
    private final b1 f7724m;

    z0(d2 d2Var) {
        super(d2Var);
        new b1(this, 5, true, false);
        this.f7721j = new b1(this, 5, false, true);
        this.f7722k = new b1(this, 4, false, false);
        this.f7723l = new b1(this, 3, false, false);
        this.f7724m = new b1(this, 2, false, false);
    }

    private final String H() {
        String str;
        synchronized (this) {
            if (this.f7716e == null) {
                this.f7716e = p0.f7488c.a();
            }
            str = this.f7716e;
        }
        return str;
    }

    protected static Object a(String str) {
        if (str == null) {
            return null;
        }
        return new c1(str);
    }

    private static String a(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i2 = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l2.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (!(obj instanceof Throwable)) {
                return obj instanceof c1 ? c1.a((c1) obj) : z ? "-" : String.valueOf(obj);
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String b2 = b(AppMeasurement.class.getCanonicalName());
            String b3 = b(d2.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                    String b4 = b(className);
                    if (b4.equals(b2) || b4.equals(b3)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                    }
                }
                i2++;
            }
            return sb2.toString();
        }
    }

    static String a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String a = a(z, obj);
        String a2 = a(z, obj2);
        String a3 = a(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(a)) {
            sb.append(str2);
            sb.append(a);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str2);
            sb.append(a3);
        }
        return sb.toString();
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    public final b1 A() {
        return this.f7719h;
    }

    public final b1 B() {
        return this.f7720i;
    }

    public final b1 C() {
        return this.f7721j;
    }

    public final b1 D() {
        return this.f7722k;
    }

    public final b1 E() {
        return this.f7723l;
    }

    public final b1 F() {
        return this.f7724m;
    }

    public final String G() {
        Pair<String, Long> a = q().f7374d.a();
        if (a == null || a == k1.y) {
            return null;
        }
        String valueOf = String.valueOf(a.second);
        String str = (String) a.first;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, String str) {
        Log.println(i2, H(), str);
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        if (!z && a(i2)) {
            a(i2, a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i2 >= 5) {
            y.a((Object) str);
            z1 C = this.a.C();
            if (C == null) {
                str2 = "Scheduler not set. Not logging error/warn";
            } else if (!C.s()) {
                str2 = "Scheduler not initialized. Not logging error/warn";
            } else {
                if (i2 < 0) {
                    i2 = 0;
                }
                C.a(new a1(this, i2 >= 9 ? 8 : i2, str, obj, obj2, obj3));
                return;
            }
            a(6, str2);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i2) {
        return Log.isLoggable(H(), i2);
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.z2
    public final boolean u() {
        return false;
    }

    public final b1 y() {
        return this.f7717f;
    }

    public final b1 z() {
        return this.f7718g;
    }
}
