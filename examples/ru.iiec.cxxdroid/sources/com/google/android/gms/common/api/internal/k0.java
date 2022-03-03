package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.y;
import c.e.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

public final class k0 extends Fragment implements h {
    private static WeakHashMap<e, WeakReference<k0>> c0 = new WeakHashMap<>();
    private Map<String, LifecycleCallback> Z = new a();
    private int a0 = 0;
    private Bundle b0;

    public static k0 a(e eVar) {
        k0 k0Var;
        WeakReference<k0> weakReference = c0.get(eVar);
        if (weakReference != null && (k0Var = weakReference.get()) != null) {
            return k0Var;
        }
        try {
            k0 k0Var2 = (k0) eVar.k().c("SupportLifecycleFragmentImpl");
            if (k0Var2 == null || k0Var2.U()) {
                k0Var2 = new k0();
                y b2 = eVar.k().b();
                b2.a(k0Var2, "SupportLifecycleFragmentImpl");
                b2.b();
            }
            c0.put(eVar, new WeakReference<>(k0Var2));
            return k0Var2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        super.Y();
        this.a0 = 5;
        for (LifecycleCallback lifecycleCallback : this.Z.values()) {
            lifecycleCallback.a();
        }
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final <T extends LifecycleCallback> T a(String str, Class<T> cls) {
        return cls.cast(this.Z.get(str));
    }

    @Override // androidx.fragment.app.Fragment
    public final void a(int i2, int i3, Intent intent) {
        super.a(i2, i3, intent);
        for (LifecycleCallback lifecycleCallback : this.Z.values()) {
            lifecycleCallback.a(i2, i3, intent);
        }
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.Z.containsKey(str)) {
            this.Z.put(str, lifecycleCallback);
            if (this.a0 > 0) {
                new Handler(Looper.getMainLooper()).post(new l0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // androidx.fragment.app.Fragment
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.Z.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.a0 = 1;
        this.b0 = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.Z.entrySet()) {
            entry.getValue().a(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        super.d0();
        this.a0 = 3;
        for (LifecycleCallback lifecycleCallback : this.Z.values()) {
            lifecycleCallback.b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (bundle != null) {
            for (Map.Entry<String, LifecycleCallback> entry : this.Z.entrySet()) {
                Bundle bundle2 = new Bundle();
                entry.getValue().b(bundle2);
                bundle.putBundle(entry.getKey(), bundle2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        this.a0 = 2;
        for (LifecycleCallback lifecycleCallback : this.Z.values()) {
            lifecycleCallback.c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void f0() {
        super.f0();
        this.a0 = 4;
        for (LifecycleCallback lifecycleCallback : this.Z.values()) {
            lifecycleCallback.d();
        }
    }
}
