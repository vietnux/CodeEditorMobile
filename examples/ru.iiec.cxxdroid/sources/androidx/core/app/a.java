package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;

public class a extends c.h.d.a {

    /* renamed from: d  reason: collision with root package name */
    private static d f993d;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.a$a  reason: collision with other inner class name */
    public class RunnableC0015a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String[] f994b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f995c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f996d;

        RunnableC0015a(String[] strArr, Activity activity, int i2) {
            this.f994b = strArr;
            this.f995c = activity;
            this.f996d = i2;
        }

        public void run() {
            int[] iArr = new int[this.f994b.length];
            PackageManager packageManager = this.f995c.getPackageManager();
            String packageName = this.f995c.getPackageName();
            int length = this.f994b.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = packageManager.checkPermission(this.f994b[i2], packageName);
            }
            ((c) this.f995c).onRequestPermissionsResult(this.f996d, this.f994b, iArr);
        }
    }

    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f997b;

        b(Activity activity) {
            this.f997b = activity;
        }

        public void run() {
            if (!this.f997b.isFinishing() && !c.a(this.f997b)) {
                this.f997b.recreate();
            }
        }
    }

    public interface c {
        void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);
    }

    public interface d {
        boolean a(Activity activity, String[] strArr, int i2);
    }

    public interface e {
        void a(int i2);
    }

    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static void a(Activity activity, Intent intent, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i2, bundle);
        } else {
            activity.startActivityForResult(intent, i2);
        }
    }

    public static void a(Activity activity, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
        }
    }

    public static void a(Activity activity, String[] strArr, int i2) {
        d dVar = f993d;
        if (dVar == null || !dVar.a(activity, strArr, i2)) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof e) {
                    ((e) activity).a(i2);
                }
                activity.requestPermissions(strArr, i2);
            } else if (activity instanceof c) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0015a(strArr, activity, i2));
            }
        }
    }

    public static boolean a(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void b(Activity activity) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            if (i2 <= 23) {
                new Handler(activity.getMainLooper()).post(new b(activity));
                return;
            } else if (c.a(activity)) {
                return;
            }
        }
        activity.recreate();
    }
}
