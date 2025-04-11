package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.util.n;
import e.b.b.a.b.a;
import e.b.b.a.b.b;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@k2
public final class pa0 extends eb0 implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final String[] n = {"2011", "1009", "3010"};

    /* renamed from: b  reason: collision with root package name */
    private final Object f5231b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final FrameLayout f5232c;

    /* renamed from: d  reason: collision with root package name */
    private FrameLayout f5233d;

    /* renamed from: e  reason: collision with root package name */
    private View f5234e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f5235f;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, WeakReference<View>> f5236g = Collections.synchronizedMap(new HashMap());

    /* renamed from: h  reason: collision with root package name */
    private View f5237h;

    /* renamed from: i  reason: collision with root package name */
    private aa0 f5238i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5239j = false;

    /* renamed from: k  reason: collision with root package name */
    private Point f5240k = new Point();

    /* renamed from: l  reason: collision with root package name */
    private Point f5241l = new Point();

    /* renamed from: m  reason: collision with root package name */
    private WeakReference<m00> f5242m = new WeakReference<>(null);

    @TargetApi(21)
    public pa0(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f5232c = frameLayout;
        this.f5233d = frameLayout2;
        x0.B();
        ee.a((View) this.f5232c, (ViewTreeObserver.OnGlobalLayoutListener) this);
        x0.B();
        ee.a((View) this.f5232c, (ViewTreeObserver.OnScrollChangedListener) this);
        this.f5232c.setOnTouchListener(this);
        this.f5232c.setOnClickListener(this);
        if (frameLayout2 != null && n.i()) {
            frameLayout2.setElevation(Float.MAX_VALUE);
        }
        k80.a(this.f5232c.getContext());
        this.f5235f = ((Boolean) a50.g().a(k80.h2)).booleanValue();
    }

    private final void c(View view) {
        aa0 aa0 = this.f5238i;
        if (aa0 != null) {
            if (aa0 instanceof z90) {
                aa0 = ((z90) aa0).d();
            }
            if (aa0 != null) {
                aa0.c(view);
            }
        }
    }

    private final void f2() {
        synchronized (this.f5231b) {
            if (!this.f5235f && this.f5239j) {
                int measuredWidth = this.f5232c.getMeasuredWidth();
                int measuredHeight = this.f5232c.getMeasuredHeight();
                if (!(measuredWidth == 0 || measuredHeight == 0 || this.f5233d == null)) {
                    this.f5233d.setLayoutParams(new FrameLayout.LayoutParams(measuredWidth, measuredHeight));
                    this.f5239j = false;
                }
            }
        }
    }

    private final int h(int i2) {
        a50.b();
        return fc.b(this.f5238i.getContext(), i2);
    }

    @Override // com.google.android.gms.internal.ads.db0
    public final void a(String str, a aVar) {
        View view = (View) b.y(aVar);
        synchronized (this.f5231b) {
            if (this.f5236g != null) {
                if (view == null) {
                    this.f5236g.remove(str);
                } else {
                    this.f5236g.put(str, new WeakReference<>(view));
                    if (!"1098".equals(str)) {
                        if (!"3011".equals(str)) {
                            view.setOnTouchListener(this);
                            view.setClickable(true);
                            view.setOnClickListener(this);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01bc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0163  */
    @Override // com.google.android.gms.internal.ads.db0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(e.b.b.a.b.a r12) {
        /*
        // Method dump skipped, instructions count: 602
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pa0.d(e.b.b.a.b.a):void");
    }

    @Override // com.google.android.gms.internal.ads.db0
    public final void d(a aVar, int i2) {
        WeakReference<m00> weakReference;
        m00 m00;
        if (!(!x0.C().f(this.f5232c.getContext()) || (weakReference = this.f5242m) == null || (m00 = weakReference.get()) == null)) {
            m00.a();
        }
        f2();
    }

    @Override // com.google.android.gms.internal.ads.db0
    public final void destroy() {
        synchronized (this.f5231b) {
            if (this.f5233d != null) {
                this.f5233d.removeAllViews();
            }
            this.f5233d = null;
            this.f5236g = null;
            this.f5237h = null;
            this.f5238i = null;
            this.f5240k = null;
            this.f5241l = null;
            this.f5242m = null;
            this.f5234e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.db0
    public final void e(a aVar) {
        this.f5238i.a((View) b.y(aVar));
    }

    @Override // com.google.android.gms.internal.ads.db0
    public final a j(String str) {
        synchronized (this.f5231b) {
            View view = null;
            if (this.f5236g == null) {
                return null;
            }
            WeakReference<View> weakReference = this.f5236g.get(str);
            if (weakReference != null) {
                view = weakReference.get();
            }
            return b.a(view);
        }
    }

    public final void onClick(View view) {
        aa0 aa0;
        String str;
        Map<String, WeakReference<View>> map;
        FrameLayout frameLayout;
        synchronized (this.f5231b) {
            if (this.f5238i != null) {
                this.f5238i.D();
                Bundle bundle = new Bundle();
                bundle.putFloat("x", (float) h(this.f5240k.x));
                bundle.putFloat("y", (float) h(this.f5240k.y));
                bundle.putFloat("start_x", (float) h(this.f5241l.x));
                bundle.putFloat("start_y", (float) h(this.f5241l.y));
                if (this.f5237h == null || !this.f5237h.equals(view)) {
                    this.f5238i.a(view, this.f5236g, bundle, this.f5232c);
                } else {
                    if (!(this.f5238i instanceof z90)) {
                        aa0 = this.f5238i;
                        str = "1007";
                        map = this.f5236g;
                        frameLayout = this.f5232c;
                    } else if (((z90) this.f5238i).d() != null) {
                        aa0 = ((z90) this.f5238i).d();
                        str = "1007";
                        map = this.f5236g;
                        frameLayout = this.f5232c;
                    }
                    aa0.a(view, str, bundle, map, frameLayout);
                }
            }
        }
    }

    public final void onGlobalLayout() {
        synchronized (this.f5231b) {
            f2();
            if (this.f5238i != null) {
                this.f5238i.c(this.f5232c, this.f5236g);
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.f5231b) {
            if (this.f5238i != null) {
                this.f5238i.c(this.f5232c, this.f5236g);
            }
            f2();
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f5231b) {
            if (this.f5238i == null) {
                return false;
            }
            int[] iArr = new int[2];
            this.f5232c.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.f5240k = point;
            if (motionEvent.getAction() == 0) {
                this.f5241l = point;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) point.x, (float) point.y);
            this.f5238i.a(obtain);
            obtain.recycle();
            return false;
        }
    }
}
