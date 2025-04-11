package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@k2
public final class oi0 implements zh0 {
    private final j3 a;

    /* renamed from: b  reason: collision with root package name */
    private final ri0 f5169b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f5170c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f5171d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final bi0 f5172e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f5173f;

    /* renamed from: g  reason: collision with root package name */
    private final long f5174g;

    /* renamed from: h  reason: collision with root package name */
    private final long f5175h;

    /* renamed from: i  reason: collision with root package name */
    private final x80 f5176i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f5177j;

    /* renamed from: k  reason: collision with root package name */
    private final String f5178k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f5179l = false;

    /* renamed from: m  reason: collision with root package name */
    private fi0 f5180m;
    private List<ii0> n = new ArrayList();
    private final boolean o;

    public oi0(Context context, j3 j3Var, ri0 ri0, bi0 bi0, boolean z, boolean z2, String str, long j2, long j3, x80 x80, boolean z3) {
        this.f5170c = context;
        this.a = j3Var;
        this.f5169b = ri0;
        this.f5172e = bi0;
        this.f5173f = z;
        this.f5177j = z2;
        this.f5178k = str;
        this.f5174g = j2;
        this.f5175h = j3;
        this.f5176i = x80;
        this.o = z3;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final ii0 a(List<ai0> list) {
        Object obj;
        Throwable th;
        ii0 ii0;
        qc.b("Starting mediation.");
        ArrayList arrayList = new ArrayList();
        v80 a2 = this.f5176i.a();
        n40 n40 = this.a.f4663e;
        int[] iArr = new int[2];
        if (n40.f5052h != null) {
            x0.y();
            if (ki0.a(this.f5178k, iArr)) {
                int i2 = 0;
                int i3 = iArr[0];
                int i4 = iArr[1];
                n40[] n40Arr = n40.f5052h;
                int length = n40Arr.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    n40 n402 = n40Arr[i2];
                    if (i3 == n402.f5050f && i4 == n402.f5047c) {
                        n40 = n402;
                        break;
                    }
                    i2++;
                }
            }
        }
        Iterator<ai0> it = list.iterator();
        while (it.hasNext()) {
            ai0 next = it.next();
            String valueOf = String.valueOf(next.f3807b);
            qc.c(valueOf.length() != 0 ? "Trying mediation network: ".concat(valueOf) : new String("Trying mediation network: "));
            Iterator<String> it2 = next.f3808c.iterator();
            while (true) {
                if (it2.hasNext()) {
                    String next2 = it2.next();
                    v80 a3 = this.f5176i.a();
                    Object obj2 = this.f5171d;
                    synchronized (obj2) {
                        try {
                            if (this.f5179l) {
                                ii0 = new ii0(-1);
                            } else {
                                obj = obj2;
                                try {
                                    this.f5180m = new fi0(this.f5170c, next2, this.f5169b, this.f5172e, next, this.a.f4662d, n40, this.a.f4670l, this.f5173f, this.f5177j, this.a.z, this.a.o, this.a.A, this.a.Y, this.o);
                                    ii0 a4 = this.f5180m.a(this.f5174g, this.f5175h);
                                    this.n.add(a4);
                                    if (a4.a == 0) {
                                        qc.b("Adapter succeeded.");
                                        this.f5176i.a("mediation_network_succeed", next2);
                                        if (!arrayList.isEmpty()) {
                                            this.f5176i.a("mediation_networks_fail", TextUtils.join(",", arrayList));
                                        }
                                        this.f5176i.a(a3, "mls");
                                        this.f5176i.a(a2, "ttm");
                                        return a4;
                                    }
                                    arrayList.add(next2);
                                    this.f5176i.a(a3, "mlf");
                                    if (a4.f4636c != null) {
                                        u9.f5718h.post(new pi0(this, a4));
                                    }
                                    it = it;
                                    a2 = a2;
                                    it2 = it2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            obj = obj2;
                            throw th;
                        }
                    }
                    return ii0;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f5176i.a("mediation_networks_fail", TextUtils.join(",", arrayList));
        }
        return new ii0(1);
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final List<ii0> a() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final void cancel() {
        synchronized (this.f5171d) {
            this.f5179l = true;
            if (this.f5180m != null) {
                this.f5180m.a();
            }
        }
    }
}
