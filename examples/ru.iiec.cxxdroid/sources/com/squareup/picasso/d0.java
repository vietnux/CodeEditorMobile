package com.squareup.picasso;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import j.e;
import j.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
public final class d0 {
    static final StringBuilder a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    private static final f f6821b = f.d("RIFF");

    /* renamed from: c  reason: collision with root package name */
    private static final f f6822c = f.d("WEBP");

    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000);
        }
    }

    private static class b extends Thread {
        b(Runnable runnable) {
            super(runnable);
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    static class c implements ThreadFactory {
        c() {
        }

        public Thread newThread(Runnable runnable) {
            return new b(runnable);
        }
    }

    static int a(Context context) {
        ActivityManager activityManager = (ActivityManager) a(context, "activity");
        return (int) ((((long) ((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass())) * 1048576) / 7);
    }

    static int a(Resources resources, w wVar) {
        Uri uri;
        if (wVar.f6913e != 0 || (uri = wVar.f6912d) == null) {
            return wVar.f6913e;
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            List<String> pathSegments = wVar.f6912d.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                throw new FileNotFoundException("No path segments: " + wVar.f6912d);
            } else if (pathSegments.size() == 1) {
                try {
                    return Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Last path segment is not a resource ID: " + wVar.f6912d);
                }
            } else if (pathSegments.size() == 2) {
                return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + wVar.f6912d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + wVar.f6912d);
        }
    }

    static int a(Bitmap bitmap) {
        int allocationByteCount = Build.VERSION.SDK_INT >= 19 ? bitmap.getAllocationByteCount() : bitmap.getByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    @TargetApi(18)
    static long a(File file) {
        long j2;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j2 = ((Build.VERSION.SDK_INT < 18 ? (long) statFs.getBlockCount() : statFs.getBlockCountLong()) * (Build.VERSION.SDK_INT < 18 ? (long) statFs.getBlockSize() : statFs.getBlockSizeLong())) / 50;
        } catch (IllegalArgumentException unused) {
            j2 = 5242880;
        }
        return Math.max(Math.min(j2, 52428800L), 5242880L);
    }

    static Resources a(Context context, w wVar) {
        Uri uri;
        if (wVar.f6913e != 0 || (uri = wVar.f6912d) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new FileNotFoundException("Unable to obtain resources for package: " + wVar.f6912d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + wVar.f6912d);
        }
    }

    static <T> T a(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static String a(c cVar) {
        return a(cVar, "");
    }

    static String a(c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        a b2 = cVar.b();
        if (b2 != null) {
            sb.append(b2.f6765b.d());
        }
        List<a> c2 = cVar.c();
        if (c2 != null) {
            int size = c2.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0 || b2 != null) {
                    sb.append(", ");
                }
                sb.append(c2.get(i2).f6765b.d());
            }
        }
        return sb.toString();
    }

    static String a(w wVar) {
        String a2 = a(wVar, a);
        a.setLength(0);
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String a(com.squareup.picasso.w r4, java.lang.StringBuilder r5) {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.d0.a(com.squareup.picasso.w, java.lang.StringBuilder):java.lang.String");
    }

    static void a() {
        if (!b()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    static void a(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000);
    }

    static void a(String str, String str2, String str3) {
        a(str, str2, str3, "");
    }

    static void a(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }

    static boolean a(e eVar) {
        return eVar.a(0, f6821b) && eVar.a(8, f6822c);
    }

    static File b(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    static boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    static boolean b(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    static boolean c(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (Build.VERSION.SDK_INT >= 17) {
            return Settings.Global.getInt(contentResolver, "airplane_mode_on", 0) != 0;
        }
        try {
            return Settings.System.getInt(contentResolver, "airplane_mode_on", 0) != 0;
        } catch (NullPointerException | SecurityException unused) {
            return false;
        }
    }
}
