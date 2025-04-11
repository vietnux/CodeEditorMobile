package e.b.b.a.c.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.f0.a;
import java.util.List;

public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new d();

    /* renamed from: b  reason: collision with root package name */
    private final String f7019b;

    /* renamed from: c  reason: collision with root package name */
    private final long f7020c;

    /* renamed from: d  reason: collision with root package name */
    private final DataHolder f7021d;

    /* renamed from: e  reason: collision with root package name */
    private final String f7022e;

    /* renamed from: f  reason: collision with root package name */
    private final String f7023f;

    /* renamed from: g  reason: collision with root package name */
    private final String f7024g;

    /* renamed from: h  reason: collision with root package name */
    private final List<String> f7025h;

    /* renamed from: i  reason: collision with root package name */
    private final int f7026i;

    /* renamed from: j  reason: collision with root package name */
    private final List<u0> f7027j;

    /* renamed from: k  reason: collision with root package name */
    private final int f7028k;

    /* renamed from: l  reason: collision with root package name */
    private final int f7029l;

    public c(String str, long j2, DataHolder dataHolder, String str2, String str3, String str4, List<String> list, int i2, List<u0> list2, int i3, int i4) {
        this.f7019b = str;
        this.f7020c = j2;
        this.f7021d = dataHolder;
        this.f7022e = str2;
        this.f7023f = str3;
        this.f7024g = str4;
        this.f7025h = list;
        this.f7026i = i2;
        this.f7027j = list2;
        this.f7028k = i3;
        this.f7029l = i4;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = com.google.android.gms.common.internal.f0.c.a(parcel);
        com.google.android.gms.common.internal.f0.c.a(parcel, 2, this.f7019b, false);
        com.google.android.gms.common.internal.f0.c.a(parcel, 3, this.f7020c);
        com.google.android.gms.common.internal.f0.c.a(parcel, 4, (Parcelable) this.f7021d, i2, false);
        com.google.android.gms.common.internal.f0.c.a(parcel, 5, this.f7022e, false);
        com.google.android.gms.common.internal.f0.c.a(parcel, 6, this.f7023f, false);
        com.google.android.gms.common.internal.f0.c.a(parcel, 7, this.f7024g, false);
        com.google.android.gms.common.internal.f0.c.b(parcel, 8, this.f7025h, false);
        com.google.android.gms.common.internal.f0.c.a(parcel, 9, this.f7026i);
        com.google.android.gms.common.internal.f0.c.c(parcel, 10, this.f7027j, false);
        com.google.android.gms.common.internal.f0.c.a(parcel, 11, this.f7028k);
        com.google.android.gms.common.internal.f0.c.a(parcel, 12, this.f7029l);
        com.google.android.gms.common.internal.f0.c.a(parcel, a);
    }
}
