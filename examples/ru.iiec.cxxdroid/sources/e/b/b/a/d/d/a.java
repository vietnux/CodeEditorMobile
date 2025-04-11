package e.b.b.a.d.d;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.f0.c;

public class a extends com.google.android.gms.common.internal.f0.a implements j {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: b  reason: collision with root package name */
    private final int f7780b;

    /* renamed from: c  reason: collision with root package name */
    private int f7781c;

    /* renamed from: d  reason: collision with root package name */
    private Intent f7782d;

    public a() {
        this(0, null);
    }

    a(int i2, int i3, Intent intent) {
        this.f7780b = i2;
        this.f7781c = i3;
        this.f7782d = intent;
    }

    public a(int i2, Intent intent) {
        this(2, i2, intent);
    }

    @Override // com.google.android.gms.common.api.j
    public Status m() {
        return this.f7781c == 0 ? Status.f3460f : Status.f3462h;
    }

    public int t() {
        return this.f7781c;
    }

    public Intent u() {
        return this.f7782d;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, this.f7780b);
        c.a(parcel, 2, t());
        c.a(parcel, 3, (Parcelable) u(), i2, false);
        c.a(parcel, a);
    }
}
