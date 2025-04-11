package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.b8;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.p3;
import com.google.android.gms.internal.ads.u9;
import java.util.List;

@k2
public final class v1 {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3345b;

    /* renamed from: c  reason: collision with root package name */
    private b8 f3346c;

    /* renamed from: d  reason: collision with root package name */
    private p3 f3347d;

    public v1(Context context, b8 b8Var, p3 p3Var) {
        this.a = context;
        this.f3346c = b8Var;
        this.f3347d = p3Var;
        if (this.f3347d == null) {
            this.f3347d = new p3();
        }
    }

    private final boolean c() {
        b8 b8Var = this.f3346c;
        return (b8Var != null && b8Var.b().f6093g) || this.f3347d.f5210b;
    }

    public final void a() {
        this.f3345b = true;
    }

    public final void a(String str) {
        List<String> list;
        if (c()) {
            if (str == null) {
                str = "";
            }
            b8 b8Var = this.f3346c;
            if (b8Var != null) {
                b8Var.a(str, null, 3);
                return;
            }
            p3 p3Var = this.f3347d;
            if (p3Var.f5210b && (list = p3Var.f5211c) != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        x0.f();
                        u9.a(this.a, "", replace);
                    }
                }
            }
        }
    }

    public final boolean b() {
        return !c() || this.f3345b;
    }
}
