package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

public final class m implements d {
    final LruCache<String, b> a;

    class a extends LruCache<String, b> {
        a(m mVar, int i2) {
            super(i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int sizeOf(String str, b bVar) {
            return bVar.f6841b;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {
        final Bitmap a;

        /* renamed from: b  reason: collision with root package name */
        final int f6841b;

        b(Bitmap bitmap, int i2) {
            this.a = bitmap;
            this.f6841b = i2;
        }
    }

    public m(int i2) {
        this.a = new a(this, i2);
    }

    public m(Context context) {
        this(d0.a(context));
    }

    @Override // com.squareup.picasso.d
    public int a() {
        return this.a.maxSize();
    }

    @Override // com.squareup.picasso.d
    public Bitmap a(String str) {
        b bVar = this.a.get(str);
        if (bVar != null) {
            return bVar.a;
        }
        return null;
    }

    @Override // com.squareup.picasso.d
    public void a(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int a2 = d0.a(bitmap);
        if (a2 > a()) {
            this.a.remove(str);
        } else {
            this.a.put(str, new b(bitmap, a2));
        }
    }

    @Override // com.squareup.picasso.d
    public int size() {
        return this.a.size();
    }
}
