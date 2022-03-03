package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.g;
import com.google.android.gms.ads.k;
import com.google.android.gms.ads.l;
import com.google.android.gms.ads.m.c;
import com.google.android.gms.internal.ads.r40;
import e.b.b.a.b.b;
import java.util.concurrent.atomic.AtomicBoolean;

@k2
public final class y60 {
    private final qi0 a;

    /* renamed from: b  reason: collision with root package name */
    private final k f6076b;

    /* renamed from: c  reason: collision with root package name */
    private final c50 f6077c;

    /* renamed from: d  reason: collision with root package name */
    private d40 f6078d;

    /* renamed from: e  reason: collision with root package name */
    private a f6079e;

    /* renamed from: f  reason: collision with root package name */
    private d[] f6080f;

    /* renamed from: g  reason: collision with root package name */
    private com.google.android.gms.ads.m.a f6081g;

    /* renamed from: h  reason: collision with root package name */
    private g f6082h;

    /* renamed from: i  reason: collision with root package name */
    private r50 f6083i;

    /* renamed from: j  reason: collision with root package name */
    private c f6084j;

    /* renamed from: k  reason: collision with root package name */
    private l f6085k;

    /* renamed from: l  reason: collision with root package name */
    private String f6086l;

    /* renamed from: m  reason: collision with root package name */
    private ViewGroup f6087m;
    private int n;
    private boolean o;

    public y60(ViewGroup viewGroup, int i2) {
        this(viewGroup, null, false, m40.a, i2);
    }

    private y60(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, m40 m40, int i2) {
        this(viewGroup, attributeSet, z, m40, null, i2);
    }

    private y60(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, m40 m40, r50 r50, int i2) {
        this.a = new qi0();
        this.f6076b = new k();
        this.f6077c = new z60(this);
        this.f6087m = viewGroup;
        this.f6083i = null;
        new AtomicBoolean(false);
        this.n = i2;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                q40 q40 = new q40(context, attributeSet);
                this.f6080f = q40.a(z);
                this.f6086l = q40.a();
                if (viewGroup.isInEditMode()) {
                    fc b2 = a50.b();
                    d dVar = this.f6080f[0];
                    int i3 = this.n;
                    n40 n40 = new n40(context, dVar);
                    n40.f5055k = a(i3);
                    b2.a(viewGroup, n40, "Ads by Google");
                }
            } catch (IllegalArgumentException e2) {
                a50.b().a(viewGroup, new n40(context, d.f3103d), e2.getMessage(), e2.getMessage());
            }
        }
    }

    private static n40 a(Context context, d[] dVarArr, int i2) {
        n40 n40 = new n40(context, dVarArr);
        n40.f5055k = a(i2);
        return n40;
    }

    private static boolean a(int i2) {
        return i2 == 1;
    }

    public final void a() {
        try {
            if (this.f6083i != null) {
                this.f6083i.destroy();
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(a aVar) {
        this.f6079e = aVar;
        this.f6077c.a(aVar);
    }

    public final void a(g gVar) {
        this.f6082h = gVar;
        try {
            if (this.f6083i != null) {
                r50 r50 = this.f6083i;
                if (this.f6082h == null) {
                    r50.b((g60) null);
                } else {
                    this.f6082h.a();
                    throw null;
                }
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(l lVar) {
        this.f6085k = lVar;
        try {
            if (this.f6083i != null) {
                this.f6083i.a(lVar == null ? null : new t70(lVar));
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(com.google.android.gms.ads.m.a aVar) {
        try {
            this.f6081g = aVar;
            if (this.f6083i != null) {
                this.f6083i.a(aVar != null ? new p40(aVar) : null);
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(c cVar) {
        this.f6084j = cVar;
        try {
            if (this.f6083i != null) {
                this.f6083i.a(cVar != null ? new h90(cVar) : null);
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(d40 d40) {
        try {
            this.f6078d = d40;
            if (this.f6083i != null) {
                this.f6083i.a(d40 != null ? new e40(d40) : null);
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(w60 w60) {
        try {
            if (this.f6083i == null) {
                if ((this.f6080f == null || this.f6086l == null) && this.f6083i == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f6087m.getContext();
                n40 a2 = a(context, this.f6080f, this.n);
                this.f6083i = (r50) ("search_v2".equals(a2.f5046b) ? r40.a(context, false, (r40.a) new t40(a50.c(), context, a2, this.f6086l)) : r40.a(context, false, (r40.a) new s40(a50.c(), context, a2, this.f6086l, this.a)));
                this.f6083i.b(new f40(this.f6077c));
                if (this.f6078d != null) {
                    this.f6083i.a(new e40(this.f6078d));
                }
                if (this.f6081g != null) {
                    this.f6083i.a(new p40(this.f6081g));
                }
                if (this.f6084j != null) {
                    this.f6083i.a(new h90(this.f6084j));
                }
                if (this.f6082h == null) {
                    if (this.f6085k != null) {
                        this.f6083i.a(new t70(this.f6085k));
                    }
                    this.f6083i.i(this.o);
                    try {
                        e.b.b.a.b.a T0 = this.f6083i.T0();
                        if (T0 != null) {
                            this.f6087m.addView((View) b.y(T0));
                        }
                    } catch (RemoteException e2) {
                        qc.d("#007 Could not call remote method.", e2);
                    }
                } else {
                    this.f6082h.a();
                    throw null;
                }
            }
            if (this.f6083i.b(m40.a(this.f6087m.getContext(), w60))) {
                this.a.a(w60.l());
            }
        } catch (RemoteException e3) {
            qc.d("#007 Could not call remote method.", e3);
        }
    }

    public final void a(String str) {
        if (this.f6086l == null) {
            this.f6086l = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public final void a(boolean z) {
        this.o = z;
        try {
            if (this.f6083i != null) {
                this.f6083i.i(this.o);
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(d... dVarArr) {
        if (this.f6080f == null) {
            b(dVarArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public final a b() {
        return this.f6079e;
    }

    public final void b(d... dVarArr) {
        this.f6080f = dVarArr;
        try {
            if (this.f6083i != null) {
                this.f6083i.a(a(this.f6087m.getContext(), this.f6080f, this.n));
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
        this.f6087m.requestLayout();
    }

    public final d c() {
        n40 B0;
        try {
            if (!(this.f6083i == null || (B0 = this.f6083i.B0()) == null)) {
                return B0.t();
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
        d[] dVarArr = this.f6080f;
        if (dVarArr != null) {
            return dVarArr[0];
        }
        return null;
    }

    public final d[] d() {
        return this.f6080f;
    }

    public final String e() {
        r50 r50;
        if (this.f6086l == null && (r50 = this.f6083i) != null) {
            try {
                this.f6086l = r50.k0();
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
        return this.f6086l;
    }

    public final com.google.android.gms.ads.m.a f() {
        return this.f6081g;
    }

    public final String g() {
        try {
            if (this.f6083i != null) {
                return this.f6083i.m0();
            }
            return null;
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
            return null;
        }
    }

    public final c h() {
        return this.f6084j;
    }

    public final k i() {
        return this.f6076b;
    }

    public final l j() {
        return this.f6085k;
    }

    public final void k() {
        try {
            if (this.f6083i != null) {
                this.f6083i.y();
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    public final void l() {
        try {
            if (this.f6083i != null) {
                this.f6083i.E();
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    public final o60 m() {
        r50 r50 = this.f6083i;
        if (r50 == null) {
            return null;
        }
        try {
            return r50.getVideoController();
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
            return null;
        }
    }
}
