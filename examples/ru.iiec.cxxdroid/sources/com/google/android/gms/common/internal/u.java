package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface u extends IInterface {

    public static abstract class a extends Binder implements u {

        /* access modifiers changed from: private */
        /* renamed from: com.google.android.gms.common.internal.u$a$a  reason: collision with other inner class name */
        public static class C0081a implements u {

            /* renamed from: b  reason: collision with root package name */
            private final IBinder f3697b;

            C0081a(IBinder iBinder) {
                this.f3697b = iBinder;
            }

            @Override // com.google.android.gms.common.internal.u
            public final void a(t tVar, j jVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(tVar != null ? tVar.asBinder() : null);
                    if (jVar != null) {
                        obtain.writeInt(1);
                        jVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3697b.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f3697b;
            }
        }

        public static u a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof u)) ? new C0081a(iBinder) : (u) queryLocalInterface;
        }
    }

    void a(t tVar, j jVar);
}
