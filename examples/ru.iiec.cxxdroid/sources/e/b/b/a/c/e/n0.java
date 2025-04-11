package e.b.b.a.c.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import com.google.android.gms.common.internal.y;

public final class n0 extends a {
    public static final Parcelable.Creator<n0> CREATOR = new o0();

    /* renamed from: b  reason: collision with root package name */
    public final String f7448b;

    /* renamed from: c  reason: collision with root package name */
    public final k0 f7449c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7450d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7451e;

    n0(n0 n0Var, long j2) {
        y.a(n0Var);
        this.f7448b = n0Var.f7448b;
        this.f7449c = n0Var.f7449c;
        this.f7450d = n0Var.f7450d;
        this.f7451e = j2;
    }

    public n0(String str, k0 k0Var, String str2, long j2) {
        this.f7448b = str;
        this.f7449c = k0Var;
        this.f7450d = str2;
        this.f7451e = j2;
    }

    public final String toString() {
        String str = this.f7450d;
        String str2 = this.f7448b;
        String valueOf = String.valueOf(this.f7449c);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, this.f7448b, false);
        c.a(parcel, 3, (Parcelable) this.f7449c, i2, false);
        c.a(parcel, 4, this.f7450d, false);
        c.a(parcel, 5, this.f7451e);
        c.a(parcel, a);
    }
}
