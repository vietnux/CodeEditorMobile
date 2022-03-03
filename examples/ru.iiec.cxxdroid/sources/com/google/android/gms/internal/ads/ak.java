package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class ak {
    private static final CopyOnWriteArrayList<zj> a = new CopyOnWriteArrayList<>();

    public static zj a(String str) {
        Iterator<zj> it = a.iterator();
        while (it.hasNext()) {
            zj next = it.next();
            if (next.a(str)) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
