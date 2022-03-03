package com.google.android.gms.internal.ads;

import android.os.RemoteException;

@k2
public class kk0 {
    public static gk0 a(String str) {
        try {
            return new lk0((yi) Class.forName(str, false, kk0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }
}
