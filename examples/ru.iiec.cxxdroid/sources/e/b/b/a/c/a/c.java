package e.b.b.a.c.a;

import android.os.Parcel;

public class c {
    static {
        c.class.getClassLoader();
    }

    private c() {
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(1);
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
