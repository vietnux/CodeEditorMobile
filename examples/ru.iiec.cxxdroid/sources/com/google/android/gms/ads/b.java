package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.n.d;
import com.google.android.gms.ads.n.g;
import com.google.android.gms.ads.n.h;
import com.google.android.gms.ads.n.i;
import com.google.android.gms.ads.n.k;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.ad0;
import com.google.android.gms.internal.ads.cd0;
import com.google.android.gms.internal.ads.dd0;
import com.google.android.gms.internal.ads.f40;
import com.google.android.gms.internal.ads.j50;
import com.google.android.gms.internal.ads.m40;
import com.google.android.gms.internal.ads.m50;
import com.google.android.gms.internal.ads.na0;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.qi0;
import com.google.android.gms.internal.ads.w60;
import com.google.android.gms.internal.ads.yc0;
import com.google.android.gms.internal.ads.zc0;

public class b {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final j50 f3101b;

    public static class a {
        private final Context a;

        /* renamed from: b  reason: collision with root package name */
        private final m50 f3102b;

        private a(Context context, m50 m50) {
            this.a = context;
            this.f3102b = m50;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(Context context, String str) {
            this(context, a50.c().a(context, str, new qi0()));
            y.a(context, "context cannot be null");
        }

        public a a(a aVar) {
            try {
                this.f3102b.a(new f40(aVar));
            } catch (RemoteException e2) {
                qc.c("Failed to set AdListener.", e2);
            }
            return this;
        }

        public a a(d dVar) {
            try {
                this.f3102b.a(new na0(dVar));
            } catch (RemoteException e2) {
                qc.c("Failed to specify native ad options", e2);
            }
            return this;
        }

        public a a(g.a aVar) {
            try {
                this.f3102b.a(new yc0(aVar));
            } catch (RemoteException e2) {
                qc.c("Failed to add app install ad listener", e2);
            }
            return this;
        }

        public a a(h.a aVar) {
            try {
                this.f3102b.a(new zc0(aVar));
            } catch (RemoteException e2) {
                qc.c("Failed to add content ad listener", e2);
            }
            return this;
        }

        public a a(k.a aVar) {
            try {
                this.f3102b.a(new dd0(aVar));
            } catch (RemoteException e2) {
                qc.c("Failed to add google native ad listener", e2);
            }
            return this;
        }

        public a a(String str, i.b bVar, i.a aVar) {
            try {
                this.f3102b.a(str, new cd0(bVar), aVar == null ? null : new ad0(aVar));
            } catch (RemoteException e2) {
                qc.c("Failed to add custom template ad listener", e2);
            }
            return this;
        }

        public b a() {
            try {
                return new b(this.a, this.f3102b.N0());
            } catch (RemoteException e2) {
                qc.b("Failed to build AdLoader.", e2);
                return null;
            }
        }
    }

    b(Context context, j50 j50) {
        this(context, j50, m40.a);
    }

    private b(Context context, j50 j50, m40 m40) {
        this.a = context;
        this.f3101b = j50;
    }

    private final void a(w60 w60) {
        try {
            this.f3101b.a(m40.a(this.a, w60));
        } catch (RemoteException e2) {
            qc.b("Failed to load ad.", e2);
        }
    }

    public void a(c cVar) {
        a(cVar.a());
    }
}
