package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@k2
public final class vf implements Iterable<tf> {

    /* renamed from: b  reason: collision with root package name */
    private final List<tf> f5841b = new ArrayList();

    public static boolean a(kf kfVar) {
        tf b2 = b(kfVar);
        if (b2 == null) {
            return false;
        }
        b2.f5617e.b();
        return true;
    }

    static tf b(kf kfVar) {
        Iterator<tf> it = x0.A().iterator();
        while (it.hasNext()) {
            tf next = it.next();
            if (next.f5616d == kfVar) {
                return next;
            }
        }
        return null;
    }

    public final int a() {
        return this.f5841b.size();
    }

    public final void a(tf tfVar) {
        this.f5841b.add(tfVar);
    }

    public final void b(tf tfVar) {
        this.f5841b.remove(tfVar);
    }

    @Override // java.lang.Iterable
    public final Iterator<tf> iterator() {
        return this.f5841b.iterator();
    }
}
