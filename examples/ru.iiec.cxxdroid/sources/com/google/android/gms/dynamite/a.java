package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.b.b.a.b.a;
import e.b.b.a.c.g.b;
import e.b.b.a.c.g.c;

public interface a extends IInterface {

    /* renamed from: com.google.android.gms.dynamite.a$a  reason: collision with other inner class name */
    public static abstract class AbstractBinderC0084a extends b implements a {

        /* renamed from: com.google.android.gms.dynamite.a$a$a  reason: collision with other inner class name */
        public static class C0085a extends e.b.b.a.c.g.a implements a {
            C0085a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
            }

            @Override // com.google.android.gms.dynamite.a
            public int a(e.b.b.a.b.a aVar, String str, boolean z) {
                Parcel M = M();
                c.a(M, aVar);
                M.writeString(str);
                c.a(M, z);
                Parcel a = a(3, M);
                int readInt = a.readInt();
                a.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.dynamite.a
            public e.b.b.a.b.a a(e.b.b.a.b.a aVar, String str, int i2) {
                Parcel M = M();
                c.a(M, aVar);
                M.writeString(str);
                M.writeInt(i2);
                Parcel a = a(2, M);
                e.b.b.a.b.a a2 = a.AbstractBinderC0100a.a(a.readStrongBinder());
                a.recycle();
                return a2;
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new C0085a(iBinder);
        }
    }

    int a(e.b.b.a.b.a aVar, String str, boolean z);

    e.b.b.a.b.a a(e.b.b.a.b.a aVar, String str, int i2);
}
