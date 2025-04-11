package e.c.a.p;

import android.content.Context;
import android.content.pm.PackageInfo;
import g.r.d.i;

public final class b {
    public static final int a(Context context, String str) {
        i.d(context, "$this$getRawResourceId");
        i.d(str, "aString");
        return context.getResources().getIdentifier(str, "raw", context.getPackageName());
    }

    public static final PackageInfo a(Context context) {
        i.d(context, "$this$getPackageInfo");
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Boolean a(Context context, Boolean bool, String str) {
        i.d(context, "$this$extractBooleanBundleOrResource");
        i.d(str, "resName");
        if (bool != null) {
            return bool;
        }
        String b2 = b(context, str);
        if (b2.length() > 0) {
            try {
                return Boolean.valueOf(Boolean.parseBoolean(b2));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static final String a(Context context, String str, String str2) {
        i.d(context, "$this$extractStringBundleOrResource");
        i.d(str2, "resName");
        if (str != null) {
            return str;
        }
        String b2 = b(context, str2);
        if (b2.length() > 0) {
            return b2;
        }
        return null;
    }

    public static final String b(Context context, String str) {
        i.d(context, "$this$getStringResourceByName");
        i.d(str, "aString");
        int identifier = context.getResources().getIdentifier(str, "string", context.getPackageName());
        if (identifier == 0) {
            return "";
        }
        String string = context.getString(identifier);
        i.a((Object) string, "getString(resId)");
        return string;
    }
}
