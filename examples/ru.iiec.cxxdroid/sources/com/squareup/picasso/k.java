package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import c.l.a.a;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import j.l;

/* access modifiers changed from: package-private */
public class k extends g {
    k(Context context) {
        super(context);
    }

    static int a(Uri uri) {
        return new a(uri.getPath()).a("Orientation", 1);
    }

    @Override // com.squareup.picasso.g, com.squareup.picasso.y
    public y.a a(w wVar, int i2) {
        return new y.a(null, l.a(c(wVar)), t.e.DISK, a(wVar.f6912d));
    }

    @Override // com.squareup.picasso.g, com.squareup.picasso.y
    public boolean a(w wVar) {
        return "file".equals(wVar.f6912d.getScheme());
    }
}
