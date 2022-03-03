package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import c.e.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

public final class b0 extends Fragment implements h {

    /* renamed from: e  reason: collision with root package name */
    private static WeakHashMap<Activity, WeakReference<b0>> f3497e = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, LifecycleCallback> f3498b = new a();

    /* renamed from: c  reason: collision with root package name */
    private int f3499c = 0;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f3500d;

    public static b0 a(Activity activity) {
        b0 b0Var;
        WeakReference<b0> weakReference = f3497e.get(activity);
        if (weakReference != null && (b0Var = weakReference.get()) != null) {
            return b0Var;
        }
        try {
            b0 b0Var2 = (b0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (b0Var2 == null || b0Var2.isRemoving()) {
                b0Var2 = new b0();
                activity.getFragmentManager().beginTransaction().add(b0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            f3497e.put(activity, new WeakReference<>(b0Var2));
            return b0Var2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final <T extends LifecycleCallback> T a(String str, Class<T> cls) {
        return cls.cast(this.f3498b.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f3498b.containsKey(str)) {
            this.f3498b.put(str, lifecycleCallback);
            if (this.f3499c > 0) {
                new Handler(Looper.getMainLooper()).post(new c0(this, lifecycleCallback, str));
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

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f3498b.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        for (LifecycleCallback lifecycleCallback : this.f3498b.values()) {
            lifecycleCallback.a(i2, i3, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3499c = 1;
        this.f3500d = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f3498b.entrySet()) {
            entry.getValue().a(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f3499c = 5;
        for (LifecycleCallback lifecycleCallback : this.f3498b.values()) {
            lifecycleCallback.a();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f3499c = 3;
        for (LifecycleCallback lifecycleCallback : this.f3498b.values()) {
            lifecycleCallback.b();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry<String, LifecycleCallback> entry : this.f3498b.entrySet()) {
                Bundle bundle2 = new Bundle();
                entry.getValue().b(bundle2);
                bundle.putBundle(entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f3499c = 2;
        for (LifecycleCallback lifecycleCallback : this.f3498b.values()) {
            lifecycleCallback.c();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f3499c = 4;
        for (LifecycleCallback lifecycleCallback : this.f3498b.values()) {
            lifecycleCallback.d();
        }
    }
}
