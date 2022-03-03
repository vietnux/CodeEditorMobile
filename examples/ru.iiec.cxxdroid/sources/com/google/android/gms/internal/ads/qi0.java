package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.b;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.a;
import com.google.android.gms.ads.mediation.customevent.c;
import com.google.android.gms.ads.mediation.j;
import java.util.Map;

@k2
public final class qi0 extends si0 {

    /* renamed from: b  reason: collision with root package name */
    private Map<Class<? extends j>, j> f5344b;

    static {
        new kk0();
    }

    private final <NetworkExtrasT extends f, ServerParametersT extends e> ui0 o(String str) {
        try {
            Class<?> cls = Class.forName(str, false, qi0.class.getClassLoader());
            if (b.class.isAssignableFrom(cls)) {
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new uj0(bVar, (f) this.f5344b.get(bVar.getAdditionalParametersType()));
            } else if (com.google.android.gms.ads.mediation.b.class.isAssignableFrom(cls)) {
                return new pj0((com.google.android.gms.ads.mediation.b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                qc.d(sb.toString());
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            return p(str);
        }
    }

    private final ui0 p(String str) {
        try {
            qc.b("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new pj0(new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                return new pj0(new AdUrlAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new pj0(new CustomEventAdapter());
            }
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                return new uj0(customEventAdapter, (c) this.f5344b.get(customEventAdapter.getAdditionalParametersType()));
            }
            throw new RemoteException();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(". ");
            qc.c(sb.toString(), th);
        }
    }

    public final void a(Map<Class<? extends j>, j> map) {
        this.f5344b = map;
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public final gk0 g(String str) {
        return kk0.a(str);
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public final ui0 h(String str) {
        return o(str);
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public final boolean k(String str) {
        try {
            return a.class.isAssignableFrom(Class.forName(str, false, qi0.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", assuming old implementation.");
            qc.d(sb.toString());
            return false;
        }
    }
}
