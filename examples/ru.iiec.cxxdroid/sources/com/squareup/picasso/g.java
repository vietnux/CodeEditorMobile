package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import j.l;
import java.io.InputStream;

/* access modifiers changed from: package-private */
public class g extends y {
    final Context a;

    g(Context context) {
        this.a = context;
    }

    @Override // com.squareup.picasso.y
    public y.a a(w wVar, int i2) {
        return new y.a(l.a(c(wVar)), t.e.DISK);
    }

    @Override // com.squareup.picasso.y
    public boolean a(w wVar) {
        return "content".equals(wVar.f6912d.getScheme());
    }

    /* access modifiers changed from: package-private */
    public InputStream c(w wVar) {
        return this.a.getContentResolver().openInputStream(wVar.f6912d);
    }
}
