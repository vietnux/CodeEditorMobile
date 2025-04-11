package e.b.b.a.c.e;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.y;

public final class n1 {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7452b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7453c;

    /* renamed from: d  reason: collision with root package name */
    private long f7454d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ k1 f7455e;

    public n1(k1 k1Var, String str, long j2) {
        this.f7455e = k1Var;
        y.b(str);
        this.a = str;
        this.f7452b = j2;
    }

    public final long a() {
        if (!this.f7453c) {
            this.f7453c = true;
            this.f7454d = this.f7455e.F().getLong(this.a, this.f7452b);
        }
        return this.f7454d;
    }

    public final void a(long j2) {
        SharedPreferences.Editor edit = this.f7455e.F().edit();
        edit.putLong(this.a, j2);
        edit.apply();
        this.f7454d = j2;
    }
}
