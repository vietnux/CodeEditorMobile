package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import e.b.b.a.b.b;

@k2
public final class v20 {
    jz a;

    /* renamed from: b  reason: collision with root package name */
    boolean f5803b;

    public v20() {
    }

    public v20(Context context) {
        k80.a(context);
        if (((Boolean) a50.g().a(k80.a3)).booleanValue()) {
            try {
                this.a = kz.a(DynamiteModule.a(context, DynamiteModule.f3739h, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
                b.a(context);
                this.a.b(b.a(context), "GMA_SDK");
                this.f5803b = true;
            } catch (RemoteException | DynamiteModule.a | NullPointerException unused) {
                qc.b("Cannot dynamite load clearcut");
            }
        }
    }

    public v20(Context context, String str, String str2) {
        k80.a(context);
        try {
            this.a = kz.a(DynamiteModule.a(context, DynamiteModule.f3739h, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
            b.a(context);
            this.a.a(b.a(context), str, null);
            this.f5803b = true;
        } catch (RemoteException | DynamiteModule.a | NullPointerException unused) {
            qc.b("Cannot dynamite load clearcut");
        }
    }

    public final x20 a(byte[] bArr) {
        return new x20(this, bArr);
    }
}
