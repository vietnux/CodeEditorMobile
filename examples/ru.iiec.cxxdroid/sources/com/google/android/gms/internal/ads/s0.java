package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@k2
public final class s0 extends i0 {

    /* renamed from: j  reason: collision with root package name */
    private ri0 f5483j;

    /* renamed from: k  reason: collision with root package name */
    private zh0 f5484k;

    /* renamed from: l  reason: collision with root package name */
    private bi0 f5485l;

    /* renamed from: m  reason: collision with root package name */
    protected ii0 f5486m;
    private final x80 n;
    private final lg o;
    private boolean p;

    s0(Context context, r8 r8Var, ri0 ri0, n0 n0Var, x80 x80, lg lgVar) {
        super(context, r8Var, n0Var);
        this.f5483j = ri0;
        this.f5485l = r8Var.f5395c;
        this.n = x80;
        this.o = lgVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.i0
    public final void a(long j2) {
        l0 l0Var;
        Bundle bundle;
        synchronized (this.f4572g) {
            this.f5484k = this.f5485l.f3924m != -1 ? new li0(this.f4570e, this.f4573h.a, this.f5483j, this.f5485l, this.f4574i.v, this.f4574i.D, this.f4574i.N, j2, ((Long) a50.g().a(k80.A1)).longValue(), 2, this.f4573h.f5402j) : new oi0(this.f4570e, this.f4573h.a, this.f5483j, this.f5485l, this.f4574i.v, this.f4574i.D, this.f4574i.N, j2, ((Long) a50.g().a(k80.A1)).longValue(), this.n, this.f4573h.f5402j);
        }
        ArrayList arrayList = new ArrayList(this.f5485l.a);
        Bundle bundle2 = this.f4573h.a.f4662d.n;
        if ((bundle2 == null || (bundle = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter")) == null) ? false : bundle.getBoolean("_skipMediation")) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (!((ai0) listIterator.next()).f3808c.contains("com.google.ads.mediation.admob.AdMobAdapter")) {
                    listIterator.remove();
                }
            }
        }
        this.f5486m = this.f5484k.a(arrayList);
        ii0 ii0 = this.f5486m;
        int i2 = ii0.a;
        if (i2 == 0) {
            ai0 ai0 = ii0.f4635b;
            if (ai0 != null && ai0.o != null) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                u9.f5718h.post(new t0(this, countDownLatch));
                try {
                    countDownLatch.await(10, TimeUnit.SECONDS);
                    synchronized (this.f4572g) {
                        if (!this.p) {
                            throw new l0("View could not be prepared", 0);
                        } else if (this.o.Y()) {
                            throw new l0("Assets not loaded, web view is destroyed", 0);
                        }
                    }
                } catch (InterruptedException e2) {
                    String valueOf = String.valueOf(e2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
                    sb.append("Interrupted while waiting for latch : ");
                    sb.append(valueOf);
                    throw new l0(sb.toString(), 0);
                }
            }
        } else if (i2 != 1) {
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Unexpected mediation result: ");
            sb2.append(i2);
            sb2.toString();
            throw l0Var;
        } else {
            l0Var = new l0("No fill from any mediation ad networks.", 3);
            throw l0Var;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.i0
    public final q8 b(int i2) {
        String str;
        boolean z;
        List<String> list;
        long j2;
        p3 p3Var;
        String str2;
        String str3;
        boolean z2;
        List<String> list2;
        long j3;
        Iterator<ii0> it;
        String str4;
        int i3;
        j3 j3Var = this.f4573h.a;
        j40 j40 = j3Var.f4662d;
        lg lgVar = this.o;
        n3 n3Var = this.f4574i;
        List<String> list3 = n3Var.f5027f;
        List<String> list4 = n3Var.f5029h;
        List<String> list5 = n3Var.f5033l;
        int i4 = n3Var.n;
        long j4 = n3Var.f5034m;
        String str5 = j3Var.f4668j;
        boolean z3 = n3Var.f5031j;
        ii0 ii0 = this.f5486m;
        ai0 ai0 = ii0 != null ? ii0.f4635b : null;
        ii0 ii02 = this.f5486m;
        ui0 ui0 = ii02 != null ? ii02.f4636c : null;
        ii0 ii03 = this.f5486m;
        String name = ii03 != null ? ii03.f4637d : AdMobAdapter.class.getName();
        bi0 bi0 = this.f5485l;
        ii0 ii04 = this.f5486m;
        ei0 ei0 = ii04 != null ? ii04.f4638e : null;
        n3 n3Var2 = this.f4574i;
        long j5 = n3Var2.f5032k;
        r8 r8Var = this.f4573h;
        n40 n40 = r8Var.f5396d;
        long j6 = n3Var2.f5030i;
        long j7 = r8Var.f5398f;
        long j8 = n3Var2.p;
        String str6 = n3Var2.q;
        JSONObject jSONObject = r8Var.f5400h;
        o7 o7Var = n3Var2.E;
        List<String> list6 = n3Var2.F;
        List<String> list7 = n3Var2.G;
        bi0 bi02 = this.f5485l;
        boolean z4 = bi02 != null ? bi02.o : false;
        p3 p3Var2 = this.f4574i.I;
        zh0 zh0 = this.f5484k;
        if (zh0 != null) {
            List<ii0> a = zh0.a();
            if (a == null) {
                list = list6;
                p3Var = p3Var2;
                str = str5;
                z = z3;
                j2 = j8;
                str2 = "";
            } else {
                Iterator<ii0> it2 = a.iterator();
                String str7 = "";
                while (true) {
                    p3Var = p3Var2;
                    if (!it2.hasNext()) {
                        break;
                    }
                    ii0 next = it2.next();
                    if (next != null) {
                        it = it2;
                        ai0 ai02 = next.f4635b;
                        if (ai02 == null || TextUtils.isEmpty(ai02.f3809d)) {
                            list2 = list6;
                        } else {
                            String valueOf = String.valueOf(str7);
                            j3 = j8;
                            String str8 = next.f4635b.f3809d;
                            int i5 = next.a;
                            list2 = list6;
                            if (i5 != -1) {
                                if (i5 == 0) {
                                    str4 = str5;
                                    z2 = z3;
                                    i3 = 0;
                                } else if (i5 == 1) {
                                    str4 = str5;
                                    z2 = z3;
                                    i3 = 1;
                                } else if (i5 == 3) {
                                    i3 = 2;
                                } else if (i5 != 4) {
                                    i3 = 5;
                                    if (i5 != 5) {
                                        i3 = 6;
                                    }
                                } else {
                                    str4 = str5;
                                    z2 = z3;
                                    i3 = 3;
                                }
                                long j9 = next.f4640g;
                                str3 = str4;
                                StringBuilder sb = new StringBuilder(String.valueOf(str8).length() + 33);
                                sb.append(str8);
                                sb.append(".");
                                sb.append(i3);
                                sb.append(".");
                                sb.append(j9);
                                String sb2 = sb.toString();
                                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(sb2).length());
                                sb3.append(valueOf);
                                sb3.append(sb2);
                                sb3.append("_");
                                str7 = sb3.toString();
                                it2 = it;
                                p3Var2 = p3Var;
                                j8 = j3;
                                list6 = list2;
                                z3 = z2;
                                str5 = str3;
                            } else {
                                i3 = 4;
                            }
                            str4 = str5;
                            z2 = z3;
                            long j92 = next.f4640g;
                            str3 = str4;
                            StringBuilder sb4 = new StringBuilder(String.valueOf(str8).length() + 33);
                            sb4.append(str8);
                            sb4.append(".");
                            sb4.append(i3);
                            sb4.append(".");
                            sb4.append(j92);
                            String sb22 = sb4.toString();
                            StringBuilder sb32 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(sb22).length());
                            sb32.append(valueOf);
                            sb32.append(sb22);
                            sb32.append("_");
                            str7 = sb32.toString();
                            it2 = it;
                            p3Var2 = p3Var;
                            j8 = j3;
                            list6 = list2;
                            z3 = z2;
                            str5 = str3;
                        }
                    } else {
                        list2 = list6;
                        it = it2;
                    }
                    str3 = str5;
                    z2 = z3;
                    j3 = j8;
                    it2 = it;
                    p3Var2 = p3Var;
                    j8 = j3;
                    list6 = list2;
                    z3 = z2;
                    str5 = str3;
                }
                list = list6;
                str = str5;
                z = z3;
                j2 = j8;
                str2 = str7.substring(0, Math.max(0, str7.length() - 1));
            }
        } else {
            list = list6;
            p3Var = p3Var2;
            str = str5;
            z = z3;
            j2 = j8;
            str2 = null;
        }
        n3 n3Var3 = this.f4574i;
        List<String> list8 = n3Var3.L;
        String str9 = n3Var3.P;
        r8 r8Var2 = this.f4573h;
        return new q8(j40, lgVar, list3, i2, list4, list5, i4, j4, str, z, ai0, ui0, name, bi0, ei0, j5, n40, j6, j7, j2, str6, jSONObject, null, o7Var, list, list7, z4, p3Var, str2, list8, str9, r8Var2.f5401i, n3Var3.T, r8Var2.f5402j, n3Var3.V, n3Var3.W, n3Var3.X, n3Var3.Y);
    }

    @Override // com.google.android.gms.internal.ads.i0, com.google.android.gms.internal.ads.g9
    public final void c() {
        synchronized (this.f4572g) {
            super.c();
            if (this.f5484k != null) {
                this.f5484k.cancel();
            }
        }
    }
}
