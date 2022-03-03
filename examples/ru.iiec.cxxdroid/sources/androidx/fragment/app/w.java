package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.e0;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.v;
import c.h.l.b0;

/* access modifiers changed from: package-private */
public class w {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final x f1370b;

    /* renamed from: c  reason: collision with root package name */
    private final Fragment f1371c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1372d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f1373e = -1;

    /* access modifiers changed from: package-private */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1374b;

        a(w wVar, View view) {
            this.f1374b = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f1374b.removeOnAttachStateChangeListener(this);
            b0.N(this.f1374b);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a = new int[f.c.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                androidx.lifecycle.f$c[] r0 = androidx.lifecycle.f.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.w.b.a = r0
                int[] r0 = androidx.fragment.app.w.b.a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.lifecycle.f$c r1 = androidx.lifecycle.f.c.RESUMED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = androidx.fragment.app.w.b.a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.lifecycle.f$c r1 = androidx.lifecycle.f.c.STARTED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = androidx.fragment.app.w.b.a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.lifecycle.f$c r1 = androidx.lifecycle.f.c.CREATED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = androidx.fragment.app.w.b.a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.lifecycle.f$c r1 = androidx.lifecycle.f.c.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w.b.<clinit>():void");
        }
    }

    w(m mVar, x xVar, Fragment fragment) {
        this.a = mVar;
        this.f1370b = xVar;
        this.f1371c = fragment;
    }

    w(m mVar, x xVar, Fragment fragment, v vVar) {
        this.a = mVar;
        this.f1370b = xVar;
        this.f1371c = fragment;
        Fragment fragment2 = this.f1371c;
        fragment2.f1162d = null;
        fragment2.f1163e = null;
        fragment2.s = 0;
        fragment2.p = false;
        fragment2.f1171m = false;
        Fragment fragment3 = fragment2.f1167i;
        fragment2.f1168j = fragment3 != null ? fragment3.f1165g : null;
        Fragment fragment4 = this.f1371c;
        fragment4.f1167i = null;
        Bundle bundle = vVar.n;
        fragment4.f1161c = bundle == null ? new Bundle() : bundle;
    }

    w(m mVar, x xVar, ClassLoader classLoader, j jVar, v vVar) {
        this.a = mVar;
        this.f1370b = xVar;
        this.f1371c = jVar.a(classLoader, vVar.f1358b);
        Bundle bundle = vVar.f1367k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        this.f1371c.m(vVar.f1367k);
        Fragment fragment = this.f1371c;
        fragment.f1165g = vVar.f1359c;
        fragment.o = vVar.f1360d;
        fragment.q = true;
        fragment.x = vVar.f1361e;
        fragment.y = vVar.f1362f;
        fragment.z = vVar.f1363g;
        fragment.C = vVar.f1364h;
        fragment.n = vVar.f1365i;
        fragment.B = vVar.f1366j;
        fragment.A = vVar.f1368l;
        fragment.R = f.c.values()[vVar.f1369m];
        Bundle bundle2 = vVar.n;
        if (bundle2 != null) {
            this.f1371c.f1161c = bundle2;
        } else {
            this.f1371c.f1161c = new Bundle();
        }
        if (n.d(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + this.f1371c);
        }
    }

    private boolean a(View view) {
        if (view == this.f1371c.I) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f1371c.I) {
                return true;
            }
        }
        return false;
    }

    private Bundle s() {
        Bundle bundle = new Bundle();
        this.f1371c.j(bundle);
        this.a.d(this.f1371c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f1371c.I != null) {
            p();
        }
        if (this.f1371c.f1162d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f1371c.f1162d);
        }
        if (this.f1371c.f1163e != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f1371c.f1163e);
        }
        if (!this.f1371c.K) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f1371c.K);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (n.d(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f1371c);
        }
        Fragment fragment = this.f1371c;
        fragment.g(fragment.f1161c);
        m mVar = this.a;
        Fragment fragment2 = this.f1371c;
        mVar.a(fragment2, fragment2.f1161c, false);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        this.f1373e = i2;
    }

    /* access modifiers changed from: package-private */
    public void a(ClassLoader classLoader) {
        Bundle bundle = this.f1371c.f1161c;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f1371c;
            fragment.f1162d = fragment.f1161c.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f1371c;
            fragment2.f1163e = fragment2.f1161c.getBundle("android:view_registry_state");
            Fragment fragment3 = this.f1371c;
            fragment3.f1168j = fragment3.f1161c.getString("android:target_state");
            Fragment fragment4 = this.f1371c;
            if (fragment4.f1168j != null) {
                fragment4.f1169k = fragment4.f1161c.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.f1371c;
            Boolean bool = fragment5.f1164f;
            if (bool != null) {
                fragment5.K = bool.booleanValue();
                this.f1371c.f1164f = null;
            } else {
                fragment5.K = fragment5.f1161c.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.f1371c;
            if (!fragment6.K) {
                fragment6.J = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int b2 = this.f1370b.b(this.f1371c);
        Fragment fragment = this.f1371c;
        fragment.H.addView(fragment.I, b2);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (n.d(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f1371c);
        }
        Fragment fragment = this.f1371c;
        Fragment fragment2 = fragment.f1167i;
        w wVar = null;
        if (fragment2 != null) {
            w e2 = this.f1370b.e(fragment2.f1165g);
            if (e2 != null) {
                Fragment fragment3 = this.f1371c;
                fragment3.f1168j = fragment3.f1167i.f1165g;
                fragment3.f1167i = null;
                wVar = e2;
            } else {
                throw new IllegalStateException("Fragment " + this.f1371c + " declared target fragment " + this.f1371c.f1167i + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.f1168j;
            if (str != null && (wVar = this.f1370b.e(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f1371c + " declared target fragment " + this.f1371c.f1168j + " that does not belong to this FragmentManager!");
            }
        }
        if (wVar != null && (n.P || wVar.k().f1160b < 1)) {
            wVar.l();
        }
        Fragment fragment4 = this.f1371c;
        fragment4.u = fragment4.t.v();
        Fragment fragment5 = this.f1371c;
        fragment5.w = fragment5.t.y();
        this.a.e(this.f1371c, false);
        this.f1371c.g0();
        this.a.a(this.f1371c, false);
    }

    /* access modifiers changed from: package-private */
    public int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f1371c;
        if (fragment2.t == null) {
            return fragment2.f1160b;
        }
        int i2 = this.f1373e;
        int i3 = b.a[fragment2.R.ordinal()];
        if (i3 != 1) {
            i2 = i3 != 2 ? i3 != 3 ? i3 != 4 ? Math.min(i2, -1) : Math.min(i2, 0) : Math.min(i2, 1) : Math.min(i2, 5);
        }
        Fragment fragment3 = this.f1371c;
        if (fragment3.o) {
            if (fragment3.p) {
                i2 = Math.max(this.f1373e, 2);
                View view = this.f1371c.I;
                if (view != null && view.getParent() == null) {
                    i2 = Math.min(i2, 2);
                }
            } else {
                i2 = this.f1373e < 4 ? Math.min(i2, fragment3.f1160b) : Math.min(i2, 1);
            }
        }
        if (!this.f1371c.f1171m) {
            i2 = Math.min(i2, 1);
        }
        e0.e.b bVar = null;
        if (n.P && (viewGroup = (fragment = this.f1371c).H) != null) {
            bVar = e0.a(viewGroup, fragment.y()).d(this);
        }
        if (bVar == e0.e.b.ADDING) {
            i2 = Math.min(i2, 6);
        } else if (bVar == e0.e.b.REMOVING) {
            i2 = Math.max(i2, 3);
        } else {
            Fragment fragment4 = this.f1371c;
            if (fragment4.n) {
                i2 = fragment4.R() ? Math.min(i2, 1) : Math.min(i2, -1);
            }
        }
        Fragment fragment5 = this.f1371c;
        if (fragment5.J && fragment5.f1160b < 5) {
            i2 = Math.min(i2, 4);
        }
        if (n.d(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i2 + " for " + this.f1371c);
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (n.d(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f1371c);
        }
        Fragment fragment = this.f1371c;
        if (!fragment.Q) {
            this.a.c(fragment, fragment.f1161c, false);
            Fragment fragment2 = this.f1371c;
            fragment2.h(fragment2.f1161c);
            m mVar = this.a;
            Fragment fragment3 = this.f1371c;
            mVar.b(fragment3, fragment3.f1161c, false);
            return;
        }
        fragment.k(fragment.f1161c);
        this.f1371c.f1160b = 1;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        String str;
        if (!this.f1371c.o) {
            if (n.d(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f1371c);
            }
            Fragment fragment = this.f1371c;
            LayoutInflater i2 = fragment.i(fragment.f1161c);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.f1371c;
            ViewGroup viewGroup2 = fragment2.H;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i3 = fragment2.y;
                if (i3 != 0) {
                    if (i3 != -1) {
                        viewGroup = (ViewGroup) fragment2.t.r().a(this.f1371c.y);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.f1371c;
                            if (!fragment3.q) {
                                try {
                                    str = fragment3.E().getResourceName(this.f1371c.y);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f1371c.y) + " (" + str + ") for fragment " + this.f1371c);
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.f1371c + " for a container view with no id");
                    }
                }
            }
            Fragment fragment4 = this.f1371c;
            fragment4.H = viewGroup;
            fragment4.b(i2, viewGroup, fragment4.f1161c);
            View view = this.f1371c.I;
            if (view != null) {
                boolean z = false;
                view.setSaveFromParentEnabled(false);
                Fragment fragment5 = this.f1371c;
                fragment5.I.setTag(c.m.b.fragment_container_view_tag, fragment5);
                if (viewGroup != null) {
                    b();
                }
                Fragment fragment6 = this.f1371c;
                if (fragment6.A) {
                    fragment6.I.setVisibility(8);
                }
                if (b0.H(this.f1371c.I)) {
                    b0.N(this.f1371c.I);
                } else {
                    View view2 = this.f1371c.I;
                    view2.addOnAttachStateChangeListener(new a(this, view2));
                }
                this.f1371c.q0();
                m mVar = this.a;
                Fragment fragment7 = this.f1371c;
                mVar.a(fragment7, fragment7.I, fragment7.f1161c, false);
                int visibility = this.f1371c.I.getVisibility();
                float alpha = this.f1371c.I.getAlpha();
                if (n.P) {
                    this.f1371c.a(alpha);
                    Fragment fragment8 = this.f1371c;
                    if (fragment8.H != null && visibility == 0) {
                        View findFocus = fragment8.I.findFocus();
                        if (findFocus != null) {
                            this.f1371c.b(findFocus);
                            if (n.d(2)) {
                                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f1371c);
                            }
                        }
                        this.f1371c.I.setAlpha(0.0f);
                    }
                } else {
                    Fragment fragment9 = this.f1371c;
                    if (visibility == 0 && fragment9.H != null) {
                        z = true;
                    }
                    fragment9.M = z;
                }
            }
            this.f1371c.f1160b = 2;
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        Fragment b2;
        if (n.d(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f1371c);
        }
        Fragment fragment = this.f1371c;
        boolean z = true;
        boolean z2 = fragment.n && !fragment.R();
        if (z2 || this.f1370b.e().f(this.f1371c)) {
            k<?> kVar = this.f1371c.u;
            if (kVar instanceof v) {
                z = this.f1370b.e().d();
            } else if (kVar.g() instanceof Activity) {
                z = true ^ ((Activity) kVar.g()).isChangingConfigurations();
            }
            if (z2 || z) {
                this.f1370b.e().b(this.f1371c);
            }
            this.f1371c.h0();
            this.a.b(this.f1371c, false);
            for (w wVar : this.f1370b.b()) {
                if (wVar != null) {
                    Fragment k2 = wVar.k();
                    if (this.f1371c.f1165g.equals(k2.f1168j)) {
                        k2.f1167i = this.f1371c;
                        k2.f1168j = null;
                    }
                }
            }
            Fragment fragment2 = this.f1371c;
            String str = fragment2.f1168j;
            if (str != null) {
                fragment2.f1167i = this.f1370b.b(str);
            }
            this.f1370b.b(this);
            return;
        }
        String str2 = this.f1371c.f1168j;
        if (!(str2 == null || (b2 = this.f1370b.b(str2)) == null || !b2.C)) {
            this.f1371c.f1167i = b2;
        }
        this.f1371c.f1160b = 0;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        View view;
        if (n.d(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f1371c);
        }
        Fragment fragment = this.f1371c;
        ViewGroup viewGroup = fragment.H;
        if (!(viewGroup == null || (view = fragment.I) == null)) {
            viewGroup.removeView(view);
        }
        this.f1371c.i0();
        this.a.i(this.f1371c, false);
        Fragment fragment2 = this.f1371c;
        fragment2.H = null;
        fragment2.I = null;
        fragment2.T = null;
        fragment2.U.a((i) null);
        this.f1371c.p = false;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (n.d(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f1371c);
        }
        this.f1371c.j0();
        boolean z = false;
        this.a.c(this.f1371c, false);
        Fragment fragment = this.f1371c;
        fragment.f1160b = -1;
        fragment.u = null;
        fragment.w = null;
        fragment.t = null;
        if (fragment.n && !fragment.R()) {
            z = true;
        }
        if (z || this.f1370b.e().f(this.f1371c)) {
            if (n.d(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f1371c);
            }
            this.f1371c.N();
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        Fragment fragment = this.f1371c;
        if (fragment.o && fragment.p && !fragment.r) {
            if (n.d(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f1371c);
            }
            Fragment fragment2 = this.f1371c;
            fragment2.b(fragment2.i(fragment2.f1161c), (ViewGroup) null, this.f1371c.f1161c);
            View view = this.f1371c.I;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f1371c;
                fragment3.I.setTag(c.m.b.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f1371c;
                if (fragment4.A) {
                    fragment4.I.setVisibility(8);
                }
                this.f1371c.q0();
                m mVar = this.a;
                Fragment fragment5 = this.f1371c;
                mVar.a(fragment5, fragment5.I, fragment5.f1161c, false);
                this.f1371c.f1160b = 2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment k() {
        return this.f1371c;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [boolean, int] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l() {
        /*
        // Method dump skipped, instructions count: 402
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w.l():void");
    }

    /* access modifiers changed from: package-private */
    public void m() {
        if (n.d(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f1371c);
        }
        this.f1371c.l0();
        this.a.d(this.f1371c, false);
    }

    /* access modifiers changed from: package-private */
    public void n() {
        if (n.d(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f1371c);
        }
        View t = this.f1371c.t();
        if (t != null && a(t)) {
            boolean requestFocus = t.requestFocus();
            if (n.d(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(t);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f1371c);
                sb.append(" resulting in focused view ");
                sb.append(this.f1371c.I.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f1371c.b((View) null);
        this.f1371c.n0();
        this.a.f(this.f1371c, false);
        Fragment fragment = this.f1371c;
        fragment.f1161c = null;
        fragment.f1162d = null;
        fragment.f1163e = null;
    }

    /* access modifiers changed from: package-private */
    public v o() {
        v vVar = new v(this.f1371c);
        if (this.f1371c.f1160b <= -1 || vVar.n != null) {
            vVar.n = this.f1371c.f1161c;
        } else {
            vVar.n = s();
            if (this.f1371c.f1168j != null) {
                if (vVar.n == null) {
                    vVar.n = new Bundle();
                }
                vVar.n.putString("android:target_state", this.f1371c.f1168j);
                int i2 = this.f1371c.f1169k;
                if (i2 != 0) {
                    vVar.n.putInt("android:target_req_state", i2);
                }
            }
        }
        return vVar;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        if (this.f1371c.I != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f1371c.I.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f1371c.f1162d = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f1371c.T.b(bundle);
            if (!bundle.isEmpty()) {
                this.f1371c.f1163e = bundle;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q() {
        if (n.d(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f1371c);
        }
        this.f1371c.o0();
        this.a.g(this.f1371c, false);
    }

    /* access modifiers changed from: package-private */
    public void r() {
        if (n.d(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f1371c);
        }
        this.f1371c.p0();
        this.a.h(this.f1371c, false);
    }
}
