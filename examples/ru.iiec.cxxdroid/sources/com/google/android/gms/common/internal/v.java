package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.j;
import e.b.b.a.c.g.b;
import e.b.b.a.c.g.c;

public interface v extends IInterface {

    public static abstract class a extends b implements v {

        /* renamed from: com.google.android.gms.common.internal.v$a$a  reason: collision with other inner class name */
        public static class C0082a extends e.b.b.a.c.g.a implements v {
            C0082a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
            }

            @Override // com.google.android.gms.common.internal.v
            public boolean a(j jVar, e.b.b.a.b.a aVar) {
                Parcel M = M();
                c.a(M, jVar);
                c.a(M, aVar);
                Parcel a = a(5, M);
                boolean a2 = c.a(a);
                a.recycle();
                return a2;
            }
        }

        public static v a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
            return queryLocalInterface instanceof v ? (v) queryLocalInterface : new C0082a(iBinder);
        }
    }

    boolean a(j jVar, e.b.b.a.b.a aVar);
}
