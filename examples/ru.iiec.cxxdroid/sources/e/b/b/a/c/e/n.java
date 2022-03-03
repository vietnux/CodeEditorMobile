package e.b.b.a.c.e;

import android.os.Bundle;
import c.e.a;
import com.google.android.gms.common.internal.y;
import java.util.Map;

public final class n extends y2 {

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Long> f7445b = new a();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Integer> f7446c = new a();

    /* renamed from: d  reason: collision with root package name */
    private long f7447d;

    public n(d2 d2Var) {
        super(d2Var);
    }

    private final void a(long j2, w3 w3Var) {
        if (w3Var == null) {
            a().F().a("Not logging ad exposure. No active activity");
        } else if (j2 < 1000) {
            a().F().a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j2);
            x3.a(w3Var, bundle, true);
            h().b("am", "_xa", bundle);
        }
    }

    /* access modifiers changed from: private */
    public final void a(String str, long j2) {
        d();
        y.b(str);
        if (this.f7446c.isEmpty()) {
            this.f7447d = j2;
        }
        Integer num = this.f7446c.get(str);
        if (num != null) {
            this.f7446c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f7446c.size() >= 100) {
            a().B().a("Too many ads visible");
        } else {
            this.f7446c.put(str, 1);
            this.f7445b.put(str, Long.valueOf(j2));
        }
    }

    private final void a(String str, long j2, w3 w3Var) {
        if (w3Var == null) {
            a().F().a("Not logging ad unit exposure. No active activity");
        } else if (j2 < 1000) {
            a().F().a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j2);
            x3.a(w3Var, bundle, true);
            h().b("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    public final void b(long j2) {
        for (String str : this.f7445b.keySet()) {
            this.f7445b.put(str, Long.valueOf(j2));
        }
        if (!this.f7445b.isEmpty()) {
            this.f7447d = j2;
        }
    }

    /* access modifiers changed from: private */
    public final void b(String str, long j2) {
        d();
        y.b(str);
        Integer num = this.f7446c.get(str);
        if (num != null) {
            w3 y = l().y();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f7446c.remove(str);
                Long l2 = this.f7445b.get(str);
                if (l2 == null) {
                    a().y().a("First ad unit exposure time was never set");
                } else {
                    this.f7445b.remove(str);
                    a(str, j2 - l2.longValue(), y);
                }
                if (this.f7446c.isEmpty()) {
                    long j3 = this.f7447d;
                    if (j3 == 0) {
                        a().y().a("First ad exposure time was never set");
                        return;
                    }
                    a(j2 - j3, y);
                    this.f7447d = 0;
                    return;
                }
                return;
            }
            this.f7446c.put(str, Integer.valueOf(intValue));
            return;
        }
        a().y().a("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    public final void a(long j2) {
        w3 y = l().y();
        for (String str : this.f7445b.keySet()) {
            a(str, j2 - this.f7445b.get(str).longValue(), y);
        }
        if (!this.f7445b.isEmpty()) {
            a(j2 - this.f7447d, y);
        }
        b(j2);
    }

    public final void a(String str) {
        if (str == null || str.length() == 0) {
            a().y().a("Ad unit id must be a non-empty string");
            return;
        }
        c().a(new o(this, str, b().b()));
    }

    public final void b(String str) {
        if (str == null || str.length() == 0) {
            a().y().a("Ad unit id must be a non-empty string");
            return;
        }
        c().a(new p(this, str, b().b()));
    }
}
