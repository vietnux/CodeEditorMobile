package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public int f41b;

    /* renamed from: c  reason: collision with root package name */
    public int f42c;

    /* renamed from: d  reason: collision with root package name */
    public int f43d;

    /* renamed from: e  reason: collision with root package name */
    public int f44e;

    /* renamed from: f  reason: collision with root package name */
    public int f45f;

    static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo[] newArray(int i2) {
            return new ParcelableVolumeInfo[i2];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f41b = parcel.readInt();
        this.f43d = parcel.readInt();
        this.f44e = parcel.readInt();
        this.f45f = parcel.readInt();
        this.f42c = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f41b);
        parcel.writeInt(this.f43d);
        parcel.writeInt(this.f44e);
        parcel.writeInt(this.f45f);
        parcel.writeInt(this.f42c);
    }
}
