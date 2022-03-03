package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class e4 {
    private static String a = "Volley";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f4172b = Log.isLoggable("Volley", 2);

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final boolean f4173c = e4.f4172b;
        private final List<f5> a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private boolean f4174b = false;

        a() {
        }

        public final synchronized void a(String str) {
            long j2;
            this.f4174b = true;
            if (this.a.size() == 0) {
                j2 = 0;
            } else {
                j2 = this.a.get(this.a.size() - 1).f4281c - this.a.get(0).f4281c;
            }
            if (j2 > 0) {
                long j3 = this.a.get(0).f4281c;
                e4.a("(%-4d ms) %s", Long.valueOf(j2), str);
                for (f5 f5Var : this.a) {
                    long j4 = f5Var.f4281c;
                    e4.a("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(f5Var.f4280b), f5Var.a);
                    j3 = j4;
                }
            }
        }

        public final synchronized void a(String str, long j2) {
            if (!this.f4174b) {
                this.a.add(new f5(str, j2, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            if (!this.f4174b) {
                a("Request on the loose");
                e4.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    public static void a(String str, Object... objArr) {
        Log.d(a, d(str, objArr));
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e(a, d(str, objArr), th);
    }

    public static void b(String str, Object... objArr) {
        Log.e(a, d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        if (f4172b) {
            Log.v(a, d(str, objArr));
        }
    }

    private static String d(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i2 = 2;
        while (true) {
            if (i2 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i2].getClass().equals(e4.class)) {
                String className = stackTrace[i2].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i2].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length());
                sb.append(substring2);
                sb.append(".");
                sb.append(methodName);
                str2 = sb.toString();
                break;
            } else {
                i2++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }
}
