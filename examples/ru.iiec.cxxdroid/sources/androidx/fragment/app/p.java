package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.n;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    ArrayList<v> f1337b;

    /* renamed from: c  reason: collision with root package name */
    ArrayList<String> f1338c;

    /* renamed from: d  reason: collision with root package name */
    b[] f1339d;

    /* renamed from: e  reason: collision with root package name */
    int f1340e;

    /* renamed from: f  reason: collision with root package name */
    String f1341f = null;

    /* renamed from: g  reason: collision with root package name */
    ArrayList<String> f1342g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    ArrayList<Bundle> f1343h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    ArrayList<n.C0020n> f1344i;

    class a implements Parcelable.Creator<p> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public p[] newArray(int i2) {
            return new p[i2];
        }
    }

    public p() {
    }

    public p(Parcel parcel) {
        this.f1337b = parcel.createTypedArrayList(v.CREATOR);
        this.f1338c = parcel.createStringArrayList();
        this.f1339d = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f1340e = parcel.readInt();
        this.f1341f = parcel.readString();
        this.f1342g = parcel.createStringArrayList();
        this.f1343h = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f1344i = parcel.createTypedArrayList(n.C0020n.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f1337b);
        parcel.writeStringList(this.f1338c);
        parcel.writeTypedArray(this.f1339d, i2);
        parcel.writeInt(this.f1340e);
        parcel.writeString(this.f1341f);
        parcel.writeStringList(this.f1342g);
        parcel.writeTypedList(this.f1343h);
        parcel.writeTypedList(this.f1344i);
    }
}
