package e.b.b.a.c.e;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.y;

public final class o1 {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7472b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7473c;

    /* renamed from: d  reason: collision with root package name */
    private final long f7474d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ k1 f7475e;

    private o1(k1 k1Var, String str, long j2) {
        this.f7475e = k1Var;
        y.b(str);
        y.a(j2 > 0);
        this.a = String.valueOf(str).concat(":start");
        this.f7472b = String.valueOf(str).concat(":count");
        this.f7473c = String.valueOf(str).concat(":value");
        this.f7474d = j2;
    }

    private final void b() {
        this.f7475e.d();
        long a2 = this.f7475e.b().a();
        SharedPreferences.Editor edit = this.f7475e.F().edit();
        edit.remove(this.f7472b);
        edit.remove(this.f7473c);
        edit.putLong(this.a, a2);
        edit.apply();
    }

    private final long c() {
        return this.f7475e.F().getLong(this.a, 0);
    }

    public final Pair<String, Long> a() {
        long j2;
        this.f7475e.d();
        this.f7475e.d();
        long c2 = c();
        if (c2 == 0) {
            b();
            j2 = 0;
        } else {
            j2 = Math.abs(c2 - this.f7475e.b().a());
        }
        long j3 = this.f7474d;
        if (j2 < j3) {
            return null;
        }
        if (j2 > (j3 << 1)) {
            b();
            return null;
        }
        String string = this.f7475e.F().getString(this.f7473c, null);
        long j4 = this.f7475e.F().getLong(this.f7472b, 0);
        b();
        return (string == null || j4 <= 0) ? k1.y : new Pair<>(string, Long.valueOf(j4));
    }

    public final void a(String str, long j2) {
        this.f7475e.d();
        if (c() == 0) {
            b();
        }
        if (str == null) {
            str = "";
        }
        long j3 = this.f7475e.F().getLong(this.f7472b, 0);
        if (j3 <= 0) {
            SharedPreferences.Editor edit = this.f7475e.F().edit();
            edit.putString(this.f7473c, str);
            edit.putLong(this.f7472b, 1);
            edit.apply();
            return;
        }
        long j4 = j3 + 1;
        boolean z = (this.f7475e.o().z().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j4;
        SharedPreferences.Editor edit2 = this.f7475e.F().edit();
        if (z) {
            edit2.putString(this.f7473c, str);
        }
        edit2.putLong(this.f7472b, j4);
        edit2.apply();
    }
}
