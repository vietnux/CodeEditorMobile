package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.h;
import com.google.android.gms.ads.m.d;
import com.google.android.gms.ads.q.b;
import com.google.android.gms.common.n;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;

@k2
public final class fc {
    public static final Handler a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private static final String f4301b = e.class.getName();

    /* renamed from: c  reason: collision with root package name */
    private static final String f4302c = h.class.getName();

    /* renamed from: d  reason: collision with root package name */
    private static final String f4303d = d.class.getName();

    /* renamed from: e  reason: collision with root package name */
    private static final String f4304e = com.google.android.gms.ads.m.e.class.getName();

    /* renamed from: f  reason: collision with root package name */
    private static final String f4305f = b.class.getName();

    /* renamed from: g  reason: collision with root package name */
    private static final String f4306g = com.google.android.gms.ads.b.class.getName();

    public static int a(Context context, int i2) {
        return a(context.getResources().getDisplayMetrics(), i2);
    }

    public static int a(DisplayMetrics displayMetrics, int i2) {
        return (int) TypedValue.applyDimension(1, (float) i2, displayMetrics);
    }

    public static String a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || a()) {
            string = "emulator";
        }
        return a(string);
    }

    public static String a(String str) {
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, instance.digest()));
            } catch (NoSuchAlgorithmException unused) {
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    public static String a(StackTraceElement[] stackTraceElementArr, String str) {
        int i2;
        String str2;
        int i3 = 0;
        while (true) {
            i2 = i3 + 1;
            if (i2 >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i3];
            String className = stackTraceElement.getClassName();
            if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!f4301b.equalsIgnoreCase(className) && !f4302c.equalsIgnoreCase(className) && !f4303d.equalsIgnoreCase(className) && !f4304e.equalsIgnoreCase(className) && !f4305f.equalsIgnoreCase(className) && !f4306g.equalsIgnoreCase(className))) {
                i3 = i2;
            }
        }
        str2 = stackTraceElementArr[i2].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            int i4 = 2;
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                while (true) {
                    int i5 = i4 - 1;
                    if (i4 <= 0 || !stringTokenizer.hasMoreElements()) {
                        str = sb.toString();
                    } else {
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                        i4 = i5;
                    }
                }
                str = sb.toString();
            }
            if (str2 == null || str2.contains(str)) {
                return null;
            }
            return str2;
        }
        return null;
    }

    public static Throwable a(Throwable th) {
        if (((Boolean) a50.g().a(k80.f4790d)).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (b(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (!(!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java.")))) {
                        stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                    }
                    arrayList.add(stackTraceElement);
                }
            }
            if (z) {
                th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    public static void a(Context context, String str, String str2, Bundle bundle, boolean z, ic icVar) {
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            bundle.putString("os", Build.VERSION.RELEASE);
            bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
            bundle.putString("appid", applicationContext.getPackageName());
            if (str == null) {
                int a2 = com.google.android.gms.common.h.a().a(context);
                StringBuilder sb = new StringBuilder(20);
                sb.append(a2);
                sb.append(".12451000");
                str = sb.toString();
            }
            bundle.putString("js", str);
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        icVar.a(appendQueryParameter.toString());
    }

    private final void a(ViewGroup viewGroup, n40 n40, String str, int i2, int i3) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i2);
            textView.setBackgroundColor(i3);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i2);
            int a2 = a(context, 3);
            frameLayout.addView(textView, new FrameLayout.LayoutParams(n40.f5051g - a2, n40.f5048d - a2, 17));
            viewGroup.addView(frameLayout, n40.f5051g, n40.f5048d);
        }
    }

    public static void a(boolean z, HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setUseCaches(false);
    }

    public static boolean a() {
        return Build.DEVICE.startsWith("generic");
    }

    public static int b(Context context, int i2) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return b(displayMetrics, i2);
    }

    public static int b(DisplayMetrics displayMetrics, int i2) {
        return Math.round(((float) i2) / displayMetrics.density);
    }

    public static String b(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return null;
        }
        return Settings.Secure.getString(contentResolver, "android_id");
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith((String) a50.g().a(k80.f4791e))) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(k2.class);
        } catch (Exception e2) {
            String valueOf = String.valueOf(str);
            qc.a(valueOf.length() != 0 ? "Fail to check class type for class ".concat(valueOf) : new String("Fail to check class type for class "), e2);
            return false;
        }
    }

    public static String c() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public static boolean c(Context context) {
        return com.google.android.gms.common.h.a().a(context, n.GOOGLE_PLAY_SERVICES_VERSION_CODE) == 0;
    }

    public static int d(Context context) {
        return DynamiteModule.b(context, ModuleDescriptor.MODULE_ID);
    }

    public static int e(Context context) {
        return DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
    }

    public static boolean f(Context context) {
        int a2 = com.google.android.gms.common.h.a().a(context, n.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        return a2 == 0 || a2 == 2;
    }

    public static boolean g(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600;
    }

    @TargetApi(17)
    public static boolean h(Context context) {
        int i2;
        int i3;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (com.google.android.gms.common.util.n.e()) {
            defaultDisplay.getRealMetrics(displayMetrics);
            i3 = displayMetrics.heightPixels;
            i2 = displayMetrics.widthPixels;
        } else {
            try {
                i3 = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i2 = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.heightPixels == i3 && displayMetrics.widthPixels == i2;
    }

    public static int i(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final void a(Context context, String str, String str2, Bundle bundle, boolean z) {
        a(context, null, str2, bundle, true, new gc(this));
    }

    public final void a(ViewGroup viewGroup, n40 n40, String str) {
        a(viewGroup, n40, str, -16777216, -1);
    }

    public final void a(ViewGroup viewGroup, n40 n40, String str, String str2) {
        qc.d(str2);
        a(viewGroup, n40, str, -65536, -16777216);
    }
}
