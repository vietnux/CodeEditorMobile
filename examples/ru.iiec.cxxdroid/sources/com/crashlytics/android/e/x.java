package com.crashlytics.android.e;

import android.content.Context;
import f.a.a.a.n.b.i;
import f.a.a.a.n.g.p;

class x {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final p f3047b;

    public x(Context context, p pVar) {
        this.a = context;
        this.f3047b = pVar;
    }

    private String a(String str, String str2) {
        return b(i.b(this.a, str), str2);
    }

    private boolean a(String str) {
        return str == null || str.length() == 0;
    }

    private String b(String str, String str2) {
        return a(str) ? str2 : str;
    }

    public String a() {
        return a("com.crashlytics.CrashSubmissionAlwaysSendTitle", this.f3047b.f8576g);
    }

    public String b() {
        return a("com.crashlytics.CrashSubmissionCancelTitle", this.f3047b.f8574e);
    }

    public String c() {
        return a("com.crashlytics.CrashSubmissionPromptMessage", this.f3047b.f8571b);
    }

    public String d() {
        return a("com.crashlytics.CrashSubmissionSendTitle", this.f3047b.f8572c);
    }

    public String e() {
        return a("com.crashlytics.CrashSubmissionPromptTitle", this.f3047b.a);
    }
}
