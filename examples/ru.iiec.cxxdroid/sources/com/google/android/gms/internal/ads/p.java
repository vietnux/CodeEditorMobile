package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import e.b.b.a.b.a;
import e.b.b.a.b.b;

@k2
public final class p {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f5200b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f5201c = false;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f5202d = false;
    private dj a;

    private final void c(Context context) {
        synchronized (f5200b) {
            if (((Boolean) a50.g().a(k80.f3)).booleanValue() && !f5202d) {
                try {
                    f5202d = true;
                    this.a = ej.a(DynamiteModule.a(context, DynamiteModule.f3739h, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.ads.omid.DynamiteOmid"));
                } catch (DynamiteModule.a e2) {
                    qc.d("#007 Could not call remote method.", e2);
                }
            }
        }
    }

    public final a a(String str, WebView webView, String str2, String str3, String str4) {
        synchronized (f5200b) {
            if (((Boolean) a50.g().a(k80.f3)).booleanValue()) {
                if (f5201c) {
                    try {
                        return this.a.a(str, b.a(webView), str2, str3, str4);
                    } catch (RemoteException | NullPointerException e2) {
                        qc.d("#007 Could not call remote method.", e2);
                        return null;
                    }
                }
            }
            return null;
        }
    }

    public final String a(Context context) {
        if (!((Boolean) a50.g().a(k80.f3)).booleanValue()) {
            return null;
        }
        try {
            c(context);
            String valueOf = String.valueOf(this.a.getVersion());
            return valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
        } catch (RemoteException | NullPointerException e2) {
            qc.d("#007 Could not call remote method.", e2);
            return null;
        }
    }

    public final void a(a aVar) {
        synchronized (f5200b) {
            if (((Boolean) a50.g().a(k80.f3)).booleanValue()) {
                if (f5201c) {
                    try {
                        this.a.s(aVar);
                    } catch (RemoteException | NullPointerException e2) {
                        qc.d("#007 Could not call remote method.", e2);
                    }
                }
            }
        }
    }

    public final void a(a aVar, View view) {
        synchronized (f5200b) {
            if (((Boolean) a50.g().a(k80.f3)).booleanValue()) {
                if (f5201c) {
                    try {
                        this.a.a(aVar, b.a(view));
                    } catch (RemoteException | NullPointerException e2) {
                        qc.d("#007 Could not call remote method.", e2);
                    }
                }
            }
        }
    }

    public final void b(a aVar) {
        synchronized (f5200b) {
            if (((Boolean) a50.g().a(k80.f3)).booleanValue()) {
                if (f5201c) {
                    try {
                        this.a.n(aVar);
                    } catch (RemoteException | NullPointerException e2) {
                        qc.d("#007 Could not call remote method.", e2);
                    }
                }
            }
        }
    }

    public final boolean b(Context context) {
        synchronized (f5200b) {
            if (!((Boolean) a50.g().a(k80.f3)).booleanValue()) {
                return false;
            }
            if (f5201c) {
                return true;
            }
            try {
                c(context);
                boolean r = this.a.r(b.a(context));
                f5201c = r;
                return r;
            } catch (RemoteException | NullPointerException e2) {
                qc.d("#007 Could not call remote method.", e2);
                return false;
            }
        }
    }
}
