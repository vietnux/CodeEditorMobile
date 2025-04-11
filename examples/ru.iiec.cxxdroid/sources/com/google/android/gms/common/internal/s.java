package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.b.b.a.b.a;
import e.b.b.a.c.g.b;
import e.b.b.a.c.g.c;

public interface s extends IInterface {

    public static abstract class a extends b implements s {

        /* renamed from: com.google.android.gms.common.internal.s$a$a  reason: collision with other inner class name */
        public static class C0080a extends e.b.b.a.c.g.a implements s {
            C0080a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.ICertData");
            }

            @Override // com.google.android.gms.common.internal.s
            public int E0() {
                Parcel a = a(2, M());
                int readInt = a.readInt();
                a.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.common.internal.s
            public e.b.b.a.b.a l1() {
                Parcel a = a(1, M());
                e.b.b.a.b.a a2 = a.AbstractBinderC0100a.a(a.readStrongBinder());
                a.recycle();
                return a2;
            }
        }

        public a() {
            super("com.google.android.gms.common.internal.ICertData");
        }

        public static s a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
            return queryLocalInterface instanceof s ? (s) queryLocalInterface : new C0080a(iBinder);
        }

        /* access modifiers changed from: protected */
        @Override // e.b.b.a.c.g.b
        public boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                e.b.b.a.b.a l1 = l1();
                parcel2.writeNoException();
                c.a(parcel2, l1);
            } else if (i2 != 2) {
                return false;
            } else {
                int E0 = E0();
                parcel2.writeNoException();
                parcel2.writeInt(E0);
            }
            return true;
        }
    }

    int E0();

    e.b.b.a.b.a l1();
}
