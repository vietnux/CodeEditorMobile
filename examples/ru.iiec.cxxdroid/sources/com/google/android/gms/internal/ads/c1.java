package com.google.android.gms.internal.ads;

import java.util.List;

/* access modifiers changed from: package-private */
public final class c1 implements wc<List<o90>, k90> {
    private final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Integer f3942b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Integer f3943c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f3944d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ int f3945e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ int f3946f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ int f3947g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ boolean f3948h;

    c1(w0 w0Var, String str, Integer num, Integer num2, int i2, int i3, int i4, int i5, boolean z) {
        this.a = str;
        this.f3942b = num;
        this.f3943c = num2;
        this.f3944d = i2;
        this.f3945e = i3;
        this.f3946f = i4;
        this.f3947g = i5;
        this.f3948h = z;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.wc
    public final /* synthetic */ k90 a(List<o90> list) {
        List<o90> list2 = list;
        Integer num = null;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        String str = this.a;
        Integer num2 = this.f3942b;
        Integer num3 = this.f3943c;
        int i2 = this.f3944d;
        if (i2 > 0) {
            num = Integer.valueOf(i2);
        }
        return new k90(str, list2, num2, num3, num, this.f3945e + this.f3946f, this.f3947g, this.f3948h);
    }
}
