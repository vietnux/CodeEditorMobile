package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import c.h.l.b0;
import c.h.l.c0;

/* access modifiers changed from: package-private */
public class z0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k  reason: collision with root package name */
    private static z0 f800k;

    /* renamed from: l  reason: collision with root package name */
    private static z0 f801l;

    /* renamed from: b  reason: collision with root package name */
    private final View f802b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence f803c;

    /* renamed from: d  reason: collision with root package name */
    private final int f804d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f805e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f806f = new b();

    /* renamed from: g  reason: collision with root package name */
    private int f807g;

    /* renamed from: h  reason: collision with root package name */
    private int f808h;

    /* renamed from: i  reason: collision with root package name */
    private a1 f809i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f810j;

    class a implements Runnable {
        a() {
        }

        public void run() {
            z0.this.a(false);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            z0.this.a();
        }
    }

    private z0(View view, CharSequence charSequence) {
        this.f802b = view;
        this.f803c = charSequence;
        this.f804d = c0.a(ViewConfiguration.get(this.f802b.getContext()));
        c();
        this.f802b.setOnLongClickListener(this);
        this.f802b.setOnHoverListener(this);
    }

    public static void a(View view, CharSequence charSequence) {
        z0 z0Var = f800k;
        if (z0Var != null && z0Var.f802b == view) {
            a((z0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            z0 z0Var2 = f801l;
            if (z0Var2 != null && z0Var2.f802b == view) {
                z0Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new z0(view, charSequence);
    }

    private static void a(z0 z0Var) {
        z0 z0Var2 = f800k;
        if (z0Var2 != null) {
            z0Var2.b();
        }
        f800k = z0Var;
        z0 z0Var3 = f800k;
        if (z0Var3 != null) {
            z0Var3.d();
        }
    }

    private boolean a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f807g) <= this.f804d && Math.abs(y - this.f808h) <= this.f804d) {
            return false;
        }
        this.f807g = x;
        this.f808h = y;
        return true;
    }

    private void b() {
        this.f802b.removeCallbacks(this.f805e);
    }

    private void c() {
        this.f807g = Integer.MAX_VALUE;
        this.f808h = Integer.MAX_VALUE;
    }

    private void d() {
        this.f802b.postDelayed(this.f805e, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (f801l == this) {
            f801l = null;
            a1 a1Var = this.f809i;
            if (a1Var != null) {
                a1Var.a();
                this.f809i = null;
                c();
                this.f802b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f800k == this) {
            a((z0) null);
        }
        this.f802b.removeCallbacks(this.f806f);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        long j2;
        if (b0.H(this.f802b)) {
            a((z0) null);
            z0 z0Var = f801l;
            if (z0Var != null) {
                z0Var.a();
            }
            f801l = this;
            this.f810j = z;
            this.f809i = new a1(this.f802b.getContext());
            this.f809i.a(this.f802b, this.f807g, this.f808h, this.f810j, this.f803c);
            this.f802b.addOnAttachStateChangeListener(this);
            if (this.f810j) {
                j2 = 2500;
            } else {
                j2 = ((b0.B(this.f802b) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f802b.removeCallbacks(this.f806f);
            this.f802b.postDelayed(this.f806f, j2);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f809i != null && this.f810j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f802b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                a();
            }
        } else if (this.f802b.isEnabled() && this.f809i == null && a(motionEvent)) {
            a(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f807g = view.getWidth() / 2;
        this.f808h = view.getHeight() / 2;
        a(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        a();
    }
}
