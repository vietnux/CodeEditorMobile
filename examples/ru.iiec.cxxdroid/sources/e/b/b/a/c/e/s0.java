package e.b.b.a.c.e;

import android.os.Parcel;

public abstract class s0 extends m6 implements r0 {
    public s0() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.m6
    public final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        Object obj;
        switch (i2) {
            case 1:
                a((n0) n6.a(parcel, n0.CREATOR), (s) n6.a(parcel, s.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                a((p5) n6.a(parcel, p5.CREATOR), (s) n6.a(parcel, s.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                d((s) n6.a(parcel, s.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                a((n0) n6.a(parcel, n0.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                c((s) n6.a(parcel, s.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                obj = a((s) n6.a(parcel, s.CREATOR), n6.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(obj);
                return true;
            case 9:
                byte[] a = a((n0) n6.a(parcel, n0.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(a);
                return true;
            case 10:
                a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String b2 = b((s) n6.a(parcel, s.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(b2);
                return true;
            case 12:
                a((w) n6.a(parcel, w.CREATOR), (s) n6.a(parcel, s.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                a((w) n6.a(parcel, w.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                obj = a(parcel.readString(), parcel.readString(), n6.a(parcel), (s) n6.a(parcel, s.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(obj);
                return true;
            case 15:
                obj = a(parcel.readString(), parcel.readString(), parcel.readString(), n6.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(obj);
                return true;
            case 16:
                obj = a(parcel.readString(), parcel.readString(), (s) n6.a(parcel, s.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(obj);
                return true;
            case 17:
                obj = b(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(obj);
                return true;
            case 18:
                a((s) n6.a(parcel, s.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
