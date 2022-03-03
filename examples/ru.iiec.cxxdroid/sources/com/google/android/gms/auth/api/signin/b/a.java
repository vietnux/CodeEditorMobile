package com.google.android.gms.auth.api.signin.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.y;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final Lock f3453c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    private static a f3454d;
    private final Lock a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f3455b;

    private a(Context context) {
        this.f3455b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        y.a(context);
        f3453c.lock();
        try {
            if (f3454d == null) {
                f3454d = new a(context.getApplicationContext());
            }
            return f3454d;
        } finally {
            f3453c.unlock();
        }
    }

    private static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    private final GoogleSignInAccount b(String str) {
        String a2;
        if (!TextUtils.isEmpty(str) && (a2 = a(a("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.c(a2);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public GoogleSignInAccount a() {
        return b(a("defaultGoogleSignInAccount"));
    }

    /* access modifiers changed from: protected */
    public String a(String str) {
        this.a.lock();
        try {
            return this.f3455b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }
}
