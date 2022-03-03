package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class p {
    private static String a;

    /* renamed from: b  reason: collision with root package name */
    private static int f3723b;

    private static BufferedReader a(String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static String a() {
        if (a == null) {
            a = a(b());
        }
        return a;
    }

    private static String a(int i2) {
        BufferedReader bufferedReader;
        Throwable th;
        String str = null;
        str = null;
        BufferedReader bufferedReader2 = null;
        if (i2 <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i2);
            sb.append("/cmdline");
            bufferedReader = a(sb.toString());
            try {
                str = bufferedReader.readLine().trim();
            } catch (IOException unused) {
            } catch (Throwable th2) {
                bufferedReader2 = bufferedReader;
                th = th2;
                l.a(bufferedReader2);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            l.a(bufferedReader2);
            throw th;
        }
        l.a(bufferedReader);
        return str;
    }

    private static int b() {
        if (f3723b == 0) {
            f3723b = Process.myPid();
        }
        return f3723b;
    }
}
