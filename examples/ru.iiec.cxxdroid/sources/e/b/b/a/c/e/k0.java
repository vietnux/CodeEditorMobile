package e.b.b.a.c.e;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import java.util.Iterator;

public final class k0 extends a implements Iterable<String> {
    public static final Parcelable.Creator<k0> CREATOR = new m0();

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f7372b;

    k0(Bundle bundle) {
        this.f7372b = bundle;
    }

    /* access modifiers changed from: package-private */
    public final Object b(String str) {
        return this.f7372b.get(str);
    }

    /* access modifiers changed from: package-private */
    public final Long c(String str) {
        return Long.valueOf(this.f7372b.getLong(str));
    }

    /* access modifiers changed from: package-private */
    public final String d(String str) {
        return this.f7372b.getString(str);
    }

    /* access modifiers changed from: package-private */
    public final Double e(String str) {
        return Double.valueOf(this.f7372b.getDouble(str));
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new l0(this);
    }

    public final int size() {
        return this.f7372b.size();
    }

    public final Bundle t() {
        return new Bundle(this.f7372b);
    }

    public final String toString() {
        return this.f7372b.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 2, t(), false);
        c.a(parcel, a);
    }
}
