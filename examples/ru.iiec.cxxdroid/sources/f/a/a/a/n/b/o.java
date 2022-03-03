package f.a.a.a.n.b;

import android.content.Context;
import android.text.TextUtils;
import f.a.a.a.c;

public class o {
    /* access modifiers changed from: protected */
    public String a(Context context) {
        int a = i.a(context, "google_app_id", "string");
        if (a == 0) {
            return null;
        }
        c.g().e("Fabric", "Generating Crashlytics ApiKey from google_app_id in Strings");
        return a(context.getResources().getString(a));
    }

    /* access modifiers changed from: protected */
    public String a(String str) {
        return i.d(str).substring(0, 40);
    }

    public boolean b(Context context) {
        if (i.a(context, "com.crashlytics.useFirebaseAppId", false)) {
            return true;
        }
        return (i.a(context, "google_app_id", "string") != 0) && !(!TextUtils.isEmpty(new g().b(context)) || !TextUtils.isEmpty(new g().c(context)));
    }
}
