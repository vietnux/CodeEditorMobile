package e.b.b.a.c.e;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.y;

public final class m1 {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7425b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7426c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7427d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ k1 f7428e;

    public m1(k1 k1Var, String str, boolean z) {
        this.f7428e = k1Var;
        y.b(str);
        this.a = str;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.f7428e.F().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.f7427d = z;
    }

    public final boolean a() {
        if (!this.f7426c) {
            this.f7426c = true;
            this.f7427d = this.f7428e.F().getBoolean(this.a, this.f7425b);
        }
        return this.f7427d;
    }
}
