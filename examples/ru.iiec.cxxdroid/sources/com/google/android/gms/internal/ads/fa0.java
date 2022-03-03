package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.internal.y;
import e.b.b.a.b.a;
import e.b.b.a.b.b;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public class fa0 implements aa0 {
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final ca0 f4289b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f4290c;

    /* renamed from: d  reason: collision with root package name */
    private final l90 f4291d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f4292e;

    /* renamed from: f  reason: collision with root package name */
    private final o1 f4293f;

    /* renamed from: g  reason: collision with root package name */
    private final da0 f4294g;

    /* renamed from: h  reason: collision with root package name */
    private final cx f4295h;

    /* renamed from: i  reason: collision with root package name */
    private final sc f4296i;

    /* renamed from: j  reason: collision with root package name */
    boolean f4297j;

    /* renamed from: k  reason: collision with root package name */
    boolean f4298k;

    /* renamed from: l  reason: collision with root package name */
    private String f4299l;

    /* renamed from: m  reason: collision with root package name */
    private f8 f4300m;
    private WeakReference<View> n = null;

    public fa0(Context context, ca0 ca0, o1 o1Var, cx cxVar, JSONObject jSONObject, da0 da0, sc scVar, String str) {
        this.f4290c = context;
        this.f4289b = ca0;
        this.f4293f = o1Var;
        this.f4295h = cxVar;
        this.f4292e = jSONObject;
        this.f4294g = da0;
        this.f4296i = scVar;
        this.f4299l = str;
        this.f4291d = new l90(this.f4293f);
    }

    private final int a(int i2) {
        a50.b();
        return fc.b(this.f4290c, i2);
    }

    private final JSONObject a(Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", a(rect.right - rect.left));
        jSONObject.put("height", a(rect.bottom - rect.top));
        jSONObject.put("x", a(rect.left));
        jSONObject.put("y", a(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private final JSONObject a(Map<String, WeakReference<View>> map, View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject2;
        }
        int[] f2 = f(view);
        synchronized (map) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view2 = entry.getValue().get();
                if (view2 != null) {
                    int[] f3 = f(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("width", a(view2.getMeasuredWidth()));
                        jSONObject4.put("height", a(view2.getMeasuredHeight()));
                        jSONObject4.put("x", a(f3[0] - f2[0]));
                        jSONObject4.put("y", a(f3[1] - f2[1]));
                        jSONObject4.put("relative_to", "ad_view");
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = a(rect);
                        } else {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("width", 0);
                            jSONObject5.put("height", 0);
                            jSONObject5.put("x", a(f3[0] - f2[0]));
                            jSONObject5.put("y", a(f3[1] - f2[1]));
                            jSONObject5.put("relative_to", "ad_view");
                            jSONObject = jSONObject5;
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            jSONObject3.put("font_size", (double) textView.getTextSize());
                            jSONObject3.put("text", textView.getText());
                        }
                        jSONObject2.put(entry.getKey(), jSONObject3);
                    } catch (JSONException unused) {
                        qc.d("Unable to get asset views information");
                    }
                }
            }
        }
        return jSONObject2;
    }

    private final void a(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6) {
        y.a("Invalid call from a non-UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f4292e);
            if (jSONObject2 != null) {
                jSONObject7.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject7.put("ad_view_signal", jSONObject);
            }
            if (jSONObject5 != null) {
                jSONObject7.put("click_signal", jSONObject5);
            }
            if (jSONObject3 != null) {
                jSONObject7.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject7.put("lock_screen_signal", jSONObject4);
            }
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f4294g.I1());
            x0.h();
            jSONObject8.put("is_privileged_process", aa.f());
            boolean z = true;
            if (((Boolean) a50.g().a(k80.j2)).booleanValue() && this.f4291d.b() != null && this.f4292e.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", x0.m().a());
            jSONObject8.put("has_custom_click_handler", this.f4289b.n(this.f4294g.n()) != null);
            if (this.f4289b.n(this.f4294g.n()) == null) {
                z = false;
            }
            jSONObject7.put("has_custom_click_handler", z);
            try {
                JSONObject optJSONObject = this.f4292e.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                jSONObject8.put("click_signals", this.f4295h.a().a(this.f4290c, optJSONObject.optString("click_string"), view));
            } catch (Exception e2) {
                qc.b("Exception obtaining click signals", e2);
            }
            jSONObject7.put("click", jSONObject8);
            if (jSONObject6 != null) {
                jSONObject7.put("provided_signals", jSONObject6);
            }
            jSONObject7.put("ads_id", this.f4299l);
            yc.a(this.f4293f.a(jSONObject7), "NativeAdEngineImpl.performClick");
        } catch (JSONException e3) {
            qc.b("Unable to create click JSON.", e3);
        }
    }

    private final boolean a(String str) {
        JSONObject jSONObject = this.f4292e;
        JSONObject optJSONObject = jSONObject == null ? null : jSONObject.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null) {
            return false;
        }
        return optJSONObject.optBoolean(str, false);
    }

    private final boolean a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        y.a("Invalid call from a non-UI thread.");
        if (this.f4297j) {
            return true;
        }
        this.f4297j = true;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f4292e);
            jSONObject6.put("ads_id", this.f4299l);
            if (jSONObject2 != null) {
                jSONObject6.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject6.put("ad_view_signal", jSONObject);
            }
            if (jSONObject3 != null) {
                jSONObject6.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject6.put("lock_screen_signal", jSONObject4);
            }
            if (jSONObject5 != null) {
                jSONObject6.put("provided_signals", jSONObject5);
            }
            yc.a(this.f4293f.d(jSONObject6), "NativeAdEngineImpl.recordImpression");
            this.f4289b.b(this);
            this.f4289b.c2();
            E1();
            return true;
        } catch (JSONException e2) {
            qc.b("Unable to create impression JSON.", e2);
            return false;
        }
    }

    private static boolean e(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    private static int[] f(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    private final JSONObject g(View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view == null) {
            return jSONObject2;
        }
        try {
            int[] f2 = f(view);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", a(view.getMeasuredWidth()));
            jSONObject3.put("height", a(view.getMeasuredHeight()));
            jSONObject3.put("x", a(f2[0]));
            jSONObject3.put("y", a(f2[1]));
            jSONObject3.put("relative_to", "window");
            jSONObject2.put("frame", jSONObject3);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                jSONObject = a(rect);
            } else {
                jSONObject = new JSONObject();
                jSONObject.put("width", 0);
                jSONObject.put("height", 0);
                jSONObject.put("x", a(f2[0]));
                jSONObject.put("y", a(f2[1]));
                jSONObject.put("relative_to", "window");
            }
            jSONObject2.put("visible_bounds", jSONObject);
        } catch (Exception unused) {
            qc.d("Unable to get native ad view bounding box");
        }
        return jSONObject2;
    }

    private static JSONObject h(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            x0.f();
            jSONObject.put("contained_in_scroll_view", u9.f(view) != -1);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private final JSONObject i(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            x0.f();
            jSONObject.put("can_show_on_lock_screen", u9.e(view));
            x0.f();
            jSONObject.put("is_keyguard_locked", u9.l(this.f4290c));
        } catch (JSONException unused) {
            qc.d("Unable to get lock screen information");
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public void D() {
        if (((Boolean) a50.g().a(k80.j2)).booleanValue()) {
            if (!this.f4292e.optBoolean("custom_one_point_five_click_enabled", false)) {
                qc.d("Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            } else {
                this.f4291d.a();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public void E1() {
        this.f4289b.E1();
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public void F1() {
        this.f4289b.F1();
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public void G1() {
        this.f4289b.W1();
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public boolean H1() {
        k90 J1 = this.f4294g.J1();
        return J1 != null && J1.l2();
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public final View I1() {
        WeakReference<View> weakReference = this.n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public boolean J1() {
        JSONObject jSONObject = this.f4292e;
        return jSONObject != null && jSONObject.optBoolean("allow_pub_owned_ad_view", false);
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public void K1() {
        y.a("Invalid call from a non-UI thread.");
        if (!this.f4298k) {
            this.f4298k = true;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad", this.f4292e);
                jSONObject.put("ads_id", this.f4299l);
                yc.a(this.f4293f.c(jSONObject), "NativeAdEngineImpl.recordDownloadedImpression");
            } catch (JSONException e2) {
                qc.b("", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public void L1() {
        this.f4293f.a();
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public View a(View.OnClickListener onClickListener, boolean z) {
        k90 J1 = this.f4294g.J1();
        if (J1 == null) {
            return null;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (!z) {
            int k2 = J1.k2();
            if (k2 != 0) {
                if (k2 == 2) {
                    layoutParams.addRule(12);
                } else if (k2 != 3) {
                    layoutParams.addRule(10);
                } else {
                    layoutParams.addRule(12);
                }
                layoutParams.addRule(11);
            } else {
                layoutParams.addRule(10);
            }
            layoutParams.addRule(9);
        }
        n90 n90 = new n90(this.f4290c, J1, layoutParams);
        n90.setOnClickListener(onClickListener);
        n90.setContentDescription((CharSequence) a50.g().a(k80.d2));
        return n90;
    }

    public lg a() {
        JSONObject jSONObject = this.f4292e;
        if (jSONObject == null || jSONObject.optJSONObject("overlay") == null) {
            return null;
        }
        x0.g();
        Context context = this.f4290c;
        n40 a2 = n40.a(context);
        lg a3 = sg.a(context, zh.a(a2), a2.f5046b, false, false, this.f4295h, this.f4296i, null, null, null, r20.a());
        if (a3 != null) {
            a3.getView().setVisibility(8);
            new ha0(a3).a(this.f4293f);
        }
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public final void a(MotionEvent motionEvent) {
        this.f4295h.a(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public void a(View view) {
        if (((Boolean) a50.g().a(k80.j2)).booleanValue()) {
            if (!this.f4292e.optBoolean("custom_one_point_five_click_enabled", false)) {
                qc.d("Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
                return;
            }
            l90 l90 = this.f4291d;
            if (view != null) {
                view.setOnClickListener(l90);
                view.setClickable(true);
                l90.f4856g = new WeakReference<>(view);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public final void a(View view, y90 y90) {
        if (!b(view, y90)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ((FrameLayout) view).removeAllViews();
            da0 da0 = this.f4294g;
            if (da0 instanceof ea0) {
                ea0 ea0 = (ea0) da0;
                if (ea0.b() != null && ea0.b().size() > 0) {
                    Object obj = ea0.b().get(0);
                    ya0 a2 = obj instanceof IBinder ? za0.a((IBinder) obj) : null;
                    if (a2 != null) {
                        try {
                            a j1 = a2.j1();
                            if (j1 != null) {
                                ImageView imageView = new ImageView(this.f4290c);
                                imageView.setImageDrawable((Drawable) b.y(j1));
                                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                                ((FrameLayout) view).addView(imageView, layoutParams);
                            }
                        } catch (RemoteException unused) {
                            qc.d("Could not get drawable from image");
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public final void a(View view, String str, Bundle bundle, Map<String, WeakReference<View>> map, View view2) {
        JSONObject jSONObject;
        Exception e2;
        JSONObject a2 = a(map, view2);
        JSONObject g2 = g(view2);
        JSONObject h2 = h(view2);
        JSONObject i2 = i(view2);
        JSONObject jSONObject2 = null;
        try {
            JSONObject a3 = x0.f().a(bundle, (JSONObject) null);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("click_point", a3);
                jSONObject3.put("asset_id", str);
                jSONObject = jSONObject3;
            } catch (Exception e3) {
                e2 = e3;
                jSONObject2 = jSONObject3;
                qc.b("Error occurred while grabbing click signals.", e2);
                jSONObject = jSONObject2;
                a(view, g2, a2, h2, i2, str, jSONObject, null);
            }
        } catch (Exception e4) {
            e2 = e4;
            qc.b("Error occurred while grabbing click signals.", e2);
            jSONObject = jSONObject2;
            a(view, g2, a2, h2, i2, str, jSONObject, null);
        }
        a(view, g2, a2, h2, i2, str, jSONObject, null);
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public void a(View view, Map<String, WeakReference<View>> map) {
        if (!((Boolean) a50.g().a(k80.Z1)).booleanValue()) {
            view.setOnTouchListener(null);
            view.setClickable(false);
            view.setOnClickListener(null);
            if (map != null) {
                synchronized (map) {
                    for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                        View view2 = entry.getValue().get();
                        if (view2 != null) {
                            view2.setOnTouchListener(null);
                            view2.setClickable(false);
                            view2.setOnClickListener(null);
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public void a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        String str;
        y.a("Invalid call from a non-UI thread.");
        if (map != null) {
            synchronized (map) {
                for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                    if (view.equals(entry.getValue().get())) {
                        a(view, entry.getKey(), bundle, map, view2);
                        return;
                    }
                }
            }
        }
        if ("6".equals(this.f4294g.I1())) {
            str = "3099";
        } else if ("2".equals(this.f4294g.I1())) {
            str = "2099";
        } else if ("1".equals(this.f4294g.I1())) {
            a(view, "1099", bundle, map, view2);
            return;
        } else {
            return;
        }
        a(view, str, bundle, map, view2);
    }

    public void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        if (((Boolean) a50.g().a(k80.a2)).booleanValue()) {
            view.setOnTouchListener(onTouchListener);
            view.setClickable(true);
            view.setOnClickListener(onClickListener);
            if (map != null) {
                synchronized (map) {
                    for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                        View view2 = entry.getValue().get();
                        if (view2 != null) {
                            view2.setOnTouchListener(onTouchListener);
                            view2.setClickable(true);
                            view2.setOnClickListener(onClickListener);
                        }
                    }
                }
            }
            if (map2 != null) {
                synchronized (map2) {
                    for (Map.Entry<String, WeakReference<View>> entry2 : map2.entrySet()) {
                        View view3 = entry2.getValue().get();
                        if (view3 != null) {
                            view3.setOnTouchListener(onTouchListener);
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public void a(qc0 qc0) {
        if (((Boolean) a50.g().a(k80.j2)).booleanValue()) {
            if (!this.f4292e.optBoolean("custom_one_point_five_click_enabled", false)) {
                qc.d("Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            } else {
                this.f4291d.a(qc0);
            }
        }
    }

    public final void a(Map<String, WeakReference<View>> map) {
        if (this.f4294g.G1() == null) {
            return;
        }
        if ("2".equals(this.f4294g.I1())) {
            x0.j().m().a(this.f4289b.k0(), this.f4294g.I1(), map.containsKey("2011"));
        } else if ("1".equals(this.f4294g.I1())) {
            x0.j().m().a(this.f4289b.k0(), this.f4294g.I1(), map.containsKey("1009"));
        }
    }

    public final f8 b() {
        if (!x0.C().f(this.f4290c)) {
            return null;
        }
        if (this.f4300m == null) {
            this.f4300m = new f8(this.f4290c, this.f4289b.k0());
        }
        return this.f4300m;
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public final void b(View view) {
        cx cxVar;
        yw a2;
        if (((Boolean) a50.g().a(k80.F1)).booleanValue() && (cxVar = this.f4295h) != null && (a2 = cxVar.a()) != null) {
            a2.a(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public void b(View view, Map<String, WeakReference<View>> map) {
        a(g(view), a(map, view), h(view), i(view), (JSONObject) null);
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public final boolean b(Bundle bundle) {
        if (a("impression_reporting")) {
            return a((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, x0.f().a(bundle, (JSONObject) null));
        }
        qc.a("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
        return false;
    }

    public final boolean b(View view, y90 y90) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        View G1 = this.f4294g.G1();
        if (G1 == null) {
            return false;
        }
        ViewParent parent = G1.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(G1);
        }
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(G1, layoutParams);
        this.f4289b.b(y90);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public final void c(Bundle bundle) {
        if (bundle == null) {
            qc.b("Click data is null. No click is reported.");
        } else if (!a("click_reporting")) {
            qc.a("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            a(null, null, null, null, null, bundle.getBundle("click_signal").getString("asset_id"), null, x0.f().a(bundle, (JSONObject) null));
        }
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public final void c(View view) {
        this.n = new WeakReference<>(view);
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public final void c(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.a) {
            if (!this.f4297j) {
                if (e(view)) {
                    b(view, map);
                    return;
                }
                if (((Boolean) a50.g().a(k80.i2)).booleanValue() && map != null) {
                    synchronized (map) {
                        for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                            View view2 = entry.getValue().get();
                            if (view2 != null && e(view2)) {
                                b(view, map);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public final void d(Bundle bundle) {
        if (bundle == null) {
            qc.b("Touch event data is null. No touch event is reported.");
        } else if (!a("touch_reporting")) {
            qc.a("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        } else {
            int i2 = bundle.getInt("duration_ms");
            this.f4295h.a().a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), i2);
        }
    }

    public final void d(View view) {
        this.f4289b.a(view);
    }

    @Override // com.google.android.gms.internal.ads.aa0
    public final Context getContext() {
        return this.f4290c;
    }
}
