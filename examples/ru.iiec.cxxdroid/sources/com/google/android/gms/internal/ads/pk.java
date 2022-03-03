package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class pk implements pj {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f5253c = new byte[0];
    private final hn a;

    /* renamed from: b  reason: collision with root package name */
    private final pj f5254b;

    public pk(hn hnVar, pj pjVar) {
        this.a = hnVar;
        this.f5254b = pjVar;
    }

    @Override // com.google.android.gms.internal.ads.pj
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] f2 = fk.b(this.a).f();
        byte[] a2 = this.f5254b.a(f2, f5253c);
        byte[] a3 = ((pj) fk.a(this.a.i(), f2)).a(bArr, bArr2);
        return ByteBuffer.allocate(a2.length + 4 + a3.length).putInt(a2.length).put(a2).put(a3).array();
    }
}
