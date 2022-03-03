package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.TypedValue;
import android.widget.ImageView;
import com.squareup.picasso.t;
import com.squareup.picasso.w;
import java.util.concurrent.atomic.AtomicInteger;

public class x {

    /* renamed from: m  reason: collision with root package name */
    private static final AtomicInteger f6934m = new AtomicInteger();
    private final t a;

    /* renamed from: b  reason: collision with root package name */
    private final w.b f6935b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6936c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6937d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6938e = true;

    /* renamed from: f  reason: collision with root package name */
    private int f6939f;

    /* renamed from: g  reason: collision with root package name */
    private int f6940g;

    /* renamed from: h  reason: collision with root package name */
    private int f6941h;

    /* renamed from: i  reason: collision with root package name */
    private int f6942i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f6943j;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f6944k;

    /* renamed from: l  reason: collision with root package name */
    private Object f6945l;

    x(t tVar, Uri uri, int i2) {
        if (!tVar.o) {
            this.a = tVar;
            this.f6935b = new w.b(uri, i2, tVar.f6879l);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    private w a(long j2) {
        int andIncrement = f6934m.getAndIncrement();
        w a2 = this.f6935b.a();
        a2.a = andIncrement;
        a2.f6910b = j2;
        boolean z = this.a.n;
        if (z) {
            d0.a("Main", "created", a2.g(), a2.toString());
        }
        this.a.a(a2);
        if (a2 != a2) {
            a2.a = andIncrement;
            a2.f6910b = j2;
            if (z) {
                String d2 = a2.d();
                d0.a("Main", "changed", d2, "into " + a2);
            }
        }
        return a2;
    }

    private Drawable c() {
        int i2 = this.f6939f;
        if (i2 == 0) {
            return this.f6943j;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            return this.a.f6872e.getDrawable(i2);
        }
        if (i3 >= 16) {
            return this.a.f6872e.getResources().getDrawable(this.f6939f);
        }
        TypedValue typedValue = new TypedValue();
        this.a.f6872e.getResources().getValue(this.f6939f, typedValue, true);
        return this.a.f6872e.getResources().getDrawable(typedValue.resourceId);
    }

    /* access modifiers changed from: package-private */
    public x a() {
        this.f6945l = null;
        return this;
    }

    public x a(int i2, int i3) {
        this.f6935b.a(i2, i3);
        return this;
    }

    public void a(ImageView imageView) {
        a(imageView, (e) null);
    }

    public void a(ImageView imageView, e eVar) {
        Bitmap b2;
        long nanoTime = System.nanoTime();
        d0.a();
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f6935b.b()) {
            this.a.a(imageView);
            if (this.f6938e) {
                u.a(imageView, c());
            }
        } else {
            if (this.f6937d) {
                if (!this.f6935b.c()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f6938e) {
                            u.a(imageView, c());
                        }
                        this.a.a(imageView, new h(this, imageView, eVar));
                        return;
                    }
                    this.f6935b.a(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            w a2 = a(nanoTime);
            String a3 = d0.a(a2);
            if (!p.a(this.f6941h) || (b2 = this.a.b(a3)) == null) {
                if (this.f6938e) {
                    u.a(imageView, c());
                }
                this.a.a((a) new l(this.a, imageView, a2, this.f6941h, this.f6942i, this.f6940g, this.f6944k, a3, this.f6945l, eVar, this.f6936c));
                return;
            }
            this.a.a(imageView);
            t tVar = this.a;
            u.a(imageView, tVar.f6872e, b2, t.e.MEMORY, this.f6936c, tVar.f6880m);
            if (this.a.n) {
                String g2 = a2.g();
                d0.a("Main", "completed", g2, "from " + t.e.MEMORY);
            }
            if (eVar != null) {
                eVar.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public x b() {
        this.f6937d = false;
        return this;
    }
}
