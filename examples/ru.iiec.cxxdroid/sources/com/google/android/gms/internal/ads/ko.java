package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.interfaces.ECPublicKey;

public final class ko implements wj {

    /* renamed from: f  reason: collision with root package name */
    private static final byte[] f4829f = new byte[0];
    private final mo a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4830b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f4831c;

    /* renamed from: d  reason: collision with root package name */
    private final ro f4832d;

    /* renamed from: e  reason: collision with root package name */
    private final io f4833e;

    public ko(ECPublicKey eCPublicKey, byte[] bArr, String str, ro roVar, io ioVar) {
        oo.a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.a = new mo(eCPublicKey);
        this.f4831c = bArr;
        this.f4830b = str;
        this.f4832d = roVar;
        this.f4833e = ioVar;
    }

    @Override // com.google.android.gms.internal.ads.wj
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        no a2 = this.a.a(this.f4830b, this.f4831c, bArr2, this.f4833e.a(), this.f4832d);
        byte[] a3 = this.f4833e.a(a2.b()).a(bArr, f4829f);
        byte[] a4 = a2.a();
        return ByteBuffer.allocate(a4.length + a3.length).put(a4).put(a3).array();
    }
}
