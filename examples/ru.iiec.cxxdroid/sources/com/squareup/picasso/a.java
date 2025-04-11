package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.t;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public abstract class a<T> {
    final t a;

    /* renamed from: b  reason: collision with root package name */
    final w f6765b;

    /* renamed from: c  reason: collision with root package name */
    final WeakReference<T> f6766c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f6767d;

    /* renamed from: e  reason: collision with root package name */
    final int f6768e;

    /* renamed from: f  reason: collision with root package name */
    final int f6769f;

    /* renamed from: g  reason: collision with root package name */
    final int f6770g;

    /* renamed from: h  reason: collision with root package name */
    final Drawable f6771h;

    /* renamed from: i  reason: collision with root package name */
    final String f6772i;

    /* renamed from: j  reason: collision with root package name */
    final Object f6773j;

    /* renamed from: k  reason: collision with root package name */
    boolean f6774k;

    /* renamed from: l  reason: collision with root package name */
    boolean f6775l;

    /* renamed from: com.squareup.picasso.a$a  reason: collision with other inner class name */
    static class C0096a<M> extends WeakReference<M> {
        final a a;

        C0096a(a aVar, M m2, ReferenceQueue<? super M> referenceQueue) {
            super(m2, referenceQueue);
            this.a = aVar;
        }
    }

    a(t tVar, T t, w wVar, int i2, int i3, int i4, Drawable drawable, String str, Object obj, boolean z) {
        this.a = tVar;
        this.f6765b = wVar;
        this.f6766c = t == null ? null : new C0096a(this, t, tVar.f6878k);
        this.f6768e = i2;
        this.f6769f = i3;
        this.f6767d = z;
        this.f6770g = i4;
        this.f6771h = drawable;
        this.f6772i = str;
        this.f6773j = obj == null ? this : obj;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f6775l = true;
    }

    /* access modifiers changed from: package-private */
    public abstract void a(Bitmap bitmap, t.e eVar);

    /* access modifiers changed from: package-private */
    public abstract void a(Exception exc);

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f6772i;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f6768e;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f6769f;
    }

    /* access modifiers changed from: package-private */
    public t e() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public t.f f() {
        return this.f6765b.t;
    }

    /* access modifiers changed from: package-private */
    public w g() {
        return this.f6765b;
    }

    /* access modifiers changed from: package-private */
    public Object h() {
        return this.f6773j;
    }

    /* access modifiers changed from: package-private */
    public T i() {
        WeakReference<T> weakReference = this.f6766c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.f6775l;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.f6774k;
    }
}
