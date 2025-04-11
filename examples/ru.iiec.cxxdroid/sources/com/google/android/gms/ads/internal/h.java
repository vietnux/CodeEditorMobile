package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.bx;
import com.google.android.gms.internal.ads.fc;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.k80;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.s9;
import com.google.android.gms.internal.ads.sc;
import com.google.android.gms.internal.ads.yw;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@k2
public final class h implements yw, Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final List<Object[]> f3186b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<yw> f3187c;

    /* renamed from: d  reason: collision with root package name */
    private Context f3188d;

    /* renamed from: e  reason: collision with root package name */
    private sc f3189e;

    /* renamed from: f  reason: collision with root package name */
    private CountDownLatch f3190f;

    private h(Context context, sc scVar) {
        this.f3186b = new Vector();
        this.f3187c = new AtomicReference<>();
        this.f3190f = new CountDownLatch(1);
        this.f3188d = context;
        this.f3189e = scVar;
        a50.b();
        if (fc.b()) {
            s9.a(this);
        } else {
            run();
        }
    }

    public h(y0 y0Var) {
        this(y0Var.f3368d, y0Var.f3370f);
    }

    private final boolean a() {
        try {
            this.f3190f.await();
            return true;
        } catch (InterruptedException e2) {
            qc.c("Interrupted during GADSignals creation.", e2);
            return false;
        }
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private final void b() {
        if (!this.f3186b.isEmpty()) {
            for (Object[] objArr : this.f3186b) {
                if (objArr.length == 1) {
                    this.f3187c.get().a((MotionEvent) objArr[0]);
                } else if (objArr.length == 3) {
                    this.f3187c.get().a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.f3186b.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.yw
    public final String a(Context context) {
        yw ywVar;
        if (!a() || (ywVar = this.f3187c.get()) == null) {
            return "";
        }
        b();
        return ywVar.a(b(context));
    }

    @Override // com.google.android.gms.internal.ads.yw
    public final String a(Context context, String str, View view) {
        return a(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.yw
    public final String a(Context context, String str, View view, Activity activity) {
        yw ywVar;
        if (!a() || (ywVar = this.f3187c.get()) == null) {
            return "";
        }
        b();
        return ywVar.a(b(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.yw
    public final void a(int i2, int i3, int i4) {
        yw ywVar = this.f3187c.get();
        if (ywVar != null) {
            b();
            ywVar.a(i2, i3, i4);
            return;
        }
        this.f3186b.add(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
    }

    @Override // com.google.android.gms.internal.ads.yw
    public final void a(MotionEvent motionEvent) {
        yw ywVar = this.f3187c.get();
        if (ywVar != null) {
            b();
            ywVar.a(motionEvent);
            return;
        }
        this.f3186b.add(new Object[]{motionEvent});
    }

    @Override // com.google.android.gms.internal.ads.yw
    public final void a(View view) {
        yw ywVar = this.f3187c.get();
        if (ywVar != null) {
            ywVar.a(view);
        }
    }

    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.f3189e.f5532e;
            if (!((Boolean) a50.g().a(k80.J0)).booleanValue() && z2) {
                z = true;
            }
            this.f3187c.set(bx.a(this.f3189e.f5529b, b(this.f3188d), z));
        } finally {
            this.f3190f.countDown();
            this.f3188d = null;
            this.f3189e = null;
        }
    }
}
