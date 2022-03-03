package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import c.a.j;
import c.a.o.b;

public abstract class a {

    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    public static class C0006a extends ViewGroup.MarginLayoutParams {
        public int a;

        public C0006a(int i2, int i3) {
            super(i2, i3);
            this.a = 0;
            this.a = 8388627;
        }

        public C0006a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionBarLayout);
            this.a = obtainStyledAttributes.getInt(j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0006a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }

        public C0006a(C0006a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.a = 0;
            this.a = aVar.a;
        }
    }

    public interface b {
        void a(boolean z);
    }

    @Deprecated
    public interface c {
    }

    @Deprecated
    public static abstract class d {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public c.a.o.b a(b.a aVar) {
        return null;
    }

    public abstract void a(int i2);

    public abstract void a(int i2, int i3);

    public void a(Configuration configuration) {
    }

    public abstract void a(Drawable drawable);

    public abstract void a(CharSequence charSequence);

    public abstract boolean a(int i2, KeyEvent keyEvent);

    public boolean a(KeyEvent keyEvent) {
        return false;
    }

    public abstract void b(Drawable drawable);

    public abstract void b(CharSequence charSequence);

    public abstract void b(boolean z);

    public abstract void c(CharSequence charSequence);

    public abstract void c(boolean z);

    public abstract void d(boolean z);

    public abstract void e(boolean z);

    public boolean e() {
        return false;
    }

    public abstract void f(boolean z);

    public abstract boolean f();

    public abstract int g();

    public abstract Context h();

    public abstract void i();

    public boolean j() {
        return false;
    }

    public abstract boolean k();

    /* access modifiers changed from: package-private */
    public void l() {
    }

    public boolean m() {
        return false;
    }

    public abstract void n();
}
