package e.b.b.a.d;

import android.os.Bundle;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import e.b.b.a.d.d.f;

public final class a {
    public static final a.g<f> a = new a.g<>();

    /* renamed from: b  reason: collision with root package name */
    public static final a.g<f> f7762b = new a.g<>();

    /* renamed from: c  reason: collision with root package name */
    public static final a.AbstractC0074a<f, c> f7763c = new e();

    /* renamed from: d  reason: collision with root package name */
    private static final a.AbstractC0074a<f, C0102a> f7764d = new f();

    /* renamed from: e.b.b.a.d.a$a  reason: collision with other inner class name */
    public static class C0102a implements a.d.c {
        private final Bundle a;

        public Bundle b() {
            return this.a;
        }
    }

    static {
        new Scope("profile");
        new Scope("email");
        new com.google.android.gms.common.api.a("SignIn.API", f7763c, a);
        new com.google.android.gms.common.api.a("SignIn.INTERNAL_API", f7764d, f7762b);
    }
}
