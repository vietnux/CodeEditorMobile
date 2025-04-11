package com.crashlytics.android.d;

import java.io.InputStream;
import java.util.Properties;

/* access modifiers changed from: package-private */
public class d {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2893b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2894c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2895d;

    d(String str, String str2, String str3, String str4) {
        this.a = str;
        this.f2893b = str2;
        this.f2894c = str3;
        this.f2895d = str4;
    }

    public static d a(InputStream inputStream) {
        Properties properties = new Properties();
        properties.load(inputStream);
        return a(properties);
    }

    public static d a(Properties properties) {
        return new d(properties.getProperty("version_code"), properties.getProperty("version_name"), properties.getProperty("build_id"), properties.getProperty("package_name"));
    }
}
