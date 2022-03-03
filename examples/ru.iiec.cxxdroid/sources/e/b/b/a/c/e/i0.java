package e.b.b.a.c.e;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.y;
import java.util.Iterator;

public final class i0 {
    final String a;

    /* renamed from: b  reason: collision with root package name */
    final String f7308b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7309c;

    /* renamed from: d  reason: collision with root package name */
    final long f7310d;

    /* renamed from: e  reason: collision with root package name */
    final long f7311e;

    /* renamed from: f  reason: collision with root package name */
    final k0 f7312f;

    i0(d2 d2Var, String str, String str2, String str3, long j2, long j3, Bundle bundle) {
        k0 k0Var;
        y.b(str2);
        y.b(str3);
        this.a = str2;
        this.f7308b = str3;
        this.f7309c = TextUtils.isEmpty(str) ? null : str;
        this.f7310d = j2;
        this.f7311e = j3;
        long j4 = this.f7311e;
        if (j4 != 0 && j4 > this.f7310d) {
            d2Var.a().B().a("Event created with reverse previous/current timestamps. appId", z0.a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            k0Var = new k0(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    d2Var.a().y().a("Param name can't be null");
                } else {
                    Object a2 = d2Var.h().a(next, bundle2.get(next));
                    if (a2 == null) {
                        d2Var.a().B().a("Param value can't be null", d2Var.g().b(next));
                    } else {
                        d2Var.h().a(bundle2, next, a2);
                    }
                }
                it.remove();
            }
            k0Var = new k0(bundle2);
        }
        this.f7312f = k0Var;
    }

    private i0(d2 d2Var, String str, String str2, String str3, long j2, long j3, k0 k0Var) {
        y.b(str2);
        y.b(str3);
        y.a(k0Var);
        this.a = str2;
        this.f7308b = str3;
        this.f7309c = TextUtils.isEmpty(str) ? null : str;
        this.f7310d = j2;
        this.f7311e = j3;
        long j4 = this.f7311e;
        if (j4 != 0 && j4 > this.f7310d) {
            d2Var.a().B().a("Event created with reverse previous/current timestamps. appId, name", z0.a(str2), z0.a(str3));
        }
        this.f7312f = k0Var;
    }

    /* access modifiers changed from: package-private */
    public final i0 a(d2 d2Var, long j2) {
        return new i0(d2Var, this.f7309c, this.a, this.f7308b, this.f7310d, j2, this.f7312f);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.f7308b;
        String valueOf = String.valueOf(this.f7312f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
