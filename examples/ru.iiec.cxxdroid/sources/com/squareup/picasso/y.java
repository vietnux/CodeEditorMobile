package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.t;
import j.s;

public abstract class y {

    public static final class a {
        private final t.e a;

        /* renamed from: b  reason: collision with root package name */
        private final Bitmap f6946b;

        /* renamed from: c  reason: collision with root package name */
        private final s f6947c;

        /* renamed from: d  reason: collision with root package name */
        private final int f6948d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(Bitmap bitmap, t.e eVar) {
            this(bitmap, null, eVar, 0);
            d0.a(bitmap, "bitmap == null");
        }

        a(Bitmap bitmap, s sVar, t.e eVar, int i2) {
            if ((bitmap != null) != (sVar == null ? false : true)) {
                this.f6946b = bitmap;
                this.f6947c = sVar;
                d0.a(eVar, "loadedFrom == null");
                this.a = eVar;
                this.f6948d = i2;
                return;
            }
            throw new AssertionError();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(s sVar, t.e eVar) {
            this(null, sVar, eVar, 0);
            d0.a(sVar, "source == null");
        }

        public Bitmap a() {
            return this.f6946b;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f6948d;
        }

        public t.e c() {
            return this.a;
        }

        public s d() {
            return this.f6947c;
        }
    }

    static void a(int i2, int i3, int i4, int i5, BitmapFactory.Options options, w wVar) {
        int i6;
        double d2;
        if (i5 > i3 || i4 > i2) {
            if (i3 == 0) {
                d2 = (double) (((float) i4) / ((float) i2));
            } else if (i2 == 0) {
                d2 = (double) (((float) i5) / ((float) i3));
            } else {
                int floor = (int) Math.floor((double) (((float) i5) / ((float) i3)));
                int floor2 = (int) Math.floor((double) (((float) i4) / ((float) i2)));
                i6 = wVar.f6920l ? Math.max(floor, floor2) : Math.min(floor, floor2);
            }
            i6 = (int) Math.floor(d2);
        } else {
            i6 = 1;
        }
        options.inSampleSize = i6;
        options.inJustDecodeBounds = false;
    }

    static void a(int i2, int i3, BitmapFactory.Options options, w wVar) {
        a(i2, i3, options.outWidth, options.outHeight, options, wVar);
    }

    static boolean a(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    static BitmapFactory.Options b(w wVar) {
        boolean c2 = wVar.c();
        boolean z = wVar.s != null;
        BitmapFactory.Options options = null;
        if (c2 || z || wVar.r) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = c2;
            boolean z2 = wVar.r;
            options.inInputShareable = z2;
            options.inPurgeable = z2;
            if (z) {
                options.inPreferredConfig = wVar.s;
            }
        }
        return options;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return 0;
    }

    public abstract a a(w wVar, int i2);

    public abstract boolean a(w wVar);

    /* access modifiers changed from: package-private */
    public boolean a(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return false;
    }
}
