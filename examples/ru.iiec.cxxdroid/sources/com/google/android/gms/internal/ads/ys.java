package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class ys<T> implements kt<T> {
    private final ss a;

    /* renamed from: b  reason: collision with root package name */
    private final du<?, ?> f6148b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f6149c;

    /* renamed from: d  reason: collision with root package name */
    private final br<?> f6150d;

    private ys(du<?, ?> duVar, br<?> brVar, ss ssVar) {
        this.f6148b = duVar;
        this.f6149c = brVar.a(ssVar);
        this.f6150d = brVar;
        this.a = ssVar;
    }

    static <T> ys<T> a(du<?, ?> duVar, br<?> brVar, ss ssVar) {
        return new ys<>(duVar, brVar, ssVar);
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final int a(T t) {
        du<?, ?> duVar = this.f6148b;
        int c2 = duVar.c(duVar.a((Object) t)) + 0;
        return this.f6149c ? c2 + this.f6150d.a((Object) t).h() : c2;
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final T a() {
        return (T) this.a.d().m();
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void a(T t, jt jtVar, zq zqVar) {
        boolean z;
        du<?, ?> duVar = this.f6148b;
        br<?> brVar = this.f6150d;
        Object b2 = duVar.b(t);
        er<?> b3 = brVar.b(t);
        do {
            try {
                if (jtVar.r() == Integer.MAX_VALUE) {
                    duVar.b(t, b2);
                    return;
                }
                int c2 = jtVar.c();
                if (c2 == 11) {
                    Object obj = null;
                    fq fqVar = null;
                    int i2 = 0;
                    while (jtVar.r() != Integer.MAX_VALUE) {
                        int c3 = jtVar.c();
                        if (c3 == 16) {
                            i2 = jtVar.d();
                            obj = brVar.a(zqVar, this.a, i2);
                        } else if (c3 == 26) {
                            if (obj == null) {
                                fqVar = jtVar.p();
                            } else {
                                brVar.a(jtVar, obj, zqVar, b3);
                                throw null;
                            }
                        } else if (!jtVar.e()) {
                            break;
                        }
                    }
                    if (jtVar.c() == 12) {
                        if (fqVar != null) {
                            if (obj == null) {
                                duVar.a(b2, i2, fqVar);
                            } else {
                                brVar.a(fqVar, obj, zqVar, b3);
                                throw null;
                            }
                        }
                        z = true;
                        continue;
                    } else {
                        throw sr.f();
                    }
                } else if ((c2 & 7) == 2) {
                    Object a2 = brVar.a(zqVar, this.a, c2 >>> 3);
                    if (a2 == null) {
                        z = duVar.a(b2, jtVar);
                        continue;
                    } else {
                        brVar.a(jtVar, a2, zqVar, b3);
                        throw null;
                    }
                } else {
                    z = jtVar.e();
                    continue;
                }
            } finally {
                duVar.b(t, b2);
            }
        } while (z);
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void a(T t, xu xuVar) {
        Iterator<Map.Entry<?, Object>> e2 = this.f6150d.a((Object) t).e();
        while (e2.hasNext()) {
            Map.Entry<?, Object> next = e2.next();
            gr grVar = (gr) next.getKey();
            if (grVar.g() != wu.MESSAGE || grVar.d() || grVar.e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            xuVar.a(grVar.b(), next instanceof xr ? ((xr) next).a().a() : next.getValue());
        }
        du<?, ?> duVar = this.f6148b;
        duVar.b(duVar.a((Object) t), xuVar);
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void a(T t, T t2) {
        mt.a(this.f6148b, t, t2);
        if (this.f6149c) {
            mt.a(this.f6150d, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void a(T t, byte[] bArr, int i2, int i3, cq cqVar) {
        T t2 = t;
        eu euVar = t2.zzdtt;
        if (euVar == eu.d()) {
            euVar = eu.e();
            t2.zzdtt = euVar;
        }
        while (i2 < i3) {
            int a2 = bq.a(bArr, i2, cqVar);
            int i4 = cqVar.a;
            if (i4 != 11) {
                i2 = (i4 & 7) == 2 ? bq.a(i4, bArr, a2, i3, euVar, cqVar) : bq.a(i4, bArr, a2, i3, cqVar);
            } else {
                int i5 = 0;
                fq fqVar = null;
                while (a2 < i3) {
                    a2 = bq.a(bArr, a2, cqVar);
                    int i6 = cqVar.a;
                    int i7 = i6 >>> 3;
                    int i8 = i6 & 7;
                    if (i7 != 2) {
                        if (i7 == 3 && i8 == 2) {
                            a2 = bq.e(bArr, a2, cqVar);
                            fqVar = (fq) cqVar.f4043c;
                        }
                    } else if (i8 == 0) {
                        a2 = bq.a(bArr, a2, cqVar);
                        i5 = cqVar.a;
                    }
                    if (i6 == 12) {
                        break;
                    }
                    a2 = bq.a(i6, bArr, a2, i3, cqVar);
                }
                if (fqVar != null) {
                    euVar.a((i5 << 3) | 2, fqVar);
                }
                i2 = a2;
            }
        }
        if (i2 != i3) {
            throw sr.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final boolean b(T t) {
        return this.f6150d.a((Object) t).d();
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final boolean b(T t, T t2) {
        if (!this.f6148b.a((Object) t).equals(this.f6148b.a((Object) t2))) {
            return false;
        }
        if (this.f6149c) {
            return this.f6150d.a((Object) t).equals(this.f6150d.a((Object) t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void c(T t) {
        this.f6148b.d(t);
        this.f6150d.c(t);
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final int d(T t) {
        int hashCode = this.f6148b.a((Object) t).hashCode();
        return this.f6149c ? (hashCode * 53) + this.f6150d.a((Object) t).hashCode() : hashCode;
    }
}
