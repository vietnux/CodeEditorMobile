package com.crashlytics.android.e;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import f.a.a.a.c;
import f.a.a.a.l;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class u implements b {
    private final l a;

    /* access modifiers changed from: package-private */
    public class a implements InvocationHandler {
        a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (objArr.length == 4) {
                String str = (String) objArr[0];
                String str2 = (String) objArr[1];
                Bundle bundle = (Bundle) objArr[2];
                if (str == null || str.equals(AppMeasurement.CRASH_ORIGIN)) {
                    return null;
                }
                u.b(u.this.a, str2, bundle);
                return null;
            }
            throw new RuntimeException("Unexpected AppMeasurement.OnEventListener signature");
        }
    }

    private u(l lVar) {
        this.a = lVar;
    }

    static b a(l lVar) {
        return new u(lVar);
    }

    private Class<?> a(String str) {
        try {
            return this.a.j().getClassLoader().loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private Object a(Class<?> cls) {
        try {
            return cls.getDeclaredMethod("getInstance", Context.class).invoke(cls, this.a.j());
        } catch (Exception unused) {
            return null;
        }
    }

    private static String a(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    private boolean a(Class<?> cls, Object obj, String str) {
        l g2;
        StringBuilder sb;
        String str2;
        Class<?> a2 = a("com.google.android.gms.measurement.AppMeasurement$OnEventListener");
        try {
            cls.getDeclaredMethod(str, a2).invoke(obj, b(a2));
            return true;
        } catch (NoSuchMethodException e2) {
            e = e2;
            g2 = c.g();
            sb = new StringBuilder();
            str2 = "Expected method missing: ";
            sb.append(str2);
            sb.append(str);
            g2.b("CrashlyticsCore", sb.toString(), e);
            return false;
        } catch (InvocationTargetException e3) {
            e = e3;
            g2 = c.g();
            sb = new StringBuilder();
            str2 = "Cannot invoke method: ";
            sb.append(str2);
            sb.append(str);
            g2.b("CrashlyticsCore", sb.toString(), e);
            return false;
        } catch (IllegalAccessException e4) {
            e = e4;
            g2 = c.g();
            sb = new StringBuilder();
            str2 = "Cannot access method: ";
            sb.append(str2);
            sb.append(str);
            g2.b("CrashlyticsCore", sb.toString(), e);
            return false;
        }
    }

    private Object b(Class cls) {
        return Proxy.newProxyInstance(this.a.j().getClassLoader(), new Class[]{cls}, new a());
    }

    /* access modifiers changed from: private */
    public static void b(l lVar, String str, Bundle bundle) {
        try {
            lVar.a("$A$:" + a(str, bundle));
        } catch (JSONException unused) {
            l g2 = c.g();
            g2.a("CrashlyticsCore", "Unable to serialize Firebase Analytics event; " + str);
        }
    }

    @Override // com.crashlytics.android.e.b
    public boolean a() {
        l g2;
        String str;
        Class<?> a2 = a("com.google.android.gms.measurement.AppMeasurement");
        if (a2 == null) {
            g2 = c.g();
            str = "Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.";
        } else {
            Object a3 = a(a2);
            if (a3 != null) {
                return a(a2, a3, "registerOnMeasurementEventListener");
            }
            g2 = c.g();
            str = "Could not create an instance of Firebase Analytics.";
        }
        g2.a("CrashlyticsCore", str);
        return false;
    }
}
