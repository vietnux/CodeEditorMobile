package c.h.e;

import android.graphics.Insets;
import android.graphics.Rect;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f2294e = new b(0, 0, 0, 0);
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2295b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2296c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2297d;

    private b(int i2, int i3, int i4, int i5) {
        this.a = i2;
        this.f2295b = i3;
        this.f2296c = i4;
        this.f2297d = i5;
    }

    public static b a(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f2294e : new b(i2, i3, i4, i5);
    }

    public static b a(Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static b a(Rect rect) {
        return a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b a(b bVar, b bVar2) {
        return a(Math.max(bVar.a, bVar2.a), Math.max(bVar.f2295b, bVar2.f2295b), Math.max(bVar.f2296c, bVar2.f2296c), Math.max(bVar.f2297d, bVar2.f2297d));
    }

    public Insets a() {
        return Insets.of(this.a, this.f2295b, this.f2296c, this.f2297d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2297d == bVar.f2297d && this.a == bVar.a && this.f2296c == bVar.f2296c && this.f2295b == bVar.f2295b;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.f2295b) * 31) + this.f2296c) * 31) + this.f2297d;
    }

    public String toString() {
        return "Insets{left=" + this.a + ", top=" + this.f2295b + ", right=" + this.f2296c + ", bottom=" + this.f2297d + '}';
    }
}
