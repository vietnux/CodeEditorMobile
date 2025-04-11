package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class ex {
    private static Cipher a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f4238b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final Object f4239c = new Object();

    public ex(SecureRandom secureRandom) {
    }

    private static Cipher a() {
        Cipher cipher;
        synchronized (f4239c) {
            if (a == null) {
                a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = a;
        }
        return cipher;
    }

    public final String a(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        if (bArr.length == 16) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f4238b) {
                    a().init(1, secretKeySpec, (SecureRandom) null);
                    doFinal = a().doFinal(bArr2);
                    iv = a().getIV();
                }
                int length = doFinal.length + iv.length;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.put(iv).put(doFinal);
                allocate.flip();
                byte[] bArr3 = new byte[length];
                allocate.get(bArr3);
                return bw.a(bArr3, false);
            } catch (NoSuchAlgorithmException e2) {
                throw new fx(this, e2);
            } catch (InvalidKeyException e3) {
                throw new fx(this, e3);
            } catch (IllegalBlockSizeException e4) {
                throw new fx(this, e4);
            } catch (NoSuchPaddingException e5) {
                throw new fx(this, e5);
            } catch (BadPaddingException e6) {
                throw new fx(this, e6);
            }
        } else {
            throw new fx(this);
        }
    }

    public final byte[] a(String str) {
        try {
            byte[] a2 = bw.a(str, false);
            if (a2.length == 32) {
                byte[] bArr = new byte[16];
                ByteBuffer.wrap(a2, 4, 16).get(bArr);
                for (int i2 = 0; i2 < 16; i2++) {
                    bArr[i2] = (byte) (bArr[i2] ^ 68);
                }
                return bArr;
            }
            throw new fx(this);
        } catch (IllegalArgumentException e2) {
            throw new fx(this, e2);
        }
    }

    public final byte[] a(byte[] bArr, String str) {
        byte[] doFinal;
        if (bArr.length == 16) {
            try {
                byte[] a2 = bw.a(str, false);
                if (a2.length > 16) {
                    ByteBuffer allocate = ByteBuffer.allocate(a2.length);
                    allocate.put(a2);
                    allocate.flip();
                    byte[] bArr2 = new byte[16];
                    byte[] bArr3 = new byte[(a2.length - 16)];
                    allocate.get(bArr2);
                    allocate.get(bArr3);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    synchronized (f4238b) {
                        a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                        doFinal = a().doFinal(bArr3);
                    }
                    return doFinal;
                }
                throw new fx(this);
            } catch (NoSuchAlgorithmException e2) {
                throw new fx(this, e2);
            } catch (InvalidKeyException e3) {
                throw new fx(this, e3);
            } catch (IllegalBlockSizeException e4) {
                throw new fx(this, e4);
            } catch (NoSuchPaddingException e5) {
                throw new fx(this, e5);
            } catch (BadPaddingException e6) {
                throw new fx(this, e6);
            } catch (InvalidAlgorithmParameterException e7) {
                throw new fx(this, e7);
            } catch (IllegalArgumentException e8) {
                throw new fx(this, e8);
            }
        } else {
            throw new fx(this);
        }
    }
}
