package e.b.b.b.s;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c.e.g;

public class a extends c.j.a.a {
    public static final Parcelable.Creator<a> CREATOR = new C0106a();

    /* renamed from: d  reason: collision with root package name */
    public final g<String, Bundle> f7857d;

    /* renamed from: e.b.b.b.s.a$a  reason: collision with other inner class name */
    static class C0106a implements Parcelable.ClassLoaderCreator<a> {
        C0106a() {
        }

        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    private a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f7857d = new g<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f7857d.put(strArr[i2], bundleArr[i2]);
        }
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0106a aVar) {
        this(parcel, classLoader);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f7857d = new g<>();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f7857d + "}";
    }

    @Override // c.j.a.a
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        int size = this.f7857d.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i3 = 0; i3 < size; i3++) {
            strArr[i3] = this.f7857d.b(i3);
            bundleArr[i3] = this.f7857d.d(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
