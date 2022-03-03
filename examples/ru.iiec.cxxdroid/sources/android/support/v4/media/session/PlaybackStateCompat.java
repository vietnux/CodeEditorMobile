package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.h;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    final int f46b;

    /* renamed from: c  reason: collision with root package name */
    final long f47c;

    /* renamed from: d  reason: collision with root package name */
    final long f48d;

    /* renamed from: e  reason: collision with root package name */
    final float f49e;

    /* renamed from: f  reason: collision with root package name */
    final long f50f;

    /* renamed from: g  reason: collision with root package name */
    final int f51g;

    /* renamed from: h  reason: collision with root package name */
    final CharSequence f52h;

    /* renamed from: i  reason: collision with root package name */
    final long f53i;

    /* renamed from: j  reason: collision with root package name */
    List<CustomAction> f54j;

    /* renamed from: k  reason: collision with root package name */
    final long f55k;

    /* renamed from: l  reason: collision with root package name */
    final Bundle f56l;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        private final String f57b;

        /* renamed from: c  reason: collision with root package name */
        private final CharSequence f58c;

        /* renamed from: d  reason: collision with root package name */
        private final int f59d;

        /* renamed from: e  reason: collision with root package name */
        private final Bundle f60e;

        static class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public CustomAction[] newArray(int i2) {
                return new CustomAction[i2];
            }
        }

        CustomAction(Parcel parcel) {
            this.f57b = parcel.readString();
            this.f58c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f59d = parcel.readInt();
            this.f60e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i2, Bundle bundle) {
            this.f57b = str;
            this.f58c = charSequence;
            this.f59d = i2;
            this.f60e = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new CustomAction(h.a.a(obj), h.a.d(obj), h.a.c(obj), h.a.b(obj));
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f58c) + ", mIcon=" + this.f59d + ", mExtras=" + this.f60e;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f57b);
            TextUtils.writeToParcel(this.f58c, parcel, i2);
            parcel.writeInt(this.f59d);
            parcel.writeBundle(this.f60e);
        }
    }

    static class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat[] newArray(int i2) {
            return new PlaybackStateCompat[i2];
        }
    }

    PlaybackStateCompat(int i2, long j2, long j3, float f2, long j4, int i3, CharSequence charSequence, long j5, List<CustomAction> list, long j6, Bundle bundle) {
        this.f46b = i2;
        this.f47c = j2;
        this.f48d = j3;
        this.f49e = f2;
        this.f50f = j4;
        this.f51g = i3;
        this.f52h = charSequence;
        this.f53i = j5;
        this.f54j = new ArrayList(list);
        this.f55k = j6;
        this.f56l = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f46b = parcel.readInt();
        this.f47c = parcel.readLong();
        this.f49e = parcel.readFloat();
        this.f53i = parcel.readLong();
        this.f48d = parcel.readLong();
        this.f50f = parcel.readLong();
        this.f52h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f54j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f55k = parcel.readLong();
        this.f56l = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f51g = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> d2 = h.d(obj);
        if (d2 != null) {
            ArrayList arrayList2 = new ArrayList(d2.size());
            for (Object obj2 : d2) {
                arrayList2.add(CustomAction.a(obj2));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = i.a(obj);
        }
        return new PlaybackStateCompat(h.i(obj), h.h(obj), h.c(obj), h.g(obj), h.a(obj), 0, h.e(obj), h.f(obj), arrayList, h.b(obj), bundle);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f46b + ", position=" + this.f47c + ", buffered position=" + this.f48d + ", speed=" + this.f49e + ", updated=" + this.f53i + ", actions=" + this.f50f + ", error code=" + this.f51g + ", error message=" + this.f52h + ", custom actions=" + this.f54j + ", active item id=" + this.f55k + "}";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f46b);
        parcel.writeLong(this.f47c);
        parcel.writeFloat(this.f49e);
        parcel.writeLong(this.f53i);
        parcel.writeLong(this.f48d);
        parcel.writeLong(this.f50f);
        TextUtils.writeToParcel(this.f52h, parcel, i2);
        parcel.writeTypedList(this.f54j);
        parcel.writeLong(this.f55k);
        parcel.writeBundle(this.f56l);
        parcel.writeInt(this.f51g);
    }
}
