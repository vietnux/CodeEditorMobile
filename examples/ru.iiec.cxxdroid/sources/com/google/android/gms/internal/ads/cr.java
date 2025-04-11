package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;
import java.util.Map;

final class cr extends br<Object> {
    cr() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.br
    public final int a(Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.br
    public final er<Object> a(Object obj) {
        return ((mr.c) obj).zzdtz;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.br
    public final <UT, UB> UB a(jt jtVar, Object obj, zq zqVar, er<Object> erVar, UB ub, du<UT, UB> duVar) {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.br
    public final Object a(zq zqVar, ss ssVar, int i2) {
        return zqVar.a(ssVar, i2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.br
    public final void a(fq fqVar, Object obj, zq zqVar, er<Object> erVar) {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.br
    public final void a(jt jtVar, Object obj, zq zqVar, er<Object> erVar) {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.br
    public final void a(xu xuVar, Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    public final void a(Object obj, er<Object> erVar) {
        ((mr.c) obj).zzdtz = erVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.br
    public final boolean a(ss ssVar) {
        return ssVar instanceof mr.c;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.br
    public final er<Object> b(Object obj) {
        er<Object> a = a(obj);
        if (!a.c()) {
            return a;
        }
        er<Object> erVar = (er) a.clone();
        a(obj, erVar);
        return erVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.br
    public final void c(Object obj) {
        a(obj).f();
    }
}
