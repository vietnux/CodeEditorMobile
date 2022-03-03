package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.i;
import androidx.fragment.app.e;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.n;
import e.b.b.a.a.b;

public class g extends h {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f3608d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static final g f3609e = new g();

    /* renamed from: c  reason: collision with root package name */
    private String f3610c;

    /* access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    public class a extends Handler {
        private final Context a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i2);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int b2 = g.this.b(this.a);
            if (g.this.b(b2)) {
                g.this.b(this.a, b2);
            }
        }
    }

    g() {
    }

    static Dialog a(Context context, int i2, i iVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(f.b(context, i2));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String a2 = f.a(context, i2);
        if (a2 != null) {
            builder.setPositiveButton(a2, iVar);
        }
        String e2 = f.e(context, i2);
        if (e2 != null) {
            builder.setTitle(e2);
        }
        return builder.create();
    }

    public static g a() {
        return f3609e;
    }

    @TargetApi(26)
    private final String a(Context context, NotificationManager notificationManager) {
        y.b(n.l());
        String b2 = b();
        if (b2 == null) {
            b2 = "com.google.android.gms.availability";
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(b2);
            String b3 = f.b(context);
            if (notificationChannel == null) {
                notificationChannel = new NotificationChannel(b2, b3, 4);
            } else if (!b3.equals(notificationChannel.getName())) {
                notificationChannel.setName(b3);
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return b2;
    }

    static void a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof e) {
            q.a(dialog, onCancelListener).a(((e) activity).k(), str);
            return;
        }
        d.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    private final void a(Context context, int i2, String str, PendingIntent pendingIntent) {
        Notification notification;
        int i3;
        if (i2 == 18) {
            c(context);
        } else if (pendingIntent != null) {
            String d2 = f.d(context, i2);
            String c2 = f.c(context, i2);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (com.google.android.gms.common.util.i.c(context)) {
                y.b(n.h());
                Notification.Builder style = new Notification.Builder(context).setSmallIcon(context.getApplicationInfo().icon).setPriority(2).setAutoCancel(true).setContentTitle(d2).setStyle(new Notification.BigTextStyle().bigText(c2));
                if (com.google.android.gms.common.util.i.d(context)) {
                    style.addAction(e.b.b.a.a.a.common_full_open_on_phone, resources.getString(b.common_open_on_phone), pendingIntent);
                } else {
                    style.setContentIntent(pendingIntent);
                }
                if (n.l() && n.l()) {
                    style.setChannelId(a(context, notificationManager));
                }
                notification = style.build();
            } else {
                i.d dVar = new i.d(context);
                dVar.b(17301642);
                dVar.c(resources.getString(b.common_google_play_services_notification_ticker));
                dVar.a(System.currentTimeMillis());
                dVar.a(true);
                dVar.a(pendingIntent);
                dVar.b(d2);
                dVar.a((CharSequence) c2);
                dVar.b(true);
                i.b bVar = new i.b();
                bVar.a(c2);
                dVar.a(bVar);
                if (n.l() && n.l()) {
                    dVar.a(a(context, notificationManager));
                }
                notification = dVar.a();
            }
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                i3 = 10436;
                n.zzbt.set(false);
            } else {
                i3 = 39789;
            }
            if (str == null) {
                notificationManager.notify(i3, notification);
            } else {
                notificationManager.notify(str, i3, notification);
            }
        } else if (i2 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    private final String b() {
        String str;
        synchronized (f3608d) {
            str = this.f3610c;
        }
        return str;
    }

    @Override // com.google.android.gms.common.h
    public int a(Context context) {
        return super.a(context);
    }

    @Override // com.google.android.gms.common.h
    public int a(Context context, int i2) {
        return super.a(context, i2);
    }

    public Dialog a(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        return a(activity, i2, com.google.android.gms.common.internal.i.a(activity, a(activity, i2, "d"), i3), onCancelListener);
    }

    @Override // com.google.android.gms.common.h
    public PendingIntent a(Context context, int i2, int i3) {
        return super.a(context, i2, i3);
    }

    @Override // com.google.android.gms.common.h
    public PendingIntent a(Context context, int i2, int i3, String str) {
        return super.a(context, i2, i3, str);
    }

    public PendingIntent a(Context context, b bVar) {
        return bVar.w() ? bVar.v() : a(context, bVar.t(), 0);
    }

    @Override // com.google.android.gms.common.h
    public Intent a(Context context, int i2, String str) {
        return super.a(context, i2, str);
    }

    @Override // com.google.android.gms.common.h
    public final String a(int i2) {
        return super.a(i2);
    }

    public boolean a(Context context, b bVar, int i2) {
        PendingIntent a2 = a(context, bVar);
        if (a2 == null) {
            return false;
        }
        a(context, bVar.t(), (String) null, GoogleApiActivity.a(context, a2, i2));
        return true;
    }

    @Override // com.google.android.gms.common.h
    public int b(Context context) {
        return super.b(context);
    }

    public void b(Context context, int i2) {
        b(context, i2, null);
    }

    public void b(Context context, int i2, String str) {
        a(context, i2, str, a(context, i2, 0, "n"));
    }

    @Override // com.google.android.gms.common.h
    public final boolean b(int i2) {
        return super.b(i2);
    }

    public boolean b(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a2 = a(activity, i2, i3, onCancelListener);
        if (a2 == null) {
            return false;
        }
        a(activity, a2, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void c(Context context) {
        new a(context).sendEmptyMessageDelayed(1, 120000);
    }
}
