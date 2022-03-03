package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

@k2
public final class t10 extends o10 {

    /* renamed from: c  reason: collision with root package name */
    private MessageDigest f5562c;

    @Override // com.google.android.gms.internal.ads.o10
    public final byte[] a(String str) {
        byte[] bArr;
        String[] split = str.split(" ");
        int i2 = 4;
        if (split.length == 1) {
            int a = s10.a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a);
            bArr = allocate.array();
        } else if (split.length < 5) {
            bArr = new byte[(split.length << 1)];
            for (int i3 = 0; i3 < split.length; i3++) {
                int a2 = s10.a(split[i3]);
                int i4 = (a2 >> 16) ^ (65535 & a2);
                byte[] bArr2 = {(byte) i4, (byte) (i4 >> 8)};
                int i5 = i3 << 1;
                bArr[i5] = bArr2[0];
                bArr[i5 + 1] = bArr2[1];
            }
        } else {
            bArr = new byte[split.length];
            for (int i6 = 0; i6 < split.length; i6++) {
                int a3 = s10.a(split[i6]);
                bArr[i6] = (byte) ((a3 >> 24) ^ (((a3 & 255) ^ ((a3 >> 8) & 255)) ^ ((a3 >> 16) & 255)));
            }
        }
        this.f5562c = a();
        synchronized (this.a) {
            if (this.f5562c == null) {
                return new byte[0];
            }
            this.f5562c.reset();
            this.f5562c.update(bArr);
            byte[] digest = this.f5562c.digest();
            if (digest.length <= 4) {
                i2 = digest.length;
            }
            byte[] bArr3 = new byte[i2];
            System.arraycopy(digest, 0, bArr3, 0, bArr3.length);
            return bArr3;
        }
    }
}
