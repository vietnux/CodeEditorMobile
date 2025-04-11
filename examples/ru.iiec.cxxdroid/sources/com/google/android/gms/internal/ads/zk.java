package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

final class zk {
    public static qo a(rm rmVar) {
        int i2 = al.f3820b[rmVar.ordinal()];
        if (i2 == 1) {
            return qo.NIST_P256;
        }
        if (i2 == 2) {
            return qo.NIST_P384;
        }
        if (i2 == 3) {
            return qo.NIST_P521;
        }
        String valueOf = String.valueOf(rmVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("unknown curve type: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static ro a(dm dmVar) {
        int i2 = al.f3821c[dmVar.ordinal()];
        if (i2 == 1) {
            return ro.UNCOMPRESSED;
        }
        if (i2 == 2) {
            return ro.COMPRESSED;
        }
        String valueOf = String.valueOf(dmVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("unknown point format: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static String a(um umVar) {
        int i2 = al.a[umVar.ordinal()];
        if (i2 == 1) {
            return "HmacSha1";
        }
        if (i2 == 2) {
            return "HmacSha256";
        }
        if (i2 == 3) {
            return "HmacSha512";
        }
        String valueOf = String.valueOf(umVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("hash unsupported for HMAC: ");
        sb.append(valueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    public static void a(jm jmVar) {
        oo.a(a(jmVar.i().i()));
        a(jmVar.i().j());
        if (jmVar.k() != dm.UNKNOWN_FORMAT) {
            fk.a(jmVar.j().i());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }
}
