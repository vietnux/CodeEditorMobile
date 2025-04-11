package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, i, v, androidx.lifecycle.e, androidx.savedstate.c, androidx.activity.result.c {
    static final Object Y = new Object();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F = true;
    private boolean G;
    ViewGroup H;
    View I;
    boolean J;
    boolean K = true;
    e L;
    boolean M;
    boolean N;
    float O;
    LayoutInflater P;
    boolean Q;
    f.c R;
    j S;
    c0 T;
    n<i> U;
    androidx.savedstate.b V;
    private int W;
    private final ArrayList<g> X;

    /* renamed from: b  reason: collision with root package name */
    int f1160b = -1;

    /* renamed from: c  reason: collision with root package name */
    Bundle f1161c;

    /* renamed from: d  reason: collision with root package name */
    SparseArray<Parcelable> f1162d;

    /* renamed from: e  reason: collision with root package name */
    Bundle f1163e;

    /* renamed from: f  reason: collision with root package name */
    Boolean f1164f;

    /* renamed from: g  reason: collision with root package name */
    String f1165g = UUID.randomUUID().toString();

    /* renamed from: h  reason: collision with root package name */
    Bundle f1166h;

    /* renamed from: i  reason: collision with root package name */
    Fragment f1167i;

    /* renamed from: j  reason: collision with root package name */
    String f1168j = null;

    /* renamed from: k  reason: collision with root package name */
    int f1169k;

    /* renamed from: l  reason: collision with root package name */
    private Boolean f1170l = null;

    /* renamed from: m  reason: collision with root package name */
    boolean f1171m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    int s;
    n t;
    k<?> u;
    n v = new o();
    Fragment w;
    int x;
    int y;
    String z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            Fragment.this.u0();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        b() {
        }

        public void run() {
            Fragment.this.a(false);
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e0 f1174b;

        c(Fragment fragment, e0 e0Var) {
            this.f1174b = e0Var;
        }

        public void run() {
            this.f1174b.a();
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends g {
        d() {
        }

        @Override // androidx.fragment.app.g
        public View a(int i2) {
            View view = Fragment.this.I;
            if (view != null) {
                return view.findViewById(i2);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.g
        public boolean b() {
            return Fragment.this.I != null;
        }
    }

    /* access modifiers changed from: package-private */
    public static class e {
        View a;

        /* renamed from: b  reason: collision with root package name */
        Animator f1175b;

        /* renamed from: c  reason: collision with root package name */
        boolean f1176c;

        /* renamed from: d  reason: collision with root package name */
        int f1177d;

        /* renamed from: e  reason: collision with root package name */
        int f1178e;

        /* renamed from: f  reason: collision with root package name */
        int f1179f;

        /* renamed from: g  reason: collision with root package name */
        int f1180g;

        /* renamed from: h  reason: collision with root package name */
        int f1181h;

        /* renamed from: i  reason: collision with root package name */
        ArrayList<String> f1182i;

        /* renamed from: j  reason: collision with root package name */
        ArrayList<String> f1183j;

        /* renamed from: k  reason: collision with root package name */
        Object f1184k = null;

        /* renamed from: l  reason: collision with root package name */
        Object f1185l;

        /* renamed from: m  reason: collision with root package name */
        Object f1186m;
        Object n;
        Object o;
        Object p;
        Boolean q;
        Boolean r;
        androidx.core.app.n s;
        androidx.core.app.n t;
        float u;
        View v;
        boolean w;
        h x;
        boolean y;

        e() {
            Object obj = Fragment.Y;
            this.f1185l = obj;
            this.f1186m = null;
            this.n = obj;
            this.o = null;
            this.p = obj;
            this.s = null;
            this.t = null;
            this.u = 1.0f;
            this.v = null;
        }
    }

    public static class f extends RuntimeException {
        public f(String str, Exception exc) {
            super(str, exc);
        }
    }

    private static abstract class g {
        private g() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a();
    }

    /* access modifiers changed from: package-private */
    public interface h {
        void a();

        void b();
    }

    public Fragment() {
        new a();
        this.R = f.c.RESUMED;
        this.U = new n<>();
        new AtomicInteger();
        this.X = new ArrayList<>();
        x0();
    }

    @Deprecated
    public static Fragment a(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) j.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.m(bundle);
            }
            return fragment;
        } catch (InstantiationException e2) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new f("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new f("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    private e v0() {
        if (this.L == null) {
            this.L = new e();
        }
        return this.L;
    }

    private int w0() {
        f.c cVar = this.R;
        return (cVar == f.c.INITIALIZED || this.w == null) ? this.R.ordinal() : Math.min(cVar.ordinal(), this.w.w0());
    }

    private void x0() {
        this.S = new j(this);
        this.V = androidx.savedstate.b.a(this);
    }

    private void y0() {
        if (n.d(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.I != null) {
            l(this.f1161c);
        }
        this.f1161c = null;
    }

    /* access modifiers changed from: package-private */
    public int A() {
        e eVar = this.L;
        if (eVar == null) {
            return 0;
        }
        return eVar.f1179f;
    }

    /* access modifiers changed from: package-private */
    public int B() {
        e eVar = this.L;
        if (eVar == null) {
            return 0;
        }
        return eVar.f1180g;
    }

    /* access modifiers changed from: package-private */
    public float C() {
        e eVar = this.L;
        if (eVar == null) {
            return 1.0f;
        }
        return eVar.u;
    }

    public Object D() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.n;
        return obj == Y ? r() : obj;
    }

    public final Resources E() {
        return s0().getResources();
    }

    public Object F() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f1185l;
        return obj == Y ? o() : obj;
    }

    public Object G() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        return eVar.o;
    }

    public Object H() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.p;
        return obj == Y ? G() : obj;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> I() {
        ArrayList<String> arrayList;
        e eVar = this.L;
        return (eVar == null || (arrayList = eVar.f1182i) == null) ? new ArrayList<>() : arrayList;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> J() {
        ArrayList<String> arrayList;
        e eVar = this.L;
        return (eVar == null || (arrayList = eVar.f1183j) == null) ? new ArrayList<>() : arrayList;
    }

    @Deprecated
    public final Fragment K() {
        String str;
        Fragment fragment = this.f1167i;
        if (fragment != null) {
            return fragment;
        }
        n nVar = this.t;
        if (nVar == null || (str = this.f1168j) == null) {
            return null;
        }
        return nVar.b(str);
    }

    public View L() {
        return this.I;
    }

    public LiveData<i> M() {
        return this.U;
    }

    /* access modifiers changed from: package-private */
    public void N() {
        x0();
        this.f1165g = UUID.randomUUID().toString();
        this.f1171m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.s = 0;
        this.t = null;
        this.v = new o();
        this.u = null;
        this.x = 0;
        this.y = 0;
        this.z = null;
        this.A = false;
        this.B = false;
    }

    public final boolean O() {
        return this.u != null && this.f1171m;
    }

    public final boolean P() {
        return this.A;
    }

    /* access modifiers changed from: package-private */
    public boolean Q() {
        e eVar = this.L;
        if (eVar == null) {
            return false;
        }
        return eVar.y;
    }

    /* access modifiers changed from: package-private */
    public final boolean R() {
        return this.s > 0;
    }

    public final boolean S() {
        n nVar;
        return this.F && ((nVar = this.t) == null || nVar.i(this.w));
    }

    /* access modifiers changed from: package-private */
    public boolean T() {
        e eVar = this.L;
        if (eVar == null) {
            return false;
        }
        return eVar.w;
    }

    public final boolean U() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public final boolean V() {
        Fragment x2 = x();
        return x2 != null && (x2.U() || x2.V());
    }

    public final boolean W() {
        n nVar = this.t;
        if (nVar == null) {
            return false;
        }
        return nVar.D();
    }

    /* access modifiers changed from: package-private */
    public void X() {
        this.v.E();
    }

    public void Y() {
        this.G = true;
    }

    public void Z() {
    }

    @Deprecated
    public LayoutInflater a(Bundle bundle) {
        k<?> kVar = this.u;
        if (kVar != null) {
            LayoutInflater j2 = kVar.j();
            c.h.l.i.b(j2, this.v.w());
            return j2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.W;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    public Animation a(int i2, boolean z2, int i3) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment a(String str) {
        return str.equals(this.f1165g) ? this : this.v.d(str);
    }

    @Override // androidx.lifecycle.i
    public androidx.lifecycle.f a() {
        return this.S;
    }

    public final String a(int i2) {
        return E().getString(i2);
    }

    public final String a(int i2, Object... objArr) {
        return E().getString(i2, objArr);
    }

    /* access modifiers changed from: package-private */
    public void a(float f2) {
        v0().u = f2;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3, int i4, int i5) {
        if (this.L != null || i2 != 0 || i3 != 0 || i4 != 0 || i5 != 0) {
            v0().f1177d = i2;
            v0().f1178e = i3;
            v0().f1179f = i4;
            v0().f1180g = i5;
        }
    }

    @Deprecated
    public void a(int i2, int i3, Intent intent) {
        if (n.d(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    @Deprecated
    public void a(int i2, String[] strArr, int[] iArr) {
    }

    /* access modifiers changed from: package-private */
    public void a(Animator animator) {
        v0().f1175b = animator;
    }

    @Deprecated
    public void a(Activity activity) {
        this.G = true;
    }

    @Deprecated
    public void a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.G = true;
    }

    public void a(Context context) {
        this.G = true;
        k<?> kVar = this.u;
        Activity d2 = kVar == null ? null : kVar.d();
        if (d2 != null) {
            this.G = false;
            a(d2);
        }
    }

    public void a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.G = true;
        k<?> kVar = this.u;
        Activity d2 = kVar == null ? null : kVar.d();
        if (d2 != null) {
            this.G = false;
            a(d2, attributeSet, bundle);
        }
    }

    @Deprecated
    public void a(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        a(intent, i2, (Bundle) null);
    }

    @Deprecated
    public void a(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (this.u != null) {
            y().a(this, intent, i2, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* access modifiers changed from: package-private */
    public void a(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.v.a(configuration);
    }

    public void a(Menu menu) {
    }

    public void a(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    public void a(View view) {
        v0().a = view;
    }

    public void a(View view, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public void a(h hVar) {
        v0();
        h hVar2 = this.L.x;
        if (hVar != hVar2) {
            if (hVar == null || hVar2 == null) {
                e eVar = this.L;
                if (eVar.w) {
                    eVar.x = hVar;
                }
                if (hVar != null) {
                    hVar.b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    @Deprecated
    public void a(Fragment fragment) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.y));
        printWriter.print(" mTag=");
        printWriter.println(this.z);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1160b);
        printWriter.print(" mWho=");
        printWriter.print(this.f1165g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f1171m);
        printWriter.print(" mRemoving=");
        printWriter.print(this.n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.A);
        printWriter.print(" mDetached=");
        printWriter.print(this.B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.F);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.E);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.K);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.t);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.u);
        }
        if (this.w != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.w);
        }
        if (this.f1166h != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1166h);
        }
        if (this.f1161c != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1161c);
        }
        if (this.f1162d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1162d);
        }
        if (this.f1163e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f1163e);
        }
        Fragment K2 = K();
        if (K2 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(K2);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f1169k);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(z());
        if (n() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(n());
        }
        if (q() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(q());
        }
        if (A() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(A());
        }
        if (B() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(B());
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.H);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.I);
        }
        if (i() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(i());
        }
        if (m() != null) {
            c.p.a.a.a(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.v + ":");
        n nVar = this.v;
        nVar.a(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: package-private */
    public void a(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        v0();
        e eVar = this.L;
        eVar.f1182i = arrayList;
        eVar.f1183j = arrayList2;
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2) {
        ViewGroup viewGroup;
        n nVar;
        e eVar = this.L;
        h hVar = null;
        if (eVar != null) {
            eVar.w = false;
            h hVar2 = eVar.x;
            eVar.x = null;
            hVar = hVar2;
        }
        if (hVar != null) {
            hVar.a();
        } else if (n.P && this.I != null && (viewGroup = this.H) != null && (nVar = this.t) != null) {
            e0 a2 = e0.a(viewGroup, nVar);
            a2.e();
            if (z2) {
                this.u.h().post(new c(this, a2));
            } else {
                a2.a();
            }
        }
    }

    public boolean a(MenuItem menuItem) {
        return false;
    }

    public void a0() {
        this.G = true;
    }

    public Animator b(int i2, boolean z2, int i3) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public g b() {
        return new d();
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        if (this.L != null || i2 != 0) {
            v0();
            this.L.f1181h = i2;
        }
    }

    @Deprecated
    public void b(Bundle bundle) {
        this.G = true;
    }

    /* access modifiers changed from: package-private */
    public void b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.v.E();
        this.r = true;
        this.T = new c0(this, e());
        this.I = a(layoutInflater, viewGroup, bundle);
        if (this.I != null) {
            this.T.b();
            w.a(this.I, this.T);
            x.a(this.I, this.T);
            androidx.savedstate.d.a(this.I, this.T);
            this.U.a(this.T);
        } else if (!this.T.c()) {
            this.T = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void b(Menu menu) {
    }

    /* access modifiers changed from: package-private */
    public void b(View view) {
        v0().v = view;
    }

    public void b(boolean z2) {
    }

    /* access modifiers changed from: package-private */
    public boolean b(Menu menu, MenuInflater menuInflater) {
        boolean z2 = false;
        if (this.A) {
            return false;
        }
        if (this.E && this.F) {
            z2 = true;
            a(menu, menuInflater);
        }
        return z2 | this.v.a(menu, menuInflater);
    }

    public boolean b(MenuItem menuItem) {
        return false;
    }

    public void b0() {
        this.G = true;
    }

    public void c(Bundle bundle) {
        this.G = true;
        k(bundle);
        if (!this.v.b(1)) {
            this.v.f();
        }
    }

    /* access modifiers changed from: package-private */
    public void c(Menu menu) {
        if (!this.A) {
            if (this.E && this.F) {
                a(menu);
            }
            this.v.a(menu);
        }
    }

    public void c(boolean z2) {
    }

    /* access modifiers changed from: package-private */
    public boolean c(MenuItem menuItem) {
        if (this.A) {
            return false;
        }
        if (a(menuItem)) {
            return true;
        }
        return this.v.a(menuItem);
    }

    public void c0() {
        this.G = true;
    }

    public LayoutInflater d(Bundle bundle) {
        return a(bundle);
    }

    @Override // androidx.savedstate.c
    public final SavedStateRegistry d() {
        return this.V.a();
    }

    public void d(boolean z2) {
    }

    /* access modifiers changed from: package-private */
    public boolean d(Menu menu) {
        boolean z2 = false;
        if (this.A) {
            return false;
        }
        if (this.E && this.F) {
            z2 = true;
            b(menu);
        }
        return z2 | this.v.b(menu);
    }

    /* access modifiers changed from: package-private */
    public boolean d(MenuItem menuItem) {
        if (this.A) {
            return false;
        }
        if (!this.E || !this.F || !b(menuItem)) {
            return this.v.b(menuItem);
        }
        return true;
    }

    public void d0() {
        this.G = true;
    }

    @Override // androidx.lifecycle.v
    public u e() {
        if (this.t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (w0() != f.c.INITIALIZED.ordinal()) {
            return this.t.f(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public void e(Bundle bundle) {
    }

    public void e(boolean z2) {
    }

    public void e0() {
        this.G = true;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final e f() {
        k<?> kVar = this.u;
        if (kVar == null) {
            return null;
        }
        return (e) kVar.d();
    }

    public void f(Bundle bundle) {
        this.G = true;
    }

    /* access modifiers changed from: package-private */
    public void f(boolean z2) {
        c(z2);
        this.v.a(z2);
    }

    public void f0() {
        this.G = true;
    }

    /* access modifiers changed from: package-private */
    public void g(Bundle bundle) {
        this.v.E();
        this.f1160b = 3;
        this.G = false;
        b(bundle);
        if (this.G) {
            y0();
            this.v.d();
            return;
        }
        throw new g0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z2) {
        d(z2);
        this.v.b(z2);
    }

    public boolean g() {
        Boolean bool;
        e eVar = this.L;
        if (eVar == null || (bool = eVar.r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public void g0() {
        Iterator<g> it = this.X.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.X.clear();
        this.v.a(this.u, b(), this);
        this.f1160b = 0;
        this.G = false;
        a(this.u.g());
        if (this.G) {
            this.t.e(this);
            this.v.e();
            return;
        }
        throw new g0("Fragment " + this + " did not call through to super.onAttach()");
    }

    /* access modifiers changed from: package-private */
    public void h(Bundle bundle) {
        this.v.E();
        this.f1160b = 1;
        this.G = false;
        if (Build.VERSION.SDK_INT >= 19) {
            this.S.a(new androidx.lifecycle.g() {
                /* class androidx.fragment.app.Fragment.AnonymousClass5 */

                @Override // androidx.lifecycle.g
                public void a(i iVar, f.b bVar) {
                    View view;
                    if (bVar == f.b.ON_STOP && (view = Fragment.this.I) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
        }
        this.V.a(bundle);
        c(bundle);
        this.Q = true;
        if (this.G) {
            this.S.a(f.b.ON_CREATE);
            return;
        }
        throw new g0("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* access modifiers changed from: package-private */
    public void h(boolean z2) {
        v0().y = z2;
    }

    public boolean h() {
        Boolean bool;
        e eVar = this.L;
        if (eVar == null || (bool = eVar.q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public void h0() {
        this.v.g();
        this.S.a(f.b.ON_DESTROY);
        this.f1160b = 0;
        this.G = false;
        this.Q = false;
        Y();
        if (!this.G) {
            throw new g0("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater i(Bundle bundle) {
        this.P = d(bundle);
        return this.P;
    }

    /* access modifiers changed from: package-private */
    public View i() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        return eVar.a;
    }

    public void i(boolean z2) {
        if (this.F != z2) {
            this.F = z2;
            if (this.E && O() && !P()) {
                this.u.k();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i0() {
        this.v.h();
        if (this.I != null && this.T.a().a().a(f.c.CREATED)) {
            this.T.a(f.b.ON_DESTROY);
        }
        this.f1160b = 1;
        this.G = false;
        a0();
        if (this.G) {
            c.p.a.a.a(this).a();
            this.r = false;
            return;
        }
        throw new g0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public Animator j() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        return eVar.f1175b;
    }

    /* access modifiers changed from: package-private */
    public void j(Bundle bundle) {
        e(bundle);
        this.V.b(bundle);
        Parcelable G2 = this.v.G();
        if (G2 != null) {
            bundle.putParcelable("android:support:fragments", G2);
        }
    }

    /* access modifiers changed from: package-private */
    public void j(boolean z2) {
        if (this.L != null) {
            v0().f1176c = z2;
        }
    }

    /* access modifiers changed from: package-private */
    public void j0() {
        this.f1160b = -1;
        this.G = false;
        b0();
        this.P = null;
        if (!this.G) {
            throw new g0("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.v.C()) {
            this.v.g();
            this.v = new o();
        }
    }

    public final Bundle k() {
        return this.f1166h;
    }

    /* access modifiers changed from: package-private */
    public void k(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.v.a(parcelable);
            this.v.f();
        }
    }

    @Deprecated
    public void k(boolean z2) {
        if (!this.K && z2 && this.f1160b < 5 && this.t != null && O() && this.Q) {
            n nVar = this.t;
            nVar.a(nVar.c(this));
        }
        this.K = z2;
        this.J = this.f1160b < 5 && !z2;
        if (this.f1161c != null) {
            this.f1164f = Boolean.valueOf(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public void k0() {
        onLowMemory();
        this.v.i();
    }

    public final n l() {
        if (this.u != null) {
            return this.v;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* access modifiers changed from: package-private */
    public final void l(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f1162d;
        if (sparseArray != null) {
            this.I.restoreHierarchyState(sparseArray);
            this.f1162d = null;
        }
        if (this.I != null) {
            this.T.a(this.f1163e);
            this.f1163e = null;
        }
        this.G = false;
        f(bundle);
        if (!this.G) {
            throw new g0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.I != null) {
            this.T.a(f.b.ON_CREATE);
        }
    }

    /* access modifiers changed from: package-private */
    public void l0() {
        this.v.j();
        if (this.I != null) {
            this.T.a(f.b.ON_PAUSE);
        }
        this.S.a(f.b.ON_PAUSE);
        this.f1160b = 6;
        this.G = false;
        c0();
        if (!this.G) {
            throw new g0("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    public Context m() {
        k<?> kVar = this.u;
        if (kVar == null) {
            return null;
        }
        return kVar.g();
    }

    public void m(Bundle bundle) {
        if (this.t == null || !W()) {
            this.f1166h = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    /* access modifiers changed from: package-private */
    public void m0() {
        boolean j2 = this.t.j(this);
        Boolean bool = this.f1170l;
        if (bool == null || bool.booleanValue() != j2) {
            this.f1170l = Boolean.valueOf(j2);
            e(j2);
            this.v.k();
        }
    }

    /* access modifiers changed from: package-private */
    public int n() {
        e eVar = this.L;
        if (eVar == null) {
            return 0;
        }
        return eVar.f1177d;
    }

    /* access modifiers changed from: package-private */
    public void n0() {
        this.v.E();
        this.v.c(true);
        this.f1160b = 7;
        this.G = false;
        d0();
        if (this.G) {
            this.S.a(f.b.ON_RESUME);
            if (this.I != null) {
                this.T.a(f.b.ON_RESUME);
            }
            this.v.l();
            return;
        }
        throw new g0("Fragment " + this + " did not call through to super.onResume()");
    }

    public Object o() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        return eVar.f1184k;
    }

    /* access modifiers changed from: package-private */
    public void o0() {
        this.v.E();
        this.v.c(true);
        this.f1160b = 5;
        this.G = false;
        e0();
        if (this.G) {
            this.S.a(f.b.ON_START);
            if (this.I != null) {
                this.T.a(f.b.ON_START);
            }
            this.v.m();
            return;
        }
        throw new g0("Fragment " + this + " did not call through to super.onStart()");
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.G = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        r0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.G = true;
    }

    /* access modifiers changed from: package-private */
    public androidx.core.app.n p() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        return eVar.s;
    }

    /* access modifiers changed from: package-private */
    public void p0() {
        this.v.n();
        if (this.I != null) {
            this.T.a(f.b.ON_STOP);
        }
        this.S.a(f.b.ON_STOP);
        this.f1160b = 4;
        this.G = false;
        f0();
        if (!this.G) {
            throw new g0("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* access modifiers changed from: package-private */
    public int q() {
        e eVar = this.L;
        if (eVar == null) {
            return 0;
        }
        return eVar.f1178e;
    }

    /* access modifiers changed from: package-private */
    public void q0() {
        a(this.I, this.f1161c);
        this.v.o();
    }

    public Object r() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        return eVar.f1186m;
    }

    public final e r0() {
        e f2 = f();
        if (f2 != null) {
            return f2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* access modifiers changed from: package-private */
    public androidx.core.app.n s() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        return eVar.t;
    }

    public final Context s0() {
        Context m2 = m();
        if (m2 != null) {
            return m2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* access modifiers changed from: package-private */
    public View t() {
        e eVar = this.L;
        if (eVar == null) {
            return null;
        }
        return eVar.v;
    }

    public final View t0() {
        View L2 = L();
        if (L2 != null) {
            return L2;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f1165g);
        if (this.x != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.x));
        }
        if (this.z != null) {
            sb.append(" tag=");
            sb.append(this.z);
        }
        sb.append(")");
        return sb.toString();
    }

    public final Object u() {
        k<?> kVar = this.u;
        if (kVar == null) {
            return null;
        }
        return kVar.i();
    }

    public void u0() {
        if (this.L != null && v0().w) {
            if (this.u == null) {
                v0().w = false;
            } else if (Looper.myLooper() != this.u.h().getLooper()) {
                this.u.h().postAtFrontOfQueue(new b());
            } else {
                a(true);
            }
        }
    }

    public final LayoutInflater v() {
        LayoutInflater layoutInflater = this.P;
        return layoutInflater == null ? i((Bundle) null) : layoutInflater;
    }

    /* access modifiers changed from: package-private */
    public int w() {
        e eVar = this.L;
        if (eVar == null) {
            return 0;
        }
        return eVar.f1181h;
    }

    public final Fragment x() {
        return this.w;
    }

    public final n y() {
        n nVar = this.t;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* access modifiers changed from: package-private */
    public boolean z() {
        e eVar = this.L;
        if (eVar == null) {
            return false;
        }
        return eVar.f1176c;
    }
}
