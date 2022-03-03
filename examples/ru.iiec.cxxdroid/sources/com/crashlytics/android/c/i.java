package com.crashlytics.android.c;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;

public class i implements n {
    private final Method a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f2846b;

    public i(Object obj, Method method) {
        this.f2846b = obj;
        this.a = method;
    }

    private static Class a(Context context) {
        try {
            return context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement");
        } catch (Exception unused) {
            return null;
        }
    }

    private static Object a(Context context, Class cls) {
        try {
            return cls.getDeclaredMethod("getInstance", Context.class).invoke(cls, context);
        } catch (Exception unused) {
            return null;
        }
    }

    public static n b(Context context) {
        Object a2;
        Method b2;
        Class a3 = a(context);
        if (a3 == null || (a2 = a(context, a3)) == null || (b2 = b(context, a3)) == null) {
            return null;
        }
        return new i(a2, b2);
    }

    private static Method b(Context context, Class cls) {
        try {
            return cls.getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.crashlytics.android.c.n
    public void a(String str, Bundle bundle) {
        a("fab", str, bundle);
    }

    @Override // com.crashlytics.android.c.n
    public void a(String str, String str2, Bundle bundle) {
        try {
            this.a.invoke(this.f2846b, str, str2, bundle);
        } catch (Exception unused) {
        }
    }
}
