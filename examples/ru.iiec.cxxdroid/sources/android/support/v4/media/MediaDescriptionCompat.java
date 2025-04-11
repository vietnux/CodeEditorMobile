package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import android.support.v4.media.e;
import android.text.TextUtils;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    private final String f11b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence f12c;

    /* renamed from: d  reason: collision with root package name */
    private final CharSequence f13d;

    /* renamed from: e  reason: collision with root package name */
    private final CharSequence f14e;

    /* renamed from: f  reason: collision with root package name */
    private final Bitmap f15f;

    /* renamed from: g  reason: collision with root package name */
    private final Uri f16g;

    /* renamed from: h  reason: collision with root package name */
    private final Bundle f17h;

    /* renamed from: i  reason: collision with root package name */
    private final Uri f18i;

    /* renamed from: j  reason: collision with root package name */
    private Object f19j;

    static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.a(d.a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i2) {
            return new MediaDescriptionCompat[i2];
        }
    }

    public static final class b {
        private String a;

        /* renamed from: b  reason: collision with root package name */
        private CharSequence f20b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f21c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f22d;

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f23e;

        /* renamed from: f  reason: collision with root package name */
        private Uri f24f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f25g;

        /* renamed from: h  reason: collision with root package name */
        private Uri f26h;

        public b a(Bitmap bitmap) {
            this.f23e = bitmap;
            return this;
        }

        public b a(Uri uri) {
            this.f24f = uri;
            return this;
        }

        public b a(Bundle bundle) {
            this.f25g = bundle;
            return this;
        }

        public b a(CharSequence charSequence) {
            this.f22d = charSequence;
            return this;
        }

        public b a(String str) {
            this.a = str;
            return this;
        }

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.a, this.f20b, this.f21c, this.f22d, this.f23e, this.f24f, this.f25g, this.f26h);
        }

        public b b(Uri uri) {
            this.f26h = uri;
            return this;
        }

        public b b(CharSequence charSequence) {
            this.f21c = charSequence;
            return this;
        }

        public b c(CharSequence charSequence) {
            this.f20b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f11b = parcel.readString();
        this.f12c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f13d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f14e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f15f = (Bitmap) parcel.readParcelable(classLoader);
        this.f16g = (Uri) parcel.readParcelable(classLoader);
        this.f17h = parcel.readBundle(classLoader);
        this.f18i = (Uri) parcel.readParcelable(classLoader);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f11b = str;
        this.f12c = charSequence;
        this.f13d = charSequence2;
        this.f14e = charSequence3;
        this.f15f = bitmap;
        this.f16g = uri;
        this.f17h = bundle;
        this.f18i = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r8) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Object a() {
        if (this.f19j != null || Build.VERSION.SDK_INT < 21) {
            return this.f19j;
        }
        Object a2 = d.a.a();
        d.a.a(a2, this.f11b);
        d.a.c(a2, this.f12c);
        d.a.b(a2, this.f13d);
        d.a.a(a2, this.f14e);
        d.a.a(a2, this.f15f);
        d.a.a(a2, this.f16g);
        Bundle bundle = this.f17h;
        if (Build.VERSION.SDK_INT < 23 && this.f18i != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f18i);
        }
        d.a.a(a2, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            e.a.a(a2, this.f18i);
        }
        this.f19j = d.a.a(a2);
        return this.f19j;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f12c) + ", " + ((Object) this.f13d) + ", " + ((Object) this.f14e);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f11b);
            TextUtils.writeToParcel(this.f12c, parcel, i2);
            TextUtils.writeToParcel(this.f13d, parcel, i2);
            TextUtils.writeToParcel(this.f14e, parcel, i2);
            parcel.writeParcelable(this.f15f, i2);
            parcel.writeParcelable(this.f16g, i2);
            parcel.writeBundle(this.f17h);
            parcel.writeParcelable(this.f18i, i2);
            return;
        }
        d.a(a(), parcel, i2);
    }
}
