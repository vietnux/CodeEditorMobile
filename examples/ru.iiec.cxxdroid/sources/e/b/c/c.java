package e.b.c;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.r;

public final class c {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7871b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7872c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7873d;

    /* renamed from: e  reason: collision with root package name */
    private final String f7874e;

    /* renamed from: f  reason: collision with root package name */
    private final String f7875f;

    /* renamed from: g  reason: collision with root package name */
    private final String f7876g;

    private c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        y.b(!r.a(str), "ApplicationId must be set.");
        this.f7871b = str;
        this.a = str2;
        this.f7872c = str3;
        this.f7873d = str4;
        this.f7874e = str5;
        this.f7875f = str6;
        this.f7876g = str7;
    }

    public static c a(Context context) {
        e0 e0Var = new e0(context);
        String a2 = e0Var.a("google_app_id");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return new c(a2, e0Var.a("google_api_key"), e0Var.a("firebase_database_url"), e0Var.a("ga_trackingId"), e0Var.a("gcm_defaultSenderId"), e0Var.a("google_storage_bucket"), e0Var.a("project_id"));
    }

    public final String a() {
        return this.f7871b;
    }

    public final String b() {
        return this.f7874e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return x.a(this.f7871b, cVar.f7871b) && x.a(this.a, cVar.a) && x.a(this.f7872c, cVar.f7872c) && x.a(this.f7873d, cVar.f7873d) && x.a(this.f7874e, cVar.f7874e) && x.a(this.f7875f, cVar.f7875f) && x.a(this.f7876g, cVar.f7876g);
    }

    public final int hashCode() {
        return x.a(this.f7871b, this.a, this.f7872c, this.f7873d, this.f7874e, this.f7875f, this.f7876g);
    }

    public final String toString() {
        x.a a2 = x.a(this);
        a2.a("applicationId", this.f7871b);
        a2.a("apiKey", this.a);
        a2.a("databaseUrl", this.f7872c);
        a2.a("gcmSenderId", this.f7874e);
        a2.a("storageBucket", this.f7875f);
        a2.a("projectId", this.f7876g);
        return a2.toString();
    }
}
