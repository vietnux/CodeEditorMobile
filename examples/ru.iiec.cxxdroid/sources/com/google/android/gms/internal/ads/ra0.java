package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.x0;
import e.b.b.a.b.a;
import e.b.b.a.b.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

@k2
public final class ra0 extends ib0 implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: l  reason: collision with root package name */
    static final String[] f5419l = {"2011", "1009", "3010"};

    /* renamed from: b  reason: collision with root package name */
    private final Object f5420b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<View> f5421c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, WeakReference<View>> f5422d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, WeakReference<View>> f5423e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, WeakReference<View>> f5424f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private aa0 f5425g;

    /* renamed from: h  reason: collision with root package name */
    private View f5426h;

    /* renamed from: i  reason: collision with root package name */
    private Point f5427i = new Point();

    /* renamed from: j  reason: collision with root package name */
    private Point f5428j = new Point();

    /* renamed from: k  reason: collision with root package name */
    private WeakReference<m00> f5429k = new WeakReference<>(null);

    public ra0(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        x0.B();
        ee.a(view, (ViewTreeObserver.OnGlobalLayoutListener) this);
        x0.B();
        ee.a(view, (ViewTreeObserver.OnScrollChangedListener) this);
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        this.f5421c = new WeakReference<>(view);
        for (Map.Entry<String, View> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            View value = entry.getValue();
            if (value != null) {
                this.f5422d.put(key, new WeakReference<>(value));
                if (!"1098".equals(key) && !"3011".equals(key)) {
                    value.setOnTouchListener(this);
                    value.setClickable(true);
                    value.setOnClickListener(this);
                }
            }
        }
        this.f5424f.putAll(this.f5422d);
        for (Map.Entry<String, View> entry2 : hashMap2.entrySet()) {
            View value2 = entry2.getValue();
            if (value2 != null) {
                this.f5423e.put(entry2.getKey(), new WeakReference<>(value2));
                value2.setOnTouchListener(this);
            }
        }
        this.f5424f.putAll(this.f5423e);
        k80.a(view.getContext());
    }

    /* access modifiers changed from: private */
    public final void a(fa0 fa0) {
        View view;
        synchronized (this.f5420b) {
            String[] strArr = f5419l;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    view = null;
                    break;
                }
                WeakReference<View> weakReference = this.f5424f.get(strArr[i2]);
                if (weakReference != null) {
                    view = weakReference.get();
                    break;
                }
                i2++;
            }
            if (!(view instanceof FrameLayout)) {
                fa0.G1();
                return;
            }
            ta0 ta0 = new ta0(this, view);
            if (fa0 instanceof z90) {
                fa0.b(view, ta0);
            } else {
                fa0.a(view, ta0);
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean a(String[] strArr) {
        for (String str : strArr) {
            if (this.f5422d.get(str) != null) {
                return true;
            }
        }
        for (String str2 : strArr) {
            if (this.f5423e.get(str2) != null) {
                return false;
            }
        }
        return false;
    }

    private final void c(View view) {
        synchronized (this.f5420b) {
            if (this.f5425g != null) {
                aa0 d2 = this.f5425g instanceof z90 ? ((z90) this.f5425g).d() : this.f5425g;
                if (d2 != null) {
                    d2.c(view);
                }
            }
        }
    }

    private final int h(int i2) {
        int b2;
        synchronized (this.f5420b) {
            a50.b();
            b2 = fc.b(this.f5425g.getContext(), i2);
        }
        return b2;
    }

    @Override // com.google.android.gms.internal.ads.hb0
    public final void d(a aVar) {
        int i2;
        View view;
        synchronized (this.f5420b) {
            ViewGroup viewGroup = null;
            c(null);
            Object y = b.y(aVar);
            if (!(y instanceof fa0)) {
                qc.d("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            fa0 fa0 = (fa0) y;
            if (!fa0.J1()) {
                qc.a("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                return;
            }
            View view2 = this.f5421c.get();
            if (!(this.f5425g == null || view2 == null)) {
                if (((Boolean) a50.g().a(k80.Y1)).booleanValue()) {
                    this.f5425g.a(view2, this.f5424f);
                }
            }
            synchronized (this.f5420b) {
                i2 = 0;
                if (this.f5425g instanceof fa0) {
                    fa0 fa02 = (fa0) this.f5425g;
                    View view3 = this.f5421c.get();
                    if (!(fa02 == null || fa02.getContext() == null || view3 == null || !x0.C().f(view3.getContext()))) {
                        f8 b2 = fa02.b();
                        if (b2 != null) {
                            b2.a(false);
                        }
                        m00 m00 = this.f5429k.get();
                        if (!(m00 == null || b2 == null)) {
                            m00.b(b2);
                        }
                    }
                }
            }
            if (!(this.f5425g instanceof z90) || !((z90) this.f5425g).c()) {
                this.f5425g = fa0;
                if (fa0 instanceof z90) {
                    ((z90) fa0).a((aa0) null);
                }
            } else {
                ((z90) this.f5425g).a(fa0);
            }
            String[] strArr = {"1098", "3011"};
            while (true) {
                if (i2 >= 2) {
                    view = null;
                    break;
                }
                WeakReference<View> weakReference = this.f5424f.get(strArr[i2]);
                if (weakReference != null) {
                    view = weakReference.get();
                    break;
                }
                i2++;
            }
            if (view == null) {
                qc.d("Ad choices asset view is not provided.");
            } else {
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                }
                if (viewGroup != null) {
                    this.f5426h = fa0.a((View.OnClickListener) this, true);
                    if (this.f5426h != null) {
                        this.f5424f.put("1007", new WeakReference<>(this.f5426h));
                        this.f5422d.put("1007", new WeakReference<>(this.f5426h));
                        viewGroup.removeAllViews();
                        viewGroup.addView(this.f5426h);
                    }
                }
            }
            fa0.a(view2, this.f5422d, this.f5423e, this, this);
            u9.f5718h.post(new sa0(this, fa0));
            c(view2);
            this.f5425g.b(view2);
            synchronized (this.f5420b) {
                if (this.f5425g instanceof fa0) {
                    fa0 fa03 = (fa0) this.f5425g;
                    View view4 = this.f5421c.get();
                    if (!(fa03 == null || fa03.getContext() == null || view4 == null || !x0.C().f(view4.getContext()))) {
                        m00 m002 = this.f5429k.get();
                        if (m002 == null) {
                            m002 = new m00(view4.getContext(), view4);
                            this.f5429k = new WeakReference<>(m002);
                        }
                        m002.a(fa03.b());
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.hb0
    public final void e(a aVar) {
        synchronized (this.f5420b) {
            this.f5425g.a((View) b.y(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.hb0
    public final void g1() {
        synchronized (this.f5420b) {
            this.f5426h = null;
            this.f5425g = null;
            this.f5427i = null;
            this.f5428j = null;
        }
    }

    public final void onClick(View view) {
        aa0 aa0;
        String str;
        Map<String, WeakReference<View>> map;
        synchronized (this.f5420b) {
            if (this.f5425g != null) {
                View view2 = this.f5421c.get();
                if (view2 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("x", (float) h(this.f5427i.x));
                    bundle.putFloat("y", (float) h(this.f5427i.y));
                    bundle.putFloat("start_x", (float) h(this.f5428j.x));
                    bundle.putFloat("start_y", (float) h(this.f5428j.y));
                    if (this.f5426h == null || !this.f5426h.equals(view)) {
                        this.f5425g.a(view, this.f5424f, bundle, view2);
                    } else {
                        if (!(this.f5425g instanceof z90)) {
                            aa0 = this.f5425g;
                            str = "1007";
                            map = this.f5424f;
                        } else if (((z90) this.f5425g).d() != null) {
                            aa0 = ((z90) this.f5425g).d();
                            str = "1007";
                            map = this.f5424f;
                        }
                        aa0.a(view, str, bundle, map, view2);
                    }
                }
            }
        }
    }

    public final void onGlobalLayout() {
        View view;
        synchronized (this.f5420b) {
            if (!(this.f5425g == null || (view = this.f5421c.get()) == null)) {
                this.f5425g.c(view, this.f5424f);
            }
        }
    }

    public final void onScrollChanged() {
        View view;
        synchronized (this.f5420b) {
            if (!(this.f5425g == null || (view = this.f5421c.get()) == null)) {
                this.f5425g.c(view, this.f5424f);
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f5420b) {
            if (this.f5425g == null) {
                return false;
            }
            View view2 = this.f5421c.get();
            if (view2 == null) {
                return false;
            }
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.f5427i = point;
            if (motionEvent.getAction() == 0) {
                this.f5428j = point;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) point.x, (float) point.y);
            this.f5425g.a(obtain);
            obtain.recycle();
            return false;
        }
    }
}
