package qwe.qweqwe.texteditor;

import android.os.Debug;
import android.util.Log;

public class i0 {
    private static final boolean a = b0.c();

    public static void a(String str) {
        if (str.contains("no such file or directory") && str.contains("pch.h")) {
            if (Debug.isDebuggerConnected()) {
                Log.v("JAVASUCKS", "Java sucks way too much and doesn't even have a Debugger.Break();, please set a breakpoint at me");
                return;
            }
            throw new Error("Cannot live with this error");
        }
    }

    public static void a(String str, String str2) {
        if (a) {
            Log.d(str, str2);
            a(str2);
        }
    }

    public static void b(String str, String str2) {
        if (a) {
            Log.e(str, str2);
            a(str2);
        }
    }

    public static void c(String str, String str2) {
        if (a) {
            Log.v(str, str2);
            a(str2);
        }
    }
}
