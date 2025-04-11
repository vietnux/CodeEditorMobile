package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    private final IntentSender f107b;

    /* renamed from: c  reason: collision with root package name */
    private final Intent f108c;

    /* renamed from: d  reason: collision with root package name */
    private final int f109d;

    /* renamed from: e  reason: collision with root package name */
    private final int f110e;

    class a implements Parcelable.Creator<g> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public g[] newArray(int i2) {
            return new g[i2];
        }
    }

    public static final class b {
        private IntentSender a;

        /* renamed from: b  reason: collision with root package name */
        private Intent f111b;

        /* renamed from: c  reason: collision with root package name */
        private int f112c;

        /* renamed from: d  reason: collision with root package name */
        private int f113d;

        public b(IntentSender intentSender) {
            this.a = intentSender;
        }

        public b a(int i2, int i3) {
            this.f113d = i2;
            this.f112c = i3;
            return this;
        }

        public b a(Intent intent) {
            this.f111b = intent;
            return this;
        }

        public g a() {
            return new g(this.a, this.f111b, this.f112c, this.f113d);
        }
    }

    g(IntentSender intentSender, Intent intent, int i2, int i3) {
        this.f107b = intentSender;
        this.f108c = intent;
        this.f109d = i2;
        this.f110e = i3;
    }

    g(Parcel parcel) {
        this.f107b = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f108c = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f109d = parcel.readInt();
        this.f110e = parcel.readInt();
    }

    public Intent a() {
        return this.f108c;
    }

    public int b() {
        return this.f109d;
    }

    public int c() {
        return this.f110e;
    }

    public IntentSender d() {
        return this.f107b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f107b, i2);
        parcel.writeParcelable(this.f108c, i2);
        parcel.writeInt(this.f109d);
        parcel.writeInt(this.f110e);
    }
}
