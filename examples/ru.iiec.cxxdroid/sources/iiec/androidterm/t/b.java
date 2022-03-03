package iiec.androidterm.t;

import android.content.Context;
import android.preference.PreferenceManager;
import iiec.androidterm.compat.c;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.security.GeneralSecurityException;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class b {
    private static final Pattern a = Pattern.compile(":");

    public static final class a {
        private final SecretKey a;

        /* renamed from: b  reason: collision with root package name */
        private final SecretKey f9449b;

        public a(SecretKey secretKey, SecretKey secretKey2) {
            this.a = secretKey;
            this.f9449b = secretKey2;
        }

        public static a a(String str) {
            String[] split = b.a.split(str);
            if (split.length == 2) {
                return new a(new SecretKeySpec(b.b(split[0]), "AES"), new SecretKeySpec(b.b(split[1]), "HmacSHA256"));
            }
            throw new IllegalArgumentException("Invalid encoded keys!");
        }

        public SecretKey a() {
            return this.a;
        }

        public SecretKey b() {
            return this.f9449b;
        }
    }

    public static a a(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("shortcut_keys", null);
        if (string == null) {
            return null;
        }
        try {
            return a.a(string);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String a(String str, a aVar) {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        String[] split = a.split(str);
        if (split.length == 3) {
            String str2 = split[0];
            String str3 = split[1];
            String str4 = split[2];
            if (a(str3 + ":" + str4, aVar.b()).equals(str2)) {
                instance.init(2, aVar.a(), new IvParameterSpec(b(str3)));
                byte[] doFinal = instance.doFinal(b(str4));
                CharsetDecoder newDecoder = Charset.defaultCharset().newDecoder();
                newDecoder.onMalformedInput(CodingErrorAction.REPORT);
                newDecoder.onUnmappableCharacter(CodingErrorAction.REPORT);
                CharBuffer allocate = CharBuffer.allocate(doFinal.length);
                if (!newDecoder.decode(ByteBuffer.wrap(doFinal), allocate, true).isError()) {
                    newDecoder.flush(allocate);
                    return allocate.flip().toString();
                }
                throw new GeneralSecurityException("Corrupt decrypted data!");
            }
            throw new GeneralSecurityException("Incorrect MAC!");
        }
        throw new GeneralSecurityException("Invalid encrypted data!");
    }

    private static String a(String str, SecretKey secretKey) {
        Mac instance = Mac.getInstance("HmacSHA256");
        instance.init(secretKey);
        return a(instance.doFinal(str.getBytes()));
    }

    private static String a(byte[] bArr) {
        return c.c(bArr, 3);
    }

    /* access modifiers changed from: private */
    public static byte[] b(String str) {
        return c.a(str, 0);
    }
}
