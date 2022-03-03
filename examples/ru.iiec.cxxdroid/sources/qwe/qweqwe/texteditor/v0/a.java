package qwe.qweqwe.texteditor.v0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Environment;
import java.io.File;

public class a {
    public static String a() {
        return "<iiec_sample_prefix>/";
    }

    public static String a(Activity activity) {
        return "export SSL_CERT_FILE='" + b(activity) + "' ; export TMPDIR='" + i(activity) + "' ; export SHELL='" + g(activity) + "' ; export CONFIG_SHELL='" + g(activity) + "' ; export XDG_CACHE_HOME='" + j(activity) + "' ; export LC_ALL='en_US.UTF-8' ; export PATH='" + e(activity) + "':$PATH";
    }

    public static String a(Context context) {
        return new ContextWrapper(context).getCacheDir().getAbsolutePath();
    }

    public static String a(String str) {
        if (str != null && !str.startsWith(a())) {
            return str;
        }
        return null;
    }

    public static String b(Activity activity) {
        return c(activity) + "/cert.pem";
    }

    public static String b(Context context) {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null && Build.VERSION.SDK_INT >= 19) {
            File[] externalFilesDirs = context.getExternalFilesDirs(null);
            int length = externalFilesDirs.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                File file = externalFilesDirs[i2];
                if (file != null) {
                    externalFilesDir = file;
                    break;
                }
                i2++;
            }
        }
        return externalFilesDir.getAbsolutePath();
    }

    public static String c(Context context) {
        return new ContextWrapper(context).getFilesDir().getPath();
    }

    public static String d(Context context) {
        return c(context) + "/busybox";
    }

    public static String e(Context context) {
        return "/busybox-virtual";
    }

    public static String f(Context context) {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public static String g(Context context) {
        return c(context) + "/sh";
    }

    public static String h(Context context) {
        return c(context) + "/editor_state.json";
    }

    public static String i(Context context) {
        return a(context);
    }

    public static String j(Context context) {
        return a(context);
    }

    public static boolean k(Context context) {
        return new File(d(context)).exists();
    }
}
