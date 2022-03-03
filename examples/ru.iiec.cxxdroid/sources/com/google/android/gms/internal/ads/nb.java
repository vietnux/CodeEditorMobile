package com.google.android.gms.internal.ads;

import java.util.Map;

public final class nb extends bc0<ba0> {
    private final wd<ba0> o;
    private final jc p;

    public nb(String str, wd<ba0> wdVar) {
        this(str, null, wdVar);
    }

    private nb(String str, Map<String, String> map, wd<ba0> wdVar) {
        super(0, str, new ob(wdVar));
        this.o = wdVar;
        this.p = new jc();
        this.p.a(str, "GET", null, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.bc0
    public final di0<ba0> a(ba0 ba0) {
        return di0.a(ba0, ne.a(ba0));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.bc0
    public final /* synthetic */ void a(ba0 ba0) {
        ba0 ba02 = ba0;
        this.p.a(ba02.f3856c, ba02.a);
        jc jcVar = this.p;
        byte[] bArr = ba02.f3855b;
        if (jc.a() && bArr != null) {
            jcVar.a(bArr);
        }
        this.o.b(ba02);
    }
}
