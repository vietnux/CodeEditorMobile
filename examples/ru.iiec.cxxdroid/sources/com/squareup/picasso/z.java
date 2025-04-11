package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.t;
import com.squareup.picasso.y;

/* access modifiers changed from: package-private */
public class z extends y {
    private final Context a;

    z(Context context) {
        this.a = context;
    }

    private static Bitmap a(Resources resources, int i2, w wVar) {
        BitmapFactory.Options b2 = y.b(wVar);
        if (y.a(b2)) {
            BitmapFactory.decodeResource(resources, i2, b2);
            y.a(wVar.f6916h, wVar.f6917i, b2, wVar);
        }
        return BitmapFactory.decodeResource(resources, i2, b2);
    }

    @Override // com.squareup.picasso.y
    public y.a a(w wVar, int i2) {
        Resources a2 = d0.a(this.a, wVar);
        return new y.a(a(a2, d0.a(a2, wVar), wVar), t.e.DISK);
    }

    @Override // com.squareup.picasso.y
    public boolean a(w wVar) {
        if (wVar.f6913e != 0) {
            return true;
        }
        return "android.resource".equals(wVar.f6912d.getScheme());
    }
}
