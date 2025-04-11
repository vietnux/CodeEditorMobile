package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

abstract class kp implements pj {
    private final jp a;

    /* renamed from: b  reason: collision with root package name */
    private final jp f4834b;

    kp(byte[] bArr) {
        byte[] bArr2 = (byte[]) bArr.clone();
        this.a = a(bArr, 1);
        this.f4834b = a(bArr, 0);
    }

    /* access modifiers changed from: package-private */
    public abstract jp a(byte[] bArr, int i2);

    @Override // com.google.android.gms.internal.ads.pj
    public byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        this.a.a();
        if (length <= 2147483619) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length + this.a.a() + 16);
            if (allocate.remaining() >= bArr.length + this.a.a() + 16) {
                int position = allocate.position();
                this.a.a(allocate, bArr);
                allocate.position(position);
                byte[] bArr3 = new byte[this.a.a()];
                allocate.get(bArr3);
                allocate.limit(allocate.limit() - 16);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = new byte[32];
                this.f4834b.a(bArr3, 0).get(bArr4);
                int length2 = bArr2.length % 16 == 0 ? bArr2.length : (bArr2.length + 16) - (bArr2.length % 16);
                int remaining = allocate.remaining();
                int i2 = remaining % 16;
                int i3 = (i2 == 0 ? remaining : (remaining + 16) - i2) + length2;
                ByteBuffer order = ByteBuffer.allocate(i3 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(length2);
                order.put(allocate);
                order.position(i3);
                order.putLong((long) bArr2.length);
                order.putLong((long) remaining);
                byte[] a2 = gp.a(bArr4, order.array());
                allocate.limit(allocate.limit() + 16);
                allocate.put(a2);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
