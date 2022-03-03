package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import c.h.d.a;
import e.b.b.a.c.d.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* access modifiers changed from: package-private */
public final class i0 {
    i0() {
    }

    private static j0 a(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(q.a(str, "|P|"), null);
        String string2 = sharedPreferences.getString(q.a(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        return new j0(a(string, string2), b(sharedPreferences, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.firebase.iid.j0 a(java.io.File r6) {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r6)
            java.util.Properties r6 = new java.util.Properties     // Catch:{ all -> 0x0041 }
            r6.<init>()     // Catch:{ all -> 0x0041 }
            r6.load(r0)     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "pub"
            java.lang.String r1 = r6.getProperty(r1)     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = "pri"
            java.lang.String r2 = r6.getProperty(r2)     // Catch:{ all -> 0x0041 }
            r3 = 0
            if (r1 == 0) goto L_0x003d
            if (r2 != 0) goto L_0x001f
            goto L_0x003d
        L_0x001f:
            java.security.KeyPair r1 = a(r1, r2)     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = "cre"
            java.lang.String r6 = r6.getProperty(r2)     // Catch:{ NumberFormatException -> 0x0036 }
            long r4 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x0036 }
            com.google.firebase.iid.j0 r6 = new com.google.firebase.iid.j0
            r6.<init>(r1, r4)
            a(r3, r0)
            return r6
        L_0x0036:
            r6 = move-exception
            com.google.firebase.iid.k0 r1 = new com.google.firebase.iid.k0
            r1.<init>(r6)
            throw r1
        L_0x003d:
            a(r3, r0)
            return r3
        L_0x0041:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r1 = move-exception
            a(r6, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.i0.a(java.io.File):com.google.firebase.iid.j0");
    }

    private static KeyPair a(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                throw new k0(e2);
            }
        } catch (IllegalArgumentException e3) {
            throw new k0(e3);
        }
    }

    static void a(Context context) {
        File[] listFiles = b(context).listFiles();
        for (File file : listFiles) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        a(r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.content.Context r4, java.lang.String r5, com.google.firebase.iid.j0 r6) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.i0.a(android.content.Context, java.lang.String, com.google.firebase.iid.j0):void");
    }

    private static /* synthetic */ void a(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                g.a(th, th2);
            }
        } else {
            fileInputStream.close();
        }
    }

    private static /* synthetic */ void a(Throwable th, FileOutputStream fileOutputStream) {
        if (th != null) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                g.a(th, th2);
            }
        } else {
            fileOutputStream.close();
        }
    }

    private static long b(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(q.a(str, "cre"), null);
        if (string == null) {
            return 0;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private static File b(Context context) {
        File a = a.a(context);
        if (a != null && a.isDirectory()) {
            return a;
        }
        Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    private final void b(Context context, String str, j0 j0Var) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (j0Var.equals(a(sharedPreferences, str))) {
                return;
            }
        } catch (k0 unused) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to shared preferences");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(q.a(str, "|P|"), j0Var.b());
        edit.putString(q.a(str, "|K|"), j0Var.c());
        edit.putString(q.a(str, "cre"), String.valueOf(j0Var.f6624b));
        edit.commit();
    }

    private final j0 c(Context context, String str) {
        k0 e2;
        try {
            j0 d2 = d(context, str);
            if (d2 != null) {
                b(context, str, d2);
                return d2;
            }
            e2 = null;
            try {
                j0 a = a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (a != null) {
                    a(context, str, a);
                    return a;
                }
            } catch (k0 e3) {
                e2 = e3;
            }
            if (e2 == null) {
                return null;
            }
            throw e2;
        } catch (k0 e4) {
            e2 = e4;
        }
    }

    private final j0 d(Context context, String str) {
        File e2 = e(context, str);
        if (!e2.exists()) {
            return null;
        }
        try {
            return a(e2);
        } catch (IOException e3) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e3);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb.append("Failed to read key from file, retrying: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            try {
                return a(e2);
            } catch (IOException e4) {
                String valueOf2 = String.valueOf(e4);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(valueOf2);
                Log.w("FirebaseInstanceId", sb2.toString());
                throw new k0(e4);
            }
        }
    }

    private static File e(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
        return new File(b(context), str2);
    }

    /* access modifiers changed from: package-private */
    public final j0 a(Context context, String str) {
        j0 c2 = c(context, str);
        return c2 != null ? c2 : b(context, str);
    }

    /* access modifiers changed from: package-private */
    public final j0 b(Context context, String str) {
        j0 j0Var = new j0(b.a(), System.currentTimeMillis());
        try {
            j0 c2 = c(context, str);
            if (c2 != null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
                }
                return c2;
            }
        } catch (k0 unused) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Generated new key");
        }
        a(context, str, j0Var);
        b(context, str, j0Var);
        return j0Var;
    }
}
