package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.kl;
import com.google.android.gms.internal.ads.wm;
import com.google.android.gms.internal.ads.xl;
import java.security.GeneralSecurityException;
import java.util.Arrays;

final class bl implements io {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3926b;

    /* renamed from: c  reason: collision with root package name */
    private xl f3927c;

    /* renamed from: d  reason: collision with root package name */
    private gl f3928d;

    /* renamed from: e  reason: collision with root package name */
    private int f3929e;

    bl(hn hnVar) {
        this.a = hnVar.i();
        if (this.a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zl a2 = zl.a(hnVar.j());
                this.f3927c = (xl) fk.b(hnVar);
                this.f3926b = a2.i();
            } catch (sr e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        } else if (this.a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                il a3 = il.a(hnVar.j());
                this.f3928d = (gl) fk.b(hnVar);
                this.f3929e = a3.i().i();
                this.f3926b = this.f3929e + a3.j().i();
            } catch (sr e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e3);
            }
        } else {
            String valueOf = String.valueOf(this.a);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }

    @Override // com.google.android.gms.internal.ads.io
    public final int a() {
        return this.f3926b;
    }

    @Override // com.google.android.gms.internal.ads.io
    public final pj a(byte[] bArr) {
        ss ssVar;
        if (bArr.length == this.f3926b) {
            if (this.a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                xl.a k2 = xl.k();
                k2.a((mr) this.f3927c);
                xl.a aVar = k2;
                aVar.a(fq.a(bArr, 0, this.f3926b));
                ssVar = (xl) aVar.h();
            } else if (this.a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f3929e);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f3929e, this.f3926b);
                kl.a o = kl.o();
                o.a((mr) this.f3928d.j());
                kl.a aVar2 = o;
                aVar2.a(fq.a(copyOfRange));
                wm.a o2 = wm.o();
                o2.a((mr) this.f3928d.k());
                wm.a aVar3 = o2;
                aVar3.a(fq.a(copyOfRange2));
                gl.a o3 = gl.o();
                o3.a(this.f3928d.i());
                o3.a((kl) aVar2.h());
                o3.a((wm) aVar3.h());
                ssVar = (gl) o3.h();
            } else {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            return (pj) fk.b(this.a, ssVar);
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }
}
