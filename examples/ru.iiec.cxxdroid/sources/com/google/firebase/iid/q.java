package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import c.e.a;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class q {
    private final SharedPreferences a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f6649b;

    /* renamed from: c  reason: collision with root package name */
    private final i0 f6650c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, j0> f6651d;

    public q(Context context) {
        this(context, new i0());
    }

    private q(Context context, i0 i0Var) {
        this.f6651d = new a();
        this.f6649b = context;
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f6650c = i0Var;
        File file = new File(c.h.d.a.a(this.f6649b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !c()) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    b();
                    FirebaseInstanceId.i().f();
                }
            } catch (IOException e2) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e2.getMessage());
                    Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
                }
            }
        }
    }

    static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    private static String b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    private final synchronized boolean c() {
        return this.a.getAll().isEmpty();
    }

    public final synchronized r a(String str, String str2, String str3) {
        return r.b(this.a.getString(b(str, str2, str3), null));
    }

    public final synchronized String a() {
        String string = this.a.getString("topic_operaion_queue", null);
        if (string != null) {
            String[] split = string.split(",");
            if (split.length > 1 && !TextUtils.isEmpty(split[1])) {
                return split[1];
            }
        }
        return null;
    }

    public final synchronized void a(String str, String str2, String str3, String str4, String str5) {
        String a2 = r.a(str4, str5, System.currentTimeMillis());
        if (a2 != null) {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putString(b(str, str2, str3), a2);
            edit.commit();
        }
    }

    public final synchronized boolean a(String str) {
        boolean z;
        String string = this.a.getString("topic_operaion_queue", "");
        String valueOf = String.valueOf(str);
        if (string.startsWith(valueOf.length() != 0 ? ",".concat(valueOf) : new String(","))) {
            String valueOf2 = String.valueOf(str);
            this.a.edit().putString("topic_operaion_queue", string.substring((valueOf2.length() != 0 ? ",".concat(valueOf2) : new String(",")).length())).apply();
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized j0 b(String str) {
        j0 j0Var;
        j0 j0Var2 = this.f6651d.get(str);
        if (j0Var2 != null) {
            return j0Var2;
        }
        try {
            j0Var = this.f6650c.a(this.f6649b, str);
        } catch (k0 unused) {
            Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
            FirebaseInstanceId.i().f();
            j0Var = this.f6650c.b(this.f6649b, str);
        }
        this.f6651d.put(str, j0Var);
        return j0Var;
    }

    public final synchronized void b() {
        this.f6651d.clear();
        i0.a(this.f6649b);
        this.a.edit().clear().commit();
    }

    public final synchronized void c(String str) {
        String concat = String.valueOf(str).concat("|T|");
        SharedPreferences.Editor edit = this.a.edit();
        for (String str2 : this.a.getAll().keySet()) {
            if (str2.startsWith(concat)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }
}
