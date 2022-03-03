package iiec.androidterm;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import iiec.androidterm.r.m;
import iiec.androidterm.s.a.a;
import java.util.Iterator;
import java.util.UUID;

public class TermService extends Service implements m.d {

    /* renamed from: e  reason: collision with root package name */
    public static String f9244e;

    /* renamed from: b  reason: collision with root package name */
    private iiec.androidterm.compat.d f9245b;

    /* renamed from: c  reason: collision with root package name */
    private iiec.androidterm.t.a f9246c;

    /* renamed from: d  reason: collision with root package name */
    private final IBinder f9247d = new d();

    private final class b extends a.AbstractBinderC0148a {

        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ParcelFileDescriptor f9249b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f9250c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f9251d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ PendingIntent f9252e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ ResultReceiver f9253f;

            a(ParcelFileDescriptor parcelFileDescriptor, String str, String str2, PendingIntent pendingIntent, ResultReceiver resultReceiver) {
                this.f9249b = parcelFileDescriptor;
                this.f9250c = str;
                this.f9251d = str2;
                this.f9252e = pendingIntent;
                this.f9253f = resultReceiver;
            }

            public void run() {
                a aVar;
                Exception e2;
                try {
                    aVar = new a(this.f9249b, new iiec.androidterm.t.c(TermService.this.getResources(), PreferenceManager.getDefaultSharedPreferences(TermService.this.getApplicationContext())), this.f9250c);
                    try {
                        TermService.this.f9246c.add(aVar);
                        aVar.d(this.f9251d);
                        aVar.a(new c(this.f9252e, this.f9253f));
                        aVar.a("");
                        aVar.a(80, 24);
                    } catch (Exception e3) {
                        e2 = e3;
                    }
                } catch (Exception e4) {
                    aVar = null;
                    e2 = e4;
                    Log.e("TermService", "Failed to bootstrap AIDL session: " + e2.getMessage());
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            }
        }

        private b() {
        }

        @Override // iiec.androidterm.s.a.a
        public IntentSender a(ParcelFileDescriptor parcelFileDescriptor, ResultReceiver resultReceiver) {
            String uuid = UUID.randomUUID().toString();
            int i2 = 0;
            PendingIntent activity = PendingIntent.getActivity(TermService.this.getApplicationContext(), uuid.hashCode(), new Intent(TermService.this.getApplicationContext(), Term.class).setAction("iiec.androidterm.private.OPEN_NEW_WINDOW").setData(Uri.parse(uuid)).addCategory("android.intent.category.DEFAULT").addFlags(268435456).putExtra("iiec.androidterm.private.target_window", uuid), 0);
            PackageManager packageManager = TermService.this.getPackageManager();
            String[] packagesForUid = packageManager.getPackagesForUid(Binder.getCallingUid());
            if (packagesForUid == null || packagesForUid.length == 0) {
                return null;
            }
            int length = packagesForUid.length;
            int i3 = 0;
            while (i3 < length) {
                try {
                    ApplicationInfo applicationInfo = packageManager.getPackageInfo(packagesForUid[i3], i2).applicationInfo;
                    if (applicationInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
                        if (!TextUtils.isEmpty(applicationLabel)) {
                            new Handler(Looper.getMainLooper()).post(new a(parcelFileDescriptor, applicationLabel.toString(), uuid, activity, resultReceiver));
                            return activity.getIntentSender();
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                i3++;
                i2 = 0;
            }
            return null;
        }
    }

    private final class c implements m.d {

        /* renamed from: b  reason: collision with root package name */
        private final PendingIntent f9255b;

        /* renamed from: c  reason: collision with root package name */
        private final ResultReceiver f9256c;

        public c(PendingIntent pendingIntent, ResultReceiver resultReceiver) {
            this.f9255b = pendingIntent;
            this.f9256c = resultReceiver;
        }

        @Override // iiec.androidterm.r.m.d
        public void a(m mVar) {
            this.f9255b.cancel();
            this.f9256c.send(0, new Bundle());
            TermService.this.f9246c.remove(mVar);
        }
    }

    public class d extends Binder {
        public d() {
        }

        /* access modifiers changed from: package-private */
        public TermService a() {
            Log.i("TermService", "Activity binding to service");
            return TermService.this;
        }
    }

    public iiec.androidterm.t.a a() {
        return this.f9246c;
    }

    @Override // iiec.androidterm.r.m.d
    public void a(m mVar) {
        this.f9246c.remove(mVar);
    }

    public void b() {
        try {
            Intent intent = new Intent(this, Term.class);
            intent.addFlags(268435456);
            Notification.Builder smallIcon = new Notification.Builder(this).setContentIntent(PendingIntent.getActivity(this, 0, intent, 0)).setTicker(getText(m.service_notify_text)).setContentText(getText(m.service_notify_text)).setSmallIcon(h.ic_stat_service_notification_icon);
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("terminal_notification_channel", "Terminal", 2);
                notificationChannel.setDescription("Notifications from Terminal");
                NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                smallIcon.setChannelId("terminal_notification_channel");
            }
            this.f9245b.a(1, smallIcon.build());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public IBinder onBind(Intent intent) {
        if ("iiec.androidterm.action.START_TERM.v1".equals(intent.getAction())) {
            Log.i("TermService", "Outside process called onBind()");
            return new b();
        }
        Log.i("TermService", "Activity called onBind()");
        return this.f9247d;
    }

    public void onCreate() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        String absolutePath = getDir("HOME", 0).getAbsolutePath();
        f9244e = absolutePath;
        edit.putString("home_path", defaultSharedPreferences.getString("home_path", absolutePath));
        edit.commit();
        this.f9245b = new iiec.androidterm.compat.d(this);
        this.f9246c = new iiec.androidterm.t.a();
        Log.d("Term", "TermService started");
    }

    public void onDestroy() {
        try {
            this.f9245b.a(true);
            Iterator it = this.f9246c.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                mVar.a((m.d) null);
                mVar.a();
            }
            this.f9246c.clear();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onStart(Intent intent, int i2) {
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        return 1;
    }
}
