package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.t;

/* access modifiers changed from: package-private */
public class l extends a<ImageView> {

    /* renamed from: m  reason: collision with root package name */
    e f6840m;

    l(t tVar, ImageView imageView, w wVar, int i2, int i3, int i4, Drawable drawable, String str, Object obj, e eVar, boolean z) {
        super(tVar, imageView, wVar, i2, i3, i4, drawable, str, obj, z);
        this.f6840m = eVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.picasso.a
    public void a() {
        super.a();
        if (this.f6840m != null) {
            this.f6840m = null;
        }
    }

    @Override // com.squareup.picasso.a
    public void a(Bitmap bitmap, t.e eVar) {
        if (bitmap != null) {
            T t = this.f6766c.get();
            if (t != null) {
                t tVar = this.a;
                u.a(t, tVar.f6872e, bitmap, eVar, this.f6767d, tVar.f6880m);
                e eVar2 = this.f6840m;
                if (eVar2 != null) {
                    eVar2.a();
                    return;
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
    }

    @Override // com.squareup.picasso.a
    public void a(Exception exc) {
        T t = this.f6766c.get();
        if (t != null) {
            Drawable drawable = t.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
            int i2 = this.f6770g;
            if (i2 != 0) {
                t.setImageResource(i2);
            } else {
                Drawable drawable2 = this.f6771h;
                if (drawable2 != null) {
                    t.setImageDrawable(drawable2);
                }
            }
            e eVar = this.f6840m;
            if (eVar != null) {
                eVar.a(exc);
            }
        }
    }
}
