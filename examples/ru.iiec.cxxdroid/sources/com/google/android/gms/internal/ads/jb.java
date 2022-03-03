package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
public final class jb extends rk {
    private final /* synthetic */ byte[] q;
    private final /* synthetic */ Map r;
    private final /* synthetic */ jc s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    jb(eb ebVar, int i2, String str, xj0 xj0, ej0 ej0, byte[] bArr, Map map, jc jcVar) {
        super(i2, str, xj0, ej0);
        this.q = bArr;
        this.r = map;
        this.s = jcVar;
    }

    @Override // com.google.android.gms.internal.ads.bc0
    public final Map<String, String> a() {
        Map<String, String> map = this.r;
        return map == null ? super.a() : map;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.rk
    /* renamed from: c */
    public final void a(String str) {
        this.s.a(str);
        super.c(str);
    }

    @Override // com.google.android.gms.internal.ads.bc0
    public final byte[] m() {
        byte[] bArr = this.q;
        return bArr == null ? super.m() : bArr;
    }
}
