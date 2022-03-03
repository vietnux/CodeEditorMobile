package m.a.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import org.json.JSONObject;

public class b {
    Thread a;

    /* renamed from: b  reason: collision with root package name */
    LocalServerSocket f9536b = null;

    /* renamed from: c  reason: collision with root package name */
    LocalSocket f9537c = null;

    /* renamed from: d  reason: collision with root package name */
    Activity f9538d = null;

    /* renamed from: e  reason: collision with root package name */
    String f9539e = null;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f9540f = new a();

    /* renamed from: g  reason: collision with root package name */
    String f9541g = null;

    class a implements Runnable {
        a() {
        }

        public void run() {
            while (true) {
                try {
                    LocalSocket accept = b.this.f9536b.accept();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
                    OutputStream outputStream = accept.getOutputStream();
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            outputStream.write(b.this.b(readLine).getBytes());
                            outputStream.write("\n".getBytes());
                            outputStream.flush();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            bufferedReader.close();
                            outputStream.close();
                        } catch (Throwable th) {
                            bufferedReader.close();
                            outputStream.close();
                            accept.close();
                            throw th;
                        }
                    }
                    bufferedReader.close();
                    outputStream.close();
                    accept.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m.a.a.b$b  reason: collision with other inner class name */
    public class RunnableC0151b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Intent f9543b;

        RunnableC0151b(Intent intent) {
            this.f9543b = intent;
        }

        public void run() {
            try {
                b.this.f9538d.startActivity(this.f9543b);
            } catch (Exception e2) {
                Activity activity = b.this.f9538d;
                Toast.makeText(activity, "Unable to start activity for " + this.f9543b.getAction() + "/" + this.f9543b.getDataString(), 0).show();
                e2.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Intent f9545b;

        c(Intent intent) {
            this.f9545b = intent;
        }

        public void run() {
            b.this.f9538d.sendBroadcast(this.f9545b);
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements Runnable {

        class a implements DialogInterface.OnClickListener {
            a(d dVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
            }
        }

        /* renamed from: m.a.a.b$d$b  reason: collision with other inner class name */
        class DialogInterface$OnClickListenerC0152b implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC0152b() {
            }

            public void onClick(DialogInterface dialogInterface, int i2) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("market://details?id=ru.iiec.pydroidpermissionsplugin"));
                b.this.f9538d.startActivityForResult(intent, 16385);
            }
        }

        d() {
        }

        public void run() {
            new AlertDialog.Builder(b.this.f9538d).setTitle(a.pydroid_need_permplugin).setMessage(a.pydroid_need_permplugin_desc).setPositiveButton(a.pydroid_need_permplugin_get, new DialogInterface$OnClickListenerC0152b()).setNegativeButton(a.cancel, new a(this)).show();
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9549b;

        e(String str) {
            this.f9549b = str;
        }

        public void run() {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("ru.iiec.pydroidpermissionsplugin", "ru.iiec.pydroidpermissionsplugin.RequestActivity"));
                intent.putExtra("permissions", new String[]{this.f9549b});
                b.this.f9538d.startActivityForResult(intent, 16386);
            } catch (ActivityNotFoundException e2) {
                e2.printStackTrace();
            }
        }
    }

    public b(Activity activity) {
        this.f9539e = activity.getFilesDir() + "/" + "RPCServer.socket";
        new File(this.f9539e).delete();
        this.f9537c = new LocalSocket();
        for (int i2 = 5; i2 > 0; i2--) {
            try {
                new File(this.f9539e).delete();
                this.f9537c.bind(new LocalSocketAddress(this.f9539e, LocalSocketAddress.Namespace.FILESYSTEM));
                break;
            } catch (IOException e2) {
                try {
                    Thread.sleep(300);
                } catch (Exception unused) {
                }
                e2.printStackTrace();
            }
        }
        try {
            this.f9536b = new LocalServerSocket(this.f9537c.getFileDescriptor());
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        this.f9538d = activity;
        this.a = new Thread(this.f9540f);
        this.a.setDaemon(true);
        this.a.setName("RPCServer Main Listener");
        this.a.start();
    }

    public void a() {
        try {
            this.f9536b.close();
            this.f9537c.close();
        } catch (Exception e2) {
            Log.w("RPCServer", "Could not stop all connections", e2);
        }
        this.f9536b = null;
        this.f9537c = null;
        this.f9538d = null;
        new File(this.f9539e).delete();
    }

    public void a(int i2, int i3, Intent intent) {
        String str;
        if (i2 == 16385 && (str = this.f9541g) != null && Build.VERSION.SDK_INT >= 23) {
            a(str);
            this.f9541g = null;
        }
    }

    public void a(String str) {
        this.f9538d.runOnUiThread(new e(str));
    }

    public String b(String str) {
        String str2;
        Activity activity;
        Runnable cVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            String string = jSONObject.getString("method");
            if (string.equals("launch-intent")) {
                Intent intent = new Intent();
                if (jSONObject.has("action")) {
                    intent.setAction(jSONObject.getString("action"));
                }
                if (jSONObject.has("data")) {
                    intent.setData(Uri.parse(jSONObject.getString("data")));
                }
                activity = this.f9538d;
                cVar = new RunnableC0151b(intent);
            } else if (string.equals("send-broadcast")) {
                Intent intent2 = new Intent();
                intent2.setAction(jSONObject.getString("action"));
                activity = this.f9538d;
                cVar = new c(intent2);
            } else {
                if (string.equals("request-permission") && jSONObject.optString("for", "unknown").equals("pydroid3")) {
                    boolean z = true;
                    try {
                        this.f9538d.getPackageManager().getPackageInfo("ru.iiec.pydroidpermissionsplugin", 1);
                    } catch (PackageManager.NameNotFoundException unused) {
                        z = false;
                    }
                    this.f9541g = jSONObject.getString("permission");
                    if (!z) {
                        this.f9538d.runOnUiThread(new d());
                        str2 = "not_installed";
                    } else if (this.f9538d.getPackageManager().checkPermission(jSONObject.getString("permission"), this.f9538d.getPackageName()) != 0) {
                        if (Build.VERSION.SDK_INT >= 23) {
                            a(this.f9541g);
                            this.f9541g = null;
                        }
                        str2 = "denied";
                    } else {
                        str2 = "granted";
                    }
                    jSONObject2.put("result", str2);
                }
                return jSONObject2.toString();
            }
            activity.runOnUiThread(cVar);
            return jSONObject2.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return new JSONObject().toString();
        }
    }
}
