package f.a.a.a.n.b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import f.a.a.a.c;
import f.a.a.a.l;

public class g {
    /* access modifiers changed from: protected */
    public String a() {
        return "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
    }

    /* access modifiers changed from: protected */
    public String a(Context context) {
        return new o().a(context);
    }

    /* access modifiers changed from: protected */
    public String b(Context context) {
        Exception e2;
        String str = null;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("io.fabric.ApiKey");
            try {
                if ("@string/twitter_consumer_secret".equals(string)) {
                    c.g().e("Fabric", "Ignoring bad default value for Fabric ApiKey set by FirebaseUI-Auth");
                } else {
                    str = string;
                }
                if (str != null) {
                    return str;
                }
                c.g().e("Fabric", "Falling back to Crashlytics key lookup from Manifest");
                return bundle.getString("com.crashlytics.ApiKey");
            } catch (Exception e3) {
                e2 = e3;
                str = string;
                l g2 = c.g();
                g2.e("Fabric", "Caught non-fatal exception while retrieving apiKey: " + e2);
                return str;
            }
        } catch (Exception e4) {
            e2 = e4;
            l g22 = c.g();
            g22.e("Fabric", "Caught non-fatal exception while retrieving apiKey: " + e2);
            return str;
        }
    }

    /* access modifiers changed from: protected */
    public String c(Context context) {
        int a = i.a(context, "io.fabric.ApiKey", "string");
        if (a == 0) {
            c.g().e("Fabric", "Falling back to Crashlytics key lookup from Strings");
            a = i.a(context, "com.crashlytics.ApiKey", "string");
        }
        if (a != 0) {
            return context.getResources().getString(a);
        }
        return null;
    }

    public String d(Context context) {
        String b2 = b(context);
        if (TextUtils.isEmpty(b2)) {
            b2 = c(context);
        }
        if (TextUtils.isEmpty(b2)) {
            b2 = a(context);
        }
        if (TextUtils.isEmpty(b2)) {
            e(context);
        }
        return b2;
    }

    /* access modifiers changed from: protected */
    public void e(Context context) {
        if (c.i() || i.j(context)) {
            throw new IllegalArgumentException(a());
        }
        c.g().c("Fabric", a());
    }
}
