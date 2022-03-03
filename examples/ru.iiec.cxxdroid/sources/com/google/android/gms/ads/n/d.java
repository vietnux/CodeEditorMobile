package com.google.android.gms.ads.n;

import com.google.android.gms.ads.l;
import com.google.android.gms.internal.ads.k2;

@k2
public final class d {
    private final boolean a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3424b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3425c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3426d;

    /* renamed from: e  reason: collision with root package name */
    private final l f3427e;

    public static final class a {
        private boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f3428b = -1;

        /* renamed from: c  reason: collision with root package name */
        private boolean f3429c = false;

        /* renamed from: d  reason: collision with root package name */
        private l f3430d;

        /* renamed from: e  reason: collision with root package name */
        private int f3431e = 1;

        public final a a(int i2) {
            this.f3431e = i2;
            return this;
        }

        public final a a(l lVar) {
            this.f3430d = lVar;
            return this;
        }

        public final a a(boolean z) {
            this.f3429c = z;
            return this;
        }

        public final d a() {
            return new d(this);
        }

        public final a b(int i2) {
            this.f3428b = i2;
            return this;
        }

        public final a b(boolean z) {
            this.a = z;
            return this;
        }
    }

    private d(a aVar) {
        this.a = aVar.a;
        this.f3424b = aVar.f3428b;
        this.f3425c = aVar.f3429c;
        this.f3426d = aVar.f3431e;
        this.f3427e = aVar.f3430d;
    }

    public final int a() {
        return this.f3426d;
    }

    public final int b() {
        return this.f3424b;
    }

    public final l c() {
        return this.f3427e;
    }

    public final boolean d() {
        return this.f3425c;
    }

    public final boolean e() {
        return this.a;
    }
}
