package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

public class d extends i implements DialogInterface {

    /* renamed from: d  reason: collision with root package name */
    final AlertController f175d = new AlertController(getContext(), this, getWindow());

    public static class a {
        private final AlertController.f a;

        /* renamed from: b  reason: collision with root package name */
        private final int f176b;

        public a(Context context) {
            this(context, d.a(context, 0));
        }

        public a(Context context, int i2) {
            this.a = new AlertController.f(new ContextThemeWrapper(context, d.a(context, i2)));
            this.f176b = i2;
        }

        public a a(int i2) {
            AlertController.f fVar = this.a;
            fVar.f143h = fVar.a.getText(i2);
            return this;
        }

        public a a(int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.f147l = fVar.a.getText(i2);
            this.a.n = onClickListener;
            return this;
        }

        public a a(DialogInterface.OnKeyListener onKeyListener) {
            this.a.u = onKeyListener;
            return this;
        }

        public a a(Drawable drawable) {
            this.a.f139d = drawable;
            return this;
        }

        public a a(View view) {
            this.a.f142g = view;
            return this;
        }

        public a a(ListAdapter listAdapter, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            fVar.I = i2;
            fVar.H = true;
            return this;
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public a a(CharSequence charSequence) {
            this.a.f143h = charSequence;
            return this;
        }

        public a a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.f147l = charSequence;
            fVar.n = onClickListener;
            return this;
        }

        public a a(boolean z) {
            this.a.r = z;
            return this;
        }

        public a a(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = charSequenceArr;
            fVar.x = onClickListener;
            return this;
        }

        public d a() {
            d dVar = new d(this.a.a, this.f176b);
            this.a.a(dVar.f175d);
            dVar.setCancelable(this.a.r);
            if (this.a.r) {
                dVar.setCanceledOnTouchOutside(true);
            }
            dVar.setOnCancelListener(this.a.s);
            dVar.setOnDismissListener(this.a.t);
            DialogInterface.OnKeyListener onKeyListener = this.a.u;
            if (onKeyListener != null) {
                dVar.setOnKeyListener(onKeyListener);
            }
            return dVar;
        }

        public Context b() {
            return this.a.a;
        }

        public a b(int i2) {
            AlertController.f fVar = this.a;
            fVar.f141f = fVar.a.getText(i2);
            return this;
        }

        public a b(int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.f144i = fVar.a.getText(i2);
            this.a.f146k = onClickListener;
            return this;
        }

        public a b(View view) {
            AlertController.f fVar = this.a;
            fVar.z = view;
            fVar.y = 0;
            fVar.E = false;
            return this;
        }

        public a b(CharSequence charSequence) {
            this.a.f141f = charSequence;
            return this;
        }

        public a b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.o = charSequence;
            fVar.q = onClickListener;
            return this;
        }

        public a c(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.f144i = charSequence;
            fVar.f146k = onClickListener;
            return this;
        }

        public d c() {
            d a2 = a();
            a2.show();
            return a2;
        }
    }

    protected d(Context context, int i2) {
        super(context, a(context, i2));
    }

    static int a(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(c.a.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void a(View view, int i2, int i3, int i4, int i5) {
        this.f175d.a(view, i2, i3, i4, i5);
    }

    public ListView b() {
        return this.f175d.a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.i
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f175d.b();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (this.f175d.a(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (this.f175d.b(i2, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // android.app.Dialog, androidx.appcompat.app.i
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f175d.b(charSequence);
    }
}
