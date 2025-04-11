package c.d.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import c.d.b;
import c.d.d;
import c.d.e;

public class a extends FrameLayout {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f1912i = {16842801};

    /* renamed from: j  reason: collision with root package name */
    private static final f f1913j;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1914b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1915c;

    /* renamed from: d  reason: collision with root package name */
    int f1916d;

    /* renamed from: e  reason: collision with root package name */
    int f1917e;

    /* renamed from: f  reason: collision with root package name */
    final Rect f1918f;

    /* renamed from: g  reason: collision with root package name */
    final Rect f1919g;

    /* renamed from: h  reason: collision with root package name */
    private final e f1920h;

    /* renamed from: c.d.f.a$a  reason: collision with other inner class name */
    class C0039a implements e {
        private Drawable a;

        C0039a() {
        }

        @Override // c.d.f.e
        public View a() {
            return a.this;
        }

        @Override // c.d.f.e
        public void a(int i2, int i3) {
            a aVar = a.this;
            if (i2 > aVar.f1916d) {
                a.super.setMinimumWidth(i2);
            }
            a aVar2 = a.this;
            if (i3 > aVar2.f1917e) {
                a.super.setMinimumHeight(i3);
            }
        }

        @Override // c.d.f.e
        public void a(int i2, int i3, int i4, int i5) {
            a.this.f1919g.set(i2, i3, i4, i5);
            a aVar = a.this;
            Rect rect = aVar.f1918f;
            a.super.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
        }

        @Override // c.d.f.e
        public void a(Drawable drawable) {
            this.a = drawable;
            a.this.setBackgroundDrawable(drawable);
        }

        @Override // c.d.f.e
        public boolean b() {
            return a.this.getPreventCornerOverlap();
        }

        @Override // c.d.f.e
        public boolean c() {
            return a.this.getUseCompatPadding();
        }

        @Override // c.d.f.e
        public Drawable d() {
            return this.a;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f1913j = i2 >= 21 ? new c() : i2 >= 17 ? new b() : new d();
        f1913j.a();
    }

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.d.a.cardViewStyle);
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources;
        int i3;
        ColorStateList valueOf;
        this.f1918f = new Rect();
        this.f1919g = new Rect();
        this.f1920h = new C0039a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.CardView, i2, d.CardView);
        if (obtainStyledAttributes.hasValue(e.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(e.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1912i);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i3 = b.cardview_light_background;
            } else {
                resources = getResources();
                i3 = b.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i3));
        }
        float dimension = obtainStyledAttributes.getDimension(e.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(e.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(e.CardView_cardMaxElevation, 0.0f);
        this.f1914b = obtainStyledAttributes.getBoolean(e.CardView_cardUseCompatPadding, false);
        this.f1915c = obtainStyledAttributes.getBoolean(e.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(e.CardView_contentPadding, 0);
        this.f1918f.left = obtainStyledAttributes.getDimensionPixelSize(e.CardView_contentPaddingLeft, dimensionPixelSize);
        this.f1918f.top = obtainStyledAttributes.getDimensionPixelSize(e.CardView_contentPaddingTop, dimensionPixelSize);
        this.f1918f.right = obtainStyledAttributes.getDimensionPixelSize(e.CardView_contentPaddingRight, dimensionPixelSize);
        this.f1918f.bottom = obtainStyledAttributes.getDimensionPixelSize(e.CardView_contentPaddingBottom, dimensionPixelSize);
        float f2 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1916d = obtainStyledAttributes.getDimensionPixelSize(e.CardView_android_minWidth, 0);
        this.f1917e = obtainStyledAttributes.getDimensionPixelSize(e.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f1913j.a(this.f1920h, context, valueOf, dimension, dimension2, f2);
    }

    public void a(int i2, int i3, int i4, int i5) {
        this.f1918f.set(i2, i3, i4, i5);
        f1913j.d(this.f1920h);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1913j.b(this.f1920h);
    }

    public float getCardElevation() {
        return f1913j.c(this.f1920h);
    }

    public int getContentPaddingBottom() {
        return this.f1918f.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1918f.left;
    }

    public int getContentPaddingRight() {
        return this.f1918f.right;
    }

    public int getContentPaddingTop() {
        return this.f1918f.top;
    }

    public float getMaxCardElevation() {
        return f1913j.a(this.f1920h);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1915c;
    }

    public float getRadius() {
        return f1913j.e(this.f1920h);
    }

    public boolean getUseCompatPadding() {
        return this.f1914b;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (!(f1913j instanceof c)) {
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f1913j.g(this.f1920h)), View.MeasureSpec.getSize(i2)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i3);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f1913j.f(this.f1920h)), View.MeasureSpec.getSize(i3)), mode2);
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        f1913j.a(this.f1920h, ColorStateList.valueOf(i2));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1913j.a(this.f1920h, colorStateList);
    }

    public void setCardElevation(float f2) {
        f1913j.b(this.f1920h, f2);
    }

    public void setMaxCardElevation(float f2) {
        f1913j.c(this.f1920h, f2);
    }

    public void setMinimumHeight(int i2) {
        this.f1917e = i2;
        super.setMinimumHeight(i2);
    }

    public void setMinimumWidth(int i2) {
        this.f1916d = i2;
        super.setMinimumWidth(i2);
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1915c) {
            this.f1915c = z;
            f1913j.i(this.f1920h);
        }
    }

    public void setRadius(float f2) {
        f1913j.a(this.f1920h, f2);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1914b != z) {
            this.f1914b = z;
            f1913j.h(this.f1920h);
        }
    }
}
