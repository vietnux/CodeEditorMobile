package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import c.a.j;
import c.h.l.b0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public class z {

    /* renamed from: l  reason: collision with root package name */
    private static final RectF f788l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m  reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f789m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Field> n = new ConcurrentHashMap<>();
    private int a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f790b = false;

    /* renamed from: c  reason: collision with root package name */
    private float f791c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f792d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f793e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private int[] f794f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private boolean f795g = false;

    /* renamed from: h  reason: collision with root package name */
    private TextPaint f796h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f797i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f798j;

    /* renamed from: k  reason: collision with root package name */
    private final c f799k;

    private static class a extends c {
        a() {
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.widget.z.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) z.b(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class b extends a {
        b() {
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.widget.z.a, androidx.appcompat.widget.z.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.widget.z.c
        public boolean a(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* access modifiers changed from: private */
    public static class c {
        c() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        /* access modifiers changed from: package-private */
        public boolean a(TextView textView) {
            return ((Boolean) z.b((Object) textView, "getHorizontallyScrolling", (Object) false)).booleanValue();
        }
    }

    z(TextView textView) {
        this.f797i = textView;
        this.f798j = this.f797i.getContext();
        int i2 = Build.VERSION.SDK_INT;
        this.f799k = i2 >= 29 ? new b() : i2 >= 23 ? new a() : new c();
    }

    private int a(RectF rectF) {
        int length = this.f794f.length;
        if (length != 0) {
            int i2 = length - 1;
            int i3 = 1;
            int i4 = 0;
            while (i3 <= i2) {
                int i5 = (i3 + i2) / 2;
                if (a(this.f794f[i5], rectF)) {
                    int i6 = i5 + 1;
                    i4 = i3;
                    i3 = i6;
                } else {
                    i4 = i5 - 1;
                    i2 = i4;
                }
            }
            return this.f794f[i4];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        return new StaticLayout(charSequence, this.f796h, i2, alignment, ((Float) a(this.f797i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.f797i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) a((Object) this.f797i, "mIncludePad", (Object) true)).booleanValue());
    }

    private static <T> T a(Object obj, String str, T t) {
        try {
            Field a2 = a(str);
            return a2 == null ? t : (T) a2.get(obj);
        } catch (IllegalAccessException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return t;
        }
    }

    private static Field a(String str) {
        try {
            Field field = n.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                n.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return null;
        }
    }

    private void a(float f2) {
        if (f2 != this.f797i.getPaint().getTextSize()) {
            this.f797i.getPaint().setTextSize(f2);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f797i.isInLayout() : false;
            if (this.f797i.getLayout() != null) {
                this.f790b = false;
                try {
                    Method b2 = b("nullLayouts");
                    if (b2 != null) {
                        b2.invoke(this.f797i, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!isInLayout) {
                    this.f797i.requestLayout();
                } else {
                    this.f797i.forceLayout();
                }
                this.f797i.invalidate();
            }
        }
    }

    private void a(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 > 0.0f) {
            this.a = 1;
            this.f792d = f2;
            this.f793e = f3;
            this.f791c = f4;
            this.f795g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
    }

    private void a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = typedArray.getDimensionPixelSize(i2, -1);
            }
            this.f794f = a(iArr);
            j();
        }
    }

    private boolean a(int i2, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f797i.getText();
        TransformationMethod transformationMethod = this.f797i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f797i)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f797i.getMaxLines() : -1;
        a(i2);
        StaticLayout a2 = a(text, (Layout.Alignment) b(this.f797i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (a2.getLineCount() <= maxLines && a2.getLineEnd(a2.getLineCount() - 1) == text.length())) && ((float) a2.getHeight()) <= rectF.bottom;
    }

    private int[] a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    private StaticLayout b(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        return new StaticLayout(charSequence, this.f796h, i2, alignment, this.f797i.getLineSpacingMultiplier(), this.f797i.getLineSpacingExtra(), this.f797i.getIncludeFontPadding());
    }

    private StaticLayout b(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f796h, i2);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f797i.getLineSpacingExtra(), this.f797i.getLineSpacingMultiplier()).setIncludePad(this.f797i.getIncludeFontPadding()).setBreakStrategy(this.f797i.getBreakStrategy()).setHyphenationFrequency(this.f797i.getHyphenationFrequency());
        if (i3 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i3);
        try {
            this.f799k.a(obtain, this.f797i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    static <T> T b(Object obj, String str, T t) {
        try {
            return (T) b(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t;
        }
    }

    private static Method b(String str) {
        try {
            Method method = f789m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f789m.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    private void h() {
        this.a = 0;
        this.f792d = -1.0f;
        this.f793e = -1.0f;
        this.f791c = -1.0f;
        this.f794f = new int[0];
        this.f790b = false;
    }

    private boolean i() {
        if (!k() || this.a != 1) {
            this.f790b = false;
        } else {
            if (!this.f795g || this.f794f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f793e - this.f792d) / this.f791c))) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round(this.f792d + (((float) i2) * this.f791c));
                }
                this.f794f = a(iArr);
            }
            this.f790b = true;
        }
        return this.f790b;
    }

    private boolean j() {
        int length = this.f794f.length;
        this.f795g = length > 0;
        if (this.f795g) {
            this.a = 1;
            int[] iArr = this.f794f;
            this.f792d = (float) iArr[0];
            this.f793e = (float) iArr[length - 1];
            this.f791c = -1.0f;
        }
        return this.f795g;
    }

    private boolean k() {
        return !(this.f797i instanceof j);
    }

    /* access modifiers changed from: package-private */
    public StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        return i4 >= 23 ? b(charSequence, alignment, i2, i3) : i4 >= 16 ? b(charSequence, alignment, i2) : a(charSequence, alignment, i2);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (g()) {
            if (this.f790b) {
                if (this.f797i.getMeasuredHeight() > 0 && this.f797i.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f799k.a(this.f797i) ? 1048576 : (this.f797i.getMeasuredWidth() - this.f797i.getTotalPaddingLeft()) - this.f797i.getTotalPaddingRight();
                    int height = (this.f797i.getHeight() - this.f797i.getCompoundPaddingBottom()) - this.f797i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        synchronized (f788l) {
                            f788l.setEmpty();
                            f788l.right = (float) measuredWidth;
                            f788l.bottom = (float) height;
                            float a2 = (float) a(f788l);
                            if (a2 != this.f797i.getTextSize()) {
                                a(0, a2);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f790b = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        TextPaint textPaint = this.f796h;
        if (textPaint == null) {
            this.f796h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f796h.set(this.f797i.getPaint());
        this.f796h.setTextSize((float) i2);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, float f2) {
        Context context = this.f798j;
        a(TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3, int i4, int i5) {
        if (k()) {
            DisplayMetrics displayMetrics = this.f798j.getResources().getDisplayMetrics();
            a(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (i()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(AttributeSet attributeSet, int i2) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f798j.obtainStyledAttributes(attributeSet, j.AppCompatTextView, i2, 0);
        TextView textView = this.f797i;
        b0.a(textView, textView.getContext(), j.AppCompatTextView, attributeSet, obtainStyledAttributes, i2, 0);
        if (obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeTextType)) {
            this.a = obtainStyledAttributes.getInt(j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            a(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!k()) {
            this.a = 0;
        } else if (this.a == 1) {
            if (!this.f795g) {
                DisplayMetrics displayMetrics = this.f798j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                a(dimension2, dimension3, dimension);
            }
            i();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int[] iArr, int i2) {
        if (k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f798j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                this.f794f = a(iArr2);
                if (!j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f795g = false;
            }
            if (i()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return Math.round(this.f793e);
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        if (!k()) {
            return;
        }
        if (i2 == 0) {
            h();
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = this.f798j.getResources().getDisplayMetrics();
            a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (i()) {
                a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
        }
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return Math.round(this.f792d);
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return Math.round(this.f791c);
    }

    /* access modifiers changed from: package-private */
    public int[] e() {
        return this.f794f;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return k() && this.a != 0;
    }
}
