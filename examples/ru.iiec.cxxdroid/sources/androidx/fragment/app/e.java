package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.a;
import androidx.lifecycle.f;
import androidx.lifecycle.j;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class e extends ComponentActivity implements a.c, a.e {

    /* renamed from: j  reason: collision with root package name */
    final i f1255j = i.a(new c());

    /* renamed from: k  reason: collision with root package name */
    final j f1256k = new j(this);

    /* renamed from: l  reason: collision with root package name */
    boolean f1257l;

    /* renamed from: m  reason: collision with root package name */
    boolean f1258m;
    boolean n = true;

    /* access modifiers changed from: package-private */
    public class a implements SavedStateRegistry.b {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            e.this.l();
            e.this.f1256k.a(f.b.ON_STOP);
            Parcelable l2 = e.this.f1255j.l();
            if (l2 != null) {
                bundle.putParcelable("android:support:fragments", l2);
            }
            return bundle;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements androidx.activity.d.c {
        b() {
        }

        @Override // androidx.activity.d.c
        public void a(Context context) {
            e.this.f1255j.a((Fragment) null);
            Bundle a2 = e.this.d().a("android:support:fragments");
            if (a2 != null) {
                e.this.f1255j.a(a2.getParcelable("android:support:fragments"));
            }
        }
    }

    class c extends k<e> implements v, androidx.activity.c, androidx.activity.result.f, r {
        public c() {
            super(e.this);
        }

        @Override // androidx.fragment.app.k, androidx.fragment.app.g
        public View a(int i2) {
            return e.this.findViewById(i2);
        }

        @Override // androidx.lifecycle.i
        public f a() {
            return e.this.f1256k;
        }

        @Override // androidx.fragment.app.r
        public void a(n nVar, Fragment fragment) {
            e.this.a(fragment);
        }

        @Override // androidx.fragment.app.k
        public boolean a(Fragment fragment) {
            return !e.this.isFinishing();
        }

        @Override // androidx.fragment.app.k, androidx.fragment.app.g
        public boolean b() {
            Window window = e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher c() {
            return e.this.c();
        }

        @Override // androidx.lifecycle.v
        public u e() {
            return e.this.e();
        }

        @Override // androidx.activity.result.f
        public androidx.activity.result.e f() {
            return e.this.f();
        }

        @Override // androidx.fragment.app.k
        public e i() {
            return e.this;
        }

        @Override // androidx.fragment.app.k
        public LayoutInflater j() {
            return e.this.getLayoutInflater().cloneInContext(e.this);
        }

        @Override // androidx.fragment.app.k
        public void k() {
            e.this.n();
        }
    }

    public e() {
        o();
    }

    private static boolean a(n nVar, f.c cVar) {
        boolean z = false;
        for (Fragment fragment : nVar.u()) {
            if (fragment != null) {
                if (fragment.u() != null) {
                    z |= a(fragment.l(), cVar);
                }
                c0 c0Var = fragment.T;
                if (c0Var != null && c0Var.a().a().a(f.c.STARTED)) {
                    fragment.T.a(cVar);
                    z = true;
                }
                if (fragment.S.a().a(f.c.STARTED)) {
                    fragment.S.b(cVar);
                    z = true;
                }
            }
        }
        return z;
    }

    private void o() {
        d().a("android:support:fragments", new a());
        a(new b());
    }

    /* access modifiers changed from: package-private */
    public final View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1255j.a(view, str, context, attributeSet);
    }

    @Override // androidx.core.app.a.e
    @Deprecated
    public final void a(int i2) {
    }

    @Deprecated
    public void a(Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f1257l);
        printWriter.print(" mResumed=");
        printWriter.print(this.f1258m);
        printWriter.print(" mStopped=");
        printWriter.print(this.n);
        if (getApplication() != null) {
            c.p.a.a.a(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f1255j.j().a(str, fileDescriptor, printWriter, strArr);
    }

    public n k() {
        return this.f1255j.j();
    }

    /* access modifiers changed from: package-private */
    public void l() {
        do {
        } while (a(k(), f.c.CREATED));
    }

    /* access modifiers changed from: protected */
    public void m() {
        this.f1256k.a(f.b.ON_RESUME);
        this.f1255j.f();
    }

    @Deprecated
    public void n() {
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity
    public void onActivityResult(int i2, int i3, Intent intent) {
        this.f1255j.k();
        super.onActivityResult(i2, i3, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f1255j.k();
        super.onConfigurationChanged(configuration);
        this.f1255j.a(configuration);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.f
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1256k.a(f.b.ON_CREATE);
        this.f1255j.b();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return i2 == 0 ? super.onCreatePanelMenu(i2, menu) | this.f1255j.a(menu, getMenuInflater()) : super.onCreatePanelMenu(i2, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a2 = a(view, str, context, attributeSet);
        return a2 == null ? super.onCreateView(view, str, context, attributeSet) : a2;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a2 = a(null, str, context, attributeSet);
        return a2 == null ? super.onCreateView(str, context, attributeSet) : a2;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f1255j.c();
        this.f1256k.a(f.b.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f1255j.d();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.f1255j.b(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.f1255j.a(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f1255j.a(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.f1255j.k();
        super.onNewIntent(intent);
    }

    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.f1255j.a(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f1258m = false;
        this.f1255j.e();
        this.f1256k.a(f.b.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f1255j.b(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        m();
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return i2 == 0 ? a(view, menu) | this.f1255j.b(menu) : super.onPreparePanel(i2, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.a.c
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f1255j.k();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.f1255j.k();
        super.onResume();
        this.f1258m = true;
        this.f1255j.i();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        this.f1255j.k();
        super.onStart();
        this.n = false;
        if (!this.f1257l) {
            this.f1257l = true;
            this.f1255j.a();
        }
        this.f1255j.i();
        this.f1256k.a(f.b.ON_START);
        this.f1255j.g();
    }

    public void onStateNotSaved() {
        this.f1255j.k();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.n = true;
        l();
        this.f1255j.h();
        this.f1256k.a(f.b.ON_STOP);
    }
}
