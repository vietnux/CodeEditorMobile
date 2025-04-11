package com.google.android.gms.common;

import com.google.android.gms.common.i;
import com.google.android.gms.common.util.a;
import com.google.android.gms.common.util.k;

/* access modifiers changed from: package-private */
public final class b0 extends z {

    /* renamed from: e  reason: collision with root package name */
    private final String f3581e;

    /* renamed from: f  reason: collision with root package name */
    private final i.a f3582f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f3583g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f3584h;

    private b0(String str, i.a aVar, boolean z, boolean z2) {
        super(false, null, null);
        this.f3581e = str;
        this.f3582f = aVar;
        this.f3583g = z;
        this.f3584h = z2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.z
    public final String a() {
        String str = this.f3584h ? "debug cert rejected" : "not whitelisted";
        String str2 = this.f3581e;
        String a = k.a(a.a("SHA-1").digest(this.f3582f.M()));
        boolean z = this.f3583g;
        StringBuilder sb = new StringBuilder(str.length() + 44 + String.valueOf(str2).length() + String.valueOf(a).length());
        sb.append(str);
        sb.append(": pkg=");
        sb.append(str2);
        sb.append(", sha1=");
        sb.append(a);
        sb.append(", atk=");
        sb.append(z);
        sb.append(", ver=12451009.false");
        return sb.toString();
    }
}
