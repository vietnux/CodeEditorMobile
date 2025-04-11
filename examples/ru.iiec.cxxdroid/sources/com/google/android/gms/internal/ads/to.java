package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.uo;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public final class to<T_WRAPPER extends uo<T_ENGINE>, T_ENGINE> {

    /* renamed from: d  reason: collision with root package name */
    private static final Logger f5643d = Logger.getLogger(to.class.getName());

    /* renamed from: e  reason: collision with root package name */
    private static final List<Provider> f5644e;

    /* renamed from: f  reason: collision with root package name */
    public static final to<wo, Cipher> f5645f = new to<>(new wo());

    /* renamed from: g  reason: collision with root package name */
    public static final to<ap, Mac> f5646g = new to<>(new ap());

    /* renamed from: h  reason: collision with root package name */
    public static final to<xo, KeyAgreement> f5647h = new to<>(new xo());

    /* renamed from: i  reason: collision with root package name */
    public static final to<zo, KeyPairGenerator> f5648i = new to<>(new zo());

    /* renamed from: j  reason: collision with root package name */
    public static final to<yo, KeyFactory> f5649j = new to<>(new yo());
    private T_WRAPPER a;

    /* renamed from: b  reason: collision with root package name */
    private List<Provider> f5650b = f5644e;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5651c = true;

    static {
        if (lp.a()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 2; i2++) {
                String str = strArr[i2];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f5643d.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
                }
            }
            f5644e = arrayList;
        } else {
            f5644e = new ArrayList();
        }
        new to(new cp());
        new to(new bp());
    }

    private to(T_WRAPPER t_wrapper) {
        this.a = t_wrapper;
    }

    private final boolean a(String str, Provider provider) {
        try {
            this.a.a(str, provider);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final T_ENGINE a(String str) {
        T_WRAPPER t_wrapper;
        Provider provider;
        Iterator<Provider> it = this.f5650b.iterator();
        while (true) {
            if (it.hasNext()) {
                provider = it.next();
                if (a(str, provider)) {
                    t_wrapper = this.a;
                    break;
                }
            } else if (this.f5651c) {
                t_wrapper = this.a;
                provider = null;
            } else {
                throw new GeneralSecurityException("No good Provider found.");
            }
        }
        return (T_ENGINE) t_wrapper.a(str, provider);
    }
}
