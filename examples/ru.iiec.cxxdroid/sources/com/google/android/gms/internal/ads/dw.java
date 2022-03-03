package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class dw {
    private static boolean a = false;

    /* renamed from: b  reason: collision with root package name */
    private static MessageDigest f4134b;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f4135c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final Object f4136d = new Object();

    /* renamed from: e  reason: collision with root package name */
    static CountDownLatch f4137e = new CountDownLatch(1);

    private static xp a(long j2) {
        xp xpVar = new xp();
        xpVar.v = 4096L;
        return xpVar;
    }

    static String a(xp xpVar, String str) {
        byte[] bArr;
        byte[] a2 = iv.a(xpVar);
        if (((Boolean) a50.g().a(k80.K1)).booleanValue()) {
            Vector<byte[]> a3 = a(a2, 255);
            if (a3 == null || a3.size() == 0) {
                bArr = a(iv.a(a(4096)), str, true);
            } else {
                zv zvVar = new zv();
                zvVar.f6221c = new byte[a3.size()][];
                Iterator<byte[]> it = a3.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    zvVar.f6221c[i2] = a(it.next(), str, false);
                    i2++;
                }
                zvVar.f6222d = a(a2);
                bArr = iv.a(zvVar);
            }
        } else if (zx.a != null) {
            byte[] a4 = zx.a.a(a2, str != null ? str.getBytes() : new byte[0]);
            zv zvVar2 = new zv();
            zvVar2.f6221c = new byte[][]{a4};
            zvVar2.f6224f = 2;
            bArr = iv.a(zvVar2);
        } else {
            throw new GeneralSecurityException();
        }
        return bw.a(bArr, true);
    }

    private static Vector<byte[]> a(byte[] bArr, int i2) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector<byte[]> vector = new Vector<>();
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i4, bArr.length - i4 > 255 ? i4 + 255 : bArr.length));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    static void a() {
        synchronized (f4136d) {
            if (!a) {
                a = true;
                new Thread(new fw()).start();
            }
        }
    }

    public static byte[] a(byte[] bArr) {
        byte[] digest;
        synchronized (f4135c) {
            MessageDigest b2 = b();
            if (b2 != null) {
                b2.reset();
                b2.update(bArr);
                digest = f4134b.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }

    private static byte[] a(byte[] bArr, String str, boolean z) {
        ByteBuffer byteBuffer;
        int i2 = z ? 239 : 255;
        if (bArr.length > i2) {
            bArr = iv.a(a(4096));
        }
        if (bArr.length < i2) {
            byte[] bArr2 = new byte[(i2 - bArr.length)];
            new SecureRandom().nextBytes(bArr2);
            byteBuffer = ByteBuffer.allocate(i2 + 1).put((byte) bArr.length).put(bArr).put(bArr2);
        } else {
            byteBuffer = ByteBuffer.allocate(i2 + 1).put((byte) bArr.length).put(bArr);
        }
        byte[] array = byteBuffer.array();
        if (z) {
            array = ByteBuffer.allocate(256).put(a(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        for (iw iwVar : new gw().N2) {
            iwVar.a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new tp(str.getBytes("UTF-8")).a(bArr3);
        }
        return bArr3;
    }

    private static MessageDigest b() {
        boolean z;
        MessageDigest messageDigest;
        a();
        try {
            z = f4137e.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (z && (messageDigest = f4134b) != null) {
            return messageDigest;
        }
        return null;
    }
}
