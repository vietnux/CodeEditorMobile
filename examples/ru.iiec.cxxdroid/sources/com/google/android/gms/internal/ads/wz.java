package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class wz implements zd0 {
    private final Map<String, List<bc0<?>>> a = new HashMap();

    /* renamed from: b */
    private final ux f5972b;

    wz(ux uxVar) {
        this.f5972b = uxVar;
    }

    /* access modifiers changed from: public */
    private final synchronized boolean b(bc0<?> bc0) {
        String i2 = bc0.i();
        if (this.a.containsKey(i2)) {
            List<bc0<?>> list = this.a.get(i2);
            if (list == null) {
                list = new ArrayList<>();
            }
            bc0.a("waiting-for-response");
            list.add(bc0);
            this.a.put(i2, list);
            if (e4.f4172b) {
                e4.a("Request for cacheKey=%s is in flight, putting on hold.", i2);
            }
            return true;
        }
        this.a.put(i2, null);
        bc0.a((zd0) this);
        if (e4.f4172b) {
            e4.a("new request, sending to network %s", i2);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zd0
    public final synchronized void a(bc0<?> bc0) {
        String i2 = bc0.i();
        List<bc0<?>> remove = this.a.remove(i2);
        if (remove != null && !remove.isEmpty()) {
            if (e4.f4172b) {
                e4.c("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), i2);
            }
            bc0<?> remove2 = remove.remove(0);
            this.a.put(i2, remove);
            remove2.a((zd0) this);
            try {
                this.f5972b.f5792c.put(remove2);
            } catch (InterruptedException e2) {
                e4.b("Couldn't add request to queue. %s", e2.toString());
                Thread.currentThread().interrupt();
                this.f5972b.a();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zd0
    public final void a(bc0<?> bc0, di0<?> di0) {
        List<bc0<?>> remove;
        tw twVar = di0.f4116b;
        if (twVar == null || twVar.a()) {
            a(bc0);
            return;
        }
        String i2 = bc0.i();
        synchronized (this) {
            remove = this.a.remove(i2);
        }
        if (remove != null) {
            if (e4.f4172b) {
                e4.c("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), i2);
            }
            for (bc0<?> bc02 : remove) {
                this.f5972b.f5794e.a(bc02, di0);
            }
        }
    }
}
