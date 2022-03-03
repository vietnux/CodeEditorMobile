package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import j.l;

/* access modifiers changed from: package-private */
public class b extends y {

    /* renamed from: d  reason: collision with root package name */
    private static final int f6789d = 22;
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f6790b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private AssetManager f6791c;

    b(Context context) {
        this.a = context;
    }

    static String c(w wVar) {
        return wVar.f6912d.toString().substring(f6789d);
    }

    @Override // com.squareup.picasso.y
    public y.a a(w wVar, int i2) {
        if (this.f6791c == null) {
            synchronized (this.f6790b) {
                if (this.f6791c == null) {
                    this.f6791c = this.a.getAssets();
                }
            }
        }
        return new y.a(l.a(this.f6791c.open(c(wVar))), t.e.DISK);
    }

    @Override // com.squareup.picasso.y
    public boolean a(w wVar) {
        Uri uri = wVar.f6912d;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
