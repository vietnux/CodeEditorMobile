package e.b.b.a.c.e;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.y;

public final class p1 {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f7499b;

    /* renamed from: c  reason: collision with root package name */
    private String f7500c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ k1 f7501d;

    public p1(k1 k1Var, String str, String str2) {
        this.f7501d = k1Var;
        y.b(str);
        this.a = str;
    }

    public final String a() {
        if (!this.f7499b) {
            this.f7499b = true;
            this.f7500c = this.f7501d.F().getString(this.a, null);
        }
        return this.f7500c;
    }

    public final void a(String str) {
        if (!s5.d(str, this.f7500c)) {
            SharedPreferences.Editor edit = this.f7501d.F().edit();
            edit.putString(this.a, str);
            edit.apply();
            this.f7500c = str;
        }
    }
}
