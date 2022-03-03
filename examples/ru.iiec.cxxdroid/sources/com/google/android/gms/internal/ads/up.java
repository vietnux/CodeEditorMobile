package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.up;
import com.google.android.gms.internal.ads.vp;
import java.io.IOException;

public abstract class up<MessageType extends up<MessageType, BuilderType>, BuilderType extends vp<MessageType, BuilderType>> implements ss {
    private static boolean zzdpg = false;
    protected int zzdpf = 0;

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final fq e() {
        try {
            kq d2 = fq.d(b());
            a(d2.b());
            return d2.a();
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final byte[] f() {
        try {
            byte[] bArr = new byte[b()];
            sq a = sq.a(bArr);
            a(a);
            a.b();
            return bArr;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    /* access modifiers changed from: package-private */
    public int g() {
        throw new UnsupportedOperationException();
    }
}
