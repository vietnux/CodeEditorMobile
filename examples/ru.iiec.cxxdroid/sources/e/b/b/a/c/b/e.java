package e.b.b.a.c.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;

public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new f();

    /* renamed from: b  reason: collision with root package name */
    private final int f7036b;

    /* renamed from: c  reason: collision with root package name */
    private final DataHolder f7037c;

    /* renamed from: d  reason: collision with root package name */
    private final long f7038d;

    /* renamed from: e  reason: collision with root package name */
    private final DataHolder f7039e;

    public e(int i2, DataHolder dataHolder, long j2, DataHolder dataHolder2) {
        this.f7036b = i2;
        this.f7037c = dataHolder;
        this.f7038d = j2;
        this.f7039e = dataHolder2;
    }

    public final long n() {
        return this.f7038d;
    }

    public final int t() {
        return this.f7036b;
    }

    public final DataHolder u() {
        return this.f7037c;
    }

    public final DataHolder v() {
        return this.f7039e;
    }

    public final void w() {
        DataHolder dataHolder = this.f7037c;
        if (dataHolder != null && !dataHolder.v()) {
            this.f7037c.close();
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, this.f7036b);
        c.a(parcel, 3, (Parcelable) this.f7037c, i2, false);
        c.a(parcel, 4, this.f7038d);
        c.a(parcel, 5, (Parcelable) this.f7039e, i2, false);
        c.a(parcel, a);
    }

    public final void x() {
        DataHolder dataHolder = this.f7039e;
        if (dataHolder != null && !dataHolder.v()) {
            this.f7039e.close();
        }
    }
}
