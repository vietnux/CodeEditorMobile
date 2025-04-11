package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ln;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class fk {
    private static final Logger a = Logger.getLogger(fk.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentMap<String, xj> f4334b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentMap<String, Boolean> f4335c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentMap<String, rj> f4336d = new ConcurrentHashMap();

    public static <P> cn a(hn hnVar) {
        xj b2 = b(hnVar.i());
        if (f4335c.get(hnVar.i()).booleanValue()) {
            return b2.a(hnVar.j());
        }
        String valueOf = String.valueOf(hnVar.i());
        throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: com.google.android.gms.internal.ads.dk<P> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <P> dk<P> a(yj yjVar, xj<P> xjVar) {
        gk.b(yjVar.a());
        dk<P> dkVar = (dk<P>) new dk();
        for (ln.b bVar : yjVar.a().j()) {
            if (bVar.k() == fn.ENABLED) {
                ek a2 = dkVar.a(a(bVar.j().i(), bVar.j().j()), bVar);
                if (bVar.o() == yjVar.a().i()) {
                    dkVar.a(a2);
                }
            }
        }
        return dkVar;
    }

    public static <P> rj<P> a(String str) {
        String str2;
        String str3;
        if (str != null) {
            rj<P> rjVar = f4336d.get(str.toLowerCase());
            if (rjVar != null) {
                return rjVar;
            }
            String format = String.format("no catalogue found for %s. ", str);
            if (str.toLowerCase().startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.init().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call DeterministicAeadConfig.init().";
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call StreamingAeadConfig.init().";
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call HybridConfig.init().";
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call MacConfig.init().";
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call SignatureConfig.init().";
            } else {
                if (str.toLowerCase().startsWith("tink")) {
                    str2 = String.valueOf(format);
                    str3 = "Maybe call TinkConfig.init().";
                }
                throw new GeneralSecurityException(format);
            }
            format = str2.concat(str3);
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    public static <P> ss a(String str, ss ssVar) {
        xj b2 = b(str);
        if (f4335c.get(str).booleanValue()) {
            return b2.a(ssVar);
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
    }

    private static <P> P a(String str, fq fqVar) {
        return (P) b(str).c(fqVar);
    }

    public static <P> P a(String str, byte[] bArr) {
        return (P) a(str, fq.a(bArr));
    }

    public static synchronized <P> void a(String str, rj<P> rjVar) {
        synchronized (fk.class) {
            if (!f4336d.containsKey(str.toLowerCase()) || rjVar.getClass().equals(f4336d.get(str.toLowerCase()).getClass())) {
                f4336d.put(str.toLowerCase(), rjVar);
            } else {
                Logger logger = a;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(str);
                logger.logp(level, "com.google.crypto.tink.Registry", "addCatalogue", valueOf.length() != 0 ? "Attempted overwrite of a catalogueName catalogue for name ".concat(valueOf) : new String("Attempted overwrite of a catalogueName catalogue for name "));
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
                sb.append("catalogue for name ");
                sb.append(str);
                sb.append(" has been already registered");
                throw new GeneralSecurityException(sb.toString());
            }
        }
    }

    public static <P> void a(String str, xj<P> xjVar) {
        a(str, xjVar, true);
    }

    public static synchronized <P> void a(String str, xj<P> xjVar, boolean z) {
        synchronized (fk.class) {
            if (xjVar != null) {
                if (f4334b.containsKey(str)) {
                    xj b2 = b(str);
                    boolean booleanValue = f4335c.get(str).booleanValue();
                    if (!xjVar.getClass().equals(b2.getClass()) || (!booleanValue && z)) {
                        Logger logger = a;
                        Level level = Level.WARNING;
                        String valueOf = String.valueOf(str);
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerKeyManager", valueOf.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(valueOf) : new String("Attempted overwrite of a registered key manager for key type "));
                        throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, b2.getClass().getName(), xjVar.getClass().getName()));
                    }
                }
                f4334b.put(str, xjVar);
                f4335c.put(str, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    public static <P> ss b(hn hnVar) {
        xj b2 = b(hnVar.i());
        if (f4335c.get(hnVar.i()).booleanValue()) {
            return b2.b(hnVar.j());
        }
        String valueOf = String.valueOf(hnVar.i());
        throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
    }

    private static <P> xj<P> b(String str) {
        xj<P> xjVar = f4334b.get(str);
        if (xjVar != null) {
            return xjVar;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
        sb.append("No key manager found for key type: ");
        sb.append(str);
        sb.append(".  Check the configuration of the registry.");
        throw new GeneralSecurityException(sb.toString());
    }

    public static <P> P b(String str, ss ssVar) {
        return (P) b(str).b(ssVar);
    }
}
