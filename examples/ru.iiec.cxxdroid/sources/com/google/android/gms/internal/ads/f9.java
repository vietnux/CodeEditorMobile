package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.x0;
import java.math.BigInteger;
import java.util.Locale;

@k2
public final class f9 {
    private static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static String f4288b;

    public static String a() {
        String str;
        synchronized (a) {
            str = f4288b;
        }
        return str;
    }

    public static String a(Context context, String str, String str2) {
        String str3;
        String str4;
        synchronized (a) {
            if (f4288b == null && !TextUtils.isEmpty(str)) {
                try {
                    ClassLoader classLoader = context.createPackageContext(str2, 3).getClassLoader();
                    Class<?> cls = Class.forName("com.google.ads.mediation.MediationAdapter", false, classLoader);
                    BigInteger bigInteger = new BigInteger(new byte[1]);
                    String[] split = str.split(",");
                    BigInteger bigInteger2 = bigInteger;
                    for (int i2 = 0; i2 < split.length; i2++) {
                        x0.f();
                        if (u9.a(classLoader, cls, split[i2])) {
                            bigInteger2 = bigInteger2.setBit(i2);
                        }
                    }
                    str4 = String.format(Locale.US, "%X", bigInteger2);
                } catch (Throwable unused) {
                    str4 = "err";
                }
                f4288b = str4;
            }
            str3 = f4288b;
        }
        return str3;
    }
}
