package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
public class mq extends lq {

    /* renamed from: e  reason: collision with root package name */
    protected final byte[] f4973e;

    mq(byte[] bArr) {
        this.f4973e = bArr;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.fq
    public final int a(int i2, int i3, int i4) {
        return or.a(i2, this.f4973e, g(), i4);
    }

    @Override // com.google.android.gms.internal.ads.fq
    public final fq a(int i2, int i3) {
        int b2 = fq.b(0, i3, size());
        return b2 == 0 ? fq.f4347c : new iq(this.f4973e, g(), b2);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.fq
    public final String a(Charset charset) {
        return new String(this.f4973e, g(), size(), charset);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.fq
    public final void a(eq eqVar) {
        eqVar.a(this.f4973e, g(), size());
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.fq
    public void a(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f4973e, 0, bArr, 0, i4);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(fq fqVar, int i2, int i3) {
        if (i3 > fqVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i3);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i3 > fqVar.size()) {
            int size2 = fqVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i3);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(fqVar instanceof mq)) {
            return fqVar.a(0, i3).equals(a(0, i3));
        } else {
            mq mqVar = (mq) fqVar;
            byte[] bArr = this.f4973e;
            byte[] bArr2 = mqVar.f4973e;
            int g2 = g() + i3;
            int g3 = g();
            int g4 = mqVar.g();
            while (g3 < g2) {
                if (bArr[g3] != bArr2[g4]) {
                    return false;
                }
                g3++;
                g4++;
            }
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.fq
    public byte c(int i2) {
        return this.f4973e[i2];
    }

    @Override // com.google.android.gms.internal.ads.fq
    public final boolean d() {
        int g2 = g();
        return lu.a(this.f4973e, g2, size() + g2);
    }

    @Override // com.google.android.gms.internal.ads.fq
    public final oq e() {
        return oq.a(this.f4973e, g(), size(), true);
    }

    @Override // com.google.android.gms.internal.ads.fq
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fq) || size() != ((fq) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof mq)) {
            return obj.equals(this);
        }
        mq mqVar = (mq) obj;
        int f2 = f();
        int f3 = mqVar.f();
        if (f2 == 0 || f3 == 0 || f2 == f3) {
            return a(mqVar, 0, size());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public int g() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.fq
    public int size() {
        return this.f4973e.length;
    }
}
