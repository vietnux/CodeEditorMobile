package com.google.android.gms.common.internal.f0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class b {

    public static class a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                int r1 = r1 + 41
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.f0.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static int a(int i2) {
        return i2 & 65535;
    }

    public static int a(Parcel parcel) {
        return parcel.readInt();
    }

    public static Bundle a(Parcel parcel, int i2) {
        int p = p(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + p);
        return readBundle;
    }

    public static <T extends Parcelable> T a(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int p = p(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + p);
        return createFromParcel;
    }

    private static void a(Parcel parcel, int i2, int i3) {
        int p = p(parcel, i2);
        if (p != i3) {
            String hexString = Integer.toHexString(p);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(p);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new a(sb.toString(), parcel);
        }
    }

    private static void a(Parcel parcel, int i2, int i3, int i4) {
        if (i3 != i4) {
            String hexString = Integer.toHexString(i3);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i4);
            sb.append(" got ");
            sb.append(i3);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new a(sb.toString(), parcel);
        }
    }

    public static int b(Parcel parcel) {
        int a2 = a(parcel);
        int p = p(parcel, a2);
        int dataPosition = parcel.dataPosition();
        if (a(a2) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(a2));
            throw new a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i2 = p + dataPosition;
        if (i2 >= dataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new a(sb.toString(), parcel);
    }

    public static byte[] b(Parcel parcel, int i2) {
        int p = p(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + p);
        return createByteArray;
    }

    public static <T> T[] b(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int p = p(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + p);
        return tArr;
    }

    public static ArrayList<Integer> c(Parcel parcel, int i2) {
        int p = p(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + p);
        return arrayList;
    }

    public static <T> ArrayList<T> c(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int p = p(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + p);
        return createTypedArrayList;
    }

    public static String d(Parcel parcel, int i2) {
        int p = p(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + p);
        return readString;
    }

    public static String[] e(Parcel parcel, int i2) {
        int p = p(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + p);
        return createStringArray;
    }

    public static ArrayList<String> f(Parcel parcel, int i2) {
        int p = p(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + p);
        return createStringArrayList;
    }

    public static void g(Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i2);
            throw new a(sb.toString(), parcel);
        }
    }

    public static boolean h(Parcel parcel, int i2) {
        a(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static Double i(Parcel parcel, int i2) {
        int p = p(parcel, i2);
        if (p == 0) {
            return null;
        }
        a(parcel, i2, p, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float j(Parcel parcel, int i2) {
        a(parcel, i2, 4);
        return parcel.readFloat();
    }

    public static Float k(Parcel parcel, int i2) {
        int p = p(parcel, i2);
        if (p == 0) {
            return null;
        }
        a(parcel, i2, p, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder l(Parcel parcel, int i2) {
        int p = p(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + p);
        return readStrongBinder;
    }

    public static int m(Parcel parcel, int i2) {
        a(parcel, i2, 4);
        return parcel.readInt();
    }

    public static long n(Parcel parcel, int i2) {
        a(parcel, i2, 8);
        return parcel.readLong();
    }

    public static Long o(Parcel parcel, int i2) {
        int p = p(parcel, i2);
        if (p == 0) {
            return null;
        }
        a(parcel, i2, p, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int p(Parcel parcel, int i2) {
        return (i2 & -65536) != -65536 ? (i2 >> 16) & 65535 : parcel.readInt();
    }

    public static void q(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + p(parcel, i2));
    }
}
