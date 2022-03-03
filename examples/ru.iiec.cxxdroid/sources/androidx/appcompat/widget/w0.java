package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import c.a.k.a.a;
import c.h.d.d.f;

public class w0 {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f747b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f748c;

    private w0(Context context, TypedArray typedArray) {
        this.a = context;
        this.f747b = typedArray;
    }

    public static w0 a(Context context, int i2, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(i2, iArr));
    }

    public static w0 a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static w0 a(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public float a(int i2, float f2) {
        return this.f747b.getFloat(i2, f2);
    }

    public int a(int i2, int i3) {
        return this.f747b.getColor(i2, i3);
    }

    public ColorStateList a(int i2) {
        int resourceId;
        ColorStateList b2;
        return (!this.f747b.hasValue(i2) || (resourceId = this.f747b.getResourceId(i2, 0)) == 0 || (b2 = a.b(this.a, resourceId)) == null) ? this.f747b.getColorStateList(i2) : b2;
    }

    public TypedArray a() {
        return this.f747b;
    }

    public Typeface a(int i2, int i3, f.c cVar) {
        int resourceId = this.f747b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f748c == null) {
            this.f748c = new TypedValue();
        }
        return f.a(this.a, resourceId, this.f748c, i3, cVar);
    }

    public boolean a(int i2, boolean z) {
        return this.f747b.getBoolean(i2, z);
    }

    public int b(int i2, int i3) {
        return this.f747b.getDimensionPixelOffset(i2, i3);
    }

    public Drawable b(int i2) {
        int resourceId;
        return (!this.f747b.hasValue(i2) || (resourceId = this.f747b.getResourceId(i2, 0)) == 0) ? this.f747b.getDrawable(i2) : a.c(this.a, resourceId);
    }

    public void b() {
        this.f747b.recycle();
    }

    public int c(int i2, int i3) {
        return this.f747b.getDimensionPixelSize(i2, i3);
    }

    public Drawable c(int i2) {
        int resourceId;
        if (!this.f747b.hasValue(i2) || (resourceId = this.f747b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return i.b().a(this.a, resourceId, true);
    }

    public int d(int i2, int i3) {
        return this.f747b.getInt(i2, i3);
    }

    public String d(int i2) {
        return this.f747b.getString(i2);
    }

    public int e(int i2, int i3) {
        return this.f747b.getInteger(i2, i3);
    }

    public CharSequence e(int i2) {
        return this.f747b.getText(i2);
    }

    public int f(int i2, int i3) {
        return this.f747b.getLayoutDimension(i2, i3);
    }

    public CharSequence[] f(int i2) {
        return this.f747b.getTextArray(i2);
    }

    public int g(int i2, int i3) {
        return this.f747b.getResourceId(i2, i3);
    }

    public boolean g(int i2) {
        return this.f747b.hasValue(i2);
    }
}
