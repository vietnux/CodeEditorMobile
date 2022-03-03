package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.widget.f;
import c.a.l.a.c;
import c.h.l.g0;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
public class e0 extends ListView {

    /* renamed from: b  reason: collision with root package name */
    private final Rect f567b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    private int f568c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f569d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f570e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f571f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f572g;

    /* renamed from: h  reason: collision with root package name */
    private Field f573h;

    /* renamed from: i  reason: collision with root package name */
    private a f574i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f575j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f576k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f577l;

    /* renamed from: m  reason: collision with root package name */
    private g0 f578m;
    private f n;
    b o;

    /* access modifiers changed from: private */
    public static class a extends c {

        /* renamed from: c  reason: collision with root package name */
        private boolean f579c = true;

        a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        public void a(boolean z) {
            this.f579c = z;
        }

        @Override // c.a.l.a.c
        public void draw(Canvas canvas) {
            if (this.f579c) {
                super.draw(canvas);
            }
        }

        @Override // c.a.l.a.c
        public void setHotspot(float f2, float f3) {
            if (this.f579c) {
                super.setHotspot(f2, f3);
            }
        }

        @Override // c.a.l.a.c
        public void setHotspotBounds(int i2, int i3, int i4, int i5) {
            if (this.f579c) {
                super.setHotspotBounds(i2, i3, i4, i5);
            }
        }

        @Override // c.a.l.a.c
        public boolean setState(int[] iArr) {
            if (this.f579c) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // c.a.l.a.c
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f579c) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    public class b implements Runnable {
        b() {
        }

        public void a() {
            e0 e0Var = e0.this;
            e0Var.o = null;
            e0Var.removeCallbacks(this);
        }

        public void b() {
            e0.this.post(this);
        }

        public void run() {
            e0 e0Var = e0.this;
            e0Var.o = null;
            e0Var.drawableStateChanged();
        }
    }

    e0(Context context, boolean z) {
        super(context, null, c.a.a.dropDownListViewStyle);
        this.f576k = z;
        setCacheColorHint(0);
        try {
            this.f573h = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f573h.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void a() {
        this.f577l = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f572g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        g0 g0Var = this.f578m;
        if (g0Var != null) {
            g0Var.a();
            this.f578m = null;
        }
    }

    private void a(int i2, View view) {
        Rect rect = this.f567b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f568c;
        rect.top -= this.f569d;
        rect.right += this.f570e;
        rect.bottom += this.f571f;
        try {
            boolean z = this.f573h.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f573h.set(this, Boolean.valueOf(!z));
                if (i2 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    private void a(int i2, View view, float f2, float f3) {
        b(i2, view);
        Drawable selector = getSelector();
        if (selector != null && i2 != -1) {
            androidx.core.graphics.drawable.a.a(selector, f2, f3);
        }
    }

    private void a(Canvas canvas) {
        Drawable selector;
        if (!this.f567b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f567b);
            selector.draw(canvas);
        }
    }

    private void a(View view, int i2) {
        performItemClick(view, i2, getItemIdAtPosition(i2));
    }

    private void a(View view, int i2, float f2, float f3) {
        View childAt;
        this.f577l = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f2, f3);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i3 = this.f572g;
        if (!(i3 == -1 || (childAt = getChildAt(i3 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f572g = i2;
        float left = f2 - ((float) view.getLeft());
        float top = f3 - ((float) view.getTop());
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        a(i2, view, f2, f3);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private void b(int i2, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i2 == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        a(i2, view);
        if (z2) {
            Rect rect = this.f567b;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            androidx.core.graphics.drawable.a.a(selector, exactCenterX, exactCenterY);
        }
    }

    private boolean b() {
        return this.f577l;
    }

    private void c() {
        Drawable selector = getSelector();
        if (selector != null && b() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.f574i;
        if (aVar != null) {
            aVar.a(z);
        }
    }

    public int a(int i2, int i3, int i4, int i5, int i6) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i7 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i7;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = i7;
        View view = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < count) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i12 = layoutParams.height;
            view.measure(i2, i12 > 0 ? View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i9 > 0) {
                i8 += dividerHeight;
            }
            i8 += view.getMeasuredHeight();
            if (i8 >= i5) {
                return (i6 < 0 || i9 <= i6 || i11 <= 0 || i8 == i5) ? i5 : i11;
            }
            if (i6 >= 0 && i9 >= i6) {
                i11 = i8;
            }
            i9++;
        }
        return i8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.MotionEvent r8, int r9) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e0.a(android.view.MotionEvent, int):boolean");
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        a(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.o == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            c();
        }
    }

    public boolean hasFocus() {
        return this.f576k || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f576k || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f576k || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f576k && this.f575j) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.o = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.o == null) {
            this.o = new b();
            this.o.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f572g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.o;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f575j = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        this.f574i = drawable != null ? new a(drawable) : null;
        super.setSelector(this.f574i);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f568c = rect.left;
        this.f569d = rect.top;
        this.f570e = rect.right;
        this.f571f = rect.bottom;
    }
}
