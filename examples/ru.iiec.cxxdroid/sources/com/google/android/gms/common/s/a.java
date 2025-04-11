package com.google.android.gms.common.s;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.d;
import java.util.Collections;
import java.util.List;

public class a {
    private static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f3710b;

    private a() {
        List list = Collections.EMPTY_LIST;
    }

    public static a a() {
        if (f3710b == null) {
            synchronized (a) {
                if (f3710b == null) {
                    f3710b = new a();
                }
            }
        }
        return f3710b;
    }

    @SuppressLint({"UntrackedBindService"})
    private static boolean a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i2, boolean z) {
        if (z) {
            ComponentName component = intent.getComponent();
            if (component == null ? false : d.c(context, component.getPackageName())) {
                Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                return false;
            }
        }
        return context.bindService(intent, serviceConnection, i2);
    }

    public void a(Context context, ServiceConnection serviceConnection) {
    }

    public void a(Context context, ServiceConnection serviceConnection, String str, Intent intent) {
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i2) {
        return a(context, context.getClass().getName(), intent, serviceConnection, i2);
    }

    public boolean a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i2) {
        return a(context, str, intent, serviceConnection, i2, true);
    }

    @SuppressLint({"UntrackedBindService"})
    public void b(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }
}
