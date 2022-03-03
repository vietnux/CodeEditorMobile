package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.x0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@k2
public final class d10 {
    private final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private int f4077b;

    /* renamed from: c  reason: collision with root package name */
    private List<c10> f4078c = new LinkedList();

    public final c10 a() {
        synchronized (this.a) {
            c10 c10 = null;
            if (this.f4078c.size() == 0) {
                qc.b("Queue empty");
                return null;
            }
            int i2 = 0;
            if (this.f4078c.size() >= 2) {
                int i3 = Integer.MIN_VALUE;
                int i4 = 0;
                for (c10 c102 : this.f4078c) {
                    int a2 = c102.a();
                    if (a2 > i3) {
                        i2 = i4;
                        c10 = c102;
                        i3 = a2;
                    }
                    i4++;
                }
                this.f4078c.remove(i2);
                return c10;
            }
            c10 c103 = this.f4078c.get(0);
            c103.f();
            return c103;
        }
    }

    public final boolean a(c10 c10) {
        synchronized (this.a) {
            return this.f4078c.contains(c10);
        }
    }

    public final boolean b(c10 c10) {
        synchronized (this.a) {
            Iterator<c10> it = this.f4078c.iterator();
            while (it.hasNext()) {
                c10 next = it.next();
                if (!((Boolean) a50.g().a(k80.W)).booleanValue() || x0.j().m().b()) {
                    if (((Boolean) a50.g().a(k80.Y)).booleanValue() && !x0.j().m().d() && c10 != next && next.e().equals(c10.e())) {
                        it.remove();
                        return true;
                    }
                } else if (c10 != next && next.b().equals(c10.b())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void c(c10 c10) {
        synchronized (this.a) {
            if (this.f4078c.size() >= 10) {
                int size = this.f4078c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                qc.b(sb.toString());
                this.f4078c.remove(0);
            }
            int i2 = this.f4077b;
            this.f4077b = i2 + 1;
            c10.a(i2);
            this.f4078c.add(c10);
        }
    }
}
