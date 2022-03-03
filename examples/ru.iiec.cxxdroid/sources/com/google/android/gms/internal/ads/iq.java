package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class iq extends mq {

    /* renamed from: f  reason: collision with root package name */
    private final int f4641f;

    /* renamed from: g  reason: collision with root package name */
    private final int f4642g;

    iq(byte[] bArr, int i2, int i3) {
        super(bArr);
        fq.b(i2, i2 + i3, bArr.length);
        this.f4641f = i2;
        this.f4642g = i3;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.mq, com.google.android.gms.internal.ads.fq
    public final void a(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f4973e, g(), bArr, 0, i4);
    }

    @Override // com.google.android.gms.internal.ads.mq, com.google.android.gms.internal.ads.fq
    public final byte c(int i2) {
        int size = size();
        if (((size - (i2 + 1)) | i2) >= 0) {
            return this.f4973e[this.f4641f + i2];
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.mq
    public final int g() {
        return this.f4641f;
    }

    @Override // com.google.android.gms.internal.ads.mq, com.google.android.gms.internal.ads.fq
    public final int size() {
        return this.f4642g;
    }
}
