package com.google.android.gms.internal.ads;

@k2
public abstract class g9 implements na<ld> {
    private final Runnable a = new h9(this);

    /* renamed from: b  reason: collision with root package name */
    private volatile Thread f4411b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4412c = false;

    public g9() {
    }

    public g9(boolean z) {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.na
    public final /* synthetic */ ld a() {
        return this.f4412c ? s9.b(this.a) : s9.a(this.a);
    }

    public abstract void c();

    @Override // com.google.android.gms.internal.ads.na
    public final void cancel() {
        c();
        if (this.f4411b != null) {
            this.f4411b.interrupt();
        }
    }

    public abstract void d();

    public final ld e() {
        return this.f4412c ? s9.b(this.a) : s9.a(this.a);
    }
}
