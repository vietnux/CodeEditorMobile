package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.n;
import e.b.c.a;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public final class g {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private String f6620b;

    /* renamed from: c  reason: collision with root package name */
    private String f6621c;

    /* renamed from: d  reason: collision with root package name */
    private int f6622d;

    /* renamed from: e  reason: collision with root package name */
    private int f6623e = 0;

    public g(Context context) {
        this.a = context;
    }

    private final PackageInfo a(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public static String a(a aVar) {
        String b2 = aVar.c().b();
        if (b2 != null) {
            return b2;
        }
        String a2 = aVar.c().a();
        if (!a2.startsWith("1:")) {
            return a2;
        }
        String[] split = a2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static String a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private final synchronized void e() {
        PackageInfo a2 = a(this.a.getPackageName());
        if (a2 != null) {
            this.f6620b = Integer.toString(a2.versionCode);
            this.f6621c = a2.versionName;
        }
    }

    public final synchronized int a() {
        PackageInfo a2;
        if (this.f6622d == 0 && (a2 = a("com.google.android.gms")) != null) {
            this.f6622d = a2.versionCode;
        }
        return this.f6622d;
    }

    public final synchronized int b() {
        if (this.f6623e != 0) {
            return this.f6623e;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!n.l()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f6623e = 1;
                return this.f6623e;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (n.l()) {
                this.f6623e = 2;
            } else {
                this.f6623e = 1;
            }
            return this.f6623e;
        }
        this.f6623e = 2;
        return this.f6623e;
    }

    public final synchronized String c() {
        if (this.f6620b == null) {
            e();
        }
        return this.f6620b;
    }

    public final synchronized String d() {
        if (this.f6621c == null) {
            e();
        }
        return this.f6621c;
    }
}
