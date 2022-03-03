package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class mo {
    private ECPublicKey a;

    public mo(ECPublicKey eCPublicKey) {
        this.a = eCPublicKey;
    }

    public final no a(String str, byte[] bArr, byte[] bArr2, int i2, ro roVar) {
        byte[] bArr3;
        KeyPair a2 = oo.a(this.a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) a2.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) a2.getPrivate();
        ECPublicKey eCPublicKey2 = this.a;
        ECParameterSpec params = eCPublicKey2.getParams();
        ECParameterSpec params2 = eCPrivateKey.getParams();
        if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
            throw new GeneralSecurityException("invalid public key spec");
        }
        byte[] a3 = oo.a(eCPrivateKey, eCPublicKey2.getW());
        EllipticCurve curve = eCPublicKey.getParams().getCurve();
        ECPoint w = eCPublicKey.getW();
        oo.a(w, curve);
        int b2 = oo.b(curve);
        int i3 = po.a[roVar.ordinal()];
        int i4 = 1;
        if (i3 == 1) {
            int i5 = (b2 * 2) + 1;
            byte[] bArr4 = new byte[i5];
            byte[] byteArray = w.getAffineX().toByteArray();
            byte[] byteArray2 = w.getAffineY().toByteArray();
            System.arraycopy(byteArray2, 0, bArr4, i5 - byteArray2.length, byteArray2.length);
            System.arraycopy(byteArray, 0, bArr4, (b2 + 1) - byteArray.length, byteArray.length);
            bArr4[0] = 4;
            bArr3 = bArr4;
        } else if (i3 == 2) {
            int i6 = b2 + 1;
            bArr3 = new byte[i6];
            byte[] byteArray3 = w.getAffineX().toByteArray();
            System.arraycopy(byteArray3, 0, bArr3, i6 - byteArray3.length, byteArray3.length);
            bArr3[0] = (byte) (w.getAffineY().testBit(0) ? 3 : 2);
        } else {
            String valueOf = String.valueOf(roVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("invalid format:");
            sb.append(valueOf);
            throw new GeneralSecurityException(sb.toString());
        }
        byte[] a4 = fo.a(bArr3, a3);
        Mac a5 = to.f5646g.a(str);
        if (i2 <= a5.getMacLength() * 255) {
            if (bArr == null || bArr.length == 0) {
                a5.init(new SecretKeySpec(new byte[a5.getMacLength()], str));
            } else {
                a5.init(new SecretKeySpec(bArr, str));
            }
            byte[] doFinal = a5.doFinal(a4);
            byte[] bArr5 = new byte[i2];
            a5.init(new SecretKeySpec(doFinal, str));
            byte[] bArr6 = new byte[0];
            int i7 = 0;
            while (true) {
                a5.update(bArr6);
                a5.update(bArr2);
                a5.update((byte) i4);
                bArr6 = a5.doFinal();
                if (bArr6.length + i7 < i2) {
                    System.arraycopy(bArr6, 0, bArr5, i7, bArr6.length);
                    i7 += bArr6.length;
                    i4++;
                } else {
                    System.arraycopy(bArr6, 0, bArr5, i7, i2 - i7);
                    return new no(bArr3, bArr5);
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }
}
