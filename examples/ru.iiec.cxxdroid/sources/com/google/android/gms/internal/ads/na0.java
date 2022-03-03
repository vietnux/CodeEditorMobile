package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.n.d;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;

@k2
public final class na0 extends a {
    public static final Parcelable.Creator<na0> CREATOR = new oa0();

    /* renamed from: b  reason: collision with root package name */
    public final int f5079b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5080c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5081d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5082e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5083f;

    /* renamed from: g  reason: collision with root package name */
    public final t70 f5084g;

    public na0(int i2, boolean z, int i3, boolean z2, int i4, t70 t70) {
        this.f5079b = i2;
        this.f5080c = z;
        this.f5081d = i3;
        this.f5082e = z2;
        this.f5083f = i4;
        this.f5084g = t70;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public na0(d dVar) {
        this(3, dVar.e(), dVar.b(), dVar.d(), dVar.a(), dVar.c() != null ? new t70(dVar.c()) : null);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, this.f5079b);
        c.a(parcel, 2, this.f5080c);
        c.a(parcel, 3, this.f5081d);
        c.a(parcel, 4, this.f5082e);
        c.a(parcel, 5, this.f5083f);
        c.a(parcel, 6, (Parcelable) this.f5084g, i2, false);
        c.a(parcel, a);
    }
}
