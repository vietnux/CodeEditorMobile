package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.g;
import com.google.android.gms.ads.m.c;
import com.google.android.gms.ads.m.e;
import com.google.android.gms.ads.p.d;
import com.google.android.gms.internal.ads.r40;

@k2
public final class b70 {
    private final qi0 a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3843b;

    /* renamed from: c  reason: collision with root package name */
    private a f3844c;

    /* renamed from: d  reason: collision with root package name */
    private d40 f3845d;

    /* renamed from: e  reason: collision with root package name */
    private r50 f3846e;

    /* renamed from: f  reason: collision with root package name */
    private String f3847f;

    /* renamed from: g  reason: collision with root package name */
    private d f3848g;

    /* renamed from: h  reason: collision with root package name */
    private com.google.android.gms.ads.m.a f3849h;

    /* renamed from: i  reason: collision with root package name */
    private c f3850i;

    /* renamed from: j  reason: collision with root package name */
    private g f3851j;

    /* renamed from: k  reason: collision with root package name */
    private com.google.android.gms.ads.p.c f3852k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f3853l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f3854m;

    public b70(Context context) {
        this(context, m40.a, null);
    }

    private b70(Context context, m40 m40, e eVar) {
        this.a = new qi0();
        this.f3843b = context;
    }

    private final void b(String str) {
        if (this.f3846e == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
            sb.append("The ad unit ID must be set on InterstitialAd before ");
            sb.append(str);
            sb.append(" is called.");
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void a(a aVar) {
        try {
            this.f3844c = aVar;
            if (this.f3846e != null) {
                this.f3846e.b(aVar != null ? new f40(aVar) : null);
            }
        } catch (RemoteException e2) {
            qc.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(com.google.android.gms.ads.p.c cVar) {
        try {
            this.f3852k = cVar;
            if (this.f3846e != null) {
                this.f3846e.a(cVar != null ? new q6(cVar) : null);
            }
        } catch (RemoteException e2) {
            qc.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(d dVar) {
        try {
            this.f3848g = dVar;
            if (this.f3846e != null) {
                this.f3846e.a(dVar != null ? new i40(dVar) : null);
            }
        } catch (RemoteException e2) {
            qc.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(d40 d40) {
        try {
            this.f3845d = d40;
            if (this.f3846e != null) {
                this.f3846e.a(d40 != null ? new e40(d40) : null);
            }
        } catch (RemoteException e2) {
            qc.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(w60 w60) {
        try {
            if (this.f3846e == null) {
                if (this.f3847f == null) {
                    b("loadAd");
                }
                n40 u = this.f3853l ? n40.u() : new n40();
                r40 c2 = a50.c();
                Context context = this.f3843b;
                this.f3846e = (r50) r40.a(context, false, (r40.a) new u40(c2, context, u, this.f3847f, this.a));
                if (this.f3844c != null) {
                    this.f3846e.b(new f40(this.f3844c));
                }
                if (this.f3845d != null) {
                    this.f3846e.a(new e40(this.f3845d));
                }
                if (this.f3848g != null) {
                    this.f3846e.a(new i40(this.f3848g));
                }
                if (this.f3849h != null) {
                    this.f3846e.a(new p40(this.f3849h));
                }
                if (this.f3850i != null) {
                    this.f3846e.a(new h90(this.f3850i));
                }
                if (this.f3851j == null) {
                    if (this.f3852k != null) {
                        this.f3846e.a(new q6(this.f3852k));
                    }
                    this.f3846e.a(this.f3854m);
                } else {
                    this.f3851j.a();
                    throw null;
                }
            }
            if (this.f3846e.b(m40.a(this.f3843b, w60))) {
                this.a.a(w60.l());
            }
        } catch (RemoteException e2) {
            qc.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(String str) {
        if (this.f3847f == null) {
            this.f3847f = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }

    public final void a(boolean z) {
        try {
            this.f3854m = z;
            if (this.f3846e != null) {
                this.f3846e.a(z);
            }
        } catch (RemoteException e2) {
            qc.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final boolean a() {
        try {
            if (this.f3846e == null) {
                return false;
            }
            return this.f3846e.m1();
        } catch (RemoteException e2) {
            qc.d("#008 Must be called on the main UI thread.", e2);
            return false;
        }
    }

    public final void b() {
        try {
            b("show");
            this.f3846e.showInterstitial();
        } catch (RemoteException e2) {
            qc.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void b(boolean z) {
        this.f3853l = true;
    }

    public final Bundle c() {
        try {
            if (this.f3846e != null) {
                return this.f3846e.q0();
            }
        } catch (RemoteException e2) {
            qc.d("#008 Must be called on the main UI thread.", e2);
        }
        return new Bundle();
    }
}
