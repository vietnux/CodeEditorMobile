package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.y;
import java.util.ArrayList;
import java.util.LinkedList;

public final class g {
    private static final String[] a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: b  reason: collision with root package name */
    private static DropBoxManager f3714b = null;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f3715c = false;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f3716d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f3717e;

    /* renamed from: f  reason: collision with root package name */
    private static int f3718f = -1;

    /* renamed from: g  reason: collision with root package name */
    private static int f3719g = 0;

    /* renamed from: h  reason: collision with root package name */
    private static int f3720h = 0;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x014c */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0166 A[Catch:{ IOException -> 0x0171, all -> 0x016e }, LOOP:0: B:50:0x0160->B:52:0x0166, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x016a A[EDGE_INSN: B:53:0x016a->B:54:? ?: BREAK  , SYNTHETIC, Splitter:B:53:0x016a] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0186 A[SYNTHETIC, Splitter:B:67:0x0186] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.lang.String a(android.content.Context r7, java.lang.String r8, java.lang.String r9, int r10) {
        /*
        // Method dump skipped, instructions count: 403
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.g.a(android.content.Context, java.lang.String, java.lang.String, int):java.lang.String");
    }

    private static synchronized Throwable a(Throwable th) {
        Throwable th2;
        boolean z;
        synchronized (g.class) {
            LinkedList linkedList = new LinkedList();
            while (th != null) {
                linkedList.push(th);
                th = th.getCause();
            }
            th2 = null;
            z = false;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z2 = z;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    String className = stackTraceElement.getClassName();
                    String fileName = stackTraceElement.getFileName();
                    boolean z3 = !TextUtils.isEmpty(fileName) && fileName.startsWith(":com.google.android.gms");
                    z2 |= z3;
                    if (!z3 && !a(className)) {
                        stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                    }
                    arrayList.add(stackTraceElement);
                }
                th2 = th2 == null ? new Throwable("<filtered>") : new Throwable("<filtered>", th2);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                z = z2;
            }
        }
        if (!z) {
            return null;
        }
        return th2;
    }

    private static boolean a() {
        if (f3715c) {
            return f3716d;
        }
        return false;
    }

    private static synchronized boolean a(Context context, String str, String str2, int i2, Throwable th) {
        synchronized (g.class) {
            y.a(context);
            if (a()) {
                if (!r.a(str)) {
                    int hashCode = str.hashCode();
                    int hashCode2 = th == null ? f3720h : th.hashCode();
                    if (f3719g == hashCode && f3720h == hashCode2) {
                        return false;
                    }
                    f3719g = hashCode;
                    f3720h = hashCode2;
                    DropBoxManager dropBoxManager = f3714b != null ? f3714b : (DropBoxManager) context.getSystemService("dropbox");
                    if (dropBoxManager == null || !dropBoxManager.isTagEnabled("system_app_crash")) {
                        return false;
                    }
                    dropBoxManager.addText("system_app_crash", a(context, str, str2, i2));
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean a(Context context, Throwable th) {
        return a(context, th, 536870912);
    }

    public static boolean a(Context context, Throwable th, int i2) {
        boolean z;
        try {
            y.a(context);
            y.a(th);
            if (!a()) {
                return false;
            }
            if (b() || (th = a(th)) != null) {
                return a(context, Log.getStackTraceString(th), p.a(), i2, th);
            }
            return false;
        } catch (Exception e2) {
            try {
                z = b();
            } catch (Exception e3) {
                Log.e("CrashUtils", "Error determining which process we're running in!", e3);
                z = false;
            }
            if (!z) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e2);
                return false;
            }
            throw e2;
        }
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : a) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean b() {
        if (f3715c) {
            return f3717e;
        }
        return false;
    }
}
