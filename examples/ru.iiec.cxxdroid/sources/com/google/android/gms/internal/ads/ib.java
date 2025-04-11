package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class ib implements ej0 {
    private final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ mb f4604b;

    ib(eb ebVar, String str, mb mbVar) {
        this.a = str;
        this.f4604b = mbVar;
    }

    @Override // com.google.android.gms.internal.ads.ej0
    public final void a(d3 d3Var) {
        String str = this.a;
        String exc = d3Var.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(exc).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(exc);
        qc.d(sb.toString());
        this.f4604b.a((Object) null);
    }
}
