package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.util.n;
import java.io.InputStream;

/* access modifiers changed from: package-private */
public final class d1 implements kb<o90> {
    private final /* synthetic */ boolean a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ double f4073b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f4074c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f4075d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ w0 f4076e;

    d1(w0 w0Var, boolean z, double d2, boolean z2, String str) {
        this.f4076e = w0Var;
        this.a = z;
        this.f4073b = d2;
        this.f4074c = z2;
        this.f4075d = str;
    }

    /* access modifiers changed from: private */
    @TargetApi(19)
    /* renamed from: b */
    public final o90 a(InputStream inputStream) {
        Bitmap bitmap;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (this.f4073b * 160.0d);
        if (!this.f4074c) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            bitmap = BitmapFactory.decodeStream(inputStream, null, options);
        } catch (Exception e2) {
            qc.b("Error grabbing image.", e2);
            bitmap = null;
        }
        if (bitmap == null) {
            this.f4076e.a(2, this.a);
            return null;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (n.g() && l9.a()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int allocationByteCount = bitmap.getAllocationByteCount();
            long j2 = uptimeMillis2 - uptimeMillis;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j2);
            sb.append(" on ui thread: ");
            sb.append(z);
            l9.e(sb.toString());
        }
        return new o90(new BitmapDrawable(Resources.getSystem(), bitmap), Uri.parse(this.f4075d), this.f4073b);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.kb
    public final /* synthetic */ o90 a() {
        this.f4076e.a(2, this.a);
        return null;
    }
}
