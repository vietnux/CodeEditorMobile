package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import androidx.fragment.app.y;
import androidx.fragment.app.z;
import androidx.lifecycle.f;
import androidx.lifecycle.u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class n implements u {
    private static boolean O = false;
    static boolean P = true;
    private androidx.activity.result.d<androidx.activity.result.g> A;
    private androidx.activity.result.d<String[]> B;
    ArrayDeque<C0020n> C = new ArrayDeque<>();
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private ArrayList<a> I;
    private ArrayList<Boolean> J;
    private ArrayList<Fragment> K;
    private ArrayList<r> L;
    private q M;
    private Runnable N = new g();
    private final ArrayList<p> a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f1312b;

    /* renamed from: c  reason: collision with root package name */
    private final x f1313c = new x();

    /* renamed from: d  reason: collision with root package name */
    ArrayList<a> f1314d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Fragment> f1315e;

    /* renamed from: f  reason: collision with root package name */
    private final l f1316f = new l(this);

    /* renamed from: g  reason: collision with root package name */
    private OnBackPressedDispatcher f1317g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.activity.b f1318h = new c(false);

    /* renamed from: i  reason: collision with root package name */
    private final AtomicInteger f1319i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, Bundle> f1320j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    private final Map<String, Object> f1321k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<o> f1322l;

    /* renamed from: m  reason: collision with root package name */
    private Map<Fragment, HashSet<c.h.h.b>> f1323m = Collections.synchronizedMap(new HashMap());
    private final z.g n = new d();
    private final m o = new m(this);
    private final CopyOnWriteArrayList<r> p = new CopyOnWriteArrayList<>();
    int q = -1;
    private k<?> r;
    private g s;
    private Fragment t;
    Fragment u;
    private j v = null;
    private j w = new e();
    private f0 x = null;
    private f0 y = new f(this);
    private androidx.activity.result.d<Intent> z;

    /* access modifiers changed from: package-private */
    public class a implements androidx.activity.result.b<androidx.activity.result.a> {
        a() {
        }

        public void a(androidx.activity.result.a aVar) {
            C0020n pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f1330b;
            int i2 = pollFirst.f1331c;
            Fragment d2 = n.this.f1313c.d(str);
            if (d2 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            d2.a(i2, aVar.b(), aVar.a());
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements androidx.activity.result.b<Map<String, Boolean>> {
        b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void a(Map<String, Boolean> map) {
            StringBuilder sb;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
            }
            C0020n pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
            } else {
                String str = pollFirst.f1330b;
                int i3 = pollFirst.f1331c;
                Fragment d2 = n.this.f1313c.d(str);
                if (d2 == null) {
                    sb = new StringBuilder();
                    sb.append("Permission request result delivered for unknown Fragment ");
                    sb.append(str);
                } else {
                    d2.a(i3, strArr, iArr);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    class c extends androidx.activity.b {
        c(boolean z) {
            super(z);
        }

        @Override // androidx.activity.b
        public void a() {
            n.this.B();
        }
    }

    class d implements z.g {
        d() {
        }

        @Override // androidx.fragment.app.z.g
        public void a(Fragment fragment, c.h.h.b bVar) {
            if (!bVar.b()) {
                n.this.b(fragment, bVar);
            }
        }

        @Override // androidx.fragment.app.z.g
        public void b(Fragment fragment, c.h.h.b bVar) {
            n.this.a(fragment, bVar);
        }
    }

    class e extends j {
        e() {
        }

        @Override // androidx.fragment.app.j
        public Fragment a(ClassLoader classLoader, String str) {
            return n.this.v().a(n.this.v().g(), str, null);
        }
    }

    class f implements f0 {
        f(n nVar) {
        }

        @Override // androidx.fragment.app.f0
        public e0 a(ViewGroup viewGroup) {
            return new c(viewGroup);
        }
    }

    class g implements Runnable {
        g() {
        }

        public void run() {
            n.this.c(true);
        }
    }

    /* access modifiers changed from: package-private */
    public class h extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1327b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f1328c;

        h(n nVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.a = viewGroup;
            this.f1327b = view;
            this.f1328c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.f1327b);
            animator.removeListener(this);
            Fragment fragment = this.f1328c;
            View view = fragment.I;
            if (view != null && fragment.A) {
                view.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class i implements r {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f1329b;

        i(n nVar, Fragment fragment) {
            this.f1329b = fragment;
        }

        @Override // androidx.fragment.app.r
        public void a(n nVar, Fragment fragment) {
            this.f1329b.a(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public class j implements androidx.activity.result.b<androidx.activity.result.a> {
        j() {
        }

        public void a(androidx.activity.result.a aVar) {
            C0020n pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f1330b;
            int i2 = pollFirst.f1331c;
            Fragment d2 = n.this.f1313c.d(str);
            if (d2 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            d2.a(i2, aVar.b(), aVar.a());
        }
    }

    public interface k {
    }

    /* access modifiers changed from: package-private */
    public static class l extends androidx.activity.result.h.a<androidx.activity.result.g, androidx.activity.result.a> {
        l() {
        }

        public Intent a(Context context, androidx.activity.result.g gVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a = gVar.a();
            if (!(a == null || (bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    g.b bVar = new g.b(gVar.d());
                    bVar.a(null);
                    bVar.a(gVar.c(), gVar.b());
                    gVar = bVar.a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gVar);
            if (n.d(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // androidx.activity.result.h.a
        public androidx.activity.result.a a(int i2, Intent intent) {
            return new androidx.activity.result.a(i2, intent);
        }
    }

    public static abstract class m {
        public abstract void a(n nVar, Fragment fragment);

        public abstract void a(n nVar, Fragment fragment, Context context);

        @Deprecated
        public abstract void a(n nVar, Fragment fragment, Bundle bundle);

        public abstract void a(n nVar, Fragment fragment, View view, Bundle bundle);

        public abstract void b(n nVar, Fragment fragment);

        public abstract void b(n nVar, Fragment fragment, Context context);

        public abstract void b(n nVar, Fragment fragment, Bundle bundle);

        public abstract void c(n nVar, Fragment fragment);

        public abstract void c(n nVar, Fragment fragment, Bundle bundle);

        public abstract void d(n nVar, Fragment fragment);

        public abstract void d(n nVar, Fragment fragment, Bundle bundle);

        public abstract void e(n nVar, Fragment fragment);

        public abstract void f(n nVar, Fragment fragment);

        public abstract void g(n nVar, Fragment fragment);
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.fragment.app.n$n  reason: collision with other inner class name */
    public static class C0020n implements Parcelable {
        public static final Parcelable.Creator<C0020n> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        String f1330b;

        /* renamed from: c  reason: collision with root package name */
        int f1331c;

        /* renamed from: androidx.fragment.app.n$n$a */
        class a implements Parcelable.Creator<C0020n> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public C0020n createFromParcel(Parcel parcel) {
                return new C0020n(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0020n[] newArray(int i2) {
                return new C0020n[i2];
            }
        }

        C0020n(Parcel parcel) {
            this.f1330b = parcel.readString();
            this.f1331c = parcel.readInt();
        }

        C0020n(String str, int i2) {
            this.f1330b = str;
            this.f1331c = i2;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f1330b);
            parcel.writeInt(this.f1331c);
        }
    }

    public interface o {
        void a();
    }

    /* access modifiers changed from: package-private */
    public interface p {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class q implements p {
        final String a;

        /* renamed from: b  reason: collision with root package name */
        final int f1332b;

        /* renamed from: c  reason: collision with root package name */
        final int f1333c;

        q(String str, int i2, int i3) {
            this.a = str;
            this.f1332b = i2;
            this.f1333c = i3;
        }

        @Override // androidx.fragment.app.n.p
        public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = n.this.u;
            if (fragment == null || this.f1332b >= 0 || this.a != null || !fragment.l().F()) {
                return n.this.a(arrayList, arrayList2, this.a, this.f1332b, this.f1333c);
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static class r implements Fragment.h {
        final boolean a;

        /* renamed from: b  reason: collision with root package name */
        final a f1335b;

        /* renamed from: c  reason: collision with root package name */
        private int f1336c;

        r(a aVar, boolean z) {
            this.a = z;
            this.f1335b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.h
        public void a() {
            this.f1336c--;
            if (this.f1336c == 0) {
                this.f1335b.q.H();
            }
        }

        @Override // androidx.fragment.app.Fragment.h
        public void b() {
            this.f1336c++;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            a aVar = this.f1335b;
            aVar.q.a(aVar, this.a, false, false);
        }

        /* access modifiers changed from: package-private */
        public void d() {
            boolean z = this.f1336c > 0;
            for (Fragment fragment : this.f1335b.q.u()) {
                fragment.a((Fragment.h) null);
                if (z && fragment.T()) {
                    fragment.u0();
                }
            }
            a aVar = this.f1335b;
            aVar.q.a(aVar, this.a, !z, true);
        }

        public boolean e() {
            return this.f1336c == 0;
        }
    }

    private void I() {
        if (D()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void J() {
        this.f1312b = false;
        this.J.clear();
        this.I.clear();
    }

    private Set<e0> K() {
        HashSet hashSet = new HashSet();
        for (w wVar : this.f1313c.b()) {
            ViewGroup viewGroup = wVar.k().H;
            if (viewGroup != null) {
                hashSet.add(e0.a(viewGroup, A()));
            }
        }
        return hashSet;
    }

    private void L() {
        if (this.H) {
            this.H = false;
            P();
        }
    }

    private void M() {
        if (P) {
            for (e0 e0Var : K()) {
                e0Var.b();
            }
        } else if (!this.f1323m.isEmpty()) {
            for (Fragment fragment : this.f1323m.keySet()) {
                p(fragment);
                l(fragment);
            }
        }
    }

    private void N() {
        if (P) {
            for (e0 e0Var : K()) {
                e0Var.c();
            }
        } else if (this.L != null) {
            while (!this.L.isEmpty()) {
                this.L.remove(0).d();
            }
        }
    }

    private void O() {
        if (this.f1322l != null) {
            for (int i2 = 0; i2 < this.f1322l.size(); i2++) {
                this.f1322l.get(i2).a();
            }
        }
    }

    private void P() {
        for (w wVar : this.f1313c.b()) {
            a(wVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (q() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (j(r3.t) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f1318h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Q() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.n$p> r0 = r3.a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.n$p> r1 = r3.a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.b r1 = r3.f1318h     // Catch:{ all -> 0x002a }
            r1.a(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.b r0 = r3.f1318h
            int r1 = r3.q()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.t
            boolean r1 = r3.j(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.a(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.Q():void");
    }

    private int a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, c.e.b<Fragment> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            a aVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.h() && !aVar.a(arrayList, i5 + 1, i3)) {
                if (this.L == null) {
                    this.L = new ArrayList<>();
                }
                r rVar = new r(aVar, booleanValue);
                this.L.add(rVar);
                aVar.a(rVar);
                if (booleanValue) {
                    aVar.f();
                } else {
                    aVar.c(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                a(bVar);
            }
        }
        return i4;
    }

    static Fragment a(View view) {
        Object tag = view.getTag(c.m.b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private Set<e0> a(ArrayList<a> arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator<y.a> it = arrayList.get(i2).a.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f1389b;
                if (!(fragment == null || (viewGroup = fragment.H) == null)) {
                    hashSet.add(e0.a(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    private void a(c.e.b<Fragment> bVar) {
        int i2 = this.q;
        if (i2 >= 1) {
            int min = Math.min(i2, 5);
            for (Fragment fragment : this.f1313c.d()) {
                if (fragment.f1160b < min) {
                    a(fragment, min);
                    if (fragment.I != null && !fragment.A && fragment.M) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    private void a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<r> arrayList3 = this.L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            r rVar = this.L.get(i2);
            if (arrayList == null || rVar.a || (indexOf2 = arrayList.indexOf(rVar.f1335b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if (rVar.e() || (arrayList != null && rVar.f1335b.a(arrayList, 0, arrayList.size()))) {
                    this.L.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || rVar.a || (indexOf = arrayList.indexOf(rVar.f1335b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        rVar.d();
                    }
                }
                i2++;
            } else {
                this.L.remove(i2);
                i2--;
                size--;
            }
            rVar.c();
            i2++;
        }
    }

    private static void a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            a aVar = arrayList.get(i2);
            boolean z2 = true;
            if (arrayList2.get(i2).booleanValue()) {
                aVar.a(-1);
                if (i2 != i3 - 1) {
                    z2 = false;
                }
                aVar.c(z2);
            } else {
                aVar.a(1);
                aVar.f();
            }
            i2++;
        }
    }

    private boolean a(String str, int i2, int i3) {
        c(false);
        d(true);
        Fragment fragment = this.u;
        if (fragment != null && i2 < 0 && str == null && fragment.l().F()) {
            return true;
        }
        boolean a2 = a(this.I, this.J, str, i2, i3);
        if (a2) {
            this.f1312b = true;
            try {
                c(this.I, this.J);
            } finally {
                J();
            }
        }
        Q();
        L();
        this.f1313c.a();
        return a2;
    }

    private void b(c.e.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment e2 = bVar.e(i2);
            if (!e2.f1171m) {
                View t0 = e2.t0();
                e2.O = t0.getAlpha();
                t0.setAlpha(0.0f);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.util.ArrayList<androidx.fragment.app.a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
        // Method dump skipped, instructions count: 451
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.b(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private boolean b(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return false;
            }
            int size = this.a.size();
            boolean z2 = false;
            for (int i2 = 0; i2 < size; i2++) {
                z2 |= this.a.get(i2).a(arrayList, arrayList2);
            }
            this.a.clear();
            this.r.h().removeCallbacks(this.N);
            return z2;
        }
    }

    /* JADX INFO: finally extract failed */
    private void c(int i2) {
        try {
            this.f1312b = true;
            this.f1313c.a(i2);
            a(i2, false);
            if (P) {
                for (e0 e0Var : K()) {
                    e0Var.b();
                }
            }
            this.f1312b = false;
            c(true);
        } catch (Throwable th) {
            this.f1312b = false;
            throw th;
        }
    }

    private void c(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                a(arrayList, arrayList2);
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    if (!arrayList.get(i2).o) {
                        if (i3 != i2) {
                            b(arrayList, arrayList2, i3, i2);
                        }
                        i3 = i2 + 1;
                        if (arrayList2.get(i2).booleanValue()) {
                            while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).o) {
                                i3++;
                            }
                        }
                        b(arrayList, arrayList2, i2, i3);
                        i2 = i3 - 1;
                    }
                    i2++;
                }
                if (i3 != size) {
                    b(arrayList, arrayList2, i3, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    private void d(boolean z2) {
        if (this.f1312b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.r == null) {
            if (this.G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.r.h().getLooper()) {
            if (!z2) {
                I();
            }
            if (this.I == null) {
                this.I = new ArrayList<>();
                this.J = new ArrayList<>();
            }
            this.f1312b = true;
            try {
                a((ArrayList<a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f1312b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    static boolean d(int i2) {
        return O || Log.isLoggable("FragmentManager", i2);
    }

    static int e(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void p(Fragment fragment) {
        HashSet<c.h.h.b> hashSet = this.f1323m.get(fragment);
        if (hashSet != null) {
            Iterator<c.h.h.b> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            r(fragment);
            this.f1323m.remove(fragment);
        }
    }

    private void q(Fragment fragment) {
        Animator animator;
        if (fragment.I != null) {
            f.d a2 = f.a(this.r.g(), fragment, !fragment.A, fragment.z());
            if (a2 == null || (animator = a2.f1293b) == null) {
                if (a2 != null) {
                    fragment.I.startAnimation(a2.a);
                    a2.a.start();
                }
                fragment.I.setVisibility((!fragment.A || fragment.Q()) ? 0 : 8);
                if (fragment.Q()) {
                    fragment.h(false);
                }
            } else {
                animator.setTarget(fragment.I);
                if (!fragment.A) {
                    fragment.I.setVisibility(0);
                } else if (fragment.Q()) {
                    fragment.h(false);
                } else {
                    ViewGroup viewGroup = fragment.H;
                    View view = fragment.I;
                    viewGroup.startViewTransition(view);
                    a2.f1293b.addListener(new h(this, viewGroup, view, fragment));
                }
                a2.f1293b.start();
            }
        }
        h(fragment);
        fragment.N = false;
        fragment.b(fragment.A);
    }

    private void r(Fragment fragment) {
        fragment.i0();
        this.o.i(fragment, false);
        fragment.H = null;
        fragment.I = null;
        fragment.T = null;
        fragment.U.a((androidx.lifecycle.i) null);
        fragment.p = false;
    }

    private void s(Fragment fragment) {
        if (fragment != null && fragment.equals(b(fragment.f1165g))) {
            fragment.m0();
        }
    }

    private q t(Fragment fragment) {
        return this.M.c(fragment);
    }

    private ViewGroup u(Fragment fragment) {
        ViewGroup viewGroup = fragment.H;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.y > 0 && this.s.b()) {
            View a2 = this.s.a(fragment.y);
            if (a2 instanceof ViewGroup) {
                return (ViewGroup) a2;
            }
        }
        return null;
    }

    private boolean v(Fragment fragment) {
        return (fragment.E && fragment.F) || fragment.v.c();
    }

    private void w(Fragment fragment) {
        ViewGroup u2 = u(fragment);
        if (u2 != null && fragment.n() + fragment.q() + fragment.A() + fragment.B() > 0) {
            if (u2.getTag(c.m.b.visible_removing_fragment_view_tag) == null) {
                u2.setTag(c.m.b.visible_removing_fragment_view_tag, fragment);
            }
            ((Fragment) u2.getTag(c.m.b.visible_removing_fragment_view_tag)).j(fragment.z());
        }
    }

    /* access modifiers changed from: package-private */
    public f0 A() {
        f0 f0Var = this.x;
        if (f0Var != null) {
            return f0Var;
        }
        Fragment fragment = this.t;
        return fragment != null ? fragment.t.A() : this.y;
    }

    /* access modifiers changed from: package-private */
    public void B() {
        c(true);
        if (this.f1318h.b()) {
            F();
        } else {
            this.f1317g.a();
        }
    }

    public boolean C() {
        return this.G;
    }

    public boolean D() {
        return this.E || this.F;
    }

    /* access modifiers changed from: package-private */
    public void E() {
        if (this.r != null) {
            this.E = false;
            this.F = false;
            this.M.a(false);
            for (Fragment fragment : this.f1313c.d()) {
                if (fragment != null) {
                    fragment.X();
                }
            }
        }
    }

    public boolean F() {
        return a((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    public Parcelable G() {
        int size;
        N();
        M();
        c(true);
        this.E = true;
        this.M.a(true);
        ArrayList<v> h2 = this.f1313c.h();
        b[] bVarArr = null;
        if (h2.isEmpty()) {
            if (d(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> i2 = this.f1313c.i();
        ArrayList<a> arrayList = this.f1314d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new b[size];
            for (int i3 = 0; i3 < size; i3++) {
                bVarArr[i3] = new b(this.f1314d.get(i3));
                if (d(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.f1314d.get(i3));
                }
            }
        }
        p pVar = new p();
        pVar.f1337b = h2;
        pVar.f1338c = i2;
        pVar.f1339d = bVarArr;
        pVar.f1340e = this.f1319i.get();
        Fragment fragment = this.u;
        if (fragment != null) {
            pVar.f1341f = fragment.f1165g;
        }
        pVar.f1342g.addAll(this.f1320j.keySet());
        pVar.f1343h.addAll(this.f1320j.values());
        pVar.f1344i = new ArrayList<>(this.C);
        return pVar;
    }

    /* access modifiers changed from: package-private */
    public void H() {
        synchronized (this.a) {
            boolean z2 = false;
            boolean z3 = this.L != null && !this.L.isEmpty();
            if (this.a.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.r.h().removeCallbacks(this.N);
                this.r.h().post(this.N);
                Q();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f1319i.getAndIncrement();
    }

    public Fragment a(int i2) {
        return this.f1313c.b(i2);
    }

    /* access modifiers changed from: package-private */
    public w a(Fragment fragment) {
        if (d(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        w c2 = c(fragment);
        fragment.t = this;
        this.f1313c.a(c2);
        if (!fragment.B) {
            this.f1313c.a(fragment);
            fragment.n = false;
            if (fragment.I == null) {
                fragment.N = false;
            }
            if (v(fragment)) {
                this.D = true;
            }
        }
        return c2;
    }

    public void a(int i2, int i3) {
        if (i2 >= 0) {
            a((p) new q(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, boolean z2) {
        k<?> kVar;
        if (this.r == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.q) {
            this.q = i2;
            if (P) {
                this.f1313c.f();
            } else {
                for (Fragment fragment : this.f1313c.d()) {
                    k(fragment);
                }
                for (w wVar : this.f1313c.b()) {
                    Fragment k2 = wVar.k();
                    if (!k2.M) {
                        k(k2);
                    }
                    if (k2.n && !k2.R()) {
                        this.f1313c.b(wVar);
                    }
                }
            }
            P();
            if (this.D && (kVar = this.r) != null && this.q == 7) {
                kVar.k();
                this.D = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Configuration configuration) {
        for (Fragment fragment : this.f1313c.d()) {
            if (fragment != null) {
                fragment.a(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Parcelable parcelable) {
        w wVar;
        if (parcelable != null) {
            p pVar = (p) parcelable;
            if (pVar.f1337b != null) {
                this.f1313c.g();
                Iterator<v> it = pVar.f1337b.iterator();
                while (it.hasNext()) {
                    v next = it.next();
                    if (next != null) {
                        Fragment b2 = this.M.b(next.f1359c);
                        if (b2 != null) {
                            if (d(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + b2);
                            }
                            wVar = new w(this.o, this.f1313c, b2, next);
                        } else {
                            wVar = new w(this.o, this.f1313c, this.r.g().getClassLoader(), s(), next);
                        }
                        Fragment k2 = wVar.k();
                        k2.t = this;
                        if (d(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + k2.f1165g + "): " + k2);
                        }
                        wVar.a(this.r.g().getClassLoader());
                        this.f1313c.a(wVar);
                        wVar.a(this.q);
                    }
                }
                for (Fragment fragment : this.M.c()) {
                    if (!this.f1313c.a(fragment.f1165g)) {
                        if (d(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + pVar.f1337b);
                        }
                        this.M.e(fragment);
                        fragment.t = this;
                        w wVar2 = new w(this.o, this.f1313c, fragment);
                        wVar2.a(1);
                        wVar2.l();
                        fragment.n = true;
                        wVar2.l();
                    }
                }
                this.f1313c.a(pVar.f1338c);
                b[] bVarArr = pVar.f1339d;
                if (bVarArr != null) {
                    this.f1314d = new ArrayList<>(bVarArr.length);
                    int i2 = 0;
                    while (true) {
                        b[] bVarArr2 = pVar.f1339d;
                        if (i2 >= bVarArr2.length) {
                            break;
                        }
                        a a2 = bVarArr2[i2].a(this);
                        if (d(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + a2.s + "): " + a2);
                            PrintWriter printWriter = new PrintWriter(new d0("FragmentManager"));
                            a2.a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f1314d.add(a2);
                        i2++;
                    }
                } else {
                    this.f1314d = null;
                }
                this.f1319i.set(pVar.f1340e);
                String str = pVar.f1341f;
                if (str != null) {
                    this.u = b(str);
                    s(this.u);
                }
                ArrayList<String> arrayList = pVar.f1342g;
                if (arrayList != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        Bundle bundle = pVar.f1343h.get(i3);
                        bundle.setClassLoader(this.r.g().getClassLoader());
                        this.f1320j.put(arrayList.get(i3), bundle);
                    }
                }
                this.C = new ArrayDeque<>(pVar.f1344i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Menu menu) {
        if (this.q >= 1) {
            for (Fragment fragment : this.f1313c.d()) {
                if (fragment != null) {
                    fragment.c(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r2 != 5) goto L_0x0163;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.fragment.app.Fragment r11, int r12) {
        /*
        // Method dump skipped, instructions count: 406
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.a(androidx.fragment.app.Fragment, int):void");
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (this.z != null) {
            this.C.addLast(new C0020n(fragment.f1165g, i2));
            if (!(intent == null || bundle == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.z.a(intent);
            return;
        }
        this.r.a(fragment, intent, i2, bundle);
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment, f.c cVar) {
        if (!fragment.equals(b(fragment.f1165g)) || !(fragment.u == null || fragment.t == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.R = cVar;
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment, c.h.h.b bVar) {
        if (this.f1323m.get(fragment) == null) {
            this.f1323m.put(fragment, new HashSet<>());
        }
        this.f1323m.get(fragment).add(bVar);
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment, boolean z2) {
        ViewGroup u2 = u(fragment);
        if (u2 != null && (u2 instanceof h)) {
            ((h) u2).setDrawDisappearingViewsLast(!z2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        if (this.f1314d == null) {
            this.f1314d = new ArrayList<>();
        }
        this.f1314d.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.c(z4);
        } else {
            aVar.f();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3 && this.q >= 1) {
            z.a(this.r.g(), this.s, arrayList, arrayList2, 0, 1, true, this.n);
        }
        if (z4) {
            a(this.q, true);
        }
        for (Fragment fragment : this.f1313c.c()) {
            if (fragment != null && fragment.I != null && fragment.M && aVar.b(fragment.y)) {
                float f2 = fragment.O;
                if (f2 > 0.0f) {
                    fragment.I.setAlpha(f2);
                }
                if (z4) {
                    fragment.O = 0.0f;
                } else {
                    fragment.O = -1.0f;
                    fragment.M = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(h hVar) {
        View view;
        for (w wVar : this.f1313c.b()) {
            Fragment k2 = wVar.k();
            if (k2.y == hVar.getId() && (view = k2.I) != null && view.getParent() == null) {
                k2.H = hVar;
                wVar.b();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v18, resolved type: androidx.activity.c */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.fragment.app.k<?> r3, androidx.fragment.app.g r4, androidx.fragment.app.Fragment r5) {
        /*
        // Method dump skipped, instructions count: 271
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.a(androidx.fragment.app.k, androidx.fragment.app.g, androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    public void a(p pVar, boolean z2) {
        if (!z2) {
            if (this.r != null) {
                I();
            } else if (this.G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.a) {
            if (this.r != null) {
                this.a.add(pVar);
                H();
            } else if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public void a(r rVar) {
        this.p.add(rVar);
    }

    /* access modifiers changed from: package-private */
    public void a(w wVar) {
        Fragment k2 = wVar.k();
        if (!k2.J) {
            return;
        }
        if (this.f1312b) {
            this.H = true;
            return;
        }
        k2.J = false;
        if (P) {
            wVar.l();
        } else {
            l(k2);
        }
    }

    public final void a(String str) {
        this.f1320j.remove(str);
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f1313c.a(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f1315e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f1315e.get(i2).toString());
            }
        }
        ArrayList<a> arrayList2 = this.f1314d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = this.f1314d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.a(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1319i.get());
        synchronized (this.a) {
            int size3 = this.a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size3; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(this.a.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.s);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2) {
        for (Fragment fragment : this.f1313c.d()) {
            if (fragment != null) {
                fragment.f(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(Menu menu, MenuInflater menuInflater) {
        if (this.q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (Fragment fragment : this.f1313c.d()) {
            if (fragment != null && i(fragment) && fragment.b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z2 = true;
            }
        }
        if (this.f1315e != null) {
            for (int i2 = 0; i2 < this.f1315e.size(); i2++) {
                Fragment fragment2 = this.f1315e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.Z();
                }
            }
        }
        this.f1315e = arrayList;
        return z2;
    }

    /* access modifiers changed from: package-private */
    public boolean a(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (Fragment fragment : this.f1313c.d()) {
            if (fragment != null && fragment.c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<a> arrayList3 = this.f1314d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1314d.remove(size));
            arrayList2.add(true);
        } else {
            if (str != null || i2 >= 0) {
                i4 = this.f1314d.size() - 1;
                while (i4 >= 0) {
                    a aVar = this.f1314d.get(i4);
                    if ((str != null && str.equals(aVar.g())) || (i2 >= 0 && i2 == aVar.s)) {
                        break;
                    }
                    i4--;
                }
                if (i4 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        i4--;
                        if (i4 < 0) {
                            break;
                        }
                        a aVar2 = this.f1314d.get(i4);
                        if ((str == null || !str.equals(aVar2.g())) && (i2 < 0 || i2 != aVar2.s)) {
                            break;
                        }
                    }
                }
            } else {
                i4 = -1;
            }
            if (i4 == this.f1314d.size() - 1) {
                return false;
            }
            for (int size2 = this.f1314d.size() - 1; size2 > i4; size2--) {
                arrayList.add(this.f1314d.remove(size2));
                arrayList2.add(true);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public Fragment b(String str) {
        return this.f1313c.b(str);
    }

    public y b() {
        return new a(this);
    }

    /* access modifiers changed from: package-private */
    public void b(Fragment fragment) {
        if (d(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.B) {
            fragment.B = false;
            if (!fragment.f1171m) {
                this.f1313c.a(fragment);
                if (d(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (v(fragment)) {
                    this.D = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Fragment fragment, c.h.h.b bVar) {
        HashSet<c.h.h.b> hashSet = this.f1323m.get(fragment);
        if (hashSet != null && hashSet.remove(bVar) && hashSet.isEmpty()) {
            this.f1323m.remove(fragment);
            if (fragment.f1160b < 5) {
                r(fragment);
                l(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(p pVar, boolean z2) {
        if (!z2 || (this.r != null && !this.G)) {
            d(z2);
            if (pVar.a(this.I, this.J)) {
                this.f1312b = true;
                try {
                    c(this.I, this.J);
                } finally {
                    J();
                }
            }
            Q();
            L();
            this.f1313c.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z2) {
        for (Fragment fragment : this.f1313c.d()) {
            if (fragment != null) {
                fragment.g(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i2) {
        return this.q >= i2;
    }

    /* access modifiers changed from: package-private */
    public boolean b(Menu menu) {
        boolean z2 = false;
        if (this.q < 1) {
            return false;
        }
        for (Fragment fragment : this.f1313c.d()) {
            if (fragment != null && i(fragment) && fragment.d(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    public boolean b(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (Fragment fragment : this.f1313c.d()) {
            if (fragment != null && fragment.d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public Fragment c(String str) {
        return this.f1313c.c(str);
    }

    /* access modifiers changed from: package-private */
    public w c(Fragment fragment) {
        w e2 = this.f1313c.e(fragment.f1165g);
        if (e2 != null) {
            return e2;
        }
        w wVar = new w(this.o, this.f1313c, fragment);
        wVar.a(this.r.g().getClassLoader());
        wVar.a(this.q);
        return wVar;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        boolean z2 = false;
        for (Fragment fragment : this.f1313c.c()) {
            if (fragment != null) {
                z2 = v(fragment);
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public boolean c(boolean z2) {
        d(z2);
        boolean z3 = false;
        while (b(this.I, this.J)) {
            this.f1312b = true;
            try {
                c(this.I, this.J);
                J();
                z3 = true;
            } catch (Throwable th) {
                J();
                throw th;
            }
        }
        Q();
        L();
        this.f1313c.a();
        return z3;
    }

    /* access modifiers changed from: package-private */
    public Fragment d(String str) {
        return this.f1313c.d(str);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.E = false;
        this.F = false;
        this.M.a(false);
        c(4);
    }

    /* access modifiers changed from: package-private */
    public void d(Fragment fragment) {
        if (d(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.B) {
            fragment.B = true;
            if (fragment.f1171m) {
                if (d(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f1313c.c(fragment);
                if (v(fragment)) {
                    this.D = true;
                }
                w(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.E = false;
        this.F = false;
        this.M.a(false);
        c(0);
    }

    /* access modifiers changed from: package-private */
    public void e(Fragment fragment) {
        Iterator<r> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public u f(Fragment fragment) {
        return this.M.d(fragment);
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.E = false;
        this.F = false;
        this.M.a(false);
        c(1);
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.G = true;
        c(true);
        M();
        c(-1);
        this.r = null;
        this.s = null;
        this.t = null;
        if (this.f1317g != null) {
            this.f1318h.c();
            this.f1317g = null;
        }
        androidx.activity.result.d<Intent> dVar = this.z;
        if (dVar != null) {
            dVar.a();
            this.A.a();
            this.B.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void g(Fragment fragment) {
        if (d(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.A) {
            fragment.A = true;
            fragment.N = true ^ fragment.N;
            w(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        c(1);
    }

    /* access modifiers changed from: package-private */
    public void h(Fragment fragment) {
        if (fragment.f1171m && v(fragment)) {
            this.D = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        for (Fragment fragment : this.f1313c.d()) {
            if (fragment != null) {
                fragment.k0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean i(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.S();
    }

    /* access modifiers changed from: package-private */
    public void j() {
        c(5);
    }

    /* access modifiers changed from: package-private */
    public boolean j(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        n nVar = fragment.t;
        return fragment.equals(nVar.z()) && j(nVar.t);
    }

    /* access modifiers changed from: package-private */
    public void k() {
        Q();
        s(this.u);
    }

    /* access modifiers changed from: package-private */
    public void k(Fragment fragment) {
        if (this.f1313c.a(fragment.f1165g)) {
            l(fragment);
            View view = fragment.I;
            if (!(view == null || !fragment.M || fragment.H == null)) {
                float f2 = fragment.O;
                if (f2 > 0.0f) {
                    view.setAlpha(f2);
                }
                fragment.O = 0.0f;
                fragment.M = false;
                f.d a2 = f.a(this.r.g(), fragment, true, fragment.z());
                if (a2 != null) {
                    Animation animation = a2.a;
                    if (animation != null) {
                        fragment.I.startAnimation(animation);
                    } else {
                        a2.f1293b.setTarget(fragment.I);
                        a2.f1293b.start();
                    }
                }
            }
            if (fragment.N) {
                q(fragment);
            }
        } else if (d(3)) {
            Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.q + "since it is not added to " + this);
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.E = false;
        this.F = false;
        this.M.a(false);
        c(7);
    }

    /* access modifiers changed from: package-private */
    public void l(Fragment fragment) {
        a(fragment, this.q);
    }

    /* access modifiers changed from: package-private */
    public void m() {
        this.E = false;
        this.F = false;
        this.M.a(false);
        c(5);
    }

    /* access modifiers changed from: package-private */
    public void m(Fragment fragment) {
        if (d(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.s);
        }
        boolean z2 = !fragment.R();
        if (!fragment.B || z2) {
            this.f1313c.c(fragment);
            if (v(fragment)) {
                this.D = true;
            }
            fragment.n = true;
            w(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        this.F = true;
        this.M.a(true);
        c(4);
    }

    /* access modifiers changed from: package-private */
    public void n(Fragment fragment) {
        if (fragment == null || (fragment.equals(b(fragment.f1165g)) && (fragment.u == null || fragment.t == this))) {
            Fragment fragment2 = this.u;
            this.u = fragment;
            s(fragment2);
            s(this.u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* access modifiers changed from: package-private */
    public void o() {
        c(2);
    }

    /* access modifiers changed from: package-private */
    public void o(Fragment fragment) {
        if (d(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.A) {
            fragment.A = false;
            fragment.N = !fragment.N;
        }
    }

    public boolean p() {
        boolean c2 = c(true);
        N();
        return c2;
    }

    public int q() {
        ArrayList<a> arrayList = this.f1314d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public g r() {
        return this.s;
    }

    public j s() {
        j jVar = this.v;
        if (jVar != null) {
            return jVar;
        }
        Fragment fragment = this.t;
        return fragment != null ? fragment.t.s() : this.w;
    }

    /* access modifiers changed from: package-private */
    public x t() {
        return this.f1313c;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.t;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.t;
        } else {
            k<?> kVar = this.r;
            if (kVar != null) {
                sb.append(kVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.r;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public List<Fragment> u() {
        return this.f1313c.d();
    }

    /* access modifiers changed from: package-private */
    public k<?> v() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 w() {
        return this.f1316f;
    }

    /* access modifiers changed from: package-private */
    public m x() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public Fragment y() {
        return this.t;
    }

    public Fragment z() {
        return this.u;
    }
}
