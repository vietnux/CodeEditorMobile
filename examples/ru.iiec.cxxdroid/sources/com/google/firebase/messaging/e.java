package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import c.h.d.a;
import com.google.android.gms.common.util.n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

final class e {

    /* renamed from: f  reason: collision with root package name */
    private static e f6682f;
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private Bundle f6683b;

    /* renamed from: c  reason: collision with root package name */
    private Method f6684c;

    /* renamed from: d  reason: collision with root package name */
    private Method f6685d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicInteger f6686e = new AtomicInteger((int) SystemClock.elapsedRealtime());

    private e(Context context) {
        this.a = context.getApplicationContext();
    }

    @TargetApi(26)
    private final Notification a(CharSequence charSequence, String str, int i2, Integer num, Uri uri, PendingIntent pendingIntent, PendingIntent pendingIntent2, String str2) {
        Notification.Builder smallIcon = new Notification.Builder(this.a).setAutoCancel(true).setSmallIcon(i2);
        if (!TextUtils.isEmpty(charSequence)) {
            smallIcon.setContentTitle(charSequence);
        }
        if (!TextUtils.isEmpty(str)) {
            smallIcon.setContentText(str);
            smallIcon.setStyle(new Notification.BigTextStyle().bigText(str));
        }
        if (num != null) {
            smallIcon.setColor(num.intValue());
        }
        if (uri != null) {
            smallIcon.setSound(uri);
        }
        if (pendingIntent != null) {
            smallIcon.setContentIntent(pendingIntent);
        }
        if (pendingIntent2 != null) {
            smallIcon.setDeleteIntent(pendingIntent2);
        }
        if (str2 != null) {
            if (this.f6684c == null) {
                this.f6684c = a("setChannelId");
            }
            if (this.f6684c == null) {
                this.f6684c = a("setChannel");
            }
            Method method = this.f6684c;
            if (method == null) {
                Log.e("FirebaseMessaging", "Error while setting the notification channel");
            } else {
                try {
                    method.invoke(smallIcon, str2);
                } catch (IllegalAccessException | IllegalArgumentException | SecurityException | InvocationTargetException e2) {
                    Log.e("FirebaseMessaging", "Error while setting the notification channel", e2);
                }
            }
        }
        return smallIcon.build();
    }

    private final Bundle a() {
        Bundle bundle = this.f6683b;
        if (bundle != null) {
            return bundle;
        }
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (applicationInfo == null || applicationInfo.metaData == null) {
            return Bundle.EMPTY;
        }
        this.f6683b = applicationInfo.metaData;
        return this.f6683b;
    }

    static synchronized e a(Context context) {
        e eVar;
        synchronized (e.class) {
            if (f6682f == null) {
                f6682f = new e(context);
            }
            eVar = f6682f;
        }
        return eVar;
    }

    static String a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    @TargetApi(26)
    private static Method a(String str) {
        try {
            return Notification.Builder.class.getMethod(str, String.class);
        } catch (NoSuchMethodException | SecurityException unused) {
            return null;
        }
    }

    private static void a(Intent intent, Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals("from")) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    @TargetApi(26)
    private final boolean a(int i2) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(this.a.getResources().getDrawable(i2, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i2);
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    private final Integer b(String str) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
                sb.append("Color ");
                sb.append(str);
                sb.append(" not valid. Notification will use default color.");
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        int i2 = a().getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i2 != 0) {
            try {
                return Integer.valueOf(a.a(this.a, i2));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    static String b(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        return a(bundle, "_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf));
    }

    static boolean b(Bundle bundle) {
        return "1".equals(a(bundle, "gcm.n.e")) || a(bundle, "gcm.n.icon") != null;
    }

    static Uri c(Bundle bundle) {
        String a2 = a(bundle, "gcm.n.link_android");
        if (TextUtils.isEmpty(a2)) {
            a2 = a(bundle, "gcm.n.link");
        }
        if (!TextUtils.isEmpty(a2)) {
            return Uri.parse(a2);
        }
        return null;
    }

    @TargetApi(26)
    private final String c(String str) {
        String str2;
        if (!n.l()) {
            return null;
        }
        NotificationManager notificationManager = (NotificationManager) this.a.getSystemService(NotificationManager.class);
        try {
            if (this.f6685d == null) {
                this.f6685d = notificationManager.getClass().getMethod("getNotificationChannel", String.class);
            }
            if (!TextUtils.isEmpty(str)) {
                if (this.f6685d.invoke(notificationManager, str) != null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 122);
                sb.append("Notification Channel requested (");
                sb.append(str);
                sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                Log.w("FirebaseMessaging", sb.toString());
            }
            String string = a().getString("com.google.firebase.messaging.default_notification_channel_id");
            if (!TextUtils.isEmpty(string)) {
                if (this.f6685d.invoke(notificationManager, string) != null) {
                    return string;
                }
                str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
            } else {
                str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
            }
            Log.w("FirebaseMessaging", str2);
            if (this.f6685d.invoke(notificationManager, "fcm_fallback_notification_channel") == null) {
                Class<?> cls = Class.forName("android.app.NotificationChannel");
                Object newInstance = cls.getConstructor(String.class, CharSequence.class, Integer.TYPE).newInstance("fcm_fallback_notification_channel", this.a.getString(b.fcm_fallback_notification_channel_label), 3);
                notificationManager.getClass().getMethod("createNotificationChannel", cls).invoke(notificationManager, newInstance);
            }
            return "fcm_fallback_notification_channel";
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | LinkageError | NoSuchMethodException | SecurityException | InvocationTargetException e2) {
            Log.e("FirebaseMessaging", "Error while setting the notification channel", e2);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.lang.String[] */
    /* JADX WARN: Multi-variable type inference failed */
    static Object[] c(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        String a2 = a(bundle, "_loc_args".length() != 0 ? valueOf.concat("_loc_args") : new String(valueOf));
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(a2);
            String[] strArr = new String[jSONArray.length()];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr[i2] = jSONArray.opt(i2);
            }
            return strArr;
        } catch (JSONException unused) {
            String valueOf2 = String.valueOf(str);
            String substring = ("_loc_args".length() != 0 ? valueOf2.concat("_loc_args") : new String(valueOf2)).substring(6);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 41 + String.valueOf(a2).length());
            sb.append("Malformed ");
            sb.append(substring);
            sb.append(": ");
            sb.append(a2);
            sb.append("  Default value will be used.");
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
    }

    static String d(Bundle bundle) {
        String a2 = a(bundle, "gcm.n.sound2");
        return TextUtils.isEmpty(a2) ? a(bundle, "gcm.n.sound") : a2;
    }

    private final String d(Bundle bundle, String str) {
        String a2 = a(bundle, str);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        String b2 = b(bundle, str);
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        Resources resources = this.a.getResources();
        int identifier = resources.getIdentifier(b2, "string", this.a.getPackageName());
        if (identifier == 0) {
            String valueOf = String.valueOf(str);
            String substring = ("_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf)).substring(6);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 49 + String.valueOf(b2).length());
            sb.append(substring);
            sb.append(" resource not found: ");
            sb.append(b2);
            sb.append(" Default value will be used.");
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
        Object[] c2 = c(bundle, str);
        if (c2 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, c2);
        } catch (MissingFormatArgumentException e2) {
            String arrays = Arrays.toString(c2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(b2).length() + 58 + String.valueOf(arrays).length());
            sb2.append("Missing format argument for ");
            sb2.append(b2);
            sb2.append(": ");
            sb2.append(arrays);
            sb2.append(" Default value will be used.");
            Log.w("FirebaseMessaging", sb2.toString(), e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.os.Bundle r15) {
        /*
        // Method dump skipped, instructions count: 758
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.e.a(android.os.Bundle):boolean");
    }
}
