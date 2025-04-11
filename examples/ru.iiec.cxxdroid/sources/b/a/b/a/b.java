package b.a.b.a;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import b.a.b.a.a;

@SuppressLint({"BanParcelableUsage"})
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    final Handler f1774b = null;

    /* renamed from: c  reason: collision with root package name */
    a f1775c;

    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    /* renamed from: b.a.b.a.b$b  reason: collision with other inner class name */
    class BinderC0031b extends a.AbstractBinderC0029a {
        BinderC0031b() {
        }

        @Override // b.a.b.a.a
        public void a(int i2, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f1774b;
            if (handler != null) {
                handler.post(new c(i2, bundle));
            } else {
                bVar.a(i2, bundle);
            }
        }
    }

    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final int f1777b;

        /* renamed from: c  reason: collision with root package name */
        final Bundle f1778c;

        c(int i2, Bundle bundle) {
            this.f1777b = i2;
            this.f1778c = bundle;
        }

        public void run() {
            b.this.a(this.f1777b, this.f1778c);
        }
    }

    b(Parcel parcel) {
        this.f1775c = a.AbstractBinderC0029a.a(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    public void a(int i2, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            if (this.f1775c == null) {
                this.f1775c = new BinderC0031b();
            }
            parcel.writeStrongBinder(this.f1775c.asBinder());
        }
    }
}
