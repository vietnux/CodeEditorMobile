package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.g;
import androidx.activity.result.h.a;
import androidx.core.app.f;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.q;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.savedstate.SavedStateRegistry;
import java.util.concurrent.atomic.AtomicInteger;

public class ComponentActivity extends f implements androidx.activity.d.a, i, v, androidx.lifecycle.e, androidx.savedstate.c, c, androidx.activity.result.f, androidx.activity.result.c {

    /* renamed from: c  reason: collision with root package name */
    final androidx.activity.d.b f64c = new androidx.activity.d.b();

    /* renamed from: d  reason: collision with root package name */
    private final j f65d = new j(this);

    /* renamed from: e  reason: collision with root package name */
    final androidx.savedstate.b f66e = androidx.savedstate.b.a(this);

    /* renamed from: f  reason: collision with root package name */
    private u f67f;

    /* renamed from: g  reason: collision with root package name */
    private final OnBackPressedDispatcher f68g = new OnBackPressedDispatcher(new a());

    /* renamed from: h  reason: collision with root package name */
    private int f69h;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.activity.result.e f70i;

    class a implements Runnable {
        a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e2) {
                if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e2;
                }
            }
        }
    }

    class b extends androidx.activity.result.e {

        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f73b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a.C0005a f74c;

            a(int i2, a.C0005a aVar) {
                this.f73b = i2;
                this.f74c = aVar;
            }

            public void run() {
                b.this.a(this.f73b, this.f74c.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        class RunnableC0003b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f76b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f77c;

            RunnableC0003b(int i2, IntentSender.SendIntentException sendIntentException) {
                this.f76b = i2;
                this.f77c = sendIntentException;
            }

            public void run() {
                b.this.a(this.f76b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f77c));
            }
        }

        b() {
        }

        @Override // androidx.activity.result.e
        public <I, O> void a(int i2, androidx.activity.result.h.a<I, O> aVar, I i3, androidx.core.app.b bVar) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0005a<O> b2 = aVar.b(componentActivity, i3);
            if (b2 != null) {
                new Handler(Looper.getMainLooper()).post(new a(i2, b2));
                return;
            }
            Intent a2 = aVar.a(componentActivity, i3);
            if (a2.getExtras() != null && a2.getExtras().getClassLoader() == null) {
                a2.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else if (bVar == null) {
                bundle = null;
            } else {
                bVar.a();
                throw null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a2.getAction())) {
                String[] stringArrayExtra = a2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.a.a(componentActivity, stringArrayExtra, i2);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a2.getAction())) {
                g gVar = (g) a2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    androidx.core.app.a.a(componentActivity, gVar.d(), i2, gVar.a(), gVar.b(), gVar.c(), 0, bundle);
                } catch (IntentSender.SendIntentException e2) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0003b(i2, e2));
                }
            } else {
                androidx.core.app.a.a(componentActivity, a2, i2, bundle);
            }
        }
    }

    class c implements SavedStateRegistry.b {
        c() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        @SuppressLint({"SyntheticAccessor"})
        public Bundle a() {
            Bundle bundle = new Bundle();
            ComponentActivity.this.f70i.b(bundle);
            return bundle;
        }
    }

    class d implements androidx.activity.d.c {
        d() {
        }

        @Override // androidx.activity.d.c
        @SuppressLint({"SyntheticAccessor"})
        public void a(Context context) {
            Bundle a2 = ComponentActivity.this.d().a("android:support:activity-result");
            if (a2 != null) {
                ComponentActivity.this.f70i.a(a2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e {
        u a;

        e() {
        }
    }

    public ComponentActivity() {
        new AtomicInteger();
        this.f70i = new b();
        if (a() != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                a().a(new androidx.lifecycle.g() {
                    /* class androidx.activity.ComponentActivity.AnonymousClass3 */

                    @Override // androidx.lifecycle.g
                    public void a(i iVar, f.b bVar) {
                        if (bVar == f.b.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            a().a(new androidx.lifecycle.g() {
                /* class androidx.activity.ComponentActivity.AnonymousClass4 */

                @Override // androidx.lifecycle.g
                public void a(i iVar, f.b bVar) {
                    if (bVar == f.b.ON_DESTROY) {
                        ComponentActivity.this.f64c.a();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.e().a();
                        }
                    }
                }
            });
            a().a(new androidx.lifecycle.g() {
                /* class androidx.activity.ComponentActivity.AnonymousClass5 */

                @Override // androidx.lifecycle.g
                public void a(i iVar, f.b bVar) {
                    ComponentActivity.this.i();
                    ComponentActivity.this.a().b(this);
                }
            });
            int i2 = Build.VERSION.SDK_INT;
            if (19 <= i2 && i2 <= 23) {
                a().a(new ImmLeaksCleaner(this));
            }
            d().a("android:support:activity-result", new c());
            a(new d());
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private void k() {
        w.a(getWindow().getDecorView(), this);
        x.a(getWindow().getDecorView(), this);
        androidx.savedstate.d.a(getWindow().getDecorView(), this);
    }

    @Override // androidx.lifecycle.i
    public androidx.lifecycle.f a() {
        return this.f65d;
    }

    public final void a(androidx.activity.d.c cVar) {
        this.f64c.a(cVar);
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        k();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher c() {
        return this.f68g;
    }

    @Override // androidx.savedstate.c
    public final SavedStateRegistry d() {
        return this.f66e.a();
    }

    @Override // androidx.lifecycle.v
    public u e() {
        if (getApplication() != null) {
            i();
            return this.f67f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // androidx.activity.result.f
    public final androidx.activity.result.e f() {
        return this.f70i;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (this.f67f == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.f67f = eVar.a;
            }
            if (this.f67f == null) {
                this.f67f = new u();
            }
        }
    }

    @Deprecated
    public Object j() {
        return null;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (!this.f70i.a(i2, i3, intent)) {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onBackPressed() {
        this.f68g.a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.app.f
    public void onCreate(Bundle bundle) {
        this.f66e.a(bundle);
        this.f64c.a(this);
        super.onCreate(bundle);
        q.a(this);
        int i2 = this.f69h;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (!this.f70i.a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object j2 = j();
        u uVar = this.f67f;
        if (uVar == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            uVar = eVar.a;
        }
        if (uVar == null && j2 == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.a = uVar;
        return eVar2;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.app.f
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.f a2 = a();
        if (a2 instanceof j) {
            ((j) a2).b(f.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f66e.b(bundle);
    }

    public void reportFullyDrawn() {
        try {
            if (c.s.a.b()) {
                c.s.a.a("reportFullyDrawn() for " + getComponentName());
            }
            if (Build.VERSION.SDK_INT > 19 || (Build.VERSION.SDK_INT == 19 && c.h.d.a.a(this, "android.permission.UPDATE_DEVICE_STATS") == 0)) {
                super.reportFullyDrawn();
            }
        } finally {
            c.s.a.a();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        k();
        super.setContentView(i2);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        k();
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        k();
        super.setContentView(view, layoutParams);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        super.startActivityForResult(intent, i2);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }
}
