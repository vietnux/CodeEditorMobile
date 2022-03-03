package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.q;
import androidx.core.widget.h;
import c.a.j;
import c.h.l.b0;
import java.lang.reflect.Method;

public class i0 implements q {
    private static Method G;
    private static Method H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
    private static Method I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
    private final c A;
    final Handler B;
    private final Rect C;
    private Rect D;
    private boolean E;
    PopupWindow F;

    /* renamed from: b  reason: collision with root package name */
    private Context f621b;

    /* renamed from: c  reason: collision with root package name */
    private ListAdapter f622c;

    /* renamed from: d  reason: collision with root package name */
    e0 f623d;

    /* renamed from: e  reason: collision with root package name */
    private int f624e;

    /* renamed from: f  reason: collision with root package name */
    private int f625f;

    /* renamed from: g  reason: collision with root package name */
    private int f626g;

    /* renamed from: h  reason: collision with root package name */
    private int f627h;

    /* renamed from: i  reason: collision with root package name */
    private int f628i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f629j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f630k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f631l;

    /* renamed from: m  reason: collision with root package name */
    private int f632m;
    private boolean n;
    private boolean o;
    int p;
    private View q;
    private int r;
    private DataSetObserver s;
    private View t;
    private Drawable u;
    private AdapterView.OnItemClickListener v;
    private AdapterView.OnItemSelectedListener w;
    final g x;
    private final f y;
    private final e z;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        a() {
        }

        public void run() {
            View i2 = i0.this.i();
            if (i2 != null && i2.getWindowToken() != null) {
                i0.this.e();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            e0 e0Var;
            if (i2 != -1 && (e0Var = i0.this.f623d) != null) {
                e0Var.setListSelectionHidden(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* access modifiers changed from: private */
    public class c implements Runnable {
        c() {
        }

        public void run() {
            i0.this.h();
        }
    }

    /* access modifiers changed from: private */
    public class d extends DataSetObserver {
        d() {
        }

        public void onChanged() {
            if (i0.this.f()) {
                i0.this.e();
            }
        }

        public void onInvalidated() {
            i0.this.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public class e implements AbsListView.OnScrollListener {
        e() {
        }

        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 == 1 && !i0.this.k() && i0.this.F.getContentView() != null) {
                i0 i0Var = i0.this;
                i0Var.B.removeCallbacks(i0Var.x);
                i0.this.x.run();
            }
        }
    }

    /* access modifiers changed from: private */
    public class f implements View.OnTouchListener {
        f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = i0.this.F) != null && popupWindow.isShowing() && x >= 0 && x < i0.this.F.getWidth() && y >= 0 && y < i0.this.F.getHeight()) {
                i0 i0Var = i0.this;
                i0Var.B.postDelayed(i0Var.x, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                i0 i0Var2 = i0.this;
                i0Var2.B.removeCallbacks(i0Var2.x);
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    public class g implements Runnable {
        g() {
        }

        public void run() {
            e0 e0Var = i0.this.f623d;
            if (e0Var != null && b0.H(e0Var) && i0.this.f623d.getCount() > i0.this.f623d.getChildCount()) {
                int childCount = i0.this.f623d.getChildCount();
                i0 i0Var = i0.this;
                if (childCount <= i0Var.p) {
                    i0Var.F.setInputMethodMode(2);
                    i0.this.e();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public i0(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public i0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f624e = -2;
        this.f625f = -2;
        this.f628i = 1002;
        this.f632m = 0;
        this.n = false;
        this.o = false;
        this.p = Integer.MAX_VALUE;
        this.r = 0;
        this.x = new g();
        this.y = new f();
        this.z = new e();
        this.A = new c();
        this.C = new Rect();
        this.f621b = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ListPopupWindow, i2, i3);
        this.f626g = obtainStyledAttributes.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f627h = obtainStyledAttributes.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f627h != 0) {
            this.f629j = true;
        }
        obtainStyledAttributes.recycle();
        this.F = new o(context, attributeSet, i2, i3);
        this.F.setInputMethodMode(1);
    }

    private int a(View view, int i2, boolean z2) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.F.getMaxAvailableHeight(view, i2, z2);
        }
        Method method = H;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.F, view, Integer.valueOf(i2), Boolean.valueOf(z2))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.F.getMaxAvailableHeight(view, i2);
    }

    private void c(boolean z2) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = G;
            if (method != null) {
                try {
                    method.invoke(this.F, Boolean.valueOf(z2));
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.F.setIsClippedToScreen(z2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: android.widget.LinearLayout */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0152  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m() {
        /*
        // Method dump skipped, instructions count: 357
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i0.m():int");
    }

    private void n() {
        View view = this.q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.q);
            }
        }
    }

    public int a() {
        return this.f626g;
    }

    /* access modifiers changed from: package-private */
    public e0 a(Context context, boolean z2) {
        return new e0(context, z2);
    }

    public void a(int i2) {
        this.f627h = i2;
        this.f629j = true;
    }

    public void a(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void a(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public void a(View view) {
        this.t = view;
    }

    public void a(AdapterView.OnItemClickListener onItemClickListener) {
        this.v = onItemClickListener;
    }

    public void a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.s;
        if (dataSetObserver == null) {
            this.s = new d();
        } else {
            ListAdapter listAdapter2 = this.f622c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f622c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        e0 e0Var = this.f623d;
        if (e0Var != null) {
            e0Var.setAdapter(this.f622c);
        }
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void a(boolean z2) {
        this.E = z2;
        this.F.setFocusable(z2);
    }

    public Drawable b() {
        return this.F.getBackground();
    }

    public void b(boolean z2) {
        this.f631l = true;
        this.f630k = z2;
    }

    public int c() {
        if (!this.f629j) {
            return 0;
        }
        return this.f627h;
    }

    public void c(int i2) {
        this.f626g = i2;
    }

    public void d(int i2) {
        this.F.setAnimationStyle(i2);
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        this.F.dismiss();
        n();
        this.F.setContentView(null);
        this.f623d = null;
        this.B.removeCallbacks(this.x);
    }

    @Override // androidx.appcompat.view.menu.q
    public void e() {
        int m2 = m();
        boolean k2 = k();
        h.a(this.F, this.f628i);
        boolean z2 = true;
        if (!this.F.isShowing()) {
            int i2 = this.f625f;
            if (i2 == -1) {
                i2 = -1;
            } else if (i2 == -2) {
                i2 = i().getWidth();
            }
            int i3 = this.f624e;
            if (i3 == -1) {
                m2 = -1;
            } else if (i3 != -2) {
                m2 = i3;
            }
            this.F.setWidth(i2);
            this.F.setHeight(m2);
            c(true);
            this.F.setOutsideTouchable(!this.o && !this.n);
            this.F.setTouchInterceptor(this.y);
            if (this.f631l) {
                h.a(this.F, this.f630k);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = I;
                if (method != null) {
                    try {
                        method.invoke(this.F, this.D);
                    } catch (Exception e2) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                    }
                }
            } else {
                this.F.setEpicenterBounds(this.D);
            }
            h.a(this.F, i(), this.f626g, this.f627h, this.f632m);
            this.f623d.setSelection(-1);
            if (!this.E || this.f623d.isInTouchMode()) {
                h();
            }
            if (!this.E) {
                this.B.post(this.A);
            }
        } else if (b0.H(i())) {
            int i4 = this.f625f;
            if (i4 == -1) {
                i4 = -1;
            } else if (i4 == -2) {
                i4 = i().getWidth();
            }
            int i5 = this.f624e;
            if (i5 == -1) {
                if (!k2) {
                    m2 = -1;
                }
                if (k2) {
                    this.F.setWidth(this.f625f == -1 ? -1 : 0);
                    this.F.setHeight(0);
                } else {
                    this.F.setWidth(this.f625f == -1 ? -1 : 0);
                    this.F.setHeight(-1);
                }
            } else if (i5 != -2) {
                m2 = i5;
            }
            PopupWindow popupWindow = this.F;
            if (this.o || this.n) {
                z2 = false;
            }
            popupWindow.setOutsideTouchable(z2);
            this.F.update(i(), this.f626g, this.f627h, i4 < 0 ? -1 : i4, m2 < 0 ? -1 : m2);
        }
    }

    public void e(int i2) {
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            this.f625f = rect.left + rect.right + i2;
            return;
        }
        j(i2);
    }

    public void f(int i2) {
        this.f632m = i2;
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean f() {
        return this.F.isShowing();
    }

    @Override // androidx.appcompat.view.menu.q
    public ListView g() {
        return this.f623d;
    }

    public void g(int i2) {
        this.F.setInputMethodMode(i2);
    }

    public void h() {
        e0 e0Var = this.f623d;
        if (e0Var != null) {
            e0Var.setListSelectionHidden(true);
            e0Var.requestLayout();
        }
    }

    public void h(int i2) {
        this.r = i2;
    }

    public View i() {
        return this.t;
    }

    public void i(int i2) {
        e0 e0Var = this.f623d;
        if (f() && e0Var != null) {
            e0Var.setListSelectionHidden(false);
            e0Var.setSelection(i2);
            if (e0Var.getChoiceMode() != 0) {
                e0Var.setItemChecked(i2, true);
            }
        }
    }

    public int j() {
        return this.f625f;
    }

    public void j(int i2) {
        this.f625f = i2;
    }

    public boolean k() {
        return this.F.getInputMethodMode() == 2;
    }

    public boolean l() {
        return this.E;
    }
}
