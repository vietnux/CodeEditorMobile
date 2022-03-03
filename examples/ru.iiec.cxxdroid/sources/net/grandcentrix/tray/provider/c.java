package net.grandcentrix.tray.provider;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Process;
import android.util.Log;
import h.b.a.a;
import h.b.a.c.h;
import h.b.a.c.i;
import java.util.List;

/* access modifiers changed from: package-private */
public class c {
    static String a;

    private static Uri a(Context context, String str) {
        String d2 = d(context);
        return Uri.withAppendedPath(Uri.parse("content://" + d2), str);
    }

    private static void a(Context context) {
        if (!"legacyTrayAuthority".equals(context.getString(a.tray__authority))) {
            Log.e("Tray", "Deprecated way of defining the Tray authority detected\n#########################################\n#########################################\n#########################################\nDon't set the authority with `tray__authority` in your build.gradle.\nTo change the default authority override it inside the AndroidManifest\nSee https://github.com/grandcentrix/tray/wiki/Custom-Authority for instructions\n#########################################\n#########################################\n#########################################\n");
        }
    }

    public static Uri b(Context context) {
        return a(context, "preferences");
    }

    static Uri c(Context context) {
        return a(context, "internal_preferences");
    }

    private static synchronized String d(Context context) {
        synchronized (c.class) {
            if (a != null) {
                return a;
            }
            a(context);
            List<ProviderInfo> queryContentProviders = context.getPackageManager().queryContentProviders(context.getPackageName(), Process.myUid(), 0);
            if (queryContentProviders != null) {
                for (ProviderInfo providerInfo : queryContentProviders) {
                    if (providerInfo.name.equals(TrayContentProvider.class.getName())) {
                        a = providerInfo.authority;
                        h.b("found authority: " + a);
                        return a;
                    }
                }
            }
            throw new i("Internal tray error. Could not find the provider authority. Please fill an issue at https://github.com/grandcentrix/tray/issues");
        }
    }
}
