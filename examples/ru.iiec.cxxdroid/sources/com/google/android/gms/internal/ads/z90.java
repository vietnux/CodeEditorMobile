package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.y;
import e.b.b.a.b.a;
import e.b.b.a.b.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

@k2
public final class z90 extends fa0 {
    private dj0 o;
    private hj0 p;
    private kj0 q;
    private final ca0 r;
    private aa0 s;
    private boolean t;
    private Object u;

    private z90(Context context, ca0 ca0, cx cxVar, da0 da0) {
        super(context, ca0, null, cxVar, null, da0, null, null);
        this.t = false;
        this.u = new Object();
        this.r = ca0;
    }

    public z90(Context context, ca0 ca0, cx cxVar, dj0 dj0, da0 da0) {
        this(context, ca0, cxVar, da0);
        this.o = dj0;
    }

    public z90(Context context, ca0 ca0, cx cxVar, hj0 hj0, da0 da0) {
        this(context, ca0, cxVar, da0);
        this.p = hj0;
    }

    public z90(Context context, ca0 ca0, cx cxVar, kj0 kj0, da0 da0) {
        this(context, ca0, cxVar, da0);
        this.q = kj0;
    }

    private static HashMap<String, View> b(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view = entry.getValue().get();
                if (view != null) {
                    hashMap.put(entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.aa0, com.google.android.gms.internal.ads.fa0
    public final void D() {
        synchronized (this.u) {
            if (this.s != null) {
                this.s.D();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.aa0, com.google.android.gms.internal.ads.fa0
    public final void E1() {
        aa0 aa0 = this.s;
        if (aa0 != null) {
            aa0.E1();
        }
    }

    @Override // com.google.android.gms.internal.ads.aa0, com.google.android.gms.internal.ads.fa0
    public final void F1() {
        aa0 aa0 = this.s;
        if (aa0 != null) {
            aa0.F1();
        }
    }

    @Override // com.google.android.gms.internal.ads.aa0, com.google.android.gms.internal.ads.fa0
    public final void G1() {
    }

    @Override // com.google.android.gms.internal.ads.aa0, com.google.android.gms.internal.ads.fa0
    public final boolean H1() {
        synchronized (this.u) {
            if (this.s != null) {
                return this.s.H1();
            }
            return this.r.b2();
        }
    }

    @Override // com.google.android.gms.internal.ads.aa0, com.google.android.gms.internal.ads.fa0
    public final boolean J1() {
        synchronized (this.u) {
            if (this.s != null) {
                return this.s.J1();
            }
            return this.r.N1();
        }
    }

    @Override // com.google.android.gms.internal.ads.aa0, com.google.android.gms.internal.ads.fa0
    public final void K1() {
        y.a("recordDownloadedImpression must be called on main UI thread.");
        synchronized (this.u) {
            this.f4298k = true;
            if (this.s != null) {
                this.s.K1();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.aa0, com.google.android.gms.internal.ads.fa0
    public final void L1() {
    }

    @Override // com.google.android.gms.internal.ads.aa0, com.google.android.gms.internal.ads.fa0
    public final View a(View.OnClickListener onClickListener, boolean z) {
        a aVar;
        synchronized (this.u) {
            if (this.s != null) {
                return this.s.a(onClickListener, z);
            }
            try {
                if (this.q != null) {
                    aVar = this.q.K();
                } else if (this.o != null) {
                    aVar = this.o.K();
                } else {
                    if (this.p != null) {
                        aVar = this.p.K();
                    }
                    aVar = null;
                }
            } catch (RemoteException e2) {
                qc.c("Failed to call getAdChoicesContent", e2);
            }
            if (aVar == null) {
                return null;
            }
            return (View) b.y(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.fa0
    public final lg a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.aa0, com.google.android.gms.internal.ads.fa0
    public final void a(View view) {
        synchronized (this.u) {
            if (this.s != null) {
                this.s.a(view);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.aa0, com.google.android.gms.internal.ads.fa0
    public final void a(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.u) {
            try {
                if (this.q != null) {
                    this.q.b(b.a(view));
                } else if (this.o != null) {
                    this.o.b(b.a(view));
                } else if (this.p != null) {
                    this.p.b(b.a(view));
                }
            } catch (RemoteException e2) {
                qc.c("Failed to call untrackView", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.aa0, com.google.android.gms.internal.ads.fa0
    public final void a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        ca0 ca0;
        y.a("performClick must be called on the main UI thread.");
        synchronized (this.u) {
            if (this.s != null) {
                this.s.a(view, map, bundle, view2);
                this.r.d();
            } else {
                try {
                    if (this.q != null && !this.q.H()) {
                        this.q.a(b.a(view));
                        ca0 = this.r;
                    } else if (this.o != null && !this.o.H()) {
                        this.o.a(b.a(view));
                        ca0 = this.r;
                    } else if (this.p != null && !this.p.H()) {
                        this.p.a(b.a(view));
                        ca0 = this.r;
                    }
                    ca0.d();
                } catch (RemoteException e2) {
                    qc.c("Failed to call performClick", e2);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.fa0
    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        synchronized (this.u) {
            this.t = true;
            HashMap<String, View> b2 = b(map);
            HashMap<String, View> b3 = b(map2);
            try {
                if (this.q != null) {
                    this.q.a(b.a(view), b.a(b2), b.a(b3));
                } else if (this.o != null) {
                    this.o.a(b.a(view), b.a(b2), b.a(b3));
                    this.o.c(b.a(view));
                } else if (this.p != null) {
                    this.p.a(b.a(view), b.a(b2), b.a(b3));
                    this.p.c(b.a(view));
                }
            } catch (RemoteException e2) {
                qc.c("Failed to call prepareAd", e2);
            }
            this.t = false;
        }
    }

    public final void a(aa0 aa0) {
        synchronized (this.u) {
            this.s = aa0;
        }
    }

    @Override // com.google.android.gms.internal.ads.aa0, com.google.android.gms.internal.ads.fa0
    public final void a(qc0 qc0) {
        synchronized (this.u) {
            if (this.s != null) {
                this.s.a(qc0);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.aa0, com.google.android.gms.internal.ads.fa0
    public final void b(View view, Map<String, WeakReference<View>> map) {
        ca0 ca0;
        y.a("recordImpression must be called on the main UI thread.");
        synchronized (this.u) {
            this.f4297j = true;
            if (this.s != null) {
                this.s.b(view, map);
                this.r.c();
            } else {
                try {
                    if (this.q != null && !this.q.G()) {
                        this.q.c();
                        ca0 = this.r;
                    } else if (this.o != null && !this.o.G()) {
                        this.o.c();
                        ca0 = this.r;
                    } else if (this.p != null && !this.p.G()) {
                        this.p.c();
                        ca0 = this.r;
                    }
                    ca0.c();
                } catch (RemoteException e2) {
                    qc.c("Failed to call recordImpression", e2);
                }
            }
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.u) {
            z = this.t;
        }
        return z;
    }

    public final aa0 d() {
        aa0 aa0;
        synchronized (this.u) {
            aa0 = this.s;
        }
        return aa0;
    }
}
