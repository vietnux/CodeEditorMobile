package e.b.b.a.c.e;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import c.e.a;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.IOException;
import java.util.Map;

public final class y1 extends i5 implements a0 {

    /* renamed from: j  reason: collision with root package name */
    private static int f7697j = 65535;

    /* renamed from: k  reason: collision with root package name */
    private static int f7698k = 2;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Map<String, String>> f7699d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f7700e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f7701f = new a();

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, c6> f7702g = new a();

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, Map<String, Integer>> f7703h = new a();

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, String> f7704i = new a();

    y1(j5 j5Var) {
        super(j5Var);
    }

    private final c6 a(String str, byte[] bArr) {
        if (bArr == null) {
            return new c6();
        }
        a a = a.a(bArr, 0, bArr.length);
        c6 c6Var = new c6();
        try {
            c6Var.a(a);
            a().F().a("Parsed config. version, gmp_app_id", c6Var.f7205c, c6Var.f7206d);
            return c6Var;
        } catch (IOException e2) {
            a().B().a("Unable to merge remote config. appId", z0.a(str), e2);
            return new c6();
        }
    }

    private static Map<String, String> a(c6 c6Var) {
        d6[] d6VarArr;
        a aVar = new a();
        if (!(c6Var == null || (d6VarArr = c6Var.f7208f) == null)) {
            for (d6 d6Var : d6VarArr) {
                if (d6Var != null) {
                    aVar.put(d6Var.f7221c, d6Var.f7222d);
                }
            }
        }
        return aVar;
    }

    private final void a(String str, c6 c6Var) {
        b6[] b6VarArr;
        a aVar = new a();
        a aVar2 = new a();
        a aVar3 = new a();
        if (!(c6Var == null || (b6VarArr = c6Var.f7209g) == null)) {
            for (b6 b6Var : b6VarArr) {
                if (TextUtils.isEmpty(b6Var.f7184c)) {
                    a().B().a("EventConfig contained null event name");
                } else {
                    String a = AppMeasurement.a.a(b6Var.f7184c);
                    if (!TextUtils.isEmpty(a)) {
                        b6Var.f7184c = a;
                    }
                    aVar.put(b6Var.f7184c, b6Var.f7185d);
                    aVar2.put(b6Var.f7184c, b6Var.f7186e);
                    Integer num = b6Var.f7187f;
                    if (num != null) {
                        if (num.intValue() < f7698k || b6Var.f7187f.intValue() > f7697j) {
                            a().B().a("Invalid sampling rate. Event name, sample rate", b6Var.f7184c, b6Var.f7187f);
                        } else {
                            aVar3.put(b6Var.f7184c, b6Var.f7187f);
                        }
                    }
                }
            }
        }
        this.f7700e.put(str, aVar);
        this.f7701f.put(str, aVar2);
        this.f7703h.put(str, aVar3);
    }

    private final void g(String str) {
        v();
        d();
        y.b(str);
        if (this.f7702g.get(str) == null) {
            byte[] d2 = t().d(str);
            if (d2 == null) {
                this.f7699d.put(str, null);
                this.f7700e.put(str, null);
                this.f7701f.put(str, null);
                this.f7702g.put(str, null);
                this.f7704i.put(str, null);
                this.f7703h.put(str, null);
                return;
            }
            c6 a = a(str, d2);
            this.f7699d.put(str, a(a));
            a(str, a);
            this.f7702g.put(str, a);
            this.f7704i.put(str, null);
        }
    }

    /* access modifiers changed from: protected */
    public final c6 a(String str) {
        v();
        d();
        y.b(str);
        g(str);
        return this.f7702g.get(str);
    }

    @Override // e.b.b.a.c.e.a0
    public final String a(String str, String str2) {
        d();
        g(str);
        Map<String, String> map = this.f7699d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        v();
        d();
        y.b(str);
        c6 a = a(str, bArr);
        if (a == null) {
            return false;
        }
        a(str, a);
        this.f7702g.put(str, a);
        this.f7704i.put(str, str2);
        this.f7699d.put(str, a(a));
        u s = s();
        v5[] v5VarArr = a.f7210h;
        y.a(v5VarArr);
        for (v5 v5Var : v5VarArr) {
            w5[] w5VarArr = v5Var.f7634e;
            for (w5 w5Var : w5VarArr) {
                String a2 = AppMeasurement.a.a(w5Var.f7663d);
                if (a2 != null) {
                    w5Var.f7663d = a2;
                }
                x5[] x5VarArr = w5Var.f7664e;
                for (x5 x5Var : x5VarArr) {
                    String a3 = AppMeasurement.d.a(x5Var.f7693f);
                    if (a3 != null) {
                        x5Var.f7693f = a3;
                    }
                }
            }
            z5[] z5VarArr = v5Var.f7633d;
            for (z5 z5Var : z5VarArr) {
                String a4 = AppMeasurement.e.a(z5Var.f7745d);
                if (a4 != null) {
                    z5Var.f7745d = a4;
                }
            }
        }
        s.t().a(str, v5VarArr);
        try {
            a.f7210h = null;
            bArr2 = new byte[a.d()];
            a.a(b.a(bArr2, 0, bArr2.length));
        } catch (IOException e2) {
            a().B().a("Unable to serialize reduced-size config. Storing full config instead. appId", z0.a(str), e2);
            bArr2 = bArr;
        }
        b0 t = t();
        y.b(str);
        t.d();
        t.v();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr2);
        try {
            if (((long) t.A().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                t.a().y().a("Failed to update remote config (got 0). appId", z0.a(str));
            }
        } catch (SQLiteException e3) {
            t.a().y().a("Error storing remote config. appId", z0.a(str), e3);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final String b(String str) {
        d();
        return this.f7704i.get(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean b(String str, String str2) {
        Boolean bool;
        d();
        g(str);
        if (e(str) && s5.j(str2)) {
            return true;
        }
        if (f(str) && s5.h(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f7700e.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    public final void c(String str) {
        d();
        this.f7704i.put(str, null);
    }

    /* access modifiers changed from: package-private */
    public final boolean c(String str, String str2) {
        Boolean bool;
        d();
        g(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f7701f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final int d(String str, String str2) {
        Integer num;
        d();
        g(str);
        Map<String, Integer> map = this.f7703h.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    public final void d(String str) {
        d();
        this.f7702g.remove(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean e(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    public final boolean f(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.i5
    public final boolean w() {
        return false;
    }
}
