package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import com.google.android.gms.common.n;

@k2
public final class i80 {
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final ConditionVariable f4596b = new ConditionVariable();

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f4597c = false;

    /* renamed from: d  reason: collision with root package name */
    private SharedPreferences f4598d = null;

    /* renamed from: e  reason: collision with root package name */
    private Context f4599e;

    public final <T> T a(a80<T> a80) {
        if (this.f4596b.block(5000)) {
            if (!this.f4597c || this.f4598d == null) {
                synchronized (this.a) {
                    if (this.f4597c) {
                        if (this.f4598d == null) {
                        }
                    }
                    return a80.c();
                }
            }
            return (T) wb.a(this.f4599e, new j80(this, a80));
        }
        throw new IllegalStateException("Flags.initialize() was not called!");
    }

    public final void a(Context context) {
        if (!this.f4597c) {
            synchronized (this.a) {
                if (!this.f4597c) {
                    this.f4599e = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    try {
                        Context remoteContext = n.getRemoteContext(context);
                        if (remoteContext == null && context != null && (remoteContext = context.getApplicationContext()) == null) {
                            remoteContext = context;
                        }
                        if (remoteContext != null) {
                            a50.e();
                            this.f4598d = remoteContext.getSharedPreferences("google_ads_flags", 0);
                            this.f4597c = true;
                            this.f4596b.open();
                        }
                    } finally {
                        this.f4596b.open();
                    }
                }
            }
        }
    }
}
