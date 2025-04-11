package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.ads.o.a;
import java.util.Map;

@k2
public final class g extends n {

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f4359c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f4360d;

    public g(lg lgVar, Map<String, String> map) {
        super(lgVar, "storePicture");
        this.f4359c = map;
        this.f4360d = lgVar.b0();
    }

    public final void a() {
        if (this.f4360d == null) {
            a("Activity context is not available");
            return;
        }
        x0.f();
        if (!u9.f(this.f4360d).c()) {
            a("Feature is not supported by the device.");
            return;
        }
        String str = this.f4359c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            a("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            a(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            x0.f();
            if (!u9.e(lastPathSegment)) {
                String valueOf2 = String.valueOf(lastPathSegment);
                a(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
                return;
            }
            Resources b2 = x0.j().b();
            x0.f();
            AlertDialog.Builder e2 = u9.e(this.f4360d);
            e2.setTitle(b2 != null ? b2.getString(a.s1) : "Save image");
            e2.setMessage(b2 != null ? b2.getString(a.s2) : "Allow Ad to store image in Picture gallery?");
            e2.setPositiveButton(b2 != null ? b2.getString(a.s3) : "Accept", new h(this, str, lastPathSegment));
            e2.setNegativeButton(b2 != null ? b2.getString(a.s4) : "Decline", new i(this));
            e2.create().show();
        }
    }
}
