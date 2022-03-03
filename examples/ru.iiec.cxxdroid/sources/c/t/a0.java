package c.t;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c.h.l.b0;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class a0 implements c0 {
    protected a a;

    /* access modifiers changed from: package-private */
    public static class a extends ViewGroup {

        /* renamed from: b  reason: collision with root package name */
        ViewGroup f2535b;

        /* renamed from: c  reason: collision with root package name */
        View f2536c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<Drawable> f2537d = null;

        /* renamed from: e  reason: collision with root package name */
        a0 f2538e;

        static {
            try {
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, a0 a0Var) {
            super(context);
            this.f2535b = viewGroup;
            this.f2536c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f2538e = a0Var;
        }

        private void a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f2535b.getLocationOnScreen(iArr2);
            this.f2536c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void a(Drawable drawable) {
            if (this.f2537d == null) {
                this.f2537d = new ArrayList<>();
            }
            if (!this.f2537d.contains(drawable)) {
                this.f2537d.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        public void a(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f2535b || viewGroup.getParent() == null || !b0.H(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f2535b.getLocationOnScreen(iArr2);
                    b0.d(view, iArr[0] - iArr2[0]);
                    b0.e(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            ArrayList<Drawable> arrayList;
            return getChildCount() == 0 && ((arrayList = this.f2537d) == null || arrayList.size() == 0);
        }

        public void b(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f2537d;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
            }
        }

        public void b(View view) {
            super.removeView(view);
            if (a()) {
                this.f2535b.removeView(this);
            }
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f2535b.getLocationOnScreen(iArr);
            this.f2536c.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f2536c.getWidth(), this.f2536c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f2537d;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f2537d.get(i2).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f2535b == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f2535b instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                a(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        }

        /* access modifiers changed from: protected */
        public boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f2537d) != null && arrayList.contains(drawable));
        }
    }

    a0(Context context, ViewGroup viewGroup, View view) {
        this.a = new a(context, viewGroup, view, this);
    }

    static a0 c(View view) {
        ViewGroup d2 = d(view);
        if (d2 == null) {
            return null;
        }
        int childCount = d2.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = d2.getChildAt(i2);
            if (childAt instanceof a) {
                return ((a) childAt).f2538e;
            }
        }
        return new u(d2.getContext(), d2, view);
    }

    static ViewGroup d(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // c.t.c0
    public void a(Drawable drawable) {
        this.a.a(drawable);
    }

    @Override // c.t.c0
    public void b(Drawable drawable) {
        this.a.b(drawable);
    }
}
