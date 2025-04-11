package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

@k2
public abstract class a80<T> {
    private final int a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3771b;

    /* renamed from: c  reason: collision with root package name */
    private final T f3772c;

    private a80(int i2, String str, T t) {
        this.a = i2;
        this.f3771b = str;
        this.f3772c = t;
        a50.f().a(this);
    }

    /* synthetic */ a80(int i2, String str, Object obj, b80 b80) {
        this(i2, str, obj);
    }

    public static a80<String> a(int i2, String str) {
        a80<String> a2 = a(i2, str, (String) null);
        a50.f().b(a2);
        return a2;
    }

    public static a80<Float> a(int i2, String str, float f2) {
        return new e80(i2, str, Float.valueOf(f2));
    }

    public static a80<Integer> a(int i2, String str, int i3) {
        return new c80(i2, str, Integer.valueOf(i3));
    }

    public static a80<Long> a(int i2, String str, long j2) {
        return new d80(i2, str, Long.valueOf(j2));
    }

    public static a80<Boolean> a(int i2, String str, Boolean bool) {
        return new b80(i2, str, bool);
    }

    public static a80<String> a(int i2, String str, String str2) {
        return new f80(i2, str, str2);
    }

    public static a80<String> b(int i2, String str) {
        a80<String> a2 = a(i2, str, (String) null);
        a50.f().c(a2);
        return a2;
    }

    /* access modifiers changed from: protected */
    public abstract T a(SharedPreferences sharedPreferences);

    /* access modifiers changed from: protected */
    public abstract T a(JSONObject jSONObject);

    public final String a() {
        return this.f3771b;
    }

    public abstract void a(SharedPreferences.Editor editor, T t);

    public final int b() {
        return this.a;
    }

    public final T c() {
        return this.f3772c;
    }
}
