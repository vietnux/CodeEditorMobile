package qwe.qweqwe.texteditor;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.preference.PreferenceManager;
import androidx.appcompat.app.g;
import com.google.ads.consent.ConsentInformation;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;

public abstract class b0 extends Application {

    /* renamed from: c  reason: collision with root package name */
    protected static boolean f9604c = false;

    /* renamed from: d  reason: collision with root package name */
    protected static boolean f9605d = false;

    /* renamed from: e  reason: collision with root package name */
    protected static String f9606e = "";

    /* renamed from: b  reason: collision with root package name */
    private boolean f9607b = false;

    public static String a() {
        return b().replace(".pro", "").replace("ru.iiec.", "");
    }

    public static String b() {
        return f9606e;
    }

    public static boolean c() {
        return f9604c;
    }

    public static boolean d() {
        return f9605d;
    }

    public static String getProcessName() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            return (String) Class.forName("android.app.ActivityThread").getDeclaredMethod(Build.VERSION.SDK_INT >= 18 ? "currentProcessName" : "currentPackageName", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(boolean z);

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        try {
            if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean("dark_theme", false)) {
                g.e(2);
            } else {
                g.e(-1);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        super.attachBaseContext(context);
    }

    public void b(boolean z) {
        if (!this.f9607b) {
            if (z) {
                this.f9607b = true;
            }
            a(z);
            i0.a("BaseApp", "enableFirebase: " + z);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            throw new RuntimeException("Failed");
        } catch (Exception e2) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            e2.printStackTrace(printWriter);
            printWriter.close();
            String stringBuffer = stringWriter.getBuffer().toString();
            if (stringBuffer.contains(" np.manager.") || stringBuffer.contains(" com.ysh.hook.") || stringBuffer.contains(" com.minusoneapp.") || stringBuffer.contains(" np.App") || stringBuffer.contains(" bin.mt.") || stringBuffer.contains("signaturekiller")) {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e3) {
                        e3.printStackTrace();
                    }
                }
            } else {
                try {
                    if (!getProcessName().contains(":")) {
                        boolean d2 = ConsentInformation.a(this).d();
                        i0.a("BaseApp", "isRequestLocationInEeaOrUnknown: " + d2);
                        b(PreferenceManager.getDefaultSharedPreferences(this).getBoolean("pref_consent", !d2));
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }
}
