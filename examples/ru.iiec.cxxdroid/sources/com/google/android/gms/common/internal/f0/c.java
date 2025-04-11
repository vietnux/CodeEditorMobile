package com.google.android.gms.common.internal.f0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class c {
    public static int a(Parcel parcel) {
        return b(parcel, 20293);
    }

    public static void a(Parcel parcel, int i2) {
        c(parcel, i2);
    }

    public static void a(Parcel parcel, int i2, float f2) {
        b(parcel, i2, 4);
        parcel.writeFloat(f2);
    }

    public static void a(Parcel parcel, int i2, int i3) {
        b(parcel, i2, 4);
        parcel.writeInt(i3);
    }

    public static void a(Parcel parcel, int i2, long j2) {
        b(parcel, i2, 8);
        parcel.writeLong(j2);
    }

    public static void a(Parcel parcel, int i2, Bundle bundle, boolean z) {
        if (bundle != null) {
            int b2 = b(parcel, i2);
            parcel.writeBundle(bundle);
            c(parcel, b2);
        } else if (z) {
            b(parcel, i2, 0);
        }
    }

    public static void a(Parcel parcel, int i2, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int b2 = b(parcel, i2);
            parcel.writeStrongBinder(iBinder);
            c(parcel, b2);
        } else if (z) {
            b(parcel, i2, 0);
        }
    }

    public static void a(Parcel parcel, int i2, Parcelable parcelable, int i3, boolean z) {
        if (parcelable != null) {
            int b2 = b(parcel, i2);
            parcelable.writeToParcel(parcel, i3);
            c(parcel, b2);
        } else if (z) {
            b(parcel, i2, 0);
        }
    }

    public static void a(Parcel parcel, int i2, Double d2, boolean z) {
        if (d2 != null) {
            b(parcel, i2, 8);
            parcel.writeDouble(d2.doubleValue());
        } else if (z) {
            b(parcel, i2, 0);
        }
    }

    public static void a(Parcel parcel, int i2, Float f2, boolean z) {
        if (f2 != null) {
            b(parcel, i2, 4);
            parcel.writeFloat(f2.floatValue());
        } else if (z) {
            b(parcel, i2, 0);
        }
    }

    public static void a(Parcel parcel, int i2, Long l2, boolean z) {
        if (l2 != null) {
            b(parcel, i2, 8);
            parcel.writeLong(l2.longValue());
        } else if (z) {
            b(parcel, i2, 0);
        }
    }

    public static void a(Parcel parcel, int i2, String str, boolean z) {
        if (str != null) {
            int b2 = b(parcel, i2);
            parcel.writeString(str);
            c(parcel, b2);
        } else if (z) {
            b(parcel, i2, 0);
        }
    }

    public static void a(Parcel parcel, int i2, List<Integer> list, boolean z) {
        if (list != null) {
            int b2 = b(parcel, i2);
            int size = list.size();
            parcel.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                parcel.writeInt(list.get(i3).intValue());
            }
            c(parcel, b2);
        } else if (z) {
            b(parcel, i2, 0);
        }
    }

    public static void a(Parcel parcel, int i2, boolean z) {
        b(parcel, i2, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void a(Parcel parcel, int i2, byte[] bArr, boolean z) {
        if (bArr != null) {
            int b2 = b(parcel, i2);
            parcel.writeByteArray(bArr);
            c(parcel, b2);
        } else if (z) {
            b(parcel, i2, 0);
        }
    }

    public static <T extends Parcelable> void a(Parcel parcel, int i2, T[] tArr, int i3, boolean z) {
        if (tArr != null) {
            int b2 = b(parcel, i2);
            int length = tArr.length;
            parcel.writeInt(length);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    a(parcel, t, i3);
                }
            }
            c(parcel, b2);
        } else if (z) {
            b(parcel, i2, 0);
        }
    }

    public static void a(Parcel parcel, int i2, String[] strArr, boolean z) {
        if (strArr != null) {
            int b2 = b(parcel, i2);
            parcel.writeStringArray(strArr);
            c(parcel, b2);
        } else if (z) {
            b(parcel, i2, 0);
        }
    }

    private static <T extends Parcelable> void a(Parcel parcel, T t, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i2);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    private static int b(Parcel parcel, int i2) {
        parcel.writeInt(i2 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void b(Parcel parcel, int i2, int i3) {
        if (i3 >= 65535) {
            parcel.writeInt(i2 | -65536);
            parcel.writeInt(i3);
            return;
        }
        parcel.writeInt(i2 | (i3 << 16));
    }

    public static void b(Parcel parcel, int i2, List<String> list, boolean z) {
        if (list != null) {
            int b2 = b(parcel, i2);
            parcel.writeStringList(list);
            c(parcel, b2);
        } else if (z) {
            b(parcel, i2, 0);
        }
    }

    private static void c(Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }

    public static <T extends Parcelable> void c(Parcel parcel, int i2, List<T> list, boolean z) {
        if (list != null) {
            int b2 = b(parcel, i2);
            int size = list.size();
            parcel.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                T t = list.get(i3);
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    a(parcel, t, 0);
                }
            }
            c(parcel, b2);
        } else if (z) {
            b(parcel, i2, 0);
        }
    }
}
