package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0004a();

    /* renamed from: b  reason: collision with root package name */
    private final int f93b;

    /* renamed from: c  reason: collision with root package name */
    private final Intent f94c;

    /* renamed from: androidx.activity.result.a$a  reason: collision with other inner class name */
    class C0004a implements Parcelable.Creator<a> {
        C0004a() {
        }

        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    public a(int i2, Intent intent) {
        this.f93b = i2;
        this.f94c = intent;
    }

    a(Parcel parcel) {
        this.f93b = parcel.readInt();
        this.f94c = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public static String a(int i2) {
        return i2 != -1 ? i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public Intent a() {
        return this.f94c;
    }

    public int b() {
        return this.f93b;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + a(this.f93b) + ", data=" + this.f94c + '}';
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f93b);
        parcel.writeInt(this.f94c == null ? 0 : 1);
        Intent intent = this.f94c;
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }
}
