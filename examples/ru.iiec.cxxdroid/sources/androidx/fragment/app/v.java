package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    final String f1358b;

    /* renamed from: c  reason: collision with root package name */
    final String f1359c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f1360d;

    /* renamed from: e  reason: collision with root package name */
    final int f1361e;

    /* renamed from: f  reason: collision with root package name */
    final int f1362f;

    /* renamed from: g  reason: collision with root package name */
    final String f1363g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f1364h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f1365i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f1366j;

    /* renamed from: k  reason: collision with root package name */
    final Bundle f1367k;

    /* renamed from: l  reason: collision with root package name */
    final boolean f1368l;

    /* renamed from: m  reason: collision with root package name */
    final int f1369m;
    Bundle n;

    class a implements Parcelable.Creator<v> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public v createFromParcel(Parcel parcel) {
            return new v(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public v[] newArray(int i2) {
            return new v[i2];
        }
    }

    v(Parcel parcel) {
        this.f1358b = parcel.readString();
        this.f1359c = parcel.readString();
        boolean z = true;
        this.f1360d = parcel.readInt() != 0;
        this.f1361e = parcel.readInt();
        this.f1362f = parcel.readInt();
        this.f1363g = parcel.readString();
        this.f1364h = parcel.readInt() != 0;
        this.f1365i = parcel.readInt() != 0;
        this.f1366j = parcel.readInt() != 0;
        this.f1367k = parcel.readBundle();
        this.f1368l = parcel.readInt() == 0 ? false : z;
        this.n = parcel.readBundle();
        this.f1369m = parcel.readInt();
    }

    v(Fragment fragment) {
        this.f1358b = fragment.getClass().getName();
        this.f1359c = fragment.f1165g;
        this.f1360d = fragment.o;
        this.f1361e = fragment.x;
        this.f1362f = fragment.y;
        this.f1363g = fragment.z;
        this.f1364h = fragment.C;
        this.f1365i = fragment.n;
        this.f1366j = fragment.B;
        this.f1367k = fragment.f1166h;
        this.f1368l = fragment.A;
        this.f1369m = fragment.R.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1358b);
        sb.append(" (");
        sb.append(this.f1359c);
        sb.append(")}:");
        if (this.f1360d) {
            sb.append(" fromLayout");
        }
        if (this.f1362f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1362f));
        }
        String str = this.f1363g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f1363g);
        }
        if (this.f1364h) {
            sb.append(" retainInstance");
        }
        if (this.f1365i) {
            sb.append(" removing");
        }
        if (this.f1366j) {
            sb.append(" detached");
        }
        if (this.f1368l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1358b);
        parcel.writeString(this.f1359c);
        parcel.writeInt(this.f1360d ? 1 : 0);
        parcel.writeInt(this.f1361e);
        parcel.writeInt(this.f1362f);
        parcel.writeString(this.f1363g);
        parcel.writeInt(this.f1364h ? 1 : 0);
        parcel.writeInt(this.f1365i ? 1 : 0);
        parcel.writeInt(this.f1366j ? 1 : 0);
        parcel.writeBundle(this.f1367k);
        parcel.writeInt(this.f1368l ? 1 : 0);
        parcel.writeBundle(this.n);
        parcel.writeInt(this.f1369m);
    }
}
