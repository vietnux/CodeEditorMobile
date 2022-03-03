package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.x0;

@k2
public final class f8 implements q00 {

    /* renamed from: b  reason: collision with root package name */
    private final Context f4284b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f4285c;

    /* renamed from: d  reason: collision with root package name */
    private String f4286d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4287e;

    public f8(Context context, String str) {
        this.f4284b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f4286d = str;
        this.f4287e = false;
        this.f4285c = new Object();
    }

    @Override // com.google.android.gms.internal.ads.q00
    public final void a(p00 p00) {
        a(p00.a);
    }

    public final void a(boolean z) {
        if (x0.C().d(this.f4284b)) {
            synchronized (this.f4285c) {
                if (this.f4287e != z) {
                    this.f4287e = z;
                    if (!TextUtils.isEmpty(this.f4286d)) {
                        if (this.f4287e) {
                            x0.C().a(this.f4284b, this.f4286d);
                        } else {
                            x0.C().b(this.f4284b, this.f4286d);
                        }
                    }
                }
            }
        }
    }

    public final void b(String str) {
        this.f4286d = str;
    }
}
