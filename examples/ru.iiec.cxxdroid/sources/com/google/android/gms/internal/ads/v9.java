package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.util.List;

/* access modifiers changed from: package-private */
public final class v9 implements j90 {
    private final /* synthetic */ List a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ i90 f5829b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Context f5830c;

    v9(u9 u9Var, List list, i90 i90, Context context) {
        this.a = list;
        this.f5829b = i90;
        this.f5830c = context;
    }

    @Override // com.google.android.gms.internal.ads.j90
    public final void a() {
        for (String str : this.a) {
            String valueOf = String.valueOf(str);
            qc.c(valueOf.length() != 0 ? "Pinging url: ".concat(valueOf) : new String("Pinging url: "));
            this.f5829b.a(Uri.parse(str), null, null);
        }
        this.f5829b.a((Activity) this.f5830c);
    }

    @Override // com.google.android.gms.internal.ads.j90
    public final void b() {
    }
}
