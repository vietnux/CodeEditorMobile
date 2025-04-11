package com.google.android.gms.internal.ads;

import java.math.BigInteger;

@k2
public final class c9 {
    private BigInteger a = BigInteger.ONE;

    public final synchronized String a() {
        String bigInteger;
        bigInteger = this.a.toString();
        this.a = this.a.add(BigInteger.ONE);
        return bigInteger;
    }
}
