package l.a;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import androidx.core.app.a;
import androidx.core.app.d;
import c.e.g;

public final class c {
    private static final g<String, Integer> a = new g<>(8);

    /* renamed from: b  reason: collision with root package name */
    private static volatile int f9535b = -1;

    static {
        a.put("com.android.voicemail.permission.ADD_VOICEMAIL", 14);
        a.put("android.permission.BODY_SENSORS", 20);
        a.put("android.permission.READ_CALL_LOG", 16);
        a.put("android.permission.READ_EXTERNAL_STORAGE", 16);
        a.put("android.permission.USE_SIP", 9);
        a.put("android.permission.WRITE_CALL_LOG", 16);
        a.put("android.permission.SYSTEM_ALERT_WINDOW", 23);
        a.put("android.permission.WRITE_SETTINGS", 23);
    }

    public static int a(Context context) {
        if (f9535b != -1) {
            return f9535b;
        }
        try {
            f9535b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.targetSdkVersion;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return f9535b;
    }

    public static boolean a(Activity activity, String... strArr) {
        for (String str : strArr) {
            if (a.a(activity, str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 23 && "Xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
            return b(context, str);
        }
        try {
            return c.h.d.c.b(context, str) == 0;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public static boolean a(Context context, String... strArr) {
        for (String str : strArr) {
            if (a(str) && !a(context, str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(String str) {
        Integer num = a.get(str);
        return num == null || Build.VERSION.SDK_INT >= num.intValue();
    }

    public static boolean a(int... iArr) {
        if (iArr.length == 0) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean b(Context context, String str) {
        String a2 = d.a(str);
        if (a2 == null) {
            return true;
        }
        return d.a(context, a2, Process.myUid(), context.getPackageName()) == 0 && c.h.d.c.b(context, str) == 0;
    }
}
