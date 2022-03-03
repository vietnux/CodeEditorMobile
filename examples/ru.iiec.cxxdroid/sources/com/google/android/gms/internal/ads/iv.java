package com.google.android.gms.internal.ads;

import java.io.IOException;

public abstract class iv {
    protected volatile int a = -1;

    public static final <T extends iv> T a(T t, byte[] bArr) {
        a(t, bArr, 0, bArr.length);
        return t;
    }

    private static final <T extends iv> T a(T t, byte[] bArr, int i2, int i3) {
        try {
            yu a2 = yu.a(bArr, 0, i3);
            t.a(a2);
            a2.a(0);
            return t;
        } catch (hv e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e3);
        }
    }

    public static final byte[] a(iv ivVar) {
        byte[] bArr = new byte[ivVar.a()];
        try {
            av a2 = av.a(bArr, 0, bArr.length);
            ivVar.a(a2);
            a2.a();
            return bArr;
        } catch (IOException e2) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e2);
        }
    }

    public final int a() {
        int c2 = c();
        this.a = c2;
        return c2;
    }

    public abstract iv a(yu yuVar);

    public void a(av avVar) {
    }

    /* renamed from: b */
    public iv clone() {
        return (iv) super.clone();
    }

    /* access modifiers changed from: protected */
    public int c() {
        return 0;
    }

    public String toString() {
        return jv.a(this);
    }
}
