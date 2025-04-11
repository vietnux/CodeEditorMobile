package com.google.android.gms.common;

import com.google.android.gms.common.i;
import java.lang.ref.WeakReference;

abstract class v extends i.a {

    /* renamed from: d  reason: collision with root package name */
    private static final WeakReference<byte[]> f3728d = new WeakReference<>(null);

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<byte[]> f3729c = f3728d;

    v(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.i.a
    public final byte[] M() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f3729c.get();
            if (bArr == null) {
                bArr = O();
                this.f3729c = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] O();
}
