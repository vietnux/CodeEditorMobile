package c.h.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.util.TypedValue;
import c.h.d.d.f;
import java.io.File;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class a {
    private static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f2271b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static TypedValue f2272c;

    /* renamed from: c.h.d.a$a  reason: collision with other inner class name */
    static class C0042a {
        static void a(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }

        static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }
    }

    static class b {
        static Drawable a(Context context, int i2) {
            return context.getDrawable(i2);
        }

        static File a(Context context) {
            return context.getCodeCacheDir();
        }

        static File b(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    static class c {
        static int a(Context context, int i2) {
            return context.getColor(i2);
        }

        static <T> T a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static String b(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    static class d {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static File b(Context context) {
            return context.getDataDir();
        }

        static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public static int a(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 23 ? c.a(context, i2) : context.getResources().getColor(i2);
    }

    public static int a(Context context, String str) {
        c.h.k.c.a((Object) str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static File a(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return b.b(context);
        }
        File file = new File(context.getApplicationInfo().dataDir, "no_backup");
        a(file);
        return file;
    }

    private static File a(File file) {
        synchronized (f2271b) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                Log.w("ContextCompat", "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }

    public static void a(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0042a.a(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    public static boolean a(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0042a.a(context, intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    public static ColorStateList b(Context context, int i2) {
        return f.a(context.getResources(), i2, context.getTheme());
    }

    public static boolean b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return d.c(context);
        }
        return false;
    }

    public static Drawable c(Context context, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            return b.a(context, i2);
        }
        if (i3 < 16) {
            synchronized (a) {
                if (f2272c == null) {
                    f2272c = new TypedValue();
                }
                context.getResources().getValue(i2, f2272c, true);
                i2 = f2272c.resourceId;
            }
        }
        return context.getResources().getDrawable(i2);
    }
}
