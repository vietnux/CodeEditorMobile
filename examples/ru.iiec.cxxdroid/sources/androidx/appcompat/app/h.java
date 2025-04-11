package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b0;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.w0;
import androidx.lifecycle.f;
import c.a.o.b;
import c.a.o.f;
import c.h.d.d.f;
import c.h.l.g0;
import c.h.l.h;
import c.h.l.h0;
import c.h.l.i0;
import c.h.l.k0;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* access modifiers changed from: package-private */
public class h extends g implements g.a, LayoutInflater.Factory2 {
    private static final c.e.g<String, Integer> c0 = new c.e.g<>();
    private static final boolean d0 = (Build.VERSION.SDK_INT < 21);
    private static final int[] e0 = {16842836};
    private static final boolean f0 = (!"robolectric".equals(Build.FINGERPRINT));
    private static final boolean g0;
    private static boolean h0 = true;
    private boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    private boolean G;
    private u[] H;
    private u I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    boolean N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private q S;
    private q T;
    boolean U;
    int V;
    private final Runnable W;
    private boolean X;
    private Rect Y;
    private Rect Z;
    private j a0;
    private k b0;

    /* renamed from: e  reason: collision with root package name */
    final Object f180e;

    /* renamed from: f  reason: collision with root package name */
    final Context f181f;

    /* renamed from: g  reason: collision with root package name */
    Window f182g;

    /* renamed from: h  reason: collision with root package name */
    private o f183h;

    /* renamed from: i  reason: collision with root package name */
    final f f184i;

    /* renamed from: j  reason: collision with root package name */
    a f185j;

    /* renamed from: k  reason: collision with root package name */
    MenuInflater f186k;

    /* renamed from: l  reason: collision with root package name */
    private CharSequence f187l;

    /* renamed from: m  reason: collision with root package name */
    private b0 f188m;
    private i n;
    private v o;
    c.a.o.b p;
    ActionBarContextView q;
    PopupWindow r;
    Runnable s;
    g0 t;
    private boolean u;
    private boolean v;
    ViewGroup w;
    private TextView x;
    private View y;
    private boolean z;

    class a implements Thread.UncaughtExceptionHandler {
        final /* synthetic */ Thread.UncaughtExceptionHandler a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.a.uncaughtException(thread, notFoundException);
                return;
            }
            this.a.uncaughtException(thread, th);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            h hVar = h.this;
            if ((hVar.V & 1) != 0) {
                hVar.g(0);
            }
            h hVar2 = h.this;
            if ((hVar2.V & 4096) != 0) {
                hVar2.g(108);
            }
            h hVar3 = h.this;
            hVar3.U = false;
            hVar3.V = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements c.h.l.u {
        c() {
        }

        @Override // c.h.l.u
        public k0 a(View view, k0 k0Var) {
            int j2 = k0Var.j();
            int a2 = h.this.a(k0Var, (Rect) null);
            if (j2 != a2) {
                k0Var = k0Var.b(k0Var.h(), a2, k0Var.i(), k0Var.g());
            }
            return c.h.l.b0.b(view, k0Var);
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements f0.a {
        d() {
        }

        @Override // androidx.appcompat.widget.f0.a
        public void a(Rect rect) {
            rect.top = h.this.a((k0) null, rect);
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements ContentFrameLayout.a {
        e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            h.this.l();
        }
    }

    /* access modifiers changed from: package-private */
    public class f implements Runnable {

        class a extends i0 {
            a() {
            }

            @Override // c.h.l.h0
            public void b(View view) {
                h.this.q.setAlpha(1.0f);
                h.this.t.a((h0) null);
                h.this.t = null;
            }

            @Override // c.h.l.h0, c.h.l.i0
            public void c(View view) {
                h.this.q.setVisibility(0);
            }
        }

        f() {
        }

        public void run() {
            h hVar = h.this;
            hVar.r.showAtLocation(hVar.q, 55, 0, 0);
            h.this.n();
            if (h.this.u()) {
                h.this.q.setAlpha(0.0f);
                h hVar2 = h.this;
                g0 a2 = c.h.l.b0.a(hVar2.q);
                a2.a(1.0f);
                hVar2.t = a2;
                h.this.t.a(new a());
                return;
            }
            h.this.q.setAlpha(1.0f);
            h.this.q.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    public class g extends i0 {
        g() {
        }

        @Override // c.h.l.h0
        public void b(View view) {
            h.this.q.setAlpha(1.0f);
            h.this.t.a((h0) null);
            h.this.t = null;
        }

        @Override // c.h.l.h0, c.h.l.i0
        public void c(View view) {
            h.this.q.setVisibility(0);
            h.this.q.sendAccessibilityEvent(32);
            if (h.this.q.getParent() instanceof View) {
                c.h.l.b0.N((View) h.this.q.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.h$h  reason: collision with other inner class name */
    private class C0008h implements b.AbstractC0007b {
        C0008h() {
        }

        @Override // androidx.appcompat.app.b.AbstractC0007b
        public void a(int i2) {
            a e2 = h.this.e();
            if (e2 != null) {
                e2.a(i2);
            }
        }

        @Override // androidx.appcompat.app.b.AbstractC0007b
        public void a(Drawable drawable, int i2) {
            a e2 = h.this.e();
            if (e2 != null) {
                e2.b(drawable);
                e2.a(i2);
            }
        }

        @Override // androidx.appcompat.app.b.AbstractC0007b
        public boolean a() {
            a e2 = h.this.e();
            return (e2 == null || (e2.g() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.b.AbstractC0007b
        public Drawable b() {
            w0 a2 = w0.a(c(), (AttributeSet) null, new int[]{c.a.a.homeAsUpIndicator});
            Drawable b2 = a2.b(0);
            a2.b();
            return b2;
        }

        @Override // androidx.appcompat.app.b.AbstractC0007b
        public Context c() {
            return h.this.o();
        }
    }

    /* access modifiers changed from: private */
    public final class i implements n.a {
        i() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            h.this.b(gVar);
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean a(androidx.appcompat.view.menu.g gVar) {
            Window.Callback q = h.this.q();
            if (q == null) {
                return true;
            }
            q.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public class j implements b.a {
        private b.a a;

        class a extends i0 {
            a() {
            }

            @Override // c.h.l.h0
            public void b(View view) {
                h.this.q.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.r;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.q.getParent() instanceof View) {
                    c.h.l.b0.N((View) h.this.q.getParent());
                }
                h.this.q.c();
                h.this.t.a((h0) null);
                h hVar2 = h.this;
                hVar2.t = null;
                c.h.l.b0.N(hVar2.w);
            }
        }

        public j(b.a aVar) {
            this.a = aVar;
        }

        @Override // c.a.o.b.a
        public void a(c.a.o.b bVar) {
            this.a.a(bVar);
            h hVar = h.this;
            if (hVar.r != null) {
                hVar.f182g.getDecorView().removeCallbacks(h.this.s);
            }
            h hVar2 = h.this;
            if (hVar2.q != null) {
                hVar2.n();
                h hVar3 = h.this;
                g0 a2 = c.h.l.b0.a(hVar3.q);
                a2.a(0.0f);
                hVar3.t = a2;
                h.this.t.a(new a());
            }
            h hVar4 = h.this;
            f fVar = hVar4.f184i;
            if (fVar != null) {
                fVar.b(hVar4.p);
            }
            h hVar5 = h.this;
            hVar5.p = null;
            c.h.l.b0.N(hVar5.w);
        }

        @Override // c.a.o.b.a
        public boolean a(c.a.o.b bVar, Menu menu) {
            c.h.l.b0.N(h.this.w);
            return this.a.a(bVar, menu);
        }

        @Override // c.a.o.b.a
        public boolean a(c.a.o.b bVar, MenuItem menuItem) {
            return this.a.a(bVar, menuItem);
        }

        @Override // c.a.o.b.a
        public boolean b(c.a.o.b bVar, Menu menu) {
            return this.a.b(bVar, menu);
        }
    }

    /* access modifiers changed from: package-private */
    public static class k {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i2 = configuration.densityDpi;
            int i3 = configuration2.densityDpi;
            if (i2 != i3) {
                configuration3.densityDpi = i3;
            }
        }
    }

    static class l {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* access modifiers changed from: package-private */
    public static class m {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class n {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i2 = configuration.colorMode & 3;
            int i3 = configuration2.colorMode;
            if (i2 != (i3 & 3)) {
                configuration3.colorMode |= i3 & 3;
            }
            int i4 = configuration.colorMode & 12;
            int i5 = configuration2.colorMode;
            if (i4 != (i5 & 12)) {
                configuration3.colorMode |= i5 & 12;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class o extends c.a.o.i {
        o(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        public final ActionMode a(ActionMode.Callback callback) {
            f.a aVar = new f.a(h.this.f181f, callback);
            c.a.o.b a = h.this.a(aVar);
            if (a != null) {
                return aVar.b(a);
            }
            return null;
        }

        @Override // c.a.o.i
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // c.a.o.i
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || h.this.b(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // c.a.o.i
        public void onContentChanged() {
        }

        @Override // c.a.o.i
        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        @Override // c.a.o.i
        public boolean onMenuOpened(int i2, Menu menu) {
            super.onMenuOpened(i2, menu);
            h.this.h(i2);
            return true;
        }

        @Override // c.a.o.i
        public void onPanelClosed(int i2, Menu menu) {
            super.onPanelClosed(i2, menu);
            h.this.i(i2);
        }

        @Override // c.a.o.i
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i2 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i2, view, menu);
            if (gVar != null) {
                gVar.c(false);
            }
            return onPreparePanel;
        }

        @Override // c.a.o.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            androidx.appcompat.view.menu.g gVar;
            u a = h.this.a(0, true);
            if (a == null || (gVar = a.f208j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i2);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i2);
            }
        }

        @Override // c.a.o.i
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return h.this.r() ? a(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // c.a.o.i
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            return (!h.this.r() || i2 != 0) ? super.onWindowStartingActionMode(callback, i2) : a(callback);
        }
    }

    /* access modifiers changed from: private */
    public class p extends q {

        /* renamed from: c  reason: collision with root package name */
        private final PowerManager f194c;

        p(Context context) {
            super();
            this.f194c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.app.h.q
        public IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.q
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !l.a(this.f194c)) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.h.q
        public void d() {
            h.this.a();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract class q {
        private BroadcastReceiver a;

        /* access modifiers changed from: package-private */
        public class a extends BroadcastReceiver {
            a() {
            }

            public void onReceive(Context context, Intent intent) {
                q.this.d();
            }
        }

        q() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    h.this.f181f.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        /* access modifiers changed from: package-private */
        public abstract IntentFilter b();

        /* access modifiers changed from: package-private */
        public abstract int c();

        /* access modifiers changed from: package-private */
        public abstract void d();

        /* access modifiers changed from: package-private */
        public void e() {
            a();
            IntentFilter b2 = b();
            if (b2 != null && b2.countActions() != 0) {
                if (this.a == null) {
                    this.a = new a();
                }
                h.this.f181f.registerReceiver(this.a, b2);
            }
        }
    }

    /* access modifiers changed from: private */
    public class r extends q {

        /* renamed from: c  reason: collision with root package name */
        private final o f197c;

        r(o oVar) {
            super();
            this.f197c = oVar;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.app.h.q
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.q
        public int c() {
            return this.f197c.a() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.h.q
        public void d() {
            h.this.a();
        }
    }

    private static class s {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* access modifiers changed from: private */
    public class t extends ContentFrameLayout {
        public t(Context context) {
            super(context);
        }

        private boolean a(int i2, int i3) {
            return i2 < -5 || i3 < -5 || i2 > getWidth() + 5 || i3 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            h.this.f(0);
            return true;
        }

        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(c.a.k.a.a.c(getContext(), i2));
        }
    }

    /* access modifiers changed from: protected */
    public static final class u {
        int a;

        /* renamed from: b  reason: collision with root package name */
        int f200b;

        /* renamed from: c  reason: collision with root package name */
        int f201c;

        /* renamed from: d  reason: collision with root package name */
        int f202d;

        /* renamed from: e  reason: collision with root package name */
        int f203e;

        /* renamed from: f  reason: collision with root package name */
        int f204f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f205g;

        /* renamed from: h  reason: collision with root package name */
        View f206h;

        /* renamed from: i  reason: collision with root package name */
        View f207i;

        /* renamed from: j  reason: collision with root package name */
        androidx.appcompat.view.menu.g f208j;

        /* renamed from: k  reason: collision with root package name */
        androidx.appcompat.view.menu.e f209k;

        /* renamed from: l  reason: collision with root package name */
        Context f210l;

        /* renamed from: m  reason: collision with root package name */
        boolean f211m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        u(int i2) {
            this.a = i2;
        }

        /* access modifiers changed from: package-private */
        public androidx.appcompat.view.menu.o a(n.a aVar) {
            if (this.f208j == null) {
                return null;
            }
            if (this.f209k == null) {
                this.f209k = new androidx.appcompat.view.menu.e(this.f210l, c.a.g.abc_list_menu_item_layout);
                this.f209k.a(aVar);
                this.f208j.a(this.f209k);
            }
            return this.f209k.a(this.f205g);
        }

        /* access modifiers changed from: package-private */
        public void a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(c.a.a.actionBarPopupTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            }
            newTheme.resolveAttribute(c.a.a.panelMenuListTheme, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 == 0) {
                i3 = c.a.i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i3, true);
            c.a.o.d dVar = new c.a.o.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f210l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(c.a.j.AppCompatTheme);
            this.f200b = obtainStyledAttributes.getResourceId(c.a.j.AppCompatTheme_panelBackground, 0);
            this.f204f = obtainStyledAttributes.getResourceId(c.a.j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public void a(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f208j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.b(this.f209k);
                }
                this.f208j = gVar;
                if (gVar != null && (eVar = this.f209k) != null) {
                    gVar.a(eVar);
                }
            }
        }

        public boolean a() {
            if (this.f206h == null) {
                return false;
            }
            return this.f207i != null || this.f209k.c().getCount() > 0;
        }
    }

    /* access modifiers changed from: private */
    public final class v implements n.a {
        v() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            androidx.appcompat.view.menu.g m2 = gVar.m();
            boolean z2 = m2 != gVar;
            h hVar = h.this;
            if (z2) {
                gVar = m2;
            }
            u a = hVar.a((Menu) gVar);
            if (a == null) {
                return;
            }
            if (z2) {
                h.this.a(a.a, a, m2);
                h.this.a(a, true);
                return;
            }
            h.this.a(a, z);
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean a(androidx.appcompat.view.menu.g gVar) {
            Window.Callback q;
            if (gVar != gVar.m()) {
                return true;
            }
            h hVar = h.this;
            if (!hVar.B || (q = hVar.q()) == null || h.this.N) {
                return true;
            }
            q.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 17) {
            z2 = true;
        }
        g0 = z2;
        if (d0 && !h0) {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    h(Activity activity, f fVar) {
        this(activity, null, fVar, activity);
    }

    h(Dialog dialog, f fVar) {
        this(dialog.getContext(), dialog.getWindow(), fVar, dialog);
    }

    private h(Context context, Window window, f fVar, Object obj) {
        Integer num;
        e E2;
        this.t = null;
        this.u = true;
        this.O = -100;
        this.W = new b();
        this.f181f = context;
        this.f184i = fVar;
        this.f180e = obj;
        if (this.O == -100 && (this.f180e instanceof Dialog) && (E2 = E()) != null) {
            this.O = E2.o().c();
        }
        if (this.O == -100 && (num = c0.get(this.f180e.getClass().getName())) != null) {
            this.O = num.intValue();
            c0.remove(this.f180e.getClass().getName());
        }
        if (window != null) {
            a(window);
        }
        androidx.appcompat.widget.i.c();
    }

    private void A() {
        if (this.f182g == null) {
            Object obj = this.f180e;
            if (obj instanceof Activity) {
                a(((Activity) obj).getWindow());
            }
        }
        if (this.f182g == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void B() {
        /*
            r3 = this;
            r3.z()
            boolean r0 = r3.B
            if (r0 == 0) goto L_0x0033
            androidx.appcompat.app.a r0 = r3.f185j
            if (r0 == 0) goto L_0x000c
            goto L_0x0033
        L_0x000c:
            java.lang.Object r0 = r3.f180e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x001e
            androidx.appcompat.app.p r1 = new androidx.appcompat.app.p
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.C
            r1.<init>(r0, r2)
        L_0x001b:
            r3.f185j = r1
            goto L_0x002a
        L_0x001e:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L_0x002a
            androidx.appcompat.app.p r1 = new androidx.appcompat.app.p
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
            goto L_0x001b
        L_0x002a:
            androidx.appcompat.app.a r0 = r3.f185j
            if (r0 == 0) goto L_0x0033
            boolean r1 = r3.X
            r0.c(r1)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.B():void");
    }

    private boolean C() {
        if (!this.R && (this.f180e instanceof Activity)) {
            PackageManager packageManager = this.f181f.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f181f, this.f180e.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : Build.VERSION.SDK_INT >= 24 ? 786432 : 0);
                this.Q = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.Q = false;
            }
        }
        this.R = true;
        return this.Q;
    }

    private void D() {
        if (this.v) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private e E() {
        for (Context context = this.f181f; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof e) {
                return (e) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private Configuration a(Context context, int i2, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & -49);
        return configuration2;
    }

    private static Configuration a(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                m.a(configuration, configuration2, configuration3);
            } else if (!c.h.k.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & 192;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 192)) {
                configuration3.screenLayout |= i21 & 192;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                n.a(configuration, configuration2, configuration3);
            }
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                k.a(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    private void a(int i2, boolean z2, Configuration configuration) {
        Resources resources = this.f181f.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            l.a(resources);
        }
        int i3 = this.P;
        if (i3 != 0) {
            this.f181f.setTheme(i3);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f181f.getTheme().applyStyle(this.P, true);
            }
        }
        if (z2) {
            Object obj = this.f180e;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.i) {
                    if (!((androidx.lifecycle.i) activity).a().a().a(f.c.STARTED)) {
                        return;
                    }
                } else if (!this.M) {
                    return;
                }
                activity.onConfigurationChanged(configuration2);
            }
        }
    }

    private void a(Window window) {
        if (this.f182g == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof o)) {
                this.f183h = new o(callback);
                window.setCallback(this.f183h);
                w0 a2 = w0.a(this.f181f, (AttributeSet) null, e0);
                Drawable c2 = a2.c(0);
                if (c2 != null) {
                    window.setBackgroundDrawable(c2);
                }
                a2.b();
                this.f182g = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private void a(u uVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (!uVar.o && !this.N) {
            if (uVar.a == 0) {
                if ((this.f181f.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback q2 = q();
            if (q2 == null || q2.onMenuOpened(uVar.a, uVar.f208j)) {
                WindowManager windowManager = (WindowManager) this.f181f.getSystemService("window");
                if (windowManager != null && b(uVar, keyEvent)) {
                    if (uVar.f205g == null || uVar.q) {
                        ViewGroup viewGroup = uVar.f205g;
                        if (viewGroup == null) {
                            if (!b(uVar) || uVar.f205g == null) {
                                return;
                            }
                        } else if (uVar.q && viewGroup.getChildCount() > 0) {
                            uVar.f205g.removeAllViews();
                        }
                        if (!a(uVar) || !uVar.a()) {
                            uVar.q = true;
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = uVar.f206h.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        uVar.f205g.setBackgroundResource(uVar.f200b);
                        ViewParent parent = uVar.f206h.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(uVar.f206h);
                        }
                        uVar.f205g.addView(uVar.f206h, layoutParams2);
                        if (!uVar.f206h.hasFocus()) {
                            uVar.f206h.requestFocus();
                        }
                    } else {
                        View view = uVar.f207i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i2 = -1;
                            uVar.n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, uVar.f202d, uVar.f203e, 1002, 8519680, -3);
                            layoutParams3.gravity = uVar.f201c;
                            layoutParams3.windowAnimations = uVar.f204f;
                            windowManager.addView(uVar.f205g, layoutParams3);
                            uVar.o = true;
                            return;
                        }
                    }
                    i2 = -2;
                    uVar.n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, uVar.f202d, uVar.f203e, 1002, 8519680, -3);
                    layoutParams32.gravity = uVar.f201c;
                    layoutParams32.windowAnimations = uVar.f204f;
                    windowManager.addView(uVar.f205g, layoutParams32);
                    uVar.o = true;
                    return;
                }
                return;
            }
            a(uVar, true);
        }
    }

    private boolean a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f182g.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || c.h.l.b0.H((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean a(u uVar) {
        View view = uVar.f207i;
        if (view != null) {
            uVar.f206h = view;
            return true;
        } else if (uVar.f208j == null) {
            return false;
        } else {
            if (this.o == null) {
                this.o = new v();
            }
            uVar.f206h = (View) uVar.a(this.o);
            return uVar.f206h != null;
        }
    }

    private boolean a(u uVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.g gVar;
        boolean z2 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f211m || b(uVar, keyEvent)) && (gVar = uVar.f208j) != null) {
            z2 = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (z2 && (i3 & 1) == 0 && this.f188m == null) {
            a(uVar, true);
        }
        return z2;
    }

    private boolean a(boolean z2) {
        if (this.N) {
            return false;
        }
        int w2 = w();
        boolean b2 = b(a(this.f181f, w2), z2);
        if (w2 == 0) {
            d(this.f181f).e();
        } else {
            q qVar = this.S;
            if (qVar != null) {
                qVar.a();
            }
        }
        if (w2 == 3) {
            c(this.f181f).e();
        } else {
            q qVar2 = this.T;
            if (qVar2 != null) {
                qVar2.a();
            }
        }
        return b2;
    }

    private void b(View view) {
        int i2;
        Context context;
        if ((c.h.l.b0.B(view) & 8192) != 0) {
            context = this.f181f;
            i2 = c.a.c.abc_decor_view_status_guard_light;
        } else {
            context = this.f181f;
            i2 = c.a.c.abc_decor_view_status_guard;
        }
        view.setBackgroundColor(c.h.d.a.a(context, i2));
    }

    private void b(boolean z2) {
        b0 b0Var = this.f188m;
        if (b0Var == null || !b0Var.f() || (ViewConfiguration.get(this.f181f).hasPermanentMenuKey() && !this.f188m.c())) {
            u a2 = a(0, true);
            a2.q = true;
            a(a2, false);
            a(a2, (KeyEvent) null);
            return;
        }
        Window.Callback q2 = q();
        if (this.f188m.a() && z2) {
            this.f188m.d();
            if (!this.N) {
                q2.onPanelClosed(108, a(0, true).f208j);
            }
        } else if (q2 != null && !this.N) {
            if (this.U && (this.V & 1) != 0) {
                this.f182g.getDecorView().removeCallbacks(this.W);
                this.W.run();
            }
            u a3 = a(0, true);
            androidx.appcompat.view.menu.g gVar = a3.f208j;
            if (gVar != null && !a3.r && q2.onPreparePanel(0, a3.f207i, gVar)) {
                q2.onMenuOpened(108, a3.f208j);
                this.f188m.e();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f181f
            r1 = 0
            android.content.res.Configuration r0 = r6.a(r0, r7, r1)
            boolean r2 = r6.C()
            android.content.Context r3 = r6.f181f
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L_0x0047
            if (r8 == 0) goto L_0x0047
            if (r2 != 0) goto L_0x0047
            boolean r8 = r6.K
            if (r8 == 0) goto L_0x0047
            boolean r8 = androidx.appcompat.app.h.f0
            if (r8 != 0) goto L_0x0030
            boolean r8 = r6.L
            if (r8 == 0) goto L_0x0047
        L_0x0030:
            java.lang.Object r8 = r6.f180e
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0047
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L_0x0047
            java.lang.Object r8 = r6.f180e
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.a.b(r8)
            r8 = 1
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            if (r8 != 0) goto L_0x0050
            if (r3 == r0) goto L_0x0050
            r6.a(r0, r2, r1)
            r8 = 1
        L_0x0050:
            if (r8 == 0) goto L_0x005d
            java.lang.Object r0 = r6.f180e
            boolean r1 = r0 instanceof androidx.appcompat.app.e
            if (r1 == 0) goto L_0x005d
            androidx.appcompat.app.e r0 = (androidx.appcompat.app.e) r0
            r0.b(r7)
        L_0x005d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.b(int, boolean):boolean");
    }

    private boolean b(u uVar) {
        uVar.a(o());
        uVar.f205g = new t(uVar.f210l);
        uVar.f201c = 81;
        return true;
    }

    private boolean b(u uVar, KeyEvent keyEvent) {
        b0 b0Var;
        b0 b0Var2;
        b0 b0Var3;
        if (this.N) {
            return false;
        }
        if (uVar.f211m) {
            return true;
        }
        u uVar2 = this.I;
        if (!(uVar2 == null || uVar2 == uVar)) {
            a(uVar2, false);
        }
        Window.Callback q2 = q();
        if (q2 != null) {
            uVar.f207i = q2.onCreatePanelView(uVar.a);
        }
        int i2 = uVar.a;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (b0Var3 = this.f188m) != null) {
            b0Var3.b();
        }
        if (uVar.f207i == null && (!z2 || !(t() instanceof m))) {
            if (uVar.f208j == null || uVar.r) {
                if (uVar.f208j == null && (!c(uVar) || uVar.f208j == null)) {
                    return false;
                }
                if (z2 && this.f188m != null) {
                    if (this.n == null) {
                        this.n = new i();
                    }
                    this.f188m.a(uVar.f208j, this.n);
                }
                uVar.f208j.s();
                if (!q2.onCreatePanelMenu(uVar.a, uVar.f208j)) {
                    uVar.a((androidx.appcompat.view.menu.g) null);
                    if (z2 && (b0Var2 = this.f188m) != null) {
                        b0Var2.a(null, this.n);
                    }
                    return false;
                }
                uVar.r = false;
            }
            uVar.f208j.s();
            Bundle bundle = uVar.s;
            if (bundle != null) {
                uVar.f208j.a(bundle);
                uVar.s = null;
            }
            if (!q2.onPreparePanel(0, uVar.f207i, uVar.f208j)) {
                if (z2 && (b0Var = this.f188m) != null) {
                    b0Var.a(null, this.n);
                }
                uVar.f208j.r();
                return false;
            }
            uVar.p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            uVar.f208j.setQwertyMode(uVar.p);
            uVar.f208j.r();
        }
        uVar.f211m = true;
        uVar.n = false;
        this.I = uVar;
        return true;
    }

    private q c(Context context) {
        if (this.T == null) {
            this.T = new p(context);
        }
        return this.T;
    }

    private boolean c(u uVar) {
        Context context = this.f181f;
        int i2 = uVar.a;
        if ((i2 == 0 || i2 == 108) && this.f188m != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(c.a.a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(c.a.a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(c.a.a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                c.a.o.d dVar = new c.a.o.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.a(this);
        uVar.a(gVar);
        return true;
    }

    private q d(Context context) {
        if (this.S == null) {
            this.S = new r(o.a(context));
        }
        return this.S;
    }

    private boolean d(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        u a2 = a(i2, true);
        if (!a2.o) {
            return b(a2, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean e(int r4, android.view.KeyEvent r5) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.e(int, android.view.KeyEvent):boolean");
    }

    private void j(int i2) {
        this.V = (1 << i2) | this.V;
        if (!this.U) {
            c.h.l.b0.a(this.f182g.getDecorView(), this.W);
            this.U = true;
        }
    }

    private int k(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i2 != 9) {
            return i2;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    private void v() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.w.findViewById(16908290);
        View decorView = this.f182g.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f181f.obtainStyledAttributes(c.a.j.AppCompatTheme);
        obtainStyledAttributes.getValue(c.a.j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(c.a.j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(c.a.j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(c.a.j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(c.a.j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(c.a.j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(c.a.j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(c.a.j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(c.a.j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(c.a.j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private int w() {
        int i2 = this.O;
        return i2 != -100 ? i2 : g.m();
    }

    private void x() {
        q qVar = this.S;
        if (qVar != null) {
            qVar.a();
        }
        q qVar2 = this.T;
        if (qVar2 != null) {
            qVar2.a();
        }
    }

    private ViewGroup y() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f181f.obtainStyledAttributes(c.a.j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(c.a.j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(c.a.j.AppCompatTheme_windowNoTitle, false)) {
                b(1);
            } else if (obtainStyledAttributes.getBoolean(c.a.j.AppCompatTheme_windowActionBar, false)) {
                b(108);
            }
            if (obtainStyledAttributes.getBoolean(c.a.j.AppCompatTheme_windowActionBarOverlay, false)) {
                b(109);
            }
            if (obtainStyledAttributes.getBoolean(c.a.j.AppCompatTheme_windowActionModeOverlay, false)) {
                b(10);
            }
            this.E = obtainStyledAttributes.getBoolean(c.a.j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            A();
            this.f182g.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f181f);
            if (this.F) {
                viewGroup = (ViewGroup) from.inflate(this.D ? c.a.g.abc_screen_simple_overlay_action_mode : c.a.g.abc_screen_simple, (ViewGroup) null);
            } else if (this.E) {
                viewGroup = (ViewGroup) from.inflate(c.a.g.abc_dialog_title_material, (ViewGroup) null);
                this.C = false;
                this.B = false;
            } else if (this.B) {
                TypedValue typedValue = new TypedValue();
                this.f181f.getTheme().resolveAttribute(c.a.a.actionBarTheme, typedValue, true);
                int i2 = typedValue.resourceId;
                viewGroup = (ViewGroup) LayoutInflater.from(i2 != 0 ? new c.a.o.d(this.f181f, i2) : this.f181f).inflate(c.a.g.abc_screen_toolbar, (ViewGroup) null);
                this.f188m = (b0) viewGroup.findViewById(c.a.f.decor_content_parent);
                this.f188m.setWindowCallback(q());
                if (this.C) {
                    this.f188m.a(109);
                }
                if (this.z) {
                    this.f188m.a(2);
                }
                if (this.A) {
                    this.f188m.a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    c.h.l.b0.a(viewGroup, new c());
                } else if (viewGroup instanceof f0) {
                    ((f0) viewGroup).setOnFitSystemWindowsListener(new d());
                }
                if (this.f188m == null) {
                    this.x = (TextView) viewGroup.findViewById(c.a.f.title);
                }
                c1.b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(c.a.f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f182g.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f182g.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.B + ", windowActionBarOverlay: " + this.C + ", android:windowIsFloating: " + this.E + ", windowActionModeOverlay: " + this.D + ", windowNoTitle: " + this.F + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void z() {
        if (!this.v) {
            this.w = y();
            CharSequence p2 = p();
            if (!TextUtils.isEmpty(p2)) {
                b0 b0Var = this.f188m;
                if (b0Var != null) {
                    b0Var.setWindowTitle(p2);
                } else if (t() != null) {
                    t().c(p2);
                } else {
                    TextView textView = this.x;
                    if (textView != null) {
                        textView.setText(p2);
                    }
                }
            }
            v();
            a(this.w);
            this.v = true;
            u a2 = a(0, false);
            if (this.N) {
                return;
            }
            if (a2 == null || a2.f208j == null) {
                j(108);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int a(Context context, int i2) {
        q d2;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (!(i2 == 1 || i2 == 2)) {
                    if (i2 == 3) {
                        d2 = c(context);
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                d2 = d(context);
            }
            return d2.c();
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final int a(k0 k0Var, Rect rect) {
        boolean z2;
        boolean z3;
        int i2 = 0;
        int j2 = k0Var != null ? k0Var.j() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.q;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.q.getLayoutParams();
            z2 = true;
            if (this.q.isShown()) {
                if (this.Y == null) {
                    this.Y = new Rect();
                    this.Z = new Rect();
                }
                Rect rect2 = this.Y;
                Rect rect3 = this.Z;
                if (k0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(k0Var.h(), k0Var.j(), k0Var.i(), k0Var.g());
                }
                c1.a(this.w, rect2, rect3);
                int i3 = rect2.top;
                int i4 = rect2.left;
                int i5 = rect2.right;
                k0 y2 = c.h.l.b0.y(this.w);
                int h2 = y2 == null ? 0 : y2.h();
                int i6 = y2 == null ? 0 : y2.i();
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z3 = true;
                }
                if (i3 <= 0 || this.y != null) {
                    View view = this.y;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        if (!(marginLayoutParams2.height == marginLayoutParams.topMargin && marginLayoutParams2.leftMargin == h2 && marginLayoutParams2.rightMargin == i6)) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = h2;
                            marginLayoutParams2.rightMargin = i6;
                            this.y.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    this.y = new View(this.f181f);
                    this.y.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = h2;
                    layoutParams.rightMargin = i6;
                    this.w.addView(this.y, -1, layoutParams);
                }
                if (this.y == null) {
                    z2 = false;
                }
                if (z2 && this.y.getVisibility() != 0) {
                    b(this.y);
                }
                if (!this.D && z2) {
                    j2 = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z3 = true;
                } else {
                    z3 = false;
                }
                z2 = false;
            }
            if (z3) {
                this.q.setLayoutParams(marginLayoutParams);
            }
        }
        View view2 = this.y;
        if (view2 != null) {
            if (!z2) {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
        return j2;
    }

    @Override // androidx.appcompat.app.g
    public <T extends View> T a(int i2) {
        z();
        return (T) this.f182g.findViewById(i2);
    }

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        j jVar;
        boolean z3 = false;
        if (this.a0 == null) {
            String string = this.f181f.obtainStyledAttributes(c.a.j.AppCompatTheme).getString(c.a.j.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                jVar = new j();
            } else {
                try {
                    this.a0 = (j) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    jVar = new j();
                }
            }
            this.a0 = jVar;
        }
        if (d0) {
            if (this.b0 == null) {
                this.b0 = new k();
            }
            if (this.b0.a(attributeSet)) {
                z2 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    z3 = a((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z3 = true;
                }
                z2 = z3;
            }
        } else {
            z2 = false;
        }
        return this.a0.createView(view, str, context, attributeSet, z2, d0, true, b1.b());
    }

    /* access modifiers changed from: protected */
    public u a(int i2, boolean z2) {
        u[] uVarArr = this.H;
        if (uVarArr == null || uVarArr.length <= i2) {
            u[] uVarArr2 = new u[(i2 + 1)];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.H = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i2];
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(i2);
        uVarArr[i2] = uVar2;
        return uVar2;
    }

    /* access modifiers changed from: package-private */
    public u a(Menu menu) {
        u[] uVarArr = this.H;
        int length = uVarArr != null ? uVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            u uVar = uVarArr[i2];
            if (uVar != null && uVar.f208j == menu) {
                return uVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.g
    public c.a.o.b a(b.a aVar) {
        f fVar;
        if (aVar != null) {
            c.a.o.b bVar = this.p;
            if (bVar != null) {
                bVar.a();
            }
            j jVar = new j(aVar);
            a e2 = e();
            if (e2 != null) {
                this.p = e2.a(jVar);
                c.a.o.b bVar2 = this.p;
                if (!(bVar2 == null || (fVar = this.f184i) == null)) {
                    fVar.a(bVar2);
                }
            }
            if (this.p == null) {
                this.p = b(jVar);
            }
            return this.p;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, u uVar, Menu menu) {
        if (menu == null) {
            if (uVar == null && i2 >= 0) {
                u[] uVarArr = this.H;
                if (i2 < uVarArr.length) {
                    uVar = uVarArr[i2];
                }
            }
            if (uVar != null) {
                menu = uVar.f208j;
            }
        }
        if ((uVar == null || uVar.o) && !this.N) {
            this.f183h.a().onPanelClosed(i2, menu);
        }
    }

    @Override // androidx.appcompat.app.g
    public void a(Configuration configuration) {
        a e2;
        if (this.B && this.v && (e2 = e()) != null) {
            e2.a(configuration);
        }
        androidx.appcompat.widget.i.b().a(this.f181f);
        a(false);
    }

    @Override // androidx.appcompat.app.g
    public void a(Bundle bundle) {
        this.K = true;
        a(false);
        A();
        Object obj = this.f180e;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.g.b((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a t2 = t();
                if (t2 == null) {
                    this.X = true;
                } else {
                    t2.c(true);
                }
            }
            g.a(this);
        }
        this.L = true;
    }

    @Override // androidx.appcompat.app.g
    public void a(View view) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f183h.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.g
    public void a(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        ((ViewGroup) this.w.findViewById(16908290)).addView(view, layoutParams);
        this.f183h.a().onContentChanged();
    }

    /* access modifiers changed from: package-private */
    public void a(ViewGroup viewGroup) {
    }

    /* access modifiers changed from: package-private */
    public void a(u uVar, boolean z2) {
        ViewGroup viewGroup;
        b0 b0Var;
        if (!z2 || uVar.a != 0 || (b0Var = this.f188m) == null || !b0Var.a()) {
            WindowManager windowManager = (WindowManager) this.f181f.getSystemService("window");
            if (!(windowManager == null || !uVar.o || (viewGroup = uVar.f205g) == null)) {
                windowManager.removeView(viewGroup);
                if (z2) {
                    a(uVar.a, uVar, (Menu) null);
                }
            }
            uVar.f211m = false;
            uVar.n = false;
            uVar.o = false;
            uVar.f206h = null;
            uVar.q = true;
            if (this.I == uVar) {
                this.I = null;
                return;
            }
            return;
        }
        b(uVar.f208j);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void a(androidx.appcompat.view.menu.g gVar) {
        b(true);
    }

    @Override // androidx.appcompat.app.g
    public void a(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (this.f180e instanceof Activity) {
            a e2 = e();
            if (!(e2 instanceof p)) {
                this.f186k = null;
                if (e2 != null) {
                    e2.l();
                }
                if (toolbar != null) {
                    m mVar = new m(toolbar, p(), this.f183h);
                    this.f185j = mVar;
                    window = this.f182g;
                    callback = mVar.o();
                } else {
                    this.f185j = null;
                    window = this.f182g;
                    callback = this.f183h;
                }
                window.setCallback(callback);
                g();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    @Override // androidx.appcompat.app.g
    public final void a(CharSequence charSequence) {
        this.f187l = charSequence;
        b0 b0Var = this.f188m;
        if (b0Var != null) {
            b0Var.setWindowTitle(charSequence);
        } else if (t() != null) {
            t().c(charSequence);
        } else {
            TextView textView = this.x;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.g
    public boolean a() {
        return a(true);
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i2, KeyEvent keyEvent) {
        boolean z2 = true;
        if (i2 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z2 = false;
            }
            this.J = z2;
        } else if (i2 == 82) {
            d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean a(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f180e;
        boolean z2 = true;
        if (((obj instanceof h.a) || (obj instanceof i)) && (decorView = this.f182g.getDecorView()) != null && c.h.l.h.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f183h.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z2 = false;
        }
        return z2 ? a(keyCode, keyEvent) : c(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        u a2;
        Window.Callback q2 = q();
        if (q2 == null || this.N || (a2 = a((Menu) gVar.m())) == null) {
            return false;
        }
        return q2.onMenuItemSelected(a2.a, menuItem);
    }

    @Override // androidx.appcompat.app.g
    public Context b(Context context) {
        this.K = true;
        int a2 = a(context, w());
        Configuration configuration = null;
        if (g0 && (context instanceof ContextThemeWrapper)) {
            try {
                s.a((ContextThemeWrapper) context, a(context, a2, (Configuration) null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof c.a.o.d) {
            try {
                ((c.a.o.d) context).a(a(context, a2, (Configuration) null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f0) {
            super.b(context);
            return context;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = k.a(context, configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = a(configuration3, configuration4);
            }
        }
        Configuration a3 = a(context, a2, configuration);
        c.a.o.d dVar = new c.a.o.d(context, c.a.i.Theme_AppCompat_Empty);
        dVar.a(a3);
        boolean z2 = false;
        try {
            if (context.getTheme() != null) {
                z2 = true;
            }
        } catch (NullPointerException unused3) {
        }
        if (z2) {
            f.d.a(dVar.getTheme());
        }
        super.b(dVar);
        return dVar;
    }

    @Override // androidx.appcompat.app.g
    public final b.AbstractC0007b b() {
        return new C0008h();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c.a.o.b b(c.a.o.b.a r8) {
        /*
        // Method dump skipped, instructions count: 371
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.b(c.a.o.b$a):c.a.o.b");
    }

    @Override // androidx.appcompat.app.g
    public void b(Bundle bundle) {
        z();
    }

    @Override // androidx.appcompat.app.g
    public void b(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f183h.a().onContentChanged();
    }

    /* access modifiers changed from: package-private */
    public void b(androidx.appcompat.view.menu.g gVar) {
        if (!this.G) {
            this.G = true;
            this.f188m.g();
            Window.Callback q2 = q();
            if (q2 != null && !this.N) {
                q2.onPanelClosed(108, gVar);
            }
            this.G = false;
        }
    }

    @Override // androidx.appcompat.app.g
    public boolean b(int i2) {
        int k2 = k(i2);
        if (this.F && k2 == 108) {
            return false;
        }
        if (this.B && k2 == 1) {
            this.B = false;
        }
        if (k2 == 1) {
            D();
            this.F = true;
            return true;
        } else if (k2 == 2) {
            D();
            this.z = true;
            return true;
        } else if (k2 == 5) {
            D();
            this.A = true;
            return true;
        } else if (k2 == 10) {
            D();
            this.D = true;
            return true;
        } else if (k2 == 108) {
            D();
            this.B = true;
            return true;
        } else if (k2 != 109) {
            return this.f182g.requestFeature(k2);
        } else {
            D();
            this.C = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i2, KeyEvent keyEvent) {
        a e2 = e();
        if (e2 != null && e2.a(i2, keyEvent)) {
            return true;
        }
        u uVar = this.I;
        if (uVar == null || !a(uVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.I == null) {
                u a2 = a(0, true);
                b(a2, keyEvent);
                boolean a3 = a(a2, keyEvent.getKeyCode(), keyEvent, 1);
                a2.f211m = false;
                if (a3) {
                    return true;
                }
            }
            return false;
        }
        u uVar2 = this.I;
        if (uVar2 != null) {
            uVar2.n = true;
        }
        return true;
    }

    @Override // androidx.appcompat.app.g
    public int c() {
        return this.O;
    }

    @Override // androidx.appcompat.app.g
    public void c(int i2) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f181f).inflate(i2, viewGroup);
        this.f183h.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.g
    public void c(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public boolean c(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z2 = this.J;
            this.J = false;
            u a2 = a(0, false);
            if (a2 != null && a2.o) {
                if (!z2) {
                    a(a2, true);
                }
                return true;
            } else if (s()) {
                return true;
            }
        } else if (i2 == 82) {
            e(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public MenuInflater d() {
        if (this.f186k == null) {
            B();
            a aVar = this.f185j;
            this.f186k = new c.a.o.g(aVar != null ? aVar.h() : this.f181f);
        }
        return this.f186k;
    }

    @Override // androidx.appcompat.app.g
    public void d(int i2) {
        this.P = i2;
    }

    @Override // androidx.appcompat.app.g
    public a e() {
        B();
        return this.f185j;
    }

    @Override // androidx.appcompat.app.g
    public void f() {
        LayoutInflater from = LayoutInflater.from(this.f181f);
        if (from.getFactory() == null) {
            c.h.l.i.b(from, this);
        } else if (!(from.getFactory2() instanceof h)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* access modifiers changed from: package-private */
    public void f(int i2) {
        a(a(i2, true), true);
    }

    @Override // androidx.appcompat.app.g
    public void g() {
        a e2 = e();
        if (e2 == null || !e2.j()) {
            j(0);
        }
    }

    /* access modifiers changed from: package-private */
    public void g(int i2) {
        u a2;
        u a3 = a(i2, true);
        if (a3.f208j != null) {
            Bundle bundle = new Bundle();
            a3.f208j.c(bundle);
            if (bundle.size() > 0) {
                a3.s = bundle;
            }
            a3.f208j.s();
            a3.f208j.clear();
        }
        a3.r = true;
        a3.q = true;
        if ((i2 == 108 || i2 == 0) && this.f188m != null && (a2 = a(0, false)) != null) {
            a2.f211m = false;
            b(a2, (KeyEvent) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    @Override // androidx.appcompat.app.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f180e
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.g.b(r3)
        L_0x0009:
            boolean r0 = r3.U
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f182g
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.W
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 0
            r3.M = r0
            r0 = 1
            r3.N = r0
            int r0 = r3.O
            r1 = -100
            if (r0 == r1) goto L_0x0048
            java.lang.Object r0 = r3.f180e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0048
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0048
            c.e.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.h.c0
            java.lang.Object r1 = r3.f180e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.O
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0057
        L_0x0048:
            c.e.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.h.c0
            java.lang.Object r1 = r3.f180e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0057:
            androidx.appcompat.app.a r0 = r3.f185j
            if (r0 == 0) goto L_0x005e
            r0.l()
        L_0x005e:
            r3.x()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.h():void");
    }

    /* access modifiers changed from: package-private */
    public void h(int i2) {
        a e2;
        if (i2 == 108 && (e2 = e()) != null) {
            e2.b(true);
        }
    }

    @Override // androidx.appcompat.app.g
    public void i() {
        a e2 = e();
        if (e2 != null) {
            e2.f(true);
        }
    }

    /* access modifiers changed from: package-private */
    public void i(int i2) {
        if (i2 == 108) {
            a e2 = e();
            if (e2 != null) {
                e2.b(false);
            }
        } else if (i2 == 0) {
            u a2 = a(i2, true);
            if (a2.o) {
                a(a2, false);
            }
        }
    }

    @Override // androidx.appcompat.app.g
    public void j() {
        this.M = true;
        a();
    }

    @Override // androidx.appcompat.app.g
    public void k() {
        this.M = false;
        a e2 = e();
        if (e2 != null) {
            e2.f(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        androidx.appcompat.view.menu.g gVar;
        b0 b0Var = this.f188m;
        if (b0Var != null) {
            b0Var.g();
        }
        if (this.r != null) {
            this.f182g.getDecorView().removeCallbacks(this.s);
            if (this.r.isShowing()) {
                try {
                    this.r.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.r = null;
        }
        n();
        u a2 = a(0, false);
        if (a2 != null && (gVar = a2.f208j) != null) {
            gVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        g0 g0Var = this.t;
        if (g0Var != null) {
            g0Var.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final Context o() {
        a e2 = e();
        Context h2 = e2 != null ? e2.h() : null;
        return h2 == null ? this.f181f : h2;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return a(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    public final CharSequence p() {
        Object obj = this.f180e;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f187l;
    }

    /* access modifiers changed from: package-private */
    public final Window.Callback q() {
        return this.f182g.getCallback();
    }

    public boolean r() {
        return this.u;
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        c.a.o.b bVar = this.p;
        if (bVar != null) {
            bVar.a();
            return true;
        }
        a e2 = e();
        return e2 != null && e2.f();
    }

    /* access modifiers changed from: package-private */
    public final a t() {
        return this.f185j;
    }

    /* access modifiers changed from: package-private */
    public final boolean u() {
        ViewGroup viewGroup;
        return this.v && (viewGroup = this.w) != null && c.h.l.b0.I(viewGroup);
    }
}
