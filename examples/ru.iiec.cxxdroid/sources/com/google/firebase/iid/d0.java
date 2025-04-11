package com.google.firebase.iid;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d0 implements m {
    private final FirebaseInstanceId a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6610b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6611c;

    d0(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.a = firebaseInstanceId;
        this.f6610b = str;
        this.f6611c = str2;
    }

    @Override // com.google.firebase.iid.m
    public final String a() {
        return this.a.b(this.f6610b, this.f6611c);
    }
}
