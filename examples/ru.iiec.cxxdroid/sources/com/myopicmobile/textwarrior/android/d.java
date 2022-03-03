package com.myopicmobile.textwarrior.android;

import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.preference.PreferenceManager;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.Magnifier;
import qwe.qweqwe.texteditor.m0;

public class d extends GestureDetector.SimpleOnGestureListener {
    protected static int s = 10;
    private static final int[] t = {16843461, 16843463, 16843462};
    private static Rect u = new Rect(0, 0, 0, 0);
    protected static int v = 12;

    /* renamed from: b  reason: collision with root package name */
    protected FreeScrollingTextField f6748b;

    /* renamed from: c  reason: collision with root package name */
    private GestureDetector f6749c;

    /* renamed from: d  reason: collision with root package name */
    protected int f6750d = -1;

    /* renamed from: e  reason: collision with root package name */
    protected int f6751e = -1;

    /* renamed from: f  reason: collision with root package name */
    Object f6752f;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f6753g = false;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f6754h = false;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f6755i = false;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f6756j = null;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f6757k = null;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f6758l = null;

    /* renamed from: m  reason: collision with root package name */
    private int f6759m = 0;
    private int n = 0;
    private int o;
    int p;
    private int q;
    private int r;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        a() {
        }

        public void run() {
            d.a(d.this, 100);
            if (d.this.f6759m == 0) {
                d.this.f6748b.invalidate();
            } else {
                d.this.f6748b.postDelayed(this, 100);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        b() {
        }

        public void run() {
            d.this.c(5000);
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            d.a(d.this, 100);
            if (d.this.f6759m == 0) {
                d.this.f6748b.invalidate();
            } else {
                d.this.f6748b.postDelayed(this, 100);
            }
        }
    }

    /* renamed from: com.myopicmobile.textwarrior.android.d$d  reason: collision with other inner class name */
    class RunnableC0095d implements Runnable {
        RunnableC0095d() {
        }

        public void run() {
            d.this.c(5000);
        }
    }

    public d(FreeScrollingTextField freeScrollingTextField) {
        new Paint();
        this.f6748b = freeScrollingTextField;
        this.f6749c = new GestureDetector(freeScrollingTextField.getContext(), this);
        this.f6749c.setIsLongpressEnabled(true);
    }

    static /* synthetic */ int a(d dVar, int i2) {
        int i3 = dVar.f6759m - i2;
        dVar.f6759m = i3;
        return i3;
    }

    private void a(float f2, float f3) {
        int scrollX = ((int) f2) + this.f6748b.getScrollX();
        int scrollY = ((int) f3) + this.f6748b.getScrollY();
        int max = Math.max(this.f6748b.getMaxScrollX(), this.f6748b.getScrollX());
        if (scrollX > max) {
            scrollX = max;
        } else if (scrollX < 0) {
            scrollX = 0;
        }
        int max2 = Math.max(this.f6748b.getMaxScrollY(), this.f6748b.getScrollY());
        if (scrollY > max2) {
            scrollY = max2;
        } else if (scrollY < 0) {
            scrollY = 0;
        }
        this.f6748b.scrollTo(scrollX, scrollY);
    }

    private void a(int i2, int i3) {
        if (this.f6752f != null) {
            Rect c2 = this.f6748b.c(i3);
            ((Magnifier) this.f6752f).show((float) i2, (float) (((c2.top + c2.bottom) / 2) - b(0)));
        }
    }

    private void b(int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            if (this.f6752f != null) {
                d();
            }
            this.f6752f = new Magnifier(this.f6748b);
            a(i2, i3);
        }
    }

    private void c(MotionEvent motionEvent) {
        if (!this.f6748b.i() && e()) {
            this.f6748b.a(true);
            d(1);
        }
        int x = ((int) motionEvent.getX()) + this.f6750d;
        int y = ((int) motionEvent.getY()) + this.f6751e;
        FreeScrollingTextField freeScrollingTextField = this.f6748b;
        int paddingLeft = (x - this.f6748b.getPaddingLeft()) + freeScrollingTextField.D;
        int paddingTop = y - freeScrollingTextField.getPaddingTop();
        boolean z = false;
        if (paddingLeft < s) {
            z = this.f6748b.b(2);
        } else {
            int contentWidth = this.f6748b.getContentWidth();
            FreeScrollingTextField freeScrollingTextField2 = this.f6748b;
            int i2 = contentWidth + freeScrollingTextField2.D;
            int i3 = s;
            if (paddingLeft >= i2 - i3) {
                z = freeScrollingTextField2.b(3);
            } else if (paddingTop < i3) {
                z = freeScrollingTextField2.b(0);
            } else if (paddingTop >= freeScrollingTextField2.getContentHeight() - s) {
                z = this.f6748b.b(1);
            }
        }
        if (!z) {
            this.f6748b.p();
            int a2 = this.f6748b.a(a(x), b(y));
            if (a2 >= 0) {
                this.f6748b.h(a2);
            }
        }
        if (this.f6759m > 0) {
            c(5000);
        }
        if (this.n > 0) {
            this.f6748b.invalidate();
        }
        a(x, this.f6748b.getCaretPosition());
    }

    private void d() {
        Object obj = this.f6752f;
        if (obj != null) {
            ((Magnifier) obj).dismiss();
            this.f6752f = null;
        }
    }

    private final boolean e() {
        PreferenceManager.getDefaultSharedPreferences(this.f6748b.getContext());
        return false;
    }

    private void f() {
        if (this.f6752f != null) {
            this.f6748b.post(new a(this));
        }
    }

    /* access modifiers changed from: protected */
    public final int a(int i2) {
        return (i2 - this.f6748b.getPaddingLeft()) + this.f6748b.getScrollX();
    }

    public Rect a() {
        return u;
    }

    public void a(Canvas canvas) {
        if (this.f6756j == null) {
            this.o = this.f6748b.a('M') * 3;
            try {
                TypedArray obtainStyledAttributes = this.f6748b.f6714c.getTheme().obtainStyledAttributes(t);
                this.f6756j = Build.VERSION.SDK_INT >= 21 ? this.f6748b.f6714c.getDrawable(obtainStyledAttributes.getResourceId(obtainStyledAttributes.getIndex(1), 0)) : this.f6748b.getResources().getDrawable(obtainStyledAttributes.getResourceId(obtainStyledAttributes.getIndex(1), 0));
                obtainStyledAttributes.recycle();
                this.o = this.f6756j.getIntrinsicWidth();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (this.f6756j == null) {
                this.f6756j = this.f6748b.getResources().getDrawable(m0.ic_caret_mid);
            }
            this.p = (this.o * this.f6756j.getIntrinsicHeight()) / this.f6756j.getIntrinsicWidth();
            u = new Rect(0, 0, 0, this.p);
        }
        FreeScrollingTextField freeScrollingTextField = this.f6748b;
        Rect c2 = freeScrollingTextField.c(freeScrollingTextField.getCaretPosition());
        int i2 = c2.left;
        FreeScrollingTextField freeScrollingTextField2 = this.f6748b;
        int i3 = (i2 + freeScrollingTextField2.D) - (this.o / 2);
        int m2 = c2.top + freeScrollingTextField2.m();
        this.f6756j.setBounds(i3, m2, this.o + i3, this.p + m2);
        this.f6756j.draw(canvas);
    }

    public void a(e.d.a.a.b bVar) {
    }

    public void a(boolean z) {
    }

    public boolean a(int i2, int i3, int i4) {
        Rect c2 = this.f6748b.c(i4);
        int i5 = c2.top;
        int i6 = v;
        return i3 >= i5 - i6 && i3 < c2.bottom + i6 && i2 >= c2.left - i6 && i2 < c2.right + i6;
    }

    public boolean a(int i2, int i3, int i4, int i5) {
        Rect c2 = this.f6748b.c(i4);
        int i6 = this.r;
        int i7 = this.q / 2;
        if (i3 >= c2.top + this.f6748b.m() && i3 < c2.top + this.f6748b.m() + this.r + i6) {
            int i8 = c2.left;
            int i9 = this.q;
            return i2 >= (i8 - ((i9 * i5) / 2)) - i7 && i2 < (i8 + ((i9 * (1 - i5)) / 2)) + i7;
        }
    }

    public boolean a(int i2, KeyEvent keyEvent) {
        return false;
    }

    public boolean a(MotionEvent motionEvent) {
        if (!this.f6749c.onTouchEvent(motionEvent) && (motionEvent.getAction() & 255) == 1) {
            b(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final int b(int i2) {
        return (i2 - this.f6748b.getPaddingTop()) + this.f6748b.getScrollY();
    }

    public /* synthetic */ void b() {
        Object obj = this.f6752f;
        if (obj != null) {
            ((Magnifier) obj).update();
        }
    }

    public void b(Canvas canvas) {
        if (this.f6757k == null) {
            this.q = this.f6748b.a('M') * 3;
            try {
                TypedArray obtainStyledAttributes = this.f6748b.f6714c.getTheme().obtainStyledAttributes(t);
                this.f6757k = Build.VERSION.SDK_INT >= 21 ? this.f6748b.f6714c.getDrawable(obtainStyledAttributes.getResourceId(obtainStyledAttributes.getIndex(0), 0)) : this.f6748b.getResources().getDrawable(obtainStyledAttributes.getResourceId(obtainStyledAttributes.getIndex(0), 0));
                obtainStyledAttributes.recycle();
                this.q = this.f6757k.getIntrinsicWidth();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (this.f6757k == null) {
                this.f6757k = this.f6748b.getResources().getDrawable(m0.ic_caret_left);
            }
            this.r = (this.q * this.f6757k.getIntrinsicHeight()) / this.f6757k.getIntrinsicWidth();
            try {
                TypedArray obtainStyledAttributes2 = this.f6748b.f6714c.getTheme().obtainStyledAttributes(t);
                this.f6758l = Build.VERSION.SDK_INT >= 21 ? this.f6748b.f6714c.getDrawable(obtainStyledAttributes2.getResourceId(obtainStyledAttributes2.getIndex(2), 0)) : this.f6748b.getResources().getDrawable(obtainStyledAttributes2.getResourceId(obtainStyledAttributes2.getIndex(2), 0));
                obtainStyledAttributes2.recycle();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            if (this.f6758l == null) {
                this.f6758l = this.f6748b.getResources().getDrawable(m0.ic_caret_right);
            }
        }
        FreeScrollingTextField freeScrollingTextField = this.f6748b;
        Rect c2 = freeScrollingTextField.c(freeScrollingTextField.getSelectionStart());
        int i2 = c2.left;
        FreeScrollingTextField freeScrollingTextField2 = this.f6748b;
        int i3 = (i2 + freeScrollingTextField2.D) - ((this.q * 3) / 4);
        int m2 = c2.top + freeScrollingTextField2.m();
        FreeScrollingTextField freeScrollingTextField3 = this.f6748b;
        Rect c3 = freeScrollingTextField3.c(freeScrollingTextField3.getSelectionEnd());
        int i4 = c3.left;
        FreeScrollingTextField freeScrollingTextField4 = this.f6748b;
        int i5 = (i4 + freeScrollingTextField4.D) - ((this.q * 1) / 4);
        int m3 = c3.top + freeScrollingTextField4.m();
        this.f6757k.setBounds(i3, m2, this.q + i3, this.r + m2);
        this.f6757k.draw(canvas);
        this.f6758l.setBounds(i5, m3, this.q + i5, this.r + m3);
        this.f6758l.draw(canvas);
    }

    public boolean b(int i2, int i3, int i4) {
        Rect c2 = this.f6748b.c(i4);
        int i5 = this.p;
        int i6 = this.o / 2;
        if (i3 >= c2.top + this.f6748b.m() && i3 < c2.top + this.f6748b.m() + this.p + i5) {
            int i7 = c2.left;
            int i8 = this.o;
            return i2 >= (i7 - (i8 / 2)) - i6 && i2 < (i7 + (i8 / 2)) + i6;
        }
    }

    public boolean b(MotionEvent motionEvent) {
        this.f6748b.p();
        this.f6753g = false;
        d();
        return true;
    }

    public void c() {
        if (this.f6759m == 0) {
            this.f6748b.postDelayed(new a(), 100);
        }
        this.f6748b.post(new b());
    }

    public void c(int i2) {
        this.f6759m = i2;
        this.f6748b.invalidate();
    }

    @SuppressLint({"NewApi"})
    public void c(Canvas canvas) {
        c.a.o.b bVar = this.f6748b.f6714c.r;
        if (bVar != null) {
            boolean z = true;
            boolean z2 = bVar.c().findItem(1) == null;
            if (!this.f6748b.i() || this.f6748b.getSelectionStart() == this.f6748b.getSelectionEnd()) {
                z = false;
            }
            if (z2 == z) {
                this.f6748b.f6714c.V();
            }
        }
        if (this.n > 0) {
            if (this.f6748b.i()) {
                b(canvas);
            } else {
                d(0);
            }
        } else if (this.f6759m > 0) {
            a(canvas);
        }
        if (this.f6753g || this.f6754h || this.f6755i) {
            f();
        }
    }

    public void d(int i2) {
        this.n = i2;
        this.f6748b.invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r6 < 0) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onDoubleTap(android.view.MotionEvent r6) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: com.myopicmobile.textwarrior.android.d.onDoubleTap(android.view.MotionEvent):boolean");
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return super.onDoubleTapEvent(motionEvent);
    }

    public boolean onDown(MotionEvent motionEvent) {
        int a2 = a((int) motionEvent.getX());
        int b2 = b((int) motionEvent.getY());
        this.f6753g = b(a2, b2, this.f6748b.getCaretPosition()) && this.f6759m > 0 && !this.f6748b.i();
        this.f6754h = false;
        this.f6755i = false;
        if (this.f6748b.h()) {
            this.f6748b.q();
        } else if (this.f6748b.i()) {
            if (a(a2, b2, this.f6748b.getSelectionStart(), 1)) {
                this.f6748b.g();
                this.f6754h = true;
            } else if (a(a2, b2, this.f6748b.getSelectionEnd(), 0)) {
                this.f6748b.f();
                this.f6755i = true;
            }
        }
        FreeScrollingTextField freeScrollingTextField = this.f6748b;
        Rect c2 = freeScrollingTextField.c(freeScrollingTextField.getCaretPosition());
        this.f6750d = ((c2.left + c2.right) / 2) - a2;
        this.f6751e = ((c2.bottom + c2.top) / 2) - b2;
        if (this.f6753g || this.f6754h || this.f6755i) {
            b((int) (motionEvent.getX() + ((float) this.f6750d)), this.f6748b.getCaretPosition());
        }
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (!this.f6753g && !this.f6754h && !this.f6755i) {
            this.f6748b.c((int) (-f2), (int) (-f3));
        }
        b(motionEvent2);
        return true;
    }

    @SuppressLint({"NewApi"})
    public void onLongPress(MotionEvent motionEvent) {
        if (!this.f6753g && !this.f6754h && !this.f6755i) {
            if (!this.f6748b.i()) {
                this.f6748b.a(true);
                d(1);
            } else {
                FreeScrollingTextField freeScrollingTextField = this.f6748b;
                freeScrollingTextField.f6714c.openContextMenu(freeScrollingTextField);
            }
            super.onLongPress(motionEvent);
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (this.f6753g || this.f6754h || this.f6755i) {
            c(motionEvent2);
        } else {
            a(f2, f3);
        }
        if ((motionEvent2.getAction() & 255) == 1) {
            b(motionEvent2);
        }
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        int a2 = a((int) motionEvent.getX());
        int b2 = b((int) motionEvent.getY());
        int a3 = this.f6748b.a(a2, b2);
        FreeScrollingTextField freeScrollingTextField = this.f6748b;
        if (a2 < (-freeScrollingTextField.E)) {
            this.f6748b.f6714c.d(freeScrollingTextField.f6714c.c(a3)[0]);
            this.f6748b.invalidate();
            return true;
        }
        if (freeScrollingTextField.i()) {
            int b3 = this.f6748b.b(a2, b2);
            if (!this.f6748b.f(b3) && !a(a2, b2, this.f6748b.getSelectionStart()) && !a(a2, b2, this.f6748b.getSelectionEnd()) && !a(a2, b2, this.f6748b.getSelectionStart(), 1) && !a(a2, b2, this.f6748b.getSelectionEnd(), 0)) {
                this.f6748b.a(false);
                if (b3 >= 0) {
                    this.f6748b.h(a3);
                }
            }
        } else {
            if (a3 >= 0) {
                this.f6748b.h(a3);
            }
            PreferenceManager.getDefaultSharedPreferences(this.f6748b.getContext());
            this.f6748b.b(true);
        }
        if (!this.f6748b.i()) {
            if (this.f6759m == 0) {
                this.f6748b.postDelayed(new c(), 100);
            }
            this.f6748b.post(new RunnableC0095d());
        }
        return true;
    }
}
