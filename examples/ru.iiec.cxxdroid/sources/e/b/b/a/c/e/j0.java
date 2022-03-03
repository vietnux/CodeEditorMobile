package e.b.b.a.c.e;

import com.google.android.gms.common.internal.y;

final class j0 {
    final String a;

    /* renamed from: b  reason: collision with root package name */
    final String f7338b;

    /* renamed from: c  reason: collision with root package name */
    final long f7339c;

    /* renamed from: d  reason: collision with root package name */
    final long f7340d;

    /* renamed from: e  reason: collision with root package name */
    final long f7341e;

    /* renamed from: f  reason: collision with root package name */
    final long f7342f;

    /* renamed from: g  reason: collision with root package name */
    final Long f7343g;

    /* renamed from: h  reason: collision with root package name */
    final Long f7344h;

    /* renamed from: i  reason: collision with root package name */
    final Boolean f7345i;

    j0(String str, String str2, long j2, long j3, long j4, long j5, Long l2, Long l3, Boolean bool) {
        y.b(str);
        y.b(str2);
        boolean z = true;
        y.a(j2 >= 0);
        y.a(j3 >= 0);
        y.a(j5 < 0 ? false : z);
        this.a = str;
        this.f7338b = str2;
        this.f7339c = j2;
        this.f7340d = j3;
        this.f7341e = j4;
        this.f7342f = j5;
        this.f7343g = l2;
        this.f7344h = l3;
        this.f7345i = bool;
    }

    /* access modifiers changed from: package-private */
    public final j0 a() {
        return new j0(this.a, this.f7338b, this.f7339c + 1, 1 + this.f7340d, this.f7341e, this.f7342f, this.f7343g, this.f7344h, this.f7345i);
    }

    /* access modifiers changed from: package-private */
    public final j0 a(long j2) {
        return new j0(this.a, this.f7338b, this.f7339c, this.f7340d, j2, this.f7342f, this.f7343g, this.f7344h, this.f7345i);
    }

    /* access modifiers changed from: package-private */
    public final j0 a(Long l2, Long l3, Boolean bool) {
        return new j0(this.a, this.f7338b, this.f7339c, this.f7340d, this.f7341e, this.f7342f, l2, l3, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* access modifiers changed from: package-private */
    public final j0 b(long j2) {
        return new j0(this.a, this.f7338b, this.f7339c, this.f7340d, this.f7341e, j2, this.f7343g, this.f7344h, this.f7345i);
    }
}
