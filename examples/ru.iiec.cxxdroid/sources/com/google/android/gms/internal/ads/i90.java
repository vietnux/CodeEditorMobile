package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import c.c.b.a;
import c.c.b.b;
import c.c.b.d;
import c.c.b.e;
import java.util.List;

@k2
public final class i90 implements yv {
    private e a;

    /* renamed from: b  reason: collision with root package name */
    private b f4600b;

    /* renamed from: c  reason: collision with root package name */
    private d f4601c;

    /* renamed from: d  reason: collision with root package name */
    private j90 f4602d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i2 = 0; i2 < queryIntentActivities.size(); i2++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i2).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(wv.a(context));
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.yv
    public final void a() {
        this.f4600b = null;
        this.a = null;
        j90 j90 = this.f4602d;
        if (j90 != null) {
            j90.b();
        }
    }

    public final void a(Activity activity) {
        d dVar = this.f4601c;
        if (dVar != null) {
            activity.unbindService(dVar);
            this.f4600b = null;
            this.a = null;
            this.f4601c = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.yv
    public final void a(b bVar) {
        this.f4600b = bVar;
        this.f4600b.a(0);
        j90 j90 = this.f4602d;
        if (j90 != null) {
            j90.a();
        }
    }

    public final void a(j90 j90) {
        this.f4602d = j90;
    }

    public final boolean a(Uri uri, Bundle bundle, List<Bundle> list) {
        b bVar = this.f4600b;
        if (bVar == null) {
            return false;
        }
        if (bVar == null) {
            this.a = null;
        } else if (this.a == null) {
            this.a = bVar.a((a) null);
        }
        e eVar = this.a;
        if (eVar == null) {
            return false;
        }
        return eVar.a(uri, null, null);
    }

    public final void b(Activity activity) {
        String a2;
        if (this.f4600b == null && (a2 = wv.a(activity)) != null) {
            this.f4601c = new xv(this);
            b.a(activity, a2, this.f4601c);
        }
    }
}
