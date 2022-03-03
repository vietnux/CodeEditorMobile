package com.google.android.gms.internal.ads;

public class as {
    private volatile ss a;

    /* renamed from: b  reason: collision with root package name */
    private volatile fq f3824b;

    static {
        zq.b();
    }

    private final ss b(ss ssVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = ssVar;
                        this.f3824b = fq.f4347c;
                    } catch (sr unused) {
                        this.a = ssVar;
                        this.f3824b = fq.f4347c;
                    }
                }
            }
        }
        return this.a;
    }

    public final fq a() {
        if (this.f3824b != null) {
            return this.f3824b;
        }
        synchronized (this) {
            if (this.f3824b != null) {
                return this.f3824b;
            }
            this.f3824b = this.a == null ? fq.f4347c : this.a.e();
            return this.f3824b;
        }
    }

    public final ss a(ss ssVar) {
        ss ssVar2 = this.a;
        this.f3824b = null;
        this.a = ssVar;
        return ssVar2;
    }

    public final int b() {
        if (this.f3824b != null) {
            return this.f3824b.size();
        }
        if (this.a != null) {
            return this.a.b();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as)) {
            return false;
        }
        as asVar = (as) obj;
        ss ssVar = this.a;
        ss ssVar2 = asVar.a;
        return (ssVar == null && ssVar2 == null) ? a().equals(asVar.a()) : (ssVar == null || ssVar2 == null) ? ssVar != null ? ssVar.equals(asVar.b(ssVar.a())) : b(ssVar2.a()).equals(ssVar2) : ssVar.equals(ssVar2);
    }

    public int hashCode() {
        return 1;
    }
}
