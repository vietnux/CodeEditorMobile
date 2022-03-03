package e.b.b.a.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;

public class i extends a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* renamed from: b  reason: collision with root package name */
    private final int f7785b;

    /* renamed from: c  reason: collision with root package name */
    private final b f7786c;

    /* renamed from: d  reason: collision with root package name */
    private final b0 f7787d;

    public i(int i2) {
        this(new b(i2, null), null);
    }

    i(int i2, b bVar, b0 b0Var) {
        this.f7785b = i2;
        this.f7786c = bVar;
        this.f7787d = b0Var;
    }

    public i(b bVar, b0 b0Var) {
        this(1, bVar, b0Var);
    }

    public b t() {
        return this.f7786c;
    }

    public b0 u() {
        return this.f7787d;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, this.f7785b);
        c.a(parcel, 2, (Parcelable) t(), i2, false);
        c.a(parcel, 3, (Parcelable) u(), i2, false);
        c.a(parcel, a);
    }
}
