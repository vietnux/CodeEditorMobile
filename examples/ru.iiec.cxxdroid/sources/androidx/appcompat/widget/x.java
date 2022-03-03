package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import c.a.j;
import c.h.d.d.f;
import c.h.l.b0;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public class x {
    private final TextView a;

    /* renamed from: b  reason: collision with root package name */
    private u0 f749b;

    /* renamed from: c  reason: collision with root package name */
    private u0 f750c;

    /* renamed from: d  reason: collision with root package name */
    private u0 f751d;

    /* renamed from: e  reason: collision with root package name */
    private u0 f752e;

    /* renamed from: f  reason: collision with root package name */
    private u0 f753f;

    /* renamed from: g  reason: collision with root package name */
    private u0 f754g;

    /* renamed from: h  reason: collision with root package name */
    private u0 f755h;

    /* renamed from: i  reason: collision with root package name */
    private final z f756i;

    /* renamed from: j  reason: collision with root package name */
    private int f757j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f758k = -1;

    /* renamed from: l  reason: collision with root package name */
    private Typeface f759l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f760m;

    /* access modifiers changed from: package-private */
    public class a extends f.c {
        final /* synthetic */ int a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f761b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WeakReference f762c;

        a(int i2, int i3, WeakReference weakReference) {
            this.a = i2;
            this.f761b = i3;
            this.f762c = weakReference;
        }

        @Override // c.h.d.d.f.c
        public void a(int i2) {
        }

        @Override // c.h.d.d.f.c
        public void a(Typeface typeface) {
            int i2;
            if (Build.VERSION.SDK_INT >= 28 && (i2 = this.a) != -1) {
                typeface = Typeface.create(typeface, i2, (this.f761b & 2) != 0);
            }
            x.this.a(this.f762c, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f764b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Typeface f765c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f766d;

        b(x xVar, TextView textView, Typeface typeface, int i2) {
            this.f764b = textView;
            this.f765c = typeface;
            this.f766d = i2;
        }

        public void run() {
            this.f764b.setTypeface(this.f765c, this.f766d);
        }
    }

    x(TextView textView) {
        this.a = textView;
        this.f756i = new z(this.a);
    }

    private static u0 a(Context context, i iVar, int i2) {
        ColorStateList b2 = iVar.b(context, i2);
        if (b2 == null) {
            return null;
        }
        u0 u0Var = new u0();
        u0Var.f721d = true;
        u0Var.a = b2;
        return u0Var;
    }

    private void a(Context context, w0 w0Var) {
        String d2;
        Typeface typeface;
        Typeface typeface2;
        this.f757j = w0Var.d(j.TextAppearance_android_textStyle, this.f757j);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f758k = w0Var.d(j.TextAppearance_android_textFontWeight, -1);
            if (this.f758k != -1) {
                this.f757j = (this.f757j & 2) | 0;
            }
        }
        if (w0Var.g(j.TextAppearance_android_fontFamily) || w0Var.g(j.TextAppearance_fontFamily)) {
            this.f759l = null;
            int i2 = w0Var.g(j.TextAppearance_fontFamily) ? j.TextAppearance_fontFamily : j.TextAppearance_android_fontFamily;
            int i3 = this.f758k;
            int i4 = this.f757j;
            if (!context.isRestricted()) {
                try {
                    Typeface a2 = w0Var.a(i2, this.f757j, new a(i3, i4, new WeakReference(this.a)));
                    if (a2 != null) {
                        if (Build.VERSION.SDK_INT >= 28 && this.f758k != -1) {
                            a2 = Typeface.create(Typeface.create(a2, 0), this.f758k, (this.f757j & 2) != 0);
                        }
                        this.f759l = a2;
                    }
                    this.f760m = this.f759l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f759l == null && (d2 = w0Var.d(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f758k == -1) {
                    typeface = Typeface.create(d2, this.f757j);
                } else {
                    Typeface create = Typeface.create(d2, 0);
                    int i5 = this.f758k;
                    if ((this.f757j & 2) != 0) {
                        z = true;
                    }
                    typeface = Typeface.create(create, i5, z);
                }
                this.f759l = typeface;
            }
        } else if (w0Var.g(j.TextAppearance_android_typeface)) {
            this.f760m = false;
            int d3 = w0Var.d(j.TextAppearance_android_typeface, 1);
            if (d3 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (d3 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (d3 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f759l = typeface2;
        }
    }

    private void a(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (Build.VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            TextView textView = this.a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            TextView textView3 = this.a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    private void a(Drawable drawable, u0 u0Var) {
        if (drawable != null && u0Var != null) {
            i.a(drawable, u0Var, this.a.getDrawableState());
        }
    }

    private void b(int i2, float f2) {
        this.f756i.a(i2, f2);
    }

    private void l() {
        u0 u0Var = this.f755h;
        this.f749b = u0Var;
        this.f750c = u0Var;
        this.f751d = u0Var;
        this.f752e = u0Var;
        this.f753f = u0Var;
        this.f754g = u0Var;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!(this.f749b == null && this.f750c == null && this.f751d == null && this.f752e == null)) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.f749b);
            a(compoundDrawables[1], this.f750c);
            a(compoundDrawables[2], this.f751d);
            a(compoundDrawables[3], this.f752e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f753f != null || this.f754g != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f753f);
            a(compoundDrawablesRelative[2], this.f754g);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        this.f756i.b(i2);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, float f2) {
        if (!androidx.core.widget.b.a && !j()) {
            b(i2, f2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, int i3, int i4, int i5) {
        this.f756i.a(i2, i3, i4, i5);
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, int i2) {
        String d2;
        ColorStateList a2;
        ColorStateList a3;
        ColorStateList a4;
        w0 a5 = w0.a(context, i2, j.TextAppearance);
        if (a5.g(j.TextAppearance_textAllCaps)) {
            a(a5.a(j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a5.g(j.TextAppearance_android_textColor) && (a4 = a5.a(j.TextAppearance_android_textColor)) != null) {
                this.a.setTextColor(a4);
            }
            if (a5.g(j.TextAppearance_android_textColorLink) && (a3 = a5.a(j.TextAppearance_android_textColorLink)) != null) {
                this.a.setLinkTextColor(a3);
            }
            if (a5.g(j.TextAppearance_android_textColorHint) && (a2 = a5.a(j.TextAppearance_android_textColorHint)) != null) {
                this.a.setHintTextColor(a2);
            }
        }
        if (a5.g(j.TextAppearance_android_textSize) && a5.c(j.TextAppearance_android_textSize, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        a(context, a5);
        if (Build.VERSION.SDK_INT >= 26 && a5.g(j.TextAppearance_fontVariationSettings) && (d2 = a5.d(j.TextAppearance_fontVariationSettings)) != null) {
            this.a.setFontVariationSettings(d2);
        }
        a5.b();
        Typeface typeface = this.f759l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.f757j);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (this.f755h == null) {
            this.f755h = new u0();
        }
        u0 u0Var = this.f755h;
        u0Var.a = colorStateList;
        u0Var.f721d = colorStateList != null;
        l();
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        if (this.f755h == null) {
            this.f755h = new u0();
        }
        u0 u0Var = this.f755h;
        u0Var.f719b = mode;
        u0Var.f720c = mode != null;
        l();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012b  */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.util.AttributeSet r19, int r20) {
        /*
        // Method dump skipped, instructions count: 838
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.x.a(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void a(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            c.h.l.m0.a.a(editorInfo, textView.getText());
        }
    }

    /* access modifiers changed from: package-private */
    public void a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f760m) {
            this.f759l = typeface;
            TextView textView = weakReference.get();
            if (textView == null) {
                return;
            }
            if (b0.H(textView)) {
                textView.post(new b(this, textView, typeface, this.f757j));
            } else {
                textView.setTypeface(typeface, this.f757j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        this.a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z, int i2, int i3, int i4, int i5) {
        if (!androidx.core.widget.b.a) {
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int[] iArr, int i2) {
        this.f756i.a(iArr, i2);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f756i.a();
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f756i.b();
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f756i.c();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f756i.d();
    }

    /* access modifiers changed from: package-private */
    public int[] f() {
        return this.f756i.e();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f756i.f();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList h() {
        u0 u0Var = this.f755h;
        if (u0Var != null) {
            return u0Var.a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode i() {
        u0 u0Var = this.f755h;
        if (u0Var != null) {
            return u0Var.f719b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.f756i.g();
    }

    /* access modifiers changed from: package-private */
    public void k() {
        a();
    }
}
