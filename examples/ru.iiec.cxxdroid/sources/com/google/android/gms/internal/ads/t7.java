package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

final class t7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bitmap f5591b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ q7 f5592c;

    t7(q7 q7Var, Bitmap bitmap) {
        this.f5592c = q7Var;
        this.f5591b = bitmap;
    }

    public final void run() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f5591b.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        synchronized (this.f5592c.f5315j) {
            this.f5592c.a.f5001k = new tv();
            this.f5592c.a.f5001k.f5656e = byteArrayOutputStream.toByteArray();
            this.f5592c.a.f5001k.f5655d = "image/png";
            this.f5592c.a.f5001k.f5654c = 1;
        }
    }
}
