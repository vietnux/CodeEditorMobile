package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class so implements pj {
    private final ep a;

    /* renamed from: b  reason: collision with root package name */
    private final bk f5549b;

    public so(ep epVar, bk bkVar, int i2) {
        this.a = epVar;
        this.f5549b = bkVar;
    }

    @Override // com.google.android.gms.internal.ads.pj
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a2 = this.a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return fo.a(a2, this.f5549b.a(fo.a(bArr2, a2, copyOf)));
    }
}
