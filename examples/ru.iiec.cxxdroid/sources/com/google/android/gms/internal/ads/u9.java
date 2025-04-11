package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.t.c;
import com.google.android.gms.common.util.g;
import com.google.android.gms.common.util.l;
import com.google.android.gms.common.util.n;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class u9 {

    /* renamed from: h  reason: collision with root package name */
    public static final Handler f5718h = new m9(Looper.getMainLooper());
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f5719b = true;

    /* renamed from: c  reason: collision with root package name */
    private String f5720c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5721d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5722e = false;

    /* renamed from: f  reason: collision with root package name */
    private Pattern f5723f;

    /* renamed from: g  reason: collision with root package name */
    private Pattern f5724g;

    public static Bitmap a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    public static Bundle a(i10 i10) {
        String str;
        String str2;
        String str3;
        if (i10 == null) {
            return null;
        }
        if (!((Boolean) a50.g().a(k80.W)).booleanValue()) {
            if (!((Boolean) a50.g().a(k80.Y)).booleanValue()) {
                return null;
            }
        }
        if (x0.j().m().b() && x0.j().m().d()) {
            return null;
        }
        if (i10.d()) {
            i10.a();
        }
        c10 c2 = i10.c();
        if (c2 != null) {
            str3 = c2.b();
            str2 = c2.d();
            str = c2.e();
            if (str3 != null) {
                x0.j().m().a(str3);
            }
            if (str != null) {
                x0.j().m().b(str);
            }
        } else {
            str3 = x0.j().m().c();
            str = x0.j().m().e();
            str2 = null;
        }
        Bundle bundle = new Bundle(1);
        if (str != null) {
            if (((Boolean) a50.g().a(k80.Y)).booleanValue() && !x0.j().m().d()) {
                bundle.putString("v_fp_vertical", str);
            }
        }
        if (str3 != null) {
            if (((Boolean) a50.g().a(k80.W)).booleanValue() && !x0.j().m().b()) {
                bundle.putString("fingerprint", str3);
                if (!str3.equals(str2)) {
                    bundle.putString("v_fp", str2);
                }
            }
        }
        if (!bundle.isEmpty()) {
            return bundle;
        }
        return null;
    }

    public static DisplayMetrics a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static WebResourceResponse a(HttpURLConnection httpURLConnection) {
        x0.f();
        String contentType = httpURLConnection.getContentType();
        String str = "";
        String trim = TextUtils.isEmpty(contentType) ? str : contentType.split(";")[0].trim();
        x0.f();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i2 = 1;
                while (true) {
                    if (i2 >= split.length) {
                        break;
                    }
                    if (split[i2].trim().startsWith("charset")) {
                        String[] split2 = split[i2].trim().split("=");
                        if (split2.length > 1) {
                            str = split2[1].trim();
                            break;
                        }
                    }
                    i2++;
                }
            }
        }
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || entry.getValue().size() <= 0)) {
                hashMap.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return x0.h().a(trim, str, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    public static PopupWindow a(View view, int i2, int i3, boolean z) {
        return new PopupWindow(view, i2, i3, false);
    }

    private static String a() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static String a(Context context, View view, n40 n40) {
        if (!((Boolean) a50.g().a(k80.i0)).booleanValue()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", n40.f5050f);
            jSONObject2.put("height", n40.f5047c);
            jSONObject.put("size", jSONObject2);
            jSONObject.put("activity", g(context));
            if (!n40.f5049e) {
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        int i2 = -1;
                        if (parent instanceof ViewGroup) {
                            i2 = ((ViewGroup) parent).indexOfChild(view);
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", parent.getClass().getName());
                        jSONObject3.put("index_of_child", i2);
                        jSONArray.put(jSONObject3);
                    }
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("parents", jSONArray);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            qc.c("Fail to get view hierarchy json", e2);
            return null;
        }
    }

    public static String a(InputStreamReader inputStreamReader) {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    public static Map<String, String> a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : x0.h().a(uri)) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    private final JSONArray a(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            a(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final JSONObject a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public static void a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    @TargetApi(18)
    public static void a(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            if (((Boolean) a50.g().a(k80.K2)).booleanValue()) {
                b(context, intent);
            }
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            qc.b(sb.toString());
        } catch (ActivityNotFoundException e2) {
            qc.b("No browser is found.", e2);
        }
    }

    public static void a(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        a(context, str, arrayList);
    }

    public static void a(Context context, String str, List<String> list) {
        for (String str2 : list) {
            new tb(context, str, str2).a();
        }
    }

    public static void a(Context context, Throwable th) {
        if (context != null) {
            boolean z = false;
            try {
                z = ((Boolean) a50.g().a(k80.f4789c)).booleanValue();
            } catch (IllegalStateException unused) {
            }
            if (z) {
                g.a(context, th);
            }
        }
    }

    public static void a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            s9.a(runnable);
        }
    }

    private final void a(JSONArray jSONArray, Object obj) {
        Object a2;
        if (obj instanceof Bundle) {
            a2 = a((Bundle) obj);
        } else if (obj instanceof Map) {
            a2 = a((Map) obj);
        } else if (obj instanceof Collection) {
            a2 = a((Collection) obj);
        } else if (obj instanceof Object[]) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object obj2 : (Object[]) obj) {
                a(jSONArray2, obj2);
            }
            jSONArray.put(jSONArray2);
            return;
        } else {
            jSONArray.put(obj);
            return;
        }
        jSONArray.put(a2);
    }

    private final void a(JSONObject jSONObject, String str, Object obj) {
        Collection<?> asList;
        Object a2;
        if (obj instanceof Bundle) {
            a2 = a((Bundle) obj);
        } else if (obj instanceof Map) {
            a2 = a((Map) obj);
        } else {
            if (obj instanceof Collection) {
                if (str == null) {
                    str = "null";
                }
                asList = (Collection) obj;
            } else if (obj instanceof Object[]) {
                asList = Arrays.asList((Object[]) obj);
            } else {
                jSONObject.put(str, obj);
                return;
            }
            a2 = a(asList);
        }
        jSONObject.put(str, a2);
    }

    private static boolean a(int i2, int i3, int i4) {
        return Math.abs(i2 - i3) <= i4;
    }

    @TargetApi(24)
    public static boolean a(Activity activity, Configuration configuration) {
        a50.b();
        int a2 = fc.a(activity, configuration.screenHeightDp);
        int a3 = fc.a(activity, configuration.screenWidthDp);
        DisplayMetrics a4 = a((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i2 = a4.heightPixels;
        int i3 = a4.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) a50.g().a(k80.W2)).intValue();
        return a(i2, a2 + dimensionPixelSize, round) && a(i3, a3, round);
    }

    public static boolean a(ClassLoader classLoader, Class<?> cls, String str) {
        try {
            return cls.isAssignableFrom(Class.forName(str, false, classLoader));
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Bitmap b(View view) {
        if (view == null) {
            return null;
        }
        Bitmap d2 = d(view);
        return d2 == null ? c(view) : d2;
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }

    @TargetApi(18)
    public static void b(Context context, Intent intent) {
        if (intent != null && n.f()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    public static void b(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes("UTF-8"));
            openFileOutput.close();
        } catch (Exception e2) {
            qc.b("Error writing to file in internal storage.", e2);
        }
    }

    public static boolean b(Context context, String str) {
        return c.b(context).a(str, context.getPackageName()) == 0;
    }

    private static Bitmap c(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0) {
                if (height != 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(createBitmap);
                    view.layout(0, 0, width, height);
                    view.draw(canvas);
                    return createBitmap;
                }
            }
            qc.d("Width or height of view is zero");
            return null;
        } catch (RuntimeException e2) {
            qc.b("Fail to capture the webview", e2);
            return null;
        }
    }

    public static WebResourceResponse c(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", x0.f().a(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new eb(context).a(str2, hashMap).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
            return null;
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e2) {
            qc.c("Could not fetch MRAID JS.", e2);
            return null;
        }
    }

    public static String c() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    public static String c(Context context, String str) {
        try {
            return new String(l.a(context.openFileInput(str), true), "UTF-8");
        } catch (IOException unused) {
            qc.b("Error reading from internal storage.");
            return "";
        }
    }

    public static String c(String str) {
        return Uri.parse(str).buildUpon().query(null).build().toString();
    }

    public static boolean c(Context context) {
        String str;
        ActivityInfo activityInfo;
        boolean z;
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        try {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null) {
                str = "Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.";
            } else {
                if ((activityInfo.configChanges & 16) == 0) {
                    qc.d(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "keyboard"));
                    z = false;
                } else {
                    z = true;
                }
                if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
                    qc.d(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "keyboardHidden"));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 128) == 0) {
                    qc.d(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "orientation"));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 256) == 0) {
                    qc.d(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "screenLayout"));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 512) == 0) {
                    qc.d(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "uiMode"));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 1024) == 0) {
                    qc.d(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "screenSize"));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 2048) != 0) {
                    return z;
                }
                str = String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", "smallestScreenSize");
            }
            qc.d(str);
            return false;
        } catch (Exception e2) {
            qc.c("Could not verify that com.google.android.gms.ads.AdActivity is declared in AndroidManifest.xml", e2);
            x0.j().a(e2, "AdUtil.hasAdActivity");
            return false;
        }
    }

    public static int[] c(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(16908290)) == null) ? d() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static int d(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Could not parse value:");
            sb.append(valueOf);
            qc.d(sb.toString());
            return 0;
        }
    }

    private static Bitmap d(View view) {
        Bitmap bitmap = null;
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            }
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        } catch (RuntimeException e2) {
            qc.b("Fail to capture the web view", e2);
        }
        return bitmap;
    }

    protected static String d(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return a();
        }
    }

    private static int[] d() {
        return new int[]{0, 0};
    }

    public static AlertDialog.Builder e(Context context) {
        return new AlertDialog.Builder(context);
    }

    public static Bundle e() {
        Bundle bundle = new Bundle();
        try {
            if (((Boolean) a50.g().a(k80.C)).booleanValue()) {
                Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                bundle.putParcelable("debug_memory_info", memoryInfo);
            }
            if (((Boolean) a50.g().a(k80.D)).booleanValue()) {
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free_memory", runtime.freeMemory());
                bundle.putLong("runtime_max_memory", runtime.maxMemory());
                bundle.putLong("runtime_total_memory", runtime.totalMemory());
            }
            bundle.putInt("web_view_count", x0.j().l());
        } catch (Exception e2) {
            qc.c("Unable to gather memory stats", e2);
        }
        return bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean e(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 == 0) goto L_0x0012
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0012
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x0013
        L_0x0012:
            r2 = r0
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u9.e(android.view.View):boolean");
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    public static int f(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    public static v70 f(Context context) {
        return new v70(context);
    }

    private static String g(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (!(activityManager == null || (runningTasks = activityManager.getRunningTasks(1)) == null || runningTasks.isEmpty() || (runningTaskInfo = runningTasks.get(0)) == null || runningTaskInfo.topActivity == null)) {
                return runningTaskInfo.topActivity.getClassName();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static boolean h(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (Process.myPid() == next.pid) {
                                if (next.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
                                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                                    if (powerManager == null ? false : powerManager.isScreenOn()) {
                                        return true;
                                    }
                                }
                            }
                        }
                    } else {
                        return false;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static Bitmap i(Context context) {
        if (!(context instanceof Activity)) {
            return null;
        }
        try {
            if (!((Boolean) a50.g().a(k80.R1)).booleanValue()) {
                return c(((Activity) context).getWindow().getDecorView());
            }
            Window window = ((Activity) context).getWindow();
            if (window != null) {
                return d(window.getDecorView().getRootView());
            }
            return null;
        } catch (RuntimeException e2) {
            qc.b("Fail to capture screen shot", e2);
            return null;
        }
    }

    public static int j(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }

    private static KeyguardManager k(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    @TargetApi(16)
    public static boolean l(Context context) {
        KeyguardManager k2;
        return context != null && n.d() && (k2 = k(context)) != null && k2.isKeyguardLocked();
    }

    public static boolean m(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            qc.b("Error loading class.", th);
            x0.j().a(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public final String a(Context context, String str) {
        synchronized (this.a) {
            if (this.f5720c != null) {
                return this.f5720c;
            } else if (str == null) {
                return a();
            } else {
                try {
                    this.f5720c = x0.h().a(context);
                } catch (Exception unused) {
                }
                if (TextUtils.isEmpty(this.f5720c)) {
                    a50.b();
                    if (!fc.b()) {
                        this.f5720c = null;
                        f5718h.post(new w9(this, context));
                        while (this.f5720c == null) {
                            try {
                                this.a.wait();
                            } catch (InterruptedException unused2) {
                                this.f5720c = a();
                                String valueOf = String.valueOf(this.f5720c);
                                qc.d(valueOf.length() != 0 ? "Interrupted, use default user agent: ".concat(valueOf) : new String("Interrupted, use default user agent: "));
                            }
                        }
                    } else {
                        this.f5720c = d(context);
                    }
                }
                String valueOf2 = String.valueOf(this.f5720c);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 10 + String.valueOf(str).length());
                sb.append(valueOf2);
                sb.append(" (Mobile; ");
                sb.append(str);
                this.f5720c = sb.toString();
                try {
                    if (c.b(context).a()) {
                        this.f5720c = String.valueOf(this.f5720c).concat(";aia");
                    }
                } catch (Exception e2) {
                    x0.j().a(e2, "AdUtil.getUserAgent");
                }
                this.f5720c = String.valueOf(this.f5720c).concat(")");
                return this.f5720c;
            }
        }
    }

    public final JSONObject a(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return a(bundle);
            } catch (JSONException e2) {
                qc.b("Error converting Bundle to JSON", e2);
            }
        }
        return null;
    }

    public final JSONObject a(Map<String, ?> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Could not convert map to JSON: ".concat(valueOf) : new String("Could not convert map to JSON: "));
        }
    }

    public final void a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(a(context, str));
    }

    public final void a(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (z) {
            x0.f();
            bundle.putString("device", c());
            bundle.putString("eids", TextUtils.join(",", k80.a()));
        }
        a50.b();
        fc.a(context, str, str2, bundle, z, new x9(this, context, str));
    }

    public final void a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", a(context, str));
        httpURLConnection.setUseCaches(false);
    }

    public final void a(Context context, List<String> list) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!TextUtils.isEmpty(wv.a(activity))) {
                if (list == null) {
                    l9.e("Cannot ping urls: empty list.");
                } else if (!i90.a(context)) {
                    l9.e("Cannot ping url because custom tabs is not supported");
                } else {
                    i90 i90 = new i90();
                    i90.a(new v9(this, list, i90, context));
                    i90.b(activity);
                }
            }
        }
    }

    public final boolean a(Context context) {
        if (this.f5721d) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new z9(this, null), intentFilter);
        this.f5721d = true;
        return true;
    }

    public final boolean a(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return a(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, k(context));
    }

    public final boolean a(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z;
        if (!x0.f().f5719b) {
            if (keyguardManager == null ? false : keyguardManager.inKeyguardRestrictedInputMode()) {
                if (!((Boolean) a50.g().a(k80.n1)).booleanValue() || !e(view)) {
                    z = false;
                    if (view.getVisibility() == 0 && view.isShown()) {
                        if ((powerManager != null || powerManager.isScreenOn()) && z) {
                            if (((Boolean) a50.g().a(k80.l1)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        z = true;
        if (((Boolean) a50.g().a(k80.l1)).booleanValue()) {
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (((java.lang.String) com.google.android.gms.internal.ads.a50.g().a(com.google.android.gms.internal.ads.k80.o0)).equals(r3.f5723f.pattern()) == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            monitor-enter(r3)     // Catch:{ PatternSyntaxException -> 0x0046 }
            java.util.regex.Pattern r0 = r3.f5723f     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.a80<java.lang.String> r0 = com.google.android.gms.internal.ads.k80.o0     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.i80 r2 = com.google.android.gms.internal.ads.a50.g()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r2 = r3.f5723f     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = r2.pattern()     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x0037
        L_0x0025:
            com.google.android.gms.internal.ads.a80<java.lang.String> r0 = com.google.android.gms.internal.ads.k80.o0     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.i80 r2 = com.google.android.gms.internal.ads.a50.g()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x0043 }
            r3.f5723f = r0     // Catch:{ all -> 0x0043 }
        L_0x0037:
            java.util.regex.Pattern r0 = r3.f5723f     // Catch:{ all -> 0x0043 }
            java.util.regex.Matcher r4 = r0.matcher(r4)     // Catch:{ all -> 0x0043 }
            boolean r4 = r4.matches()     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            throw r4
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u9.a(java.lang.String):boolean");
    }

    public final int[] a(Activity activity) {
        int[] c2 = c(activity);
        a50.b();
        a50.b();
        return new int[]{fc.b(activity, c2[0]), fc.b(activity, c2[1])};
    }

    public final void b(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (((Boolean) a50.g().a(k80.q1)).booleanValue()) {
            a(context, str, str2, bundle, z);
        }
    }

    public final boolean b(Context context) {
        if (this.f5722e) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new y9(this, null), intentFilter);
        this.f5722e = true;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (((java.lang.String) com.google.android.gms.internal.ads.a50.g().a(com.google.android.gms.internal.ads.k80.p0)).equals(r3.f5724g.pattern()) == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            monitor-enter(r3)     // Catch:{ PatternSyntaxException -> 0x0046 }
            java.util.regex.Pattern r0 = r3.f5724g     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.a80<java.lang.String> r0 = com.google.android.gms.internal.ads.k80.p0     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.i80 r2 = com.google.android.gms.internal.ads.a50.g()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r2 = r3.f5724g     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = r2.pattern()     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x0037
        L_0x0025:
            com.google.android.gms.internal.ads.a80<java.lang.String> r0 = com.google.android.gms.internal.ads.k80.p0     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.i80 r2 = com.google.android.gms.internal.ads.a50.g()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r2.a(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0043 }
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x0043 }
            r3.f5724g = r0     // Catch:{ all -> 0x0043 }
        L_0x0037:
            java.util.regex.Pattern r0 = r3.f5724g     // Catch:{ all -> 0x0043 }
            java.util.regex.Matcher r4 = r0.matcher(r4)     // Catch:{ all -> 0x0043 }
            boolean r4 = r4.matches()     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            throw r4
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u9.b(java.lang.String):boolean");
    }

    public final int[] b(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] d2 = (window == null || (findViewById = window.findViewById(16908290)) == null) ? d() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        a50.b();
        a50.b();
        return new int[]{fc.b(activity, d2[0]), fc.b(activity, d2[1])};
    }
}
