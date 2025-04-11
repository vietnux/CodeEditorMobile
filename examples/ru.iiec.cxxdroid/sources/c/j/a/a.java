package c.j.a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final a f2473c = new C0054a();

    /* renamed from: b  reason: collision with root package name */
    private final Parcelable f2474b;

    /* renamed from: c.j.a.a$a  reason: collision with other inner class name */
    class C0054a extends a {
        C0054a() {
            super((C0054a) null);
        }
    }

    class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f2473c;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    private a() {
        this.f2474b = null;
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f2474b = readParcelable == null ? f2473c : readParcelable;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f2474b = parcelable == f2473c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* synthetic */ a(C0054a aVar) {
        this();
    }

    public final Parcelable a() {
        return this.f2474b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f2474b, i2);
    }
}
