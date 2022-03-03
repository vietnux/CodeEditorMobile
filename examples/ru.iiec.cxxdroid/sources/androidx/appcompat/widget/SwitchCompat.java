package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.widget.i;
import c.a.h;
import c.a.j;
import c.h.l.b0;

public class SwitchCompat extends CompoundButton {
    private static final Property<SwitchCompat, Float> O = new a(Float.class, "thumbPos");
    private static final int[] P = {16842912};
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private final TextPaint G;
    private ColorStateList H;
    private Layout I;
    private Layout J;
    private TransformationMethod K;
    ObjectAnimator L;
    private final x M;
    private final Rect N;

    /* renamed from: b  reason: collision with root package name */
    private Drawable f489b;

    /* renamed from: c  reason: collision with root package name */
    private ColorStateList f490c;

    /* renamed from: d  reason: collision with root package name */
    private PorterDuff.Mode f491d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f492e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f493f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f494g;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f495h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuff.Mode f496i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f497j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f498k;

    /* renamed from: l  reason: collision with root package name */
    private int f499l;

    /* renamed from: m  reason: collision with root package name */
    private int f500m;
    private int n;
    private boolean o;
    private CharSequence p;
    private CharSequence q;
    private boolean r;
    private int s;
    private int t;
    private float u;
    private float v;
    private VelocityTracker w;
    private int x;
    float y;
    private int z;

    class a extends Property<SwitchCompat, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.y);
        }

        /* renamed from: a */
        public void set(SwitchCompat switchCompat, Float f2) {
            switchCompat.setThumbPosition(f2.floatValue());
        }
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.a.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f490c = null;
        this.f491d = null;
        this.f492e = false;
        this.f493f = false;
        this.f495h = null;
        this.f496i = null;
        this.f497j = false;
        this.f498k = false;
        this.w = VelocityTracker.obtain();
        this.N = new Rect();
        r0.a(this, getContext());
        this.G = new TextPaint(1);
        Resources resources = getResources();
        this.G.density = resources.getDisplayMetrics().density;
        w0 a2 = w0.a(context, attributeSet, j.SwitchCompat, i2, 0);
        b0.a(this, context, j.SwitchCompat, attributeSet, a2.a(), i2, 0);
        this.f489b = a2.b(j.SwitchCompat_android_thumb);
        Drawable drawable = this.f489b;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        this.f494g = a2.b(j.SwitchCompat_track);
        Drawable drawable2 = this.f494g;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        this.p = a2.e(j.SwitchCompat_android_textOn);
        this.q = a2.e(j.SwitchCompat_android_textOff);
        this.r = a2.a(j.SwitchCompat_showText, true);
        this.f499l = a2.c(j.SwitchCompat_thumbTextPadding, 0);
        this.f500m = a2.c(j.SwitchCompat_switchMinWidth, 0);
        this.n = a2.c(j.SwitchCompat_switchPadding, 0);
        this.o = a2.a(j.SwitchCompat_splitTrack, false);
        ColorStateList a3 = a2.a(j.SwitchCompat_thumbTint);
        if (a3 != null) {
            this.f490c = a3;
            this.f492e = true;
        }
        PorterDuff.Mode a4 = d0.a(a2.d(j.SwitchCompat_thumbTintMode, -1), null);
        if (this.f491d != a4) {
            this.f491d = a4;
            this.f493f = true;
        }
        if (this.f492e || this.f493f) {
            a();
        }
        ColorStateList a5 = a2.a(j.SwitchCompat_trackTint);
        if (a5 != null) {
            this.f495h = a5;
            this.f497j = true;
        }
        PorterDuff.Mode a6 = d0.a(a2.d(j.SwitchCompat_trackTintMode, -1), null);
        if (this.f496i != a6) {
            this.f496i = a6;
            this.f498k = true;
        }
        if (this.f497j || this.f498k) {
            b();
        }
        int g2 = a2.g(j.SwitchCompat_switchTextAppearance, 0);
        if (g2 != 0) {
            a(context, g2);
        }
        this.M = new x(this);
        this.M.a(attributeSet, i2);
        a2.b();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.t = viewConfiguration.getScaledTouchSlop();
        this.x = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private static float a(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    private Layout a(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.K;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        TextPaint textPaint = this.G;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void a() {
        if (this.f489b == null) {
            return;
        }
        if (this.f492e || this.f493f) {
            this.f489b = androidx.core.graphics.drawable.a.i(this.f489b).mutate();
            if (this.f492e) {
                androidx.core.graphics.drawable.a.a(this.f489b, this.f490c);
            }
            if (this.f493f) {
                androidx.core.graphics.drawable.a.a(this.f489b, this.f491d);
            }
            if (this.f489b.isStateful()) {
                this.f489b.setState(getDrawableState());
            }
        }
    }

    private void a(int i2, int i3) {
        a(i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i3);
    }

    private void a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private void a(boolean z2) {
        this.L = ObjectAnimator.ofFloat(this, O, z2 ? 1.0f : 0.0f);
        this.L.setDuration(250L);
        if (Build.VERSION.SDK_INT >= 18) {
            this.L.setAutoCancel(true);
        }
        this.L.start();
    }

    private boolean a(float f2, float f3) {
        if (this.f489b == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f489b.getPadding(this.N);
        int i2 = this.D;
        int i3 = this.t;
        int i4 = i2 - i3;
        int i5 = (this.C + thumbOffset) - i3;
        Rect rect = this.N;
        return f2 > ((float) i5) && f2 < ((float) ((((this.B + i5) + rect.left) + rect.right) + i3)) && f3 > ((float) i4) && f3 < ((float) (this.F + i3));
    }

    private void b() {
        if (this.f494g == null) {
            return;
        }
        if (this.f497j || this.f498k) {
            this.f494g = androidx.core.graphics.drawable.a.i(this.f494g).mutate();
            if (this.f497j) {
                androidx.core.graphics.drawable.a.a(this.f494g, this.f495h);
            }
            if (this.f498k) {
                androidx.core.graphics.drawable.a.a(this.f494g, this.f496i);
            }
            if (this.f494g.isStateful()) {
                this.f494g.setState(getDrawableState());
            }
        }
    }

    private void b(MotionEvent motionEvent) {
        boolean z2;
        this.s = 0;
        boolean z3 = true;
        boolean z4 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z4) {
            this.w.computeCurrentVelocity(1000);
            float xVelocity = this.w.getXVelocity();
            if (Math.abs(xVelocity) > ((float) this.x)) {
                if (!c1.a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z3 = false;
                }
                z2 = z3;
            } else {
                z2 = getTargetCheckedState();
            }
        } else {
            z2 = isChecked;
        }
        if (z2 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z2);
        a(motionEvent);
    }

    private void c() {
        ObjectAnimator objectAnimator = this.L;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void d() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.q;
            if (charSequence == null) {
                charSequence = getResources().getString(h.abc_capital_off);
            }
            b0.a(this, charSequence);
        }
    }

    private void e() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.p;
            if (charSequence == null) {
                charSequence = getResources().getString(h.abc_capital_on);
            }
            b0.a(this, charSequence);
        }
    }

    private boolean getTargetCheckedState() {
        return this.y > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((c1.a(this) ? 1.0f - this.y : this.y) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f494g;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.N;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f489b;
        Rect d2 = drawable2 != null ? d0.d(drawable2) : d0.f560c;
        return ((((this.z - this.B) - rect.left) - rect.right) - d2.left) - d2.right;
    }

    public void a(Context context, int i2) {
        w0 a2 = w0.a(context, i2, j.TextAppearance);
        ColorStateList a3 = a2.a(j.TextAppearance_android_textColor);
        if (a3 == null) {
            a3 = getTextColors();
        }
        this.H = a3;
        int c2 = a2.c(j.TextAppearance_android_textSize, 0);
        if (c2 != 0) {
            float f2 = (float) c2;
            if (f2 != this.G.getTextSize()) {
                this.G.setTextSize(f2);
                requestLayout();
            }
        }
        a(a2.d(j.TextAppearance_android_typeface, -1), a2.d(j.TextAppearance_android_textStyle, -1));
        this.K = a2.a(j.TextAppearance_textAllCaps, false) ? new c.a.n.a(getContext()) : null;
        a2.b();
    }

    public void a(Typeface typeface, int i2) {
        float f2 = 0.0f;
        boolean z2 = false;
        if (i2 > 0) {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typeface, i2);
            setSwitchTypeface(defaultFromStyle);
            int i3 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i2;
            TextPaint textPaint = this.G;
            if ((i3 & 1) != 0) {
                z2 = true;
            }
            textPaint.setFakeBoldText(z2);
            TextPaint textPaint2 = this.G;
            if ((i3 & 2) != 0) {
                f2 = -0.25f;
            }
            textPaint2.setTextSkewX(f2);
            return;
        }
        this.G.setFakeBoldText(false);
        this.G.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void draw(Canvas canvas) {
        int i2;
        int i3;
        Rect rect = this.N;
        int i4 = this.C;
        int i5 = this.D;
        int i6 = this.E;
        int i7 = this.F;
        int thumbOffset = getThumbOffset() + i4;
        Drawable drawable = this.f489b;
        Rect d2 = drawable != null ? d0.d(drawable) : d0.f560c;
        Drawable drawable2 = this.f494g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i8 = rect.left;
            thumbOffset += i8;
            if (d2 != null) {
                int i9 = d2.left;
                if (i9 > i8) {
                    i4 += i9 - i8;
                }
                int i10 = d2.top;
                int i11 = rect.top;
                i2 = i10 > i11 ? (i10 - i11) + i5 : i5;
                int i12 = d2.right;
                int i13 = rect.right;
                if (i12 > i13) {
                    i6 -= i12 - i13;
                }
                int i14 = d2.bottom;
                int i15 = rect.bottom;
                if (i14 > i15) {
                    i3 = i7 - (i14 - i15);
                    this.f494g.setBounds(i4, i2, i6, i3);
                }
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.f494g.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.f489b;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i16 = thumbOffset - rect.left;
            int i17 = thumbOffset + this.B + rect.right;
            this.f489b.setBounds(i16, i5, i17, i7);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.a.a(background, i16, i5, i17, i7);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f2, f3);
        }
        Drawable drawable = this.f489b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, f2, f3);
        }
        Drawable drawable2 = this.f494g;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.a.a(drawable2, f2, f3);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f489b;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f494g;
        if (drawable2 != null && drawable2.isStateful()) {
            z2 |= drawable2.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!c1.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.n : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (c1.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.n : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.r;
    }

    public boolean getSplitTrack() {
        return this.o;
    }

    public int getSwitchMinWidth() {
        return this.f500m;
    }

    public int getSwitchPadding() {
        return this.n;
    }

    public CharSequence getTextOff() {
        return this.q;
    }

    public CharSequence getTextOn() {
        return this.p;
    }

    public Drawable getThumbDrawable() {
        return this.f489b;
    }

    public int getThumbTextPadding() {
        return this.f499l;
    }

    public ColorStateList getThumbTintList() {
        return this.f490c;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f491d;
    }

    public Drawable getTrackDrawable() {
        return this.f494g;
    }

    public ColorStateList getTrackTintList() {
        return this.f495h;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f496i;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f489b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f494g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.L;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.L.end();
            this.L = null;
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, P);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        Rect rect = this.N;
        Drawable drawable = this.f494g;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i3 = this.D;
        int i4 = this.F;
        int i5 = i3 + rect.top;
        int i6 = i4 - rect.bottom;
        Drawable drawable2 = this.f489b;
        if (drawable != null) {
            if (!this.o || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d2 = d0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d2.left;
                rect.right -= d2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.I : this.J;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.H;
            if (colorStateList != null) {
                this.G.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.G.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i2 = bounds.left + bounds.right;
            } else {
                i2 = getWidth();
            }
            canvas.translate((float) ((i2 / 2) - (layout.getWidth() / 2)), (float) (((i5 + i6) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.p : this.q;
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        super.onLayout(z2, i2, i3, i4, i5);
        int i12 = 0;
        if (this.f489b != null) {
            Rect rect = this.N;
            Drawable drawable = this.f494g;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d2 = d0.d(this.f489b);
            i6 = Math.max(0, d2.left - rect.left);
            i12 = Math.max(0, d2.right - rect.right);
        } else {
            i6 = 0;
        }
        if (c1.a(this)) {
            i8 = getPaddingLeft() + i6;
            i7 = ((this.z + i8) - i6) - i12;
        } else {
            i7 = (getWidth() - getPaddingRight()) - i12;
            i8 = (i7 - this.z) + i6 + i12;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i11 = this.A;
            i10 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i11 / 2);
        } else if (gravity != 80) {
            i10 = getPaddingTop();
            i11 = this.A;
        } else {
            i9 = getHeight() - getPaddingBottom();
            i10 = i9 - this.A;
            this.C = i8;
            this.D = i10;
            this.F = i9;
            this.E = i7;
        }
        i9 = i11 + i10;
        this.C = i8;
        this.D = i10;
        this.F = i9;
        this.E = i7;
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        if (this.r) {
            if (this.I == null) {
                this.I = a(this.p);
            }
            if (this.J == null) {
                this.J = a(this.q);
            }
        }
        Rect rect = this.N;
        Drawable drawable = this.f489b;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i5 = (this.f489b.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f489b.getIntrinsicHeight();
        } else {
            i5 = 0;
            i4 = 0;
        }
        this.B = Math.max(this.r ? Math.max(this.I.getWidth(), this.J.getWidth()) + (this.f499l * 2) : 0, i5);
        Drawable drawable2 = this.f494g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.f494g.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.f489b;
        if (drawable3 != null) {
            Rect d2 = d0.d(drawable3);
            i7 = Math.max(i7, d2.left);
            i8 = Math.max(i8, d2.right);
        }
        int max = Math.max(this.f500m, (this.B * 2) + i7 + i8);
        int max2 = Math.max(i6, i4);
        this.z = max;
        this.A = max2;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.p : this.q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean isChecked = isChecked();
        if (isChecked) {
            e();
        } else {
            d();
        }
        if (getWindowToken() == null || !b0.I(this)) {
            c();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.a(this, callback));
    }

    public void setShowText(boolean z2) {
        if (this.r != z2) {
            this.r = z2;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z2) {
        this.o = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.f500m = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.n = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.G.getTypeface() != null && !this.G.getTypeface().equals(typeface)) || (this.G.getTypeface() == null && typeface != null)) {
            this.G.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.q = charSequence;
        requestLayout();
        if (!isChecked()) {
            d();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        this.p = charSequence;
        requestLayout();
        if (isChecked()) {
            e();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f489b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f489b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f2) {
        this.y = f2;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(c.a.k.a.a.c(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.f499l = i2;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f490c = colorStateList;
        this.f492e = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f491d = mode;
        this.f493f = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f494g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f494g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(c.a.k.a.a.c(getContext(), i2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f495h = colorStateList;
        this.f497j = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f496i = mode;
        this.f498k = true;
        b();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f489b || drawable == this.f494g;
    }
}
