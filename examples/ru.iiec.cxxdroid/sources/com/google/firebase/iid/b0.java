package com.google.firebase.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import e.b.b.a.c.d.d;
import e.b.b.a.c.d.e;

public class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new c0();

    /* renamed from: b  reason: collision with root package name */
    private Messenger f6605b;

    /* renamed from: c  reason: collision with root package name */
    private d f6606c;

    public static final class a extends ClassLoader {
        /* access modifiers changed from: protected */
        @Override // java.lang.ClassLoader
        public final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (!FirebaseInstanceId.n()) {
                return b0.class;
            }
            Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            return b0.class;
        }
    }

    public b0(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f6605b = new Messenger(iBinder);
        } else {
            this.f6606c = e.a(iBinder);
        }
    }

    private final IBinder a() {
        Messenger messenger = this.f6605b;
        return messenger != null ? messenger.getBinder() : this.f6606c.asBinder();
    }

    public final void a(Message message) {
        Messenger messenger = this.f6605b;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f6606c.a(message);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((b0) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Messenger messenger = this.f6605b;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.f6606c.asBinder());
    }
}
