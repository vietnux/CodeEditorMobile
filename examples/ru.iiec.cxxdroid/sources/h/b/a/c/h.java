package h.b.a.c;

import android.util.Log;

public class h {
    private static String a = "Tray";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f8705b = Log.isLoggable(a, 2);

    public static void a(String str) {
        if (str == null) {
            str = "";
        }
        Log.d(a, str);
    }

    public static void b(String str) {
        if (f8705b) {
            if (str == null) {
                str = "";
            }
            Log.v(a, str);
        }
    }

    public static void c(String str) {
        if (str == null) {
            str = "";
        }
        Log.w(a, str);
    }
}
