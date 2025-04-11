package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    private final int f6b;

    /* renamed from: c  reason: collision with root package name */
    private final MediaDescriptionCompat f7c;

    static class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public MediaBrowserCompat$MediaItem[] newArray(int i2) {
            return new MediaBrowserCompat$MediaItem[i2];
        }
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f6b = parcel.readInt();
        this.f7c = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{" + "mFlags=" + this.f6b + ", mDescription=" + this.f7c + '}';
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f6b);
        this.f7c.writeToParcel(parcel, i2);
    }
}
