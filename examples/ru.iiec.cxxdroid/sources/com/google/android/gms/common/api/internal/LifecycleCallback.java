package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {

    /* renamed from: b  reason: collision with root package name */
    protected final h f3491b;

    protected LifecycleCallback(h hVar) {
        this.f3491b = hVar;
    }

    public static h a(Activity activity) {
        return a(new g(activity));
    }

    protected static h a(g gVar) {
        if (gVar.a()) {
            return k0.a(gVar.d());
        }
        if (gVar.b()) {
            return b0.a(gVar.c());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static h getChimeraLifecycleFragmentImpl(g gVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a() {
    }

    public void a(int i2, int i3, Intent intent) {
    }

    public void a(Bundle bundle) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void b() {
    }

    public void b(Bundle bundle) {
    }

    public void c() {
    }

    public void d() {
    }
}
