package iiec.androidterm.compat;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class d {

    /* renamed from: g  reason: collision with root package name */
    private static Class<?>[] f9297g = {Boolean.TYPE};

    /* renamed from: h  reason: collision with root package name */
    private static Class<?>[] f9298h = {Integer.TYPE, Notification.class};

    /* renamed from: i  reason: collision with root package name */
    private static Class<?>[] f9299i = {Boolean.TYPE};
    private Service a;

    /* renamed from: b  reason: collision with root package name */
    private NotificationManager f9300b;

    /* renamed from: c  reason: collision with root package name */
    private Method f9301c;

    /* renamed from: d  reason: collision with root package name */
    private Method f9302d;

    /* renamed from: e  reason: collision with root package name */
    private Method f9303e;

    /* renamed from: f  reason: collision with root package name */
    private int f9304f;

    public d(Service service) {
        this.a = service;
        this.f9300b = (NotificationManager) service.getSystemService("notification");
        Class<?> cls = service.getClass();
        try {
            this.f9302d = cls.getMethod("startForeground", f9298h);
            this.f9303e = cls.getMethod("stopForeground", f9299i);
        } catch (NoSuchMethodException unused) {
            this.f9303e = null;
            this.f9302d = null;
        }
        try {
            this.f9301c = cls.getMethod("setForeground", f9297g);
        } catch (NoSuchMethodException unused2) {
            this.f9301c = null;
        }
        if (this.f9302d == null && this.f9301c == null) {
            throw new IllegalStateException("Neither startForeground() or setForeground() present!");
        }
    }

    private void a(Object obj, Method method, Object... objArr) {
        String str;
        Throwable e2;
        try {
            method.invoke(obj, objArr);
            return;
        } catch (IllegalAccessException e3) {
            e2 = e3;
            str = "Unable to invoke method";
        } catch (InvocationTargetException e4) {
            e2 = e4.getCause();
            str = "Method threw exception";
        }
        Log.w("ServiceCompat", str, e2);
    }

    public void a(int i2, Notification notification) {
        Method method = this.f9302d;
        if (method != null) {
            a(this.a, method, Integer.valueOf(i2), notification);
            return;
        }
        a(this.a, this.f9301c, Boolean.TRUE);
        this.f9300b.notify(i2, notification);
        this.f9304f = i2;
    }

    public void a(boolean z) {
        Method method = this.f9303e;
        if (method != null) {
            a(this.a, method, Boolean.valueOf(z));
            return;
        }
        if (z) {
            this.f9300b.cancel(this.f9304f);
        }
        a(this.a, this.f9301c, Boolean.FALSE);
    }
}
