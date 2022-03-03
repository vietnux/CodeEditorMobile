package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class zw implements yw {
    protected static volatile tx u;

    /* renamed from: b  reason: collision with root package name */
    protected MotionEvent f6225b;

    /* renamed from: c  reason: collision with root package name */
    protected LinkedList<MotionEvent> f6226c = new LinkedList<>();

    /* renamed from: d  reason: collision with root package name */
    protected long f6227d = 0;

    /* renamed from: e  reason: collision with root package name */
    protected long f6228e = 0;

    /* renamed from: f  reason: collision with root package name */
    protected long f6229f = 0;

    /* renamed from: g  reason: collision with root package name */
    protected long f6230g = 0;

    /* renamed from: h  reason: collision with root package name */
    protected long f6231h = 0;

    /* renamed from: i  reason: collision with root package name */
    protected long f6232i = 0;

    /* renamed from: j  reason: collision with root package name */
    protected long f6233j = 0;

    /* renamed from: k  reason: collision with root package name */
    protected double f6234k;

    /* renamed from: l  reason: collision with root package name */
    private double f6235l;

    /* renamed from: m  reason: collision with root package name */
    private double f6236m;
    protected float n;
    protected float o;
    protected float p;
    protected float q;
    private boolean r = false;
    protected boolean s = false;
    protected DisplayMetrics t;

    protected zw(Context context) {
        try {
            if (((Boolean) a50.g().a(k80.K1)).booleanValue()) {
                dw.a();
            } else {
                zx.a(u);
            }
            this.t = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    private final String a(Context context, String str, boolean z, View view, Activity activity, byte[] bArr) {
        xp xpVar;
        int i2;
        if (z) {
            try {
                xpVar = a(context, view, activity);
                this.r = true;
            } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
                i2 = 7;
                return Integer.toString(i2);
            } catch (Throwable unused2) {
                i2 = 3;
                return Integer.toString(i2);
            }
        } else {
            xpVar = a(context, null);
        }
        if (xpVar != null) {
            if (xpVar.a() != 0) {
                return dw.a(xpVar, str);
            }
        }
        return Integer.toString(5);
    }

    /* access modifiers changed from: protected */
    public abstract long a(StackTraceElement[] stackTraceElementArr);

    /* access modifiers changed from: protected */
    public abstract xp a(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    public abstract xp a(Context context, tm tmVar);

    @Override // com.google.android.gms.internal.ads.yw
    public final String a(Context context) {
        if (by.a()) {
            if (((Boolean) a50.g().a(k80.M1)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return a(context, null, false, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.yw
    public final String a(Context context, String str, View view) {
        return a(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.yw
    public final String a(Context context, String str, View view, Activity activity) {
        return a(context, str, true, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.yw
    public final void a(int i2, int i3, int i4) {
        MotionEvent motionEvent;
        MotionEvent motionEvent2 = this.f6225b;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        DisplayMetrics displayMetrics = this.t;
        if (displayMetrics != null) {
            float f2 = displayMetrics.density;
            motionEvent = MotionEvent.obtain(0, (long) i4, 1, ((float) i2) * f2, ((float) i3) * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            motionEvent = null;
        }
        this.f6225b = motionEvent;
        this.s = false;
    }

    @Override // com.google.android.gms.internal.ads.yw
    public final void a(MotionEvent motionEvent) {
        boolean z = false;
        if (this.r) {
            this.f6230g = 0;
            this.f6229f = 0;
            this.f6228e = 0;
            this.f6227d = 0;
            this.f6231h = 0;
            this.f6233j = 0;
            this.f6232i = 0;
            Iterator<MotionEvent> it = this.f6226c.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.f6226c.clear();
            this.f6225b = null;
            this.r = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6234k = 0.0d;
            this.f6235l = (double) motionEvent.getRawX();
            this.f6236m = (double) motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = (double) motionEvent.getRawX();
            double rawY = (double) motionEvent.getRawY();
            double d2 = rawX - this.f6235l;
            double d3 = rawY - this.f6236m;
            this.f6234k += Math.sqrt((d2 * d2) + (d3 * d3));
            this.f6235l = rawX;
            this.f6236m = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.n = motionEvent.getX();
            this.o = motionEvent.getY();
            this.p = motionEvent.getRawX();
            this.q = motionEvent.getRawY();
            this.f6227d++;
        } else if (action2 == 1) {
            this.f6225b = MotionEvent.obtain(motionEvent);
            this.f6226c.add(this.f6225b);
            if (this.f6226c.size() > 6) {
                this.f6226c.remove().recycle();
            }
            this.f6229f++;
            this.f6231h = a(new Throwable().getStackTrace());
        } else if (action2 == 2) {
            this.f6228e += (long) (motionEvent.getHistorySize() + 1);
            try {
                ay b2 = b(motionEvent);
                if ((b2 == null || b2.f3828e == null || b2.f3831h == null) ? false : true) {
                    this.f6232i += b2.f3828e.longValue() + b2.f3831h.longValue();
                }
                if (!(this.t == null || b2 == null || b2.f3829f == null || b2.f3832i == null)) {
                    z = true;
                }
                if (z) {
                    this.f6233j += b2.f3829f.longValue() + b2.f3832i.longValue();
                }
            } catch (qx unused) {
            }
        } else if (action2 == 3) {
            this.f6230g++;
        }
        this.s = true;
    }

    /* access modifiers changed from: protected */
    public abstract ay b(MotionEvent motionEvent);
}
