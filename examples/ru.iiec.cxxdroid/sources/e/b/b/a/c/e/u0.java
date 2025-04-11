package e.b.b.a.c.e;

import com.google.firebase.iid.FirebaseInstanceId;
import java.math.BigInteger;
import java.util.Locale;

public final class u0 extends z2 {

    /* renamed from: c  reason: collision with root package name */
    private String f7600c;

    /* renamed from: d  reason: collision with root package name */
    private String f7601d;

    /* renamed from: e  reason: collision with root package name */
    private int f7602e;

    /* renamed from: f  reason: collision with root package name */
    private String f7603f;

    /* renamed from: g  reason: collision with root package name */
    private long f7604g;

    /* renamed from: h  reason: collision with root package name */
    private int f7605h;

    /* renamed from: i  reason: collision with root package name */
    private String f7606i;

    u0(d2 d2Var) {
        super(d2Var);
    }

    private final String D() {
        d();
        if (r().h(this.f7600c) && !this.a.s()) {
            return null;
        }
        try {
            return FirebaseInstanceId.i().a();
        } catch (IllegalStateException unused) {
            a().B().a("Failed to retrieve Firebase Instance Id");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final String A() {
        byte[] bArr = new byte[16];
        o().z().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* access modifiers changed from: package-private */
    public final int B() {
        t();
        return this.f7602e;
    }

    /* access modifiers changed from: package-private */
    public final int C() {
        t();
        return this.f7605h;
    }

    /* access modifiers changed from: package-private */
    public final s a(String str) {
        d();
        String z = z();
        String y = y();
        t();
        String str2 = this.f7601d;
        long B = (long) B();
        t();
        String str3 = this.f7603f;
        t();
        d();
        if (this.f7604g == 0) {
            this.f7604g = this.a.h().a(getContext(), getContext().getPackageName());
        }
        long j2 = this.f7604g;
        boolean s = this.a.s();
        boolean z2 = true;
        boolean z3 = !q().x;
        String D = D();
        t();
        long F = this.a.F();
        int C = C();
        Boolean b2 = r().b("google_analytics_adid_collection_enabled");
        boolean booleanValue = Boolean.valueOf(b2 == null || b2.booleanValue()).booleanValue();
        Boolean b3 = r().b("google_analytics_ssaid_collection_enabled");
        if (b3 != null && !b3.booleanValue()) {
            z2 = false;
        }
        return new s(z, y, str2, B, str3, 12451, j2, str, s, z3, D, 0, F, C, booleanValue, Boolean.valueOf(z2).booleanValue(), q().D());
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.z2
    public final boolean u() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0139 A[Catch:{ IllegalStateException -> 0x0150 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013e A[Catch:{ IllegalStateException -> 0x0150 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0173  */
    @Override // e.b.b.a.c.e.z2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v() {
        /*
        // Method dump skipped, instructions count: 374
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.u0.v():void");
    }

    /* access modifiers changed from: package-private */
    public final String y() {
        t();
        return this.f7606i;
    }

    /* access modifiers changed from: package-private */
    public final String z() {
        t();
        return this.f7600c;
    }
}
