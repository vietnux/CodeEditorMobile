package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.q;

public abstract class g0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    private final float f586b;

    /* renamed from: c  reason: collision with root package name */
    private final int f587c;

    /* renamed from: d  reason: collision with root package name */
    private final int f588d;

    /* renamed from: e  reason: collision with root package name */
    final View f589e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f590f;

    /* renamed from: g  reason: collision with root package name */
    private Runnable f591g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f592h;

    /* renamed from: i  reason: collision with root package name */
    private int f593i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f594j = new int[2];

    /* access modifiers changed from: private */
    public class a implements Runnable {
        a() {
        }

        public void run() {
            ViewParent parent = g0.this.f589e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* access modifiers changed from: private */
    public class b implements Runnable {
        b() {
        }

        public void run() {
            g0.this.d();
        }
    }

    public g0(View view) {
        this.f589e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f586b = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f587c = ViewConfiguration.getTapTimeout();
        this.f588d = (this.f587c + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private boolean a(MotionEvent motionEvent) {
        e0 e0Var;
        View view = this.f589e;
        q a2 = a();
        if (a2 == null || !a2.f() || (e0Var = (e0) a2.g()) == null || !e0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        a(view, obtainNoHistory);
        b(e0Var, obtainNoHistory);
        boolean a3 = e0Var.a(obtainNoHistory, this.f593i);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return a3 && (actionMasked != 1 && actionMasked != 3);
    }

    private static boolean a(View view, float f2, float f3, float f4) {
        float f5 = -f4;
        return f2 >= f5 && f3 >= f5 && f2 < ((float) (view.getRight() - view.getLeft())) + f4 && f3 < ((float) (view.getBottom() - view.getTop())) + f4;
    }

    private boolean a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f594j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(android.view.MotionEvent r6) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g0.b(android.view.MotionEvent):boolean");
    }

    private boolean b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f594j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    private void e() {
        Runnable runnable = this.f591g;
        if (runnable != null) {
            this.f589e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f590f;
        if (runnable2 != null) {
            this.f589e.removeCallbacks(runnable2);
        }
    }

    public abstract q a();

    /* access modifiers changed from: protected */
    public abstract boolean b();

    /* access modifiers changed from: protected */
    public boolean c() {
        q a2 = a();
        if (a2 == null || !a2.f()) {
            return true;
        }
        a2.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        e();
        View view = this.f589e;
        if (view.isEnabled() && !view.isLongClickable() && b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f592h = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f592h;
        if (z2) {
            z = a(motionEvent) || !c();
        } else {
            z = b(motionEvent) && b();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f589e.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f592h = z;
        return z || z2;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f592h = false;
        this.f593i = -1;
        Runnable runnable = this.f590f;
        if (runnable != null) {
            this.f589e.removeCallbacks(runnable);
        }
    }
}
