package f.a.a.a.n.b;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import f.a.a.a.c;
import f.a.a.a.l;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class i {
    private static Boolean a;

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f8382b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c  reason: collision with root package name */
    private static long f8383c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static final Comparator<File> f8384d = new a();

    static class a implements Comparator<File> {
        a() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return (int) (file.lastModified() - file2.lastModified());
        }
    }

    enum b {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        

        /* renamed from: l  reason: collision with root package name */
        private static final Map<String, b> f8395l = new HashMap(4);

        static {
            f8395l.put("armeabi-v7a", ARMV7);
            f8395l.put("armeabi", ARMV6);
            f8395l.put("arm64-v8a", ARM64);
            f8395l.put("x86", X86_32);
        }

        static b h() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                c.g().e("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            b bVar = f8395l.get(str.toLowerCase(Locale.US));
            return bVar == null ? UNKNOWN : bVar;
        }
    }

    public static int a() {
        return b.h().ordinal();
    }

    public static int a(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, h(context));
    }

    public static int a(Context context, boolean z) {
        Float e2 = e(context);
        if (!z || e2 == null) {
            return 1;
        }
        if (((double) e2.floatValue()) >= 99.0d) {
            return 3;
        }
        return ((double) e2.floatValue()) < 99.0d ? 2 : 0;
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long a(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    static long a(String str, String str2, int i2) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i2);
    }

    public static ActivityManager.RunningAppProcessInfo a(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    public static String a(int i2) {
        switch (i2) {
            case 2:
                return "V";
            case 3:
                return "D";
            case 4:
                return "I";
            case 5:
                return "W";
            case 6:
                return "E";
            case 7:
                return "A";
            default:
                return "?";
        }
    }

    public static String a(File file, String str) {
        Throwable th;
        BufferedReader bufferedReader;
        Exception e2;
        String str2 = null;
        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file), 1024);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = Pattern.compile("\\s*:\\s*").split(readLine, 2);
                        if (split.length > 1 && split[0].equals(str)) {
                            str2 = split[1];
                            break;
                        }
                    } catch (Exception e3) {
                        e2 = e3;
                        try {
                            c.g().c("Fabric", "Error parsing " + file, e2);
                            a(bufferedReader, "Failed to close system file reader.");
                            return str2;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            } catch (Exception e4) {
                e2 = e4;
                bufferedReader = null;
                c.g().c("Fabric", "Error parsing " + file, e2);
                a(bufferedReader, "Failed to close system file reader.");
                return str2;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                a(bufferedReader, "Failed to close system file reader.");
                throw th;
            }
            a(bufferedReader, "Failed to close system file reader.");
        }
        return str2;
    }

    public static String a(InputStream inputStream) {
        return a(inputStream, "SHA-1");
    }

    private static String a(InputStream inputStream, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return a(instance.digest());
                }
                instance.update(bArr, 0, read);
            }
        } catch (Exception e2) {
            c.g().c("Fabric", "Could not calculate hash for app icon.", e2);
            return "";
        }
    }

    private static String a(String str, String str2) {
        return a(str.getBytes(), str2);
    }

    public static String a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = bArr[i2] & 255;
            int i4 = i2 * 2;
            char[] cArr2 = f8382b;
            cArr[i4] = cArr2[i3 >>> 4];
            cArr[i4 + 1] = cArr2[i3 & 15];
        }
        return new String(cArr);
    }

    private static String a(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return a(instance.digest());
        } catch (NoSuchAlgorithmException e2) {
            l g2 = c.g();
            g2.c("Fabric", "Could not create hashing algorithm: " + str + ", returning empty string.", e2);
            return "";
        }
    }

    public static String a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String str2 : arrayList) {
            sb.append(str2);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return c(sb2);
        }
        return null;
    }

    public static void a(Context context, int i2, String str, String str2) {
        if (k(context)) {
            c.g().a(i2, "Fabric", str2);
        }
    }

    public static void a(Context context, String str, Throwable th) {
        if (k(context)) {
            c.g().c("Fabric", str);
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                c.g().c("Fabric", str, e2);
            }
        }
    }

    public static void a(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (IOException e2) {
                c.g().c("Fabric", str, e2);
            }
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static boolean a(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static boolean a(Context context, String str, boolean z) {
        Resources resources;
        if (!(context == null || (resources = context.getResources()) == null)) {
            int a2 = a(context, str, "bool");
            if (a2 > 0) {
                return resources.getBoolean(a2);
            }
            int a3 = a(context, str, "string");
            if (a3 > 0) {
                return Boolean.parseBoolean(context.getString(a3));
            }
        }
        return z;
    }

    public static synchronized long b() {
        long j2;
        synchronized (i.class) {
            if (f8383c == -1) {
                long j3 = 0;
                String a2 = a(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(a2)) {
                    String upperCase = a2.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j3 = a(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j3 = a(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j3 = a(upperCase, "GB", 1073741824);
                        } else {
                            l g2 = c.g();
                            g2.e("Fabric", "Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                    } catch (NumberFormatException e2) {
                        l g3 = c.g();
                        g3.c("Fabric", "Unexpected meminfo format while computing RAM: " + upperCase, e2);
                    }
                }
                f8383c = j3;
            }
            j2 = f8383c;
        }
        return j2;
    }

    public static String b(Context context, String str) {
        int a2 = a(context, str, "string");
        return a2 > 0 ? context.getString(a2) : "";
    }

    public static String b(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    @SuppressLint({"MissingPermission"})
    public static boolean b(Context context) {
        if (!a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static boolean b(String str) {
        return str == null || str.length() == 0;
    }

    public static String c(Context context) {
        InputStream inputStream;
        Throwable th;
        Exception e2;
        String str = null;
        try {
            inputStream = context.getResources().openRawResource(d(context));
            try {
                String a2 = a(inputStream);
                if (!b(a2)) {
                    str = a2;
                }
                a((Closeable) inputStream, "Failed to close icon input stream.");
                return str;
            } catch (Exception e3) {
                e2 = e3;
                try {
                    c.g().c("Fabric", "Could not calculate hash for app icon.", e2);
                    a((Closeable) inputStream, "Failed to close icon input stream.");
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    a((Closeable) inputStream, "Failed to close icon input stream.");
                    throw th;
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            inputStream = null;
            c.g().c("Fabric", "Could not calculate hash for app icon.", e2);
            a((Closeable) inputStream, "Failed to close icon input stream.");
            return null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            a((Closeable) inputStream, "Failed to close icon input stream.");
            throw th;
        }
    }

    public static String c(String str) {
        return a(str, "SHA-1");
    }

    public static void c(Context context, String str) {
        if (k(context)) {
            c.g().e("Fabric", str);
        }
    }

    public static boolean c() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public static int d(Context context) {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    public static String d(String str) {
        return a(str, "SHA-256");
    }

    public static Float e(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return null;
        }
        return Float.valueOf(((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
    }

    public static int f(Context context) {
        int i2 = l(context) ? 1 : 0;
        if (m(context)) {
            i2 |= 2;
        }
        return c() ? i2 | 4 : i2;
    }

    public static boolean g(Context context) {
        return !l(context) && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null;
    }

    public static String h(Context context) {
        int i2 = context.getApplicationContext().getApplicationInfo().icon;
        return i2 > 0 ? context.getResources().getResourcePackageName(i2) : context.getPackageName();
    }

    public static SharedPreferences i(Context context) {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    public static boolean j(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean k(Context context) {
        if (a == null) {
            a = Boolean.valueOf(a(context, "com.crashlytics.Trace", false));
        }
        return a.booleanValue();
    }

    public static boolean l(Context context) {
        return "sdk".equals(Build.PRODUCT) || "google_sdk".equals(Build.PRODUCT) || Settings.Secure.getString(context.getContentResolver(), "android_id") == null;
    }

    public static boolean m(Context context) {
        boolean l2 = l(context);
        String str = Build.TAGS;
        if ((!l2 && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        return !l2 && new File("/system/xbin/su").exists();
    }

    public static String n(Context context) {
        int a2 = a(context, "io.fabric.android.build_id", "string");
        if (a2 == 0) {
            a2 = a(context, "com.crashlytics.android.build_id", "string");
        }
        if (a2 == 0) {
            return null;
        }
        String string = context.getResources().getString(a2);
        l g2 = c.g();
        g2.e("Fabric", "Build ID is: " + string);
        return string;
    }
}
