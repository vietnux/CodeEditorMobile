package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.b.b.a.b.a;
import e.b.b.a.c.g.c;

public interface b extends IInterface {

    public static abstract class a extends e.b.b.a.c.g.b implements b {

        /* renamed from: com.google.android.gms.dynamite.b$a$a  reason: collision with other inner class name */
        public static class C0086a extends e.b.b.a.c.g.a implements b {
            C0086a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }

            @Override // com.google.android.gms.dynamite.b
            public e.b.b.a.b.a a(e.b.b.a.b.a aVar, String str, int i2, e.b.b.a.b.a aVar2) {
                Parcel M = M();
                c.a(M, aVar);
                M.writeString(str);
                M.writeInt(i2);
                c.a(M, aVar2);
                Parcel a = a(2, M);
                e.b.b.a.b.a a2 = a.AbstractBinderC0100a.a(a.readStrongBinder());
                a.recycle();
                return a2;
            }
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
            return queryLocalInterface instanceof b ? (b) queryLocalInterface : new C0086a(iBinder);
        }
    }

    e.b.b.a.b.a a(e.b.b.a.b.a aVar, String str, int i2, e.b.b.a.b.a aVar2);
}
