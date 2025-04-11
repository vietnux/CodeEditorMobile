package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.t;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class w {
    private static final long u = TimeUnit.SECONDS.toNanos(5);
    int a;

    /* renamed from: b  reason: collision with root package name */
    long f6910b;

    /* renamed from: c  reason: collision with root package name */
    int f6911c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri f6912d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6913e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6914f;

    /* renamed from: g  reason: collision with root package name */
    public final List<c0> f6915g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6916h;

    /* renamed from: i  reason: collision with root package name */
    public final int f6917i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f6918j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6919k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f6920l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f6921m;
    public final float n;
    public final float o;
    public final float p;
    public final boolean q;
    public final boolean r;
    public final Bitmap.Config s;
    public final t.f t;

    public static final class b {
        private Uri a;

        /* renamed from: b  reason: collision with root package name */
        private int f6922b;

        /* renamed from: c  reason: collision with root package name */
        private String f6923c;

        /* renamed from: d  reason: collision with root package name */
        private int f6924d;

        /* renamed from: e  reason: collision with root package name */
        private int f6925e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f6926f;

        /* renamed from: g  reason: collision with root package name */
        private int f6927g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f6928h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f6929i;

        /* renamed from: j  reason: collision with root package name */
        private float f6930j;

        /* renamed from: k  reason: collision with root package name */
        private float f6931k;

        /* renamed from: l  reason: collision with root package name */
        private float f6932l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f6933m;
        private boolean n;
        private List<c0> o;
        private Bitmap.Config p;
        private t.f q;

        b(Uri uri, int i2, Bitmap.Config config) {
            this.a = uri;
            this.f6922b = i2;
            this.p = config;
        }

        public b a(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i3 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i3 == 0 && i2 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f6924d = i2;
                this.f6925e = i3;
                return this;
            }
        }

        public w a() {
            if (this.f6928h && this.f6926f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.f6926f && this.f6924d == 0 && this.f6925e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (this.f6928h && this.f6924d == 0 && this.f6925e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.q == null) {
                    this.q = t.f.NORMAL;
                }
                return new w(this.a, this.f6922b, this.f6923c, this.o, this.f6924d, this.f6925e, this.f6926f, this.f6928h, this.f6927g, this.f6929i, this.f6930j, this.f6931k, this.f6932l, this.f6933m, this.n, this.p, this.q);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return (this.a == null && this.f6922b == 0) ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return (this.f6924d == 0 && this.f6925e == 0) ? false : true;
        }
    }

    private w(Uri uri, int i2, String str, List<c0> list, int i3, int i4, boolean z, boolean z2, int i5, boolean z3, float f2, float f3, float f4, boolean z4, boolean z5, Bitmap.Config config, t.f fVar) {
        this.f6912d = uri;
        this.f6913e = i2;
        this.f6914f = str;
        this.f6915g = list == null ? null : Collections.unmodifiableList(list);
        this.f6916h = i3;
        this.f6917i = i4;
        this.f6918j = z;
        this.f6920l = z2;
        this.f6919k = i5;
        this.f6921m = z3;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = z4;
        this.r = z5;
        this.s = config;
        this.t = fVar;
    }

    /* access modifiers changed from: package-private */
    public String a() {
        Uri uri = this.f6912d;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.f6913e);
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return this.f6915g != null;
    }

    public boolean c() {
        return (this.f6916h == 0 && this.f6917i == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        StringBuilder sb;
        long nanoTime = System.nanoTime() - this.f6910b;
        if (nanoTime > u) {
            sb.append(g());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
            sb.append('s');
        } else {
            sb = new StringBuilder();
            sb.append(g());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toMillis(nanoTime));
            sb.append("ms");
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return c() || this.n != 0.0f;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return e() || b();
    }

    /* access modifiers changed from: package-private */
    public String g() {
        return "[R" + this.a + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i2 = this.f6913e;
        if (i2 > 0) {
            sb.append(i2);
        } else {
            sb.append(this.f6912d);
        }
        List<c0> list = this.f6915g;
        if (list != null && !list.isEmpty()) {
            for (c0 c0Var : this.f6915g) {
                sb.append(' ');
                sb.append(c0Var.a());
            }
        }
        if (this.f6914f != null) {
            sb.append(" stableKey(");
            sb.append(this.f6914f);
            sb.append(')');
        }
        if (this.f6916h > 0) {
            sb.append(" resize(");
            sb.append(this.f6916h);
            sb.append(',');
            sb.append(this.f6917i);
            sb.append(')');
        }
        if (this.f6918j) {
            sb.append(" centerCrop");
        }
        if (this.f6920l) {
            sb.append(" centerInside");
        }
        if (this.n != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.n);
            if (this.q) {
                sb.append(" @ ");
                sb.append(this.o);
                sb.append(',');
                sb.append(this.p);
            }
            sb.append(')');
        }
        if (this.r) {
            sb.append(" purgeable");
        }
        if (this.s != null) {
            sb.append(' ');
            sb.append(this.s);
        }
        sb.append('}');
        return sb.toString();
    }
}
