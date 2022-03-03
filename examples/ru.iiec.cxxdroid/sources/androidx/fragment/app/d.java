package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import androidx.lifecycle.w;
import androidx.lifecycle.x;

public class d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler Z;
    private Runnable a0 = new a();
    private DialogInterface.OnCancelListener b0 = new b();
    private DialogInterface.OnDismissListener c0 = new c();
    private int d0 = 0;
    private int e0 = 0;
    private boolean f0 = true;
    private boolean g0 = true;
    private int h0 = -1;
    private boolean i0;
    private o<i> j0 = new C0019d();
    private Dialog k0;
    private boolean l0;
    private boolean m0;
    private boolean n0;
    private boolean o0 = false;

    class a implements Runnable {
        a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            d.this.c0.onDismiss(d.this.k0);
        }
    }

    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (d.this.k0 != null) {
                d dVar = d.this;
                dVar.onCancel(dVar.k0);
            }
        }
    }

    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (d.this.k0 != null) {
                d dVar = d.this;
                dVar.onDismiss(dVar.k0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d  reason: collision with other inner class name */
    class C0019d implements o<i> {
        C0019d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void a(i iVar) {
            if (iVar != null && d.this.g0) {
                View t0 = d.this.t0();
                if (t0.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (d.this.k0 != null) {
                    if (n.d(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + d.this.k0);
                    }
                    d.this.k0.setContentView(t0);
                }
            }
        }
    }

    class e extends g {
        final /* synthetic */ g a;

        e(g gVar) {
            this.a = gVar;
        }

        @Override // androidx.fragment.app.g
        public View a(int i2) {
            return this.a.b() ? this.a.a(i2) : d.this.c(i2);
        }

        @Override // androidx.fragment.app.g
        public boolean b() {
            return this.a.b() || d.this.w0();
        }
    }

    private void a(boolean z, boolean z2) {
        if (!this.m0) {
            this.m0 = true;
            this.n0 = false;
            Dialog dialog = this.k0;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.k0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.Z.getLooper()) {
                        onDismiss(this.k0);
                    } else {
                        this.Z.post(this.a0);
                    }
                }
            }
            this.l0 = true;
            if (this.h0 >= 0) {
                y().a(this.h0, 1);
                this.h0 = -1;
                return;
            }
            y b2 = y().b();
            b2.d(this);
            if (z) {
                b2.b();
            } else {
                b2.a();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private void o(Bundle bundle) {
        if (this.g0 && !this.o0) {
            try {
                this.i0 = true;
                this.k0 = n(bundle);
                if (this.g0) {
                    a(this.k0, this.d0);
                    Context m2 = m();
                    if (m2 instanceof Activity) {
                        this.k0.setOwnerActivity((Activity) m2);
                    }
                    this.k0.setCancelable(this.f0);
                    this.k0.setOnCancelListener(this.b0);
                    this.k0.setOnDismissListener(this.c0);
                    this.o0 = true;
                } else {
                    this.k0 = null;
                }
                this.i0 = false;
            } catch (Throwable th) {
                this.i0 = false;
                throw th;
            }
        }
    }

    public void a(Dialog dialog, int i2) {
        if (!(i2 == 1 || i2 == 2)) {
            if (i2 == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // androidx.fragment.app.Fragment
    public void a(Context context) {
        super.a(context);
        M().a(this.j0);
        if (!this.n0) {
            this.m0 = false;
        }
    }

    public void a(n nVar, String str) {
        this.m0 = false;
        this.n0 = true;
        y b2 = nVar.b();
        b2.a(this, str);
        b2.a();
    }

    @Override // androidx.fragment.app.Fragment
    public void a0() {
        super.a0();
        Dialog dialog = this.k0;
        if (dialog != null) {
            this.l0 = true;
            dialog.setOnDismissListener(null);
            this.k0.dismiss();
            if (!this.m0) {
                onDismiss(this.k0);
            }
            this.k0 = null;
            this.o0 = false;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.fragment.app.Fragment
    public g b() {
        return new e(super.b());
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.fragment.app.Fragment
    public void b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.b(layoutInflater, viewGroup, bundle);
        if (this.I == null && this.k0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.k0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void b0() {
        super.b0();
        if (!this.n0 && !this.m0) {
            this.m0 = true;
        }
        M().b(this.j0);
    }

    /* access modifiers changed from: package-private */
    public View c(int i2) {
        Dialog dialog = this.k0;
        if (dialog != null) {
            return dialog.findViewById(i2);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void c(Bundle bundle) {
        super.c(bundle);
        this.Z = new Handler();
        this.g0 = this.y == 0;
        if (bundle != null) {
            this.d0 = bundle.getInt("android:style", 0);
            this.e0 = bundle.getInt("android:theme", 0);
            this.f0 = bundle.getBoolean("android:cancelable", true);
            this.g0 = bundle.getBoolean("android:showsDialog", this.g0);
            this.h0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater d(Bundle bundle) {
        String str;
        StringBuilder sb;
        LayoutInflater d2 = super.d(bundle);
        if (!this.g0 || this.i0) {
            if (n.d(2)) {
                String str2 = "getting layout inflater for DialogFragment " + this;
                if (!this.g0) {
                    sb = new StringBuilder();
                    str = "mShowsDialog = false: ";
                } else {
                    sb = new StringBuilder();
                    str = "mCreatingDialog = true: ";
                }
                sb.append(str);
                sb.append(str2);
                Log.d("FragmentManager", sb.toString());
            }
            return d2;
        }
        o(bundle);
        if (n.d(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.k0;
        return dialog != null ? d2.cloneInContext(dialog.getContext()) : d2;
    }

    @Override // androidx.fragment.app.Fragment
    public void e(Bundle bundle) {
        super.e(bundle);
        Dialog dialog = this.k0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i2 = this.d0;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i3 = this.e0;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        boolean z = this.f0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.g0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i4 = this.h0;
        if (i4 != -1) {
            bundle.putInt("android:backStackId", i4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void e0() {
        super.e0();
        Dialog dialog = this.k0;
        if (dialog != null) {
            this.l0 = false;
            dialog.show();
            View decorView = this.k0.getWindow().getDecorView();
            w.a(decorView, this);
            x.a(decorView, this);
            androidx.savedstate.d.a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void f(Bundle bundle) {
        Bundle bundle2;
        super.f(bundle);
        if (this.k0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.k0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void f0() {
        super.f0();
        Dialog dialog = this.k0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void l(boolean z) {
        this.g0 = z;
    }

    public Dialog n(Bundle bundle) {
        if (n.d(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(s0(), v0());
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.l0) {
            if (n.d(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            a(true, true);
        }
    }

    public int v0() {
        return this.e0;
    }

    /* access modifiers changed from: package-private */
    public boolean w0() {
        return this.o0;
    }
}
