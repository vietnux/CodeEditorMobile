package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class e7 extends g9 implements d7 {

    /* renamed from: d  reason: collision with root package name */
    private final r8 f4185d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f4186e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<u6> f4187f;

    /* renamed from: g  reason: collision with root package name */
    private final List<x6> f4188g;

    /* renamed from: h  reason: collision with root package name */
    private final HashSet<String> f4189h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f4190i;

    /* renamed from: j  reason: collision with root package name */
    private final u5 f4191j;

    /* renamed from: k  reason: collision with root package name */
    private final long f4192k;

    public e7(Context context, r8 r8Var, u5 u5Var) {
        this(context, r8Var, u5Var, ((Long) a50.g().a(k80.C0)).longValue());
    }

    private e7(Context context, r8 r8Var, u5 u5Var, long j2) {
        this.f4187f = new ArrayList<>();
        this.f4188g = new ArrayList();
        this.f4189h = new HashSet<>();
        this.f4190i = new Object();
        this.f4186e = context;
        this.f4185d = r8Var;
        this.f4191j = u5Var;
        this.f4192k = j2;
    }

    private final q8 a(int i2, String str, ai0 ai0) {
        String str2;
        List<String> list;
        boolean z;
        boolean z2;
        String str3;
        p3 p3Var;
        r8 r8Var = this.f4185d;
        j3 j3Var = r8Var.a;
        j40 j40 = j3Var.f4662d;
        n3 n3Var = r8Var.f5394b;
        List<String> list2 = n3Var.f5027f;
        List<String> list3 = n3Var.f5029h;
        List<String> list4 = n3Var.f5033l;
        int i3 = n3Var.n;
        long j2 = n3Var.f5034m;
        String str4 = j3Var.f4668j;
        boolean z3 = n3Var.f5031j;
        bi0 bi0 = r8Var.f5395c;
        long j3 = n3Var.f5032k;
        n40 n40 = r8Var.f5396d;
        long j4 = n3Var.f5030i;
        long j5 = r8Var.f5398f;
        long j6 = n3Var.p;
        String str5 = n3Var.q;
        JSONObject jSONObject = r8Var.f5400h;
        o7 o7Var = n3Var.E;
        List<String> list5 = n3Var.F;
        List<String> list6 = n3Var.G;
        boolean z4 = n3Var.H;
        p3 p3Var2 = n3Var.I;
        StringBuilder sb = new StringBuilder("");
        List<x6> list7 = this.f4188g;
        if (list7 == null) {
            str2 = sb.toString();
            p3Var = p3Var2;
            z = z3;
            str3 = str5;
            z2 = z4;
            list = list5;
        } else {
            Iterator<x6> it = list7.iterator();
            while (true) {
                p3Var = p3Var2;
                if (!it.hasNext()) {
                    break;
                }
                x6 next = it.next();
                if (next != null) {
                    if (!TextUtils.isEmpty(next.a)) {
                        String str6 = next.a;
                        int i4 = next.f5992b;
                        int i5 = 3;
                        if (i4 == 3) {
                            i5 = 1;
                        } else if (i4 == 4) {
                            i5 = 2;
                        } else if (i4 == 5) {
                            i5 = 4;
                        } else if (i4 == 6) {
                            i5 = 0;
                        } else if (i4 != 7) {
                            i5 = 6;
                        }
                        long j7 = next.f5993c;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 33);
                        sb2.append(str6);
                        sb2.append(".");
                        sb2.append(i5);
                        sb2.append(".");
                        sb2.append(j7);
                        sb.append(String.valueOf(sb2.toString()).concat("_"));
                        it = it;
                        p3Var2 = p3Var;
                        str5 = str5;
                        z4 = z4;
                        z3 = z3;
                        list5 = list5;
                    } else {
                        it = it;
                    }
                }
                p3Var2 = p3Var;
            }
            z = z3;
            str3 = str5;
            z2 = z4;
            list = list5;
            str2 = sb.substring(0, Math.max(0, sb.length() - 1));
        }
        r8 r8Var2 = this.f4185d;
        n3 n3Var2 = r8Var2.f5394b;
        return new q8(j40, null, list2, i2, list3, list4, i3, j2, str4, z, ai0, null, str, bi0, null, j3, n40, j4, j5, j6, str3, jSONObject, null, o7Var, list, list6, z2, p3Var, str2, n3Var2.L, n3Var2.P, r8Var2.f5401i, n3Var2.T, r8Var2.f5402j, n3Var2.V, n3Var2.W, n3Var2.X, n3Var2.Y);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(q8 q8Var) {
        this.f4191j.e().a(q8Var);
    }

    @Override // com.google.android.gms.internal.ads.d7
    public final void a(String str) {
        synchronized (this.f4190i) {
            this.f4189h.add(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.d7
    public final void a(String str, int i2) {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(q8 q8Var) {
        this.f4191j.e().a(q8Var);
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.g9
    public final void d() {
        Object obj;
        for (ai0 ai0 : this.f4185d.f5395c.a) {
            String str = ai0.f3816k;
            Iterator<String> it = ai0.f3808c.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(next) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(next)) {
                    try {
                        next = new JSONObject(str).getString("class_name");
                    } catch (JSONException e2) {
                        qc.b("Unable to determine custom event class name, skipping...", e2);
                    }
                }
                Object obj2 = this.f4190i;
                synchronized (obj2) {
                    try {
                        j7 a = this.f4191j.a(next);
                        if (!(a == null || a.b() == null)) {
                            if (a.a() != null) {
                                obj = obj2;
                                u6 u6Var = new u6(this.f4186e, next, str, ai0, this.f4185d, a, this, this.f4192k);
                                u6Var.a(this.f4191j.d());
                                this.f4187f.add(u6Var);
                            }
                        }
                        obj = obj2;
                        List<x6> list = this.f4188g;
                        z6 z6Var = new z6();
                        z6Var.b(ai0.f3809d);
                        z6Var.a(next);
                        z6Var.a(0L);
                        z6Var.a(7);
                        list.add(z6Var.a());
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<u6> arrayList = this.f4187f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            u6 u6Var2 = arrayList.get(i3);
            i3++;
            u6 u6Var3 = u6Var2;
            if (hashSet.add(u6Var3.f5701d)) {
                u6Var3.f();
            }
        }
        ArrayList<u6> arrayList2 = this.f4187f;
        int size2 = arrayList2.size();
        while (i2 < size2) {
            u6 u6Var4 = arrayList2.get(i2);
            i2++;
            u6 u6Var5 = u6Var4;
            try {
                u6Var5.f().get();
                synchronized (this.f4190i) {
                    if (!TextUtils.isEmpty(u6Var5.f5701d)) {
                        this.f4188g.add(u6Var5.g());
                    }
                }
                synchronized (this.f4190i) {
                    if (this.f4189h.contains(u6Var5.f5701d)) {
                        fc.a.post(new f7(this, a(-2, u6Var5.f5701d, u6Var5.h())));
                        return;
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                synchronized (this.f4190i) {
                    if (!TextUtils.isEmpty(u6Var5.f5701d)) {
                        this.f4188g.add(u6Var5.g());
                    }
                }
            } catch (Exception e3) {
                try {
                    qc.c("Unable to resolve rewarded adapter.", e3);
                    synchronized (this.f4190i) {
                        if (!TextUtils.isEmpty(u6Var5.f5701d)) {
                            this.f4188g.add(u6Var5.g());
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (this.f4190i) {
                        if (!TextUtils.isEmpty(u6Var5.f5701d)) {
                            this.f4188g.add(u6Var5.g());
                        }
                        throw th2;
                    }
                }
            }
        }
        fc.a.post(new g7(this, a(3, null, null)));
    }
}
