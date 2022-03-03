package e.e.a;

import android.content.Context;
import android.os.Build;
import android.system.Os;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static a f8285c;
    private String a = null;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<Pair<String, String>> f8286b;

    private a() {
    }

    public static String a(Context context) {
        return context.getFilesDir().getPath() + "/busybox";
    }

    public static ArrayList<Pair<String, String>> b(Context context) {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (Build.VERSION.SDK_INT >= 29) {
            arrayList.add(new Pair<>("BACKCOMPAT_PIE", "1"));
            arrayList.add(new Pair<>("BACKCOMPAT_SCOPE", "/data/"));
        }
        if (Build.VERSION.SDK_INT >= 29) {
            arrayList.add(new Pair<>("BACKCOMPAT_DISABLE_FDSAN", "1"));
        }
        if (Build.VERSION.SDK_INT >= 30) {
            arrayList.add(new Pair<>("BACKCOMPAT_DISABLE_MTAG", "1"));
        }
        if (new File(d(context)).exists()) {
            arrayList.add(new Pair<>("BACKCOMPAT_SHELL", d(context)));
        }
        if (context.getPackageName().contains("pydroid")) {
            String[] strArr = {"aarch64-linux-android", "arm-linux-androideabi", "i686-linux-android", "x86_64-linux-android"};
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                String str = context.getFilesDir() + "/" + strArr[i2] + "/bin";
                if (new File(str).exists()) {
                    arrayList.add(new Pair<>("BACKCOMPAT_BIN", str));
                    break;
                }
                i2++;
            }
        }
        if (new File(a(context)).exists()) {
            arrayList.add(new Pair<>("BACKCOMPAT_BUSYBOX", a(context)));
        }
        if (new File(d(context)).exists() && new File(a(context)).exists()) {
            arrayList.add(new Pair<>("BACKCOMPAT_SHEBANG", "1"));
        }
        return arrayList;
    }

    public static a c(Context context) {
        if (f8285c == null) {
            f8285c = new a();
        }
        f8285c.f8286b = b(context);
        Iterator<Pair<String, String>> it = f8285c.f8286b.iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            try {
                Os.setenv((String) next.first, (String) next.second, false);
            } catch (Exception unused) {
                throw new RuntimeException("Unable to setenv");
            }
        }
        if (f8285c.a == null) {
            File file = new File(context.getApplicationInfo().nativeLibraryDir, "libjumppad.so");
            if (file.exists()) {
                f8285c.a = file.getAbsolutePath();
            }
        }
        return f8285c;
    }

    public static String d(Context context) {
        return context.getFilesDir().getPath() + "/sh";
    }

    public Process a(String str) {
        return a(str, (String[]) null, (File) null);
    }

    public Process a(String str, String[] strArr, File file) {
        if (str.length() != 0) {
            StringTokenizer stringTokenizer = new StringTokenizer(str);
            String[] strArr2 = new String[stringTokenizer.countTokens()];
            int i2 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                strArr2[i2] = stringTokenizer.nextToken();
                i2++;
            }
            return a(strArr2, strArr, file);
        }
        throw new IllegalArgumentException("Empty command");
    }

    public Process a(String[] strArr, String[] strArr2, File file) {
        if (this.a != null || Build.VERSION.SDK_INT < 29) {
            if (this.a != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.a);
                arrayList.addAll(Arrays.asList(strArr));
                strArr = (String[]) arrayList.toArray(new String[0]);
            }
            if (strArr2 != null) {
                HashSet hashSet = new HashSet();
                hashSet.addAll(Arrays.asList(strArr2));
                Iterator<Pair<String, String>> it = this.f8286b.iterator();
                while (it.hasNext()) {
                    Pair<String, String> next = it.next();
                    hashSet.add(((String) next.first) + "=" + ((String) next.second));
                }
                strArr2 = (String[]) hashSet.toArray(new String[0]);
            }
            return Runtime.getRuntime().exec(strArr, strArr2, file);
        }
        throw new RuntimeException("No jumppad, check your firmware");
    }

    public String a() {
        return this.a;
    }
}
