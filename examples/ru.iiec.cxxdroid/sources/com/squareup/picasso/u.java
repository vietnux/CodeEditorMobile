package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.t;

/* access modifiers changed from: package-private */
public final class u extends BitmapDrawable {

    /* renamed from: h  reason: collision with root package name */
    private static final Paint f6902h = new Paint();
    private final boolean a;

    /* renamed from: b  reason: collision with root package name */
    private final float f6903b;

    /* renamed from: c  reason: collision with root package name */
    private final t.e f6904c;

    /* renamed from: d  reason: collision with root package name */
    Drawable f6905d;

    /* renamed from: e  reason: collision with root package name */
    long f6906e;

    /* renamed from: f  reason: collision with root package name */
    boolean f6907f;

    /* renamed from: g  reason: collision with root package name */
    int f6908g = 255;

    u(Context context, Bitmap bitmap, Drawable drawable, t.e eVar, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.a = z2;
        this.f6903b = context.getResources().getDisplayMetrics().density;
        this.f6904c = eVar;
        if (eVar != t.e.MEMORY && !z) {
            this.f6905d = drawable;
            this.f6907f = true;
            this.f6906e = SystemClock.uptimeMillis();
        }
    }

    private static Path a(int i2, int i3, int i4) {
        Path path = new Path();
        float f2 = (float) i2;
        float f3 = (float) i3;
        path.moveTo(f2, f3);
        path.lineTo((float) (i2 + i4), f3);
        path.lineTo(f2, (float) (i3 + i4));
        return path;
    }

    private void a(Canvas canvas) {
        f6902h.setColor(-1);
        canvas.drawPath(a(0, 0, (int) (this.f6903b * 16.0f)), f6902h);
        f6902h.setColor(this.f6904c.f6897b);
        canvas.drawPath(a(0, 0, (int) (this.f6903b * 15.0f)), f6902h);
    }

    static void a(ImageView imageView, Context context, Bitmap bitmap, t.e eVar, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new u(context, bitmap, drawable, eVar, z, z2));
    }

    static void a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            boolean r0 = r4.f6907f
            if (r0 != 0) goto L_0x0008
        L_0x0004:
            super.draw(r5)
            goto L_0x0038
        L_0x0008:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r4.f6906e
            long r0 = r0 - r2
            float r0 = (float) r0
            r1 = 1128792064(0x43480000, float:200.0)
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0020
            r0 = 0
            r4.f6907f = r0
            r0 = 0
            r4.f6905d = r0
            goto L_0x0004
        L_0x0020:
            android.graphics.drawable.Drawable r1 = r4.f6905d
            if (r1 == 0) goto L_0x0027
            r1.draw(r5)
        L_0x0027:
            int r1 = r4.f6908g
            float r1 = (float) r1
            float r1 = r1 * r0
            int r0 = (int) r1
            super.setAlpha(r0)
            super.draw(r5)
            int r0 = r4.f6908g
            super.setAlpha(r0)
        L_0x0038:
            boolean r0 = r4.a
            if (r0 == 0) goto L_0x003f
            r4.a(r5)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.u.draw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6905d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public void setAlpha(int i2) {
        this.f6908g = i2;
        Drawable drawable = this.f6905d;
        if (drawable != null) {
            drawable.setAlpha(i2);
        }
        super.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6905d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
