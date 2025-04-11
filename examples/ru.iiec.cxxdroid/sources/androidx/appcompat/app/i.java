package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import c.a.o.b;
import c.h.l.h;

public class i extends Dialog implements f {

    /* renamed from: b  reason: collision with root package name */
    private g f213b;

    /* renamed from: c  reason: collision with root package name */
    private final h.a f214c = new a();

    class a implements h.a {
        a() {
        }

        @Override // c.h.l.h.a
        public boolean a(KeyEvent keyEvent) {
            return i.this.a(keyEvent);
        }
    }

    public i(Context context, int i2) {
        super(context, a(context, i2));
        g a2 = a();
        a2.d(a(context, i2));
        a2.a((Bundle) null);
    }

    private static int a(Context context, int i2) {
        if (i2 != 0) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(c.a.a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public g a() {
        if (this.f213b == null) {
            this.f213b = g.a(this, this);
        }
        return this.f213b;
    }

    @Override // androidx.appcompat.app.f
    public b a(b.a aVar) {
        return null;
    }

    @Override // androidx.appcompat.app.f
    public void a(b bVar) {
    }

    public boolean a(int i2) {
        return a().b(i2);
    }

    /* access modifiers changed from: package-private */
    public boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().a(view, layoutParams);
    }

    @Override // androidx.appcompat.app.f
    public void b(b bVar) {
    }

    public void dismiss() {
        super.dismiss();
        a().h();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return h.a(this.f214c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i2) {
        return (T) a().a(i2);
    }

    public void invalidateOptionsMenu() {
        a().g();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        a().f();
        super.onCreate(bundle);
        a().a(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        a().k();
    }

    @Override // android.app.Dialog
    public void setContentView(int i2) {
        a().c(i2);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().b(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i2) {
        super.setTitle(i2);
        a().a(getContext().getString(i2));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().a(charSequence);
    }
}
