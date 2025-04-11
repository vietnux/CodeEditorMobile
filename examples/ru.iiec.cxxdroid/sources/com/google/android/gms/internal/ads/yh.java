package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@k2
public final class yh extends MutableContextWrapper {
    private Activity a;

    /* renamed from: b  reason: collision with root package name */
    private Context f6131b;

    /* renamed from: c  reason: collision with root package name */
    private Context f6132c;

    public yh(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final Activity a() {
        return this.a;
    }

    public final Context b() {
        return this.f6132c;
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public final Object getSystemService(String str) {
        return this.f6132c.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        this.f6131b = context.getApplicationContext();
        this.a = context instanceof Activity ? (Activity) context : null;
        this.f6132c = context;
        super.setBaseContext(this.f6131b);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f6131b.startActivity(intent);
    }
}
