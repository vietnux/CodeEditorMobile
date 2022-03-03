package com.google.android.gms.internal.ads;

import android.util.Log;

@k2
public class qc {
    public static void a(String str) {
        if (a(6)) {
            Log.e("Ads", str);
        }
    }

    public static void a(String str, Throwable th) {
        if (a(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static boolean a(int i2) {
        return i2 >= 5 || Log.isLoggable("Ads", i2);
    }

    public static void b(String str) {
        if (a(3)) {
            Log.d("Ads", str);
        }
    }

    public static void b(String str, Throwable th) {
        if (a(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void c(String str) {
        if (a(4)) {
            Log.i("Ads", str);
        }
    }

    public static void c(String str, Throwable th) {
        if (a(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void d(String str) {
        if (a(5)) {
            Log.w("Ads", str);
        }
    }

    public static void d(String str, Throwable th) {
        if (a(5)) {
            String e2 = e(str);
            if (th != null) {
                c(e2, th);
            } else {
                d(e2);
            }
        }
    }

    private static String e(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    public static void f(String str) {
        d(str, null);
    }
}
