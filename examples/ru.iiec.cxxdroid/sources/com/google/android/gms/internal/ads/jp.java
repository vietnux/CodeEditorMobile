package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

abstract class jp implements ep {

    /* renamed from: c  reason: collision with root package name */
    static final int[] f4723c = a(ByteBuffer.wrap(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107}));
    final dp a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4724b;

    jp(byte[] bArr, int i2) {
        if (bArr.length == 32) {
            this.a = dp.a(bArr);
            this.f4724b = i2;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    static int a(int i2, int i3) {
        return (i2 >>> (-i3)) | (i2 << i3);
    }

    static int[] a(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    /* access modifiers changed from: package-private */
    public abstract int a();

    /* access modifiers changed from: package-private */
    public abstract ByteBuffer a(byte[] bArr, int i2);

    /* access modifiers changed from: package-private */
    public final void a(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - a() >= bArr.length) {
            byte[] a2 = hp.a(a());
            byteBuffer.put(a2);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int remaining = wrap.remaining();
            int i2 = (remaining / 64) + 1;
            for (int i3 = 0; i3 < i2; i3++) {
                ByteBuffer a3 = a(a2, this.f4724b + i3);
                if (i3 == i2 - 1) {
                    fo.a(byteBuffer, wrap, a3, remaining % 64);
                } else {
                    fo.a(byteBuffer, wrap, a3, 64);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    @Override // com.google.android.gms.internal.ads.ep
    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        a();
        if (length <= 2147483635) {
            ByteBuffer allocate = ByteBuffer.allocate(a() + bArr.length);
            a(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
