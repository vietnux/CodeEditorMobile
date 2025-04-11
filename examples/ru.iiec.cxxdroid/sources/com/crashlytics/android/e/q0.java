package com.crashlytics.android.e;

import android.app.ActivityManager;
import f.a.a.a.c;
import f.a.a.a.n.b.p;
import java.util.List;
import java.util.Map;

class q0 {
    private static final d a = d.a("0");

    /* renamed from: b  reason: collision with root package name */
    private static final d f3026b = d.a("Unity");

    private static int a() {
        return g.b(1, a) + 0 + g.b(2, a) + g.b(3, 0L);
    }

    private static int a(int i2, d dVar, int i3, long j2, long j3, boolean z, Map<p.a, String> map, int i4, d dVar2, d dVar3) {
        int i5 = 0;
        int e2 = g.e(3, i2) + 0 + (dVar == null ? 0 : g.b(4, dVar)) + g.g(5, i3) + g.b(6, j2) + g.b(7, j3) + g.b(10, z);
        if (map != null) {
            for (Map.Entry<p.a, String> entry : map.entrySet()) {
                int a2 = a(entry.getKey(), entry.getValue());
                e2 += g.l(11) + g.j(a2) + a2;
            }
        }
        int g2 = e2 + g.g(12, i4) + (dVar2 == null ? 0 : g.b(13, dVar2));
        if (dVar3 != null) {
            i5 = g.b(14, dVar3);
        }
        return g2 + i5;
    }

    private static int a(long j2, String str, u0 u0Var, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i2, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i3, d dVar, d dVar2, Float f2, int i4, boolean z, long j3, long j4, d dVar3) {
        int b2 = g.b(1, j2) + 0 + g.b(2, d.a(str));
        int a2 = a(u0Var, thread, stackTraceElementArr, threadArr, list, i2, dVar, dVar2, map, runningAppProcessInfo, i3);
        int a3 = a(f2, i4, z, i3, j3, j4);
        int l2 = b2 + g.l(3) + g.j(a2) + a2 + g.l(5) + g.j(a3) + a3;
        if (dVar3 == null) {
            return l2;
        }
        int a4 = a(dVar3);
        return l2 + g.l(6) + g.j(a4) + a4;
    }

    private static int a(d dVar) {
        return g.b(1, dVar);
    }

    private static int a(d dVar, d dVar2) {
        int b2 = g.b(1, 0L) + 0 + g.b(2, 0L) + g.b(3, dVar);
        return dVar2 != null ? b2 + g.b(4, dVar2) : b2;
    }

    private static int a(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, int i2, d dVar6) {
        int b2 = b(dVar2);
        int b3 = g.b(1, dVar) + 0 + g.b(2, dVar3) + g.b(3, dVar4) + g.l(5) + g.j(b2) + b2 + g.b(6, dVar5);
        if (dVar6 != null) {
            b3 = b3 + g.b(8, f3026b) + g.b(9, dVar6);
        }
        return b3 + g.e(10, i2);
    }

    private static int a(d dVar, d dVar2, boolean z) {
        return g.e(1, 3) + 0 + g.b(2, dVar) + g.b(3, dVar2) + g.b(4, z);
    }

    private static int a(u0 u0Var, int i2, int i3) {
        int i4 = 0;
        int b2 = g.b(1, d.a(u0Var.f3034b)) + 0;
        String str = u0Var.a;
        if (str != null) {
            b2 += g.b(3, d.a(str));
        }
        int i5 = b2;
        for (StackTraceElement stackTraceElement : u0Var.f3035c) {
            int a2 = a(stackTraceElement, true);
            i5 += g.l(4) + g.j(a2) + a2;
        }
        u0 u0Var2 = u0Var.f3036d;
        if (u0Var2 == null) {
            return i5;
        }
        if (i2 < i3) {
            int a3 = a(u0Var2, i2 + 1, i3);
            return i5 + g.l(6) + g.j(a3) + a3;
        }
        while (u0Var2 != null) {
            u0Var2 = u0Var2.f3036d;
            i4++;
        }
        return i5 + g.g(7, i4);
    }

    private static int a(u0 u0Var, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i2, d dVar, d dVar2) {
        int a2 = a(thread, stackTraceElementArr, 4, true);
        int length = threadArr.length;
        int l2 = g.l(1) + g.j(a2) + a2 + 0;
        for (int i3 = 0; i3 < length; i3++) {
            int a3 = a(threadArr[i3], list.get(i3), 0, false);
            l2 += g.l(1) + g.j(a3) + a3;
        }
        int a4 = a(u0Var, 1, i2);
        int a5 = a();
        int a6 = a(dVar, dVar2);
        return l2 + g.l(2) + g.j(a4) + a4 + g.l(3) + g.j(a5) + a5 + g.l(3) + g.j(a6) + a6;
    }

    private static int a(u0 u0Var, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i2, d dVar, d dVar2, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i3) {
        int a2 = a(u0Var, thread, stackTraceElementArr, threadArr, list, i2, dVar, dVar2);
        int l2 = g.l(1) + g.j(a2) + a2;
        boolean z = false;
        int i4 = l2 + 0;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                int a3 = a(entry.getKey(), entry.getValue());
                i4 += g.l(2) + g.j(a3) + a3;
            }
        }
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance != 100) {
                z = true;
            }
            i4 += g.b(3, z);
        }
        return i4 + g.g(4, i3);
    }

    private static int a(p.a aVar, String str) {
        return g.e(1, aVar.f8430b) + g.b(2, d.a(str));
    }

    private static int a(Float f2, int i2, boolean z, int i3, long j2, long j3) {
        int i4 = 0;
        if (f2 != null) {
            i4 = 0 + g.b(1, f2.floatValue());
        }
        return i4 + g.f(2, i2) + g.b(3, z) + g.g(4, i3) + g.b(5, j2) + g.b(6, j3);
    }

    private static int a(StackTraceElement stackTraceElement, boolean z) {
        int i2 = 0;
        long max = stackTraceElement.isNativeMethod() ? (long) Math.max(stackTraceElement.getLineNumber(), 0) : 0;
        int b2 = g.b(1, max) + 0 + g.b(2, d.a(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            b2 += g.b(3, d.a(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            b2 += g.b(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i2 = 2;
        }
        return b2 + g.g(5, i2);
    }

    private static int a(String str, String str2) {
        int b2 = g.b(1, d.a(str));
        if (str2 == null) {
            str2 = "";
        }
        return b2 + g.b(2, d.a(str2));
    }

    private static int a(Thread thread, StackTraceElement[] stackTraceElementArr, int i2, boolean z) {
        int b2 = g.b(1, d.a(thread.getName())) + g.g(2, i2);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            int a2 = a(stackTraceElement, z);
            b2 += g.l(3) + g.j(a2) + a2;
        }
        return b2;
    }

    private static d a(String str) {
        if (str == null) {
            return null;
        }
        return d.a(str);
    }

    private static void a(g gVar, int i2, StackTraceElement stackTraceElement, boolean z) {
        gVar.c(i2, 2);
        gVar.e(a(stackTraceElement, z));
        gVar.a(1, stackTraceElement.isNativeMethod() ? (long) Math.max(stackTraceElement.getLineNumber(), 0) : 0);
        gVar.a(2, d.a(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            gVar.a(3, d.a(stackTraceElement.getFileName()));
        }
        int i3 = 4;
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            gVar.a(4, (long) stackTraceElement.getLineNumber());
        }
        if (!z) {
            i3 = 0;
        }
        gVar.d(5, i3);
    }

    public static void a(g gVar, int i2, String str, int i3, long j2, long j3, boolean z, Map<p.a, String> map, int i4, String str2, String str3) {
        d a2 = a(str);
        d a3 = a(str3);
        d a4 = a(str2);
        gVar.c(9, 2);
        gVar.e(a(i2, a2, i3, j2, j3, z, map, i4, a4, a3));
        gVar.a(3, i2);
        gVar.a(4, a2);
        gVar.d(5, i3);
        gVar.a(6, j2);
        gVar.a(7, j3);
        gVar.a(10, z);
        for (Map.Entry<p.a, String> entry : map.entrySet()) {
            gVar.c(11, 2);
            gVar.e(a(entry.getKey(), entry.getValue()));
            gVar.a(1, entry.getKey().f8430b);
            gVar.a(2, d.a(entry.getValue()));
        }
        gVar.d(12, i4);
        if (a4 != null) {
            gVar.a(13, a4);
        }
        if (a3 != null) {
            gVar.a(14, a3);
        }
    }

    public static void a(g gVar, long j2, String str, u0 u0Var, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, Map<String, String> map, a0 a0Var, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2, String str2, String str3, Float f2, int i3, boolean z, long j3, long j4) {
        d a2 = d.a(str2);
        d a3 = str3 == null ? null : d.a(str3.replace("-", ""));
        d b2 = a0Var.b();
        if (b2 == null) {
            c.g().e("CrashlyticsCore", "No log data to include with this event.");
        }
        a0Var.a();
        gVar.c(10, 2);
        gVar.e(a(j2, str, u0Var, thread, stackTraceElementArr, threadArr, list, 8, map, runningAppProcessInfo, i2, a2, a3, f2, i3, z, j3, j4, b2));
        gVar.a(1, j2);
        gVar.a(2, d.a(str));
        a(gVar, u0Var, thread, stackTraceElementArr, threadArr, list, 8, a2, a3, map, runningAppProcessInfo, i2);
        a(gVar, f2, i3, z, i2, j3, j4);
        a(gVar, b2);
    }

    private static void a(g gVar, d dVar) {
        if (dVar != null) {
            gVar.c(6, 2);
            gVar.e(a(dVar));
            gVar.a(1, dVar);
        }
    }

    private static void a(g gVar, u0 u0Var, int i2, int i3, int i4) {
        gVar.c(i4, 2);
        gVar.e(a(u0Var, 1, i3));
        gVar.a(1, d.a(u0Var.f3034b));
        String str = u0Var.a;
        if (str != null) {
            gVar.a(3, d.a(str));
        }
        int i5 = 0;
        for (StackTraceElement stackTraceElement : u0Var.f3035c) {
            a(gVar, 4, stackTraceElement, true);
        }
        u0 u0Var2 = u0Var.f3036d;
        if (u0Var2 == null) {
            return;
        }
        if (i2 < i3) {
            a(gVar, u0Var2, i2 + 1, i3, 6);
            return;
        }
        while (u0Var2 != null) {
            u0Var2 = u0Var2.f3036d;
            i5++;
        }
        gVar.d(7, i5);
    }

    private static void a(g gVar, u0 u0Var, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i2, d dVar, d dVar2) {
        gVar.c(1, 2);
        gVar.e(a(u0Var, thread, stackTraceElementArr, threadArr, list, i2, dVar, dVar2));
        a(gVar, thread, stackTraceElementArr, 4, true);
        int length = threadArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            a(gVar, threadArr[i3], list.get(i3), 0, false);
        }
        a(gVar, u0Var, 1, i2, 2);
        gVar.c(3, 2);
        gVar.e(a());
        gVar.a(1, a);
        gVar.a(2, a);
        gVar.a(3, 0L);
        gVar.c(4, 2);
        gVar.e(a(dVar, dVar2));
        gVar.a(1, 0L);
        gVar.a(2, 0L);
        gVar.a(3, dVar);
        if (dVar2 != null) {
            gVar.a(4, dVar2);
        }
    }

    private static void a(g gVar, u0 u0Var, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i2, d dVar, d dVar2, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i3) {
        gVar.c(3, 2);
        gVar.e(a(u0Var, thread, stackTraceElementArr, threadArr, list, i2, dVar, dVar2, map, runningAppProcessInfo, i3));
        a(gVar, u0Var, thread, stackTraceElementArr, threadArr, list, i2, dVar, dVar2);
        if (map != null && !map.isEmpty()) {
            a(gVar, map);
        }
        if (runningAppProcessInfo != null) {
            gVar.a(3, runningAppProcessInfo.importance != 100);
        }
        gVar.d(4, i3);
    }

    private static void a(g gVar, Float f2, int i2, boolean z, int i3, long j2, long j3) {
        gVar.c(5, 2);
        gVar.e(a(f2, i2, z, i3, j2, j3));
        if (f2 != null) {
            gVar.a(1, f2.floatValue());
        }
        gVar.b(2, i2);
        gVar.a(3, z);
        gVar.d(4, i3);
        gVar.a(5, j2);
        gVar.a(6, j3);
    }

    public static void a(g gVar, String str, String str2, long j2) {
        gVar.a(1, d.a(str2));
        gVar.a(2, d.a(str));
        gVar.a(3, j2);
    }

    public static void a(g gVar, String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        d a2 = d.a(str);
        d a3 = a(str2);
        d a4 = a(str3);
        int b2 = g.b(1, a2) + 0;
        if (str2 != null) {
            b2 += g.b(2, a3);
        }
        if (str3 != null) {
            b2 += g.b(3, a4);
        }
        gVar.c(6, 2);
        gVar.e(b2);
        gVar.a(1, a2);
        if (str2 != null) {
            gVar.a(2, a3);
        }
        if (str3 != null) {
            gVar.a(3, a4);
        }
    }

    public static void a(g gVar, String str, String str2, String str3, String str4, String str5, int i2, String str6) {
        d a2 = d.a(str);
        d a3 = d.a(str2);
        d a4 = d.a(str3);
        d a5 = d.a(str4);
        d a6 = d.a(str5);
        d a7 = str6 != null ? d.a(str6) : null;
        gVar.c(7, 2);
        gVar.e(a(a2, a3, a4, a5, a6, i2, a7));
        gVar.a(1, a2);
        gVar.a(2, a4);
        gVar.a(3, a5);
        gVar.c(5, 2);
        gVar.e(b(a3));
        gVar.a(1, a3);
        gVar.a(6, a6);
        if (a7 != null) {
            gVar.a(8, f3026b);
            gVar.a(9, a7);
        }
        gVar.a(10, i2);
    }

    public static void a(g gVar, String str, String str2, boolean z) {
        d a2 = d.a(str);
        d a3 = d.a(str2);
        gVar.c(8, 2);
        gVar.e(a(a2, a3, z));
        gVar.a(1, 3);
        gVar.a(2, a2);
        gVar.a(3, a3);
        gVar.a(4, z);
    }

    private static void a(g gVar, Thread thread, StackTraceElement[] stackTraceElementArr, int i2, boolean z) {
        gVar.c(1, 2);
        gVar.e(a(thread, stackTraceElementArr, i2, z));
        gVar.a(1, d.a(thread.getName()));
        gVar.d(2, i2);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            a(gVar, 3, stackTraceElement, z);
        }
    }

    private static void a(g gVar, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            gVar.c(2, 2);
            gVar.e(a(entry.getKey(), entry.getValue()));
            gVar.a(1, d.a(entry.getKey()));
            String value = entry.getValue();
            if (value == null) {
                value = "";
            }
            gVar.a(2, d.a(value));
        }
    }

    private static int b(d dVar) {
        return g.b(1, dVar) + 0;
    }
}
