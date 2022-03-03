package iiec.androidterm;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.util.Log;
import iiec.androidterm.TermService;
import iiec.androidterm.r.m;
import iiec.androidterm.t.c;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class RemoteInterface extends Activity {

    /* renamed from: f  reason: collision with root package name */
    public static RemoteInterface f9234f;

    /* renamed from: b  reason: collision with root package name */
    private c f9235b;

    /* renamed from: c  reason: collision with root package name */
    private TermService f9236c;

    /* renamed from: d  reason: collision with root package name */
    private Intent f9237d;

    /* renamed from: e  reason: collision with root package name */
    private ServiceConnection f9238e = new a();

    class a implements ServiceConnection {
        a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            RemoteInterface.this.f9236c = ((TermService.d) iBinder).a();
            RemoteInterface.this.b();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            RemoteInterface.this.f9236c = null;
        }
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append('\"');
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if ("\"\\$`!".indexOf(charAt) >= 0) {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        sb.append('\"');
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public TermService a() {
        return this.f9236c;
    }

    /* access modifiers changed from: protected */
    public String a(String str) {
        TermService a2 = a();
        String q = this.f9235b.q();
        if (str == null) {
            str = q;
        } else if (q != null) {
            str = q + "\r" + str;
        }
        try {
            m a3 = Term.a(this, this.f9235b, str);
            a3.a(a2);
            a2.a().add(a3);
            String uuid = UUID.randomUUID().toString();
            ((d) a3).d(uuid);
            Intent action = new Intent(getApplicationContext(), Term.class).setAction("iiec.androidterm.private.OPEN_NEW_WINDOW");
            action.addCategory("android.intent.category.DEFAULT");
            action.addFlags(268435456);
            startActivity(action);
            return uuid;
        } catch (IOException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public String a(String str, String str2) {
        d dVar;
        iiec.androidterm.t.a a2 = a().a();
        int i2 = 0;
        while (true) {
            if (i2 >= a2.size()) {
                dVar = null;
                break;
            }
            dVar = (d) a2.get(i2);
            String j2 = dVar.j();
            if (j2 != null && j2.equals(str)) {
                break;
            }
            i2++;
        }
        if (dVar == null) {
            return a(str2);
        }
        if (str2 != null) {
            dVar.b(str2);
            dVar.a(13);
        }
        Intent intent = new Intent("iiec.androidterm.private.SWITCH_WINDOW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(268435456);
        intent.putExtra("iiec.androidterm.private.target_window", i2);
        startActivity(intent);
        return str;
    }

    /* access modifiers changed from: protected */
    public void b() {
        String str;
        if (a() == null) {
            finish();
            return;
        }
        Intent intent = getIntent();
        if (!intent.getAction().equals("android.intent.action.SEND") || !intent.hasExtra("android.intent.extra.STREAM")) {
            str = null;
        } else {
            Object obj = intent.getExtras().get("android.intent.extra.STREAM");
            if (obj instanceof Uri) {
                String path = ((Uri) obj).getPath();
                File file = new File(path);
                if (!file.isDirectory()) {
                    path = file.getParent();
                }
                str = "cd " + b(path);
            }
            finish();
        }
        a(str);
        finish();
    }

    public void finish() {
        iiec.androidterm.t.a a2;
        ServiceConnection serviceConnection = this.f9238e;
        if (serviceConnection != null) {
            unbindService(serviceConnection);
            TermService termService = this.f9236c;
            if (termService != null && ((a2 = termService.a()) == null || a2.size() == 0)) {
                stopService(this.f9237d);
            }
            this.f9238e = null;
            this.f9236c = null;
        }
        super.finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f9234f = this;
        this.f9235b = new c(getResources(), PreferenceManager.getDefaultSharedPreferences(this));
        Intent intent = new Intent(this, TermService.class);
        this.f9237d = intent;
        startService(intent);
        if (!bindService(intent, this.f9238e, 1)) {
            Log.e("Term", "bind to service failed!");
            finish();
        }
    }
}
