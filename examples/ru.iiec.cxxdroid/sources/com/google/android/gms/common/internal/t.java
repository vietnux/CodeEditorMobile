package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.b.b.a.c.g.b;
import e.b.b.a.c.g.c;

public interface t extends IInterface {

    public static abstract class a extends b implements t {
        public a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* access modifiers changed from: protected */
        @Override // e.b.b.a.c.g.b
        public boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.a(parcel, Bundle.CREATOR));
            } else if (i2 == 2) {
                c(parcel.readInt(), (Bundle) c.a(parcel, Bundle.CREATOR));
            } else if (i2 != 3) {
                return false;
            } else {
                a(parcel.readInt(), parcel.readStrongBinder(), (g) c.a(parcel, g.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void a(int i2, IBinder iBinder, Bundle bundle);

    void a(int i2, IBinder iBinder, g gVar);

    void c(int i2, Bundle bundle);
}
