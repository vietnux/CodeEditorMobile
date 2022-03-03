package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.y;
import java.util.Iterator;
import java.util.LinkedList;

public final class ye0 {
    private final LinkedList<ze0> a = new LinkedList<>();

    /* renamed from: b */
    private j40 f6105b;

    /* renamed from: c */
    private final String f6106c;

    /* renamed from: d */
    private final int f6107d;

    /* renamed from: e */
    private boolean f6108e;

    ye0(j40 j40, String str, int i2) {
        y.a(j40);
        y.a((Object) str);
        this.f6105b = j40;
        this.f6106c = str;
        this.f6107d = i2;
    }

    public final ze0 a(j40 j40) {
        if (j40 != null) {
            this.f6105b = j40;
        }
        return this.a.remove();
    }

    public final String a() {
        return this.f6106c;
    }

    public final void a(rd0 rd0, j40 j40) {
        this.a.add(new ze0(this, rd0, j40));
    }

    public final boolean a(rd0 rd0) {
        ze0 ze0 = new ze0(this, rd0);
        this.a.add(ze0);
        return ze0.a();
    }

    public final int b() {
        return this.f6107d;
    }

    public final int c() {
        return this.a.size();
    }

    public final j40 d() {
        return this.f6105b;
    }

    public final int e() {
        Iterator<ze0> it = this.a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().f6202e) {
                i2++;
            }
        }
        return i2;
    }

    public final int f() {
        Iterator<ze0> it = this.a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().a()) {
                i2++;
            }
        }
        return i2;
    }

    public final void g() {
        this.f6108e = true;
    }

    public final boolean h() {
        return this.f6108e;
    }
}
