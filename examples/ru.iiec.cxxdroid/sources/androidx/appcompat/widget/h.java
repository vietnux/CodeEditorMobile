package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.c;

/* access modifiers changed from: package-private */
public class h {
    private final CompoundButton a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f597b = null;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f598c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f599d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f600e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f601f;

    h(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    public int a(int i2) {
        Drawable a2;
        return (Build.VERSION.SDK_INT >= 17 || (a2 = c.a(this.a)) == null) ? i2 : i2 + a2.getIntrinsicWidth();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable a2 = c.a(this.a);
        if (a2 == null) {
            return;
        }
        if (this.f599d || this.f600e) {
            Drawable mutate = a.i(a2).mutate();
            if (this.f599d) {
                a.a(mutate, this.f597b);
            }
            if (this.f600e) {
                a.a(mutate, this.f598c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.a.getDrawableState());
            }
            this.a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        this.f597b = colorStateList;
        this.f599d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        this.f598c = mode;
        this.f600e = true;
        a();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.util.AttributeSet r11, int r12) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h.a(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f597b;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        return this.f598c;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (this.f601f) {
            this.f601f = false;
            return;
        }
        this.f601f = true;
        a();
    }
}
